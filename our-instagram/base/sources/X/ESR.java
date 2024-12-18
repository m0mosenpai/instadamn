package X;

import android.R;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* loaded from: classes6.dex */
public final class ESR extends C1P1 {
    public final /* synthetic */ ELU A00;

    public ESR(ELU elu) {
        this.A00 = elu;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        int A03 = C0f9.A03(1983909327);
        ED7 ed7 = (ED7) obj;
        int A032 = C0f9.A03(1892449418);
        C14360o3.A0B(ed7, 0);
        ELU elu = this.A00;
        FDA.A00(AbstractC166987dD.A0o(elu.A06), EnumC31713DwI.A0f, null, null);
        String str = ed7.A03;
        if (str != null && str.length() != 0) {
            TextView textView = elu.A00;
            if (textView != null) {
                textView.setVisibility(0);
            }
            int integer = AbstractC166997dE.A0N(elu).getInteger(R.integer.config_mediumAnimTime);
            TextView textView2 = elu.A00;
            if (textView2 != null) {
                textView2.setAlpha(0.0f);
            }
            TextView textView3 = elu.A00;
            if (textView3 != null) {
                textView3.setText(ed7.A03);
            }
            TextView textView4 = elu.A00;
            if (textView4 != null && (animate = textView4.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(integer)) != null) {
                duration.start();
            }
        }
        C0f9.A0A(1422744, A032);
        C0f9.A0A(751671816, A03);
    }
}
