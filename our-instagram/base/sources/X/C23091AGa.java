package X;

import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

/* renamed from: X.AGa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23091AGa {
    public static final C23091AGa A00 = new Object();

    public final MusicOverlayStickerModel A00(MusicProduct musicProduct, AudioOverlayTrack audioOverlayTrack, MusicAssetModel musicAssetModel, Integer num, String str, String str2) {
        int i;
        List list;
        C14360o3.A0B(musicAssetModel, 1);
        if (num != null) {
            i = num.intValue();
        } else {
            i = audioOverlayTrack.A02;
        }
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(musicAssetModel.A05());
        Integer valueOf3 = Integer.valueOf(audioOverlayTrack.A03);
        Integer valueOf4 = Integer.valueOf(audioOverlayTrack.A04);
        EnumC185288Jt enumC185288Jt = audioOverlayTrack.A05;
        if (enumC185288Jt != null) {
            list = AbstractC166987dD.A1J(new AudioFilterInfo(enumC185288Jt.A04));
        } else {
            list = null;
        }
        return AbstractC23129AMi.A01(musicProduct, musicAssetModel, valueOf, valueOf2, valueOf3, valueOf4, str, str2, list);
    }
}
