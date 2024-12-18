package X;

import androidx.activity.ComponentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.8EO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8EO {
    public final C8EN A00;
    public final WeakReference A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public C8EO(ComponentActivity componentActivity, UserSession userSession, C8EN c8en) {
        C14360o3.A0B(componentActivity, 2);
        this.A00 = c8en;
        this.A04 = new C60842q8(new C9E4(componentActivity, 23), C8EP.A00, new C9F5(11, null, componentActivity), new C0YZ(C8EQ.class));
        this.A01 = new WeakReference(componentActivity);
        this.A03 = AbstractC09440dt.A01(new C9F5(10, userSession, this));
        this.A02 = AbstractC09440dt.A01(new C9E4(this, 22));
        androidx.core.app.ComponentActivity componentActivity2 = (androidx.core.app.ComponentActivity) this.A01.get();
        if (componentActivity2 != null) {
            C57312k6 A00 = AbstractC57302k5.A00(componentActivity2.getLifecycle());
            C206639Cu c206639Cu = new C206639Cu(this, null, 37);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu, A00);
        }
        androidx.core.app.ComponentActivity componentActivity3 = (androidx.core.app.ComponentActivity) this.A01.get();
        if (componentActivity3 != null) {
            C57312k6 A002 = AbstractC57302k5.A00(componentActivity3.getLifecycle());
            C206639Cu c206639Cu2 = new C206639Cu(this, null, 38);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu2, A002);
        }
    }
}
