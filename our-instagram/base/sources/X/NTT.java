package X;

import android.app.Activity;
import android.view.View;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NTT extends AbstractC55206OeJ {
    public EnumC1824387i A00;
    public EnumC1824287h A01;
    public C51887MwV A02;
    public final Activity A03;
    public final View A04;
    public final C142246bh A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final C55177Odh A08;
    public final OHG A09;
    public final OJ2 A0A;
    public final PCU A0B;
    public final InterfaceC09390do A0C;
    public final C19L A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NTT(Activity activity, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C55177Odh c55177Odh, OJ2 oj2) {
        super(AbstractC25225BEi.A1D(C51887MwV.class));
        OHG ohg = new OHG(userSession);
        AbstractC167017dG.A1T(c55177Odh, oj2);
        this.A04 = view;
        this.A03 = activity;
        this.A07 = userSession;
        this.A06 = interfaceC11380iw;
        this.A08 = c55177Odh;
        this.A0A = oj2;
        this.A09 = ohg;
        this.A0B = new PCU(activity, view, userSession, oj2);
        C16930sl c16930sl = C16930sl.A00;
        Integer num = C05F.A00;
        this.A02 = new C51887MwV(null, null, null, null, null, EnumC53279NhH.A04, num, num, num, 0, null, "simple_gradient_background_0", null, c16930sl, c16930sl, c16930sl, c16930sl, c16930sl, 0.0f, false, false, false, false, false, false, false, false, false, false, false, false, false);
        this.A0C = AbstractC09440dt.A01(new C57520Pfu(this, 21));
        C19K A02 = AnonymousClass194.A02(C12L.A00.AOT(88, 3).plus(new AnonymousClass197(null)));
        this.A0D = A02;
        this.A05 = AbstractC149796oY.A00(AbstractC166987dD.A0O(activity), userSession);
        this.A01 = EnumC1824287h.A02;
        this.A00 = EnumC1824387i.A02;
        A0J(new C51902Mwk(null, 0.0f, false, false));
        this.A0B.A01 = new O52(this);
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new PZI(this, null, 49), A02);
    }

    public static C87T A00(NTT ntt) {
        return ((C8ZD) ntt.A0B.A0B.getValue()).A02;
    }

    public static final void A01(CameraAREffect cameraAREffect, NTT ntt) {
        InterfaceC57854PlK pf1;
        if (cameraAREffect != null) {
            C88X A00 = AbstractC173787oW.A00(cameraAREffect);
            C14360o3.A07(A00);
            pf1 = new C56705PEx(A00, null, true);
        } else {
            pf1 = new PF1(true, false, false);
        }
        ntt.A08.A03(pf1);
    }
}
