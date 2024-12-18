package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.CreatorViewerBottomCTA;
import com.instagram.api.schemas.CreatorViewerBottomCTAType;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.save.api.SaveApiUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HC2 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "CreatorViewerInsightsRecipeSheetFragment";
    public RecyclerView A00;
    public C38367Gu3 A01;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final InterfaceC60442pS A02 = AbstractC60952qJ.A01("ig_lumen_recipe_sheet", true, false);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_lumen_recipe_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String string;
        InterfaceC09390do interfaceC09390do;
        C38321qM A0F;
        List Bl2;
        JMS jms;
        String str;
        Long A0k;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            i = bundle2.getInt("media_position");
        } else {
            i = -1;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && (string = bundle3.getString("media_id")) != null && (A0F = AbstractC37304Gc5.A0F(string, (interfaceC09390do = this.A03))) != null && (Bl2 = A0F.A0C.Bl2()) != null && (jms = (JMS) AbstractC001800i.A0O(Bl2, 0)) != null) {
            RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.recipe_sheet_insights_recycler_view);
            this.A00 = A0G;
            if (A0G != null) {
                AbstractC31177DnL.A0s(requireContext(), A0G);
                C38367Gu3 c38367Gu3 = this.A01;
                if (c38367Gu3 == null) {
                    str = "insightsAdapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                A0G.setAdapter(c38367Gu3);
            }
            C38367Gu3 c38367Gu32 = this.A01;
            str = "insightsAdapter";
            if (c38367Gu32 != null) {
                List BxN = jms.BxN();
                C14360o3.A0B(BxN, 0);
                ArrayList arrayList = c38367Gu32.A04;
                arrayList.clear();
                arrayList.addAll(BxN);
                c38367Gu32.notifyItemRangeChanged(0, BxN.size());
                C38367Gu3 c38367Gu33 = this.A01;
                if (c38367Gu33 != null) {
                    c38367Gu33.A00 = A0F;
                    C64P c64p = (C64P) AbstractC166997dE.A0R(view, R.id.recipe_sheet_cta_layout);
                    List AhY = jms.AhY();
                    CreatorViewerBottomCTA creatorViewerBottomCTA = (CreatorViewerBottomCTA) AbstractC001800i.A0O(AhY, 0);
                    if (creatorViewerBottomCTA != null) {
                        c64p.setPrimaryAction(A00(creatorViewerBottomCTA, A0F), new ViewOnClickListenerC42006Ijb(i, 2, creatorViewerBottomCTA, jms, A0F, c64p, this));
                    }
                    CreatorViewerBottomCTA creatorViewerBottomCTA2 = (CreatorViewerBottomCTA) AbstractC001800i.A0O(AhY, 1);
                    if (creatorViewerBottomCTA2 != null) {
                        c64p.setSecondaryAction(A00(creatorViewerBottomCTA2, A0F), new ViewOnClickListenerC42006Ijb(i, 3, creatorViewerBottomCTA2, jms, A0F, c64p, this));
                    }
                    AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                    List BxN2 = jms.BxN();
                    AbstractC167007dF.A1E(A0o, 1, BxN2);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, A0o), "ig_lumen_recipe_sheet_overflow_impression");
                    String A2u = A0F.A2u();
                    if (A2u != null && (A0k = AbstractC003100w.A0k(10, A2u)) != null && A0f.isSampled()) {
                        ArrayList A0i = AbstractC167007dF.A0i(BxN2);
                        Iterator it = BxN2.iterator();
                        while (it.hasNext()) {
                            AbstractC37303Gc4.A0x(new C0Zx(), (CreatorViewerSignalModel) it.next(), A0i);
                        }
                        AbstractC37303Gc4.A0l(A0f, A0k, BxN2);
                        AbstractC37303Gc4.A0h(A0f, A0F, "ig_lumen_recipe_sheet", A0i);
                        AbstractC31176DnK.A1I(A0f);
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    private final String A00(CreatorViewerBottomCTA creatorViewerBottomCTA, C38321qM c38321qM) {
        EnumC77213d7 enumC77213d7;
        if (c38321qM.CcN()) {
            enumC77213d7 = EnumC77213d7.A03;
        } else {
            enumC77213d7 = EnumC77213d7.A04;
        }
        EnumC77213d7 enumC77213d72 = EnumC77213d7.A03;
        Context requireContext = requireContext();
        int i = 2131971564;
        if (enumC77213d7 == enumC77213d72) {
            i = 2131971567;
        }
        String A0u = AbstractC25227BEk.A0u(requireContext, i);
        if (creatorViewerBottomCTA.AhZ() != CreatorViewerBottomCTAType.A05) {
            return creatorViewerBottomCTA.getText();
        }
        return A0u;
    }

    public static final void A01(CreatorViewerBottomCTAType creatorViewerBottomCTAType, JMS jms, C38321qM c38321qM, IgdsBottomButtonLayout igdsBottomButtonLayout, HC2 hc2, int i, boolean z) {
        AbstractC12990ll A0o;
        List BxN;
        CreatorViewerBottomCTAType creatorViewerBottomCTAType2;
        Long A0k;
        EnumC77213d7 enumC77213d7;
        int ordinal = creatorViewerBottomCTAType.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 0) {
                    throw B4Z.A00();
                }
                return;
            }
            if (c38321qM.CcN()) {
                enumC77213d7 = EnumC77213d7.A03;
            } else {
                enumC77213d7 = EnumC77213d7.A04;
            }
            EnumC77213d7 enumC77213d72 = EnumC77213d7.A04;
            Context requireContext = hc2.requireContext();
            int i2 = 2131971564;
            if (enumC77213d7 == enumC77213d72) {
                i2 = 2131971567;
            }
            String A0u = AbstractC25227BEk.A0u(requireContext, i2);
            if (z) {
                igdsBottomButtonLayout.setPrimaryActionText(A0u);
            } else {
                igdsBottomButtonLayout.setSecondaryActionText(A0u);
            }
            InterfaceC60442pS interfaceC60442pS = hc2.A02;
            FragmentActivity requireActivity = hc2.requireActivity();
            InterfaceC09390do interfaceC09390do = hc2.A03;
            SaveApiUtil.A05(requireActivity, hc2.requireContext(), AbstractC166987dD.A0r(interfaceC09390do), c38321qM, interfaceC60442pS, enumC77213d7, i);
            if (enumC77213d7 == enumC77213d72) {
                AbstractC35184Ffb.A00(hc2.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), c38321qM, interfaceC60442pS, new C75113Zb(), null, null, "single_tap", i, false);
                A0o = AbstractC166987dD.A0o(interfaceC09390do);
                BxN = jms.BxN();
                creatorViewerBottomCTAType2 = CreatorViewerBottomCTAType.A05;
            } else {
                return;
            }
        } else {
            C22P c22p = C22P.A3N;
            FragmentActivity requireActivity2 = hc2.requireActivity();
            InterfaceC09390do interfaceC09390do2 = hc2.A03;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do2);
            C120985dq A02 = C128085qc.A02(c38321qM);
            INH A04 = AbstractC41770Iem.A04(c22p, A02, AbstractC166987dD.A0r(interfaceC09390do2));
            interfaceC09390do2.getValue();
            INH A0C = AbstractC86593tX.A0C(c22p);
            if (A04 == null) {
                A04 = A0C;
            }
            A04.A0V = A02.A0D();
            A04.A0W = A02.A0Q;
            A04.A0m = true;
            AbstractC41671Ic3.A00(requireActivity2, A04.A00(), hc2, c22p, A0r);
            A0o = AbstractC166987dD.A0o(interfaceC09390do2);
            BxN = jms.BxN();
            creatorViewerBottomCTAType2 = CreatorViewerBottomCTAType.A04;
        }
        AbstractC167007dF.A1E(A0o, 1, BxN);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(hc2, A0o), "ig_lumen_recipe_sheet_overflow_button_tap");
        String A2u = c38321qM.A2u();
        if (A2u != null && (A0k = AbstractC003100w.A0k(10, A2u)) != null && A0f.isSampled()) {
            ArrayList A0i = AbstractC167007dF.A0i(BxN);
            Iterator it = BxN.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A0x(new C0Zx(), (CreatorViewerSignalModel) it.next(), A0i);
            }
            AbstractC37303Gc4.A0l(A0f, A0k, BxN);
            AbstractC37303Gc4.A0h(A0f, c38321qM, hc2.getModuleName(), A0i);
            AbstractC25232BEp.A1L(A0f, "button_text_enum", creatorViewerBottomCTAType2.toString());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1668971050);
        super.onCreate(bundle);
        this.A01 = new C38367Gu3(this, AbstractC166987dD.A0r(this.A03), this);
        C0f9.A09(-1750575941, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1032138264);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_creator_viewer_insights_recipe_sheet_fragment, viewGroup, false);
        C0f9.A09(-819847387, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-422338544);
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(747811578, A02);
    }
}
