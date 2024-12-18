package X;

import java.util.UUID;

/* loaded from: classes9.dex */
public final class MZS extends Tx3 {
    public final Integer A00;
    public final String A01;

    public MZS(Integer num) {
        super("shimmer");
        this.A00 = num;
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A01 = obj;
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

    public MZS() {
        this(C05F.A00);
    }
}
