package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.feed.media.CreativeConfigIntf;
import java.util.List;

/* renamed from: X.BtX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26870BtX extends AbstractC59962oe implements C51D, JPX {
    public static final String __redex_internal_original_name = "MagicModAttributionBottomSheetFragment";
    public GenAIToolInfoDictIntf A00;
    public EnumC193878i8 A01;
    public String A02;
    public C38321qM A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final Integer A05 = C05F.A05;
    public final String A06 = "magic_mod_attribution_bottom_sheet";

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.JPX
    public final Integer BlT() {
        return this.A05;
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Throwable A0g;
        int i;
        String string;
        CreativeConfigIntf Asm;
        List B9a;
        GenAIToolInfoDictIntf genAIToolInfoDictIntf;
        EnumC193878i8 enumC193878i8;
        int A02 = C0f9.A02(1666501640);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("args_media_id")) != null) {
            this.A02 = string;
            C1DX A00 = C1DW.A00(AbstractC166987dD.A0r(this.A04));
            String str = this.A02;
            if (str == null) {
                C14360o3.A0F("mediaId");
                throw C00O.createAndThrow();
            }
            C38321qM A022 = A00.A02(str);
            this.A03 = A022;
            if (A022 != null && (Asm = A022.A0C.Asm()) != null && (B9a = Asm.B9a()) != null && (genAIToolInfoDictIntf = (GenAIToolInfoDictIntf) AbstractC001800i.A0J(B9a)) != null) {
                this.A00 = genAIToolInfoDictIntf;
                int ordinal = genAIToolInfoDictIntf.C9G().ordinal();
                if (ordinal != 127) {
                    if (ordinal == 18) {
                        enumC193878i8 = EnumC193878i8.A09;
                    } else {
                        A0g = AbstractC166987dD.A12("Non-magic mod camera tool provided");
                        i = -453660131;
                    }
                } else {
                    enumC193878i8 = EnumC193878i8.A0B;
                }
                this.A01 = enumC193878i8;
                C0f9.A09(829405813, A02);
                return;
            }
            A0g = AbstractC166987dD.A12("Media does not have an applied gen AI tool");
            i = 1007252141;
        } else {
            A0g = AbstractC166997dE.A0g();
            i = -1780050570;
        }
        C0f9.A09(i, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(436457953);
        ComposeView A022 = AbstractC25319BIo.A02(this, C5UA.A03(C30481DbQ.A00(this, 0), 1431122845), false, false);
        C0f9.A09(1819692332, A02);
        return A022;
    }
}
