package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.9fS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214909fS extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, C51D {
    public static final String __redex_internal_original_name = "ClipsMusicEditorFragment";
    public int A00;
    public int A02;
    public C8BN A03;
    public C8BU A05;
    public EnumC185288Jt A06;
    public ClipsCreationViewModel A07;
    public MusicAssetModel A08;
    public MusicOverlayStickerModel A09;
    public C189988bH A0A;
    public AnonymousClass879 A0B;
    public EnumC1810381f A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public View A0K;
    public boolean A0L;
    public boolean A0N;
    public EnumC138556Pl A0C = EnumC138556Pl.A06;
    public int A01 = Integer.MAX_VALUE;
    public MusicProduct A04 = MusicProduct.A06;
    public boolean A0M = true;
    public final InterfaceC09390do A0O = new C60842q8(new C57521Pfv(this, 32), new C57521Pfv(this, 31), new C57256Pbe(25, null, this), new C0YZ(C8BE.class));
    public final InterfaceC09390do A0P = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return MSV.A00(1031);
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0194, code lost:
    
        if (r3 != X.C8BN.TIMELINE_TOOLBAR_AUDIO_OPTION) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214909fS.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final boolean A01(C214909fS c214909fS) {
        EnumC1810381f enumC1810381f = c214909fS.A0D;
        if (enumC1810381f == null) {
            C14360o3.A0F("captureState");
            throw C00O.createAndThrow();
        }
        return AbstractC167007dF.A1X(enumC1810381f, EnumC1810381f.A02);
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
        return AbstractC166987dD.A0n(this.A0P);
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

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A0I) {
            InterfaceC09390do interfaceC09390do = this.A0O;
            ((C8BE) interfaceC09390do.getValue()).A05(((C8BE) interfaceC09390do.getValue()).A01(), "pill_back", true);
        }
        C189988bH c189988bH = this.A0A;
        if (c189988bH != null) {
            return c189988bH.A0M();
        }
        return false;
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
        AnonymousClass879 anonymousClass879;
        C8BU c8bu = this.A05;
        if (c8bu != null) {
            c8bu.DUM(this.A0F);
        }
        if (!this.A0F) {
            if (this.A07 == null) {
                C14360o3.A0F("clipsCreationViewModel");
                throw C00O.createAndThrow();
            }
        } else if (this.A08 != null) {
            AbstractC226999zv.A00(AbstractC166987dD.A0r(this.A0P)).A01(EnumC222779sI.A07);
        }
        if (this.A06 != null) {
            InterfaceC09390do interfaceC09390do = this.A0P;
            if (AbstractC185298Jv.A04(AbstractC166987dD.A0r(interfaceC09390do)) && !AbstractC185298Jv.A0A(AbstractC166987dD.A0r(interfaceC09390do)) && (anonymousClass879 = this.A0B) != null) {
                anonymousClass879.F9I();
            }
        }
        this.A0F = false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final boolean A00(C214909fS c214909fS) {
        MusicAssetModel musicAssetModel;
        if (A01(c214909fS) && (musicAssetModel = c214909fS.A08) != null && musicAssetModel.A0O && AbstractC226329yp.A00(AbstractC166987dD.A0r(c214909fS.A0P))) {
            return true;
        }
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1356341730);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_clips_music_editor, viewGroup, false);
        this.A0K = inflate;
        if (inflate == null) {
            C14360o3.A0F("rootView");
            throw C00O.createAndThrow();
        }
        C0f9.A09(-2008298671, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C185278Js A00;
        int A02 = C0f9.A02(-1608900045);
        super.onPause();
        if (this.A0B instanceof AnonymousClass878) {
            C8BU c8bu = this.A05;
            if (c8bu != null) {
                c8bu.D5L();
            }
            AnonymousClass879 anonymousClass879 = this.A0B;
            if (anonymousClass879 != null) {
                anonymousClass879.onPause();
            }
        }
        C189988bH c189988bH = this.A0A;
        if (c189988bH != null && (A00 = C189988bH.A00(c189988bH)) != null) {
            A00.A0C = true;
        }
        C0f9.A09(2022757937, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C185278Js A00;
        int A02 = C0f9.A02(-250935704);
        super.onResume();
        if (this.A0B instanceof AnonymousClass878) {
            if (!this.A0M) {
                AnonymousClass229.A01(AbstractC166987dD.A0r(this.A0P)).A03.A02();
            }
            C8BU c8bu = this.A05;
            if (c8bu != null) {
                c8bu.D5M();
            }
            AnonymousClass879 anonymousClass879 = this.A0B;
            if (anonymousClass879 != null) {
                anonymousClass879.onResume();
            }
        }
        C189988bH c189988bH = this.A0A;
        if (c189988bH != null && (A00 = C189988bH.A00(c189988bH)) != null) {
            A00.A0C = false;
        }
        this.A0M = false;
        C0f9.A09(251856680, A02);
    }
}
