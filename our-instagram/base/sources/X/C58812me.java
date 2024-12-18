package X;

import android.view.View;

/* renamed from: X.2me, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58812me implements InterfaceC55932he {
    public static final C55942hf A02 = C55942hf.A03(8.0d, 40.0d);
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(C58822mf.A00);
    public final View A01;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        View view = this.A01;
        view.setScaleX(f);
        view.setScaleY(f);
    }

    public final void A00() {
        Object value = this.A00.getValue();
        C14360o3.A07(value);
        C55982hj c55982hj = (C55982hj) value;
        c55982hj.A08(1.0d, true);
        c55982hj.A06(1.25d);
    }

    public final void A01() {
        Object value = this.A00.getValue();
        C14360o3.A07(value);
        C55982hj c55982hj = (C55982hj) value;
        c55982hj.A0B(this);
        c55982hj.A01();
    }

    public final void A02() {
        Object value = this.A00.getValue();
        C14360o3.A07(value);
        C55982hj c55982hj = (C55982hj) value;
        c55982hj.A0A(this);
        c55982hj.A01();
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        InterfaceC09390do interfaceC09390do = this.A00;
        Object value = interfaceC09390do.getValue();
        C14360o3.A07(value);
        if (((C55982hj) value).A01 == 1.25d) {
            Object value2 = interfaceC09390do.getValue();
            C14360o3.A07(value2);
            C55982hj c55982hj2 = (C55982hj) value2;
            c55982hj2.A08(1.25d, true);
            c55982hj2.A06(1.0d);
        }
    }

    public C58812me(View view) {
        this.A01 = view;
    }
}
