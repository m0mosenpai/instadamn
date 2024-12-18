package X;

import android.content.Context;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HJA extends C3PD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public HJA(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        boolean z;
        C120985dq A02;
        User user;
        InterfaceC31010Dk9 interfaceC31010Dk9;
        UserSession userSession;
        Context requireContext;
        InterfaceC88553xD interfaceC88553xD;
        AudioType audioType;
        Long l;
        C4SX A00;
        OriginalAudioSubtype Ae4;
        EnumC39652Hih enumC39652Hih;
        InterfaceC88573xF interfaceC88573xF;
        switch (this.A00) {
            case 0:
                C42739IvZ c42739IvZ = (C42739IvZ) this.A02;
                if (!C42739IvZ.A03(c42739IvZ)) {
                    C42739IvZ.A00(c42739IvZ);
                } else {
                    InterfaceC678133v interfaceC678133v = c42739IvZ.A0B;
                    if (!interfaceC678133v.CLN() && (interfaceC88573xF = c42739IvZ.A00) != null) {
                        MusicDataSource BVb = interfaceC88573xF.BVb();
                        if (BVb != null) {
                            interfaceC678133v.ESz(BVb, c42739IvZ, null, 0, -1, -1, false, false);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    if (!interfaceC678133v.isPlaying()) {
                        C42739IvZ.A01(c42739IvZ, C8G5.A03);
                        interfaceC678133v.seekTo(c42739IvZ.A07.getProgress());
                        interfaceC678133v.E4S();
                        ((JHC) this.A01).DUd();
                    } else {
                        interfaceC678133v.pause();
                    }
                }
                return true;
            case 1:
                C38928HCb c38928HCb = (C38928HCb) this.A02;
                if (c38928HCb.A0B != null) {
                    INZ.A01(c38928HCb, AbstractC166987dD.A0r(c38928HCb.A0E), c38928HCb.A09, c38928HCb.A0D, "artist_profile", c38928HCb.A0C, null);
                    User user2 = (User) this.A01;
                    if (user2 == null) {
                        requireContext = c38928HCb.getContext();
                        C9GR.A07(requireContext, 2131968046);
                    } else {
                        IF4 if4 = c38928HCb.A0B;
                        if (if4 != null) {
                            if4.A00.A08.CJ7(user2, AbstractC43591JPw.A00(426));
                        }
                    }
                }
                return true;
            case 2:
                InterfaceC43451JHp interfaceC43451JHp = (InterfaceC43451JHp) this.A01;
                if (interfaceC43451JHp instanceof MusicSearchPlaylist) {
                    HMX hmx = (HMX) this.A02;
                    int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    hmx.A04.DZM((MusicSearchPlaylist) interfaceC43451JHp);
                    return true;
                }
                if (interfaceC43451JHp instanceof C42734IvU) {
                    HMX hmx2 = (HMX) this.A02;
                    int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    hmx2.A04.D2d((C42734IvU) interfaceC43451JHp);
                    return true;
                }
                return false;
            case 3:
                InterfaceC43451JHp interfaceC43451JHp2 = (InterfaceC43451JHp) this.A01;
                if (interfaceC43451JHp2 instanceof MusicSearchPlaylist) {
                    C39172HMa c39172HMa = (C39172HMa) this.A02;
                    int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    c39172HMa.A03.DZM((MusicSearchPlaylist) interfaceC43451JHp2);
                    return true;
                }
                if (interfaceC43451JHp2 instanceof C42734IvU) {
                    C39172HMa c39172HMa2 = (C39172HMa) this.A02;
                    int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    c39172HMa2.A03.D2d((C42734IvU) interfaceC43451JHp2);
                    return true;
                }
                return false;
            case 4:
                User user3 = (User) this.A02;
                if (user3 != null) {
                    C38930HCd c38930HCd = (C38930HCd) this.A01;
                    UserSession userSession2 = c38930HCd.A02;
                    C28431Ze A022 = AbstractC31364DqT.A02();
                    UserSession userSession3 = c38930HCd.A02;
                    AbstractC25236BEt.A0h(AbstractC37301Gc2.A04(userSession3, A022, AbstractC31402Dr6.A01(userSession3, user3.getId(), "music_question_response_artist", "question_response_bottom_sheet_fragment")), c38930HCd, userSession2);
                }
                return true;
            case 5:
                ((C38930HCd) this.A01).A04.A02((C41628IbJ) this.A02);
                return true;
            case 6:
                C38930HCd c38930HCd2 = (C38930HCd) this.A01;
                C41628IbJ c41628IbJ = (C41628IbJ) this.A02;
                C37987GnX c37987GnX = c38930HCd2.A04;
                c37987GnX.A01 = c41628IbJ;
                DialogInterfaceOnClickListenerC41836Ifq A002 = DialogInterfaceOnClickListenerC41836Ifq.A00(c37987GnX, 41);
                C193328hC A0H = AbstractC31171DnF.A0H(c37987GnX.A06);
                A0H.A0J(A002, 2131957640);
                A0H.A0D(A002);
                A0H.A0A(2131971241);
                A0H.A0t(true);
                AbstractC166987dD.A1W(A0H);
                return true;
            case 7:
                C37987GnX c37987GnX2 = ((C38930HCd) this.A02).A04;
                C189478aR c189478aR = c37987GnX2.A00;
                if (c189478aR != null) {
                    c37987GnX2.A02 = true;
                    c189478aR.A0L(null);
                } else {
                    c37987GnX2.A0B.EMa();
                }
                return true;
            case 8:
                C42276Io0 c42276Io0 = (C42276Io0) this.A02;
                UserSession userSession4 = c42276Io0.A0R;
                C38929HCc c38929HCc = c42276Io0.A0V;
                if (((C41174IKn) this.A01).A0F) {
                    enumC39652Hih = EnumC39652Hih.A0X;
                } else {
                    enumC39652Hih = EnumC39652Hih.A0Y;
                }
                AbstractC37670Gi3.A0P(enumC39652Hih, c38929HCc, userSession4, c42276Io0.A0c, c42276Io0.A0a, c42276Io0.A0b, c42276Io0.A0M);
                C1ZP A003 = AbstractC40901I9z.A00();
                FragmentActivity requireActivity = c38929HCc.requireActivity();
                EnumC39549HdL enumC39549HdL = c42276Io0.A0T;
                if (enumC39549HdL == null) {
                    enumC39549HdL = EnumC39549HdL.A02;
                }
                A003.A01(requireActivity, null, userSession4, enumC39549HdL, c42276Io0.A0X.A03);
                return true;
            case 9:
                C42276Io0 c42276Io02 = (C42276Io0) this.A02;
                String str = ((C41174IKn) this.A01).A06;
                if (str != null && str.length() != 0) {
                    N8L.A00(c42276Io02.A0P, "artist_profile");
                    UserSession userSession5 = c42276Io02.A0R;
                    C28431Ze A023 = AbstractC31364DqT.A02();
                    C38929HCc c38929HCc2 = c42276Io02.A0V;
                    AbstractC25236BEt.A0h(AbstractC37301Gc2.A04(userSession5, A023, AbstractC31402Dr6.A01(userSession5, str, "audio_page_artist", "audio_page")), c38929HCc2, userSession5);
                    String str2 = null;
                    String str3 = str;
                    if (!C14360o3.A0K(userSession5.userId, str)) {
                        str3 = null;
                    }
                    C38653Gyu A004 = C38335GtV.A00(c42276Io02.A0X);
                    if (A004 != null) {
                        interfaceC88553xD = A004.A03;
                    } else {
                        interfaceC88553xD = null;
                    }
                    Long valueOf = Long.valueOf(c42276Io02.A0M);
                    String str4 = c42276Io02.A0b;
                    if (interfaceC88553xD != null) {
                        audioType = interfaceC88553xD.Ae7();
                    } else {
                        audioType = null;
                    }
                    EnumC39636HiR A005 = I4Y.A00(audioType);
                    if (interfaceC88553xD != null && (Ae4 = interfaceC88553xD.Ae4()) != null) {
                        str2 = AbstractC40748I4c.A00(Ae4);
                    }
                    C153756vk c153756vk = c42276Io02.A0Q;
                    if (valueOf != null) {
                        C4SX c4sx = null;
                        Long A0k = AbstractC003100w.A0k(10, str);
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c38929HCc2, userSession5), "instagram_organic_audio_page_owner_tapped");
                        AbstractC25225BEi.A1O(A0f, "audio_page");
                        AbstractC37300Gc1.A0j(A0f, valueOf);
                        AbstractC37300Gc1.A0p(A0f, AbstractC166997dE.A0n());
                        if (str4 != null) {
                            l = AbstractC003100w.A0k(10, str4);
                        } else {
                            l = null;
                        }
                        AbstractC37300Gc1.A0h(A0f, l);
                        if (str3 == null) {
                            A00 = null;
                        } else {
                            A00 = C4SX.A00(str3);
                        }
                        A0f.AAK(A00, "target_id");
                        AbstractC37302Gc3.A0t(A0f);
                        if (A0k != null) {
                            c4sx = new C4SX(A0k);
                        }
                        A0f.AAK(c4sx, "audio_owner_id");
                        AbstractC37302Gc3.A0s(A005, A0f, str2);
                        AbstractC37303Gc4.A0e(A0f, c153756vk);
                        A0f.Cht();
                    }
                    return true;
                }
                requireContext = c42276Io02.A0V.requireContext();
                C9GR.A07(requireContext, 2131968046);
                return true;
            case 10:
                C56043OuF c56043OuF = (C56043OuF) this.A02;
                AbstractC183338Bg.A00(c56043OuF.A0H).A0K(EnumC114925Hg.CLIPS.toString());
                MusicAttributionConfig musicAttributionConfig = ((IHW) this.A01).A01;
                if (c56043OuF.A00 <= System.currentTimeMillis() - 500) {
                    c56043OuF.A00 = System.currentTimeMillis();
                    C38335GtV c38335GtV = c56043OuF.A0K;
                    AbstractC166987dD.A1Z(new C57156PZa(c38335GtV, musicAttributionConfig, (InterfaceC23621Ds) null, 11), AbstractC37302Gc3.A08(c38335GtV, musicAttributionConfig));
                }
                return true;
            case 11:
                z = false;
                C14360o3.A0B(view, 0);
                C37628GhN c37628GhN = (C37628GhN) this.A02;
                A02 = c37628GhN.A0M.A02();
                if (A02 == null) {
                    return false;
                }
                user = (User) this.A01;
                interfaceC31010Dk9 = (InterfaceC31010Dk9) c37628GhN.A0J.A1c.getValue();
                if (interfaceC31010Dk9 != null) {
                    userSession = c37628GhN.A0G;
                    interfaceC31010Dk9.Dbc(null, A02, AbstractC37652Ghl.A01(A02, userSession, C3YS.A00(userSession), null, null), C76493bt.A01(A02), user, null, null, null, null, null, null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, null, null, null, z, z);
                }
                return true;
            default:
                z = false;
                C14360o3.A0B(view, 0);
                C39467Hbt c39467Hbt = (C39467Hbt) this.A02;
                A02 = c39467Hbt.A0A.A02();
                if (A02 == null) {
                    return false;
                }
                user = (User) this.A01;
                interfaceC31010Dk9 = c39467Hbt.A09;
                if (interfaceC31010Dk9 != null) {
                    userSession = c39467Hbt.A07;
                    interfaceC31010Dk9.Dbc(null, A02, AbstractC37652Ghl.A01(A02, userSession, C3YS.A00(userSession), null, null), C76493bt.A01(A02), user, null, null, null, null, null, null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, null, null, null, z, z);
                }
                return true;
        }
    }
}
