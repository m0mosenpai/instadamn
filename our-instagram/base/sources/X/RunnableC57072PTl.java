package X;

import com.facebook.cvat.ctaudiosync.CTAudioSync;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.PTl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57072PTl implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8JT A01;
    public final /* synthetic */ C115475Kh A02;
    public final /* synthetic */ C84B A03;
    public final /* synthetic */ AudioOverlayTrack A04;
    public final /* synthetic */ DownloadedTrack A05;

    public RunnableC57072PTl(C8JT c8jt, C115475Kh c115475Kh, C84B c84b, AudioOverlayTrack audioOverlayTrack, DownloadedTrack downloadedTrack, int i) {
        this.A01 = c8jt;
        this.A05 = downloadedTrack;
        this.A04 = audioOverlayTrack;
        this.A02 = c115475Kh;
        this.A03 = c84b;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        String str;
        C8JT c8jt = this.A01;
        DownloadedTrack downloadedTrack = this.A05;
        AudioOverlayTrack audioOverlayTrack = this.A04;
        C115475Kh c115475Kh = this.A02;
        C84B c84b = this.A03;
        int i = this.A00;
        C14360o3.A0B(c115475Kh, 2);
        long A00 = downloadedTrack.A00(audioOverlayTrack.A03) * 1000;
        long j2 = 0;
        if (c84b != null) {
            j = c84b.A00 * 1000;
        } else {
            j = 0;
        }
        long j3 = A00 + j;
        CTAudioSync cTAudioSync = new CTAudioSync();
        try {
            long j4 = i;
            int assetOffsetInMs = cTAudioSync.getAssetOffsetInMs(AbstractC43592JPx.A0x(AbstractC166987dD.A11(downloadedTrack.A02)), c115475Kh.A0G.A0F, j3, j3 + (1000 * j4), 0L, 0L);
            if (Math.abs(assetOffsetInMs) > i) {
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("AudioSync - invalid offset", AnonymousClass001.A02(assetOffsetInMs, i, "Offset: ", " ReelsDuration: "));
                AbstractC12120kG.A0I("ClipsCaptureControllerImpl", null, A1G);
            }
            C22C A01 = AnonymousClass229.A01(c8jt.A1D);
            String str2 = audioOverlayTrack.A0B;
            Long valueOf = Long.valueOf(j4);
            if (c84b != null) {
                j2 = MSW.A06(c84b);
            }
            Long valueOf2 = Long.valueOf(j2);
            long j5 = assetOffsetInMs;
            long floor = (long) Math.floor(cTAudioSync.getProcessingTime());
            boolean wasConfident = cTAudioSync.getWasConfident();
            long floor2 = (long) Math.floor(cTAudioSync.refSampleRate);
            String str3 = ((C22F) A01).A04.A0L;
            double maxCrestFactor = cTAudioSync.getMaxCrestFactor();
            C18920wW c18920wW = ((C22F) A01).A01;
            C14360o3.A0B(c18920wW, 9);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "audiosync_on_reels");
            if (A0f.isSampled()) {
                A0f.A9K("syncing_offset", Long.valueOf(j5));
                A0f.A9K(AbstractC111324zv.A00(5166), valueOf);
                A0f.A9K("processing_time", Long.valueOf(floor));
                A0f.A7v("was_confident", Boolean.valueOf(wasConfident));
                A0f.A9K("mic_sample_rate", Long.valueOf(floor2));
                A0f.AAP("music_id_str", str2);
                MSW.A1U(A0f, str3);
                A0f.A8I("max_crest_factor", Double.valueOf(maxCrestFactor));
                A0f.A9K("clip_index", valueOf2);
                A0f.Cht();
            }
        } catch (IOException e) {
            e = e;
            str = "Failure to process AudioSync";
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", str, e);
        } catch (Exception e2) {
            e = e2;
            str = "Unexpected failure to process AudioSync";
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", str, e);
        }
    }
}
