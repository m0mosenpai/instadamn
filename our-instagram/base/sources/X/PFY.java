package X;

import java.util.Collection;

/* loaded from: classes9.dex */
public final class PFY implements InterfaceC38391qT {
    public final /* synthetic */ C26930BuX A00;

    @Override // X.InterfaceC38391qT
    public final void Ed3(EnumC77213d7 enumC77213d7) {
    }

    public PFY(C26930BuX c26930BuX) {
        this.A00 = c26930BuX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.8B8, java.lang.Object, X.1vN] */
    @Override // X.InterfaceC38391qT
    public final void AEH(AbstractC12990ll abstractC12990ll) {
        EnumC77213d7 enumC77213d7;
        if (abstractC12990ll != null) {
            C25671My A00 = AbstractC25651Mw.A00(abstractC12990ll);
            C26930BuX c26930BuX = this.A00;
            String id = c26930BuX.A01.getId();
            if (c26930BuX.A07) {
                enumC77213d7 = EnumC77213d7.A04;
            } else {
                enumC77213d7 = EnumC77213d7.A03;
            }
            ?? obj = new Object();
            obj.A01 = id;
            obj.A00 = enumC77213d7;
            A00.E4s(obj);
        }
    }

    @Override // X.InterfaceC38391qT
    public final EnumC77213d7 BqJ() {
        if (this.A00.A07) {
            return EnumC77213d7.A04;
        }
        return EnumC77213d7.A03;
    }

    @Override // X.InterfaceC38391qT
    public final String BqK() {
        return this.A00.A01.getId();
    }

    @Override // X.InterfaceC38391qT
    public final Integer BqO() {
        return C05F.A0N;
    }

    @Override // X.InterfaceC38391qT
    public final boolean CcN() {
        return this.A00.A07;
    }

    @Override // X.InterfaceC38391qT
    public final Collection BqL() {
        return AbstractC166987dD.A1E();
    }
}
