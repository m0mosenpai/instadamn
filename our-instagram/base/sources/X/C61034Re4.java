package X;

import java.io.IOException;

/* renamed from: X.Re4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C61034Re4 extends IOException {
    public final int A00;

    public C61034Re4(int i, Throwable th) {
        super(th);
        this.A00 = i;
    }

    public C61034Re4(String str, Throwable th, int i) {
        super(str, th);
        this.A00 = i;
    }

    public C61034Re4() {
        this.A00 = 2008;
    }
}
