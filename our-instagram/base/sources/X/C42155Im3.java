package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Im3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42155Im3 implements InterfaceC62852tO {
    public List A00 = C16930sl.A00;
    public final /* synthetic */ IKW A01;
    public final /* synthetic */ InterfaceC71543Iw A02;

    @Override // X.InterfaceC62852tO
    public final void D5C(C120985dq c120985dq, Integer num, int i) {
    }

    @Override // X.InterfaceC62852tO
    public final void D5D(InterfaceC111084zP interfaceC111084zP, List list, boolean z, boolean z2) {
        C14360o3.A0B(list, 0);
        ArrayList A0U = AbstractC001800i.A0U(this.A00);
        if (z) {
            A0U.clear();
        }
        A0U.addAll(list);
        this.A00 = A0U;
        AbstractC153666vb abstractC153666vb = (AbstractC153666vb) this.A01.A09.getValue();
        if (abstractC153666vb != null) {
            abstractC153666vb.A02(interfaceC111084zP);
        }
        AbstractC12430kl.A00("AudioPageRepository-1", new D8K(21, this.A02, this));
    }

    @Override // X.InterfaceC62852tO
    public final void D5I(InterfaceC111084zP interfaceC111084zP, List list, boolean z, boolean z2) {
        C14360o3.A0B(list, 0);
        this.A00 = AbstractC001800i.A0a(list);
        AbstractC153666vb abstractC153666vb = (AbstractC153666vb) this.A01.A09.getValue();
        if (abstractC153666vb != null) {
            abstractC153666vb.A02(interfaceC111084zP);
        }
        AbstractC12430kl.A00("AudioPAgeRepository-2", new D8K(22, this.A02, this));
    }

    public C42155Im3(IKW ikw, InterfaceC71543Iw interfaceC71543Iw) {
        this.A01 = ikw;
        this.A02 = interfaceC71543Iw;
    }
}
