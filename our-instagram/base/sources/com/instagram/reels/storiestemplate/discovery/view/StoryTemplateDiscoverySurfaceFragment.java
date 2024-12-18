package com.instagram.reels.storiestemplate.discovery.view;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25235BEs;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC37301Gc2;
import X.AbstractC43592JPx;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.AnonymousClass013;
import X.C05F;
import X.C06090Tz;
import X.C0YR;
import X.C0f9;
import X.C14360o3;
import X.C18U;
import X.C1XM;
import X.C2UU;
import X.C30189DRu;
import X.C3OO;
import X.C3P9;
import X.C44326JiO;
import X.C4S7;
import X.C50913Mei;
import X.C51070MhQ;
import X.C51177MjL;
import X.C51198Mji;
import X.C51360MmL;
import X.C51361MmM;
import X.C51703MsY;
import X.C51737MtK;
import X.C52374NFq;
import X.C54137NwZ;
import X.C57527Pg1;
import X.C57536PgA;
import X.C57778Pk5;
import X.C5TA;
import X.C6XJ;
import X.C75363a3;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC16530ry;
import X.InterfaceC60072op;
import X.MSX;
import X.O4C;
import X.O4D;
import X.Ok3;
import X.PJN;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes9.dex */
public final class StoryTemplateDiscoverySurfaceFragment extends AbstractC59962oe implements InterfaceC60072op {
    public static final /* synthetic */ C0YR[] $$delegatedProperties = {new AnonymousClass013(StoryTemplateDiscoverySurfaceFragment.class, "currentMediaModel", "getCurrentMediaModel()Lcom/instagram/reels/storiestemplate/discovery/model/StoryTemplateDiscoverySurfaceSectionMediaModel;", 0)};
    public static final C54137NwZ Companion = new Object();
    public static final float ITEM_PER_ROW = 1.6f;
    public final InterfaceC09390do browserLayoutManager$delegate;
    public final InterfaceC16530ry currentMediaModel$delegate;
    public final InterfaceC09390do discoverySurfaceViewModel$delegate;
    public final InterfaceC09390do horizontalSectionMediaAdapterCallback$delegate;
    public RecyclerView recyclerView;
    public final InterfaceC09390do scrollListener$delegate;
    public final O4D sectionViewCallback;
    public C51070MhQ verticalSectionAdapter;
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);
    public final String viewerSessionId = AbstractC167017dG.A0j();
    public final InterfaceC09390do childItemWidth$delegate = C1XM.A00(new C57527Pg1(this, 9));

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "story_template_discovery_surface";
    }

    @Override // X.InterfaceC60072op
    public boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC43592JPx.A1I(view, R.id.story_template_discovery_surface_layout, 0);
        C3P9 A0s = AbstractC166987dD.A0s(AbstractC166987dD.A0c(view, R.id.story_template_browser_exit_button));
        A0s.A06 = false;
        C52374NFq.A00(A0s, this, 25);
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(this.session$delegate), 36319909903867731L)) {
            Ok3.A00(AbstractC37301Gc2.A0D(view, R.id.story_template_browser_add_button_stub).getView(), 4, this);
        }
        initializeRecyclerView(view);
    }

    public static final /* synthetic */ int access$getChildItemWidth(StoryTemplateDiscoverySurfaceFragment storyTemplateDiscoverySurfaceFragment) {
        return AbstractC167027dH.A01(storyTemplateDiscoverySurfaceFragment.childItemWidth$delegate);
    }

    public final LinearLayoutManager getBrowserLayoutManager() {
        return (LinearLayoutManager) this.browserLayoutManager$delegate.getValue();
    }

    private final int getChildItemWidth() {
        return AbstractC167027dH.A01(this.childItemWidth$delegate);
    }

    private final C51703MsY getCurrentMediaModel() {
        return (C51703MsY) AbstractC31171DnF.A0Y(this, this.currentMediaModel$delegate, $$delegatedProperties, 0);
    }

    public final C50913Mei getDiscoverySurfaceViewModel() {
        return (C50913Mei) this.discoverySurfaceViewModel$delegate.getValue();
    }

    public final O4C getHorizontalSectionMediaAdapterCallback() {
        return (O4C) this.horizontalSectionMediaAdapterCallback$delegate.getValue();
    }

    private final C51198Mji getScrollListener() {
        return (C51198Mji) this.scrollListener$delegate.getValue();
    }

    private final void initializeRecyclerView(View view) {
        C2UU c2uu;
        this.verticalSectionAdapter = new C51070MhQ(this.sectionViewCallback, new C30189DRu(this, 28));
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.story_template_browser_vertical_recycler_view);
        A0G.setLayoutManager(getBrowserLayoutManager());
        A0G.setAdapter(this.verticalSectionAdapter);
        A0G.A14(getScrollListener());
        A0G.A12(new C44326JiO());
        this.recyclerView = A0G;
        AbstractC31176DnK.A1Z(this, AbstractC25235BEs.A0S(this), 47);
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null && (c2uu = recyclerView.A0A) != null) {
            c2uu.registerAdapterDataObserver(new C51177MjL(this));
        }
    }

    public final void launchCreation() {
        UserSession A0r = AbstractC166987dD.A0r(this.session$delegate);
        MSX.A18(this, C6XJ.A02(getActivity(), new Bundle(0), A0r, TransparentModalActivity.class, AbstractC111324zv.A00(5424)));
    }

    private final void setCurrentMediaModel(C51703MsY c51703MsY) {
        AbstractC31171DnF.A1S(this, c51703MsY, this.currentMediaModel$delegate, $$delegatedProperties, 0);
    }

    public static /* synthetic */ void updateActiveViewHolder$default(StoryTemplateDiscoverySurfaceFragment storyTemplateDiscoverySurfaceFragment, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        storyTemplateDiscoverySurfaceFragment.updateActiveViewHolder(i, i2);
    }

    private final void updateVideoPlayState(C51361MmM c51361MmM, C51361MmM c51361MmM2) {
        C75363a3 c75363a3;
        PJN pjn;
        if (c51361MmM2 != null && (pjn = c51361MmM2.A02) != null) {
            ((C5TA) pjn.A02.getValue()).A09("Story Template Discovery Surface media item recycler view scroll");
        }
        if (c51361MmM != null && (c75363a3 = c51361MmM.A03) != null) {
            if (c51361MmM.A02 == null) {
                c51361MmM.A00();
            }
            PJN pjn2 = c51361MmM.A02;
            if (pjn2 != null) {
                Integer num = pjn2.A00;
                Integer num2 = C05F.A01;
                if (num != num2) {
                    pjn2.A00 = num2;
                    ((C5TA) pjn2.A02.getValue()).A08(pjn2.A01, c75363a3, new C4S7((Object) null, 0), null, "StoryTemplateDiscoverySurfaceVideoPlayer", 0.0f, -1, 0, true, true);
                }
                if (pjn2.A00 == C05F.A0C) {
                    InterfaceC09390do interfaceC09390do = pjn2.A02;
                    ((C5TA) interfaceC09390do.getValue()).A02(1.0f, 0);
                    ((C5TA) interfaceC09390do.getValue()).A04(0, false);
                    ((C5TA) interfaceC09390do.getValue()).A0B("Story Template Discovery Surface media item recycler view scroll", false);
                }
            }
        }
    }

    @Override // X.AbstractC59962oe
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }

    public StoryTemplateDiscoverySurfaceFragment() {
        C57527Pg1 c57527Pg1 = new C57527Pg1(this, 10);
        InterfaceC09390do A00 = C57527Pg1.A00(new C57527Pg1(this, 13), EnumC09460dv.A02, 14);
        this.discoverySurfaceViewModel$delegate = AbstractC25225BEi.A0a(new C57527Pg1(A00, 15), c57527Pg1, new C57536PgA(6, null, A00), AbstractC25225BEi.A1D(C50913Mei.class));
        this.browserLayoutManager$delegate = C1XM.A00(new C57527Pg1(this, 8));
        this.horizontalSectionMediaAdapterCallback$delegate = C1XM.A00(new C57527Pg1(this, 11));
        this.scrollListener$delegate = C1XM.A00(new C57527Pg1(this, 12));
        this.sectionViewCallback = new O4D(this);
        this.currentMediaModel$delegate = new C57778Pk5(this, 2);
    }

    public static final /* synthetic */ LinearLayoutManager access$getBrowserLayoutManager(StoryTemplateDiscoverySurfaceFragment storyTemplateDiscoverySurfaceFragment) {
        return storyTemplateDiscoverySurfaceFragment.getBrowserLayoutManager();
    }

    public static final /* synthetic */ C50913Mei access$getDiscoverySurfaceViewModel(StoryTemplateDiscoverySurfaceFragment storyTemplateDiscoverySurfaceFragment) {
        return storyTemplateDiscoverySurfaceFragment.getDiscoverySurfaceViewModel();
    }

    public static final /* synthetic */ O4C access$getHorizontalSectionMediaAdapterCallback(StoryTemplateDiscoverySurfaceFragment storyTemplateDiscoverySurfaceFragment) {
        return storyTemplateDiscoverySurfaceFragment.getHorizontalSectionMediaAdapterCallback();
    }

    public final void logTemplateImpression() {
        C3OO c3oo;
        C3OO c3oo2;
        C51361MmM c51361MmM;
        C51360MmL c51360MmL;
        RecyclerView recyclerView;
        C51737MtK c51737MtK = (C51737MtK) getDiscoverySurfaceViewModel().A04.getValue();
        if (c51737MtK != null) {
            int i = c51737MtK.A01;
            C51737MtK c51737MtK2 = (C51737MtK) getDiscoverySurfaceViewModel().A04.getValue();
            if (c51737MtK2 != null) {
                int i2 = c51737MtK2.A00;
                RecyclerView recyclerView2 = this.recyclerView;
                C51703MsY c51703MsY = null;
                if (recyclerView2 != null) {
                    c3oo = recyclerView2.A0V(i);
                } else {
                    c3oo = null;
                }
                if ((c3oo instanceof C51360MmL) && (c51360MmL = (C51360MmL) c3oo) != null && (recyclerView = c51360MmL.A01) != null) {
                    c3oo2 = recyclerView.A0V(i2);
                } else {
                    c3oo2 = null;
                }
                if ((c3oo2 instanceof C51361MmM) && (c51361MmM = (C51361MmM) c3oo2) != null) {
                    c51703MsY = c51361MmM.A00;
                }
                setCurrentMediaModel(c51703MsY);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateActiveViewHolder(int r6, int r7) {
        /*
            r5 = this;
            X.Mei r0 = r5.getDiscoverySurfaceViewModel()
            X.0UO r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.MtK r0 = (X.C51737MtK) r0
            r4 = 0
            if (r0 == 0) goto Lb0
            int r1 = r0.A01
            androidx.recyclerview.widget.RecyclerView r0 = r5.recyclerView
            if (r0 == 0) goto Lb0
            X.3OO r2 = r0.A0V(r1)
        L19:
            boolean r0 = r2 instanceof X.C51360MmL
            if (r0 == 0) goto Lad
            X.MmL r2 = (X.C51360MmL) r2
        L1f:
            X.Mei r0 = r5.getDiscoverySurfaceViewModel()
            X.0UO r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.MtK r0 = (X.C51737MtK) r0
            if (r0 == 0) goto Lab
            int r1 = r0.A00
            if (r2 == 0) goto Lab
            androidx.recyclerview.widget.RecyclerView r0 = r2.A01
            if (r0 == 0) goto Lab
            X.3OO r3 = r0.A0V(r1)
        L39:
            boolean r0 = r3 instanceof X.C51361MmM
            if (r0 == 0) goto La9
            X.MmM r3 = (X.C51361MmM) r3
        L3f:
            androidx.recyclerview.widget.RecyclerView r0 = r5.recyclerView
            if (r0 == 0) goto La7
            X.3OO r1 = r0.A0V(r6)
        L47:
            boolean r0 = r1 instanceof X.C51360MmL
            if (r0 == 0) goto La5
            X.MmL r1 = (X.C51360MmL) r1
            if (r1 == 0) goto La5
            androidx.recyclerview.widget.RecyclerView r0 = r1.A01
            if (r0 == 0) goto La5
            X.3OO r2 = r0.A0V(r7)
        L57:
            boolean r0 = r2 instanceof X.C51361MmM
            if (r0 == 0) goto Lb3
            X.MmM r2 = (X.C51361MmM) r2
            if (r2 == 0) goto Lb3
            boolean r0 = X.C14360o3.A0K(r3, r2)
            if (r0 != 0) goto La1
            X.Qvv r0 = r2.A01
            if (r0 == 0) goto L70
            X.PJN r0 = r2.A02
            if (r0 != 0) goto L70
            r2.A00()
        L70:
            r5.updateVideoPlayState(r2, r3)
            if (r3 == 0) goto L80
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r3.A08
            r1 = 4
            r0.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r0 = r3.A07
            r0.setVisibility(r1)
        L80:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r2.A08
            r1 = 0
            r0.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r0 = r2.A07
            r0.setVisibility(r1)
            X.Mei r0 = r5.getDiscoverySurfaceViewModel()
            X.05A r2 = r0.A03
        L91:
            java.lang.Object r1 = r2.getValue()
            r0 = 21
            X.MtK r0 = X.AbstractC25225BEi.A0d(r6, r7, r0)
            boolean r0 = r2.AIi(r1, r0)
            if (r0 == 0) goto L91
        La1:
            r5.logTemplateImpression()
            return
        La5:
            r2 = r4
            goto L57
        La7:
            r1 = r4
            goto L47
        La9:
            r3 = r4
            goto L3f
        Lab:
            r3 = r4
            goto L39
        Lad:
            r2 = r4
            goto L1f
        Lb0:
            r2 = r4
            goto L19
        Lb3:
            X.Mei r0 = r5.getDiscoverySurfaceViewModel()
            X.0UO r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto Ld7
            if (r3 == 0) goto Lcc
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r3.A08
            r1 = 4
            r0.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r0 = r3.A07
            r0.setVisibility(r1)
        Lcc:
            X.Mei r0 = r5.getDiscoverySurfaceViewModel()
            X.05A r1 = r0.A03
            r0 = 0
            r1.Egh(r0)
            return
        Ld7:
            r5.updateVideoPlayState(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.storiestemplate.discovery.view.StoryTemplateDiscoverySurfaceFragment.updateActiveViewHolder(int, int):void");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1941087840);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.story_template_discovery_surface_layout, viewGroup, false);
        C0f9.A09(528364222, A02);
        return inflate;
    }

    public static final /* synthetic */ void access$launchCreation(StoryTemplateDiscoverySurfaceFragment storyTemplateDiscoverySurfaceFragment) {
        storyTemplateDiscoverySurfaceFragment.launchCreation();
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }
}
