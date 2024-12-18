package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.user.model.User;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.AMi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23129AMi {
    public static final MusicOverlayStickerModel A02(MusicProduct musicProduct, MusicAssetModel musicAssetModel, Integer num, Integer num2, String str) {
        return A01(musicProduct, musicAssetModel, num, null, num2, null, str, null, null);
    }

    public static final MusicOverlayStickerModel A03(MusicProduct musicProduct, MusicAssetModel musicAssetModel, Integer num, String str) {
        C14360o3.A0B(str, 2);
        return A02(musicProduct, musicAssetModel, num, Integer.valueOf(musicAssetModel.A05()), str);
    }

    public static final MusicDataSource A00(MusicOverlayStickerModel musicOverlayStickerModel) {
        String str;
        String str2;
        String str3 = musicOverlayStickerModel.A0g;
        String str4 = null;
        if (str3 != null && (str2 = musicOverlayStickerModel.A0W) != null) {
            String str5 = musicOverlayStickerModel.A0S;
            User user = musicOverlayStickerModel.A05;
            if (user != null) {
                str4 = user.getId();
            }
            return new MusicDataSource(null, AudioType.A03, str3, str2, str5, str4);
        }
        if (AbstractC166997dE.A1Z(musicOverlayStickerModel.A0D, true) && (str = musicOverlayStickerModel.A0d) != null) {
            android.net.Uri A0I = AbstractC167007dF.A0I(str);
            String str6 = musicOverlayStickerModel.A0S;
            User user2 = musicOverlayStickerModel.A05;
            if (user2 != null) {
                str4 = user2.getId();
            }
            return new MusicDataSource(A0I, AudioType.A03, null, null, str6, str4);
        }
        AbstractC12120kG.A0E("MusicOverlayStickerModel", AbstractC166997dE.A0z(AbstractC111324zv.A00(667), AbstractC166997dE.A1b(musicOverlayStickerModel.A0S, 1)), null);
        return new MusicDataSource();
    }

    public static final MusicOverlayStickerModel A01(MusicProduct musicProduct, MusicAssetModel musicAssetModel, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, List list) {
        String str3 = str2;
        String str4 = musicAssetModel.A09;
        boolean z = musicAssetModel.A0L;
        String str5 = musicAssetModel.A0E;
        String str6 = musicAssetModel.A0B;
        ImageUrl imageUrl = musicAssetModel.A03;
        ImageUrl imageUrl2 = musicAssetModel.A02;
        if (imageUrl2 == null) {
            imageUrl2 = new SimpleImageUrl("");
        }
        String str7 = musicAssetModel.A0C;
        String str8 = musicAssetModel.A0D;
        int i = musicAssetModel.A00;
        boolean z2 = musicAssetModel.A0O;
        List list2 = musicAssetModel.A0J;
        if (list2 == null) {
            list2 = C16930sl.A00;
        }
        if (str2 == null) {
            str3 = "";
        }
        User user = musicAssetModel.A06;
        boolean z3 = musicAssetModel.A0P;
        boolean z4 = musicAssetModel.A0Q;
        boolean z5 = musicAssetModel.A0R;
        boolean z6 = musicAssetModel.A0S;
        boolean z7 = musicAssetModel.A0T;
        boolean z8 = musicAssetModel.A0U;
        String str9 = musicAssetModel.A0F;
        String str10 = musicAssetModel.A0G;
        String str11 = musicAssetModel.A0H;
        String A0n = AbstractC166997dE.A0n();
        String str12 = musicAssetModel.A0I;
        return new MusicOverlayStickerModel(null, null, musicProduct, imageUrl, imageUrl2, user, false, false, Boolean.valueOf(z2), false, Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z7), Boolean.valueOf(z8), false, false, false, null, false, num3, num2, num4, Integer.valueOf(i), num, 0, str4, null, str5, str6, str, null, str7, null, str8, null, null, str3, null, str9, str10, "", str11, null, null, "", null, A0n, str12, null, list, null, list2, z, z6, false);
    }

    public static final String A04(MusicOverlayStickerModel musicOverlayStickerModel) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        C14360o3.A0A(A0A);
        A06(A0A, musicOverlayStickerModel);
        A0A.close();
        return AbstractC166987dD.A19(stringWriter);
    }

    public static final String A05(MusicOverlayStickerModel musicOverlayStickerModel) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        C14360o3.A0A(A0A);
        A07(A0A, musicOverlayStickerModel);
        A0A.close();
        return AbstractC166987dD.A19(stringWriter);
    }

    public static final void A06(AnonymousClass182 anonymousClass182, MusicOverlayStickerModel musicOverlayStickerModel) {
        String str;
        anonymousClass182.A0d();
        anonymousClass182.A0S("audio_asset_id", musicOverlayStickerModel.A0S);
        anonymousClass182.A0S("audio_cluster_id", musicOverlayStickerModel.A0T);
        int i = 0;
        anonymousClass182.A0Q(AbstractC111324zv.A00(740), AbstractC167017dG.A0K(musicOverlayStickerModel.A0K));
        anonymousClass182.A0Q(AbstractC111324zv.A00(107), AbstractC167017dG.A0K(musicOverlayStickerModel.A0M));
        Integer num = musicOverlayStickerModel.A0O;
        if (num != null) {
            i = num.intValue();
        }
        anonymousClass182.A0Q(AbstractC111324zv.A00(2848), i);
        anonymousClass182.A0S(AbstractC43591JPw.A00(811), musicOverlayStickerModel.A0U);
        MusicProduct musicProduct = musicOverlayStickerModel.A02;
        if (musicProduct == null || (str = AbstractC65993Txo.A00(musicProduct)) == null) {
            str = "";
        }
        anonymousClass182.A0S("product", str);
        anonymousClass182.A0S("song_name", musicOverlayStickerModel.A0m);
        anonymousClass182.A0S("artist_name", musicOverlayStickerModel.A0Y);
        anonymousClass182.A0S(MSV.A00(381), musicOverlayStickerModel.A0Q);
        anonymousClass182.A0a();
    }

    public static final void A07(AnonymousClass182 anonymousClass182, MusicOverlayStickerModel musicOverlayStickerModel) {
        anonymousClass182.A0d();
        anonymousClass182.A0S("original_media_id", musicOverlayStickerModel.A0e);
        anonymousClass182.A0S("audio_asset_id", musicOverlayStickerModel.A0S);
        int i = 0;
        anonymousClass182.A0Q(AbstractC111324zv.A00(5398), AbstractC167017dG.A0K(musicOverlayStickerModel.A0M));
        anonymousClass182.A0Q("start_time_in_audio_ms", AbstractC167017dG.A0K(musicOverlayStickerModel.A0K));
        Integer num = musicOverlayStickerModel.A0O;
        if (num != null) {
            i = num.intValue();
        }
        anonymousClass182.A0Q("duration_ms", i);
        anonymousClass182.A0a();
    }
}
