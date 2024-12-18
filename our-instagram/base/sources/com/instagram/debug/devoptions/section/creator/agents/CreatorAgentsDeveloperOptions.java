package com.instagram.debug.devoptions.section.creator.agents;

import X.AbstractC002300n;
import X.AbstractC018607g;
import X.AbstractC06930Yk;
import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC23021Ah;
import X.AbstractC35275FhA;
import X.AbstractC59962oe;
import X.C0YR;
import X.C0f9;
import X.C16910sj;
import X.C23031Ai;
import X.C37321oV;
import X.C7Uo;
import X.GHY;
import X.InterfaceC11380iw;
import X.InterfaceC16530ry;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class CreatorAgentsDeveloperOptions implements DeveloperOptionsSection {
    public static final CreatorAgentsDeveloperOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC16960so.A1Q(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.creator.agents.CreatorAgentsDeveloperOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-392577125);
                C23031Ai A00 = AbstractC23021Ah.A00(UserSession.this);
                InterfaceC16530ry interfaceC16530ry = A00.A1a;
                C0YR[] c0yrArr = C23031Ai.A8c;
                AbstractC167007dF.A1L(A00, interfaceC16530ry, c0yrArr, 387, false);
                A00.A1K(false);
                A00.A6d.Egi(A00, 0L, c0yrArr[389]);
                C0f9.A0C(-157975651, A05);
            }
        }, 2131957931), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.creator.agents.CreatorAgentsDeveloperOptions$getItems$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1743316807);
                C7Uo c7Uo = new C7Uo(UserSession.this);
                InterfaceC19630xq interfaceC19630xq = c7Uo.A01;
                Iterator it = interfaceC19630xq.getAll().keySet().iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    if (A1B != null && AbstractC002300n.A0h(A1B, "has_seen_per_creator_ai_beta_disclosure", false)) {
                        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                        ARD.EEj(A1B);
                        ARD.apply();
                    }
                }
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.EEj("last_seen_creator_ai_beta_disclosure_timestamp");
                ARD2.apply();
                c7Uo.A04();
                InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
                ARD3.E7G("ai_call_tooltip_last_seen_timestamp", 0L);
                ARD3.apply();
                InterfaceC19610xo ARD4 = interfaceC19630xq.ARD();
                ARD4.E7D(AbstractC111324zv.A00(1904), 0);
                ARD4.apply();
                C0f9.A0C(213124722, A05);
            }
        }, 2131957935), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.creator.agents.CreatorAgentsDeveloperOptions$getItems$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1256875019);
                C7Uo c7Uo = new C7Uo(UserSession.this);
                C7Uo.A03(c7Uo, AbstractC06930Yk.A0E());
                C7Uo.A02(c7Uo, AbstractC06930Yk.A0E());
                C0f9.A0C(-1821317531, A05);
            }
        }, 2131957936), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.creator.agents.CreatorAgentsDeveloperOptions$getItems$4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-608134035);
                C7Uo c7Uo = new C7Uo(UserSession.this);
                C16910sj c16910sj = C16910sj.A00;
                InterfaceC19610xo ARD = c7Uo.A01.ARD();
                ARD.E7L("creators_banner_shown_on", c16910sj);
                ARD.apply();
                C0f9.A0C(-532216953, A05);
            }
        }, 2131957932), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.creator.agents.CreatorAgentsDeveloperOptions$getItems$5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1872452799);
                final String str = "CREATOR_AI_DEV_OPTIONS";
                AbstractC35275FhA.A0D(FragmentActivity.this, new InterfaceC11380iw(str) { // from class: com.instagram.debug.devoptions.section.creator.agents.CreatorAgentsDeveloperOptions$getItems$5$analyticsModule$1
                    public final String moduleName;

                    {
                        this.moduleName = str;
                    }

                    @Override // X.InterfaceC11380iw
                    public String getModuleName() {
                        return this.moduleName;
                    }
                }, userSession, "com.bloks.www.creators_genai.reset_consent_action", "CREATOR_AI_DEV_OPTIONS", AbstractC166987dD.A1G());
                C0f9.A0C(410204359, A05);
            }
        }, 2131957933), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.creator.agents.CreatorAgentsDeveloperOptions$getItems$6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1712062964);
                final String str = "CREATOR_AI_DEV_OPTIONS";
                InterfaceC11380iw interfaceC11380iw = new InterfaceC11380iw(str) { // from class: com.instagram.debug.devoptions.section.creator.agents.CreatorAgentsDeveloperOptions$getItems$6$analyticsModule$1
                    public final String moduleName;

                    {
                        this.moduleName = str;
                    }

                    @Override // X.InterfaceC11380iw
                    public String getModuleName() {
                        return this.moduleName;
                    }
                };
                new C7Uo(UserSession.this).A04();
                UserSession userSession2 = UserSession.this;
                C37321oV.A00();
                userSession2.A03(CreatorAIFanNuxRepository.class);
                AbstractC35275FhA.A0D(fragmentActivity, interfaceC11380iw, UserSession.this, "com.bloks.www.creators_genai.reset_fan_consent_action", "CREATOR_AI_DEV_OPTIONS", AbstractC166987dD.A1G());
                C0f9.A0C(-1377023165, A05);
            }
        }, 2131957934));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131957930;
    }
}
