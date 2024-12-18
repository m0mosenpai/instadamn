package X;

import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Nve, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54080Nve {
    public static final C54743OFu A00(C47Z c47z) {
        List list;
        String str;
        List list2;
        List list3;
        C14360o3.A0B(c47z, 0);
        BrandedContentGatingInfo brandedContentGatingInfo = null;
        if (c47z.A0v != null) {
            BrandedContentGatingInfo brandedContentGatingInfo2 = null;
            BrandedContentProjectMetadata brandedContentProjectMetadata = null;
            BrandedContentTag brandedContentTag = null;
            List list4 = null;
            boolean z = false;
            Boolean bool = null;
            List list5 = null;
            MediaUploadMetadata mediaUploadMetadata = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
            EnumC114925Hg enumC114925Hg = EnumC114925Hg.NONE;
            String str2 = c47z.A2Z;
            C1117351z c1117351z = c47z.A0u;
            int i = c47z.A0K;
            List list6 = c47z.A4G;
            C14360o3.A0B(list6, 0);
            ClipInfo clipInfo = c47z.A1N;
            C14360o3.A0B(clipInfo, 0);
            double d = c47z.A05;
            boolean z2 = c47z.A5F;
            boolean z3 = c47z.A62;
            C915647m c915647m = c47z.A1i;
            C14360o3.A0B(c915647m, 0);
            C55W c55w = c47z.A1a;
            HashMap hashMap = c47z.A44;
            HashMap hashMap2 = c47z.A46;
            String str3 = c47z.A2W;
            MusicOverlayStickerModel musicOverlayStickerModel = c47z.A1J;
            String str4 = c47z.A3C;
            C5QB c5qb = c47z.A18;
            if (c5qb != null) {
                list5 = c5qb.A02;
            }
            MediaGenAIDetectionMethod mediaGenAIDetectionMethod = c47z.A0w;
            boolean A0n = c47z.A0n();
            if (c47z.A5i) {
                bool = AbstractC166997dE.A0b();
            }
            List list7 = c47z.A4C;
            if (list7 != null) {
                list4 = list7;
            }
            BrandedContentTag A07 = c47z.A07();
            if (A07 != null) {
                brandedContentTag = A07;
            }
            BrandedContentGatingInfo brandedContentGatingInfo3 = c47z.A0s;
            if (brandedContentGatingInfo3 != null && (c47z.A5i || c47z.A0t != null || c47z.A0o() || c47z.A0w() || c47z.A0u())) {
                brandedContentGatingInfo2 = brandedContentGatingInfo3;
            }
            BrandedContentProjectMetadata brandedContentProjectMetadata2 = c47z.A0t;
            if (brandedContentProjectMetadata2 != null) {
                brandedContentProjectMetadata = brandedContentProjectMetadata2;
            }
            if (c47z.A51) {
                z = true;
            }
            String str5 = c47z.A3L;
            if (str5 != null) {
                List A0h = AbstractC31175DnJ.A0h(str5, "/");
                if (!A0h.isEmpty()) {
                    ListIterator A14 = AbstractC43592JPx.A14(A0h);
                    while (A14.hasPrevious()) {
                        if (AbstractC31176DnK.A02(A14) != 0) {
                            list3 = AbstractC31177DnL.A0k(A0h, A14);
                            break;
                        }
                    }
                }
                list3 = C16930sl.A00;
                list3.toArray(new String[0]);
            }
            return MYQ.A00(enumC114925Hg, null, null, brandedContentGatingInfo2, brandedContentProjectMetadata, c1117351z, mediaGenAIDetectionMethod, mediaUploadMetadata, null, null, musicOverlayStickerModel, brandedContentTag, clipInfo, c55w, null, c915647m, bool, null, null, null, null, str3, str2, null, null, str4, null, null, c47z.A3J, hashMap, hashMap2, list4, list6, list5, d, c47z.A0G, c47z.A0H, i, z, false, z2, false, false, z3, A0n);
        }
        BrandedContentProjectMetadata brandedContentProjectMetadata3 = null;
        BrandedContentTag brandedContentTag2 = null;
        List list8 = null;
        boolean z4 = false;
        String str6 = null;
        boolean z5 = false;
        Boolean bool2 = null;
        EnumC76383bi enumC76383bi = null;
        String str7 = c47z.A2Z;
        C1117351z c1117351z2 = c47z.A0u;
        int i2 = c47z.A0K;
        List list9 = c47z.A4G;
        C14360o3.A0B(list9, 0);
        ClipInfo clipInfo2 = c47z.A1N;
        C14360o3.A0B(clipInfo2, 0);
        double d2 = c47z.A05;
        boolean z6 = c47z.A5F;
        boolean z7 = c47z.A62;
        C915647m c915647m2 = c47z.A1i;
        C14360o3.A0B(c915647m2, 0);
        C55W c55w2 = c47z.A1a;
        HashMap hashMap3 = c47z.A44;
        HashMap hashMap4 = c47z.A46;
        String str8 = c47z.A2W;
        MusicOverlayStickerModel musicOverlayStickerModel2 = c47z.A1J;
        C9C9 c9c9 = c47z.A0k;
        Boolean valueOf = Boolean.valueOf(c47z.A67);
        String str9 = c47z.A3C;
        Boolean bool3 = c47z.A1z;
        String str10 = c47z.A2P;
        InstagramAudioApplySource instagramAudioApplySource = c47z.A1I;
        String str11 = c47z.A3D;
        C51760Mtj c51760Mtj = c47z.A0n;
        boolean z8 = c47z.A5e;
        String str12 = c47z.A3E;
        String str13 = c47z.A32;
        boolean z9 = c47z.A5A;
        MediaUploadMetadata mediaUploadMetadata2 = c47z.A13;
        C14360o3.A0B(mediaUploadMetadata2, 0);
        C5QB c5qb2 = c47z.A18;
        if (c5qb2 != null) {
            list = c5qb2.A02;
        } else {
            list = null;
        }
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod2 = c47z.A0w;
        A7Z a7z = c47z.A1c;
        Boolean bool4 = c47z.A1x;
        EnumC114925Hg enumC114925Hg2 = c47z.A0h;
        if (enumC114925Hg2 == null) {
            enumC114925Hg2 = EnumC114925Hg.NONE;
        }
        EnumC76383bi enumC76383bi2 = c47z.A1F;
        if (enumC76383bi2 != null && enumC76383bi2 != EnumC76383bi.A07) {
            enumC76383bi = enumC76383bi2;
        } else if (enumC76383bi2 == EnumC76383bi.A07 && (str = c47z.A2q) != null) {
            z5 = true;
            str6 = str;
        }
        boolean A0n2 = c47z.A0n();
        if (c47z.A5i) {
            bool2 = true;
        }
        List list10 = c47z.A4C;
        if (list10 != null) {
            list8 = list10;
        }
        BrandedContentTag A072 = c47z.A07();
        if (A072 != null) {
            brandedContentTag2 = A072;
        }
        BrandedContentGatingInfo brandedContentGatingInfo4 = c47z.A0s;
        if (brandedContentGatingInfo4 != null && (c47z.A5i || c47z.A0t != null || c47z.A0o() || c47z.A0w() || c47z.A0u())) {
            brandedContentGatingInfo = brandedContentGatingInfo4;
        }
        BrandedContentProjectMetadata brandedContentProjectMetadata4 = c47z.A0t;
        if (brandedContentProjectMetadata4 != null) {
            brandedContentProjectMetadata3 = brandedContentProjectMetadata4;
        }
        if (c47z.A51) {
            z4 = true;
        }
        String str14 = c47z.A3L;
        if (str14 != null) {
            List A0h2 = AbstractC31175DnJ.A0h(str14, "/");
            if (!A0h2.isEmpty()) {
                ListIterator A142 = AbstractC43592JPx.A14(A0h2);
                while (A142.hasPrevious()) {
                    if (AbstractC31176DnK.A02(A142) != 0) {
                        list2 = AbstractC31177DnL.A0k(A0h2, A142);
                        break;
                    }
                }
            }
            list2 = C16930sl.A00;
            list2.toArray(new String[0]);
        }
        return MYQ.A00(enumC114925Hg2, c9c9, c51760Mtj, brandedContentGatingInfo, brandedContentProjectMetadata3, c1117351z2, mediaGenAIDetectionMethod2, mediaUploadMetadata2, enumC76383bi, instagramAudioApplySource, musicOverlayStickerModel2, brandedContentTag2, clipInfo2, c55w2, a7z, c915647m2, bool2, bool4, bool3, valueOf, str10, str8, str7, str6, str13, str9, str11, str12, c47z.A3J, hashMap3, hashMap4, list8, list9, list, d2, c47z.A0G, c47z.A0H, i2, z4, z9, z6, z5, z8, z7, A0n2);
    }
}
