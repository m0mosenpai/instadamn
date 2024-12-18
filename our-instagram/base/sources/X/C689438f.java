package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.common.session.UserSession;

/* renamed from: X.38f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C689438f {
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new C206839Do(this, 7));
    public final InterfaceC60442pS A02;
    public final C81063jb A03;
    public final InterfaceC61432r6 A04;
    public final C1M1 A05;

    public final void A00(MotionEvent motionEvent, View view, Fragment fragment, C38321qM c38321qM, C75113Zb c75113Zb, C2Fb c2Fb, String str) {
        IGAdsIABScreenshotDataDict BFN;
        Context context;
        C38321qM A1e;
        String str2;
        String id;
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        InterfaceC09390do interfaceC09390do = this.A01;
        C92494Cg c92494Cg = (C92494Cg) interfaceC09390do.getValue();
        c92494Cg.A01(B7D.A00);
        C006802i c006802i = c92494Cg.A00;
        if (c006802i != null) {
            c006802i.markerPoint(1056313521, AbstractC111324zv.A00(2821));
        }
        C81063jb c81063jb = this.A03;
        if (c81063jb != null && c81063jb.A08(c38321qM, false) && (id = c38321qM.getId()) != null) {
            C81063jb.A01(c81063jb, id, true);
        }
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        C18U.A06(c06090Tz, userSession, 36319789643275957L);
        C5SE c5se = new C5SE(userSession, c38321qM, c75113Zb.A06());
        String str3 = null;
        if (c75113Zb.A3e && (A1e = c38321qM.A1e(c75113Zb.A03)) != null && A1e.A5a()) {
            C38321qM A1e2 = c38321qM.A1e(c75113Zb.A03);
            if (A1e2 != null) {
                str2 = A1e2.A3F(c75113Zb.A19);
            } else {
                str2 = null;
            }
            c5se.A05 = str2;
        }
        InterfaceC60442pS interfaceC60442pS = this.A02;
        c5se.A04 = c75113Zb.A1K;
        C37952Gmu c37952Gmu = new C37952Gmu(fragment, userSession, c5se, interfaceC60442pS, c2Fb);
        c37952Gmu.A0J = c38321qM;
        c37952Gmu.A09 = c75113Zb.A03;
        c37952Gmu.A0B = c75113Zb.getPosition();
        c37952Gmu.A0K = c75113Zb;
        C1M1 c1m1 = this.A05;
        if (c1m1 != null) {
            str3 = c1m1.getSessionId();
        }
        c37952Gmu.A0i = str3;
        c37952Gmu.A0f = str;
        if (motionEvent != null && (context = fragment.getContext()) != null) {
            c37952Gmu.A06 = AbstractC13880nE.A01(context, motionEvent.getX());
            c37952Gmu.A07 = AbstractC13880nE.A01(context, motionEvent.getY());
        }
        C37905Gm2 c37905Gm2 = c75113Zb.A0k;
        if (c37905Gm2 != null) {
            Float f = c37905Gm2.A01;
            if (f != null) {
                c37952Gmu.A06 = f.floatValue();
            }
            Float f2 = c37905Gm2.A02;
            if (f2 != null) {
                c37952Gmu.A07 = f2.floatValue();
            }
            Float f3 = c37905Gm2.A03;
            if (f3 != null) {
                c37952Gmu.A01 = f3.floatValue();
            }
            Float f4 = c37905Gm2.A00;
            if (f4 != null) {
                c37952Gmu.A00 = f4.floatValue();
            }
        }
        C86263sx c86263sx = c75113Zb.A0j;
        if (c86263sx != null) {
            int i = c86263sx.A01;
            Context context2 = fragment.getContext();
            if (context2 != null) {
                c37952Gmu.A05 = AbstractC13880nE.A01(context2, i);
            }
        }
        C86263sx c86263sx2 = c75113Zb.A0j;
        if (c86263sx2 != null) {
            int i2 = c86263sx2.A00;
            Context context3 = fragment.getContext();
            if (context3 != null) {
                c37952Gmu.A04 = AbstractC13880nE.A01(context3, i2);
            }
        }
        c37952Gmu.A0l = AbstractC75103Za.A0F(userSession, c38321qM, c75113Zb);
        c37952Gmu.A0d = AbstractC75103Za.A09(c38321qM, c75113Zb);
        c37952Gmu.A0c = AbstractC75103Za.A0A(c75113Zb);
        if (C87153uY.A0A(userSession, c38321qM)) {
            c37952Gmu.A0X = c38321qM.A0I;
        }
        if (c38321qM.A5Q()) {
            int[] iArr = new int[2];
            if (view != null) {
                view.getLocationInWindow(iArr);
            }
            c37952Gmu.A0x = iArr;
            c37952Gmu.A0A = c75113Zb.A01();
        }
        InterfaceC61432r6 interfaceC61432r6 = this.A04;
        if (interfaceC61432r6 != null) {
            interfaceC61432r6.DVi(C6T5.A00(), AnonymousClass317.A08, c38321qM, c75113Zb);
        }
        InterfaceC104784ni A1G = c38321qM.A1G();
        if (A1G != null && A1G.BHK() != null) {
            c37952Gmu.A0F = c38321qM.A1G();
        }
        C46p Atz = c38321qM.A0C.Atz();
        if (Atz != null && C14360o3.A0K(Atz.BvZ(), true) && C18U.A06(c06090Tz, userSession, 36321567759672946L)) {
            ((C92494Cg) interfaceC09390do.getValue()).A01(B89.A00);
            FragmentActivity requireActivity = fragment.requireActivity();
            C38915HBm c38915HBm = new C38915HBm();
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A0g = requireActivity.getString(2131963747);
            c189448aO.A0K = AbstractC37693GiU.A00(new ViewOnClickListenerC41963Iiu(c38915HBm, userSession, c38321qM, c75113Zb), EnumC71343Hv.A0H, userSession, Integer.valueOf(c75113Zb.A03));
            c189448aO.A1J = true;
            c189448aO.A0v = true;
            c189448aO.A00().A02(requireActivity, c38915HBm);
            return;
        }
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null && (BFN = injected.BFN()) != null && C18U.A06(c06090Tz, userSession, 36323676588617194L)) {
            c37952Gmu.A0G = BFN;
        }
        C92494Cg c92494Cg2 = (C92494Cg) interfaceC09390do.getValue();
        c92494Cg2.A01(B7F.A00);
        C006802i c006802i2 = c92494Cg2.A00;
        if (c006802i2 != null) {
            c006802i2.markerPoint(1056313521, AbstractC111324zv.A00(2835));
        }
        new C37953Gmv(c37952Gmu).A04();
    }

    public C689438f(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C81063jb c81063jb, InterfaceC61432r6 interfaceC61432r6, C1M1 c1m1) {
        this.A00 = userSession;
        this.A02 = interfaceC60442pS;
        this.A05 = c1m1;
        this.A04 = interfaceC61432r6;
        this.A03 = c81063jb;
    }
}
