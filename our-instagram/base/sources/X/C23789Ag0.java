package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import java.io.File;

/* renamed from: X.Ag0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23789Ag0 implements InterfaceC57936Pmg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C8JT A02;
    public final /* synthetic */ C22999ABy A03;

    public C23789Ag0(C8JT c8jt, C22999ABy c22999ABy, int i, int i2) {
        this.A03 = c22999ABy;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c8jt;
    }

    @Override // X.InterfaceC57936Pmg
    public final void Cxw(String str) {
        Runnable runnableC24661Avv;
        if (str == null) {
            runnableC24661Avv = new RunnableC24409Arq(this.A02);
        } else {
            C22999ABy c22999ABy = this.A03;
            c22999ABy.A0A = str;
            c22999ABy.A0B = str;
            AudioOverlayTrack audioOverlayTrack = new AudioOverlayTrack(c22999ABy.A00(), this.A01, this.A00);
            File A11 = AbstractC166987dD.A11(str);
            C14360o3.A0B(A11, 0);
            String path = A11.getPath();
            C14360o3.A07(path);
            audioOverlayTrack.A06 = new DownloadedTrack(path, -1, -1);
            runnableC24661Avv = new RunnableC24661Avv(this.A02, audioOverlayTrack);
        }
        C11T.A02(runnableC24661Avv);
    }
}
