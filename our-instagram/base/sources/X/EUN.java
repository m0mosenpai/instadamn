package X;

import android.util.LruCache;

/* loaded from: classes6.dex */
public final class EUN extends C1P1 {
    public final C1P1 A00;
    public final String A01;
    public final boolean A02;

    public EUN(C1P1 c1p1, String str, boolean z) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = c1p1;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -2066135287);
        this.A00.onFail(abstractC115105If);
        C0f9.A0A(-1739376890, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1717032774);
        this.A00.onFinish();
        C0f9.A0A(1278439295, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1796051547);
        this.A00.onStart();
        C0f9.A0A(-674861946, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        LruCache lruCache;
        int A03 = C0f9.A03(694543919);
        int A0N = AbstractC167017dG.A0N(obj, 1879860578);
        this.A00.onSuccess(obj);
        String str = this.A01;
        if (this.A02) {
            lruCache = C34934FaK.A02;
        } else {
            lruCache = C34934FaK.A01;
        }
        lruCache.put(str, obj);
        C0f9.A0A(1391187431, A0N);
        C0f9.A0A(1523565075, A03);
    }
}
