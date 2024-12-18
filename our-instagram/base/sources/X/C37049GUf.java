package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;

/* renamed from: X.GUf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37049GUf extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37049GUf(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C37049GUf(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return AbstractC31179DnN.A04(this.A01).getString("creator_user_id");
            case 1:
            case 8:
                return AbstractC31179DnN.A04(this.A01).getString("origin");
            case 2:
                return AbstractC153636vY.A01(AbstractC31179DnN.A04(this.A01), "recipient_user_id");
            case 3:
            case 11:
            case 16:
            case 22:
            case 31:
            case 36:
            case 40:
                return this.A01;
            case 4:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 17:
            case 23:
            case 32:
            case 37:
            case Seq.NULL_REFNUM /* 41 */:
                return AbstractC25226BEj.A1C(this.A01);
            case 5:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 18:
            case 24:
            case 33:
            case 38:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 6:
                EIU eiu = (EIU) this.A01;
                return new EW8(AbstractC166987dD.A0r(eiu.A07), eiu.requireActivity());
            case 7:
                C32295EKi c32295EKi = (C32295EKi) this.A01;
                return AbstractC31176DnK.A0h(c32295EKi.A03).A02(c32295EKi.requireArguments().getString("creator_user_id"));
            case 9:
                return AbstractC31179DnN.A04(this.A01).getString("recipient_user_id");
            case 10:
                return AbstractC31179DnN.A04(this.A01).getString("sku");
            case 14:
                C32295EKi c32295EKi2 = (C32295EKi) this.A01;
                return new EW8(AbstractC166987dD.A0r(c32295EKi2.A03), c32295EKi2.requireActivity());
            case Process.SIGTERM /* 15 */:
                return Integer.valueOf((int) Math.ceil(((List) this.A01).size() / 3.0d));
            case Process.SIGSTOP /* 19 */:
                C45469KBe c45469KBe = (C45469KBe) this.A01;
                return new KG3(c45469KBe.requireActivity(), AbstractC166987dD.A0r(c45469KBe.A00));
            case 20:
            case 26:
            case 47:
            case 48:
                return new Object[((InterfaceC19390xP[]) this.A01).length];
            case 21:
            case 35:
                return AbstractC31179DnN.A04(this.A01).getString("ARGUMENT_ENTRY_POINT", "UNKNOWN");
            case 25:
                C32296EKj c32296EKj = (C32296EKj) this.A01;
                return new ND4(AbstractC166987dD.A0r(c32296EKj.A08), AbstractC31175DnJ.A0e(c32296EKj.A07));
            case 27:
                LI9 li9 = (LI9) this.A01;
                return li9.A03.A00(li9.A00, li9.A02);
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                ((LI9) this.A01).A01.A01();
                return C0eB.A00;
            case 30:
                return F1E.A00(AbstractC166987dD.A0r(((EOG) this.A01).A0A));
            case 34:
                return new C32567EVr(AbstractC166987dD.A0r(((EOG) this.A01).A0A));
            case 39:
                EOH eoh = (EOH) this.A01;
                return new EW9(AbstractC166987dD.A0r(eoh.A01), (String) AbstractC166987dD.A17(eoh.A00));
            case 43:
                return new EWQ(AbstractC166987dD.A0r(((EOF) this.A01).A01));
            case 44:
                UserSession userSession = (UserSession) this.A01;
                return new CreatorMessagingSelectionScreenRepository(new FanClubApi(userSession), userSession.userId, C18U.A06(C06090Tz.A06, userSession, 36320274974646504L));
            case 45:
                UserSession userSession2 = (UserSession) this.A01;
                return new FanClubMemberListCategoryRepository(userSession2, new FanClubApi(userSession2));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                UserSession userSession3 = (UserSession) this.A01;
                return new FanClubMemberListRepository(new FanClubApi(userSession3), new GFZ(userSession3), userSession3.userId);
            case 49:
                return AbstractC31172DnG.A13(AbstractC31179DnN.A04(this.A01), "origin");
        }
    }
}
