package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: X.Pyj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58615Pyj implements InterfaceC65673Tr3 {
    public final String A00;
    public final byte[] A01;

    @Override // X.InterfaceC65527Tlw
    public final long Ch9() {
        return this.A01.length;
    }

    @Override // X.InterfaceC65527Tlw
    public final InputStream E2i() {
        return new ByteArrayInputStream(this.A01);
    }

    @Override // X.InterfaceC65673Tr3
    public final String getContentType() {
        return "application/octet-stream";
    }

    @Override // X.InterfaceC65673Tr3
    public final String getName() {
        return this.A00;
    }

    public C58615Pyj(String str, byte[] bArr) {
        this.A00 = str;
        this.A01 = bArr;
    }
}
