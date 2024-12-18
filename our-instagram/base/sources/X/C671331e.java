package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.31e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C671331e extends AbstractC671431f {
    public C671831j A00;
    public final UserSession A01;
    public final C114725Gc A02;
    public final C65192xH A03;
    public final InterfaceC670931a A04;
    public final InterfaceC62242sP A05;
    public final InterfaceC671231d A06;
    public final Map A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C671331e(com.instagram.common.session.UserSession r18, X.C114725Gc r19, X.C65192xH r20, X.InterfaceC670931a r21, X.InterfaceC62242sP r22, X.InterfaceC671231d r23, X.C1PY r24) {
        /*
            r17 = this;
            r0 = 2
            r6 = r22
            X.C14360o3.A0B(r6, r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36313944192715082(0x8103570000094a, double:3.02842275976493E-306)
            r3 = r18
            boolean r8 = X.C18U.A06(r2, r3, r0)
            r0 = 36313944192977230(0x8103570004094e, double:3.0284227599307136E-306)
            boolean r9 = X.C18U.A06(r2, r3, r0)
            r0 = 36315593460223411(0x8104d700010db3, double:3.0294657631782646E-306)
            boolean r10 = X.C18U.A06(r2, r3, r0)
            X.0Tz r4 = X.C06090Tz.A06
            r0 = 36316091676889046(0x81054b00080fd6, double:3.0297808374037697E-306)
            boolean r12 = X.C18U.A06(r4, r3, r0)
            r11 = 0
            r5 = r17
            r7 = r24
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5.A05 = r6
            r4 = r20
            r5.A03 = r4
            r5.A01 = r3
            r0 = r21
            r5.A04 = r0
            r0 = r23
            r5.A06 = r0
            r0 = r19
            r5.A02 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r5.A07 = r0
            r0 = 36311839659066143(0x81016d0005031f, double:3.027091844211064E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r5.A0B = r0
            r0 = 36314541193169586(0x8103e200000ab2, double:3.0288003052562863E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r5.A09 = r0
            X.31j r0 = X.C671831j.A0D
            r5.A00 = r0
            r0 = 36313944192780619(0x8103570001094b, double:3.028422759806376E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r5.A0A = r0
            r0 = 36313944193042767(0x8103570005094f, double:3.0284227599721594E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r5.A08 = r0
            r0 = 36313944193108304(0x81035700060950, double:3.028422760013605E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r5.A0C = r0
            r0 = 36311839659000606(0x81016d0004031e, double:3.0270918441696184E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto La0
            r4.A06 = r5
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C671331e.<init>(com.instagram.common.session.UserSession, X.5Gc, X.2xH, X.31a, X.2sP, X.31d, X.1PY):void");
    }

    @Override // X.AbstractC671431f
    public final /* bridge */ /* synthetic */ C1PZ A09(InterfaceC42381xS interfaceC42381xS, Integer num, Object obj, int i, int i2, int i3) {
        C1PZ c1pz;
        String str;
        String str2;
        C14360o3.A0B(num, 2);
        C82373m0 c82373m0 = (C82373m0) interfaceC42381xS.BUM();
        C3XG c3xg = c82373m0.A01;
        if (c3xg.A06 == C1XV.A0T || c3xg.A03()) {
            C671831j c671831j = c82373m0.A03;
            if (c671831j.A02) {
                if (this.A06.BUP(c671831j.A09()) == null) {
                    c1pz = new C1PZ(C05F.A00);
                    c1pz.A0B = C05F.A0j;
                    c1pz.A03 = c671831j.A09();
                    str = "REPLACED_SLOT_TARGET_POSITION_NO_LONGER_VALID";
                } else {
                    c1pz = new C1PZ(C05F.A0j);
                    c1pz.A03 = c671831j.A09();
                    str = "iaa_replace_next_sponsored_item";
                }
                c1pz.A01(str);
                C114725Gc c114725Gc = this.A02;
                if (c114725Gc != null) {
                    C3Z9 c3z9 = c114725Gc.A04;
                    int i4 = c1pz.A03;
                    List A00 = c1pz.A00();
                    if (c1pz.A0C == C05F.A00) {
                        str2 = "Insert fail";
                    } else {
                        str2 = "Insert success";
                    }
                    c3z9.A04(A00, i4, str2);
                }
                return c1pz;
            }
        }
        return super.A09(interfaceC42381xS, num, obj, i, i2, i3);
    }

    public final boolean A0J(C3XG c3xg) {
        C1XV c1xv;
        C14360o3.A0B(c3xg, 0);
        if (!c3xg.A03 && (c1xv = c3xg.A06) != C1XV.A0T && !c3xg.A03() && c1xv != C1XV.A06 && c1xv != C1XV.A07 && c1xv != C1XV.A08) {
            if (c1xv == C1XV.A0Y) {
                InterfaceC38381qS interfaceC38381qS = c3xg.A05;
                if (C3XH.A02(interfaceC38381qS) != null) {
                    UserSession userSession = this.A01;
                    C38321qM A02 = C3XH.A02(interfaceC38381qS);
                    if (A02 != null) {
                        if (AbstractC41071vF.A0R(userSession, A02)) {
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
