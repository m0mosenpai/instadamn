package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.direct.emojipong.data.EmojiPongUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.KDp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45524KDp extends AbstractC43842Ja5 implements C51D {
    public static final String __redex_internal_original_name = "EmojiPongLeaderboardFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_direct_emoji_pong_easter_egg_leaderboard";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList parcelableArrayList;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC13880nE.A0Y(view, C30D.A00);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (parcelableArrayList = bundle2.getParcelableArrayList("emoji_pong_users")) != null) {
            List<EmojiPongUser> A00 = JUD.A00(parcelableArrayList, 22);
            ArrayList A0q = AbstractC167017dG.A0q(A00);
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            for (EmojiPongUser emojiPongUser : A00) {
                boolean z = true;
                i2++;
                int i4 = emojiPongUser.A00;
                if (i4 != i) {
                    i = i4;
                    i3 = i2;
                }
                int size = A00.size();
                if (i4 != ((EmojiPongUser) AbstractC001800i.A0I(A00)).A00 || i4 <= 0) {
                    z = false;
                }
                A0q.add(new C45208Jzo(emojiPongUser, i3, size, z));
            }
            A0B(A0q);
        }
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

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new KHN(this));
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C50319MJx.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
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

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        if (isResumed() && AbstractC43592JPx.A1X(getRecyclerView())) {
            return false;
        }
        return true;
    }
}
