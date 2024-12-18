package X;

import java.util.Locale;

/* renamed from: X.1GE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1GE implements C1G4 {
    public final C23241Bd A00;
    public final C23251Be A01;
    public final InterfaceC11580jH A02;
    public final C1G4 A03;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0022, code lost:
    
        if (r2 == X.EnumC23341Bw.CriticalAPI) goto L14;
     */
    @Override // X.C1G4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC27191Tt startRequest(X.C1QW r10, X.C1QY r11, X.C26511Qg r12) {
        /*
            r9 = this;
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            r0 = 1
            X.C14360o3.A0B(r11, r0)
            r0 = 2
            X.C14360o3.A0B(r12, r0)
            X.1Bw r2 = r11.A09
            X.1Bw r0 = X.EnumC23341Bw.API
            if (r2 == r0) goto L16
            X.1Bw r0 = X.EnumC23341Bw.CriticalAPI
            if (r2 != r0) goto L2e
        L16:
            X.1Bd r1 = r9.A00
            boolean r0 = r1.A00
            if (r0 == 0) goto L24
            boolean r0 = r1.A04
            if (r0 == 0) goto L2e
            X.1Bw r0 = X.EnumC23341Bw.CriticalAPI
            if (r2 == r0) goto L2e
        L24:
            X.1G4 r0 = r9.A03
            X.1Tt r0 = r0.startRequest(r10, r11, r12)
            X.C14360o3.A07(r0)
            return r0
        L2e:
            X.1CP r0 = X.C1CP.A03
            X.0e4 r1 = r0.AIp(r10, r11)
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            java.lang.Object r0 = r1.A01
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
            java.lang.String r3 = "Priority"
            if (r4 == 0) goto L9c
            if (r5 < 0) goto Lb6
            r0 = 8
            if (r5 >= r0) goto Lb6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "u="
            r1.append(r0)
            r1.append(r5)
        L5c:
            java.lang.String r0 = r1.toString()
            r10.A01(r3, r0)
            r0 = r4 ^ 1
            r10.A00 = r5
            r10.A03 = r0
            X.1Bw r0 = X.EnumC23341Bw.Video
            r3 = 1
            if (r2 != r0) goto L83
            X.4J0 r8 = r11.A0A
            if (r8 == 0) goto L83
            long r1 = r8.A06
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L83
            java.lang.String r1 = r8.A07
            X.0jH r0 = r9.A02
            if (r0 == 0) goto L83
            r0.CjT(r1, r5, r4)
        L83:
            X.2o3 r0 = r11.A08
            if (r0 == 0) goto L93
            boolean r0 = r0.A01
            if (r0 != r3) goto L93
        L8b:
            java.lang.String r1 = "X-IG-APP-START-FIRST-MEDIA-REQUEST"
            java.lang.String r0 = "1"
            r10.A01(r1, r0)
            goto L24
        L93:
            X.4J0 r0 = r11.A0A
            if (r0 == 0) goto L24
            boolean r0 = r0.A05
            if (r0 != r3) goto L24
            goto L8b
        L9c:
            if (r5 < 0) goto Lbf
            r0 = 8
            if (r5 >= r0) goto Lbf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "u="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", i"
            r1.append(r0)
            goto L5c
        Lb6:
            java.lang.String r1 = "priority can be [0-7], 3 is default"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lbf:
            java.lang.String r1 = "priority can be [0-7], 3 is default"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1GE.startRequest(X.1QW, X.1QY, X.1Qg):X.1Tt");
    }

    public C1GE(C1Bf c1Bf, InterfaceC11580jH interfaceC11580jH, C1G4 c1g4) {
        this.A03 = c1g4;
        this.A02 = interfaceC11580jH;
        this.A00 = c1Bf.A00;
        this.A01 = c1Bf.A01;
        C1CQ c1cq = new C1CQ() { // from class: X.1GF
            @Override // X.C1CQ
            public final C09530e4 AIp(C1QW c1qw, C1QY c1qy) {
                boolean z;
                C23241Bd c23241Bd = C1GE.this.A00;
                int i = 0;
                if (!c23241Bd.A05 || c1qy.A09 != EnumC23341Bw.CriticalAPI) {
                    String obj = c1qw.A09.toString();
                    C14360o3.A07(obj);
                    Locale locale = Locale.getDefault();
                    C14360o3.A07(locale);
                    String lowerCase = obj.toLowerCase(locale);
                    C14360o3.A07(lowerCase);
                    if (!c23241Bd.A01 || (!lowerCase.endsWith("i.instagram.com/api/v1/feed/timeline/") && !lowerCase.endsWith("i.instagram.com/api/v1/feed/timeline_stream/") && !lowerCase.endsWith("i.instgaram.com/api/v1/feed/reels_tray/"))) {
                        i = 3;
                        z = c23241Bd.A03;
                        return new C09530e4(i, Boolean.valueOf(z));
                    }
                }
                z = c23241Bd.A02;
                return new C09530e4(i, Boolean.valueOf(z));
            }
        };
        boolean A07 = C20150ym.A07(AbstractC20100yh.A00(36325248548287408L));
        C1CP c1cp = C1CP.A03;
        c1cp.A00 = c1cq;
        if (!A07 || !c1cp.A02) {
            C1CR c1cr = new C1CR(false);
            c1cp.A02 = true;
            c1cp.A01 = c1cr;
        }
    }
}
