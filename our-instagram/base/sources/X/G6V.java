package X;

import android.widget.TextView;
import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* loaded from: classes6.dex */
public final class G6V implements InterfaceC37292Gbt, InterfaceC58148PqD {
    public String A00;
    public final DirectShareTarget A01;
    public final InterfaceC58010Pnu A02;
    public final InterfaceC09390do A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final InterfaceC37290Gbr A07;
    public final GXM A08;
    public final Integer A09;
    public final boolean A0A;

    public G6V(InterfaceC37290Gbr interfaceC37290Gbr, GXM gxm, DirectShareTarget directShareTarget, InterfaceC58010Pnu interfaceC58010Pnu, Integer num, int i, int i2, int i3, boolean z) {
        AbstractC25233BEq.A0w(2, interfaceC58010Pnu, interfaceC37290Gbr, gxm);
        C14360o3.A0B(num, 10);
        this.A01 = directShareTarget;
        this.A02 = interfaceC58010Pnu;
        this.A07 = interfaceC37290Gbr;
        this.A03 = AbstractC09440dt.A01(new C37050GUg(this, 14));
        this.A08 = gxm;
        this.A05 = i;
        this.A04 = i2;
        this.A06 = i3;
        this.A0A = z;
        this.A09 = num;
    }

    @Override // X.InterfaceC58148PqD
    public final int BQ4(TextView textView) {
        C14360o3.A0B(textView, 0);
        return OP7.A00(textView, this.A09);
    }

    @Override // X.InterfaceC57945Pmr
    public final int Bu9() {
        return -1;
    }

    @Override // X.InterfaceC37292Gbt
    public final boolean CLv(DirectShareTarget directShareTarget) {
        C14360o3.A0B(directShareTarget, 0);
        return C14360o3.A0K(this.A01, directShareTarget);
    }

    @Override // X.InterfaceC37292Gbt
    public final List Axe() {
        return AbstractC166987dD.A1J(this.A01);
    }

    @Override // X.InterfaceC58148PqD
    public final void DAS() {
        this.A07.DAT(this.A01);
    }

    @Override // X.InterfaceC58148PqD
    public final void Dka() {
        this.A00 = this.A08.BoQ();
        C006802i.A0p.markerEnd(145754550, (short) 2);
        this.A02.AXK().A06(this, (C51690MsL) this.A03.getValue());
        this.A07.Dkb(this.A01, this.A06, this.A05, this.A04);
    }

    @Override // X.InterfaceC58148PqD
    public final void Dw9() {
        this.A02.AXK().A08((C51690MsL) this.A03.getValue());
        this.A07.DwA(this.A01, this.A04);
    }

    @Override // X.InterfaceC37292Gbt
    public final void ENk() {
        InterfaceC37290Gbr interfaceC37290Gbr = this.A07;
        DirectShareTarget directShareTarget = this.A01;
        String str = this.A00;
        if (str == null) {
            str = "";
        }
        interfaceC37290Gbr.DlZ(directShareTarget, str, this.A05, this.A04, this.A06, false, this.A0A);
    }
}
