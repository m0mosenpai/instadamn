package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.R;
import com.facebook.rtc.views.omnigridview.OmniGridView;

/* renamed from: X.NnU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53623NnU {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.view.View] */
    public final N0H A00(ViewGroup viewGroup) {
        InterfaceC57799PkR interfaceC57799PkR;
        ViewGroup viewGroup2;
        if (this instanceof N0J) {
            N0J n0j = (N0J) this;
            ?? r4 = viewGroup;
            while (!(r4 instanceof InterfaceC57799PkR) && (r4 = AbstractC43594JPz.A0E(r4)) != 0) {
            }
            if ((r4 instanceof InterfaceC57799PkR) && (interfaceC57799PkR = (InterfaceC57799PkR) r4) != null) {
                View A01 = n0j.A01(viewGroup, interfaceC57799PkR);
                if (A01.getParent() != null) {
                    ViewParent parent = A01.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                        viewGroup2.removeView(A01);
                    }
                }
                N0L n0l = (N0L) n0j;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                InterfaceC11380iw interfaceC11380iw = n0l.A00;
                InterfaceC16610sE interfaceC16610sE = n0l.A05;
                O57 o57 = n0l.A01;
                boolean z = n0l.A06;
                InterfaceC16620sF interfaceC16620sF = n0l.A04;
                InterfaceC16820sZ interfaceC16820sZ = n0l.A03;
                InterfaceC16820sZ interfaceC16820sZ2 = n0l.A02;
                AbstractC25233BEq.A0w(2, interfaceC11380iw, interfaceC16610sE, o57);
                AbstractC167017dG.A1U(interfaceC16620sF, interfaceC16820sZ);
                C14360o3.A0B(interfaceC16820sZ2, 8);
                N0H n0h = new N0H(interfaceC11380iw, new NXW(A01, o57, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16620sF, interfaceC16610sE), true, z);
                ((OmniGridView) interfaceC57799PkR).A03 = n0h;
                return n0h;
            }
            throw AbstractC166987dD.A14(AbstractC166997dE.A0x(" is not child of GridSelfViewHost", AbstractC31174DnI.A0y(viewGroup)));
        }
        N0K n0k = (N0K) this;
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        InterfaceC11380iw interfaceC11380iw2 = n0k.A00;
        InterfaceC16610sE interfaceC16610sE2 = n0k.A03;
        O57 o572 = n0k.A01;
        boolean z2 = n0k.A04;
        InterfaceC16620sF interfaceC16620sF2 = n0k.A02;
        C57437PeZ c57437PeZ = C57437PeZ.A00;
        AbstractC25233BEq.A0w(2, interfaceC11380iw2, interfaceC16610sE2, o572);
        AbstractC167017dG.A1U(interfaceC16620sF2, c57437PeZ);
        C57434PeW c57434PeW = C57434PeW.A00;
        C14360o3.A0B(c57434PeW, 5);
        return new N0H(interfaceC11380iw2, new NXW(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_call_participant_cell, false), o572, c57437PeZ, c57434PeW, interfaceC16620sF2, interfaceC16610sE2), false, z2);
    }
}
