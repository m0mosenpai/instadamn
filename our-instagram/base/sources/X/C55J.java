package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.55J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C55J implements C0TR {
    public final int A03;
    public final C0JO A04;
    public long A02 = 0;
    public int A01 = -1;
    public String A00 = null;

    @Override // X.C0TR
    public final boolean shouldCollectMetrics(int i) {
        return (i & 256) != 0;
    }

    @Override // X.C0TR
    public final /* synthetic */ boolean shouldCollectMetrics(int i, C0TG c0tg) {
        return C0TQ.A00(c0tg, this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.C55J r10) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55J.A00(X.55J):void");
    }

    @Override // X.C0TR
    public final /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    @Override // X.C0TR
    public final /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }

    public C55J(C0JO c0jo, int i) {
        this.A03 = Math.max(30, i) * 1000;
        this.A04 = c0jo;
    }

    @Override // X.C0TR
    public final Collection getDataPoints() {
        A00(this);
        ArrayList arrayList = new ArrayList(1);
        int i = this.A01;
        if (i > 0) {
            arrayList.add(new C0TJ(C0TP.A17, i));
            this.A01 = -1;
        }
        return arrayList;
    }
}
