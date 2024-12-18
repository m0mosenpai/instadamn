package X;

import java.io.IOException;

/* renamed from: X.4Fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C93224Fy extends IOException {
    public final int A00;

    public C93224Fy(int i, Throwable th) {
        super(th);
        this.A00 = i;
    }

    public C93224Fy(String str, Throwable th, int i) {
        super(str, th);
        this.A00 = i;
    }

    public C93224Fy(String str, int i) {
        super(str);
        this.A00 = i;
    }

    public C93224Fy() {
        this.A00 = 2008;
    }
}
