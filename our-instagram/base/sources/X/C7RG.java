package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7RG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RG implements C7QC {
    public final UserSession A00;
    public final InterfaceC165597am A01;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.footer_label_stub, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new C7S9(this.A00, new C57012jc((ViewStub) inflate), this.A01);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7S9 c7s9 = (C7S9) c7qd;
        C14360o3.A0B(c7s9, 0);
        c7s9.A00((C7BR) interfaceC129555tK);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7S9 c7s9 = (C7S9) c7qd;
        C14360o3.A0B(c7s9, 0);
        c7s9.A01.A02();
    }

    public C7RG(UserSession userSession, InterfaceC165597am interfaceC165597am) {
        this.A00 = userSession;
        this.A01 = interfaceC165597am;
    }
}
