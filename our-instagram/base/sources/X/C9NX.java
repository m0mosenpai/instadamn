package X;

import com.instagram.api.schemas.AudioFilterType;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;

/* renamed from: X.9NX, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9NX {
    public static final AudioOverlayTrack A00(MusicAttributionConfig musicAttributionConfig, int i) {
        int i2;
        EnumC185288Jt enumC185288Jt;
        C14360o3.A0B(musicAttributionConfig, 0);
        MusicAssetModel musicAssetModel = musicAttributionConfig.A02;
        if (musicAssetModel == null) {
            return null;
        }
        int i3 = musicAssetModel.A00;
        if (i3 > i) {
            i3 = i;
        }
        if (i3 <= 0 || (i2 = musicAttributionConfig.A00) < 0) {
            return null;
        }
        AudioOverlayTrack audioOverlayTrack = new AudioOverlayTrack(musicAssetModel, i2, i3);
        AudioFilterType audioFilterType = musicAttributionConfig.A01;
        if (audioFilterType != null) {
            EnumC185288Jt[] values = EnumC185288Jt.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    enumC185288Jt = values[i4];
                    if (enumC185288Jt.A04 == audioFilterType) {
                        break;
                    }
                    i4++;
                } else {
                    enumC185288Jt = null;
                    break;
                }
            }
            int i5 = audioOverlayTrack.A03;
            int i6 = audioOverlayTrack.A02;
            int i7 = audioOverlayTrack.A04;
            int i8 = audioOverlayTrack.A01;
            String str = audioOverlayTrack.A0B;
            String str2 = audioOverlayTrack.A0A;
            String str3 = audioOverlayTrack.A0E;
            MusicBrowseCategory musicBrowseCategory = audioOverlayTrack.A09;
            MusicAssetModel musicAssetModel2 = audioOverlayTrack.A08;
            return new AudioOverlayTrack(enumC185288Jt, audioOverlayTrack.A06, audioOverlayTrack.A07, musicAssetModel2, musicBrowseCategory, str, str2, str3, audioOverlayTrack.A0C, audioOverlayTrack.A00, i5, i6, i7, i8);
        }
        return audioOverlayTrack;
    }
}
