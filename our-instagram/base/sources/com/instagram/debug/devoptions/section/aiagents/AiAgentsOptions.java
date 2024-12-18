package com.instagram.debug.devoptions.section.aiagents;

import X.AbstractC018607g;
import X.AbstractC111324zv;
import X.AbstractC162267Oo;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC23021Ah;
import X.AbstractC25225BEi;
import X.AbstractC28057CYl;
import X.AbstractC37304Gc5;
import X.AbstractC40691uc;
import X.AbstractC59962oe;
import X.AnonymousClass436;
import X.C0f9;
import X.C14360o3;
import X.C2JM;
import X.C59367QdP;
import X.C9GR;
import X.EnumC27387C6q;
import X.FF9;
import X.GHY;
import X.InterfaceC19610xo;
import X.InterfaceC48192Ji;
import X.InterfaceC48212Jk;
import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.metaai.shared.nux.service.MetaAINuxNetworkService;
import java.util.List;

/* loaded from: classes7.dex */
public final class AiAgentsOptions implements DeveloperOptionsSection {
    public static final AiAgentsOptions INSTANCE = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetAiAgentsCharacterNuxOnServer(UserSession userSession, final Context context) {
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A04("nux_type", AbstractC111324zv.A00(1649));
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "ConsentStatusResetMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59367QdP.class, true, null, 0, null, "xfb_messenger_gen_ai_nux_consent_status_reset", AbstractC166987dD.A1E());
        AbstractC40691uc.A01(userSession).ATV(new InterfaceC48212Jk() { // from class: com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions$resetAiAgentsCharacterNuxOnServer$2
            @Override // X.InterfaceC48212Jk
            public final void invoke(Throwable th) {
                C9GR.A0F(context, th.toString(), 2131957809);
            }
        }, new InterfaceC48192Ji() { // from class: com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions$resetAiAgentsCharacterNuxOnServer$1
            @Override // X.InterfaceC48192Ji
            public final void invoke(AnonymousClass436 anonymousClass436) {
                C9GR.A07(context, 2131957810);
            }
        }, pandoGraphQLRequest);
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC16960so.A1Q(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(2139106116);
                AbstractC162267Oo.A00(UserSession.this, false);
                C9GR.A07(fragmentActivity, 2131957808);
                C0f9.A0C(500400929, A05);
            }
        }, fragmentActivity.getString(2131957804)), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions$getItems$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(299156787);
                AbstractC162267Oo.A01(UserSession.this, false);
                AiAgentsOptions.INSTANCE.resetAiAgentsCharacterNuxOnServer(UserSession.this, fragmentActivity);
                C0f9.A0C(163712125, A05);
            }
        }, fragmentActivity.getString(2131957803)), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions$getItems$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1036761966);
                InterfaceC19610xo ARD = new FF9(UserSession.this).A00.ARD();
                ARD.E77(AbstractC111324zv.A00(1056), false);
                ARD.apply();
                C9GR.A07(fragmentActivity, 2131957808);
                C0f9.A0C(-275825764, A05);
            }
        }, fragmentActivity.getString(2131957807)), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions$getItems$4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1197791060);
                UserSession userSession2 = UserSession.this;
                AbstractC23021Ah.A00(userSession2).A11(AbstractC111324zv.A00(5515), AbstractC37304Gc5.A02(userSession2));
                C9GR.A07(fragmentActivity, 2131957808);
                C0f9.A0C(-521974578, A05);
            }
        }, fragmentActivity.getString(2131957814)), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions$getItems$5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1845281853);
                UserSession userSession2 = UserSession.this;
                AbstractC23021Ah.A00(userSession2).A11(AbstractC111324zv.A00(5514), AbstractC37304Gc5.A02(userSession2));
                C9GR.A07(fragmentActivity, 2131957808);
                C0f9.A0C(-41389459, A05);
            }
        }, fragmentActivity.getString(2131957813)), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions$getItems$6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(233003672);
                UserSession userSession2 = UserSession.this;
                AbstractC23021Ah.A00(userSession2).A11(AbstractC111324zv.A00(4645), AbstractC37304Gc5.A02(userSession2));
                C9GR.A07(fragmentActivity, 2131957808);
                C0f9.A0C(1743880625, A05);
            }
        }, fragmentActivity.getString(2131957805)), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions$getItems$7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1989380060);
                UserSession userSession2 = UserSession.this;
                AbstractC23021Ah.A00(userSession2).A11(AbstractC111324zv.A00(4646), AbstractC37304Gc5.A02(userSession2));
                C9GR.A07(fragmentActivity, 2131957808);
                C0f9.A0C(-690642413, A05);
            }
        }, fragmentActivity.getString(2131957806)), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions$getItems$8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(2134088075);
                UserSession userSession2 = UserSession.this;
                AbstractC23021Ah.A00(userSession2).A11(AbstractC111324zv.A00(5512), AbstractC37304Gc5.A02(userSession2));
                C9GR.A07(fragmentActivity, 2131957808);
                C0f9.A0C(1932819470, A05);
            }
        }, fragmentActivity.getString(2131957811)), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions$getItems$9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-916332696);
                UserSession userSession2 = UserSession.this;
                AbstractC23021Ah.A00(userSession2).A11(AbstractC111324zv.A00(5513), AbstractC37304Gc5.A02(userSession2));
                C9GR.A07(fragmentActivity, 2131957808);
                C0f9.A0C(-733837171, A05);
            }
        }, fragmentActivity.getString(2131957812)), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions$getItems$10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(163554279);
                UserSession userSession2 = UserSession.this;
                AbstractC23021Ah.A00(userSession2).A11(AbstractC111324zv.A00(5516), AbstractC37304Gc5.A02(userSession2));
                C9GR.A07(fragmentActivity, 2131957808);
                C0f9.A0C(-228258849, A05);
            }
        }, fragmentActivity.getString(2131957815)), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions$getItems$11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1407746152);
                Application application = FragmentActivity.this.getApplication();
                C14360o3.A07(application);
                IgMetaSessionImpl A01 = AbstractC28057CYl.A01(userSession);
                for (Object obj : EnumC27387C6q.A00) {
                    new MetaAINuxNetworkService(application, A01);
                    String obj2 = obj.toString();
                    C14360o3.A0B(obj2, 0);
                    application.getSharedPreferences("MetaAINuxImpressionCache", 0).edit().putBoolean(obj2, false).commit();
                }
                C9GR.A07(FragmentActivity.this, 2131957802);
                C0f9.A0C(671107718, A05);
            }
        }, fragmentActivity.getString(2131957802)), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions$getItems$12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-270701917);
                UserSession userSession2 = UserSession.this;
                AbstractC23021Ah.A00(userSession2).A11(AbstractC111324zv.A00(5517), AbstractC37304Gc5.A02(userSession2));
                C9GR.A07(fragmentActivity, 2131957808);
                C0f9.A0C(-585385457, A05);
            }
        }, fragmentActivity.getString(2131957816)), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions$getItems$13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(354904591);
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 0);
                AbstractC23021Ah.A00(userSession2).A13(AbstractC111324zv.A00(3865), false);
                AbstractC23021Ah.A00(userSession2).A13(AbstractC111324zv.A00(3864), false);
                AbstractC23021Ah.A00(userSession2).A13("ai_agent_character_disclaimer_server_flag", false);
                C9GR.A07(fragmentActivity, 2131957808);
                C0f9.A0C(-859839341, A05);
            }
        }, fragmentActivity.getString(2131957801)));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131957817;
    }
}
