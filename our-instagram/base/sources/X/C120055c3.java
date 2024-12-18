package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.5c3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120055c3 implements InterfaceC452826l {
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EW(this, 4));
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final Map A04;
    public final boolean A05;

    @Override // X.InterfaceC452826l
    public final void D1t(C1OW c1ow) {
        C14360o3.A0B(c1ow, 0);
        A00(c1ow);
    }

    @Override // X.InterfaceC452826l
    public final void D6x(C1OW c1ow) {
        C14360o3.A0B(c1ow, 0);
        if ((c1ow instanceof C31191eO) || (c1ow instanceof C31311ea)) {
            A02(c1ow.A05);
        }
        Map map = this.A04;
        synchronized (map) {
            map.remove(c1ow.A05);
        }
    }

    @Override // X.InterfaceC452826l
    public final void DB8(C1OW c1ow, String str, boolean z) {
        C29271b4 c29271b4;
        String str2;
        C14360o3.A0B(c1ow, 0);
        if (this.A05) {
            Map map = this.A04;
            synchronized (map) {
                if ((c1ow instanceof C29271b4) && (c29271b4 = (C29271b4) c1ow) != null && (str2 = c29271b4.A0K) != null) {
                    map.put(str2, c1ow);
                }
            }
        }
    }

    @Override // X.InterfaceC452826l
    public final /* synthetic */ void DB9(C1OW c1ow, boolean z) {
    }

    @Override // X.InterfaceC452826l
    public final void DCa(C1OW c1ow) {
        C14360o3.A0B(c1ow, 0);
        A00(c1ow);
    }

    @Override // X.InterfaceC452826l
    public final void DUo(C19260xA c19260xA, C1OW c1ow, boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0074, code lost:
    
        if (r6 == null) goto L6;
     */
    @Override // X.InterfaceC452826l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DUp(X.C19260xA r31, X.C1OW r32, X.C114675Fx r33, boolean r34) {
        /*
            r30 = this;
            r14 = 0
            r1 = r32
            X.C14360o3.A0B(r1, r14)
            r12 = 3
            r0 = r31
            X.C14360o3.A0B(r0, r12)
            r0 = r30
            r0.A00(r1)
            X.0do r0 = r0.A01
            java.lang.Object r11 = r0.getValue()
            X.5cA r11 = (X.C120115cA) r11
            java.lang.String r10 = r1.A05
            r13 = r33
            if (r33 == 0) goto L76
            r21 = 0
            X.KdO r9 = r13.A01
            java.lang.String r8 = r13.A03
            java.lang.String r0 = r13.A06
            r18 = r0
            java.lang.String r7 = r13.A05
            boolean r0 = r13.A0C
            r17 = r0
            boolean r0 = r13.A0D
            r16 = r0
            java.lang.String r15 = r13.A07
            java.lang.String r6 = r13.A02
            boolean r5 = r13.A0B
            X.3l3 r4 = r13.A00
            boolean r3 = r13.A0A
            boolean r2 = r13.A09
            java.util.Map r1 = r13.A08
            boolean r0 = r13.A0E
            X.C14360o3.A0B(r9, r14)
            r14 = 1
            X.C14360o3.A0B(r8, r14)
            X.C14360o3.A0B(r7, r12)
            r14 = 13
            X.C14360o3.A0B(r1, r14)
            X.5Fx r14 = new X.5Fx
            r27 = r3
            r28 = r2
            r29 = r0
            r22 = r6
            r23 = r1
            r24 = r17
            r25 = r16
            r26 = r5
            r17 = r8
            r19 = r7
            r20 = r15
            r15 = r4
            r16 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r6 = r14.toString()
            if (r6 != 0) goto L78
        L76:
            java.lang.String r6 = ""
        L78:
            r5 = 1
            if (r33 == 0) goto Lae
            java.lang.String r0 = r13.A06
            if (r0 == 0) goto Lae
            int r0 = r0.length()
            if (r0 <= 0) goto Lae
        L85:
            java.util.Map r4 = r11.A02
            java.lang.Object r0 = r4.get(r10)
            X.L42 r0 = (X.L42) r0
            if (r0 == 0) goto Lad
            X.02i r3 = r11.A01
            int r2 = r0.A02
            r1 = 814299525(0x30893985, float:9.98441E-10)
            java.lang.String r0 = "fail_reason"
            r3.markerAnnotate(r1, r2, r0, r6)
            if (r5 == 0) goto Lad
            r3.markerEnd(r1, r2, r12)
            r4.remove(r10)
            java.util.Set r0 = r11.A03
            r0.remove(r10)
            java.util.Set r0 = r11.A04
            r0.remove(r10)
        Lad:
            return
        Lae:
            r5 = 0
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120055c3.DUp(X.0xA, X.1OW, X.5Fx, boolean):void");
    }

    @Override // X.InterfaceC452826l
    public final void DUt(C19260xA c19260xA, C1OW c1ow) {
    }

    @Override // X.InterfaceC452826l
    public final void Da4(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            Map map = this.A04;
            synchronized (map) {
                C29271b4 c29271b4 = (C29271b4) map.get(str);
                if (c29271b4 != null) {
                    c29271b4.A0I = str2;
                    c29271b4.A0H = str3;
                }
            }
        }
    }

    @Override // X.InterfaceC452826l
    public final void DhF(C1OW c1ow, String str, boolean z) {
    }

    private final void A00(C1OW c1ow) {
        Map map = this.A04;
        synchronized (map) {
            C29271b4 c29271b4 = (C29271b4) map.get(c1ow.A05);
            if (c29271b4 != null) {
                c29271b4.A0K = null;
            }
            map.remove(c1ow.A05);
        }
    }

    public final void A01(String str) {
        AbstractC29011ae abstractC29011ae;
        Map map = this.A04;
        synchronized (map) {
            Object obj = map.get(str);
            if ((obj instanceof AbstractC29011ae) && (abstractC29011ae = (AbstractC29011ae) obj) != null) {
                str = abstractC29011ae.A05;
            }
        }
        C120115cA c120115cA = (C120115cA) this.A01.getValue();
        L42 l42 = (L42) c120115cA.A02.get(str);
        if (l42 != null) {
            c120115cA.A01.markerPoint(814299525, l42.A02, "image_send");
        }
    }

    public final void A02(String str) {
        AbstractC29011ae abstractC29011ae;
        Map map = this.A04;
        synchronized (map) {
            Object obj = map.get(str);
            if ((obj instanceof AbstractC29011ae) && (abstractC29011ae = (AbstractC29011ae) obj) != null) {
                str = abstractC29011ae.A05;
            }
        }
        C120115cA c120115cA = (C120115cA) this.A01.getValue();
        L42 l42 = (L42) c120115cA.A02.get(str);
        if (l42 != null) {
            java.util.Set set = c120115cA.A03;
            if (!set.contains(str)) {
                set.add(str);
                c120115cA.A01.markerPoint(814299525, l42.A02, "image_sent");
            }
        }
    }

    @Override // X.InterfaceC452826l
    public final void Da8(C1OW c1ow, String str, String str2) {
        if (c1ow != null) {
            Da4(c1ow.A05, str, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if (X.C18U.A06(r2, r5, 36327404620233267L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C120055c3(com.instagram.common.session.UserSession r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.A00 = r5
            X.0dv r2 = X.EnumC09460dv.A02
            r1 = 4
            X.9EW r0 = new X.9EW
            r0.<init>(r4, r1)
            X.0do r0 = X.AbstractC09440dt.A00(r2, r0)
            r4.A01 = r0
            X.0dv r3 = X.EnumC09460dv.A03
            X.5c4 r0 = X.C120065c4.A00
            X.0do r0 = X.AbstractC09440dt.A00(r3, r0)
            r4.A03 = r0
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36325669454558465(0x810e0100113501, double:3.0358378625685253E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 != 0) goto L36
            r0 = 36327404620233267(0x810f9500003a33, double:3.0369351883282215E-306)
            boolean r1 = X.C18U.A06(r2, r5, r0)
            r0 = 0
            if (r1 == 0) goto L37
        L36:
            r0 = 1
        L37:
            r4.A05 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r4.A04 = r0
            r1 = 5
            X.9EW r0 = new X.9EW
            r0.<init>(r4, r1)
            X.0do r0 = X.AbstractC09440dt.A00(r3, r0)
            r4.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120055c3.<init>(com.instagram.common.session.UserSession):void");
    }
}
