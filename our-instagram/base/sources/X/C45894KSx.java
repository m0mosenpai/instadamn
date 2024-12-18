package X;

/* renamed from: X.KSx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45894KSx extends AbstractC129515tG implements InterfaceC66482zP, InterfaceC129555tK {
    public final C51761Mtk A00;
    public final AnonymousClass781 A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45894KSx) {
                C45894KSx c45894KSx = (C45894KSx) obj;
                if (!C14360o3.A0K(this.A01, c45894KSx.A01) || !C14360o3.A0K(this.A00, c45894KSx.A00) || !C14360o3.A0K(this.A02, c45894KSx.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC129515tG, X.InterfaceC129525tH
    public final AnonymousClass541 BfF() {
        return this.A01.A00;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, (AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A00)) * 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C45894KSx(C51761Mtk c51761Mtk, AnonymousClass781 anonymousClass781) {
        super(anonymousClass781.A02);
        String CCL = anonymousClass781.CCL();
        C14360o3.A0B(CCL, 3);
        this.A01 = anonymousClass781;
        this.A00 = c51761Mtk;
        this.A02 = CCL;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
