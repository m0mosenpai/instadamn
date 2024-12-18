package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.KPo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45809KPo extends KCM implements C51D {
    public static final /* synthetic */ C0YR[] A04 = KCM.A0A(C45809KPo.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsV3IntroFragment";
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A02 = C50255MHk.A00(this, 34);
    public final KFH A01 = new C32550EVa(this, C50255MHk.A02(this, 35));
    public InterfaceC16820sZ A00 = C50255MHk.A02(this, 40);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "encrypted_backups_v3_intro_fragment";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    @Override // X.AbstractC59972of
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterOnViewCreated() {
        /*
            r7 = this;
            X.0do r0 = r7.A03
            java.lang.Object r4 = r0.getValue()
            X.JlH r4 = (X.C44449JlH) r4
            java.lang.Integer r6 = X.LLQ.A02(r7)
            java.lang.Integer r1 = X.LLQ.A03(r7)
            java.lang.Integer r5 = X.LLQ.A01(r7)
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            r0 = 1
            r3 = 10
            X.C14360o3.A0B(r1, r0)
            X.KPI r2 = r4.A01
            java.lang.String r0 = "INTRODUCE_NUX_IMPRESSION"
            r2.A05(r0)
            java.lang.String r1 = X.AbstractC46734Klr.A00(r1)
            java.lang.String r0 = "PERIOD"
            r2.A07(r0, r1)
            java.lang.String r1 = "SETUP_TYPE"
            java.lang.String r0 = "NONE"
            X.JQ1.A0l(r2, r5, r1, r0)
            int r1 = r6.intValue()
            if (r1 == r3) goto L65
            r0 = 11
            if (r1 == r0) goto L62
            r0 = 4
            if (r1 == r0) goto L5f
            r0 = 2
            if (r1 != r0) goto L4c
            java.lang.String r1 = "SETTINGS"
        L47:
            java.lang.String r0 = "ENTRY_POINT"
            r2.A07(r0, r1)
        L4c:
            X.0do r0 = r4.A02
            boolean r0 = X.AbstractC43594JPz.A1a(r0)
            if (r0 == 0) goto L5c
            java.lang.String r1 = "GDRIVE"
        L56:
            java.lang.String r0 = "LEADING"
            r2.A07(r0, r1)
            return
        L5c:
            java.lang.String r1 = "PIN_CODE"
            goto L56
        L5f:
            java.lang.String r1 = "FISHFOODING"
            goto L47
        L62:
            java.lang.String r1 = "INBOX_BANNER"
            goto L47
        L65:
            java.lang.String r1 = "THREAD_EXIT"
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45809KPo.afterOnViewCreated():void");
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
    public final boolean isScrolledToTop() {
        return KCM.A09(this.A01);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.EVa, X.KFH] */
    public C45809KPo() {
        C50255MHk A02 = C50255MHk.A02(this, 39);
        InterfaceC09390do A01 = C50255MHk.A01(C50255MHk.A02(this, 36), EnumC09460dv.A02, 37);
        this.A03 = AbstractC25225BEi.A0a(C50255MHk.A02(A01, 38), A02, new C50172MDz(23, null, A01), AbstractC25225BEi.A1D(C44449JlH.class));
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1302215803);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_v3_intro_layout, viewGroup, false);
        IgdsHeadline A0g = AbstractC43594JPz.A0g(inflate);
        C35228FgL A01 = C35228FgL.A01(requireContext(), true);
        A01.A04(getString(2131961270), getString(2131961271), R.drawable.instagram_lock_pano_outline_24);
        C35228FgL.A02(A01, A0g, getString(2131961273), getString(2131961272), R.drawable.instagram_key_pano_outline_24);
        ((C64P) AbstractC166997dE.A0R(inflate, R.id.bottom_buttons)).setPrimaryActionOnClickListener(ViewOnClickListenerC48072LPx.A00(this, 8));
        KCM.A04(inflate, this);
        C0f9.A09(633672985, A02);
        return inflate;
    }
}
