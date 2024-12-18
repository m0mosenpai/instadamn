package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WFh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70180WFh {
    public static final MusicOverlayStickerModel A01(C66619UPg c66619UPg) {
        ArrayList arrayList;
        SimpleImageUrl simpleImageUrl;
        ArrayList arrayList2;
        User user;
        AudioMetadataLabels audioMetadataLabels;
        AudioFilterType audioFilterType;
        C14360o3.A0B(c66619UPg, 0);
        boolean z = c66619UPg.A0p;
        SimpleImageUrl simpleImageUrl2 = new SimpleImageUrl(c66619UPg.A0S);
        String str = c66619UPg.A0Z;
        boolean z2 = c66619UPg.A0q;
        String str2 = c66619UPg.A0d;
        boolean z3 = c66619UPg.A0r;
        String str3 = c66619UPg.A0h;
        AbstractC43594JPz.A1P(str, str2);
        C14360o3.A0B(str3, 6);
        ArrayList arrayList3 = null;
        AbstractC31180DnO.A0w(6);
        AudioMutingInfo audioMutingInfo = null;
        MusicMuteAudioReason musicMuteAudioReason = null;
        MusicProduct musicProduct = null;
        AudioMutingInfo audioMutingInfo2 = null;
        MusicMuteAudioReason musicMuteAudioReason2 = null;
        MusicOverlayStickerModel musicOverlayStickerModel = new MusicOverlayStickerModel(null, null, null, null, simpleImageUrl2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, str2, null, null, null, str3, null, null, null, null, null, null, null, z, z2, z3);
        boolean z4 = musicOverlayStickerModel.A0r;
        ImageUrl imageUrl = musicOverlayStickerModel.A04;
        String str4 = musicOverlayStickerModel.A0b;
        Boolean bool = musicOverlayStickerModel.A0C;
        boolean z5 = musicOverlayStickerModel.A0s;
        String str5 = musicOverlayStickerModel.A0f;
        boolean z6 = musicOverlayStickerModel.A0t;
        String str6 = musicOverlayStickerModel.A0j;
        Boolean bool2 = musicOverlayStickerModel.A0I;
        String str7 = c66619UPg.A0M;
        Boolean bool3 = c66619UPg.A04;
        String str8 = c66619UPg.A0N;
        String str9 = c66619UPg.A0O;
        Integer num = c66619UPg.A0G;
        Integer num2 = c66619UPg.A0H;
        String str10 = c66619UPg.A0P;
        List list = c66619UPg.A0m;
        if (list != null) {
            arrayList = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                switch (((VE2) it.next()).ordinal()) {
                    case 0:
                        audioFilterType = AudioFilterType.A04;
                        break;
                    case 1:
                        audioFilterType = AudioFilterType.A05;
                        break;
                    case 2:
                        audioFilterType = AudioFilterType.A06;
                        break;
                    case 3:
                        audioFilterType = AudioFilterType.A07;
                        break;
                    case 4:
                        audioFilterType = AudioFilterType.A08;
                        break;
                    case 5:
                        audioFilterType = AudioFilterType.A0B;
                        break;
                    default:
                        audioFilterType = AudioFilterType.A0A;
                        break;
                }
                arrayList.add(new AudioFilterInfo(audioFilterType));
            }
        } else {
            arrayList = null;
        }
        C51699MsU c51699MsU = c66619UPg.A00;
        if (c51699MsU != null) {
            boolean z7 = c51699MsU.A02;
            boolean z8 = c51699MsU.A03;
            EnumC39578Hdo enumC39578Hdo = (EnumC39578Hdo) c51699MsU.A00;
            if (enumC39578Hdo != null) {
                musicMuteAudioReason2 = A00(enumC39578Hdo);
            }
            audioMutingInfo2 = new AudioMutingInfo(musicMuteAudioReason2, c51699MsU.A01, z7, z8, c51699MsU.A04);
        }
        String str11 = c66619UPg.A0Q;
        String str12 = c66619UPg.A0R;
        if (str12 != null) {
            simpleImageUrl = new SimpleImageUrl(str12);
        } else {
            simpleImageUrl = null;
        }
        String str13 = c66619UPg.A0T;
        String str14 = c66619UPg.A0U;
        String str15 = c66619UPg.A0V;
        Integer num3 = c66619UPg.A0I;
        String str16 = c66619UPg.A0W;
        List list2 = c66619UPg.A0n;
        if (list2 != null) {
            arrayList2 = AbstractC167007dF.A0i(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                int ordinal = ((EnumC68147VDp) it2.next()).ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            audioMetadataLabels = AudioMetadataLabels.A07;
                        } else {
                            audioMetadataLabels = AudioMetadataLabels.A06;
                        }
                    } else {
                        audioMetadataLabels = AudioMetadataLabels.A04;
                    }
                } else {
                    audioMetadataLabels = AudioMetadataLabels.A05;
                }
                arrayList2.add(audioMetadataLabels);
            }
        } else {
            arrayList2 = null;
        }
        Integer num4 = c66619UPg.A0J;
        String str17 = c66619UPg.A0X;
        String str18 = c66619UPg.A0Y;
        Boolean bool4 = c66619UPg.A05;
        Boolean bool5 = c66619UPg.A06;
        List list3 = c66619UPg.A0o;
        UPU upu = c66619UPg.A01;
        if (upu != null) {
            user = AbstractC69972Vyn.A01(upu);
        } else {
            user = null;
        }
        String str19 = c66619UPg.A0a;
        Boolean bool6 = c66619UPg.A07;
        Boolean bool7 = c66619UPg.A08;
        Boolean bool8 = c66619UPg.A0A;
        Boolean bool9 = c66619UPg.A0B;
        Boolean bool10 = c66619UPg.A0C;
        String str20 = c66619UPg.A0b;
        VED ved = c66619UPg.A03;
        if (ved != null) {
            switch (ved.ordinal()) {
                case 0:
                    musicProduct = MusicProduct.A04;
                    break;
                case 1:
                    musicProduct = MusicProduct.A05;
                    break;
                case 2:
                    musicProduct = MusicProduct.A06;
                    break;
                case 3:
                    musicProduct = MusicProduct.A07;
                    break;
                case 4:
                    musicProduct = MusicProduct.A09;
                    break;
                case 5:
                    musicProduct = MusicProduct.A0A;
                    break;
                case 6:
                    musicProduct = MusicProduct.A0B;
                    break;
                case 7:
                    musicProduct = MusicProduct.A0C;
                    break;
                case 8:
                    musicProduct = MusicProduct.A0D;
                    break;
                case 9:
                    musicProduct = MusicProduct.A0E;
                    break;
                case 10:
                    musicProduct = MusicProduct.A0G;
                    break;
                case 11:
                    musicProduct = MusicProduct.A0H;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    musicProduct = MusicProduct.A0I;
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    musicProduct = MusicProduct.A0L;
                    break;
                case 14:
                    musicProduct = MusicProduct.A0M;
                    break;
                case Process.SIGTERM /* 15 */:
                    musicProduct = MusicProduct.A0N;
                    break;
                case 16:
                    musicProduct = MusicProduct.A0O;
                    break;
                case 17:
                    musicProduct = MusicProduct.A0Q;
                    break;
                default:
                    musicProduct = MusicProduct.A0P;
                    break;
            }
        }
        String str21 = c66619UPg.A0c;
        Integer num5 = c66619UPg.A0K;
        Boolean bool11 = c66619UPg.A0D;
        String str22 = c66619UPg.A0e;
        String str23 = c66619UPg.A0f;
        String str24 = c66619UPg.A0g;
        Boolean bool12 = c66619UPg.A0E;
        EnumC39578Hdo enumC39578Hdo2 = c66619UPg.A02;
        if (enumC39578Hdo2 != null) {
            musicMuteAudioReason = A00(enumC39578Hdo2);
        }
        Boolean bool13 = c66619UPg.A0F;
        String str25 = c66619UPg.A0i;
        String str26 = c66619UPg.A0j;
        String str27 = c66619UPg.A0k;
        Integer num6 = c66619UPg.A0L;
        String str28 = c66619UPg.A0l;
        AbstractC31180DnO.A0w(6);
        if (arrayList != null) {
            arrayList3 = AbstractC167007dF.A0i(arrayList);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((AudioFilterInfoIntf) it3.next()).Er1());
            }
        }
        if (audioMutingInfo2 != null) {
            audioMutingInfo = audioMutingInfo2.Er4();
        }
        return new MusicOverlayStickerModel(audioMutingInfo, musicMuteAudioReason, musicProduct, simpleImageUrl, imageUrl, user, bool3, false, bool4, bool5, bool6, bool7, bool, bool8, bool9, bool10, bool11, bool12, bool2, bool13, num, num2, num3, num4, num5, num6, str7, str8, str9, str10, str11, str13, str14, str15, str16, str17, str18, str4, str19, str20, str21, str5, str22, str23, str24, str6, str25, str26, str27, str28, arrayList3, arrayList2, list3, z4, z5, z6);
    }

    public static final EnumC138556Pl A02(VE9 ve9) {
        switch (AbstractC25227BEk.A05(ve9, 0)) {
            case 0:
                return EnumC138556Pl.A0F;
            case 1:
                return EnumC138556Pl.A0E;
            case 2:
                return EnumC138556Pl.A0A;
            case 3:
                return EnumC138556Pl.A08;
            case 4:
                return EnumC138556Pl.A09;
            case 5:
                return EnumC138556Pl.A0C;
            case 6:
                return EnumC138556Pl.A0B;
            case 7:
                return EnumC138556Pl.A0D;
            case 8:
                return EnumC138556Pl.A06;
            default:
                return EnumC138556Pl.A0J;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.UPg, java.lang.Object] */
    public static final C66619UPg A04(MusicOverlayStickerModel musicOverlayStickerModel) {
        ArrayList arrayList;
        C51699MsU c51699MsU;
        String str;
        ArrayList arrayList2;
        UPU upu;
        EnumC68147VDp enumC68147VDp;
        EnumC39578Hdo enumC39578Hdo;
        VE2 ve2;
        VED ved = null;
        EnumC39578Hdo enumC39578Hdo2 = null;
        ?? obj = new Object();
        obj.A0M = null;
        obj.A04 = null;
        obj.A0p = false;
        obj.A0N = null;
        obj.A0O = null;
        obj.A0G = null;
        obj.A0H = null;
        obj.A0P = null;
        obj.A0m = null;
        obj.A00 = null;
        obj.A0Q = null;
        obj.A0R = null;
        obj.A0S = "";
        obj.A0T = null;
        obj.A0U = null;
        obj.A0V = null;
        obj.A0I = null;
        obj.A0W = null;
        obj.A0n = null;
        obj.A0J = null;
        obj.A0X = null;
        obj.A0Y = null;
        obj.A05 = null;
        obj.A06 = null;
        obj.A0o = null;
        obj.A0Z = "";
        obj.A01 = null;
        obj.A0a = null;
        obj.A07 = null;
        obj.A08 = null;
        obj.A09 = null;
        obj.A0q = false;
        obj.A0A = null;
        obj.A0B = null;
        obj.A0C = null;
        obj.A0b = null;
        obj.A03 = null;
        obj.A0c = null;
        obj.A0K = null;
        obj.A0D = null;
        obj.A0d = "";
        obj.A0e = null;
        obj.A0f = null;
        obj.A0g = null;
        obj.A0E = null;
        obj.A0r = false;
        obj.A0h = "";
        obj.A02 = null;
        obj.A0F = null;
        obj.A0i = null;
        obj.A0j = null;
        obj.A0k = null;
        obj.A0L = null;
        obj.A0l = null;
        obj.A0M = musicOverlayStickerModel.A0Q;
        obj.A04 = musicOverlayStickerModel.A06;
        obj.A0p = musicOverlayStickerModel.A0r;
        obj.A0N = musicOverlayStickerModel.A0R;
        obj.A0O = musicOverlayStickerModel.A0S;
        obj.A0G = musicOverlayStickerModel.A0K;
        obj.A0H = musicOverlayStickerModel.A0L;
        obj.A0P = musicOverlayStickerModel.A0T;
        List list = musicOverlayStickerModel.A0o;
        if (list != null) {
            arrayList = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                switch (((AudioFilterInfo) it.next()).A00.ordinal()) {
                    case 1:
                        ve2 = VE2.A04;
                        break;
                    case 2:
                        ve2 = VE2.A05;
                        break;
                    case 3:
                        ve2 = VE2.A06;
                        break;
                    case 4:
                        ve2 = VE2.A07;
                        break;
                    case 5:
                        ve2 = VE2.A08;
                        break;
                    case 6:
                    default:
                        ve2 = VE2.A09;
                        break;
                    case 7:
                        ve2 = VE2.A0A;
                        break;
                }
                arrayList.add(ve2);
            }
        } else {
            arrayList = null;
        }
        obj.A0m = arrayList;
        AudioMutingInfo audioMutingInfo = musicOverlayStickerModel.A00;
        if (audioMutingInfo != null) {
            c51699MsU = new C51699MsU();
            c51699MsU.A02 = audioMutingInfo.A02;
            c51699MsU.A03 = audioMutingInfo.A03;
            MusicMuteAudioReason musicMuteAudioReason = audioMutingInfo.A00;
            if (musicMuteAudioReason != null) {
                enumC39578Hdo = A03(musicMuteAudioReason);
            } else {
                enumC39578Hdo = null;
            }
            c51699MsU.A00 = enumC39578Hdo;
            String str2 = audioMutingInfo.A01;
            C14360o3.A0B(str2, 0);
            c51699MsU.A01 = str2;
            c51699MsU.A04 = audioMutingInfo.A04;
        } else {
            c51699MsU = null;
        }
        obj.A00 = c51699MsU;
        obj.A0Q = musicOverlayStickerModel.A0U;
        ImageUrl imageUrl = musicOverlayStickerModel.A03;
        if (imageUrl != null) {
            str = imageUrl.getUrl();
        } else {
            str = null;
        }
        obj.A0R = str;
        String url = musicOverlayStickerModel.A04.getUrl();
        C14360o3.A0B(url, 0);
        obj.A0S = url;
        obj.A0T = musicOverlayStickerModel.A0V;
        obj.A0U = musicOverlayStickerModel.A0W;
        obj.A0V = musicOverlayStickerModel.A0X;
        obj.A0I = musicOverlayStickerModel.A0M;
        obj.A0W = musicOverlayStickerModel.A0Y;
        List list2 = musicOverlayStickerModel.A0p;
        if (list2 != null) {
            arrayList2 = AbstractC167007dF.A0i(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                int ordinal = ((AudioMetadataLabels) it2.next()).ordinal();
                if (ordinal != 2) {
                    if (ordinal != 1) {
                        if (ordinal != 3) {
                            enumC68147VDp = EnumC68147VDp.A07;
                        } else {
                            enumC68147VDp = EnumC68147VDp.A06;
                        }
                    } else {
                        enumC68147VDp = EnumC68147VDp.A04;
                    }
                } else {
                    enumC68147VDp = EnumC68147VDp.A05;
                }
                arrayList2.add(enumC68147VDp);
            }
        } else {
            arrayList2 = null;
        }
        obj.A0n = arrayList2;
        obj.A0J = musicOverlayStickerModel.A0N;
        obj.A0X = musicOverlayStickerModel.A0Z;
        obj.A0Y = musicOverlayStickerModel.A0a;
        obj.A05 = musicOverlayStickerModel.A08;
        obj.A06 = musicOverlayStickerModel.A09;
        obj.A0o = musicOverlayStickerModel.A0q;
        String str3 = musicOverlayStickerModel.A0b;
        C14360o3.A0B(str3, 0);
        obj.A0Z = str3;
        User user = musicOverlayStickerModel.A05;
        if (user != null) {
            upu = AbstractC69972Vyn.A00(user);
        } else {
            upu = null;
        }
        obj.A01 = upu;
        obj.A0a = musicOverlayStickerModel.A0c;
        obj.A07 = musicOverlayStickerModel.A0A;
        obj.A08 = musicOverlayStickerModel.A0B;
        obj.A0q = musicOverlayStickerModel.A0s;
        obj.A0A = musicOverlayStickerModel.A0D;
        obj.A0B = musicOverlayStickerModel.A0E;
        obj.A0C = musicOverlayStickerModel.A0F;
        obj.A0b = musicOverlayStickerModel.A0d;
        MusicProduct musicProduct = musicOverlayStickerModel.A02;
        if (musicProduct != null) {
            switch (musicProduct.ordinal()) {
                case 2:
                    ved = VED.A04;
                    break;
                case 3:
                    ved = VED.A05;
                    break;
                case 4:
                    ved = VED.A06;
                    break;
                case 5:
                    ved = VED.A07;
                    break;
                case 6:
                    ved = VED.A08;
                    break;
                case 7:
                    ved = VED.A09;
                    break;
                case 8:
                    ved = VED.A0A;
                    break;
                case 9:
                    ved = VED.A0B;
                    break;
                case 10:
                    ved = VED.A0C;
                    break;
                case 11:
                    ved = VED.A0D;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case 16:
                case 17:
                default:
                    ved = VED.A0L;
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    ved = VED.A0E;
                    break;
                case 14:
                    ved = VED.A0F;
                    break;
                case Process.SIGTERM /* 15 */:
                    ved = VED.A0G;
                    break;
                case 18:
                    ved = VED.A0H;
                    break;
                case Process.SIGSTOP /* 19 */:
                    ved = VED.A0I;
                    break;
                case 20:
                    ved = VED.A0J;
                    break;
                case 21:
                    ved = VED.A0K;
                    break;
                case 22:
                    ved = VED.A0M;
                    break;
            }
        }
        obj.A03 = ved;
        obj.A0c = musicOverlayStickerModel.A0e;
        obj.A0K = musicOverlayStickerModel.A0O;
        obj.A0D = musicOverlayStickerModel.A0G;
        String str4 = musicOverlayStickerModel.A0f;
        C14360o3.A0B(str4, 0);
        obj.A0d = str4;
        obj.A0e = musicOverlayStickerModel.A0g;
        obj.A0f = musicOverlayStickerModel.A0h;
        obj.A0g = musicOverlayStickerModel.A0i;
        obj.A0E = musicOverlayStickerModel.A0H;
        obj.A0r = musicOverlayStickerModel.A0t;
        String str5 = musicOverlayStickerModel.A0j;
        C14360o3.A0B(str5, 0);
        obj.A0h = str5;
        MusicMuteAudioReason musicMuteAudioReason2 = musicOverlayStickerModel.A01;
        if (musicMuteAudioReason2 != null) {
            enumC39578Hdo2 = A03(musicMuteAudioReason2);
        }
        obj.A02 = enumC39578Hdo2;
        obj.A0F = musicOverlayStickerModel.A0J;
        obj.A0i = musicOverlayStickerModel.A0k;
        obj.A0j = musicOverlayStickerModel.A0l;
        obj.A0k = musicOverlayStickerModel.A0m;
        obj.A0L = musicOverlayStickerModel.A0P;
        obj.A0l = musicOverlayStickerModel.A0n;
        return obj;
    }

    public static final MusicMuteAudioReason A00(EnumC39578Hdo enumC39578Hdo) {
        int ordinal = enumC39578Hdo.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            return MusicMuteAudioReason.A09;
                        }
                        return MusicMuteAudioReason.A06;
                    }
                    return MusicMuteAudioReason.A05;
                }
                return MusicMuteAudioReason.A04;
            }
            return MusicMuteAudioReason.A07;
        }
        return MusicMuteAudioReason.A08;
    }

    public static final EnumC39578Hdo A03(MusicMuteAudioReason musicMuteAudioReason) {
        int ordinal = musicMuteAudioReason.ordinal();
        if (ordinal != 5) {
            if (ordinal != 4) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            return EnumC39578Hdo.A09;
                        }
                        return EnumC39578Hdo.A06;
                    }
                    return EnumC39578Hdo.A05;
                }
                return EnumC39578Hdo.A04;
            }
            return EnumC39578Hdo.A07;
        }
        return EnumC39578Hdo.A08;
    }

    public static final VE9 A05(EnumC138556Pl enumC138556Pl) {
        switch (enumC138556Pl.ordinal()) {
            case 0:
                return VE9.A0C;
            case 1:
                return VE9.A0B;
            case 2:
                return VE9.A06;
            case 3:
                return VE9.A04;
            case 4:
                return VE9.A05;
            case 5:
                return VE9.A08;
            case 6:
                return VE9.A07;
            case 7:
                return VE9.A0A;
            case 8:
            default:
                return VE9.A0F;
            case 9:
                return VE9.A09;
        }
    }
}
