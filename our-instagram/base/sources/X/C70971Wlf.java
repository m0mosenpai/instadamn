package X;

/* renamed from: X.Wlf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70971Wlf implements InterfaceC55022g1 {
    public final int A00;
    public final Object A01;

    public C70971Wlf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC55022g1
    public final void DXC(C125715mI c125715mI) {
        C64742wY c64742wY;
        switch (this.A00) {
            case 0:
                c64742wY = ((V1R) this.A01).A0M;
                if (c64742wY == null) {
                    C14360o3.A0F("quickPromotionTooltipsController");
                    throw C00O.createAndThrow();
                }
                c64742wY.A02 = c125715mI;
                return;
            case 1:
                c64742wY = ((V1Y) this.A01).A04;
                c64742wY.A02 = c125715mI;
                return;
            default:
                c64742wY = (C64742wY) ((C26823Bsl) this.A01).A08.getValue();
                c64742wY.A02 = c125715mI;
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC55022g1
    public final void Dtj(C125715mI c125715mI) {
        C64742wY c64742wY;
        InterfaceC55362gb interfaceC55362gb;
        String str;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c125715mI, 0);
                V1R v1r = (V1R) this.A01;
                c64742wY = v1r.A0M;
                if (c64742wY == null) {
                    str = "quickPromotionTooltipsController";
                } else {
                    interfaceC55362gb = v1r.A0L;
                    if (interfaceC55362gb == null) {
                        str = "quickPromotionDelegate";
                    }
                    c64742wY.A01(interfaceC55362gb, c125715mI);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
                V1Y v1y = (V1Y) this.A01;
                c64742wY = v1y.A04;
                interfaceC55362gb = v1y.A03;
                c64742wY.A01(interfaceC55362gb, c125715mI);
                return;
            default:
                C14360o3.A0B(c125715mI, 0);
                C26823Bsl c26823Bsl = (C26823Bsl) this.A01;
                c64742wY = (C64742wY) c26823Bsl.A08.getValue();
                interfaceC55362gb = (AbstractC55352ga) c26823Bsl.A07.getValue();
                c64742wY.A01(interfaceC55362gb, c125715mI);
                return;
        }
    }
}
