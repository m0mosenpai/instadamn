package X;

/* loaded from: classes6.dex */
public final class GCQ implements InterfaceC55022g1 {
    public final /* synthetic */ C38J A00;

    @Override // X.InterfaceC55022g1
    public final void Dtj(C125715mI c125715mI) {
        String str;
        C14360o3.A0B(c125715mI, 0);
        C38J c38j = this.A00;
        C64742wY c64742wY = c38j.A06;
        if (c64742wY == null) {
            str = "quickPromotionTooltipsController";
        } else {
            C64842wi c64842wi = c38j.A05;
            if (c64842wi == null) {
                str = "quickPromotionDelegate";
            } else {
                c64742wY.A01(c64842wi, c125715mI);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public GCQ(C38J c38j) {
        this.A00 = c38j;
    }

    @Override // X.InterfaceC55022g1
    public final void DXC(C125715mI c125715mI) {
        C64742wY c64742wY = this.A00.A06;
        if (c64742wY == null) {
            C14360o3.A0F("quickPromotionTooltipsController");
            throw C00O.createAndThrow();
        }
        c64742wY.A02 = c125715mI;
    }
}
