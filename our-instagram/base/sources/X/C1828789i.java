package X;

import android.app.Activity;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;

/* renamed from: X.89i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1828789i {
    public C8Y1 A00;
    public C188598Wy A01;
    public C8XA A02;
    public C8GE A03;
    public C8FA A04;
    public final Activity A05;
    public final C22P A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;
    public final C1828689h A09;
    public final C1816783z A0A;
    public final C81J A0B;

    public C1828789i(Activity activity, C22P c22p, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1828689h c1828689h, AnonymousClass840 anonymousClass840, C81J c81j) {
        C14360o3.A0B(c22p, 2);
        C14360o3.A0B(activity, 4);
        C14360o3.A0B(userSession, 5);
        this.A06 = c22p;
        this.A0B = c81j;
        this.A05 = activity;
        this.A08 = userSession;
        this.A07 = interfaceC11380iw;
        this.A09 = c1828689h;
        this.A0A = anonymousClass840.A02;
    }

    public static final void A00(C1828789i c1828789i) {
        String str;
        C8XA c8xa = c1828789i.A02;
        if (c8xa != null) {
            if (c8xa.A00().A02 != 1) {
                C9GR.A0B(c1828789i.A05, "import_failed");
                C8Y1 c8y1 = c1828789i.A00;
                if (c8y1 != null) {
                    c8y1.A00();
                    return;
                }
                str = "backPressDelegate";
            } else {
                return;
            }
        } else {
            str = "visibilityControllerComponentProvider";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A01(Medium medium) {
        C8XA c8xa = this.A02;
        if (c8xa != null) {
            if (c8xa.A00().A02 != 1) {
                this.A0A.A08(AbstractC189418aK.A01(this.A06));
                LBX.A00(this.A05, medium, this.A08, new C23794Ag5(this));
                return;
            }
            return;
        }
        C14360o3.A0F("visibilityControllerComponentProvider");
        throw C00O.createAndThrow();
    }
}
