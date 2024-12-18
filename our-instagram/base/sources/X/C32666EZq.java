package X;

/* renamed from: X.EZq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32666EZq extends AbstractRunnableC14200nk {
    public final /* synthetic */ C34721FRi A00;
    public final /* synthetic */ Long A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32666EZq(C34721FRi c34721FRi, Long l, String str, boolean z) {
        super(1497980138, 3, false, false);
        this.A00 = c34721FRi;
        this.A03 = z;
        this.A02 = str;
        this.A01 = l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34721FRi c34721FRi = this.A00;
        if (c34721FRi.A07 != null) {
            EnumC33509Eri enumC33509Eri = EnumC33509Eri.DWELL;
            boolean z = this.A03;
            c34721FRi.A02(enumC33509Eri, this.A01, this.A02, z);
        }
    }
}
