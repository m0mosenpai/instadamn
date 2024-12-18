package X;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;

/* renamed from: X.WyK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC71667WyK implements Callable {
    public final int A00;
    public final int A01;
    public final C69438VnN A02;
    public final ByteArrayOutputStream A03;

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C69438VnN c69438VnN = this.A02;
        ByteArrayOutputStream byteArrayOutputStream = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        String str = c69438VnN.A08;
        if (str != null) {
            return c69438VnN.A04.A03(c69438VnN.A05, byteArrayOutputStream, str, i, i2);
        }
        return C70111W4i.A00(new IllegalArgumentException("transcodeImageV2: missing inputFilePath"));
    }

    public CallableC71667WyK(C69438VnN c69438VnN, ByteArrayOutputStream byteArrayOutputStream, int i, int i2) {
        this.A02 = c69438VnN;
        this.A03 = byteArrayOutputStream;
        this.A01 = i;
        this.A00 = i2;
    }
}
