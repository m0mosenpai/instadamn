package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Vx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164087Vx extends AbstractC52922bZ {
    public C7V0 A00;
    public C7V1 A01;
    public C09530e4 A02;
    public AnonymousClass195 A03;
    public boolean A04;
    public boolean A05;
    public final C12L A06;
    public final UserSession A07;
    public final C7W1 A08;
    public final InterfaceC164017Vq A09;
    public final C2DS A0A;
    public final InterfaceC09390do A0B;
    public final C164097Vy A0C;
    public final C98K A0D;
    public final AnonymousClass988 A0E;
    public final C7VV A0F;
    public final C7VF A0G;
    public volatile boolean A0H;

    public C164087Vx(UserSession userSession, C98K c98k, AnonymousClass988 anonymousClass988, C7VV c7vv, C7VF c7vf, InterfaceC164017Vq interfaceC164017Vq) {
        InterfaceC09390do c28111Xp;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c7vf, 2);
        C14360o3.A0B(anonymousClass988, 3);
        C14360o3.A0B(interfaceC164017Vq, 5);
        C14360o3.A0B(c98k, 6);
        this.A07 = userSession;
        this.A0G = c7vf;
        this.A0E = anonymousClass988;
        this.A0F = c7vv;
        this.A09 = interfaceC164017Vq;
        this.A0D = c98k;
        this.A04 = true;
        C2DS A00 = AbstractC28761aE.A00(userSession);
        this.A0A = A00;
        this.A0C = (C164097Vy) userSession.A01(C164097Vy.class, new C50252MHh(userSession, 15));
        this.A06 = C12L.A00;
        C164107Vz c164107Vz = C164107Vz.A00;
        EnumC09460dv enumC09460dv = EnumC09460dv.A03;
        if (C7W0.A00(userSession)) {
            c28111Xp = AbstractC09440dt.A00(enumC09460dv, c164107Vz);
        } else {
            c28111Xp = new C28111Xp(c164107Vz.invoke());
        }
        this.A0B = c28111Xp;
        this.A05 = true;
        this.A08 = new C7W1(userSession, A00);
    }

    public final void A03(C7TT c7tt, DirectThreadKey directThreadKey) {
        C14360o3.A0B(c7tt, 1);
        C141796aw A00 = AbstractC141776au.A00(this);
        this.A03 = AbstractC23641Du.A03(C05F.A00, this.A06.AOT(1740191742, (int) C18U.A01(C06090Tz.A05, this.A07, 36609991993595905L)), new C9DL(c7tt, directThreadKey, this, null, 1), A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((java.lang.Number) r11.A0B.getValue()).intValue() < 2013) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.C7TT r12, com.instagram.model.direct.DirectThreadKey r13) {
        /*
            r11 = this;
            r0 = 0
            r4 = r11
            boolean r9 = r11.A05
            r11.A05 = r0
            if (r9 == 0) goto L19
            X.0do r0 = r11.A0B
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 2013(0x7dd, float:2.821E-42)
            r10 = 1
            if (r1 >= r0) goto L1a
        L19:
            r10 = 0
        L1a:
            if (r10 == 0) goto L4d
            com.instagram.common.session.UserSession r3 = r11.A07
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318033003353926(0x81070f001b1746, double:3.031008540077254E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L48
            X.12T r0 = X.C12P.A00
            X.137 r0 = X.AnonymousClass131.A00
            X.137 r2 = r0.A06()
        L33:
            X.12W r2 = (X.C12W) r2
            X.6aw r1 = X.AbstractC141776au.A00(r11)
            r7 = 0
            r8 = 2
            X.9DK r3 = new X.9DK
            r6 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Integer r0 = X.C05F.A00
            X.AbstractC23641Du.A03(r0, r2, r3, r1)
            return
        L48:
            X.12L r0 = X.C12L.A00
            X.12T r2 = r0.A04
            goto L33
        L4d:
            X.12L r2 = r11.A06
            r1 = 302(0x12e, float:4.23E-43)
            r0 = 2
            X.0nZ r2 = r2.AOT(r1, r0)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164087Vx.A04(X.7TT, com.instagram.model.direct.DirectThreadKey):void");
    }

    public static final List A00(C164087Vx c164087Vx, C7TT c7tt, C2EC c2ec, List list) {
        C7V0 c7v0 = c164087Vx.A00;
        if (c7v0 != null) {
            return c7v0.EqQ(c7tt, list);
        }
        UserSession userSession = c164087Vx.A07;
        ((C159447Df) userSession.A01(C159447Df.class, new C50165MDs(userSession, 19))).A01(list);
        C164097Vy c164097Vy = c164087Vx.A0C;
        C7VF c7vf = c164087Vx.A0G;
        AnonymousClass988 anonymousClass988 = c164087Vx.A0E;
        C7VV c7vv = c164087Vx.A0F;
        if (c7vv != null) {
            return c164097Vy.A00(c164087Vx.A0D, anonymousClass988, c7vv, c7tt, c2ec, c7vf, list);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A01(C164087Vx c164087Vx, C7TT c7tt, List list) {
        long j;
        C7V1 c7v1 = c164087Vx.A01;
        if (c7v1 != null) {
            ArrayList A0U = AbstractC001800i.A0U(list);
            Long l = c164087Vx.A08.A01;
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            c7v1.DTO(c7tt, A0U, j);
        }
    }

    public final void A02(C7V1 c7v1) {
        C09530e4 c09530e4;
        if (this.A01 == null) {
            this.A01 = c7v1;
            if (C18U.A06(C06090Tz.A05, this.A07, 36318033003681610L) && (c09530e4 = this.A02) != null) {
                c7v1.DTN((List) c09530e4.A01);
            }
        }
    }
}
