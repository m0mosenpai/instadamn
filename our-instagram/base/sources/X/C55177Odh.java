package X;

import android.os.Handler;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Odh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55177Odh {
    public InterfaceC58064Pop A00;
    public OJM A01;
    public final Handler A02;
    public final HashMap A03;

    /* JADX WARN: Multi-variable type inference failed */
    public C55177Odh() {
        this(null, 0 == true ? 1 : 0, 1);
    }

    public final void A03(InterfaceC57854PlK interfaceC57854PlK) {
        C14360o3.A0B(interfaceC57854PlK, 0);
        OXE oxe = OXE.A00;
        Class<?> cls = interfaceC57854PlK.getClass();
        oxe.A00("RtcPresenterActionDispatcher", AnonymousClass001.A0R("Dispatching state action=", cls.getSimpleName()));
        A00(this, cls);
        InterfaceC58064Pop interfaceC58064Pop = this.A00;
        if (interfaceC58064Pop != null) {
            interfaceC58064Pop.A7P(interfaceC57854PlK);
        }
    }

    public final void A05(InterfaceC57858PlO interfaceC57858PlO) {
        C14360o3.A0B(interfaceC57858PlO, 0);
        Class<?> cls = interfaceC57858PlO.getClass();
        String simpleName = cls.getSimpleName();
        A00(this, cls);
        OJM ojm = this.A01;
        if (ojm != null) {
            List list = (List) AbstractC06930Yk.A01(AbstractC25225BEi.A1D(cls), (Map) ojm.A02.getValue());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AbstractC55206OeJ) it.next()).A0K(interfaceC57858PlO);
            }
            if (list.isEmpty()) {
                C0K8.A0C("RtcPresenterActionDispatcher", AnonymousClass001.A0R("No presenters registered for action=", simpleName));
            }
        }
    }

    public final void A06(InterfaceC57858PlO interfaceC57858PlO, long j) {
        C14360o3.A0B(interfaceC57858PlO, 0);
        Class<?> cls = interfaceC57858PlO.getClass();
        A00(this, cls);
        PRK prk = new PRK(this, interfaceC57858PlO);
        this.A03.put(AbstractC25225BEi.A1D(cls), prk);
        this.A02.postDelayed(prk, j);
    }

    public final boolean A07(InterfaceC57857PlN interfaceC57857PlN) {
        Class<?> cls = interfaceC57857PlN.getClass();
        A00(this, cls);
        OJM ojm = this.A01;
        if (ojm == null) {
            return false;
        }
        List A12 = AbstractC43592JPx.A12(AbstractC25225BEi.A1D(cls), ojm.A01);
        if (A12 == null) {
            A12 = C16930sl.A00;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A12.iterator();
        while (it.hasNext()) {
            Object obj = ((AbstractMap) ojm.A03.getValue()).get(it.next());
            if (obj != null) {
                A1E.add(obj);
            }
        }
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            if (((AbstractC55206OeJ) it2.next()).A0L(interfaceC57857PlN)) {
                return true;
            }
        }
        if (!A1E.isEmpty()) {
            return false;
        }
        C0K8.A0C("RtcPresenterActionDispatcher", AnonymousClass001.A0R("No consumable presenters registered for action=", cls.getSimpleName()));
        return false;
    }

    public static void A00(C55177Odh c55177Odh, Class cls) {
        C0YZ c0yz = new C0YZ(cls);
        Runnable runnable = (Runnable) c55177Odh.A03.remove(c0yz);
        if (runnable != null) {
            AbstractC53012bi.A00(c0yz);
            c55177Odh.A02.removeCallbacks(runnable);
        }
    }

    public static void A01(C55177Odh c55177Odh, boolean z) {
        c55177Odh.A05(new PDI(z));
    }

    public static void A02(C55177Odh c55177Odh, boolean z) {
        c55177Odh.A07(new PCX(z));
    }

    public /* synthetic */ C55177Odh(Handler handler, DefaultConstructorMarker defaultConstructorMarker, int i) {
        this.A02 = AbstractC167007dF.A0J();
        this.A03 = AbstractC166987dD.A1G();
    }

    public final void A04(InterfaceC57854PlK interfaceC57854PlK, long j) {
        Class<?> cls = interfaceC57854PlK.getClass();
        A00(this, cls);
        PRL prl = new PRL(this, interfaceC57854PlK);
        this.A03.put(AbstractC25225BEi.A1D(cls), prl);
        this.A02.postDelayed(prl, j);
    }
}
