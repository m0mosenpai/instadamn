package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* loaded from: classes9.dex */
public final class MVE extends AbstractC1337162c {
    public final Activity A00;
    public final JPb A01;
    public final UserSession A02;
    public final C25348BJr A03;

    @Override // X.AbstractC1337262d
    public final boolean A02() {
        return false;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.immersive_catch_up_summary_item_layout, viewGroup, false);
        Drawable background = inflate.getBackground();
        C14360o3.A0C(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        AnimationDrawable animationDrawable = (AnimationDrawable) background;
        animationDrawable.setEnterFadeDuration(10);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();
        return new C53083Ndw(inflate);
    }

    public static final void A00(Context context, EnumC53161NfG enumC53161NfG, MVE mve) {
        int i;
        C52106N4e c52106N4e = new C52106N4e();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable("immersive_catch_up_filtered_content_type", enumC53161NfG);
        c52106N4e.setArguments(A0b);
        C189448aO A0y = AbstractC25225BEi.A0y(mve.A02);
        A0y.A03 = 0.9f;
        AbstractC25225BEi.A1Q(A0y, true);
        int ordinal = enumC53161NfG.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    i = 2131964319;
                    if (ordinal != 3) {
                        i = 2131964320;
                    }
                } else {
                    i = 2131964322;
                }
            } else {
                i = 2131964321;
            }
        } else {
            i = 2131964318;
        }
        A0y.A0d = AbstractC166997dE.A0p(context, i);
        A0y.A00().A02(mve.A00, c52106N4e);
    }

    @Override // X.AbstractC1337162c
    public final /* bridge */ /* synthetic */ void A03(C3OO c3oo, C62a c62a) {
        C53083Ndw c53083Ndw = (C53083Ndw) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c62a, c53083Ndw);
        Context A05 = AbstractC31172DnG.A05(c53083Ndw);
        IgdsMediaButton igdsMediaButton = c53083Ndw.A00;
        C0fQ.A00(new ViewOnClickListenerC55384Oiu(A1a ? 1 : 0, A05, this), igdsMediaButton);
        AbstractC50523MSb.A0h(A05, igdsMediaButton, 5, 2131964324);
        IgdsMediaButton igdsMediaButton2 = c53083Ndw.A01;
        C0fQ.A00(new ViewOnClickListenerC55384Oiu(2, A05, this), igdsMediaButton2);
        AbstractC50523MSb.A0h(A05, igdsMediaButton2, 6, 2131964326);
        IgdsMediaButton igdsMediaButton3 = c53083Ndw.A03;
        C0fQ.A00(new ViewOnClickListenerC55384Oiu(3, A05, this), igdsMediaButton3);
        AbstractC50523MSb.A0h(A05, igdsMediaButton3, 7, 2131964328);
        IgdsMediaButton igdsMediaButton4 = c53083Ndw.A02;
        C0fQ.A00(new ViewOnClickListenerC55384Oiu(4, A05, this), igdsMediaButton4);
        AbstractC50523MSb.A0h(A05, igdsMediaButton4, 8, 2131964327);
        AbstractC50523MSb.A0h(A05, c53083Ndw.A04, 9, 2131964325);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C50.class;
    }

    public MVE(Activity activity, JPb jPb, UserSession userSession, C25348BJr c25348BJr) {
        super(jPb, c25348BJr);
        this.A03 = c25348BJr;
        this.A01 = jPb;
        this.A02 = userSession;
        this.A00 = activity;
    }
}
