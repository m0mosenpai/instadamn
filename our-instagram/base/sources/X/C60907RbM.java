package X;

import com.facebook.proxygen.ReadBuffer;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.RbM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60907RbM extends RcZ {
    public final /* synthetic */ C64119Szb A00;

    public C60907RbM(C64119Szb c64119Szb) {
        this.A00 = c64119Szb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4096);
            C64119Szb c64119Szb = this.A00;
            ReadBuffer readBuffer = c64119Szb.A06;
            int size = readBuffer.size();
            c64119Szb.A00 += size;
            while (size > 0) {
                int read = readBuffer.read(allocate.array(), 0, 4096);
                allocate.limit(read);
                size -= read;
                c64119Szb.A00 += read;
                allocate.rewind();
                c64119Szb.A02.onBody(allocate);
                allocate.clear();
            }
        } catch (IOException | IllegalStateException e) {
            C0w9.A07("LigerAsyncInterface_body", e);
        }
    }

    public final String toString() {
        return AnonymousClass001.A0R("LigerAsyncResponseHandler.onBody: ", this.A00.A08.A09.toString());
    }
}
