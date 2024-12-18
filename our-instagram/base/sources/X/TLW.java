package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes10.dex */
public final class TLW implements Runnable {
    public final /* synthetic */ Rb5 A00;

    public TLW(Rb5 rb5) {
        this.A00 = rb5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Rb5 rb5 = this.A00;
        SpinnerImageView spinnerImageView = rb5.A03;
        if (spinnerImageView == null) {
            str = "loadingSpinner";
        } else {
            spinnerImageView.setVisibility(8);
            FragmentActivity requireActivity = rb5.requireActivity();
            Intent intent = rb5.A00;
            if (intent == null) {
                str = "resultIntent";
            } else {
                requireActivity.setResult(-1, intent);
                AbstractC25226BEj.A1Q(rb5);
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("SUCCEEDED_SAVE");
                C62708SMw c62708SMw = rb5.A02;
                if (c62708SMw == null) {
                    str = "holder";
                } else {
                    Rb5.A02(rb5, AbstractC166997dE.A0v(c62708SMw.A00(), A1C));
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
