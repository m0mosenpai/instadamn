package X;

import android.util.Base64;
import java.util.Random;

/* renamed from: X.YDl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73442YDl implements InterfaceC216113n {
    public final int A00;

    public C73442YDl(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC216113n
    public final Object get() {
        byte[] bArr;
        Random random;
        switch (this.A00) {
            case 0:
                return new C73331Y8m();
            case 1:
                bArr = new byte[12];
                random = C73338Y8t.A09;
                random.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                bArr = new byte[12];
                random = YDS.A07;
                random.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
