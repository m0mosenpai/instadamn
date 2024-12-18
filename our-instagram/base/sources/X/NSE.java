package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;

/* loaded from: classes9.dex */
public final class NSE extends C3P1 {
    public final InterfaceC56392iX A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    @Override // X.C3P1
    public final View A00() {
        return AbstractC166987dD.A0d(this.A03);
    }

    @Override // X.C3P1
    public final View A01() {
        return AbstractC166987dD.A0d(this.A07);
    }

    @Override // X.C3P1
    public final TextView A02() {
        return MSW.A0D(this.A05);
    }

    @Override // X.C3P1
    public final TextView A03() {
        return MSW.A0D(this.A04);
    }

    @Override // X.C3P1
    public final TextView A04() {
        return MSW.A0D(this.A06);
    }

    @Override // X.C3P1
    public final TextView A05() {
        return null;
    }

    @Override // X.C3P1
    public final InterfaceC56392iX A07() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NSE(Context context, Resources resources, ViewStub viewStub) {
        super(context, resources);
        AbstractC167027dH.A13(viewStub, context, resources);
        this.A00 = AbstractC56372iV.A00(viewStub);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A01 = C57527Pg1.A00(this, enumC09460dv, 25);
        this.A02 = C57527Pg1.A00(this, enumC09460dv, 27);
        this.A03 = C57527Pg1.A00(this, enumC09460dv, 26);
        this.A07 = C57527Pg1.A00(this, enumC09460dv, 31);
        this.A06 = C57527Pg1.A00(this, enumC09460dv, 30);
        this.A04 = C57527Pg1.A00(this, enumC09460dv, 28);
        this.A05 = C57527Pg1.A00(this, enumC09460dv, 29);
    }
}
