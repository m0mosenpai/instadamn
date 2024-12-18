package X;

import android.media.MediaFormat;
import android.os.FileObserver;

/* loaded from: classes11.dex */
public final class WZ8 implements InterfaceC71993XEh {
    public int A00;
    public FileObserver A01;
    public boolean A02;
    public final VCK A03;
    public final InterfaceC71993XEh A04;
    public final boolean A05;

    @Override // X.InterfaceC71993XEh
    public final void AJA(String str) {
        this.A04.AJA(this.A03.getCanonicalPath());
    }

    @Override // X.InterfaceC71993XEh
    public final String BVz() {
        return this.A04.BVz();
    }

    @Override // X.InterfaceC71993XEh
    public final void EQ1(MediaFormat mediaFormat) {
        this.A04.EQ1(mediaFormat);
    }

    @Override // X.InterfaceC71993XEh
    public final void EaE(int i) {
        this.A04.EaE(i);
    }

    @Override // X.InterfaceC71993XEh
    public final void Egv(MediaFormat mediaFormat) {
        this.A04.Egv(mediaFormat);
    }

    @Override // X.InterfaceC71993XEh
    public final void FEO(XD8 xd8) {
        this.A04.FEO(xd8);
        this.A00++;
    }

    @Override // X.InterfaceC71993XEh
    public final void FEt(XD8 xd8) {
        this.A04.FEt(xd8);
        this.A00++;
    }

    @Override // X.InterfaceC71993XEh
    public final boolean isStarted() {
        return this.A02;
    }

    @Override // X.InterfaceC71993XEh
    public final void start() {
        this.A04.start();
        this.A02 = true;
        if (this.A05) {
            U93 u93 = new U93(this, this.A03.getPath());
            this.A01 = u93;
            u93.startWatching();
        }
    }

    @Override // X.InterfaceC71993XEh
    public final void stop() {
        this.A04.stop();
        this.A02 = false;
        VCK vck = this.A03;
        vck.A01 = true;
        synchronized (vck) {
        }
        synchronized (vck) {
        }
        FileObserver fileObserver = this.A01;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
    }

    public WZ8(VCK vck, InterfaceC71993XEh interfaceC71993XEh, boolean z) {
        this.A04 = interfaceC71993XEh;
        this.A03 = vck;
        this.A05 = z;
    }
}
