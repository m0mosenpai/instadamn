package X;

import android.content.Context;
import com.facebook.R;
import java.util.Map;

/* renamed from: X.Ixv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42881Ixv implements InterfaceC43455JHt {
    public EnumC153216up A00;
    public final IM9 A01;
    public final String A02;
    public final Context A03;
    public final HCR A04;
    public final Map A05;

    @Override // X.InterfaceC43455JHt
    public final C1571273r Afz() {
        C1571273r c1571273r = (C1571273r) this.A05.get(this.A00);
        if (c1571273r == null) {
            return AbstractC37300Gc1.A0J();
        }
        return c1571273r;
    }

    @Override // X.InterfaceC43455JHt
    public final EnumC153216up B1M() {
        return this.A00;
    }

    @Override // X.InterfaceC43455JHt
    public final void EgQ() {
        Map map = this.A05;
        EnumC153216up enumC153216up = EnumC153216up.A06;
        C1571273r A0J = AbstractC37300Gc1.A0J();
        Context context = this.A03;
        AbstractC37304Gc5.A0q(context, A0J);
        map.put(enumC153216up, A0J);
        EnumC153216up enumC153216up2 = EnumC153216up.A02;
        C1571273r A0J2 = AbstractC37300Gc1.A0J();
        AbstractC37304Gc5.A0q(context, A0J2);
        A0J2.A02 = R.drawable.loadmore_icon_refresh_compound;
        ViewOnClickListenerC42033Ik2.A01(A0J2, this, 47);
        map.put(enumC153216up2, A0J2);
        EnumC153216up enumC153216up3 = EnumC153216up.A04;
        C1571273r A0J3 = AbstractC37300Gc1.A0J();
        AbstractC37304Gc5.A0q(context, A0J3);
        A0J3.A02 = R.drawable.loadmore_icon_refresh_compound;
        ViewOnClickListenerC42033Ik2.A01(A0J3, this, 48);
        map.put(enumC153216up3, A0J3);
    }

    @Override // X.InterfaceC43455JHt
    public final void FAs() {
        EnumC153216up enumC153216up;
        EnumC153216up enumC153216up2 = this.A00;
        Integer num = this.A01.A00;
        if (num == C05F.A00) {
            enumC153216up = EnumC153216up.A06;
        } else if (num == C05F.A01) {
            enumC153216up = EnumC153216up.A04;
        } else {
            enumC153216up = EnumC153216up.A02;
        }
        this.A00 = enumC153216up;
        if (enumC153216up != enumC153216up2) {
            C38973HEb.A00((C38973HEb) this.A04.A06.getValue());
        }
    }

    public C42881Ixv(Context context, IM9 im9, HCR hcr, String str) {
        AbstractC167017dG.A1R(im9, str);
        this.A03 = context;
        this.A01 = im9;
        this.A02 = str;
        this.A04 = hcr;
        this.A05 = AbstractC166987dD.A1I();
        this.A00 = EnumC153216up.A02;
    }
}
