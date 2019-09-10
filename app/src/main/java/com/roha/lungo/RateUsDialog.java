package com.roha.lungo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

/**
 * Created by Henok G on 19-Aug-16.
 */
public class RateUsDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class because this dialog has a simple UI
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(R.layout.rate_us_dialog).setMessage("Rate us five star on the Play Store?")
            .setPositiveButton("Rate Now", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

            }
        }).setNegativeButton("Later", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

            }
        });
        return builder.create();
    }
}