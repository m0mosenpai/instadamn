package X;

/* renamed from: X.Dvm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31681Dvm implements InterfaceC55022g1 {
    public final /* synthetic */ C38P A00;

    @Override // X.InterfaceC55022g1
    public final void Dtj(C125715mI c125715mI) {
        String str;
        C14360o3.A0B(c125715mI, 0);
        C38P c38p = this.A00;
        C64742wY c64742wY = c38p.A0Q;
        if (c64742wY == null) {
            str = "quickPromotionTooltipsController";
        } else {
            C64842wi c64842wi = c38p.A0P;
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

    public C31681Dvm(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.InterfaceC55022g1
    public final void DXC(C125715mI c125715mI) {
        C64742wY c64742wY = this.A00.A0Q;
        if (c64742wY == null) {
            C14360o3.A0F("quickPromotionTooltipsController");
            throw C00O.createAndThrow();
        }
        c64742wY.A02 = c125715mI;
    }
}
