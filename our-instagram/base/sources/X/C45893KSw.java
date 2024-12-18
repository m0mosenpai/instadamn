package X;

/* renamed from: X.KSw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45893KSw extends AbstractC129515tG implements InterfaceC66482zP, InterfaceC129555tK {
    public final AnonymousClass781 A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45893KSw(AnonymousClass781 anonymousClass781, String str) {
        super(anonymousClass781.A02);
        C14360o3.A0B(str, 2);
        this.A00 = anonymousClass781;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45893KSw) {
                C45893KSw c45893KSw = (C45893KSw) obj;
                if (!C14360o3.A0K(this.A00, c45893KSw.A00) || !C14360o3.A0K(this.A01, c45893KSw.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
