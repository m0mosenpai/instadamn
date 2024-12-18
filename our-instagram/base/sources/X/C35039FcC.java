package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.FcC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35039FcC {
    public final InterfaceC16820sZ A01;
    public final Map A00 = AbstractC166987dD.A1I();
    public final HashMap A03 = AbstractC166987dD.A1G();
    public final C05A A02 = AbstractC31171DnF.A0o();

    public final synchronized void A02(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A00;
        List list = (List) map.get(str);
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (((E6M) obj).A02 != C05F.A0N) {
                    A1E.add(obj);
                }
            }
            ArrayList A0U = AbstractC001800i.A0U(A1E);
            if (!A0U.isEmpty()) {
                map.put(str, A0U);
                A00(this, str);
            }
        }
        map.remove(str);
        A00(this, str);
    }

    public final synchronized void A03(String str, String str2) {
        Map map = this.A00;
        List list = (List) map.get(str);
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                AbstractC25232BEp.A1Q(((E6M) obj).A03, str2, obj, A1E);
            }
            map.put(str, AbstractC001800i.A0U(A1E));
            A00(this, str);
        }
    }

    public final synchronized void A04(String str, String str2, String str3) {
        Map map = this.A00;
        List<E6M> list = (List) map.get(str);
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (E6M e6m : list) {
                if (!C14360o3.A0K(e6m.A03, str2)) {
                    A1E.add(e6m);
                } else {
                    A1E2.add(new C51731MtC(e6m.A01, C05F.A0N, str, str3, e6m.A04, e6m.A00));
                }
            }
            map.put(str, A1E);
            A00(this, str);
            this.A02.Egh(AbstractC001800i.A0a(A1E2));
        }
    }

    public static final void A00(C35039FcC c35039FcC, String str) {
        Object obj;
        C05A c05a = (C05A) c35039FcC.A03.get(str);
        if (c05a != null) {
            synchronized (c35039FcC) {
                List list = (List) c35039FcC.A00.get(str);
                if (list != null) {
                    obj = AbstractC001800i.A0a(list);
                } else {
                    obj = C16930sl.A00;
                }
            }
            c05a.Egh(obj);
        }
    }

    public final AnonymousClass059 A01(String str) {
        Object obj;
        HashMap hashMap = this.A03;
        C05A c05a = (C05A) hashMap.get(str);
        if (c05a == null) {
            synchronized (this) {
                List list = (List) this.A00.get(str);
                if (list != null) {
                    obj = AbstractC001800i.A0a(list);
                } else {
                    obj = C16930sl.A00;
                }
            }
            c05a = C10E.A00(obj);
            hashMap.put(str, c05a);
        }
        return AbstractC208910l.A02(c05a);
    }

    public C35039FcC(InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = interfaceC16820sZ;
    }
}
