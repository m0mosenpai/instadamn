package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.friendmap.data.MapText;
import com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class MHN extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHN(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new MHN(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        LLR llr;
        EnumC46289KeL enumC46289KeL;
        String str;
        String str2;
        C45999KXn c45999KXn;
        EnumC46298KeU enumC46298KeU;
        JQC jqc;
        MNV mnv;
        EnumC46180KcI enumC46180KcI;
        C45994KXi c45994KXi;
        int i;
        LocaleList locales;
        View A0F;
        int i2;
        InterfaceC16660sJ interfaceC16660sJ;
        EnumC46191KcT enumC46191KcT;
        Fragment fragment;
        int i3;
        switch (this.A00) {
            case 0:
                if (((FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig) ((KDY) this.A01).A09.getValue()).A01.intValue() != 0) {
                    return EnumC152186t3.FRIEND_MAP_FLOATY_GRID;
                }
                return EnumC152186t3.FRIEND_MAP;
            case 1:
                Parcelable parcelable = AbstractC31179DnN.A04(this.A01).getParcelable("presence_launch_config");
                if (parcelable != null) {
                    return parcelable;
                }
                return new FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig();
            case 2:
                fragment = (Fragment) this.A01;
                i3 = R.id.friend_map_presence_reply_edit_text;
                return JQ1.A05(fragment, i3);
            case 3:
                KDY kdy = (KDY) this.A01;
                return new KG7(AbstractC166987dD.A0r(kdy.A0C), ((FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig) kdy.A09.getValue()).A03);
            case 4:
                fragment = (Fragment) this.A01;
                i3 = R.id.row_thread_composer_send_button_container;
                return JQ1.A05(fragment, i3);
            case 5:
                return new C148396m9((ViewGroup) ((KDY) this.A01).A0D.getValue());
            case 6:
            case 23:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return this.A01;
            case 7:
            case 24:
            case 30:
                return AbstractC25226BEj.A1C(this.A01);
            case 8:
            case 25:
            case 31:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 9:
                fragment = (Fragment) this.A01;
                i3 = R.id.friend_map_presence_reply_additional_text;
                return JQ1.A05(fragment, i3);
            case 10:
                fragment = (Fragment) this.A01;
                i3 = R.id.friend_map_presence_reply_avatar;
                return JQ1.A05(fragment, i3);
            case 11:
                fragment = (Fragment) this.A01;
                i3 = R.id.friend_map_presence_reply_row_subtitle;
                return JQ1.A05(fragment, i3);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                fragment = (Fragment) this.A01;
                i3 = R.id.friend_map_presence_reply_username;
                return JQ1.A05(fragment, i3);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                InterfaceC16610sE interfaceC16610sE = (InterfaceC16610sE) this.A01;
                Boolean A0a = AbstractC166997dE.A0a();
                interfaceC16610sE.invoke(A0a, A0a, A0a);
                return C0eB.A00;
            case 14:
                KBG kbg = (KBG) this.A01;
                return new C684436h(kbg.requireActivity(), AbstractC166987dD.A0r(kbg.A03));
            case Process.SIGTERM /* 15 */:
                KBG kbg2 = (KBG) this.A01;
                return new LLR(kbg2, AbstractC31180DnO.A0M(kbg2.A03));
            case 16:
                InterfaceC16610sE interfaceC16610sE2 = ((KBG) this.A01).A00;
                Boolean A0a2 = AbstractC166997dE.A0a();
                interfaceC16610sE2.invoke(A0a2, AbstractC166997dE.A0b(), A0a2);
                return C0eB.A00;
            case 17:
                Fragment fragment2 = (Fragment) this.A01;
                LHE.A01(fragment2, new MHN(fragment2, 16), true);
                return C0eB.A00;
            case 18:
                KBG kbg3 = (KBG) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(kbg3.A03);
                Bundle bundle = kbg3.mArguments;
                boolean z = true;
                if (bundle == null || !bundle.getBoolean("arg_is_from_nux")) {
                    z = false;
                }
                return new KGS(A0r, AbstractC43592JPx.A0i(kbg3.A02), z);
            case Process.SIGSTOP /* 19 */:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                enumC46191KcT = EnumC46191KcT.A04;
                interfaceC16660sJ.invoke(enumC46191KcT);
                return C0eB.A00;
            case 20:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                enumC46191KcT = EnumC46191KcT.A05;
                interfaceC16660sJ.invoke(enumC46191KcT);
                return C0eB.A00;
            case 21:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                enumC46191KcT = EnumC46191KcT.A03;
                interfaceC16660sJ.invoke(enumC46191KcT);
                return C0eB.A00;
            case 22:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                enumC46191KcT = null;
                interfaceC16660sJ.invoke(enumC46191KcT);
                return C0eB.A00;
            case 26:
                C45488KCd c45488KCd = (C45488KCd) this.A01;
                return new TFA(c45488KCd.requireContext(), AbstractC166987dD.A0r(c45488KCd.A04));
            case 27:
                A0F = JQ0.A0F(this.A01);
                i2 = R.id.no_updates_text;
                return A0F.requireViewById(i2);
            case 28:
                A0F = JQ0.A0F(this.A01);
                i2 = R.id.updates_search_bar;
                return A0F.requireViewById(i2);
            case 32:
                Bundle bundle2 = ((Fragment) this.A01).mArguments;
                if (bundle2 != null) {
                    return bundle2.getParcelable("friend_map_update_launch_config");
                }
                return null;
            case 33:
                A0F = JQ0.A0F(this.A01);
                i2 = R.id.updates_recycler_view;
                return A0F.requireViewById(i2);
            case 34:
                C45488KCd c45488KCd2 = (C45488KCd) this.A01;
                InterfaceC09390do interfaceC09390do = c45488KCd2.A04;
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                TFA tfa = (TFA) c45488KCd2.A01.getValue();
                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                C14360o3.A0B(A0r3, 0);
                LLR llr2 = new LLR(c45488KCd2, A0r3);
                Locale locale = null;
                Configuration configuration = AbstractC166997dE.A0N(c45488KCd2).getConfiguration();
                if (configuration != null && (locales = configuration.getLocales()) != null) {
                    locale = locales.get(0);
                }
                c45488KCd2.A05.getValue();
                return new C45587KGb(A0r2, tfa, llr2, locale);
            case 35:
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01;
                AbstractC166987dD.A1Z(new MC2(abstractC52922bZ, null, 41), AbstractC141776au.A00(abstractC52922bZ));
                return C0eB.A00;
            case 36:
                c45994KXi = (C45994KXi) this.A01;
                i = 2131962865;
                MapText.Res res = new MapText.Res(i, new String[0]);
                C45999KXn c45999KXn2 = c45994KXi.A01;
                c45999KXn2.A0S(C45999KXn.A01(c45999KXn2));
                c45994KXi.A0M(new C49418Lss(res));
                c45994KXi.A0M(C49420Lsu.A00);
                return C0eB.A00;
            case 37:
                jqc = (JQC) this.A01;
                enumC46180KcI = EnumC46180KcI.A08;
                mnv = new C49417Lsr(enumC46180KcI);
                jqc.A0M(mnv);
                return C0eB.A00;
            case 38:
                c45994KXi = (C45994KXi) this.A01;
                i = 2131962846;
                MapText.Res res2 = new MapText.Res(i, new String[0]);
                C45999KXn c45999KXn22 = c45994KXi.A01;
                c45999KXn22.A0S(C45999KXn.A01(c45999KXn22));
                c45994KXi.A0M(new C49418Lss(res2));
                c45994KXi.A0M(C49420Lsu.A00);
                return C0eB.A00;
            case 39:
                jqc = (JQC) this.A01;
                enumC46180KcI = EnumC46180KcI.A02;
                mnv = new C49417Lsr(enumC46180KcI);
                jqc.A0M(mnv);
                return C0eB.A00;
            case 40:
                c45994KXi = (C45994KXi) this.A01;
                i = 2131962850;
                MapText.Res res22 = new MapText.Res(i, new String[0]);
                C45999KXn c45999KXn222 = c45994KXi.A01;
                c45999KXn222.A0S(C45999KXn.A01(c45999KXn222));
                c45994KXi.A0M(new C49418Lss(res22));
                c45994KXi.A0M(C49420Lsu.A00);
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                jqc = (JQC) this.A01;
                enumC46180KcI = EnumC46180KcI.A04;
                mnv = new C49417Lsr(enumC46180KcI);
                jqc.A0M(mnv);
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                ((JQC) this.A01).A0O(ML6.A00);
                return C0eB.A00;
            case 43:
                C45999KXn c45999KXn3 = (C45999KXn) this.A01;
                c45999KXn3.A03.A08();
                c45999KXn3.A06.A03();
                return C0eB.A00;
            case 44:
                jqc = (JQC) this.A01;
                mnv = C49454LtS.A00;
                jqc.A0M(mnv);
                return C0eB.A00;
            case 45:
                jqc = (JQC) this.A01;
                mnv = C49453LtR.A00;
                jqc.A0M(mnv);
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                c45999KXn = (C45999KXn) this.A01;
                enumC46298KeU = EnumC46298KeU.MUTUALS_CHECKUP;
                c45999KXn.A0T(enumC46298KeU, false);
                return C0eB.A00;
            case 47:
                c45999KXn = (C45999KXn) this.A01;
                enumC46298KeU = EnumC46298KeU.DEEPLINK;
                c45999KXn.A0T(enumC46298KeU, false);
                return C0eB.A00;
            case 48:
                llr = ((C45999KXn) this.A01).A03;
                enumC46289KeL = EnumC46289KeL.FINAL_REMINDER_NUX;
                str = "NUX_WINDOW";
                str2 = "IMPRESSION";
                LLR.A02(enumC46289KeL, llr, str, str2);
                return C0eB.A00;
            case 49:
                llr = ((C45999KXn) this.A01).A03;
                enumC46289KeL = EnumC46289KeL.FINAL_REMINDER_NUX;
                str = "NUX_PROCEED";
                str2 = "TAP";
                LLR.A02(enumC46289KeL, llr, str, str2);
                return C0eB.A00;
        }
    }
}
