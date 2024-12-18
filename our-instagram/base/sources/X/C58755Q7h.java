package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: X.Q7h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58755Q7h extends AbstractC59972of {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        A00(this, C05F.A15, C05F.A01, new C09530e4[0]);
        InterfaceC09390do interfaceC09390do = this.A00;
        View findViewById = view.findViewById(((UQ7) Q8Y.A00(interfaceC09390do).A04).A03);
        View findViewById2 = view.findViewById(((UQ7) Q8Y.A00(interfaceC09390do).A04).A01);
        ViewOnClickListenerC63508Sob.A01(view.findViewById(((UQ7) Q8Y.A00(interfaceC09390do).A04).A00), 22, this);
        AbstractC31180DnO.A1F(this, AbstractC58318PtA.A0L(this.A01).A07, new DHZ(29, findViewById2, this, findViewById), 7);
    }

    public static final void A00(C58755Q7h c58755Q7h, Integer num, Integer num2, C09530e4... c09530e4Arr) {
        AbstractC58318PtA.A0L(c58755Q7h.A01).A0E(new L2D(num, num2, C05F.A0Y, (C09530e4[]) Arrays.copyOf(c09530e4Arr, 0)));
    }

    public C58755Q7h() {
        C57238PbM c57238PbM = new C57238PbM(this, 23);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A13 = AbstractC58322PtE.A13(c57238PbM, enumC09460dv, 24);
        C0YZ c0yz = new C0YZ(C44455JlN.class);
        this.A01 = new C60842q8(new C57238PbM(A13, 25), new C57254Pbc(47, A13, this), new C57254Pbc(46, null, A13), c0yz);
        InterfaceC09390do A132 = AbstractC58322PtE.A13(new C57238PbM(this, 22), enumC09460dv, 26);
        C0YZ c0yz2 = new C0YZ(Q8Y.class);
        this.A00 = new C60842q8(new C57238PbM(A132, 27), new C57254Pbc(49, A132, this), new C57254Pbc(48, null, A132), c0yz2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-219418731);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(((UQ7) Q8Y.A00(this.A00).A04).A02, viewGroup, false);
        C0f9.A09(-677757837, A02);
        return inflate;
    }
}
