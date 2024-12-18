package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class TFO implements InterfaceC26421Px {
    public final /* synthetic */ String A00;

    public TFO(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC26421Px
    public final C23781El Aqy() {
        return new C23781El("Content-Encoding", "gzip");
    }

    @Override // X.InterfaceC26421Px
    public final C23781El Ar8() {
        return new C23781El("Content-Type", "application/json");
    }

    @Override // X.InterfaceC26421Px
    public final InputStream E2i() {
        return new ByteArrayInputStream(MSY.A1a(this.A00));
    }

    @Override // X.InterfaceC26421Px
    public final long getContentLength() {
        return this.A00.length();
    }
}
