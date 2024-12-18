package X;

import java.io.File;

/* renamed from: X.1F4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1F4 {
    public final C1F2 A00;
    public final C1F2 A01;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1F2, java.io.File] */
    public C1F4(C1F2 c1f2) {
        this.A00 = c1f2;
        this.A01 = new File(c1f2.getParentFile(), AnonymousClass001.A0R(c1f2.getName(), ".tmp"));
    }
}
