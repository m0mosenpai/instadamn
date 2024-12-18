package X;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class LQ4 implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LQ4(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.A00) {
            case 0:
                Fragment fragment = (Fragment) this.A02;
                Context context = fragment.getContext();
                int i = R.attr.igds_color_separator;
                if (z) {
                    i = R.attr.igds_color_controls;
                }
                int A0H = AbstractC53242c7.A0H(context, i);
                AbstractC31172DnG.A1B(fragment.requireContext(), (View) this.A01, A0H);
                if (z) {
                    return;
                }
                AbstractC13880nE.A0O(view);
                return;
            case 1:
                if (z) {
                    return;
                }
                C41232IMx c41232IMx = (C41232IMx) this.A02;
                C38497GwI c38497GwI = (C38497GwI) this.A01;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c41232IMx.A00 = AbstractC167007dF.A0g((EditText) c38497GwI.A04.A01());
                return;
            default:
                if (z) {
                    ((C3DN) this.A01).A0U(C05F.A04);
                    return;
                } else {
                    C45488KCd.A00((C45488KCd) this.A02);
                    return;
                }
        }
    }
}
