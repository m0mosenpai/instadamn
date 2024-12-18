package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.7RU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RU implements C7QC {
    public final InterfaceC165427aV A00;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.edit_response_shortcut_stub, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new C7SO(AbstractC56372iV.A01(inflate, false, false), this.A00);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7SO c7so = (C7SO) c7qd;
        K2X k2x = (K2X) interfaceC129555tK;
        C14360o3.A0B(c7so, 0);
        if (k2x != null) {
            c7so.A00(k2x);
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7SO c7so = (C7SO) c7qd;
        C14360o3.A0B(c7so, 0);
        InterfaceC56392iX interfaceC56392iX = c7so.A00;
        interfaceC56392iX.setVisibility(8);
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().setOnClickListener(null);
        }
    }

    public C7RU(InterfaceC165427aV interfaceC165427aV) {
        this.A00 = interfaceC165427aV;
    }
}
