package X;

/* renamed from: X.TIb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64525TIb implements Comparable {
    public final long A00;
    public final R6v A01;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.valueOf(this.A00).compareTo(Long.valueOf(((C64525TIb) obj).A00));
    }

    public C64525TIb(R6v r6v, long j) {
        this.A01 = r6v;
        this.A00 = j;
    }
}
