package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7RP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RP implements C7QC {
    public final UserSession A00;
    public final InterfaceC164907Zd A01;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.feedback_reactions_stub, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new C7SI(this.A00, AbstractC56372iV.A01(inflate, false, false), this.A01);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7SI c7si = (C7SI) c7qd;
        C9C0 c9c0 = (C9C0) interfaceC129555tK;
        C14360o3.A0B(c7si, 0);
        C14360o3.A0B(c9c0, 1);
        c7si.A01(c9c0);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7SI c7si = (C7SI) c7qd;
        if (c7si != null) {
            C11T.A02(new C7T6(c7si));
            c7si.A02 = null;
        }
    }

    public C7RP(UserSession userSession, InterfaceC164907Zd interfaceC164907Zd) {
        this.A00 = userSession;
        this.A01 = interfaceC164907Zd;
    }
}
