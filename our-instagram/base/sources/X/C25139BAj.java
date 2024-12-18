package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.io.File;

/* renamed from: X.BAj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25139BAj extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ C8JT A00;
    public final /* synthetic */ AudioOverlayTrack A01;
    public final /* synthetic */ DownloadedTrack A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25139BAj(C8JT c8jt, AudioOverlayTrack audioOverlayTrack, DownloadedTrack downloadedTrack) {
        super(4);
        this.A00 = c8jt;
        this.A01 = audioOverlayTrack;
        this.A02 = downloadedTrack;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        File file = (File) obj3;
        boolean A1a = AbstractC166987dD.A1a(obj4);
        int i = 0;
        if (A1a) {
            C8JT c8jt = this.A00;
            c8jt.A0b = false;
            c8jt.A0Q = file;
        }
        AudioOverlayTrack audioOverlayTrack = this.A01;
        int i2 = audioOverlayTrack.A03;
        EnumC185288Jt enumC185288Jt = audioOverlayTrack.A05;
        if (enumC185288Jt != null) {
            if (A1a) {
                i = (int) (i2 / enumC185288Jt.A01);
            }
        } else {
            i = i2;
        }
        C8JT c8jt2 = this.A00;
        if (file != null) {
            DownloadedTrack downloadedTrack = this.A02;
            int i3 = downloadedTrack.A01;
            int i4 = downloadedTrack.A00;
            String path = file.getPath();
            C14360o3.A07(path);
            DownloadedTrack downloadedTrack2 = new DownloadedTrack(path, i3, i4);
            int i5 = audioOverlayTrack.A02;
            int i6 = audioOverlayTrack.A04;
            int i7 = audioOverlayTrack.A01;
            String str = audioOverlayTrack.A0B;
            String str2 = audioOverlayTrack.A0A;
            String str3 = audioOverlayTrack.A0E;
            MusicBrowseCategory musicBrowseCategory = audioOverlayTrack.A09;
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            audioOverlayTrack = new AudioOverlayTrack(audioOverlayTrack.A05, downloadedTrack2, audioOverlayTrack.A07, musicAssetModel, musicBrowseCategory, str, str2, str3, audioOverlayTrack.A0C, audioOverlayTrack.A00, i, i5, i6, i7);
        }
        if (c8jt2.A0i) {
            c8jt2.A0O = audioOverlayTrack;
        } else {
            c8jt2.A1d.A00();
            c8jt2.A1X.A05(c8jt2.A1m.A00(), audioOverlayTrack);
            C8JT.A0X(c8jt2);
        }
        return C0eB.A00;
    }
}
