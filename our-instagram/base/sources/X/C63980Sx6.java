package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.memory.leaklistener.core.KeyedWeakReference;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Sx6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63980Sx6 implements C3Tt {
    public final ReferenceQueue A00;
    public final Map A01;
    public final Map A02;
    public final String A03;
    public final String A04;

    @Override // X.C3Tt
    public final void onLeaksDetected(Collection collection) {
        ReferenceQueue referenceQueue;
        ArrayList A11;
        ArrayList A1E = AbstractC166987dD.A1E();
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            Object obj = reference.get();
            if (obj != null) {
                A1E.add(obj);
                if (reference instanceof KeyedWeakReference) {
                    A1G.put(obj, Collections.unmodifiableMap(((KeyedWeakReference) reference).mMetadata));
                }
            }
        }
        synchronized (this) {
            referenceQueue = this.A00;
            for (Reference poll = referenceQueue.poll(); poll != null; poll = referenceQueue.poll()) {
                String str = (String) this.A02.remove(poll);
                if (str != null) {
                    Map map = this.A01;
                    AtomicInteger atomicInteger = (AtomicInteger) map.get(str);
                    if (atomicInteger != null && atomicInteger.decrementAndGet() == 0) {
                        map.remove(str);
                    }
                }
            }
        }
        if (!A1E.isEmpty()) {
            synchronized (this) {
                Iterator it2 = A1E.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    String A0h = MSY.A0h(next);
                    Map map2 = this.A01;
                    AtomicInteger atomicInteger2 = (AtomicInteger) map2.get(A0h);
                    if (atomicInteger2 == null) {
                        atomicInteger2 = new AtomicInteger();
                        map2.put(A0h, atomicInteger2);
                    }
                    atomicInteger2.incrementAndGet();
                    this.A02.put(new WeakReference(next, referenceQueue), A0h);
                }
            }
            String str2 = (String) C2S1.A00().A0M.get();
            C2S1 A00 = C2S1.A00();
            synchronized (A00) {
                if (A00.A03 == null) {
                    AbstractC09780fb.A01("MemoryManager.getMemoryLeakEventFactory", 1004821411);
                    InterfaceC08830cm interfaceC08830cm = A00.A0L;
                    interfaceC08830cm.getClass();
                    A00.A03 = (S5F) interfaceC08830cm.get();
                    AbstractC09780fb.A00(-1913443646);
                }
            }
            synchronized (this) {
                A11 = AbstractC58319PtB.A11(A1E);
                Iterator it3 = A1E.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    String A0h2 = MSY.A0h(next2);
                    Map map3 = (Map) A1G.get(next2);
                    AtomicInteger atomicInteger3 = (AtomicInteger) this.A01.get(A0h2);
                    if (atomicInteger3 != null) {
                        int i = atomicInteger3.get();
                        if (map3 == null) {
                            map3 = Collections.emptyMap();
                        }
                        A11.add(new C62533SFk(A0h2, i, map3));
                    }
                }
            }
            Iterator it4 = A11.iterator();
            while (it4.hasNext()) {
                C62533SFk c62533SFk = (C62533SFk) it4.next();
                C18920wW A002 = new C12210kP(AbstractC12960li.A00).A00();
                String str3 = c62533SFk.A01;
                Integer valueOf = Integer.valueOf(c62533SFk.A00);
                String str4 = this.A04;
                String str5 = this.A03;
                Map map4 = c62533SFk.A02;
                String A1A = AbstractC166987dD.A1A("endpoint", map4);
                String A1A2 = AbstractC166987dD.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, map4);
                String A1A3 = AbstractC166987dD.A1A("additional_logged_classname", map4);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A002, "android_memory_leak");
                if (A0f.isSampled()) {
                    str3.getClass();
                    A0f.AAP("leaked_classname", str3);
                    valueOf.getClass();
                    A0f.A9K("leaked_instance_count", Long.valueOf(valueOf.longValue()));
                    str4.getClass();
                    A0f.AAP("runtime_session_id", str4);
                    A0f.AAP(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
                    A0f.AAP("asl_session_id", str5);
                    A0f.AAP("endpoint", A1A);
                    A0f.AAP("leaked_type", A1A2);
                    A0f.AAP("additional_logged_classname", A1A3);
                    A0f.Cht();
                }
            }
        }
    }

    public C63980Sx6(String str) {
        this.A00 = new ReferenceQueue();
        this.A02 = AbstractC166987dD.A1G();
        this.A01 = AbstractC166987dD.A1G();
        this.A04 = C2SD.A00().toString();
        this.A03 = str;
    }

    @Override // X.C3Tt
    public final boolean isEnabled() {
        return C2S1.A00().A07().A03();
    }

    public C63980Sx6() {
        this(null);
    }
}
