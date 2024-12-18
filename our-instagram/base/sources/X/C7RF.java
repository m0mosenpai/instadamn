package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7RF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RF implements C7QC {
    public final Activity A00;
    public final UserSession A01;
    public final C7Y8 A02;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewStub viewStub;
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.header_label_stub, viewGroup, false);
        if (inflate instanceof ViewStub) {
            viewStub = (ViewStub) inflate;
        } else {
            viewStub = null;
        }
        return new C7S8(this.A00, this.A01, new C57012jc(viewStub), this.A02);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7S8 c7s8 = (C7S8) c7qd;
        C76K c76k = (C76K) interfaceC129555tK;
        C14360o3.A0B(c7s8, 0);
        C14360o3.A0B(c76k, 1);
        c7s8.A01(c76k);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7S8 c7s8 = (C7S8) c7qd;
        C14360o3.A0B(c7s8, 0);
        c7s8.A00();
    }

    public C7RF(Activity activity, UserSession userSession, C7Y8 c7y8) {
        this.A01 = userSession;
        this.A02 = c7y8;
        this.A00 = activity;
    }
}
