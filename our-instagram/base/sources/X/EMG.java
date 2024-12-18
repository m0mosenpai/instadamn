package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;
import com.instagram.modal.ModalActivity;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.save.model.SavedCollection;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class EMG extends AbstractC59962oe implements InterfaceC60442pS, C51D, InterfaceC62612t0 {
    public static final C34656FOp A0P = new Object();
    public static final String __redex_internal_original_name = "DirectSaveToCollectionFragment";
    public RecyclerView A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgImageView A03;
    public C65953Twy A04;
    public C61372qz A05;
    public GFJ A06;
    public C34682FPt A07;
    public final InterfaceC09390do A0L = C37059GUt.A01(this, 15);
    public final InterfaceC09390do A0O = C37059GUt.A01(this, 17);
    public final InterfaceC09390do A0H = C37059GUt.A01(this, 11);
    public final InterfaceC09390do A0G = C37059GUt.A01(this, 10);
    public final InterfaceC09390do A0J = C37059GUt.A01(this, 13);
    public final InterfaceC09390do A0K = C37059GUt.A01(this, 14);
    public final InterfaceC09390do A0I = C37059GUt.A01(this, 12);
    public final InterfaceC09390do A0F = C37059GUt.A01(this, 9);
    public final InterfaceC09390do A0N = C37059GUt.A01(this, 16);
    public final InterfaceC62602sz A0D = new C36745GHo(this, 6);
    public final FGB A0C = new FGB(this);
    public final FGA A0B = new FGA(this);
    public final FG9 A0A = new FG9(this);
    public final C42819Iwv A09 = new C42819Iwv(this, 0);
    public List A08 = C16930sl.A00;
    public final String A0E = "direct_save_to_collection";
    public final InterfaceC09390do A0M = AbstractC60492pY.A02(this);

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

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0160, code lost:
    
        if (r0 == false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x031f  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMG.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.ICf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.1vN] */
    public static final void A00(Context context, EMG emg, C38321qM c38321qM, int i, int i2) {
        EnumC77213d7 enumC77213d7;
        InterfaceC09390do interfaceC09390do = emg.A0M;
        if (SaveApiUtil.A09(AbstractC166987dD.A0r(interfaceC09390do), c38321qM)) {
            enumC77213d7 = EnumC77213d7.A03;
        } else {
            enumC77213d7 = EnumC77213d7.A04;
        }
        SaveApiUtil.A04(emg.requireActivity(), context, AbstractC166987dD.A0r(interfaceC09390do), c38321qM, emg, null, enumC77213d7, null, null, null, null, null, i2, i, -1);
        C25671My A00 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do));
        ?? obj = new Object();
        obj.A00 = c38321qM;
        A00.E4s(AbstractC40790I5s.A00(obj));
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do)).E4s(new Object());
    }

    public static final void A02(EMG emg) {
        View view = emg.mView;
        if (view != null) {
            view.postDelayed(new GLR(emg), 200L);
        }
    }

    public static final void A03(EMG emg) {
        IgTextView igTextView = emg.A02;
        String str = "privateSaveTitleTextView";
        if (igTextView != null) {
            Context context = igTextView.getContext();
            InterfaceC09390do interfaceC09390do = emg.A0K;
            int i = 2131952379;
            if (!AbstractC31178DnM.A1Y(emg, interfaceC09390do)) {
                i = 2131952380;
            }
            AbstractC166987dD.A1P(context, igTextView, i);
            IgImageView igImageView = emg.A03;
            if (igImageView == null) {
                str = "privateSaveToggleButton";
            } else {
                boolean A1Y = AbstractC31178DnM.A1Y(emg, interfaceC09390do);
                int i2 = R.drawable.instagram_save_pano_filled_24;
                if (!A1Y) {
                    i2 = R.drawable.instagram_save_pano_outline_24;
                }
                igImageView.setImageResource(i2);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A05(EMG emg, boolean z, boolean z2) {
        InterfaceC19610xo A0g;
        if (AbstractC31172DnG.A0f(emg.A0G).A03 == C05F.A01) {
            UserSession A0r = AbstractC166987dD.A0r(emg.A0M);
            if (z2) {
                A0g = AbstractC166987dD.A0w(AbstractC23021Ah.A00(A0r));
                A0g.E77("has_seen_public_collections_upsell", true);
            } else {
                A0g = AbstractC167017dG.A0g(AbstractC2056298m.A00(A0r).A00, "direct_collab_collection_feed_creation_nux_impression_count");
            }
            A0g.apply();
            if (z) {
                AbstractC31172DnG.A1J(emg.requireView(), R.id.close_button, 0);
            }
        }
        AbstractC13880nE.A0W(emg.requireView(), (int) A0P.A00(emg.requireContext(), AbstractC167007dF.A1Z(emg.A0O)));
        AbstractC31176DnK.A1D(emg.requireView(), R.id.spinner);
        AbstractC31172DnG.A1J(emg.requireView(), R.id.empty_state, 0);
    }

    private final void A06(boolean z) {
        GFJ gfj = this.A06;
        if (gfj == null) {
            C14360o3.A0F("savedCollectionsFetcher");
            throw C00O.createAndThrow();
        }
        gfj.A02(z, AbstractC167007dF.A1X(AbstractC31172DnG.A0f(this.A0G).A03, C05F.A01));
    }

    public static final boolean A07(EMG emg) {
        InterfaceC09390do interfaceC09390do = emg.A0M;
        if (!AbstractC31172DnG.A1a(AbstractC166987dD.A0x(AbstractC166987dD.A0r(interfaceC09390do)), "has_seen_public_collections_upsell") && !C17060sy.A01.A01(AbstractC166987dD.A0r(interfaceC09390do)).A1l() && AbstractC35085Fcw.A01(AbstractC166987dD.A0r(interfaceC09390do))) {
            return true;
        }
        return false;
    }

    public final UserSession A08() {
        return AbstractC166987dD.A0r(this.A0M);
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        GFJ gfj = this.A06;
        if (gfj == null) {
            C14360o3.A0F("savedCollectionsFetcher");
            throw C00O.createAndThrow();
        }
        gfj.A01();
        ((FQX) this.A0F.getValue()).A00(AbstractC25226BEj.A0z(this.A0K), this.A08);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0M);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null && recyclerView.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    public static final void A01(EnumC46161Kbz enumC46161Kbz, EMG emg) {
        Bundle requireArguments = emg.requireArguments();
        requireArguments.putInt(AbstractC43591JPw.A00(112), enumC46161Kbz.ordinal());
        AbstractC31173DnH.A0Z(emg.requireActivity(), requireArguments, AbstractC166987dD.A0r(emg.A0M), ModalActivity.class, "direct_new_collection").A0D(emg, 1000);
    }

    public static final void A04(EMG emg, boolean z) {
        AbstractC31176DnK.A1D(emg.requireView(), R.id.spinner);
        if (!AbstractC167007dF.A1Z(emg.A0O)) {
            AbstractC31172DnG.A1J(emg.requireView(), R.id.title_bar, 0);
        }
        RecyclerView recyclerView = emg.A00;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        recyclerView.setVisibility(0);
        if (z) {
            emg.requireView().getLayoutParams().height = -1;
        }
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnResume() {
        View view;
        super.afterOnResume();
        if (isVisible() && (view = this.mView) != null) {
            view.requestFocus();
        }
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
        return this.A0E;
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

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        SavedCollection savedCollection;
        C34682FPt c34682FPt;
        super.onActivityResult(i, i2, intent);
        if (1000 == i && -1 == i2) {
            if (intent != null && (savedCollection = (SavedCollection) intent.getParcelableExtra("DirectCollaborativeCollectionsConstants_new_created_collection")) != null && (c34682FPt = this.A07) != null) {
                c34682FPt.A00((ImageUrl) intent.getParcelableExtra("DirectCollaborativeCollectionsConstants_media_thumbnail_url"), savedCollection);
            }
            AbstractC25226BEj.A1Q(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String A00;
        String str;
        int A02 = C0f9.A02(1803294097);
        super.onCreate(bundle);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        A1I.put("count", String.valueOf(15));
        InterfaceC09390do interfaceC09390do = this.A0G;
        String str2 = AbstractC31172DnG.A0f(interfaceC09390do).A08;
        if (str2 != null) {
            A1I.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        }
        String str3 = AbstractC31172DnG.A0f(interfaceC09390do).A04;
        DirectCollectionArguments A0f = AbstractC31172DnG.A0f(interfaceC09390do);
        if (str3 != null) {
            A00 = A0f.A04;
            str = "media_fbid";
        } else {
            A00 = A0f.A00();
            str = "media_id";
        }
        A1I.put(str, A00);
        C38321qM A0z = AbstractC25226BEj.A0z(this.A0K);
        int i = requireArguments().getInt(AbstractC111324zv.A00(150));
        InterfaceC09390do interfaceC09390do2 = this.A0M;
        List A002 = AbstractC35273Fh8.A00(AbstractC166987dD.A0r(interfaceC09390do2), A0z, AbstractC166987dD.A1J(EnumC33416Epn.A0A), i);
        this.A06 = new GFJ(requireContext(), AbstractC018607g.A00(this), this, AbstractC166987dD.A0r(interfaceC09390do2), (GFI) this.A0L.getValue(), A002, AbstractC009903n.A0J(EnumC33380EpD.values()), A1I);
        int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C65953Twy c65953Twy = new C65953Twy(AbstractC166987dD.A0r(interfaceC09390do2), this, C05F.A01, 4);
        this.A04 = c65953Twy;
        C61372qz c61372qz = new C61372qz();
        c61372qz.A03(c65953Twy);
        this.A05 = c61372qz;
        A06(false);
        C34999FbW c34999FbW = (C34999FbW) this.A0I.getValue();
        C34999FbW.A00(c34999FbW, "open_save_to_collection_bottom_sheet", c34999FbW.A01.A0B);
        C0f9.A09(-65891347, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1642949679);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.save_to_collection_fragment, false);
        C0f9.A09(-1052276784, A02);
        return A0R;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (X.AbstractC31178DnM.A1Y(r5, r5.A0K) == true) goto L18;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            r5 = this;
            r0 = 780988409(0x2e8ceff9, float:6.4090906E-11)
            int r2 = X.C0f9.A02(r0)
            super.onDestroy()
            X.0do r0 = r5.A0G
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.AbstractC31172DnG.A0f(r0)
            java.lang.Integer r4 = r0.A03
            java.lang.Integer r0 = X.C05F.A00
            r3 = 0
            r1 = 1
            if (r4 != r0) goto L3d
            java.util.List r1 = r5.A08
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L46
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L46
        L24:
            X.0do r0 = r5.A0K
            r0.getValue()
            X.0do r0 = r5.A0I
            java.lang.Object r1 = r0.getValue()
            X.FbW r1 = (X.C34999FbW) r1
            java.lang.String r0 = "close_save_to_collection_bottom_sheet"
            X.C34999FbW.A00(r1, r0, r3)
            r0 = 1360725967(0x511b07cf, float:4.1615684E10)
            X.C0f9.A09(r0, r2)
            return
        L3d:
            X.0do r0 = r5.A0K
            boolean r0 = X.AbstractC31178DnM.A1Y(r5, r0)
            if (r0 != r1) goto L24
            goto L5c
        L46:
            java.util.Iterator r1 = r1.iterator()
        L4a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r1.next()
            com.instagram.save.model.SavedCollection r0 = (com.instagram.save.model.SavedCollection) r0
            boolean r0 = r0.A05()
            if (r0 == 0) goto L4a
        L5c:
            r3 = 1
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMG.onDestroy():void");
    }
}
