package X;

import android.os.Bundle;

/* renamed from: X.Eky, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33210Eky extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CaptionOptionsFragment";
    public String A00;
    public boolean A01;
    public final String A02 = "caption_options";
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (!this.A01) {
            InterfaceC09390do interfaceC09390do = this.A03;
            if (AbstractC75373a4.A04(AbstractC166987dD.A0r(interfaceC09390do)) || AbstractC75373a4.A02(AbstractC166987dD.A0r(interfaceC09390do))) {
                interfaceC56362iU.Efu(2131973570);
            }
        }
    }

    @Override // X.AbstractC33235ElU
    public final int getBottomPadding() {
        return 0;
    }

    @Override // X.AbstractC33235ElU
    public final int getTopPadding() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r2 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (r2 != false) goto L11;
     */
    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            super.onViewCreated(r8, r9)
            boolean r5 = r7.A01
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            X.0do r3 = r7.A03
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r3)
            boolean r6 = X.AbstractC75373a4.A04(r0)
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r3)
            boolean r2 = X.AbstractC75373a4.A02(r0)
            if (r6 != 0) goto L26
            r1 = 2131954808(0x7f130c78, float:1.9546126E38)
            if (r2 == 0) goto L29
        L26:
            r1 = 2131954801(0x7f130c71, float:1.9546111E38)
        L29:
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r3)
            boolean r0 = X.AbstractC75343a1.A07(r0)
            r3 = 1
            X.AbstractC33235ElU.A09(r7, r4, r3, r1, r0)
            if (r6 != 0) goto L3c
            r0 = 2131954799(0x7f130c6f, float:1.9546107E38)
            if (r2 == 0) goto L3f
        L3c:
            r0 = 2131954802(0x7f130c72, float:1.9546114E38)
        L3f:
            java.lang.String r1 = r7.getString(r0)
            X.C14360o3.A0A(r1)
            boolean r0 = r7.A01
            if (r0 == 0) goto L58
            X.Fgf r0 = new X.Fgf
            r0.<init>(r1)
        L4f:
            r4.add(r0)
            if (r5 == 0) goto L74
            r7.setBottomSheetMenuItems(r4)
            return
        L58:
            r0 = 2131965064(0x7f133488, float:1.9566927E38)
            java.lang.String r2 = X.AbstractC25227BEk.A0v(r7, r0)
            android.text.SpannableStringBuilder r1 = X.AbstractC31178DnM.A09(r1, r2)
            X.Dwy r0 = new X.Dwy
            r0.<init>(r7, r3)
            X.C14360o3.A0A(r1)
            X.AnonymousClass773.A05(r1, r0, r2)
            X.Fgf r0 = new X.Fgf
            r0.<init>(r1)
            goto L4f
        L74:
            r7.setItems(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33210Eky.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // X.AbstractC33235ElU
    public final boolean isElevated() {
        return this.A01;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1638379019);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        requireArguments.getBoolean("should_show_captions_toggle_description");
        this.A01 = requireArguments.getBoolean("is_surface_elevated");
        this.A00 = AbstractC31173DnH.A0k(requireArguments, "entrypoint");
        requireArguments.getString("media_id");
        requireArguments.getBoolean("media_has_caption_translations");
        requireArguments.getBoolean("media_has_sticker_dubbing");
        requireArguments.getBoolean("media_has_dubbing");
        C0f9.A09(-279220168, A02);
    }
}
