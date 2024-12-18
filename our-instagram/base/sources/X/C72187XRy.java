package X;

import java.util.List;

/* renamed from: X.XRy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72187XRy extends YA6 {
    public final C72750XmR A00;
    public final C72751XmS A01;
    public final C54504O6h A02;
    public final WFT[] A03;

    @Override // X.InterfaceC58193Pqz
    public final Y0y[] ArL() {
        return null;
    }

    @Override // X.InterfaceC58193Pqz
    public final C54504O6h EK7(C72772Xmp c72772Xmp) {
        WFT[] wftArr;
        C72750XmR c72750XmR = this.A00;
        if (c72750XmR != null) {
            wftArr = AbstractC72542XgB.A00(c72750XmR, c72772Xmp);
        } else {
            wftArr = null;
        }
        this.A06.ECX(this, null, wftArr, this.A03, null, super.A00);
        return this.A02;
    }

    @Override // X.InterfaceC58193Pqz
    public final Y0y[] BUn() {
        C72750XmR c72750XmR = this.A00;
        if (c72750XmR != null) {
            return c72750XmR.A02;
        }
        return null;
    }

    @Override // X.InterfaceC58193Pqz
    public final int BbD(String str) {
        Number A0Q = AbstractC37300Gc1.A0Q("min_bitrate", this.A01.A01);
        if (A0Q == null) {
            return -1;
        }
        return A0Q.intValue();
    }

    public C72187XRy(C69495VoJ c69495VoJ, OMZ omz, YOn yOn, XS1 xs1, C12320ka c12320ka) {
        super(omz, yOn, xs1);
        C72750XmR c72750XmR;
        C72751XmS A01 = Y4J.A01(xs1.A01);
        this.A01 = A01;
        WFT[] A03 = Y4J.A03(A01, xs1.A02);
        this.A03 = A03;
        this.A02 = new C54504O6h(this, A03);
        List list = xs1.A00;
        if (list != null && !list.isEmpty()) {
            c72750XmR = Y4J.A00(c69495VoJ, c12320ka, xs1.A00);
        } else {
            c72750XmR = null;
        }
        this.A00 = c72750XmR;
    }
}
