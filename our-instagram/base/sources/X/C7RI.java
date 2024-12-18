package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.7RI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RI implements C7QC {
    public final InterfaceC165507ad A00;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.camera_reply_shortcut_stub, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new C7SB(AbstractC56372iV.A01(inflate, false, false), this.A00);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7SB c7sb = (C7SB) c7qd;
        C7BU c7bu = (C7BU) interfaceC129555tK;
        C14360o3.A0B(c7sb, 0);
        if (c7bu != null) {
            c7sb.A02(c7bu);
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7SB c7sb = (C7SB) c7qd;
        if (c7sb != null) {
            c7sb.A00();
        }
    }

    public C7RI(InterfaceC165507ad interfaceC165507ad) {
        this.A00 = interfaceC165507ad;
    }
}
