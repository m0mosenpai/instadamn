package X;

/* renamed from: X.MWi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50621MWi extends Tx3 {
    public final Tx0 A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC50621MWi(Tx0 tx0, String str) {
        super(str);
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = tx0;
    }

    @Override // X.AbstractC127945qN
    /* renamed from: A03 */
    public final boolean isContentSame(AbstractC127945qN abstractC127945qN) {
        return false;
    }

    @Override // X.AbstractC127945qN
    public final long A00() {
        return 30L;
    }

    @Override // X.AbstractC127945qN
    /* renamed from: A02 */
    public final String getKey() {
        return this.A01;
    }

    @Override // X.AbstractC127945qN, X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.AbstractC127945qN, X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
