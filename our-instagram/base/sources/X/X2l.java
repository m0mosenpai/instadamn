package X;

/* loaded from: classes11.dex */
public final class X2l extends C03E implements InterfaceC16820sZ {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X2l(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            java.lang.Class<X.UFO> r3 = X.UFO.class
            r1 = 0
            if (r9 == 0) goto L12
            java.lang.String r4 = "onSettingsIconClick"
            java.lang.String r5 = "onSettingsIconClick()V"
        Lc:
            r2 = r8
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L12:
            java.lang.String r4 = "onCareIconClick"
            java.lang.String r5 = "onCareIconClick()V"
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X2l.<init>(java.lang.Object, int):void");
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C2GS c2gs;
        Object wb0;
        int i = this.A00;
        UFO ufo = (UFO) this.receiver;
        if (i != 0) {
            if (ufo.A03 != null) {
                UFO.A01(ufo, "user_click_payouthub_atomic", UFO.A00(ufo), "payouthub_settings_link", null, null, null, null, null, null);
                ufo.A03("settings_fragment", "home_icon");
                c2gs = ufo.A0C;
                wb0 = new Wb1("settings_fragment", ufo.A02());
                C63167SeR.A00(c2gs, wb0);
            }
            return C0eB.A00;
        }
        String str = ufo.A01;
        if (str != null) {
            UFO.A01(ufo, "user_click_payouthub_atomic", UFO.A00(ufo), "payouthub_contact_link", str, null, null, null, null, null);
            c2gs = ufo.A0C;
            String str2 = ufo.A01;
            if (str2 == null) {
                C14360o3.A0F("careUrl");
                throw C00O.createAndThrow();
            }
            wb0 = new Wb0(str2);
            C63167SeR.A00(c2gs, wb0);
        }
        return C0eB.A00;
    }
}
