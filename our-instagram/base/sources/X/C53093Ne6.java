package X;

import java.io.IOException;

/* renamed from: X.Ne6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53093Ne6 extends IOException {
    public final int A00;

    public C53093Ne6(int i, Throwable th) {
        super(AnonymousClass001.A05(i, "status ", ", ", th.getMessage()), th);
        this.A00 = i;
    }
}
