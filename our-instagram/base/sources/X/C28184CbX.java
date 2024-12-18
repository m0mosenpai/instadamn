package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.CbX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28184CbX {
    public int A00;
    public Integer A01;
    public String A02;
    public boolean A03;
    public final InterfaceC87893vx A04;
    public final UserSession A05;

    private final void A00() {
        C18950wb c18950wb;
        String str;
        InterfaceC87893vx interfaceC87893vx = this.A04;
        if (interfaceC87893vx == null) {
            c18950wb = C18950wb.A01;
            str = "config is null";
        } else {
            if (interfaceC87893vx.BHV() == null) {
                C18950wb.A01.AEp("indicatorStyle is null", 817901739);
            }
            Boolean Bv0 = interfaceC87893vx.Bv0();
            if (Bv0 == null) {
                c18950wb = C18950wb.A01;
                str = "shouldEnableAutoadvance is null";
            } else {
                if (!Bv0.booleanValue() || interfaceC87893vx.Azi() != null) {
                    return;
                }
                c18950wb = C18950wb.A01;
                str = "duration is null";
            }
        }
        c18950wb.AEp(str, 817901739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C28184CbX(X.InterfaceC87893vx r5, com.instagram.common.session.UserSession r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.A04 = r5
            r4.A05 = r6
            if (r5 == 0) goto L70
            java.lang.String r3 = r5.BHV()
        Ld:
            java.lang.String r2 = "dots"
            boolean r0 = X.C14360o3.A0K(r3, r2)
            java.lang.String r1 = "progress_dots"
            if (r0 != 0) goto L1e
            boolean r0 = X.C14360o3.A0K(r3, r1)
            if (r0 == 0) goto L6a
            r2 = r1
        L1e:
            r4.A02 = r2
            X.3vx r0 = r4.A04
            if (r0 == 0) goto L65
            java.lang.Boolean r0 = r0.Bv0()
            if (r0 == 0) goto L65
            boolean r0 = r0.booleanValue()
        L2e:
            r4.A03 = r0
            X.3vx r0 = r4.A04
            if (r0 == 0) goto L3e
            java.lang.Integer r1 = r0.Azi()
            boolean r0 = r4.A03
            if (r0 == 0) goto L47
            if (r1 != 0) goto L47
        L3e:
            r4.A00()
            r0 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L47:
            r4.A01 = r1
            X.3vx r0 = r4.A04
            if (r0 == 0) goto L59
            java.lang.Integer r0 = r0.C8D()
            if (r0 == 0) goto L59
            int r0 = r0.intValue()
            if (r0 != 0) goto L5b
        L59:
            r0 = 56
        L5b:
            r4.A00 = r0
            X.3vx r0 = r4.A04
            if (r0 == 0) goto L64
            r0.C87()
        L64:
            return
        L65:
            r4.A00()
            r0 = 0
            goto L2e
        L6a:
            r4.A00()
            java.lang.String r2 = "unknown"
            goto L1e
        L70:
            r3 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28184CbX.<init>(X.3vx, com.instagram.common.session.UserSession):void");
    }
}
