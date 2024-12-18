package X;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.Tag, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64957Tag extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C1S9 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64957Tag(C1S9 c1s9) {
        super(0);
        this.A00 = c1s9;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4096);
            C14360o3.A07(allocate);
            C1S9 c1s9 = this.A00;
            C61038ReA c61038ReA = c1s9.A00;
            if (c61038ReA != null) {
                int read = c61038ReA.read(allocate.array());
                while (read > 0) {
                    allocate.limit(read);
                    allocate.rewind();
                    c1s9.A0F(allocate);
                    allocate.clear();
                    C61038ReA c61038ReA2 = c1s9.A00;
                    if (c61038ReA2 == null) {
                        break;
                    }
                    read = c61038ReA2.read(allocate.array());
                }
            }
        } catch (IOException unused) {
        }
        return C0eB.A00;
    }
}
