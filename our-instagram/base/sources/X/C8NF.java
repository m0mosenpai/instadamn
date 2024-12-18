package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8NF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NF extends C193578hc {
    public AnonymousClass840 A00;
    public boolean A01;
    public final UserSession A02;
    public final C1818484t A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final C05A A07;
    public final C0UO A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8NF(Application application, UserSession userSession, C1818484t c1818484t) {
        super(application);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c1818484t, 3);
        this.A02 = userSession;
        this.A03 = c1818484t;
        ArrayList arrayList = new ArrayList(C8M4.A00(userSession).A02(true));
        this.A04 = arrayList;
        C008002u c008002u = new C008002u(new C8NG(C05F.A0N, 0.0f, 0, 0));
        this.A07 = c008002u;
        this.A06 = new ArrayList();
        this.A08 = c008002u;
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            arrayList2.add(new C09530e4(Integer.valueOf(intValue), C8M4.A00(this.A02).A01(intValue).A04));
        }
        this.A05 = arrayList2;
    }

    public static final void A00(C8NF c8nf, InterfaceC16620sF interfaceC16620sF, int i) {
        C55105ObK A00 = C50713MaC.A00(c8nf.A02);
        Application application = ((C193578hc) c8nf).A00;
        C14360o3.A0C(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        List singletonList = Collections.singletonList(new O7H(new C23720Aet(c8nf, interfaceC16620sF), i));
        C14360o3.A07(singletonList);
        A00.A07(application, singletonList);
    }
}
