package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7RS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RS implements C7QC {
    public final UserSession A00;
    public final InterfaceC165617ao A01;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        return new C7SM(this.A00, AbstractC56372iV.A01(layoutInflater.inflate(R.layout.subscribe_shortcut_stub, viewGroup, false), false, false), this.A01);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7SM c7sm = (C7SM) c7qd;
        K2Z k2z = (K2Z) interfaceC129555tK;
        C14360o3.A0B(c7sm, 0);
        C14360o3.A0B(k2z, 1);
        c7sm.A01(k2z);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7SM c7sm = (C7SM) c7qd;
        C14360o3.A0B(c7sm, 0);
        c7sm.A00();
    }

    public C7RS(UserSession userSession, InterfaceC165617ao interfaceC165617ao) {
        this.A01 = interfaceC165617ao;
        this.A00 = userSession;
    }
}
