package X;

import com.facebook.common.memory.leaklistener.core.KeyedWeakReference;
import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: X.3Ts, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Ts implements C3Tt {
    public static final Random A02 = new Random();
    public int A00;
    public String A01;

    public final void A00(boolean z, String str, Map map, String str2) {
        C72641XjU c72641XjU;
        String str3;
        if (C2S1.A0Z != null) {
            C2S1 A00 = C2S1.A00();
            synchronized (A00) {
                InterfaceC08830cm interfaceC08830cm = A00.A0J;
                if (interfaceC08830cm != null && A00.A02 == null) {
                    AbstractC09780fb.A01("MemoryManager.getMemoryInstanceEventFactory", 1469400571);
                    A00.A02 = (C72641XjU) interfaceC08830cm.get();
                    AbstractC09780fb.A00(239582583);
                }
                c72641XjU = A00.A02;
            }
            if (c72641XjU != null) {
                C18920wW A002 = new C12210kP(AbstractC12960li.A00).A00();
                if (map.get("endpoint") != null) {
                    str3 = (String) map.get("endpoint");
                } else {
                    str3 = "";
                }
                String str4 = this.A01;
                Boolean valueOf = Boolean.valueOf(z);
                InterfaceC02590Ai A003 = A002.A00(A002.A00, "android_memory_instance");
                if (A003.isSampled()) {
                    String str5 = "";
                    if (str == null) {
                        str = "";
                    }
                    A003.AAP(AbstractC111324zv.A00(2049), str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    A003.AAP("surface_type", str2);
                    if (str4 == null) {
                        str4 = "";
                    }
                    A003.AAP("asl_session_id", str4);
                    if (str3 != null) {
                        str5 = str3;
                    }
                    A003.AAP("endpoint", str5);
                    A003.A7v("is_leak", valueOf);
                    A003.Cht();
                }
            }
        }
    }

    @Override // X.C3Tt
    public final boolean isEnabled() {
        return C2S1.A00().A07().A02();
    }

    @Override // X.C3Tt
    public final void onLeaksDetected(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            Object obj = reference.get();
            if (obj != null) {
                if (A02.nextInt(this.A00) == 0) {
                    Map emptyMap = Collections.emptyMap();
                    String name = obj.getClass().getName();
                    if (reference instanceof KeyedWeakReference) {
                        emptyMap = Collections.unmodifiableMap(((KeyedWeakReference) reference).mMetadata);
                    }
                    A00(true, name, emptyMap, null);
                }
            }
        }
    }
}
