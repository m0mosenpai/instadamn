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

/* loaded from: classes9.dex */
public final class MYQ {
    public MediaUploadMetadata A00;
    public final /* synthetic */ C47Z A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MYQ(C47Z c47z) {
        this();
        this.A01 = c47z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.OFu, java.lang.Object] */
    public static C54743OFu A00(EnumC114925Hg enumC114925Hg, C9C9 c9c9, C51760Mtj c51760Mtj, BrandedContentGatingInfo brandedContentGatingInfo, BrandedContentProjectMetadata brandedContentProjectMetadata, C1117351z c1117351z, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, MediaUploadMetadata mediaUploadMetadata, EnumC76383bi enumC76383bi, InstagramAudioApplySource instagramAudioApplySource, MusicOverlayStickerModel musicOverlayStickerModel, BrandedContentTag brandedContentTag, ClipInfo clipInfo, C55W c55w, A7Z a7z, C915647m c915647m, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, HashMap hashMap, HashMap hashMap2, List list, List list2, List list3, double d, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        ?? obj = new Object();
        obj.A0I = new C915647m();
        obj.A0M = false;
        obj.A0A = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
        obj.A04 = EnumC114925Hg.NONE;
        obj.A0Q = str3;
        obj.A08 = c1117351z;
        obj.A03 = i3;
        obj.A0a = list2;
        obj.A0F = clipInfo;
        obj.A00 = d;
        obj.A0g = z3;
        obj.A0k = z6;
        obj.A0I = c915647m;
        obj.A0B = enumC76383bi;
        obj.A0f = z2;
        obj.A0G = c55w;
        obj.A0X = hashMap;
        obj.A0h = z4;
        obj.A0R = str4;
        obj.A0J = bool;
        obj.A0E = brandedContentTag;
        obj.A0Z = list;
        obj.A06 = brandedContentGatingInfo;
        obj.A07 = brandedContentProjectMetadata;
        obj.A0j = z7;
        obj.A0e = z;
        obj.A0Y = hashMap2;
        obj.A0W = str9;
        obj.A02 = i2;
        obj.A01 = i;
        obj.A0P = str2;
        obj.A0D = musicOverlayStickerModel;
        obj.A05 = c9c9;
        obj.A0M = bool4;
        obj.A0T = str6;
        obj.A0L = bool3;
        obj.A0O = str;
        obj.A0C = instagramAudioApplySource;
        obj.A0U = str7;
        if (c51760Mtj != null) {
            obj.A0d = (List) c51760Mtj.A01;
            obj.A0N = (Integer) c51760Mtj.A02;
            obj.A0c = (List) c51760Mtj.A00;
        }
        obj.A0i = z5;
        obj.A0V = str8;
        obj.A0S = str5;
        obj.A0A = mediaUploadMetadata;
        obj.A0b = list3;
        obj.A09 = mediaGenAIDetectionMethod;
        obj.A0H = a7z;
        obj.A0K = bool2;
        obj.A04 = enumC114925Hg;
        return obj;
    }

    public MYQ() {
        this.A00 = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
    }
}
