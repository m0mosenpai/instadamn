package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.0n0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13740n0 extends AbstractC20550zX {
    public final ArrayList A00;

    @Override // X.AbstractC20550zX
    public final void A01(long j, long j2) {
        super.A01(j, j2);
        this.A00.add(new C20540zW(j, j2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0zd, java.io.IOException] */
    public C13740n0() {
        super(new IOException("XZ Stream or its Index has grown too big"));
        this.A00 = new ArrayList();
    }
}
