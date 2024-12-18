package X;

import java.nio.ByteBuffer;

/* renamed from: X.Stw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63802Stw implements InterfaceC65476Tkt {
    public final /* synthetic */ C63824SuI A00;

    public C63802Stw(C63824SuI c63824SuI) {
        this.A00 = c63824SuI;
    }

    @Override // X.InterfaceC65476Tkt
    public final Class Avg() {
        return ByteBuffer.class;
    }

    @Override // X.InterfaceC65476Tkt
    public final /* bridge */ /* synthetic */ Object AK3(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }
}
