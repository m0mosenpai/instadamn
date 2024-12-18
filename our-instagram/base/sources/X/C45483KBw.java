package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.facebook.R;
import com.instagram.api.schemas.StoryTrendingPromptSubType;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KBw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45483KBw extends AbstractC59962oe implements InterfaceC60122ou, InterfaceC144946gE {
    public static final String __redex_internal_original_name = "DiscoverTrendingPromptsFragment";
    public long A00;
    public RecyclerView A01;
    public C66362zD A02;
    public C57112jm A03;
    public SpinnerImageView A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;

    @Override // X.InterfaceC144946gE
    public final void DGU(H6G h6g, Reel reel, InterfaceC58290Psi interfaceC58290Psi, List list, int i) {
        C14360o3.A0B(reel, 0);
        C38E c38e = (C38E) this.A08.getValue();
        c38e.A05 = new C31559Dtj(requireActivity(), interfaceC58290Psi.Ahl(), (InterfaceC63982vJ) null, C05F.A01);
        c38e.A0C = AbstractC25225BEi.A15(this.A0A);
        c38e.A03 = (ReelViewerConfig) AbstractC166987dD.A17(this.A07);
        c38e.A07(reel, C3G2.A0U, interfaceC58290Psi, list, list, 0);
    }

    @Override // X.InterfaceC144946gE
    public final void Dc8(H6G h6g, PromptStickerModel promptStickerModel, int i) {
        StoryTrendingPromptSubType storyTrendingPromptSubType;
        C14360o3.A0B(promptStickerModel, 0);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            LHI.A00(activity, C22P.A0G, AbstractC166987dD.A0r(this.A09), promptStickerModel);
            L7P l7p = (L7P) this.A06.getValue();
            long j = this.A00;
            Integer num = C05F.A0C;
            String str = promptStickerModel.A03;
            if (h6g != null) {
                storyTrendingPromptSubType = h6g.A00;
            } else {
                storyTrendingPromptSubType = null;
            }
            l7p.A00(storyTrendingPromptSubType, (EnumC33440EqC) this.A05.getValue(), num, str, promptStickerModel.A05(), "", i, j);
        }
    }

    @Override // X.InterfaceC144946gE
    public final void Dc9(H6G h6g, PromptStickerModel promptStickerModel, int i) {
        C14360o3.A0B(promptStickerModel, 0);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            UserSession A0r = AbstractC166987dD.A0r(this.A09);
            String A05 = promptStickerModel.A05();
            String A15 = AbstractC25225BEi.A15(this.A0A);
            InterfaceC09390do interfaceC09390do = this.A0C;
            StoryTrendingPromptSubType storyTrendingPromptSubType = null;
            AbstractC54892OPn.A00(activity, C22P.A0G, this, A0r, null, null, null, null, promptStickerModel, null, A05, A15, AbstractC25225BEi.A15(interfaceC09390do), C16930sl.A00);
            L7P l7p = (L7P) this.A06.getValue();
            Integer num = C05F.A01;
            long j = this.A00;
            String str = promptStickerModel.A03;
            if (h6g != null) {
                storyTrendingPromptSubType = h6g.A00;
            }
            l7p.A00(storyTrendingPromptSubType, (EnumC33440EqC) this.A05.getValue(), num, str, promptStickerModel.A05(), AbstractC25225BEi.A15(interfaceC09390do), 0, j);
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131960989);
        interfaceC56362iU.EkS(true);
        C3LO c3lo = new C3LO();
        c3lo.A06 = R.drawable.instagram_info_pano_outline_24;
        c3lo.A0P = true;
        c3lo.A02 = requireContext().getColor(AbstractC53242c7.A07(getContext()));
        c3lo.A05 = 2131964503;
        AbstractC31176DnK.A1B(new ViewOnClickListenerC48073LPy(this, 5), c3lo, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "discover_trending_prompts_fragment";
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        L7P l7p = (L7P) this.A06.getValue();
        String A15 = AbstractC25225BEi.A15(this.A0C);
        InterfaceC09390do interfaceC09390do = this.A05;
        Object value = interfaceC09390do.getValue();
        String A14 = AbstractC25225BEi.A14();
        if (A14 != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(l7p.A02), "igye_prompts_surface_appear");
            AbstractC25225BEi.A1N(A0f, A14);
            A0f.AAP(AbstractC111324zv.A00(2322), "");
            A0f.AAP("session_instance_id", A15);
            A0f.AAP("feed_type", "trending");
            if (value != null) {
                A0f.AAP("entrypoint", value.toString());
            }
            A0f.Cht();
        }
        this.A04 = AbstractC31180DnO.A0V(view);
        this.A01 = AbstractC31176DnK.A0F(view);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0B);
        Object obj = EnumC33442EqE.A08;
        String string = requireArguments().getString(AbstractC111324zv.A00(3257));
        if (string != null) {
            Object obj2 = EnumC33442EqE.A01.get(string);
            Object obj3 = obj2;
            if (obj2 == null) {
                obj3 = obj;
            }
            obj = obj3;
        }
        String string2 = requireArguments().getString(AbstractC111324zv.A00(5510));
        String string3 = requireArguments().getString("prompt_id");
        C51756Mtf c51756Mtf = null;
        ArrayList arrayList = null;
        if (string3 != null) {
            String string4 = requireArguments().getString("author_ids");
            if (string4 != null) {
                List A0Q = AbstractC001900j.A0Q(string4, new char[]{','}, 0);
                arrayList = AbstractC167017dG.A0q(A0Q);
                Iterator it = A0Q.iterator();
                while (it.hasNext()) {
                    AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), arrayList);
                }
            }
            c51756Mtf = new C51756Mtf(AbstractC166987dD.A1J(new JWd(string3, requireArguments().getBoolean("should_be_featured"), arrayList, 1)), 20);
        }
        Object value2 = interfaceC09390do.getValue();
        C141796aw A00 = AbstractC141776au.A00(A0Z);
        C57161PZf c57161PZf = new C57161PZf(c51756Mtf, value2, A0Z, obj, string2, null, 18);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, c57161PZf, A00);
        C57112jm A01 = AbstractC57052jg.A01(null, AbstractC57052jg.A00());
        this.A03 = A01;
        C71163Hc A002 = C71163Hc.A00(this);
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null) {
            A01.A08(recyclerView, A002, new InterfaceC57142jp[0]);
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
                RecyclerView recyclerView3 = this.A01;
                if (recyclerView3 != null) {
                    C44286Jhc.A00(recyclerView3, this, 11);
                    C66392zG A0R = AbstractC31174DnI.A0R(this);
                    A0R.A01(new KIF(requireContext(), this, AbstractC166987dD.A0r(this.A09), this, false));
                    C66362zD A0R2 = AbstractC31173DnH.A0R(A0R, new Object());
                    this.A02 = A0R2;
                    RecyclerView recyclerView4 = this.A01;
                    if (recyclerView4 != null) {
                        recyclerView4.setAdapter(A0R2);
                        C07S c07s = C07S.STARTED;
                        C07X viewLifecycleOwner = getViewLifecycleOwner();
                        AbstractC23641Du.A05(anonymousClass191, new PZP(viewLifecycleOwner, c07s, this, null, 14), C07Y.A00(viewLifecycleOwner));
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC144956gF
    public final void Cif(C45213Jzt c45213Jzt) {
        StoryTrendingPromptSubType storyTrendingPromptSubType;
        L7P l7p = (L7P) this.A06.getValue();
        long j = this.A00;
        int i = c45213Jzt.A00;
        String str = c45213Jzt.A01.A0M;
        H6G h6g = c45213Jzt.A02;
        if (h6g != null) {
            storyTrendingPromptSubType = h6g.A00;
        } else {
            storyTrendingPromptSubType = null;
        }
        String A15 = AbstractC25225BEi.A15(this.A0C);
        Object value = this.A05.getValue();
        C14360o3.A0B(str, 2);
        String A14 = AbstractC25225BEi.A14();
        if (A14 != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(l7p.A02), "igye_prompts_surface_component_impression");
            AbstractC25225BEi.A1N(A0f, A14);
            A0f.AAP("component_id", str);
            A0f.A9K("component_position", AbstractC31171DnF.A0V(i));
            A0f.AAP("component_type", "story");
            A0f.AAP("session_instance_id", A15);
            A0f.AAP("feed_type", "trending");
            A0f.A9K("num_media_loaded", Long.valueOf(j));
            A0f.AAP("component_subtype", String.valueOf(storyTrendingPromptSubType));
            if (value != null) {
                A0f.AAP("entrypoint", value.toString());
            }
            A0f.Cht();
        }
    }

    @Override // X.InterfaceC144956gF
    public final void DeR(View view, C59062n7 c59062n7) {
        C57112jm c57112jm = this.A03;
        if (c57112jm == null) {
            C14360o3.A0F("viewpointManager");
            throw C00O.createAndThrow();
        }
        c57112jm.A05(view, c59062n7);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    public C45483KBw() {
        C50164MDr c50164MDr = new C50164MDr(this, 17);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50164MDr(new C50164MDr(this, 13), 14));
        this.A0B = AbstractC25225BEi.A0a(new C50164MDr(A00, 15), c50164MDr, new C57251PbZ(46, null, A00), AbstractC25225BEi.A1D(C44482Jlo.class));
        this.A06 = C1XM.A00(new C50164MDr(this, 11));
        this.A0C = C1XM.A00(new C50164MDr(this, 18));
        this.A0A = C1XM.A00(new C50164MDr(this, 16));
        this.A05 = C1XM.A00(new C50164MDr(this, 10));
        this.A08 = C1XM.A00(new C50164MDr(this, 12));
        this.A07 = C1XM.A00(MH0.A00);
        this.A09 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1364266922);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_trending_prompts_fragment, false);
        C0f9.A09(410936131, A02);
        return A0R;
    }
}
