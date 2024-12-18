package X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.3sa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86033sa {
    public InterfaceC56392iX A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    public final void A00() {
        InterfaceC56392iX interfaceC56392iX = this.A00;
        if (interfaceC56392iX == null) {
            C14360o3.A0F("stubHolder");
            throw C00O.createAndThrow();
        }
        if (interfaceC56392iX.CWW()) {
            ((View) this.A01.getValue()).setVisibility(8);
        }
    }

    public C86033sa(ViewStub viewStub) {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C9EJ(this, 24));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C9EJ(this, 26));
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C9EJ(this, 28));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C9EJ(this, 29));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C9EJ(this, 27));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C9EJ(this, 25));
        this.A00 = AbstractC56372iV.A01(viewStub, false, false);
    }

    public C86033sa(View view) {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C9EJ(this, 24));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C9EJ(this, 26));
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C9EJ(this, 28));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C9EJ(this, 29));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C9EJ(this, 27));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C9EJ(this, 25));
        this.A00 = AbstractC56372iV.A00(view);
    }
}
