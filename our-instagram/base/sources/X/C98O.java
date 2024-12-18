package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.98O, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C98O extends JQS {
    public boolean A00;
    public final int A01;
    public final C69613Av A02;
    public final C69613Av A03;
    public final C69613Av A04;
    public final C69613Av A05;
    public final C69613Av A06;
    public final UserSession A07;
    public final C98P A08;

    @Override // X.AbstractC69603Au
    public final int A01() {
        return this.A01;
    }

    @Override // X.AbstractC69603Au
    public void A05() {
        A0K("navigation_perf_logger", true);
        A0K("is_professional_account", this.A00);
        UserSession userSession = this.A07;
        for (Map.Entry entry : AbstractC86593tX.A0J(userSession).entrySet()) {
            A0J((String) entry.getKey(), (String) entry.getValue());
        }
        HashMap A00 = C9M5.A00(userSession);
        if (A00 instanceof Map) {
            for (Map.Entry entry2 : A00.entrySet()) {
                A0K((String) entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue());
            }
        }
        C14360o3.A0B(userSession, 0);
        A0G("mem_offline_sync_queue_size", C6AH.A00(userSession).A02);
    }

    public C98O(UserSession userSession, String str, int i, boolean z, boolean z2) {
        super(userSession);
        C69613Av c69613Av;
        this.A07 = userSession;
        this.A01 = i;
        this.A00 = z;
        C69613Av c69613Av2 = new C69613Av(this, "on_create");
        java.util.Set set = super.A06;
        set.add(c69613Av2);
        this.A02 = c69613Av2;
        C69613Av c69613Av3 = new C69613Av(this, "on_create_view");
        set.add(c69613Av3);
        this.A03 = c69613Av3;
        this.A05 = A02("on_resume");
        C69613Av c69613Av4 = new C69613Av(this, "on_pause");
        set.add(c69613Av4);
        this.A04 = c69613Av4;
        if (z2) {
            c69613Av = A02("on_view_created");
        } else {
            c69613Av = null;
        }
        this.A06 = c69613Av;
        this.A08 = new C98P(A02(AnonymousClass001.A0R(str, "_render")), this);
    }
}
