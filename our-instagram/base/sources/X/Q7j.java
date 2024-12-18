package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes10.dex */
public final class Q7j extends C0SG {
    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ProgressDialog progressDialog = new ProgressDialog(activity);
            progressDialog.setTitle("Rage Shake");
            progressDialog.setMessage("Preparing debug information...");
            progressDialog.setIndeterminate(true);
            return progressDialog;
        }
        throw AbstractC58318PtA.A0Z();
    }
}
