package X;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes10.dex */
public final class TFQ implements InterfaceC26421Px {
    public final C23781El A00;
    public final InputStream A01;

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
        return this.A01;
    }

    @Override // X.InterfaceC26421Px
    public final long getContentLength() {
        FileInputStream fileInputStream;
        FileChannel channel;
        InputStream inputStream = this.A01;
        if ((inputStream instanceof FileInputStream) && (fileInputStream = (FileInputStream) inputStream) != null && (channel = fileInputStream.getChannel()) != null) {
            return channel.size();
        }
        return 0L;
    }

    public TFQ(C23781El c23781El, InputStream inputStream) {
        this.A00 = c23781El;
        this.A01 = inputStream;
    }
}
