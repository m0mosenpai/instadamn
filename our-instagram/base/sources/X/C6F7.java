package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.6F7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6F7 implements C6F3 {
    public final C6F8 A00 = new C6F8();
    public final ExecutorService A02 = Executors.newSingleThreadExecutor();
    public final Map A01 = new LinkedHashMap();

    @Override // X.C6F3
    public final CQB EgO(C6FG c6fg, C6FQ c6fq, AnonymousClass630 anonymousClass630, InterfaceC102844kL interfaceC102844kL, C63162tt c63162tt) {
        C14360o3.A0B(interfaceC102844kL, 2);
        String str = ((C102834kK) interfaceC102844kL).A00;
        Map map = this.A01;
        Object obj = map.get(str);
        if (obj == null) {
            obj = new ArrayList();
            map.put(str, obj);
        }
        ((Collection) obj).add(new WeakReference(anonymousClass630));
        return new CQB(new RunnableC49917M2k(this, str), null);
    }
}
