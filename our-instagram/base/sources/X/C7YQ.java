package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.store.ReplaceDirectMessageLoader;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7YQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7YQ implements C7YR {
    public final InterfaceC41501vz A00 = new InterfaceC41501vz() { // from class: X.7YS
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(1312190504);
            C7MN c7mn = (C7MN) obj;
            int A032 = C0f9.A03(-1794618868);
            C14360o3.A0B(c7mn, 0);
            int i = c7mn.A00;
            if (i == 162 || i == 163) {
                C7YQ.A00(C7YQ.this, c7mn.A02, c7mn.A01);
            }
            C0f9.A0A(-1646440196, A032);
            C0f9.A0A(586398846, A03);
        }
    };
    public final UserSession A01;
    public final InterfaceC08830cm A02;

    @Override // X.C7YR
    public final void FBP(String str, String str2) {
        C14360o3.A0B(str2, 1);
        A00(this, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(C7YQ c7yq, String str, String str2) {
        String str3;
        InterfaceC08830cm interfaceC08830cm = c7yq.A02;
        DirectThreadKey A02 = JRE.A02(((C7U0) interfaceC08830cm.get()).C7r().Afi());
        if (C14360o3.A0K(((C7U0) interfaceC08830cm.get()).C7r().C7I(), str) && A02 != null) {
            UserSession userSession = c7yq.A01;
            ArrayList Ab7 = C2JD.A00(userSession).Ab7(A02, true);
            ArrayList arrayList = new ArrayList();
            Iterator it = Ab7.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C83403nh c83403nh = (C83403nh) next;
                ImmutableList A0H = c83403nh.A0H();
                if (c83403nh.A10 == C2EY.A0z && A0H != null && !A0H.isEmpty()) {
                    Long l = ((C910143t) A0H.get(0)).A0o;
                    if (l != null) {
                        str3 = l.toString();
                    } else {
                        str3 = null;
                    }
                    if (C14360o3.A0K(str3, str2)) {
                        arrayList.add(next);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                C83403nh c83403nh2 = (C83403nh) arrayList.get(0);
                if (str != null) {
                    String A0h = c83403nh2.A0h();
                    if (A0h != null) {
                        String A0g = c83403nh2.A0g();
                        if (A0g != null) {
                            ReplaceDirectMessageLoader.A01(userSession, new C49328LrM(), str, A0h, A0g);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public C7YQ(UserSession userSession, InterfaceC08830cm interfaceC08830cm) {
        this.A01 = userSession;
        this.A02 = interfaceC08830cm;
    }
}
