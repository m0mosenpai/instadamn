package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.gifting.FanClubGiftingApi;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository;
import com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi;
import com.instagram.feed.tifu.api.TifuApiHelper;
import com.instagram.friendmap.data.FriendMapGraphQLImpl;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MAJ extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0O(null, this, false);
            case 1:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0K(null, this);
            case 2:
                A00(obj, this);
                return ((FanClubApi) this.A02).A08(null, this);
            case 3:
                A00(obj, this);
                return ((FanClubApi) this.A02).A09(null, this);
            case 4:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0P(this);
            case 5:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0A(null, this);
            case 6:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0T(this, false, false);
            case 7:
                A00(obj, this);
                return ((FanClubApi) this.A02).A01(null, this, false, false);
            case 8:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0C(null, this);
            case 9:
                A00(obj, this);
                return ((FanClubApi) this.A02).A07(null, null, this, false);
            case 10:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0D(null, this);
            case 11:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0H(null, this, false);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0L(null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A00(obj, this);
                return ((FanClubApi) this.A02).A04(null, null, this);
            case 14:
                A00(obj, this);
                return ((FanClubApi) this.A02).A05(null, null, this);
            case Process.SIGTERM /* 15 */:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0R(this);
            case 16:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0E(null, this);
            case 17:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0I(null, this, false, false, false);
            case 18:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0G(null, this);
            case Process.SIGSTOP /* 19 */:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0S(this);
            case 20:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0M(null, this);
            case 21:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0N(null, this);
            case 22:
            case 23:
            case 26:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 30:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((C31185DnU) this.A01).emit(null, this);
            case 24:
                A00(obj, this);
                return ((FanClubGiftingApi) this.A02).A00(null, this);
            case 25:
                A00(obj, this);
                return ((FanClubMemberListRepository) this.A02).A00(this);
            case 31:
                A00(obj, this);
                return FanClubPromoAndWelcomeVideoApi.A00((FanClubPromoAndWelcomeVideoApi) this.A02, this);
            case 32:
            case 33:
            case 36:
            case 37:
            default:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((JRB) this.A01).emit(null, this);
            case 34:
            case Seq.NULL_REFNUM /* 41 */:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((JRY) this.A01).emit(null, this);
            case 35:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((C31202Dnl) this.A01).emit(null, this);
            case 38:
                A00(obj, this);
                return ((TifuApiHelper) this.A02).A00(null, this, 0, 0);
            case 39:
                A00(obj, this);
                return ((TifuApiHelper) this.A02).A01(null, this, 0, 0);
            case 40:
                A00(obj, this);
                return ((TifuApiHelper) this.A02).A02(null, this, false);
            case 43:
                A00(obj, this);
                return ((FriendMapGraphQLImpl) this.A02).A00(null, this);
            case 44:
                A00(obj, this);
                return ((FriendMapGraphQLImpl) this.A02).A06(null, this);
            case 45:
                A00(obj, this);
                return ((FriendMapGraphQLImpl) this.A02).A05(null, null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A00(obj, this);
                return ((FriendMapGraphQLImpl) this.A02).A07(null, this);
            case 47:
                A00(obj, this);
                return ((FriendMapGraphQLImpl) this.A02).A03(null, null, null, this);
            case 48:
                A00(obj, this);
                return ((FriendMapGraphQLImpl) this.A02).A01(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAJ(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }

    public static void A00(Object obj, MAJ maj) {
        maj.A01 = obj;
        maj.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof MAJ) && ((MAJ) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAJ(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }
}
