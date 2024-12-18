package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.G3g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36380G3g implements InterfaceC58045PoW {
    public final /* synthetic */ ELF A00;

    public C36380G3g(ELF elf) {
        this.A00 = elf;
    }

    @Override // X.InterfaceC58045PoW
    public final void DtR() {
        ELF elf = this.A00;
        UserSession A0r = AbstractC166987dD.A0r(elf.A0F);
        String str = elf.A08;
        AbstractC167017dG.A1N(A0r, str);
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        C35142Fej.A00(A0r, "customer_details_tos_accept", str, c16920sk);
        C31812DyW c31812DyW = elf.A05;
        if (c31812DyW == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        GSR.A02(c31812DyW, AbstractC141776au.A00(c31812DyW), 34);
        if (elf.isAdded()) {
            elf.A06 = C05F.A01;
            AbstractC31178DnM.A0x(elf);
        }
    }

    @Override // X.InterfaceC58045PoW
    public final void DtS() {
        ELF elf = this.A00;
        UserSession A0r = AbstractC166987dD.A0r(elf.A0F);
        String str = elf.A08;
        AbstractC167017dG.A1N(A0r, str);
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        C35142Fej.A00(A0r, "customer_details_tos_decline", str, c16920sk);
    }
}
