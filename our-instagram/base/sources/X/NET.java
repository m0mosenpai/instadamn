package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NET extends AbstractC66412zI {
    public final Activity A00;
    public final UserSession A01;

    public NET(Activity activity, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = activity;
        this.A01 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51315Mlc(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.metadata_sharing_arrow_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56111OvW c56111OvW = (C56111OvW) interfaceC66482zP;
        C51315Mlc c51315Mlc = (C51315Mlc) c3oo;
        int i = 0;
        boolean A1R = AbstractC167007dF.A1R(0, c56111OvW, c51315Mlc);
        c51315Mlc.A03.setText(c56111OvW.A04);
        TextView textView = c51315Mlc.A02;
        textView.setText(c56111OvW.A03);
        TextView textView2 = c51315Mlc.A01;
        CharSequence charSequence = c56111OvW.A02;
        textView2.setText(charSequence);
        if (charSequence == null) {
            i = 8;
        }
        textView2.setVisibility(i);
        int width = textView.getWidth();
        C46552Bt A00 = AbstractC46542Bs.A00(this.A01);
        if (width > 0 && c56111OvW.A05) {
            InterfaceC19630xq interfaceC19630xq = A00.A04;
            if (!AbstractC31172DnG.A1a(interfaceC19630xq, "PREFERENCE_IG_TO_FB_WASLIVE_HAS_SHOWN_CROSS_POST_TO_FACEBOOK")) {
                AbstractC31177DnL.A1N(interfaceC19630xq, "PREFERENCE_IG_TO_FB_WASLIVE_HAS_SHOWN_CROSS_POST_TO_FACEBOOK", A1R);
                int i2 = c56111OvW.A00;
                Activity activity = this.A00;
                C5SU A0f = AbstractC167017dG.A0f(activity, activity.getString(2131977009));
                A0f.A04(textView, (width - i2) / 2, -i2, A1R);
                A0f.A02();
                A0f.A0F = A1R;
                textView.post(new RunnableC56997PQn(A0f.A00(), this));
            }
        }
        C0fQ.A00(c56111OvW.A01, c51315Mlc.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56111OvW.class;
    }
}
