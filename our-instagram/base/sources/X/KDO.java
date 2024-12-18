package X;

import android.os.Bundle;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class KDO extends AbstractC59962oe implements C51D, InterfaceC11480j6 {
    public static final String __redex_internal_original_name = "DirectEmojiReactionsListBaseFragment";
    public int A00;
    public int A01;
    public long A02;
    public C47378KwT A03;
    public C2EY A04;
    public C3o9 A05;
    public String A06;
    public String A07;
    public List A08;
    public boolean A09;
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        C11520jB c11520jB = new C11520jB();
        int i = this.A01;
        String str = null;
        if (i != 28) {
            if (i != 29) {
                if (i != 61) {
                    return c11520jB;
                }
            } else {
                C3o9 c3o9 = this.A05;
                if (c3o9 != null) {
                    str = JRE.A07(c3o9);
                }
                c11520jB.A0A(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                c11520jB.A09("is_broadcast_chat", 1);
                c11520jB.A09("audience_type", this.A00);
                return c11520jB;
            }
        }
        C3o9 c3o92 = this.A05;
        if (c3o92 != null) {
            str = JRE.A07(c3o92);
        }
        c11520jB.A0A(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        c11520jB.A09("is_csc_chat", 1);
        return c11520jB;
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
        int i = this.A01;
        if (i != 28) {
            if (i != 29) {
                if (i != 32) {
                    if (i != 61) {
                        if (i != 62) {
                            return "direct_reaction_fragment";
                        }
                        return "discoverable_chat_thread";
                    }
                    return "csc_direct_thread";
                }
                return "discoverable_chat_thread";
            }
            return AbstractC111324zv.A00(2009);
        }
        return "csc_direct_thread";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
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
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(395377404);
        super.onCreate(bundle);
        String string = requireArguments().getString(AbstractC111324zv.A00(41));
        if (string == null) {
            C0w9.A03(KWO.__redex_internal_original_name, "Cannot open DirectEmojiReactionsListFragment with a null message id.");
        } else {
            this.A07 = string;
        }
        this.A06 = requireArguments().getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_CLIENT_CONTEXT");
        this.A02 = requireArguments().getLong("DirectEmojiReactionsListFragment.MESSAGE_TIMESTAMP_MS");
        C2EY c2ey = C2EY.values()[requireArguments().getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_CONTENT_TYPE_ORDINAL")];
        C14360o3.A0B(c2ey, 0);
        this.A04 = c2ey;
        this.A05 = AbstractC43826JZo.A00(requireArguments(), "direct_emoji_unified_thread_key");
        this.A01 = requireArguments().getInt("direct_emoji_thread_subtype");
        this.A00 = requireArguments().getInt("direct_emoji_thread_audience_type");
        this.A09 = requireArguments().getBoolean("direct_emoji_is_count_based_reaction_sheet");
        this.A08 = requireArguments().getParcelableArrayList("direct_emoji_reactions_list");
        C0f9.A09(1446268879, A02);
    }
}
