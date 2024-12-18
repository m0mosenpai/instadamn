package X;

import android.util.LruCache;

/* renamed from: X.9IA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9IA implements BCX {
    public C9IB A00;
    public final LruCache A01 = new C9IM(this);

    @Override // X.BCX
    public final C124005jE EEg(String str) {
        C14360o3.A0B(str, 0);
        return (C124005jE) this.A01.remove(str);
    }

    @Override // X.BCX
    public final void E71(C124005jE c124005jE, String str) {
        AbstractC167017dG.A1N(str, c124005jE);
        this.A01.put(str, c124005jE);
    }
}
