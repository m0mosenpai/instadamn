package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.Cm4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28712Cm4 implements InterfaceC31030DkT {
    public InterfaceC74963Ym A00;
    public Alignment A01;
    public final C18590vm A02;
    public final BTO A03;
    public final InterfaceC74953Yl A04 = AbstractC25230BEn.A0U(new C119055aN(0));

    @Override // X.InterfaceC31030DkT
    public final Object BHg() {
        return this.A03.A03().BHg();
    }

    @Override // X.InterfaceC31030DkT
    public final Object C5W() {
        return this.A03.A03().C5W();
    }

    public C28712Cm4(BTO bto, Alignment alignment) {
        this.A03 = bto;
        this.A01 = alignment;
        C18590vm c18590vm = AbstractC004701m.A01;
        this.A02 = new C18590vm(6);
    }

    @Override // X.InterfaceC31030DkT
    public final /* synthetic */ boolean Cek(Object obj, Object obj2) {
        if (C14360o3.A0K(obj, BHg()) && C14360o3.A0K(obj2, C5W())) {
            return true;
        }
        return false;
    }
}
