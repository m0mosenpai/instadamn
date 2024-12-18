package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: X.5nx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126615nx implements InterfaceC26421Px {
    public final C23781El A00;
    public final byte[] A01;

    public C126615nx(C23781El c23781El, byte[] bArr) {
        C14360o3.A0B(bArr, 1);
        this.A01 = bArr;
        this.A00 = c23781El;
    }

    @Override // X.InterfaceC26421Px
    public final C23781El Aqy() {
        return null;
    }

    @Override // X.InterfaceC26421Px
    public final C23781El Ar8() {
        return this.A00;
    }

    @Override // X.InterfaceC26421Px
    public final InputStream E2i() {
        return new ByteArrayInputStream(this.A01);
    }

    @Override // X.InterfaceC26421Px
    public final long getContentLength() {
        return this.A01.length;
    }
}
