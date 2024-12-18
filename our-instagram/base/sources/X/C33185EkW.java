package X;

import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.EkW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33185EkW extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "ThreadDetailsNicknameSettingsFragment";
    public InterfaceC37169GZg A00;
    public InterfaceC83733oI A01;
    public String A02;
    public Capabilities A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            super.onViewCreated(r9, r10)
            android.os.Bundle r1 = r8.requireArguments()
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID"
            X.3oI r0 = X.AbstractC35077Fco.A00(r1, r0)
            if (r0 == 0) goto Lcb
            r8.A01 = r0
            java.lang.String r0 = "self_setting"
            java.lang.String r0 = r1.getString(r0)
            r8.A02 = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES"
            android.os.Parcelable r3 = r1.getParcelable(r0)
            com.instagram.direct.capabilities.Capabilities r3 = (com.instagram.direct.capabilities.Capabilities) r3
            r8.A03 = r3
            if (r3 == 0) goto L47
            android.content.Context r2 = r8.requireContext()
            X.0do r0 = r8.A04
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r0)
            X.3oI r0 = r8.A01
            if (r0 != 0) goto L41
            java.lang.String r0 = "threadId"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L41:
            X.GZg r0 = X.C7KH.A01(r2, r1, r3, r0)
            r8.A00 = r0
        L47:
            java.util.ArrayList r5 = X.AbstractC166987dD.A1E()
            r0 = 2131959115(0x7f131d4b, float:1.9554861E38)
            X.Fgf r1 = new X.Fgf
            r1.<init>(r0)
            r0 = 2132018630(0x7f1405c6, float:1.9675572E38)
            r1.A01 = r0
            r5.add(r1)
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.lang.String r7 = "EVERYONE"
            r0 = 2131959116(0x7f131d4c, float:1.9554863E38)
            java.lang.String r0 = r8.getString(r0)
            X.C35124FeR.A00(r7, r0, r4)
            java.lang.String r6 = "PEOPLE_YOU_FOLLOW"
            r0 = 2131959117(0x7f131d4d, float:1.9554865E38)
            java.lang.String r0 = r8.getString(r0)
            X.C35124FeR.A00(r6, r0, r4)
            java.lang.String r3 = "ONLY_YOU"
            r0 = 2131959118(0x7f131d4e, float:1.9554867E38)
            java.lang.String r0 = r8.getString(r0)
            X.C35124FeR.A00(r3, r0, r4)
            java.lang.String r2 = r8.A02
            if (r2 == 0) goto Lc8
            int r1 = r2.hashCode()
            r0 = -1285166868(0xffffffffb365e8ec, float:-5.353006E-8)
            if (r1 == r0) goto Lbf
            r0 = -1109690463(0xffffffffbddb77a1, float:-0.10716177)
            if (r1 == r0) goto Lc8
            r0 = 1064604011(0x3f74916b, float:0.9553439)
            if (r1 != r0) goto Lc8
            boolean r0 = r2.equals(r7)
            if (r0 == 0) goto Lc8
            java.lang.Integer r0 = X.C05F.A00
        La2:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto Lbd;
                case 1: goto Lbb;
                default: goto La9;
            }
        La9:
            r0 = 1
            X.Fqk r1 = new X.Fqk
            r1.<init>(r0, r8, r4)
            X.Fak r0 = new X.Fak
            r0.<init>(r1, r3, r4)
            r5.add(r0)
            r8.setItems(r5)
            return
        Lbb:
            r3 = r6
            goto La9
        Lbd:
            r3 = r7
            goto La9
        Lbf:
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto Lc8
            java.lang.Integer r0 = X.C05F.A0C
            goto La2
        Lc8:
            java.lang.Integer r0 = X.C05F.A01
            goto La2
        Lcb:
            java.lang.IllegalArgumentException r0 = X.AbstractC31172DnG.A0t()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33185EkW.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }
}
