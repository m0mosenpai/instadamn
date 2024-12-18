package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;

/* renamed from: X.IzG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42964IzG implements C31A {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC670931a A01;

    public C42964IzG(UserSession userSession, InterfaceC670931a interfaceC670931a) {
        this.A00 = userSession;
        this.A01 = interfaceC670931a;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ int ATx(Object obj) {
        C1PZ c1pz = (C1PZ) obj;
        C14360o3.A0B(c1pz, 0);
        return c1pz.A01;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ Collection AU1(Object obj) {
        return this.A01.Ahv();
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ int AUO(Object obj) {
        C1PZ c1pz = (C1PZ) obj;
        C14360o3.A0B(c1pz, 0);
        return c1pz.A04;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ Collection AUR(Object obj) {
        C1PZ c1pz = (C1PZ) obj;
        C14360o3.A0B(c1pz, 0);
        return c1pz.A0I;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ String ATy(Object obj) {
        return AbstractC37301Gc2.A0J(obj).A0S;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ int AU9(Object obj) {
        C40861ut A00 = C37469Gen.A00(obj);
        if (A00 != null) {
            return A00.A03();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ String AUH(Object obj) {
        String id = AbstractC37301Gc2.A0J(obj).A0K.getId();
        if (id != null) {
            return id;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ int AUK(Object obj) {
        C40861ut A00 = C37469Gen.A00(obj);
        if (A00 != null) {
            return A00.A01();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ int AUL(Object obj) {
        C40861ut A00 = C37469Gen.A00(obj);
        if (A00 != null) {
            return A00.A02();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ String AUe(Object obj) {
        return AbstractC37301Gc2.A0J(obj).A0j;
    }

    @Override // X.C31A
    public final /* synthetic */ String AU4(Object obj) {
        return null;
    }

    @Override // X.C31A
    public final /* synthetic */ Boolean AUD(Object obj) {
        return null;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ int AUM(Object obj) {
        return -1;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ int AUN(Object obj) {
        return -1;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ String AUP(Object obj) {
        return null;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ String AUQ(Object obj) {
        return null;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ String AUV(Object obj) {
        return null;
    }
}
