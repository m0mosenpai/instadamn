package X;

/* renamed from: X.5qN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC127945qN implements InterfaceC66482zP, InterfaceC127955qO {
    public C69296Vl4 A00;
    public Integer A01;
    public final C127915qK A02;
    public final C130505uv A03;
    public final String A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC127945qN(C127915qK c127915qK, String str) {
        this(c127915qK, null, str);
        C14360o3.A0B(str, 1);
    }

    @Override // X.InterfaceC66492zQ
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public boolean isContentSame(AbstractC127945qN abstractC127945qN) {
        return true;
    }

    public long A00() {
        if (this instanceof C127935qM) {
            return 24L;
        }
        if (this instanceof C127995qS) {
            return 0L;
        }
        return 26L;
    }

    public final String A01() {
        if (this instanceof C127935qM) {
            return ((C127935qM) this).A01.A01().A00;
        }
        return null;
    }

    @Override // X.InterfaceC66482zP
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public String getKey() {
        C130505uv c130505uv;
        String A0T;
        if (!(this instanceof C127995qS) || (c130505uv = this.A03) == null || (A0T = AnonymousClass001.A0T(c130505uv.A00(), this.A04, ':')) == null) {
            return this.A04;
        }
        return A0T;
    }

    @Override // X.InterfaceC127955qO
    public final C127915qK BAN() {
        return this.A02;
    }

    public AbstractC127945qN(C127915qK c127915qK, C130505uv c130505uv, String str) {
        this.A04 = str;
        this.A02 = c127915qK;
        this.A03 = c130505uv;
    }
}
