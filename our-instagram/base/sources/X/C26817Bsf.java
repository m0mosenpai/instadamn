package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository;

/* renamed from: X.Bsf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26817Bsf extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatorAiPreparationFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(false);
        interfaceC56362iU.setTitle("");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "creator_ai_preparation_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C26900Bu3 c26900Bu3 = (C26900Bu3) this.A02.getValue();
        CreatorAIAgentCreationRepository creatorAIAgentCreationRepository = c26900Bu3.A00;
        if (creatorAIAgentCreationRepository.A00 == null) {
            C40701ud c40701ud = creatorAIAgentCreationRepository.A04;
            C1Dk freshCacheAgeMs = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "CreatorAIAgentCreationProgressLiveQuery", AbstractC25225BEi.A0b().getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59276Qbm.class, false, PandoRealtimeInfoJNI.forLiveQuery("ig_creator_ai_import_progress"), 0, null, "me", AbstractC166987dD.A1E()).setMaxToleratedCacheAgeMs(0L).setFreshCacheAgeMs(0L);
            creatorAIAgentCreationRepository.A00 = c40701ud.A01(new C28909CpI(creatorAIAgentCreationRepository, 3), new C28911CpL(creatorAIAgentCreationRepository, 1), freshCacheAgeMs);
        }
        C141796aw A00 = AbstractC141776au.A00(c26900Bu3);
        D4z A02 = D4z.A02(c26900Bu3, null, 36);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, A02, A00);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new C50122MBw(viewLifecycleOwner, c07s, this, null, 23), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A00(C26817Bsf c26817Bsf) {
        BP5 bp5 = (BP5) c26817Bsf.A00.getValue();
        bp5.A04(C8p.A0c, bp5.A00);
        C36861nj A00 = AbstractC34103F3f.A00();
        Context requireContext = c26817Bsf.requireContext();
        c26817Bsf.A01.getValue();
        A00.A00(requireContext, c26817Bsf, "all");
        AbstractC25231BEo.A16(c26817Bsf);
        CreatorAIAgentCreationRepository creatorAIAgentCreationRepository = ((C26900Bu3) c26817Bsf.A02.getValue()).A00;
        AbstractC166987dD.A1Z(new MBo(creatorAIAgentCreationRepository, null, 12), ((C4A7) creatorAIAgentCreationRepository).A01);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public C26817Bsf() {
        C29911DGz A01 = C29911DGz.A01(this, 33);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C29911DGz.A01(C29911DGz.A01(this, 30), 31));
        this.A02 = AbstractC25225BEi.A0a(C29911DGz.A01(A00, 32), A01, new C29894DGi(24, A00, null), AbstractC25225BEi.A1D(C26900Bu3.class));
        this.A00 = C29911DGz.A00(this, 29);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A00(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-763007193);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 33), 1570215955);
        C0f9.A09(406503956, A02);
        return A00;
    }
}
