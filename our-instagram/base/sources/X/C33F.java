package X;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.instagram.common.session.UserSession;

/* renamed from: X.33F, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33F {
    public J4Z A00;
    public final Handler A01;
    public final UserSession A02;
    public final C33C A03;
    public final C33G A04;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.33G] */
    public C33F(UserSession userSession, C33C c33c) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = c33c;
        this.A01 = new Handler(Looper.getMainLooper());
        this.A04 = new C33H() { // from class: X.33G
            @Override // X.C33H, X.C33I
            public final void Dto(C5SW c5sw) {
                C33F.this.A00 = null;
            }

            @Override // X.C33H, X.C33I
            public final void Dtt(C5SW c5sw) {
                C33F.this.A03.Dtr();
            }
        };
    }

    public final void A00(ViewGroup viewGroup, String str, InterfaceC16820sZ interfaceC16820sZ, long j, boolean z) {
        ViewGroup viewGroup2 = viewGroup;
        if (this.A03.Ejn()) {
            if (viewGroup instanceof ViewPager) {
                ViewParent parent = viewGroup.getParent();
                C14360o3.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                viewGroup2 = (ViewGroup) parent;
            }
            if (viewGroup2 != null) {
                viewGroup2.post(new RunnableC43158J5v(viewGroup2, this, str, interfaceC16820sZ, j, z));
            }
        }
    }
}
