package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.io.File;

/* renamed from: X.8Kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185488Kq implements InterfaceC185498Kr {
    public C1815383g A01;
    public AudioOverlayTrack A03;
    public boolean A04;
    public C190338br A05;
    public final UserSession A07;
    public final C185478Kp A08;
    public final Context A09;
    public final Handler A06 = new Handler(Looper.getMainLooper());
    public EnumC1828489f A02 = EnumC1828489f.A09;
    public int A00 = Integer.MIN_VALUE;

    public final void A05(EnumC1828489f enumC1828489f, AudioOverlayTrack audioOverlayTrack) {
        DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
        File file = null;
        if (downloadedTrack == null) {
            AbstractC12120kG.A07("BackingTrackPlayerController", "null downloaded track", null);
        }
        this.A03 = audioOverlayTrack;
        this.A02 = enumC1828489f;
        if (downloadedTrack != null) {
            file = new File(downloadedTrack.A02);
        }
        android.net.Uri fromFile = android.net.Uri.fromFile(file);
        C190338br A01 = A01(this);
        C14360o3.A0A(fromFile);
        float f = 1.0f / enumC1828489f.A00;
        C14360o3.A0B(fromFile, 0);
        if (!A01.A00) {
            A01.A04.A00();
            String hexString = Integer.toHexString(fromFile.hashCode());
            C95334Qt c95334Qt = A01.A05;
            c95334Qt.ESy(fromFile, null, hexString, "IgVideoPlayerBasedRecordingBackingTrackPlayer", false, true);
            c95334Qt.E5Q(null, null);
            c95334Qt.A07(f);
            A01.A01.A00.A08.A00.A1h.A03();
            A03(this, true);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // X.InterfaceC185498Kr
    public final void D7s(int i) {
        A03(this, false);
    }

    private final int A00() {
        int i;
        int i2;
        int A01;
        int i3;
        DownloadedTrack downloadedTrack;
        OriginalAudioSubtype originalAudioSubtype = null;
        if (this.A03 == null) {
            AbstractC12120kG.A07("BackingTrackPlayerController", "null audio overlay track", null);
        }
        AudioOverlayTrack audioOverlayTrack = this.A03;
        if (audioOverlayTrack != null && (downloadedTrack = audioOverlayTrack.A06) != null) {
            i = downloadedTrack.A00(audioOverlayTrack.A03);
        } else {
            AbstractC12120kG.A07("BackingTrackPlayerController", "null downloaded track", null);
            i = 0;
        }
        int A00 = C8KL.A00(this.A07);
        C8JT c8jt = this.A08.A00;
        AudioOverlayTrack audioOverlayTrack2 = c8jt.A0N;
        int i4 = 0;
        if (audioOverlayTrack2 != null) {
            MusicAssetModel musicAssetModel = audioOverlayTrack2.A08;
            if (musicAssetModel != null) {
                originalAudioSubtype = musicAssetModel.A01;
            }
            if (originalAudioSubtype != OriginalAudioSubtype.A06 && AbstractC185298Jv.A00(c8jt.A1D)) {
                int i5 = ClipsCreationViewModel.A00(c8jt.A1n).A00;
                AudioOverlayTrack audioOverlayTrack3 = c8jt.A0N;
                if (audioOverlayTrack3 != null) {
                    i4 = audioOverlayTrack3.A04;
                }
                int i6 = i5 - i4;
                if (audioOverlayTrack3 != null) {
                    i3 = audioOverlayTrack3.A02;
                } else {
                    i3 = 1;
                }
                i2 = i6 % i3;
                float f = this.A02.A00;
                if (c8jt.A02 != -1 && !c8jt.A1F.A0W(C81W.A0J)) {
                    A01 = 0;
                } else {
                    A01 = C1H4.A01(A00 * (1.0f / f));
                }
                return (i + i2) - A01;
            }
        }
        int A012 = C80G.A01(c8jt.A0J);
        AudioOverlayTrack audioOverlayTrack4 = c8jt.A0N;
        if (audioOverlayTrack4 != null) {
            i4 = audioOverlayTrack4.A04;
        }
        i2 = A012 - i4;
        float f2 = this.A02.A00;
        if (c8jt.A02 != -1) {
        }
        A01 = C1H4.A01(A00 * (1.0f / f2));
        return (i + i2) - A01;
    }

    public static final C190338br A01(C185488Kq c185488Kq) {
        C190338br c190338br = c185488Kq.A05;
        if (c190338br == null) {
            Context context = c185488Kq.A09;
            UserSession userSession = c185488Kq.A07;
            c190338br = new C190338br(context, userSession, new C208579Kr(c185488Kq), new C677933t(null, userSession, "IgVideoPlayerBasedRecordingBackingTrackPlayer", "RecordingBackingTrackPlayer", false));
            c185488Kq.A05 = c190338br;
        }
        C1815383g c1815383g = c185488Kq.A01;
        if (c1815383g != null) {
            c190338br.A02.A00 = c1815383g;
        }
        return c190338br;
    }

    public static final void A02(C185488Kq c185488Kq, int i) {
        c185488Kq.A00 = i;
        int max = Math.max(i, 0);
        C190338br A01 = A01(c185488Kq);
        if (!A01.A00) {
            A01.A05.seekTo(max);
            A01.A04.A00();
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final void A03(C185488Kq c185488Kq, boolean z) {
        AudioOverlayTrack audioOverlayTrack = c185488Kq.A03;
        if (audioOverlayTrack != null) {
            boolean A00 = AbstractC185298Jv.A00(c185488Kq.A07);
            int A002 = c185488Kq.A00();
            if (A00) {
                A002 = Math.min(A002, audioOverlayTrack.A02);
            }
            if (A002 != c185488Kq.A00 || z) {
                A02(c185488Kq, A002);
            }
        }
    }

    public final void A04() {
        C190338br c190338br = this.A05;
        if (c190338br != null && !c190338br.A00) {
            c190338br.A04.A00();
            c190338br.A05.EE5(false);
            c190338br.A00 = true;
        }
        this.A05 = null;
        this.A03 = null;
        this.A02 = EnumC1828489f.A09;
        this.A00 = Integer.MIN_VALUE;
    }

    public C185488Kq(Context context, UserSession userSession, C185478Kp c185478Kp) {
        this.A09 = context;
        this.A07 = userSession;
        this.A08 = c185478Kp;
    }
}
