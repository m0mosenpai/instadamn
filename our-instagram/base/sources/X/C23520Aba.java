package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Aba, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23520Aba implements InterfaceC71893X9a {
    public final /* synthetic */ InterfaceC58201Pr7 A00;
    public final /* synthetic */ C55208OeM A01;

    @Override // X.InterfaceC71893X9a
    public final void DZ2(EnumC222789sJ enumC222789sJ, String str, String str2, Throwable th) {
        AtomicBoolean atomicBoolean;
        InterfaceC25217BDq interfaceC25217BDq;
        InterfaceC25217BDq interfaceC25217BDq2;
        C14360o3.A0B(enumC222789sJ, 0);
        AbstractC167027dH.A13(str, th, str2);
        C219919nd c219919nd = this.A01.A07;
        if (c219919nd != null) {
            if (C18U.A06(C06090Tz.A05, c219919nd.A0E, 36316654317343319L)) {
                c219919nd.A06.A08();
                atomicBoolean = c219919nd.A0H;
            } else {
                atomicBoolean = c219919nd.A0H;
                if (!atomicBoolean.get() && (interfaceC25217BDq = ((C9KW) c219919nd).A05) != null) {
                    interfaceC25217BDq.DhC(th, str);
                }
                C219909nc c219909nc = c219919nd.A06;
                c219909nc.A08();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - c219919nd.A02 > 1000) {
                    c219909nc.A09("retry", str);
                    c219919nd.A02 = currentTimeMillis;
                    if (enumC222789sJ == EnumC222789sJ.PLAYING || c219919nd.A08) {
                        if (c219919nd.A0A) {
                            c219919nd.A0D();
                        } else {
                            c219919nd.A0O();
                        }
                    }
                    C191478dz c191478dz = ((C9KW) c219919nd).A03;
                    if (c191478dz != null) {
                        AbstractC166997dE.A1Y(c191478dz.A0j.A0B, true);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
            }
            if (!atomicBoolean.get() && (interfaceC25217BDq2 = ((C9KW) c219919nd).A05) != null) {
                StringBuilder A11 = AbstractC166997dE.A11("");
                A11.append(enumC222789sJ);
                A11.append('_');
                A11.append(C00Q.A03(str2, 800));
                A11.append('_');
                interfaceC25217BDq2.DHO(str, AbstractC166997dE.A0x(C00Q.A03(th.toString(), 800), A11), th);
            }
            AKk.A02(c219919nd.A0B, C05F.A1F, "VVP entered irrecoverable ERROR state", 2131974293);
        }
    }

    public C23520Aba(InterfaceC58201Pr7 interfaceC58201Pr7, C55208OeM c55208OeM) {
        this.A01 = c55208OeM;
        this.A00 = interfaceC58201Pr7;
    }
}
