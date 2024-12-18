package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.70g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1563670g implements InterfaceC13000lm {
    public final UserSession A00;
    public final Map A01;
    public final Map A02;

    public C1563670g(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
    }

    public final boolean A03(InterfaceC76653cC interfaceC76653cC) {
        C14360o3.A0B(interfaceC76653cC, 0);
        A00(interfaceC76653cC);
        EnumC77213d7 A0L = C57602kZ.A00(this.A00).A0L(interfaceC76653cC.BqJ(), interfaceC76653cC);
        C14360o3.A07(A0L);
        if (A0L != EnumC77213d7.A04) {
            return false;
        }
        return true;
    }

    private final void A00(InterfaceC76653cC interfaceC76653cC) {
        Map map = this.A01;
        List list = (List) map.get(interfaceC76653cC.BqK());
        if (list == null) {
            list = new ArrayList();
            map.put(interfaceC76653cC.BqK(), list);
        }
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC76653cC interfaceC76653cC2 = (InterfaceC76653cC) ((Reference) it.next()).get();
            if (interfaceC76653cC2 == null) {
                it.remove();
            } else if (interfaceC76653cC == interfaceC76653cC2) {
                z = true;
            } else if (A01(interfaceC76653cC) > A01(interfaceC76653cC2)) {
                boolean z2 = false;
                if (interfaceC76653cC2.CcN() != interfaceC76653cC.CcN()) {
                    z2 = true;
                }
                interfaceC76653cC2.Ed3(interfaceC76653cC.BqJ());
                this.A02.put(interfaceC76653cC2.BIa(), Long.valueOf(A01(interfaceC76653cC)));
                if (z2) {
                    interfaceC76653cC2.AEH(this.A00);
                }
            } else if (A01(interfaceC76653cC) < A01(interfaceC76653cC2)) {
                boolean z3 = false;
                if (interfaceC76653cC.CcN() != interfaceC76653cC2.CcN()) {
                    z3 = true;
                }
                interfaceC76653cC.Ed3(interfaceC76653cC2.BqJ());
                this.A02.put(interfaceC76653cC.BIa(), Long.valueOf(A01(interfaceC76653cC2)));
                if (z3) {
                    interfaceC76653cC.AEH(this.A00);
                }
            }
        }
        if (!z) {
            list.add(new WeakReference(interfaceC76653cC));
        }
    }

    public final long A01(InterfaceC76653cC interfaceC76653cC) {
        Number number = (Number) this.A02.get(interfaceC76653cC.BIa());
        if (number != null) {
            return number.longValue();
        }
        return interfaceC76653cC.BIc();
    }

    public final void A02(InterfaceC76653cC interfaceC76653cC) {
        Iterator it = this.A01.entrySet().iterator();
        while (it.hasNext()) {
            List list = (List) ((Map.Entry) it.next()).getValue();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Reference) it2.next()).get() == null) {
                    it2.remove();
                }
            }
            if (list.isEmpty()) {
                it.remove();
            }
        }
        A00(interfaceC76653cC);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.clear();
    }
}
