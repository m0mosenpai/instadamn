package X;

/* renamed from: X.7Lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161407Lb extends C4F4 implements C7VC {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C161407Lb(android.content.Context r5, java.lang.Integer r6, int r7) {
        /*
            r4 = this;
            r3 = 0
            com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl r0 = com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl.A01
            if (r0 == 0) goto L39
            r0 = 2131961006(0x7f1324ae, float:1.9558697E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        Lc:
            int r1 = r6.intValue()
            if (r1 == r3) goto L35
            r0 = 1
            if (r1 == r0) goto L31
            r0 = 2
            if (r1 == r0) goto L2d
            if (r2 == 0) goto L2a
            int r0 = r2.intValue()
        L1e:
            java.lang.String r1 = r5.getString(r0)
            X.C14360o3.A07(r1)
        L25:
            r0 = 0
            r4.<init>(r6, r1, r0, r7)
            return
        L2a:
            java.lang.String r1 = ""
            goto L25
        L2d:
            r0 = 2131973899(0x7f13570b, float:1.9584847E38)
            goto L1e
        L31:
            r0 = 2131973896(0x7f135708, float:1.958484E38)
            goto L1e
        L35:
            r0 = 2131973897(0x7f135709, float:1.9584843E38)
            goto L1e
        L39:
            r2 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161407Lb.<init>(android.content.Context, java.lang.Integer, int):void");
    }

    @Override // X.C7VC
    public final int getType() {
        return 36;
    }

    @Override // X.C7VC
    public final long C8f() {
        return 0L;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C161407Lb c161407Lb = (C161407Lb) obj;
        C14360o3.A0B(c161407Lb, 0);
        if (C14360o3.A0K(this.A03, c161407Lb.A03) && C14360o3.A0K(this.A02, c161407Lb.A02) && this.A00 == c161407Lb.A00) {
            return true;
        }
        return false;
    }

    public C161407Lb(Integer num, String str, String str2, int i) {
        C14360o3.A0B(num, 3);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = num;
        this.A00 = i;
    }
}
