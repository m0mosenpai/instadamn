package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class TFR implements InterfaceC26421Px {
    public final C23781El A00;
    public final InputStream A01;
    public final AtomicBoolean A02 = AbstractC166997dE.A17();

    @Override // X.InterfaceC26421Px
    public final C23781El Aqy() {
        return null;
    }

    @Override // X.InterfaceC26421Px
    public final long getContentLength() {
        return -1L;
    }

    @Override // X.InterfaceC26421Px
    public final C23781El Ar8() {
        return this.A00;
    }

    @Override // X.InterfaceC26421Px
    public final InputStream E2i() {
        if (this.A02.getAndSet(true)) {
            C0K8.A0C("IgMsysStreamingUploadRequestBody", "openInputStream called more than once");
            return new ByteArrayInputStream(new byte[0]);
        }
        return this.A01;
    }

    public TFR(C23781El c23781El, InputStream inputStream) {
        this.A00 = c23781El;
        this.A01 = inputStream;
    }
}
