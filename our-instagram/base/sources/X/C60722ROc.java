package X;

import java.util.List;

/* renamed from: X.ROc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60722ROc extends AbstractC63296Sgx {
    public /* synthetic */ C60722ROc(AbstractC61506Roh abstractC61506Roh) {
    }

    public C60722ROc() {
    }

    @Override // X.AbstractC63296Sgx
    public final void A02(Object obj, long j) {
        ((InterfaceC65693TsF) C63409Sjj.A06(obj, j)).FFq();
    }

    @Override // X.AbstractC63296Sgx
    public final void A03(Object obj, long j, Object obj2) {
        InterfaceC65693TsF interfaceC65693TsF = (InterfaceC65693TsF) C63409Sjj.A06(obj, j);
        List list = (List) C63409Sjj.A06(obj2, j);
        int size = interfaceC65693TsF.size();
        int size2 = list.size();
        if (size > 0) {
            if (size2 > 0) {
                if (!interfaceC65693TsF.FG0()) {
                    interfaceC65693TsF = interfaceC65693TsF.FG7(size2 + size);
                }
                interfaceC65693TsF.addAll(list);
            }
            list = interfaceC65693TsF;
        }
        C63409Sjj.A0J(obj, j, list);
    }
}
