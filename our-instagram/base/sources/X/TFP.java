package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class TFP implements InterfaceC26421Px {
    public final byte[] A00;
    public final C23781El A01;

    @Override // X.InterfaceC26421Px
    public final C23781El Aqy() {
        return null;
    }

    @Override // X.InterfaceC26421Px
    public final C23781El Ar8() {
        return this.A01;
    }

    @Override // X.InterfaceC26421Px
    public final InputStream E2i() {
        return new ByteArrayInputStream(this.A00);
    }

    @Override // X.InterfaceC26421Px
    public final long getContentLength() {
        return this.A00.length;
    }

    public TFP(String str, String str2) {
        this.A00 = str.getBytes("ISO-8859-1");
        this.A01 = new C23781El("Content-Type", str2);
    }
}
