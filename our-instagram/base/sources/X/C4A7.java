package X;

import java.io.Closeable;

/* renamed from: X.4A7, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4A7 implements Closeable, InterfaceC13050lr {
    public final String A00;
    public final C19L A01;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AnonymousClass194.A05(null, this.A01);
    }

    @Override // X.InterfaceC13050lr
    public void onUserSessionWillEnd(boolean z) {
        if (this instanceof C92904Eg) {
            C92904Eg c92904Eg = (C92904Eg) this;
            c92904Eg.close();
            c92904Eg.A03.A01();
            return;
        }
        close();
    }

    public C4A7(String str, C19L c19l) {
        this.A01 = c19l;
        this.A00 = str;
    }
}
