package X;

/* renamed from: X.3v2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87403v2 extends AbstractRunnableC14200nk {
    public final String A00;
    public final /* synthetic */ C25301Lk A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87403v2(C25301Lk c25301Lk, String str) {
        super(509);
        this.A01 = c25301Lk;
        this.A00 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C25301Lk.A00(this.A01).EEk(this.A00);
        } catch (IllegalStateException unused) {
            C0w9.A03("JSONDiskSerializer_Concurrent_Edit ", "remove failed due to attempt to remove cache entry still under edit");
        }
    }
}
