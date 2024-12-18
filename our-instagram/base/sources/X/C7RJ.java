package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7RJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RJ implements C7QC {
    public final Activity A00;
    public final UserSession A01;
    public final InterfaceC165507ad A02;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.share_to_story_shortcut_stub, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new C7SC(this.A00, this.A01, AbstractC56372iV.A01(inflate, false, false), this.A02);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7SC c7sc = (C7SC) c7qd;
        C9C0 c9c0 = (C9C0) interfaceC129555tK;
        C14360o3.A0B(c7sc, 0);
        if (c9c0 != null) {
            c7sc.A01(c9c0);
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7SC c7sc = (C7SC) c7qd;
        C14360o3.A0B(c7sc, 0);
        c7sc.A00();
    }

    public C7RJ(Activity activity, UserSession userSession, InterfaceC165507ad interfaceC165507ad) {
        this.A02 = interfaceC165507ad;
        this.A00 = activity;
        this.A01 = userSession;
    }
}
