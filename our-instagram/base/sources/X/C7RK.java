package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;

/* renamed from: X.7RK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RK implements C7QC {
    public final InterfaceC165507ad A00;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewStub viewStub;
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.save_to_collection_shortcut_stub, viewGroup, false);
        if (inflate instanceof ViewStub) {
            viewStub = (ViewStub) inflate;
        } else {
            viewStub = null;
        }
        return new C7SD(new C57012jc(viewStub), this.A00);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7SD c7sd = (C7SD) c7qd;
        C76C c76c = (C76C) interfaceC129555tK;
        C14360o3.A0B(c7sd, 0);
        C14360o3.A0B(c76c, 1);
        c7sd.A00(c76c);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7SD c7sd = (C7SD) c7qd;
        C14360o3.A0B(c7sd, 0);
        c7sd.A00.A02();
    }

    public C7RK(InterfaceC165507ad interfaceC165507ad) {
        this.A00 = interfaceC165507ad;
    }
}
