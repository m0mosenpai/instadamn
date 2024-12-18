package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

/* loaded from: classes9.dex */
public final class OL7 {
    public final Activity A00;
    public final View A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final AbstractC50810Mcb A04;
    public final OJY A05;
    public final C52458NJc A06;
    public final InterfaceC173987oq A07;
    public final C200018t5 A08;
    public final C173937ol A09;

    public OL7(Activity activity, View view, AbstractC59962oe abstractC59962oe, UserSession userSession, AbstractC50810Mcb abstractC50810Mcb, OJY ojy, C52458NJc c52458NJc, InterfaceC173987oq interfaceC173987oq, C200018t5 c200018t5) {
        String str;
        EnumC53307Nhj enumC53307Nhj;
        String str2;
        String str3;
        AbstractC25229BEm.A1I(userSession, 4, c200018t5);
        this.A00 = activity;
        this.A01 = view;
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A04 = abstractC50810Mcb;
        this.A08 = c200018t5;
        this.A07 = interfaceC173987oq;
        this.A06 = c52458NJc;
        this.A05 = ojy;
        C173937ol A00 = AbstractC173927ok.A00(userSession);
        this.A09 = A00;
        ojy.A00();
        C50701MZw c50701MZw = C50701MZw.A00;
        EnumC53307Nhj enumC53307Nhj2 = null;
        if (interfaceC173987oq != null) {
            str = interfaceC173987oq.getUsername();
            enumC53307Nhj = interfaceC173987oq.AY3();
        } else {
            str = null;
            enumC53307Nhj = null;
        }
        c50701MZw.A04(activity, enumC53307Nhj, str);
        AbstractC50810Mcb abstractC50810Mcb2 = this.A04;
        abstractC50810Mcb2.setListener(new P3T(this, 3));
        ViewOnClickListenerC55462OkH.A01(abstractC50810Mcb2, 7, this);
        if (this.A05.A04) {
            this.A01.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserverOnScrollChangedListenerC55505Oky(this, 0));
        }
        A01(AbstractC166997dE.A1Z(ojy.A00, true));
        boolean z = !AbstractC31172DnG.A1a(A00.A00, "PREFERENCE_SHARE_TO_BARCELONA_TOGGLE_SHOWN");
        if (interfaceC173987oq != null) {
            str2 = interfaceC173987oq.getProfilePicUrl();
        } else {
            str2 = null;
        }
        SimpleImageUrl A0t = AbstractC25225BEi.A0t(str2);
        if (interfaceC173987oq != null) {
            str3 = interfaceC173987oq.getUsername();
            enumC53307Nhj2 = interfaceC173987oq.AY3();
        } else {
            str3 = null;
        }
        abstractC50810Mcb.A00(abstractC59962oe, A0t, str3, C50701MZw.A03(activity, enumC53307Nhj2), z);
        A00();
    }

    public final void A00() {
        OJY ojy = this.A05;
        OV5 ov5 = OV5.A00;
        UserSession userSession = this.A03;
        C52458NJc c52458NJc = this.A06;
        Integer A00 = ov5.A00(userSession, c52458NJc.A04(), ojy.A02, ojy.A03, AbstractC167007dF.A1W(c52458NJc.A02().A08));
        C14360o3.A0B(A00, 0);
        ojy.A01 = A00;
        boolean A1X = AbstractC167007dF.A1X(A00, C05F.A00);
        this.A04.setEnabledState(A1X);
        if (!A1X) {
            AbstractC53935Nt8.A00(ojy, this.A07, c52458NJc.A04(), false);
        } else {
            if (!AbstractC166997dE.A1Z(ojy.A00, true)) {
                return;
            }
            A01(true);
        }
    }

    public final void A01(boolean z) {
        boolean z2;
        AbstractC50810Mcb abstractC50810Mcb = this.A04;
        boolean z3 = abstractC50810Mcb instanceof C52451NIv;
        if (z3) {
            z2 = ((C52451NIv) abstractC50810Mcb).A03.isChecked();
        } else {
            z2 = false;
        }
        if (!AbstractC166997dE.A1Z(Boolean.valueOf(z2), z)) {
            if (z3) {
                ((C52451NIv) abstractC50810Mcb).A03.A00();
            }
            C47Z A04 = this.A06.A04();
            AbstractC53935Nt8.A00(this.A05, this.A07, A04, z);
        }
    }
}
