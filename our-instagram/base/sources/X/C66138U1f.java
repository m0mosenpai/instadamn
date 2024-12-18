package X;

import java.util.HashSet;

/* renamed from: X.U1f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66138U1f implements GXH {
    public final XB8 A00;
    public final java.util.Set A01 = new HashSet();

    public final String A00(String str) {
        return AnonymousClass001.A0T(this.A00.E6U(), str, ':');
    }

    @Override // X.GXH
    public final boolean AHA(String str) {
        return this.A01.add(A00(str));
    }

    public C66138U1f(XB8 xb8) {
        this.A00 = xb8;
    }
}
