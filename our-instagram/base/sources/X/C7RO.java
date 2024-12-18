package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;

/* renamed from: X.7RO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RO implements C7QC {
    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.debug_indicator_stub, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        ViewStub viewStub = (ViewStub) inflate;
        if (viewStub == null) {
            viewStub = null;
        }
        return new C7SH(new C57012jc(viewStub));
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7SH c7sh = (C7SH) c7qd;
        C7BS c7bs = (C7BS) interfaceC129555tK;
        C14360o3.A0B(c7sh, 0);
        if (c7bs != null) {
            c7sh.A00(c7bs);
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7SH c7sh = (C7SH) c7qd;
        if (c7sh != null) {
            c7sh.A00.A02();
        }
    }
}
