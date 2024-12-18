package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.Closeable;
import java.io.DataInputStream;
import java.util.Map;

/* loaded from: classes10.dex */
public final class THR implements Closeable {
    public boolean A00;
    public String[] A01;
    public final DataInputStream A02;
    public final Map A03;

    public static C72777Xmw A00(THR thr) {
        C72777Xmw c72777Xmw;
        C72777Xmw c72777Xmw2;
        DataInputStream dataInputStream = thr.A02;
        byte readByte = dataInputStream.readByte();
        String str = null;
        switch (readByte) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                c72777Xmw = null;
                str = thr.A01[dataInputStream.readShort()];
                c72777Xmw2 = null;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
                c72777Xmw2 = A00(thr);
                if (readByte == 13) {
                    c72777Xmw = A00(thr);
                    break;
                } else {
                    c72777Xmw = null;
                    break;
                }
            default:
                c72777Xmw2 = null;
                c72777Xmw = null;
                break;
        }
        return new C72777Xmw(c72777Xmw2, c72777Xmw, str, readByte);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A02.close();
    }

    public THR(DataInputStream dataInputStream, Map map) {
        this.A02 = dataInputStream;
        this.A03 = map;
    }
}
