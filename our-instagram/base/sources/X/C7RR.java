package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;

/* renamed from: X.7RR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RR implements C7QC {
    public final InterfaceC165537ag A00;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.receiver_fetch_debug_stub, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new C7SL(new C57012jc((ViewStub) inflate), this.A00);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7SL c7sl = (C7SL) c7qd;
        C7BV c7bv = (C7BV) interfaceC129555tK;
        C14360o3.A0B(c7sl, 0);
        if (c7bv != null) {
            c7sl.A01(c7bv);
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7SL c7sl = (C7SL) c7qd;
        if (c7sl != null) {
            c7sl.A00.A02();
        }
    }

    public C7RR(InterfaceC165537ag interfaceC165537ag) {
        this.A00 = interfaceC165537ag;
    }
}
