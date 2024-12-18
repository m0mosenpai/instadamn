package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64362vv implements InterfaceC64322vr {
    public final UserSession A00;
    public final C64352vu A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC61772re A03;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewStateRestored(Bundle bundle) {
    }

    public C64362vv(UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC61772re interfaceC61772re, C1M1 c1m1) {
        this(userSession, new C64352vu(userSession, new C30U(userSession, c1m1), interfaceC60442pS, true), interfaceC60442pS, interfaceC61772re);
    }

    @Override // X.InterfaceC64322vr
    public final void Cij(C38321qM c38321qM, C38321qM c38321qM2, C38321qM c38321qM3, int i, int i2, int i3) {
        C30Y c30y = this.A01.A00;
        if (c30y != null) {
            boolean containsKey = c30y.A04.containsKey(C30Y.A02(c30y, c38321qM, c38321qM2));
            if (containsKey) {
                c30y.A08(c38321qM, c38321qM2, i2);
            }
            c30y.A07(c38321qM, c38321qM2, i2);
            c30y.A09(c38321qM, c38321qM3, i, i3);
            if (containsKey) {
                c30y.A0A(c38321qM, c38321qM3, i, i3);
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        this.A01.D8S(view);
    }

    @Override // X.InterfaceC64322vr
    public final void DNd(C38321qM c38321qM) {
        C30Y c30y;
        C75113Zb BRZ = this.A03.BRZ(c38321qM);
        BRZ.A0l(false);
        int i = BRZ.A03;
        C64352vu c64352vu = this.A01;
        c64352vu.A03(c38321qM, i);
        C38321qM A1e = c38321qM.A1e(i);
        if (c38321qM.A5M() && A1e != null && (c30y = c64352vu.A00) != null) {
            c30y.A08(c38321qM, A1e, i);
        }
    }

    @Override // X.InterfaceC64322vr
    public final void DNv(C38321qM c38321qM, int i) {
        int i2;
        C38321qM A1e;
        C30Y c30y;
        C64352vu c64352vu = this.A01;
        c64352vu.A01(C81493kJ.A01, c38321qM, i);
        C75113Zb BRZ = this.A03.BRZ(c38321qM);
        BRZ.A0l(true);
        if (c38321qM.A5M() && (A1e = c38321qM.A1e((i2 = BRZ.A03))) != null && (c30y = c64352vu.A00) != null) {
            c30y.A0A(c38321qM, A1e, i, i2);
        }
        C38321qM A1e2 = c38321qM.A1e(BRZ.A03);
        if (A1e2 == null) {
            A1e2 = c38321qM;
        }
        if (A1e2.A5n()) {
            AbstractC41647Ibf.A02(A1e2, this.A02, this.A00, C05F.A00);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC64322vr
    public final void DNy(View view, C38321qM c38321qM, double d) {
        C30Y c30y;
        if (!AbstractC41071vF.A0S(this.A00, c38321qM) && (c30y = this.A01.A00) != null) {
            String A01 = C30Y.A01(c30y, c38321qM);
            Map map = c30y.A06;
            C82413m5 c82413m5 = (C82413m5) map.get(A01);
            C82413m5 c82413m52 = c82413m5;
            if (c82413m5 == null) {
                Object obj = new Object();
                map.put(A01, obj);
                c82413m52 = obj;
            }
            c82413m52.A00(d);
        }
        C75113Zb BRZ = this.A03.BRZ(c38321qM);
        boolean z = false;
        if (d >= 0.99d) {
            z = true;
        }
        if (z != BRZ.A2G) {
            BRZ.A2G = z;
            C75113Zb.A00(BRZ, 3);
        }
    }

    @Override // X.InterfaceC64322vr
    public final void Dwc(C38321qM c38321qM) {
        C38321qM A1e;
        C30Y c30y;
        InterfaceC61772re interfaceC61772re = this.A03;
        C75113Zb BRZ = interfaceC61772re.BRZ(c38321qM);
        int i = BRZ.A03;
        C64352vu c64352vu = this.A01;
        c64352vu.A02(c38321qM, i);
        if (c38321qM.A5M() && (A1e = c38321qM.A1e(i)) != null && (c30y = c64352vu.A00) != null) {
            c30y.A07(c38321qM, A1e, i);
        }
        BRZ.A31 = false;
        UserSession userSession = this.A00;
        if (AbstractC81213jq.A00(c38321qM, BRZ.A02) || C76473br.A00(userSession, c38321qM)) {
            C14360o3.A0B(userSession, 0);
            if (!C18U.A06(C06090Tz.A05, userSession, 36325605029065927L)) {
                C75113Zb BRZ2 = interfaceC61772re.BRZ(c38321qM);
                C14360o3.A0B(BRZ2, 2);
                if (BRZ2.A1i) {
                    BRZ2.A1i = false;
                    C75113Zb.A00(BRZ2, 76);
                }
                if (AbstractC75103Za.A0Q(c38321qM, BRZ2.A03)) {
                    AbstractC123605iZ.A00(userSession).A01(BRZ2);
                }
                C75113Zb BRZ3 = interfaceC61772re.BRZ(c38321qM);
                C14360o3.A0B(BRZ3, 1);
                BRZ3.A0m(false, true);
                BRZ3.A2O = false;
                BRZ3.A1K = null;
                if (AbstractC75103Za.A0Q(c38321qM, BRZ3.A03)) {
                    AbstractC115715Lh.A00().A00(BRZ3);
                }
            }
            if (!AbstractC689738j.A00(userSession).A03(c38321qM, interfaceC61772re.BRZ(c38321qM))) {
                C75113Zb BRZ4 = interfaceC61772re.BRZ(c38321qM);
                C14360o3.A0B(BRZ4, 2);
                BRZ4.A0e(false);
                if (BRZ4.A1k) {
                    BRZ4.A1k = false;
                }
                BRZ4.A1K = null;
                if (AbstractC75103Za.A0Q(c38321qM, BRZ4.A03)) {
                    AbstractC124495k7.A00(userSession).A00(BRZ4);
                }
            }
            AbstractC115755Ll.A00().A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f4, code lost:
    
        if (r1 > (X.C97694a4.A00(r9).A04(r7, 0) + com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS)) goto L38;
     */
    @Override // X.InterfaceC64322vr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dwd(X.C11520jB r15, X.C38321qM r16, int r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64362vv.Dwd(X.0jB, X.1qM, int, int, int):void");
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.A01.onActivityResult(i, i2, intent);
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
        this.A01.onCreate();
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        this.A01.onDestroy();
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A01.onDestroyView();
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        userSession.A01(C54C.class, C54B.A00);
        this.A01.onPause();
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        this.A01.onResume();
    }

    @Override // X.InterfaceC60602pj
    public final void onSaveInstanceState(Bundle bundle) {
        this.A01.onSaveInstanceState(bundle);
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
        this.A01.onStart();
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
        this.A01.onStop();
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        this.A01.onViewCreated(view, bundle);
    }

    public C64362vv(UserSession userSession, C64352vu c64352vu, InterfaceC60442pS interfaceC60442pS, InterfaceC61772re interfaceC61772re) {
        this.A02 = interfaceC60442pS;
        this.A00 = userSession;
        this.A03 = interfaceC61772re;
        this.A01 = c64352vu;
    }
}
