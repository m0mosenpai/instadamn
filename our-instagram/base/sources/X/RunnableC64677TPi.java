package X;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: X.TPi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64677TPi implements Runnable {
    public final /* synthetic */ SPI A00;
    public final /* synthetic */ QF6 A01;
    public final /* synthetic */ String A02;

    public RunnableC64677TPi(SPI spi, QF6 qf6, String str) {
        this.A00 = spi;
        this.A01 = qf6;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SPI spi = this.A00;
        QF6 qf6 = this.A01;
        String str = this.A02;
        Charset charset = StandardCharsets.UTF_8;
        C14360o3.A08(charset);
        String encodeToString = Base64.encodeToString(AbstractC58318PtA.A1a(str, charset), 2);
        C14360o3.A07(encodeToString);
        spi.A01(qf6, encodeToString);
    }
}
