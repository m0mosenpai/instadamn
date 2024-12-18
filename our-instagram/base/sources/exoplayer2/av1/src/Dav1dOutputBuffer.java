package exoplayer2.av1.src;

import X.AbstractC117285Sn;
import X.AbstractC96104Tt;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class Dav1dOutputBuffer extends AbstractC117285Sn {
    public ColorInfo colorInfo;
    public ByteBuffer data;
    public int height;
    public final Dav1dDecoder owner;
    public int width;
    public int bufferId = -1;
    public int mode = -1;

    @Override // X.AbstractC96104Tt
    public void clear() {
        if (this.bufferId != -1 && this.mode == 0) {
            this.owner.releaseOutputBufferInternalDav1d(this);
        }
        ((AbstractC96104Tt) this).A00 = 0;
    }

    public boolean initForRgb(int i, int i2) {
        int i3;
        this.width = i;
        this.height = i2;
        if (i >= 0 && i2 >= 0) {
            if ((i2 <= 0 || i < Integer.MAX_VALUE / i2) && (i3 = i * i2) >= 0 && i3 < 1073741823) {
                int i4 = i3 * 2;
                ByteBuffer byteBuffer = this.data;
                if (byteBuffer != null && byteBuffer.capacity() >= i4) {
                    this.data.position(0);
                    this.data.limit(i4);
                    return true;
                }
                this.data = ByteBuffer.allocateDirect(i4);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean initForYuvSurface(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.bufferId = i3;
        return true;
    }

    @Override // X.AbstractC117285Sn
    public void release() {
        this.owner.A05(this);
    }

    public Dav1dOutputBuffer(Dav1dDecoder dav1dDecoder) {
        this.owner = dav1dDecoder;
    }
}
