package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.N6a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52150N6a extends AbstractC59962oe implements InterfaceC60072op, C51D {
    public static final String __redex_internal_original_name = "ShareToBarcelonaToggleUpsellFragment";
    public Boolean A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final String A02 = "share_to_barcelona_toggle_upsell";

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public static final void A00(EnumC201098ur enumC201098ur, UserSession userSession, C52150N6a c52150N6a, String str) {
        C82G c82g;
        C82H c82h;
        Boolean bool = c52150N6a.A00;
        Boolean A0b = AbstractC166997dE.A0b();
        if (C14360o3.A0K(bool, A0b)) {
            c82g = C82G.A0y;
        } else {
            c82g = C82G.A0E;
        }
        if (C14360o3.A0K(c52150N6a.A00, A0b)) {
            c82h = C82H.A0D;
        } else {
            c82h = C82H.A0C;
        }
        C82I A0H = MSW.A0H();
        A0H.A06(AbstractC111324zv.A00(1317), str);
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
        Integer num;
        C3DN A0l = AbstractC43593JPy.A0l(this, C3DN.A00);
        if (A0l != null) {
            num = ((C3DP) A0l).A0K;
        } else {
            num = null;
        }
        if (num != C05F.A02) {
            A00(EnumC201098ur.DECLINE, AbstractC166987dD.A0r(this.A01), this, null);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            r11 = this;
            r0 = -1037247655(0xffffffffc22cdb59, float:-43.214207)
            int r3 = X.C0f9.A02(r0)
            r4 = 0
            X.C14360o3.A0B(r12, r4)
            r6 = r11
            X.0do r5 = r11.A01
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r5)
            X.7ny r0 = X.AbstractC173457nx.A00(r0)
            X.0UO r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.7o0 r0 = (X.InterfaceC173487o0) r0
            r7 = 0
            if (r0 == 0) goto L6a
            X.7oq r2 = r0.CI6()
            if (r2 == 0) goto L6b
            X.Nhj r1 = r2.AY3()
        L2b:
            X.Nhj r0 = X.EnumC53307Nhj.PRIVATE
            r9 = 1
            boolean r10 = X.AbstractC167007dF.A1X(r1, r0)
            if (r2 == 0) goto L3a
            java.lang.String r8 = r2.getUsername()
            if (r8 != 0) goto L3c
        L3a:
            java.lang.String r8 = ""
        L3c:
            android.os.Bundle r1 = r11.mArguments
            if (r1 == 0) goto L46
            java.lang.String r0 = "is_new_user_activation_flow"
            java.lang.Boolean r7 = X.AbstractC31174DnI.A0n(r1, r0)
        L46:
            r11.A00 = r7
            com.instagram.common.session.UserSession r2 = X.AbstractC166987dD.A0r(r5)
            X.82H r1 = X.C82H.A0C
            X.82G r0 = X.C82G.A0E
            X.C197838ou.A01(r0, r1, r2)
            r0 = 710618512(0x2a5b2d90, float:1.9466915E-13)
            X.DT5 r5 = new X.DT5
            r5.<init>(r6, r7, r8, r9, r10)
            X.5TR r0 = X.C5UA.A04(r5, r0, r9)
            androidx.compose.ui.platform.ComposeView r1 = X.AbstractC25319BIo.A02(r11, r0, r4, r4)
            r0 = -2123584237(0xffffffff816cad13, float:-4.347053E-38)
            X.C0f9.A09(r0, r3)
            return r1
        L6a:
            r2 = r7
        L6b:
            r1 = r7
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52150N6a.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
