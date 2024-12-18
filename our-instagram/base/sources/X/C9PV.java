package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicBrowseCategory;

/* renamed from: X.9PV, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9PV {
    public static final C5JH A00(Context context, AudioOverlayTrack audioOverlayTrack, float f) {
        String str;
        MediaEffect mediaEffect;
        float f2;
        C14360o3.A0B(audioOverlayTrack, 0);
        DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
        Float f3 = null;
        if (downloadedTrack == null) {
            return null;
        }
        String str2 = downloadedTrack.A02;
        int A00 = downloadedTrack.A00(audioOverlayTrack.A03);
        int i = audioOverlayTrack.A04;
        int i2 = audioOverlayTrack.A01;
        int i3 = -1;
        if (i2 != 0) {
            i3 = i2 - i;
        }
        MusicBrowseCategory musicBrowseCategory = audioOverlayTrack.A09;
        if (musicBrowseCategory != null) {
            str = musicBrowseCategory.A04;
        } else {
            str = null;
        }
        C5JI c5ji = C5JI.A04;
        String str3 = audioOverlayTrack.A0D;
        EnumC185288Jt enumC185288Jt = audioOverlayTrack.A05;
        if (enumC185288Jt != null) {
            mediaEffect = enumC185288Jt.A00(context);
        } else {
            mediaEffect = null;
        }
        EnumC185288Jt enumC185288Jt2 = audioOverlayTrack.A05;
        if (enumC185288Jt2 != null) {
            f2 = enumC185288Jt2.A01;
            f3 = enumC185288Jt2.A05;
        } else {
            f2 = 1.0f;
        }
        return new C5JH(mediaEffect, c5ji, f3, str2, str, str3, f, f2, A00, i, i3);
    }
}
