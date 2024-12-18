package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ElectionAddYoursInfoDictIntf;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.api.schemas.StoryTemplateDictIntf;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.X2b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71765X2b extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final int A01 = 1;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71765X2b(C50920Mep c50920Mep, OCN ocn, UpcomingEvent upcomingEvent, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = c50920Mep;
        this.A03 = ocn;
        this.A05 = z;
        this.A02 = upcomingEvent;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A01 != 0) {
            C38321qM c38321qM = (C38321qM) this.A03;
            boolean z = this.A05;
            UserSession userSession = (UserSession) this.A04;
            return new C71765X2b((InterfaceC40821up) this.A00, (C1P1) this.A02, userSession, c38321qM, interfaceC23621Ds, z);
        }
        C71765X2b c71765X2b = new C71765X2b((C50920Mep) this.A04, (OCN) this.A03, (UpcomingEvent) this.A02, interfaceC23621Ds, this.A05);
        c71765X2b.A00 = obj;
        return c71765X2b;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C71765X2b) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object value;
        C51736MtJ c51736MtJ;
        InterfaceC109364wL interfaceC109364wL;
        StoryPromptTappableDataIntf Bii;
        Object A00;
        StoryPromptTappableData storyPromptTappableData;
        SubscriptionStickerDict subscriptionStickerDict;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        String str;
        if (this.A01 != 0) {
            AbstractC09560e7.A00(obj);
            C38321qM c38321qM = (C38321qM) this.A03;
            Boolean valueOf = Boolean.valueOf(this.A05);
            List C1y = c38321qM.A0C.C1y();
            if (C1y != null && C1y.size() == 1 && (Bii = (interfaceC109364wL = (InterfaceC109364wL) C1y.get(0)).Bii()) != null) {
                C69669VtA AKZ = Bii.AKZ();
                AKZ.A0G = valueOf;
                TreeUpdaterJNI treeUpdaterJNI6 = null;
                AbstractC37302Gc3.A0n();
                StoryPromptTappableDataIntf storyPromptTappableDataIntf = AKZ.A0S;
                if (storyPromptTappableDataIntf instanceof ImmutablePandoStoryPromptTappableData) {
                    C09530e4[] c09530e4Arr = new C09530e4[28];
                    C09530e4 c09530e4 = new C09530e4("background_color", AKZ.A0L);
                    StoryPromptDisablementState storyPromptDisablementState = AKZ.A03;
                    C14360o3.A0B(storyPromptDisablementState, 0);
                    C09530e4 c09530e42 = new C09530e4("disablement_state", storyPromptDisablementState.A00);
                    ElectionAddYoursInfoDictIntf electionAddYoursInfoDictIntf = AKZ.A01;
                    if (electionAddYoursInfoDictIntf != null) {
                        treeUpdaterJNI = electionAddYoursInfoDictIntf.F7o();
                    } else {
                        treeUpdaterJNI = null;
                    }
                    C09530e4 c09530e43 = new C09530e4("election_add_yours_info", treeUpdaterJNI);
                    List list = AKZ.A0R;
                    ArrayList A0q = AbstractC167017dG.A0q(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AbstractC31178DnM.A1U(A0q, it);
                    }
                    C09530e4 c09530e44 = new C09530e4("facepile_top_participants", A0q);
                    GenAIToolInfoDictIntf genAIToolInfoDictIntf = AKZ.A02;
                    if (genAIToolInfoDictIntf != null) {
                        treeUpdaterJNI2 = genAIToolInfoDictIntf.F7o();
                    } else {
                        treeUpdaterJNI2 = null;
                    }
                    C09530e4 c09530e45 = new C09530e4(AbstractC111324zv.A00(960), treeUpdaterJNI2);
                    C09530e4 c09530e46 = new C09530e4("has_participated", AKZ.A09);
                    C09530e4 c09530e47 = new C09530e4(PublicKeyCredentialControllerUtility.JSON_KEY_ID, AKZ.A0M);
                    C09530e4 c09530e48 = new C09530e4("is_before_and_after", AKZ.A0A);
                    C09530e4 c09530e49 = new C09530e4("is_clips_v2_media", AKZ.A0B);
                    C09530e4 c09530e410 = new C09530e4("is_created_from_add_yours_browsing", AKZ.A0C);
                    C09530e4 c09530e411 = new C09530e4("is_from_add_yours_camera_tool", AKZ.A0D);
                    C09530e4 c09530e412 = new C09530e4("is_icon_disabled", AKZ.A0E);
                    C09530e4 c09530e413 = new C09530e4("is_original_prompt_media", AKZ.A0F);
                    C09530e4 c09530e414 = new C09530e4("is_pinned_by_creator", AKZ.A0G);
                    C09530e4 c09530e415 = new C09530e4("is_speakeasy", AKZ.A0H);
                    C09530e4 c09530e416 = new C09530e4("is_story_trending_prompt", AKZ.A0I);
                    C09530e4 c09530e417 = new C09530e4("is_trending_prompt", AKZ.A0J);
                    C09530e4 c09530e418 = new C09530e4("is_viewer_original_author", AKZ.A0K);
                    C09530e4 c09530e419 = new C09530e4("media_id", AKZ.A0N);
                    User user = AKZ.A08;
                    if (user != null) {
                        treeUpdaterJNI3 = user.A07();
                    } else {
                        treeUpdaterJNI3 = null;
                    }
                    C09530e4 c09530e420 = new C09530e4("original_author", treeUpdaterJNI3);
                    C09530e4 c09530e421 = new C09530e4("participant_count", Integer.valueOf(AKZ.A00));
                    StoryPromptParticipationFrictionInfoDict storyPromptParticipationFrictionInfoDict = AKZ.A05;
                    if (storyPromptParticipationFrictionInfoDict != null) {
                        treeUpdaterJNI4 = storyPromptParticipationFrictionInfoDict.F7o();
                    } else {
                        treeUpdaterJNI4 = null;
                    }
                    C09530e4 c09530e422 = new C09530e4(AbstractC111324zv.A00(2856), treeUpdaterJNI4);
                    StoryPromptFailureTooltipDictIntf storyPromptFailureTooltipDictIntf = AKZ.A04;
                    if (storyPromptFailureTooltipDictIntf != null) {
                        treeUpdaterJNI5 = storyPromptFailureTooltipDictIntf.F7o();
                    } else {
                        treeUpdaterJNI5 = null;
                    }
                    C09530e4 c09530e423 = new C09530e4("prompt_failure_tooltip", treeUpdaterJNI5);
                    C09530e4 c09530e424 = new C09530e4("prompt_style", AKZ.A0O);
                    StoryPromptType storyPromptType = AKZ.A06;
                    if (storyPromptType != null) {
                        str = storyPromptType.A00;
                    } else {
                        str = null;
                    }
                    C09530e4 c09530e425 = new C09530e4("prompt_type", str);
                    C09530e4 c09530e426 = new C09530e4("sticker_style_str", AKZ.A0P);
                    StoryTemplateDictIntf storyTemplateDictIntf = AKZ.A07;
                    if (storyTemplateDictIntf != null) {
                        treeUpdaterJNI6 = storyTemplateDictIntf.F7o();
                    }
                    System.arraycopy(new C09530e4[]{c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, c09530e46, c09530e47, c09530e48, c09530e49, c09530e410, c09530e411, c09530e412, c09530e413, c09530e414, c09530e415, c09530e416, c09530e417, c09530e418, c09530e419, c09530e420, c09530e421, c09530e422, c09530e423, c09530e424, c09530e425, c09530e426, new C09530e4("story_template", treeUpdaterJNI6)}, 0, c09530e4Arr, 0, 27);
                    System.arraycopy(AbstractC25230BEn.A1b("text", AKZ.A0Q), 0, c09530e4Arr, 27, 1);
                    A00 = AbstractC37303Gc4.A06(storyPromptTappableDataIntf, c09530e4Arr);
                } else {
                    A00 = AKZ.A00();
                }
                InterfaceC38831rF interfaceC38831rF = c38321qM.A0C;
                C69488VoB AKa = interfaceC109364wL.AKa();
                AKa.A01 = (StoryPromptTappableDataIntf) A00;
                C1DY c1dy = new C1DY((C1DV) new C37761pD(null), 6, false);
                String str2 = AKa.A0G;
                String str3 = AKa.A0H;
                String str4 = AKa.A0I;
                String str5 = AKa.A0J;
                Float f = AKa.A03;
                Float f2 = AKa.A04;
                String str6 = AKa.A0K;
                Integer num = AKa.A0B;
                Integer num2 = AKa.A0C;
                Integer num3 = AKa.A0D;
                Integer num4 = AKa.A0E;
                String str7 = AKa.A0L;
                StoryPromptTappableDataIntf storyPromptTappableDataIntf2 = AKa.A01;
                if (storyPromptTappableDataIntf2 != null) {
                    storyPromptTappableData = storyPromptTappableDataIntf2.F1L(c1dy);
                } else {
                    storyPromptTappableData = null;
                }
                Float f3 = AKa.A05;
                Float f4 = AKa.A06;
                Integer num5 = AKa.A0F;
                SubscriptionStickerDictIntf subscriptionStickerDictIntf = AKa.A02;
                if (subscriptionStickerDictIntf != null) {
                    subscriptionStickerDict = subscriptionStickerDictIntf.F2W(c1dy);
                } else {
                    subscriptionStickerDict = null;
                }
                java.util.Set singleton = Collections.singleton(new C109354wK(AKa.A00, storyPromptTappableData, subscriptionStickerDict, f, f2, f3, f4, AKa.A07, AKa.A08, AKa.A09, AKa.A0A, num, num2, num3, num4, num5, str2, str3, str4, str5, str6, str7));
                C14360o3.A07(singleton);
                interfaceC38831rF.Eew(AbstractC001800i.A0a(singleton));
            }
            c38321qM.AEH((AbstractC12990ll) this.A04);
            C1P1 c1p1 = (C1P1) this.A02;
            if (c1p1 != null) {
                c1p1.onSuccess(this.A00);
            }
        } else {
            AbstractC09560e7.A00(obj);
            C19L c19l = (C19L) this.A00;
            C50920Mep c50920Mep = (C50920Mep) this.A04;
            C05A c05a = c50920Mep.A04;
            boolean z = this.A05;
            do {
                value = c05a.getValue();
                c51736MtJ = (C51736MtJ) value;
            } while (!c05a.AIi(value, C51736MtJ.A00(c51736MtJ.A01, C05F.A0C, c51736MtJ.A03, c51736MtJ.A04, c51736MtJ.A00, z, c51736MtJ.A06)));
            c50920Mep.A01.A03(new PIS(c50920Mep, (UpcomingEvent) this.A02, z), (OCN) this.A03, c19l);
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71765X2b(InterfaceC40821up interfaceC40821up, C1P1 c1p1, UserSession userSession, C38321qM c38321qM, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A03 = c38321qM;
        this.A05 = z;
        this.A04 = userSession;
        this.A02 = c1p1;
        this.A00 = interfaceC40821up;
    }
}
