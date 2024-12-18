package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.FanClubNextStepsRecommendationsType;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Fbx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35024Fbx {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C99694dm A03;
    public final FR4 A04;
    public final String A05;

    public /* synthetic */ C35024Fbx(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, FR4 fr4, String str, int i) {
        fragment = (i & 8) != 0 ? null : fragment;
        fr4 = (i & 16) != 0 ? new FR4(fragmentActivity, userSession) : fr4;
        C99694dm A00 = (i & 32) != 0 ? AbstractC99684dl.A00(userSession) : null;
        AbstractC167027dH.A13(userSession, fragmentActivity, str);
        AbstractC167017dG.A1T(fr4, A00);
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A05 = str;
        this.A00 = fragment;
        this.A04 = fr4;
        this.A03 = A00;
    }

    public final void A01(Context context, EnumC31515Dsz enumC31515Dsz, int i, int i2) {
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType;
        InterfaceC53742dD interfaceC53742dD;
        if (i2 != -1 && i2 != 9683) {
            return;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 9587 || enumC31515Dsz == null) {
                            return;
                        }
                        int ordinal = enumC31515Dsz.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2 || ordinal == 3) {
                                    return;
                                } else {
                                    throw B4Z.A00();
                                }
                            }
                            fanClubNextStepsRecommendationsType = FanClubNextStepsRecommendationsType.A0L;
                        } else {
                            fanClubNextStepsRecommendationsType = FanClubNextStepsRecommendationsType.A0A;
                        }
                    } else {
                        C9GR.A07(context, 2131962182);
                        fanClubNextStepsRecommendationsType = FanClubNextStepsRecommendationsType.A0D;
                    }
                } else {
                    C9GR.A07(context, 2131962182);
                    fanClubNextStepsRecommendationsType = FanClubNextStepsRecommendationsType.A0I;
                }
            } else {
                InterfaceC53722dB A00 = AbstractC54852fj.A00();
                if ((A00 instanceof InterfaceC53742dD) && (interfaceC53742dD = (InterfaceC53742dD) A00) != null) {
                    AbstractC72153Lo.A00 = true;
                    interfaceC53742dD.EfJ(C1QO.A0C);
                }
                fanClubNextStepsRecommendationsType = FanClubNextStepsRecommendationsType.A09;
            }
        } else {
            C9GR.A07(context, 2131962182);
            fanClubNextStepsRecommendationsType = FanClubNextStepsRecommendationsType.A0F;
        }
        String obj = fanClubNextStepsRecommendationsType.toString();
        C99694dm c99694dm = this.A03;
        String str = this.A05;
        C14360o3.A0B(obj, 2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c99694dm.A00, "ig_fan_club_settings_recommendations_recommendation_completed");
        AbstractC31171DnF.A1I(A0f, "creator_management_settings");
        AbstractC31178DnM.A17(A0f, c99694dm.A01.userId);
        A0f.AAP("origin", str);
        A0f.AAP(MSV.A00(567), obj);
        A0f.A9K("media_id", null);
        A0f.Cht();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x003c. Please report as an issue. */
    public final void A02(FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType, Integer num) {
        String A00;
        int i;
        UserSession userSession;
        ChannelCreationSource channelCreationSource;
        EnumC33330EoP enumC33330EoP;
        ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs;
        C140966Yy A0r;
        Fragment A002;
        FragmentActivity fragmentActivity;
        C6XJ A0a;
        String str;
        Context context;
        C14360o3.A0B(fanClubNextStepsRecommendationsType, 0);
        String obj = fanClubNextStepsRecommendationsType.toString();
        C99694dm c99694dm = this.A03;
        String str2 = this.A05;
        C14360o3.A0B(obj, 2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c99694dm.A00, "ig_fan_club_settings_recommendations_recommendation_tapped");
        AbstractC31171DnF.A1I(A0f, F7L.A00(num));
        AbstractC31178DnM.A17(A0f, c99694dm.A01.userId);
        A0f.AAP("origin", str2);
        A0f.AAP(MSV.A00(567), obj);
        A0f.Cht();
        switch (fanClubNextStepsRecommendationsType.ordinal()) {
            case 1:
                FR4 fr4 = this.A04;
                FragmentActivity fragmentActivity2 = fr4.A00;
                UserSession userSession2 = fr4.A01;
                A0r = AbstractC25225BEi.A0r(fragmentActivity2, userSession2);
                if (C18U.A06(C06090Tz.A05, userSession2, 36318956419619632L)) {
                    str = "com.bloks.www.ig_subscriptions.creator_experience.special_deals";
                } else {
                    str = "com.instagram.user_pay.fan_club.screens.creator_onboarding.special_deals";
                }
                A002 = AbstractC31180DnO.A0G(userSession2, str, AbstractC167017dG.A0r("origin", "next_step_recommendations"));
                AbstractC25229BEm.A18(A002, A0r);
                return;
            case 2:
                FR4 fr42 = this.A04;
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("interest_based_channel_entry_point", "broadcast_chat_setup");
                A0b.putInt("interest_based_channel_implicit_audience_type", 2);
                A0b.putParcelable("social_channel_creation_source", ChannelCreationSource.A0A);
                A0b.putString("InterestBasedChannelType", "Broadcast");
                A0b.putBoolean("channel_creation_entry_from_chooser", false);
                UserSession userSession3 = fr42.A01;
                fragmentActivity = fr42.A00;
                A0a = AbstractC31174DnI.A0a(fragmentActivity, A0b, userSession3, ModalActivity.class, "channel_creation_configure");
                A0a.A0C(fragmentActivity);
                return;
            case 3:
                FR4 fr43 = this.A04;
                A0r = AbstractC25225BEi.A0r(fr43.A00, fr43.A01);
                A002 = fr43.A02.A00("preview_picker");
                AbstractC25229BEm.A18(A002, A0r);
                return;
            case 4:
                userSession = this.A02;
                channelCreationSource = ChannelCreationSource.A0E;
                enumC33330EoP = null;
                channelCreationFlowExtraArgs = new ChannelCreationFlowExtraArgs(null, null, null);
                AbstractC35055FcS.A01(userSession, channelCreationFlowExtraArgs, channelCreationSource, enumC33330EoP, false).Cgf(this.A01);
                return;
            case 5:
                FVI.A01().A06(this.A01, this.A02, str2, AbstractC166987dD.A1E());
                return;
            case 6:
                A00 = AbstractC111324zv.A00(4422);
                i = 3;
                A00(A00, i);
                return;
            case 7:
                FR4 fr44 = this.A04;
                AbstractC25229BEm.A18(fr44.A02.A01(true, false, false, true, false), AbstractC25225BEi.A0r(fr44.A00, fr44.A01));
                return;
            case 8:
                UserSession userSession4 = this.A02;
                Bundle A05 = AbstractC31178DnM.A05(userSession4);
                A05.putString(AbstractC111324zv.A00(256), "FanClubSettingsRecommendations");
                A05.putBoolean("is_modal", true);
                A05.putBoolean(MSV.A00(898), true);
                fragmentActivity = this.A01;
                A0a = AbstractC31171DnF.A0L(fragmentActivity, A05, userSession4, ModalActivity.class, AbstractC111324zv.A00(4839));
                A0a.A0C(fragmentActivity);
                return;
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                userSession = this.A02;
                channelCreationSource = ChannelCreationSource.A0E;
                enumC33330EoP = EnumC33330EoP.A03;
                channelCreationFlowExtraArgs = new ChannelCreationFlowExtraArgs(null, null, null);
                AbstractC35055FcS.A01(userSession, channelCreationFlowExtraArgs, channelCreationSource, enumC33330EoP, false).Cgf(this.A01);
                return;
            case 10:
                A00 = AbstractC111324zv.A00(5196);
                i = 5;
                A00(A00, i);
                return;
            case 11:
            case 14:
            default:
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A00(AbstractC111324zv.A00(51), 2);
                return;
            case Process.SIGTERM /* 15 */:
                A00 = AbstractC111324zv.A00(3719);
                i = 4;
                A00(A00, i);
                return;
            case 16:
                FR4 fr45 = this.A04;
                Fragment fragment = this.A00;
                if (fragment == null || (context = fragment.getContext()) == null) {
                    return;
                }
                fr45.A00(context);
                return;
            case 17:
                FR4 fr46 = this.A04;
                AbstractC25229BEm.A18(fr46.A02.A01(false, true, false, true, false), AbstractC25225BEi.A0r(fr46.A00, fr46.A01));
                return;
        }
    }

    private final void A00(String str, int i) {
        UserSession userSession = this.A02;
        Bundle A0b = AbstractC166987dD.A0b();
        FragmentActivity fragmentActivity = this.A01;
        C6XJ A02 = C6XJ.A02(fragmentActivity, A0b, userSession, TransparentModalActivity.class, str);
        A02.A07();
        Fragment fragment = this.A00;
        if (fragment != null && fragment.getContext() != null) {
            A02.A0D(fragment, i);
        } else {
            A02.A0A(fragmentActivity, i);
        }
    }
}
