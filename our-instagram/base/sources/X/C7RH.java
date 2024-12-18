package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;

/* renamed from: X.7RH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RH implements C7QC {
    public final InterfaceC165097Zy A00;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewStub viewStub;
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.forwarding_shortcut_stub, viewGroup, false);
        if (inflate instanceof ViewStub) {
            viewStub = (ViewStub) inflate;
        } else {
            viewStub = null;
        }
        return new C7SA(new C57012jc(viewStub), this.A00);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7SA c7sa = (C7SA) c7qd;
        C158897Bb c158897Bb = (C158897Bb) interfaceC129555tK;
        C14360o3.A0B(c7sa, 0);
        if (c158897Bb != null) {
            c7sa.A00(c158897Bb);
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7SA c7sa = (C7SA) c7qd;
        C14360o3.A0B(c7sa, 0);
        c7sa.A00.A02();
    }

    public C7RH(InterfaceC165097Zy interfaceC165097Zy) {
        this.A00 = interfaceC165097Zy;
    }
}
