package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.KJp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45678KJp extends AbstractC66422zJ {
    public final Context A00;
    public final C43888Jav A01;
    public final C161367Kx A02;
    public final UserSession A03;
    public final C161247Kj A04;
    public final String A05;
    public final InterfaceC09390do A06;

    public /* synthetic */ C45678KJp(Context context, C43888Jav c43888Jav, UserSession userSession, boolean z) {
        C161247Kj c161247Kj = new C161247Kj(userSession, new D86(z, 3));
        C161367Kx c161367Kx = new C161367Kx(null, new C161207Kf(context, userSession, new D86(z, 4)), LW3.A00, null, LW4.A00, MJ3.A00);
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = c43888Jav;
        this.A04 = c161247Kj;
        this.A02 = c161367Kx;
        this.A05 = AbstractC167017dG.A0j();
        this.A06 = C1XM.A00(MHS.A00(this, 35));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View A07 = AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.avatar_powerup_composer, false);
        View A0E = AbstractC31173DnH.A0E(AbstractC167007dF.A0M(A07, R.id.direct_text_message_text_view_stub), R.layout.direct_text_message_text_view);
        C14360o3.A0C(A0E, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) A0E;
        textView.setMaxWidth(C7N9.A00(this.A00, false));
        ViewGroup viewGroup2 = (ViewGroup) AbstractC166997dE.A0S(A07, R.id.powerups_background_decoration);
        ViewGroup viewGroup3 = (ViewGroup) AbstractC166997dE.A0S(A07, R.id.powerups_foreground_decoration);
        IgImageView igImageView = (IgImageView) AbstractC166997dE.A0S(A07, R.id.avatar_image);
        C44426JkP c44426JkP = new C44426JkP(AbstractC166997dE.A0L(viewGroup));
        c44426JkP.addView(A07);
        return new C44779Js0(c44426JkP, viewGroup2, viewGroup3, textView, igImageView);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r33, X.C3OO r34) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45678KJp.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZZ.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C44779Js0 c44779Js0 = (C44779Js0) c3oo;
        C14360o3.A0B(c44779Js0, 0);
        ViewGroup viewGroup = c44779Js0.A01;
        if (viewGroup.getTag() != null) {
            this.A02.A01(viewGroup.getTag().toString());
        }
    }
}
