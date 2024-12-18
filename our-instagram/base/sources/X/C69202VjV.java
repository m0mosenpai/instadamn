package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.VjV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69202VjV {
    public float A00;
    public final int A01;
    public final C66283U7d A02;
    public final Map A03;

    public C69202VjV(C66283U7d c66283U7d, int i, int i2) {
        C14360o3.A0B(c66283U7d, 3);
        this.A02 = c66283U7d;
        this.A03 = new HashMap();
        this.A01 = i2 < 1 ? 1 : i2;
        float f = i / i2;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 0.99f) {
            f = 0.99f;
        }
        this.A00 = f;
    }
}
