package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7KA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7KA extends AbstractC60592pi {
    public final C164357Wy A00;
    public final InterfaceC163577Tu A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC50441MOv A03;
    public final C93814Jp A04;

    public C7KA(UserSession userSession, C164357Wy c164357Wy, InterfaceC163577Tu interfaceC163577Tu, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c164357Wy, 3);
        C14360o3.A0B(interfaceC16820sZ, 4);
        this.A01 = interfaceC163577Tu;
        this.A00 = c164357Wy;
        this.A02 = interfaceC16820sZ;
        this.A03 = new InterfaceC50441MOv() { // from class: X.7KB
            @Override // X.InterfaceC50441MOv
            public final void Dsn(C44079Je4 c44079Je4) {
                String str;
                C6C2 c6c2 = c44079Je4.A01;
                C7KA c7ka = C7KA.this;
                C2ED c2ed = (C2ED) c7ka.A02.invoke();
                if (c2ed != null) {
                    String C7I = c2ed.C7I();
                    String C7q = c2ed.C7q();
                    String str2 = c6c2.A01;
                    if ((str2 != null && str2.equals(C7I)) || ((str = c6c2.A00) != null && str.equals(C7q))) {
                        C7KA.A00(c7ka, c44079Je4);
                    }
                }
            }
        };
        this.A04 = AbstractC93804Jo.A00(userSession);
    }

    public static final void A00(C7KA c7ka, C44079Je4 c44079Je4) {
        User CDm;
        C2EG c2eg = (C2EG) c7ka.A02.invoke();
        if (c2eg != null) {
            ArrayList arrayList = new ArrayList();
            C93834Jr c93834Jr = c44079Je4.A02;
            C50104M9s c50104M9s = c93834Jr.A00;
            if (c50104M9s == null) {
                c50104M9s = new C50104M9s(c93834Jr);
                c93834Jr.A00 = c50104M9s;
            }
            Iterator<Map.Entry<C6C2, T>> it = c50104M9s.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                C14360o3.A0A(entry);
                C6C2 c6c2 = (C6C2) entry.getKey();
                Number number = (Number) entry.getValue();
                if (AbstractC44191Jfu.A00.contains(number) && (CDm = c2eg.CDm(c6c2.A01, c6c2.A00)) != null) {
                    C14360o3.A0A(number);
                    arrayList.add(new C9BO(CDm, number.intValue()));
                }
            }
            C164357Wy c164357Wy = c7ka.A00;
            boolean A01 = c164357Wy.A01();
            c7ka.A01.Cuz(arrayList);
            if (A01 && !c164357Wy.A02.A00) {
                c164357Wy.A00(false);
            }
        }
    }

    public final void A01() {
        C2ED c2ed = (C2ED) this.A02.invoke();
        if (c2ed != null) {
            C93814Jp c93814Jp = this.A04;
            String C7I = c2ed.C7I();
            String C7q = c2ed.C7q();
            if (C7I != null || C7q != null) {
                C44079Je4 c44079Je4 = (C44079Je4) c93814Jp.A01.A00(new C6C2(C7I, C7q));
                if (c44079Je4 != null) {
                    A00(this, c44079Je4);
                }
            }
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        C93814Jp c93814Jp = this.A04;
        InterfaceC50441MOv interfaceC50441MOv = this.A03;
        C14360o3.A0B(interfaceC50441MOv, 0);
        c93814Jp.A04.remove(interfaceC50441MOv);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        C93814Jp c93814Jp = this.A04;
        InterfaceC50441MOv interfaceC50441MOv = this.A03;
        C14360o3.A0B(interfaceC50441MOv, 0);
        c93814Jp.A04.add(interfaceC50441MOv);
        A01();
    }
}
