package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.MultiAuthorStoryType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.LocationDict;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;

/* renamed from: X.6ZI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ZI implements C1NB {
    public C38471qb A00;

    @Override // X.C1NB
    public final User CDj() {
        return null;
    }

    public final String A00() {
        String obj;
        MultiAuthorStoryType multiAuthorStoryType = this.A00.A00;
        if (multiAuthorStoryType == null || (obj = multiAuthorStoryType.toString()) == null) {
            return "";
        }
        return obj;
    }

    @Override // X.C1NB
    public final EnumC73093Pk Ai9() {
        C38471qb c38471qb = this.A00;
        C14360o3.A0B(c38471qb, 0);
        MultiAuthorStoryType multiAuthorStoryType = c38471qb.A00;
        if (multiAuthorStoryType != null) {
            switch (multiAuthorStoryType.ordinal()) {
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    return EnumC73093Pk.A04;
                case Process.SIGTERM /* 15 */:
                case 16:
                    return EnumC73093Pk.A05;
                case 17:
                    return EnumC73093Pk.A06;
                case 22:
                    return EnumC73093Pk.A09;
                case 25:
                case 30:
                    return EnumC73093Pk.A0A;
                case 27:
                    return EnumC73093Pk.A03;
            }
        }
        return EnumC73093Pk.A07;
    }

    @Override // X.C1NB
    public final String AsH() {
        return this.A00.A08;
    }

    @Override // X.C1NB
    public final ImageUrl AsM() {
        return this.A00.A01;
    }

    @Override // X.C1NB
    public final Integer BWG() {
        C38471qb c38471qb = this.A00;
        C14360o3.A0B(c38471qb, 0);
        MultiAuthorStoryType multiAuthorStoryType = c38471qb.A00;
        if (multiAuthorStoryType != null) {
            int ordinal = multiAuthorStoryType.ordinal();
            if (ordinal != 13) {
                if (ordinal != 27) {
                    if (ordinal != 22) {
                        if (ordinal == 17) {
                            return C05F.A01;
                        }
                    } else {
                        return C05F.A0j;
                    }
                } else {
                    return C05F.A0N;
                }
            } else {
                return C05F.A0C;
            }
        }
        return C05F.A00;
    }

    @Override // X.C1NB
    public final Integer CBs() {
        MultiAuthorStoryType multiAuthorStoryType = this.A00.A00;
        if (multiAuthorStoryType != null) {
            switch (multiAuthorStoryType.ordinal()) {
                case 2:
                case 3:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case 20:
                    return C05F.A03;
                case 5:
                    return C05F.A02;
                case 6:
                    return C05F.A0u;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    return C05F.A0C;
                case Process.SIGTERM /* 15 */:
                    return C05F.A1F;
                case 16:
                    return C05F.A1I;
                case 17:
                    return C05F.A04;
                case 22:
                    return C05F.A15;
                case 25:
                    return C05F.A0Y;
                case 27:
                    return C05F.A0N;
            }
        }
        return C05F.A00;
    }

    @Override // X.C1NB
    public final void ESL(ImageUrl imageUrl) {
        LocationDict locationDict;
        C38471qb c38471qb = this.A00;
        C14360o3.A0B(c38471qb, 1);
        String str = c38471qb.A05;
        Float f = c38471qb.A03;
        Float f2 = c38471qb.A04;
        LocationDict locationDict2 = c38471qb.A02;
        String str2 = c38471qb.A06;
        String str3 = c38471qb.A07;
        String str4 = c38471qb.A08;
        String str5 = c38471qb.A09;
        MultiAuthorStoryType multiAuthorStoryType = c38471qb.A00;
        ImageUrl imageUrl2 = this.A00.A01;
        if (locationDict2 != null) {
            locationDict = locationDict2.F6g();
        } else {
            locationDict = null;
        }
        this.A00 = new C38471qb(multiAuthorStoryType, imageUrl2, locationDict, f, f2, str, str2, str3, str4, str5);
    }

    @Override // X.C1NB
    public final String getId() {
        return this.A00.A07;
    }

    @Override // X.C1NB
    public final String getName() {
        return this.A00.A06;
    }

    public final String toString() {
        String str;
        String str2 = this.A00.A06;
        switch (CBs().intValue()) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "USER";
                break;
            case 2:
                str = "LOCATION";
                break;
            case 3:
                str = "HASHTAG";
                break;
            case 4:
                str = "STICKER";
                break;
            case 5:
                str = "SYSTEM";
                break;
            case 6:
                str = "ELECTION";
                break;
            case 7:
                str = "PRODUCT";
                break;
            case 8:
                str = "MENTIONS";
                break;
            case 9:
                str = "MENTIONSV2";
                break;
            case 10:
                str = "EFFECTS";
                break;
            case 11:
                str = "RANKED";
                break;
            default:
                str = "MULTI_AD";
                break;
        }
        return AnonymousClass001.A0v("{name: ", str2, " mas type: ", str, '}');
    }
}
