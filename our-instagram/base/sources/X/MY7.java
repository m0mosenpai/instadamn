package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class MY7 implements InterfaceC58194Pr0 {
    public MediaExtractor A00;

    @Override // X.InterfaceC58194Pr0
    public final int E8O(ByteBuffer byteBuffer, int i) {
        return this.A00.readSampleData(byteBuffer, 0);
    }

    @Override // X.InterfaceC58194Pr0
    public final boolean AAz() {
        return this.A00.advance();
    }

    @Override // X.InterfaceC58194Pr0
    public final int Bq6() {
        return this.A00.getSampleFlags();
    }

    @Override // X.InterfaceC58194Pr0
    public final long Bq8() {
        return this.A00.getSampleTime();
    }

    @Override // X.InterfaceC58194Pr0
    public final int Bq9() {
        return this.A00.getSampleTrackIndex();
    }

    @Override // X.InterfaceC58194Pr0
    public final int CA9() {
        return this.A00.getTrackCount();
    }

    @Override // X.InterfaceC58194Pr0
    public final MediaFormat CAD(int i) {
        return this.A00.getTrackFormat(i);
    }

    @Override // X.InterfaceC58194Pr0
    public final void EMi(long j, int i) {
        this.A00.seekTo(j, i);
    }

    @Override // X.InterfaceC58194Pr0
    public final void EMv(int i) {
        this.A00.selectTrack(i);
    }

    @Override // X.InterfaceC58194Pr0
    public void ESw(String str) {
        this.A00.setDataSource(str);
    }

    @Override // X.InterfaceC58194Pr0
    public void release() {
        this.A00.release();
    }
}
