package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.AvatarStatus;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.api.schemas.FanClubStatusSyncInfo;
import com.instagram.api.schemas.GenAIPersonaBannersResponse;
import com.instagram.api.schemas.GroupMetadata;
import com.instagram.api.schemas.GrowthFrictionInfo;
import com.instagram.api.schemas.ProfileTheme;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.CreatorShoppingInfo;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.J8b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43204J8b extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43204J8b(C38947HCw c38947HCw, int i) {
        super(0);
        this.A00 = i;
        this.A01 = c38947HCw;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        switch (this.A00) {
            case 0:
                C38947HCw c38947HCw = (C38947HCw) this.A01;
                return new C41631IbM(c38947HCw.requireContext(), AbstractC166987dD.A0r(c38947HCw.A0I), c38947HCw.A0C, c38947HCw);
            case 1:
                C38947HCw c38947HCw2 = (C38947HCw) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c38947HCw2.A0I);
                InterfaceC60442pS interfaceC60442pS = c38947HCw2.A0C;
                String str2 = c38947HCw2.A06;
                if (str2 != null) {
                    String str3 = c38947HCw2.A05;
                    if (str3 != null) {
                        C41636IbR c41636IbR = new C41636IbR(c38947HCw2, A0r, interfaceC60442pS, EnumC39622HeW.A0V, str2, str3, null);
                        C57112jm c57112jm = c38947HCw2.A00;
                        if (c57112jm == null) {
                            str = "viewpointManager";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                        c41636IbR.A00 = c57112jm;
                        return c41636IbR.A02();
                    }
                    str = "priorModule";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "shoppingSessionId";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
                return new C39171HLz((C38947HCw) this.A01);
            case 3:
                C38947HCw c38947HCw3 = (C38947HCw) this.A01;
                FragmentActivity requireActivity = c38947HCw3.requireActivity();
                Context requireContext = c38947HCw3.requireContext();
                UserSession A0r2 = AbstractC166987dD.A0r(c38947HCw3.A0I);
                InterfaceC60442pS interfaceC60442pS2 = c38947HCw3.A0C;
                String str4 = c38947HCw3.A06;
                if (str4 != null) {
                    return AbstractC64962wu.A00(requireContext, requireActivity, null, A0r2, interfaceC60442pS2, 0, null, null, null, null, null, interfaceC60442pS2.getModuleName(), null, null, str4, true, false);
                }
                str = "shoppingSessionId";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                AbstractC22762A2g.A00();
                C38947HCw c38947HCw4 = (C38947HCw) this.A01;
                FragmentActivity requireActivity2 = c38947HCw4.requireActivity();
                UserSession A0r3 = AbstractC166987dD.A0r(c38947HCw4.A0I);
                InterfaceC60442pS interfaceC60442pS3 = c38947HCw4.A0C;
                String str5 = c38947HCw4.A05;
                if (str5 != null) {
                    String str6 = c38947HCw4.A06;
                    if (str6 != null) {
                        AbstractC167017dG.A1P(A0r3, interfaceC60442pS3);
                        IN2 in2 = new IN2(requireActivity2, A0r3, interfaceC60442pS3, str5, str6);
                        C41052IFv c41052IFv = c38947HCw4.A03;
                        if (c41052IFv == null) {
                            str = "viewModel";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                        return in2.A00(c41052IFv.A01.A00);
                    }
                    str = "shoppingSessionId";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "priorModule";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                C38947HCw c38947HCw5 = (C38947HCw) this.A01;
                FragmentActivity requireActivity3 = c38947HCw5.requireActivity();
                UserSession A0r4 = AbstractC166987dD.A0r(c38947HCw5.A0I);
                InterfaceC60442pS interfaceC60442pS4 = c38947HCw5.A0C;
                String str7 = c38947HCw5.A05;
                if (str7 != null) {
                    if (c38947HCw5.A06 != null) {
                        return new IMX(requireActivity3, A0r4, interfaceC60442pS4, str7);
                    }
                    str = "shoppingSessionId";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "priorModule";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 6:
                C38947HCw c38947HCw6 = (C38947HCw) this.A01;
                UserSession A0r5 = AbstractC166987dD.A0r(c38947HCw6.A0I);
                InterfaceC60442pS interfaceC60442pS5 = c38947HCw6.A0C;
                String str8 = c38947HCw6.A05;
                if (str8 != null) {
                    return new UpcomingEventReminderRepository(A0r5, interfaceC60442pS5, str8);
                }
                str = "priorModule";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 7:
                C38947HCw c38947HCw7 = (C38947HCw) this.A01;
                IA3.A00(c38947HCw7.requireActivity(), new C57751Pje(18, c38947HCw7.A0J.getValue(), c38947HCw7));
                return C0eB.A00;
            case 8:
                FragmentActivity fragmentActivity = ((IMT) this.A01).A00;
                Object obj = null;
                if (fragmentActivity instanceof C2d5) {
                    obj = fragmentActivity;
                }
                return new C146096i7(fragmentActivity, (C2d5) obj);
            case 9:
                AbstractC14480oK.A00((Context) this.A01);
                return C0eB.A00;
            case 10:
                C39414Hay c39414Hay = ((NY5) this.A01).A00;
                UserSession userSession = c39414Hay.A01;
                FragmentActivity fragmentActivity2 = ((AbstractC41110IIb) c39414Hay).A00;
                if (!(fragmentActivity2 instanceof Activity)) {
                    fragmentActivity2 = new FragmentActivity();
                }
                return new C41053IFw(fragmentActivity2, userSession);
            case 11:
                AbstractC41110IIb A00 = ((ILS) this.A01).A00();
                return new C146076i5(A00.A02, A00.A01, A00.A03);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                Context context = (Context) this.A01;
                C14360o3.A0C(context, MSV.A00(11));
                return new C146096i7(context, null);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ((C55037OZj) this.A01).A04.Dws();
                return C0eB.A00;
            case 14:
                C37502GfK c37502GfK = (C37502GfK) this.A01;
                return new ILT(c37502GfK.A01, c37502GfK);
            case Process.SIGTERM /* 15 */:
                AbstractC22762A2g.A00();
                C37502GfK c37502GfK2 = (C37502GfK) this.A01;
                FragmentActivity fragmentActivity3 = c37502GfK2.A00;
                UserSession userSession2 = c37502GfK2.A01;
                InterfaceC60442pS interfaceC60442pS6 = c37502GfK2.A02;
                String str9 = c37502GfK2.A03;
                String str10 = c37502GfK2.A04;
                AbstractC167017dG.A1P(userSession2, interfaceC60442pS6);
                return new IN2(fragmentActivity3, userSession2, interfaceC60442pS6, str9, str10);
            case 16:
                C37502GfK c37502GfK3 = (C37502GfK) this.A01;
                return new IMX(c37502GfK3.A00, c37502GfK3.A01, c37502GfK3.A02, c37502GfK3.A03);
            case 17:
                C37502GfK c37502GfK4 = (C37502GfK) this.A01;
                return new UpcomingEventReminderRepository(c37502GfK4.A01, c37502GfK4.A02, c37502GfK4.A03);
            case 18:
                C37502GfK c37502GfK5 = (C37502GfK) this.A01;
                return new ILU(c37502GfK5.A01, c37502GfK5);
            case Process.SIGSTOP /* 19 */:
                return new C31374Dqe((AbstractC12990ll) this.A01);
            case 20:
                return C023409i.A0A.A05(this.A01);
            case 21:
                return AbstractC03270Dk.A00(((IgFragmentActivity) this.A01).getSession());
            case 22:
                ((Activity) this.A01).finish();
                return C0eB.A00;
            case 23:
                C52Z c52z = (C52Z) this.A01;
                if (c52z != null) {
                    return c52z.F7o();
                }
                return null;
            case 24:
                InterfaceC81733ki interfaceC81733ki = (InterfaceC81733ki) this.A01;
                if (interfaceC81733ki != null) {
                    return interfaceC81733ki.F7o();
                }
                return null;
            case 25:
                List list = (List) this.A01;
                if (list != null) {
                    ArrayList A0q = AbstractC167017dG.A0q(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        A0q.add(((InterfaceC37278GbV) it.next()).F7o());
                    }
                    return A0q;
                }
                return null;
            case 26:
                C5JN c5jn = (C5JN) this.A01;
                if (c5jn != null) {
                    return c5jn.F7o();
                }
                return null;
            case 27:
                List list2 = (List) this.A01;
                if (list2 != null) {
                    ArrayList A0q2 = AbstractC167017dG.A0q(list2);
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        A0q2.add(((InterfaceC43500JJm) it2.next()).F7o());
                    }
                    return A0q2;
                }
                return null;
            case 28:
                AvatarStatus avatarStatus = (AvatarStatus) this.A01;
                if (avatarStatus != null) {
                    return avatarStatus.F7o();
                }
                return null;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                InterfaceC37262GbF interfaceC37262GbF = (InterfaceC37262GbF) this.A01;
                if (interfaceC37262GbF != null) {
                    return interfaceC37262GbF.F7o();
                }
                return null;
            case 30:
                List list3 = (List) this.A01;
                if (list3 != null) {
                    ArrayList A0q3 = AbstractC167017dG.A0q(list3);
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        A0q3.add(((InterfaceC81873l7) it3.next()).F7o());
                    }
                    return A0q3;
                }
                return null;
            case 31:
                InterfaceC81773kp interfaceC81773kp = (InterfaceC81773kp) this.A01;
                if (interfaceC81773kp != null) {
                    return interfaceC81773kp.F7o();
                }
                return null;
            case 32:
                C44B c44b = (C44B) this.A01;
                if (c44b != null) {
                    return c44b.F7o();
                }
                return null;
            case 33:
                C43P c43p = (C43P) this.A01;
                if (c43p != null) {
                    return c43p.F7o();
                }
                return null;
            case 34:
                List list4 = (List) this.A01;
                if (list4 != null) {
                    ArrayList A0q4 = AbstractC167017dG.A0q(list4);
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        AbstractC31178DnM.A1U(A0q4, it4);
                    }
                    return A0q4;
                }
                return null;
            case 35:
                List list5 = (List) this.A01;
                if (list5 != null) {
                    ArrayList A0q5 = AbstractC167017dG.A0q(list5);
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        A0q5.add(((XG8) it5.next()).F7o());
                    }
                    return A0q5;
                }
                return null;
            case 36:
                InterfaceC115085Id interfaceC115085Id = (InterfaceC115085Id) this.A01;
                if (interfaceC115085Id != null) {
                    return interfaceC115085Id.F7o();
                }
                return null;
            case 37:
                C44K c44k = (C44K) this.A01;
                if (c44k != null) {
                    return c44k.F7o();
                }
                return null;
            case 38:
                InterfaceC224116z interfaceC224116z = (InterfaceC224116z) this.A01;
                if (interfaceC224116z != null) {
                    return interfaceC224116z.F7o();
                }
                return null;
            case 39:
                CreatorShoppingInfo creatorShoppingInfo = (CreatorShoppingInfo) this.A01;
                if (creatorShoppingInfo != null) {
                    return creatorShoppingInfo.F7o();
                }
                return null;
            case 40:
                InterfaceC111194zh interfaceC111194zh = (InterfaceC111194zh) this.A01;
                if (interfaceC111194zh != null) {
                    return interfaceC111194zh.F7o();
                }
                return null;
            case Seq.NULL_REFNUM /* 41 */:
                JLK jlk = (JLK) this.A01;
                if (jlk != null) {
                    return jlk.F7o();
                }
                return null;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                FanClubInfoDict fanClubInfoDict = (FanClubInfoDict) this.A01;
                if (fanClubInfoDict != null) {
                    return fanClubInfoDict.F7o();
                }
                return null;
            case 43:
                FanClubStatusSyncInfo fanClubStatusSyncInfo = (FanClubStatusSyncInfo) this.A01;
                if (fanClubStatusSyncInfo != null) {
                    return fanClubStatusSyncInfo.F7o();
                }
                return null;
            case 44:
                C5F6 c5f6 = (C5F6) this.A01;
                if (c5f6 != null) {
                    return c5f6.F7o();
                }
                return null;
            case 45:
                InterfaceC109944xO interfaceC109944xO = (InterfaceC109944xO) this.A01;
                if (interfaceC109944xO != null) {
                    return interfaceC109944xO.F7o();
                }
                return null;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                GenAIPersonaBannersResponse genAIPersonaBannersResponse = (GenAIPersonaBannersResponse) this.A01;
                if (genAIPersonaBannersResponse != null) {
                    return genAIPersonaBannersResponse.F7o();
                }
                return null;
            case 47:
                GroupMetadata groupMetadata = (GroupMetadata) this.A01;
                if (groupMetadata != null) {
                    return groupMetadata.F7o();
                }
                return null;
            case 48:
                ProfileTheme profileTheme = (ProfileTheme) this.A01;
                if (profileTheme != null) {
                    return profileTheme.F7o();
                }
                return null;
            default:
                GrowthFrictionInfo growthFrictionInfo = (GrowthFrictionInfo) this.A01;
                if (growthFrictionInfo != null) {
                    return growthFrictionInfo.F7o();
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43204J8b(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }
}
