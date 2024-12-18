package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: X.NGn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52392NGn extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ InterfaceC58039PoP A04;
    public final /* synthetic */ AudioOverlayTrack A05;
    public final /* synthetic */ C49602Pt A06;
    public final /* synthetic */ File A07;
    public final /* synthetic */ ExecutorService A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52392NGn(Context context, UserSession userSession, InterfaceC58039PoP interfaceC58039PoP, AudioOverlayTrack audioOverlayTrack, C49602Pt c49602Pt, File file, ExecutorService executorService, int i, int i2) {
        super(578, 3, false, false);
        this.A02 = context;
        this.A03 = userSession;
        this.A06 = c49602Pt;
        this.A08 = executorService;
        this.A07 = file;
        this.A05 = audioOverlayTrack;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = interfaceC58039PoP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IOException iOException;
        Runnable pqc;
        C49602Pt c49602Pt = this.A06;
        File file = this.A07;
        AudioOverlayTrack audioOverlayTrack = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        InterfaceC58039PoP interfaceC58039PoP = this.A04;
        DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
        if (downloadedTrack == null) {
            iOException = MSW.A0y("Downloaded track not found for Audio Overlay");
        } else {
            int A00 = (downloadedTrack.A00(audioOverlayTrack.A03) + i) - i2;
            File A0w = MSW.A0w(c49602Pt.C5c(), "audio_overlay_video.mp4");
            try {
                AbstractC53914Nsn.A00(c49602Pt, file, AbstractC166987dD.A11(downloadedTrack.A02), A0w, A00);
                pqc = new PQC(interfaceC58039PoP, A0w);
            } catch (Throwable th) {
                if (th instanceof IOException) {
                    iOException = th;
                } else {
                    iOException = new IOException(th);
                }
            }
            C11T.A02(pqc);
        }
        pqc = new PQD(interfaceC58039PoP, iOException);
        C11T.A02(pqc);
    }
}
