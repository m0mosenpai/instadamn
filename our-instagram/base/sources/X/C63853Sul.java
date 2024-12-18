package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.Sul, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63853Sul implements InterfaceC65561Tmh {
    public final ByteBuffer A00;
    public final C63361SiK A01;
    public final List A02;

    @Override // X.InterfaceC65561Tmh
    public final void EoZ() {
    }

    @Override // X.InterfaceC65561Tmh
    public final Bitmap ANq(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(new C61041ReD((ByteBuffer) this.A00.position(0)), null, options);
    }

    @Override // X.InterfaceC65561Tmh
    public final int BGk() {
        List list = this.A02;
        ByteBuffer byteBuffer = (ByteBuffer) this.A00.position(0);
        C63361SiK c63361SiK = this.A01;
        if (byteBuffer != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    int BZg = ((InterfaceC65557Tmd) list.get(i)).BZg(c63361SiK, byteBuffer);
                    if (BZg != -1) {
                        return BZg;
                    }
                } finally {
                    byteBuffer.position(0);
                }
            }
        }
        return -1;
    }

    @Override // X.InterfaceC65561Tmh
    public final ImageHeaderParser$ImageType BGr() {
        return AbstractC63044SbN.A02((ByteBuffer) this.A00.position(0), this.A02);
    }

    public C63853Sul(C63361SiK c63361SiK, ByteBuffer byteBuffer, List list) {
        this.A00 = byteBuffer;
        this.A02 = list;
        this.A01 = c63361SiK;
    }
}
