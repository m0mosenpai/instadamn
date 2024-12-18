package X;

import java.nio.ByteBuffer;

/* renamed from: X.Stb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63781Stb implements InterfaceC65473Tkq {
    public final ByteBuffer A00;

    @Override // X.InterfaceC65473Tkq
    public final void cleanup() {
    }

    @Override // X.InterfaceC65473Tkq
    public final /* bridge */ /* synthetic */ Object EL4() {
        ByteBuffer byteBuffer = this.A00;
        byteBuffer.position(0);
        return byteBuffer;
    }

    public C63781Stb(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }
}
