package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.93v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2046193v implements InterfaceC13050lr {
    public final UserSession A00;
    public final InterfaceC09390do A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EU(this, 38));
    public final C2046293w A01 = new InterfaceC195278kT() { // from class: X.93w
        @Override // X.InterfaceC195278kT
        public final /* bridge */ /* synthetic */ Object AOx(String str) {
            C14360o3.A0B(str, 0);
            return AnonymousClass170.A00(C07950bF.A04.A01(C2046193v.this.A00, str));
        }

        @Override // X.InterfaceC195278kT
        public final /* bridge */ /* synthetic */ String AhL(Object obj) {
            User user = (User) obj;
            C14360o3.A0B(user, 0);
            return user.getId();
        }

        @Override // X.InterfaceC195278kT
        public final /* bridge */ /* synthetic */ String EOt(Object obj) {
            User user = (User) obj;
            C14360o3.A0B(user, 0);
            String A00 = AbstractC225717y.A00(user);
            C14360o3.A07(A00);
            return A00;
        }
    };
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C9EU(this, 39));
    public final Comparator A02 = new Comparator() { // from class: X.93x
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return 0;
        }
    };

    public final synchronized List A00() {
        List list;
        if (((Boolean) this.A03.getValue()).booleanValue()) {
            list = ((C195298kV) this.A04.getValue()).A04;
        } else {
            list = C16930sl.A00;
        }
        return list;
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        ((C195298kV) this.A04.getValue()).A01();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.93w] */
    public C2046193v(UserSession userSession) {
        this.A00 = userSession;
    }
}
