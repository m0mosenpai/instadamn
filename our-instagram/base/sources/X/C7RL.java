package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7RL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RL implements C7QC {
    public final UserSession A00;
    public final InterfaceC165507ad A01;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewStub viewStub;
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.message_info_shortcut_stub, viewGroup, false);
        if (inflate instanceof ViewStub) {
            viewStub = (ViewStub) inflate;
        } else {
            viewStub = null;
        }
        return new C7SE(this.A00, new C57012jc(viewStub), this.A01);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7SE c7se = (C7SE) c7qd;
        C7BT c7bt = (C7BT) interfaceC129555tK;
        C14360o3.A0B(c7se, 0);
        if (c7bt != null) {
            c7se.A01(c7bt);
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7SE c7se = (C7SE) c7qd;
        if (c7se != null) {
            c7se.A00();
        }
    }

    public C7RL(UserSession userSession, InterfaceC165507ad interfaceC165507ad) {
        this.A01 = interfaceC165507ad;
        this.A00 = userSession;
    }
}
