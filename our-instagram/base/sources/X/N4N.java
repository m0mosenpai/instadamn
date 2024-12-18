package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.share.facebook.model.FBReelsAudienceType;

/* loaded from: classes9.dex */
public final class N4N extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AutoCrosspostToFacebookBottomSheetFragment";
    public FBReelsAudienceType A00;
    public String A01;
    public String A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "auto_crosspost_to_facebook_bottom_sheet";
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r1 == 3) goto L16;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
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
            android.os.Bundle r1 = r7.requireArguments()
            java.lang.String r0 = "fb_username_arg"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto Lc9
            r7.A02 = r0
            java.lang.String r0 = "fb_privacy_arg"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto Lc9
            r7.A01 = r0
            java.lang.String r0 = "fb_privacy_enum_arg"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto Lc9
            com.instagram.share.facebook.model.FBReelsAudienceType r0 = com.instagram.share.facebook.model.FBReelsAudienceType.valueOf(r0)
            r7.A00 = r0
            java.lang.String r6 = "fbPrivacyEnum"
            if (r0 == 0) goto L5c
            int r1 = r0.ordinal()
            r5 = 1
            if (r1 == r5) goto Lc4
            r0 = 2
            if (r1 == r0) goto L41
            r0 = 3
            r3 = 2131976257(0x7f136041, float:1.958963E38)
            if (r1 != r0) goto L44
        L41:
            r3 = 2131976256(0x7f136040, float:1.9589627E38)
        L44:
            r0 = 2131431094(0x7f0b0eb6, float:1.8483907E38)
            android.view.View r1 = X.AbstractC166997dE.A0S(r8, r0)
            r0 = 2131431091(0x7f0b0eb3, float:1.8483901E38)
            android.widget.TextView r2 = X.AbstractC167007dF.A0N(r1, r0)
            android.content.Context r1 = r7.requireContext()
            java.lang.String r0 = r7.A02
            if (r0 != 0) goto L64
            java.lang.String r6 = "fbUsername"
        L5c:
            X.C14360o3.A0F(r6)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L64:
            X.AbstractC31177DnL.A0r(r1, r2, r0, r3)
            r0 = 2131431089(0x7f0b0eb1, float:1.8483897E38)
            android.widget.TextView r3 = X.AbstractC167007dF.A0N(r8, r0)
            android.content.Context r2 = r7.requireContext()
            r1 = 2131976259(0x7f136043, float:1.9589633E38)
            java.lang.String r0 = r7.A01
            if (r0 != 0) goto L7c
            java.lang.String r6 = "fbPrivacy"
            goto L5c
        L7c:
            X.AbstractC31177DnL.A0r(r2, r3, r0, r1)
            r0 = 2131431088(0x7f0b0eb0, float:1.8483895E38)
            android.widget.TextView r4 = X.AbstractC167007dF.A0N(r8, r0)
            android.content.Context r3 = r7.requireContext()
            com.instagram.share.facebook.model.FBReelsAudienceType r0 = r7.A00
            if (r0 == 0) goto L5c
            int r2 = r0.ordinal()
            if (r2 == r5) goto Lc0
            r0 = 2
            if (r2 == r0) goto Lbc
            r1 = 3
            r0 = 2131976253(0x7f13603d, float:1.9589621E38)
            if (r2 == r1) goto La0
            r0 = 2131976254(0x7f13603e, float:1.9589623E38)
        La0:
            X.AbstractC166987dD.A1P(r3, r4, r0)
            X.0do r0 = r7.A03
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r0)
            X.2Bt r0 = X.AbstractC46542Bs.A00(r0)
            X.0xq r0 = r0.A04
            X.0xo r1 = r0.ARD()
            java.lang.String r0 = "PREFERENCE_HAS_SEEN_REELS_CROSS_POST_TO_FACEBOOK_REDESIGN_BOTTOM_SHEET"
            r1.E77(r0, r5)
            r1.apply()
            return
        Lbc:
            r0 = 2131976252(0x7f13603c, float:1.958962E38)
            goto La0
        Lc0:
            r0 = 2131976255(0x7f13603f, float:1.9589625E38)
            goto La0
        Lc4:
            r3 = 2131976258(0x7f136042, float:1.9589631E38)
            goto L44
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4N.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(894504425);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_reels_crosspost_upsell_bottom_sheet, viewGroup, false);
        C0f9.A09(-943679701, A02);
        return inflate;
    }
}
