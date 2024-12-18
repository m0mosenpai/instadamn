package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;

/* renamed from: X.HCr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38942HCr extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "PartialAttributionBottomsheetFragment";
    public OriginalAudioPartMetadataIntf A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "partial_attribution_bottomsheet";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0094, code lost:
    
        if (r1 != true) goto L12;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r13 = 0
            r3 = r19
            X.C14360o3.A0B(r3, r13)
            r4 = r18
            r0 = r20
            super.onViewCreated(r3, r0)
            android.content.Context r9 = r4.requireContext()
            r0 = 2131427957(0x7f0b0275, float:1.8477545E38)
            android.view.View r2 = r3.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0 = 2131443218(0x7f0b3e12, float:1.8508498E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131428158(0x7f0b033e, float:1.8477953E38)
            android.view.View r5 = r3.findViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 2131430685(0x7f0b0d1d, float:1.8483078E38)
            android.view.View r3 = r3.findViewById(r0)
            android.content.res.Resources r6 = X.AbstractC166997dE.A0N(r4)
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
            int r11 = r6.getDimensionPixelSize(r0)
            android.content.Context r0 = r4.requireContext()
            int r12 = X.AbstractC167017dG.A0E(r0)
            r0 = 2130968698(0x7f04007a, float:1.7546057E38)
            int r14 = X.AbstractC167007dF.A09(r9, r0)
            android.content.Context r0 = r4.requireContext()
            int r15 = X.AbstractC167017dG.A07(r0)
            r10 = 0
            r16 = -1
            X.BOM r8 = new X.BOM
            r17 = r13
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.setImageDrawable(r8)
            com.instagram.api.schemas.OriginalAudioPartMetadataIntf r0 = r4.A00
            r8 = 0
            if (r0 == 0) goto Lad
            com.instagram.common.typedurl.ImageUrl r0 = r0.C88()
        L6b:
            X.AbstractC38055Goi.A00(r2, r0, r10)
            X.C14360o3.A0A(r1)
            android.content.Context r2 = r4.requireContext()
            int r0 = X.AbstractC53242c7.A09(r9)
            int r0 = r2.getColor(r0)
            X.Gos r7 = new X.Gos
            r7.<init>(r1, r0)
            com.instagram.api.schemas.OriginalAudioPartMetadataIntf r0 = r4.A00
            if (r0 == 0) goto Lab
            java.lang.String r6 = r0.getDisplayTitle()
        L8a:
            com.instagram.api.schemas.OriginalAudioPartMetadataIntf r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L96
            boolean r1 = r0.isExplicit()
            r0 = 1
            if (r1 == r2) goto L97
        L96:
            r0 = 0
        L97:
            X.AbstractC38060Gon.A00(r10, r7, r6, r0, r13)
            com.instagram.api.schemas.OriginalAudioPartMetadataIntf r0 = r4.A00
            if (r0 == 0) goto La2
            java.lang.String r8 = r0.getDisplayArtist()
        La2:
            r5.setText(r8)
            r0 = 62
            X.ViewOnClickListenerC42035Ik4.A01(r3, r0, r4)
            return
        Lab:
            r6 = r10
            goto L8a
        Lad:
            r0 = r10
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38942HCr.onViewCreated(android.view.View, android.os.Bundle):void");
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

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1378680819);
        super.onCreate(bundle);
        this.A00 = (OriginalAudioPartMetadataIntf) requireArguments().getParcelable("audio_part_metadata");
        C0f9.A09(-607341863, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(530592224);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_partial_attribution_fragment, viewGroup, false);
        C0f9.A09(-1257277380, A02);
        return inflate;
    }
}
