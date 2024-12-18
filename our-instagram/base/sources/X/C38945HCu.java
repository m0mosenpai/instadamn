package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.StoryUnlockableStickerData;
import com.instagram.api.schemas.StoryUnlockableStickerTappableObject;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import java.util.List;

/* renamed from: X.HCu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38945HCu extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "UnlockableStickersAttributionSheetFragment";
    public StoryUnlockableStickerTappableObject A00;
    public UserSession A01;
    public ILY A02;
    public StoryUnlockableStickerData A03;
    public IgdsButton A04;
    public C38355Gtr A05;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "unlockable_sticker_attribution_sheet";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r1 != com.instagram.api.schemas.UnlockableStickerStatus.A05) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(com.instagram.api.schemas.StoryUnlockableStickerData r5) {
        /*
            r4 = this;
            r4.A03 = r5
            java.lang.String r0 = r5.getId()
            if (r0 == 0) goto L23
            com.instagram.common.session.UserSession r0 = r4.A01
            X.WhP r0 = X.C70809WhP.A00(r0)
            java.lang.String r1 = r5.getId()
            java.util.Map r0 = r0.A00
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L1c
            com.instagram.api.schemas.UnlockableStickerStatus r1 = com.instagram.api.schemas.UnlockableStickerStatus.A04
        L1c:
            com.instagram.api.schemas.UnlockableStickerStatus r0 = com.instagram.api.schemas.UnlockableStickerStatus.A05
            r3 = 2131976167(0x7f135fe7, float:1.9589447E38)
            if (r1 == r0) goto L26
        L23:
            r3 = 2131976166(0x7f135fe6, float:1.9589445E38)
        L26:
            com.instagram.igds.components.button.IgdsButton r2 = r4.A04
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = r5.getName()
            java.lang.String r0 = X.AbstractC167007dF.A0f(r1, r0, r3)
            r2.setText(r0)
            com.instagram.igds.components.button.IgdsButton r1 = r4.A04
            r0 = 40
            X.ViewOnClickListenerC42034Ik3.A00(r1, r0, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38945HCu.A00(com.instagram.api.schemas.StoryUnlockableStickerData):void");
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
    public final AbstractC18680vv getSession() {
        return this.A01;
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
        int A02 = C0f9.A02(946612393);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC31176DnK.A0S(this);
        Parcelable parcelable = requireArguments.getParcelable(AbstractC111324zv.A00(5400));
        parcelable.getClass();
        this.A00 = (StoryUnlockableStickerTappableObject) parcelable;
        ILY ily = this.A02;
        ily.getClass();
        this.A05 = new C38355Gtr(this, this.A01, ily, this.A00.C0p());
        if (this.A00.C0p() != null) {
            for (StoryUnlockableStickerData storyUnlockableStickerData : this.A00.C0p()) {
                if (storyUnlockableStickerData.getId() != null && storyUnlockableStickerData.CCl() != null) {
                    C70809WhP A00 = C70809WhP.A00(this.A01);
                    if (A00.A00.get(storyUnlockableStickerData.getId()) == null) {
                        C70809WhP A002 = C70809WhP.A00(this.A01);
                        A002.A00.put(storyUnlockableStickerData.getId(), storyUnlockableStickerData.CCl());
                    }
                }
            }
        }
        C0f9.A09(1026543351, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int size;
        int i;
        StoryUnlockableStickerData storyUnlockableStickerData;
        int A02 = C0f9.A02(-300369566);
        View inflate = layoutInflater.inflate(R.layout.fragment_unlockable_sticker_attribution_sheet, viewGroup, false);
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.subtitle);
        AbstractC166997dE.A0T(inflate, R.id.title).setText(this.A00.getTitle());
        A0T.setText(this.A00.getSubtitle());
        View findViewById = inflate.findViewById(R.id.sticker_image);
        findViewById.getClass();
        IgImageView igImageView = (IgImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.unlockable_stickers_list);
        findViewById2.getClass();
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.divider);
        findViewById3.getClass();
        this.A04 = (IgdsButton) inflate.requireViewById(R.id.button);
        List C0p = this.A00.C0p();
        if (C0p == null) {
            size = 0;
        } else {
            size = C0p.size();
        }
        if (size == 1) {
            i = R.dimen.ai_sticker_creation_suggested_prompt_pill_height;
            if (C0p == null) {
                storyUnlockableStickerData = null;
            } else {
                storyUnlockableStickerData = (StoryUnlockableStickerData) C0p.get(0);
            }
            recyclerView.setVisibility(8);
            igImageView.setVisibility(0);
            if (storyUnlockableStickerData != null && storyUnlockableStickerData.C83() != null) {
                AbstractC25235BEs.A1I(this, igImageView, storyUnlockableStickerData.C83().getUri());
            }
            findViewById3.setVisibility(0);
            this.A04.setVisibility(0);
            if (storyUnlockableStickerData != null) {
                A00(storyUnlockableStickerData);
            }
        } else {
            i = R.dimen.ad4ad_button_bottom_margin;
            AbstractC31174DnI.A16(getContext(), recyclerView, 1, false);
            recyclerView.setAdapter(this.A05);
            recyclerView.setVisibility(0);
            igImageView.setVisibility(8);
            findViewById3.setVisibility(8);
            this.A04.setVisibility(8);
        }
        AbstractC13880nE.A0Y(A0T, AbstractC166997dE.A0N(this).getDimensionPixelSize(i));
        C0f9.A09(1343081649, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(68000392);
        super.onResume();
        StoryUnlockableStickerData storyUnlockableStickerData = this.A03;
        if (storyUnlockableStickerData != null) {
            A00(storyUnlockableStickerData);
        } else {
            this.A05.notifyDataSetChanged();
        }
        C0f9.A09(-1741513897, A02);
    }
}
