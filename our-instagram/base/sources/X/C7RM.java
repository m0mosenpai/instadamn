package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7RM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RM implements C7QC {
    public final Activity A00;
    public final UserSession A01;
    public final InterfaceC165567aj A02;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewStub viewStub;
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.shared_stack_creation_shortcut_stub, viewGroup, false);
        if (inflate instanceof ViewStub) {
            viewStub = (ViewStub) inflate;
        } else {
            viewStub = null;
        }
        return new C7SF(this.A00, this.A01, new C57012jc(viewStub), this.A02);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7SF c7sf = (C7SF) c7qd;
        K2W k2w = (K2W) interfaceC129555tK;
        C14360o3.A0B(c7sf, 0);
        C14360o3.A0B(k2w, 1);
        c7sf.A00(k2w);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7SF c7sf = (C7SF) c7qd;
        C14360o3.A0B(c7sf, 0);
        c7sf.A03.A02();
        c7sf.A00 = null;
    }

    public C7RM(Activity activity, UserSession userSession, InterfaceC165567aj interfaceC165567aj) {
        this.A00 = activity;
        this.A02 = interfaceC165567aj;
        this.A01 = userSession;
    }
}
