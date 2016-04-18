package com.p_brane.greenhouse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean nf = false;
    CheckBox nfbox;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Open the first page -- intro from back
     * button on page 2
     *
     * @param view info passed by onclick
     */
    public void openPage1(View view) {
        setContentView(R.layout.activity_main);
        nf = false;
    }

    /**
     * Open second page -- heating and cooling
     *
     * @param view info passed by onclick
     */
    public void openPage2(View view) {
        setContentView(R.layout.s2_heating_cooling);
        if (nf) {
            displayNotes(view, R.id.s2Notes, R.string.t2NotesText);
            displayRefs(view, R.id.s2Refs, R.string.t2ReferencesText);
        } else {
            displayNotes(view, R.id.s2Notes, R.string.blankText);
            displayRefs(view, R.id.s2Refs, R.string.blankText);
        }
    }

    /**
     * Open third page -- hot water
     *
     * @param view info passed by onclick
     */
    public void openPage3(View view) {
        setContentView(R.layout.s3_hotwater);
        if (nf) {
            displayNotes(view, R.id.s3Notes, R.string.t3NotesText);
            displayRefs(view, R.id.s3Refs, R.string.t3ReferencesText);
        } else {
            displayNotes(view, R.id.s3Notes, R.string.blankText);
            displayRefs(view, R.id.s3Refs, R.string.blankText);
        }
    }

    /**
     * Open fourth page -- appliances
     *
     * @param view info passed by onclick
     */
    public void openPage4(View view) {
        setContentView(R.layout.s4_appliances);
        if (nf) {
            displayNotes(view, R.id.s4Notes, R.string.t4NotesText);
            displayRefs(view, R.id.s4Refs, R.string.t4ReferencesText);
        } else {
            displayNotes(view, R.id.s4Notes, R.string.blankText);
            displayRefs(view, R.id.s4Refs, R.string.blankText);
        }
    }

    /**
     * Open fifth page -- insulation
     *
     * @param view info passed by onclick
     */
    public void openPage5(View view) {
        setContentView(R.layout.s5_insulation);
        if (nf) {
            displayNotes(view, R.id.s5Notes, R.string.t5NotesText);
            displayRefs(view, R.id.s5Refs, R.string.t5ReferencesText);
        } else {
            displayNotes(view, R.id.s5Notes, R.string.blankText);
            displayRefs(view, R.id.s5Refs, R.string.blankText);
        }
    }

    /**
     * Open sixth page -- electricity sources
     *
     * @param view info passed by onclick
     */
    public void openPage6(View view) {
        setContentView(R.layout.s6_energy_sources);
        if (nf) {
            displayNotes(view, R.id.s6Notes, R.string.t6NotesText);
            displayRefs(view, R.id.s6Refs, R.string.t6ReferencesText);
        } else {
            displayNotes(view, R.id.s6Notes, R.string.blankText);
            displayRefs(view, R.id.s6Refs, R.string.blankText);
        }
    }

    /**
     * Open seventh page -- summary
     *
     * @param view info passed by onclick
     */
    public void openPage7(View view) {
        setContentView(R.layout.s7_summary);
        if (nf) {
            displayNotes(view, R.id.s7Notes, R.string.t7NotesText);
            displayRefs(view, R.id.s7Refs, R.string.t7ReferencesText);
        } else {
            displayNotes(view, R.id.s7Notes, R.string.blankText);
            displayRefs(view, R.id.s7Refs, R.string.blankText);
        }
    }

    /**
     * Detemine if the checkbox is clicked so it can be
     * used on the other pages.
     */
    public boolean notesClicked(View view) {
        nfbox = (CheckBox) view.findViewById(R.id.noteRefCheckBoxView);
        nf = nfbox.isChecked();
        Log.v("notesClicked", "Has notes: " + nf);
        return nf;
    }

    /**
     * Display the note content at the location specified
     *
     * @param noteLocation points to the page where the note is to be displayed
     * @param noteContent  points to the note content to display
     */
    public void displayNotes(View view, int noteLocation, int noteContent) {
        TextView displayNotesView = (TextView) findViewById(noteLocation);
        displayNotesView.setText(Html.fromHtml(getString(noteContent)));
        displayNotesView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /**
     * Display the note content at the location specified
     *
     * @param refLocation points to the page where the reference is to be displayed
     * @param refContent  points to the reference content to display
     */
    public void displayRefs(View view, int refLocation, int refContent) {
        TextView displayRefsView = (TextView) findViewById(refLocation);
        displayRefsView.setText(Html.fromHtml(getString(refContent)));
        displayRefsView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}