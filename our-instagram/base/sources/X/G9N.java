package X;

/* loaded from: classes6.dex */
public final class G9N implements C33I {
    public final C4NL A00;
    public final InterfaceC55362gb A01;
    public final /* synthetic */ C64742wY A02;

    @Override // X.C33I
    public final boolean Dtk(C5SW c5sw) {
        C14360o3.A0B(c5sw, 0);
        C33I c33i = this.A02.A01;
        if (c33i != null) {
            c33i.Dtk(c5sw);
            return true;
        }
        return true;
    }

    @Override // X.C33I
    public final void Dto(C5SW c5sw) {
        C14360o3.A0B(c5sw, 0);
        C33I c33i = this.A02.A01;
        if (c33i != null) {
            c33i.Dto(c5sw);
        }
    }

    @Override // X.C33I
    public final void Dtq(C5SW c5sw) {
        C14360o3.A0B(c5sw, 0);
        C33I c33i = this.A02.A01;
        if (c33i != null) {
            c33i.Dtq(c5sw);
        }
    }

    @Override // X.C33I
    public final void Dtt(C5SW c5sw) {
        C14360o3.A0B(c5sw, 0);
        InterfaceC55362gb interfaceC55362gb = this.A01;
        if (interfaceC55362gb != null) {
            interfaceC55362gb.Dcq(this.A00);
        }
        C64742wY c64742wY = this.A02;
        c64742wY.A04 = false;
        c64742wY.A02 = null;
        C33I c33i = c64742wY.A01;
        if (c33i != null) {
            c33i.Dtt(c5sw);
        }
    }

    public G9N(C4NL c4nl, InterfaceC55362gb interfaceC55362gb, C64742wY c64742wY) {
        this.A02 = c64742wY;
        this.A01 = interfaceC55362gb;
        this.A00 = c4nl;
    }
}
