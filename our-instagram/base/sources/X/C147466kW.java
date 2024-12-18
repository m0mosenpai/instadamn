package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.6kW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147466kW extends AbstractC60592pi {
    public static final HashMap A06 = new HashMap();
    public boolean A00;
    public final C62862tP A01;
    public final HashMap A03 = new HashMap();
    public final LinkedList A04 = new LinkedList();
    public final HashMap A05 = new HashMap();
    public final HashMap A02 = new HashMap();

    public final C138276Oi A00(String str) {
        C207399Fs c207399Fs = new C207399Fs(str, 4);
        HashMap hashMap = this.A03;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Boolean) c207399Fs.invoke(entry.getKey())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C138276Oi c138276Oi = (C138276Oi) AbstractC001800i.A0A(linkedHashMap.keySet());
        if (c138276Oi == null) {
            return (C138276Oi) this.A05.get(str);
        }
        return c138276Oi;
    }

    public final void A01(C138276Oi c138276Oi) {
        String str;
        InterfaceC74623Ww interfaceC74623Ww = c138276Oi.A01;
        HashMap hashMap = this.A03;
        if (!hashMap.containsKey(c138276Oi) && interfaceC74623Ww != null) {
            LinkedList linkedList = this.A04;
            Object obj = null;
            if (!linkedList.isEmpty()) {
                obj = linkedList.poll();
                if (obj == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (hashMap.size() < 3) {
                C62862tP c62862tP = this.A01;
                AbstractC12990ll abstractC12990ll = c62862tP.A06;
                C14360o3.A07(abstractC12990ll);
                if (abstractC12990ll instanceof UserSession) {
                    C42577Isv c42577Isv = new C42577Isv(this);
                    Fragment fragment = c62862tP.A02;
                    fragment.getClass();
                    if (fragment.isResumed() && fragment.getContext() != null) {
                        obj = new C68106VBk(fragment.requireContext(), (UserSession) abstractC12990ll, c42577Isv);
                    } else {
                        str = "Cannot create video player while fragment is not at least resumed";
                    }
                } else {
                    str = "Expected logged-in session to dequeue reusable player, but received logged-out session";
                }
                AbstractC25241Le.A02("BKPlayerManager", str);
                return;
            }
            C68106VBk c68106VBk = (C68106VBk) obj;
            if (c68106VBk != null) {
                hashMap.put(c138276Oi, obj);
                if (c68106VBk.A00 == null) {
                    c68106VBk.A00 = c138276Oi;
                }
                L56 l56 = c138276Oi.A02;
                AbstractC79383gk.A02(null);
                C4QW c4qw = c68106VBk.A02;
                if ((c4qw == null || ((C4QT) c4qw).A0M != C3Q0.STOPPING) && c68106VBk.A01 != l56) {
                    c68106VBk.A01 = l56;
                    if (c4qw == null) {
                        C4QT A00 = C4QS.A00(c68106VBk.A05, c68106VBk.A07, c68106VBk.A09, c68106VBk, c68106VBk.A08.getModuleName());
                        c68106VBk.A02 = A00;
                        A00.Ed6(c68106VBk.A01.A04);
                        c68106VBk.A02.EYb(c68106VBk.A01.A02);
                        c4qw = c68106VBk.A02;
                        C4QT c4qt = (C4QT) c4qw;
                        c4qt.A0N = c68106VBk;
                        c4qt.A0X = true;
                    }
                    c4qw.getClass();
                    C4QW c4qw2 = c68106VBk.A02;
                    if (((C4QT) c4qw2).A0M == C3Q0.IDLE) {
                        C75363a3 c75363a3 = l56.A05;
                        C4S7 c4s7 = new C4S7(l56, 0);
                        float f = 1.0f;
                        if (l56.A09) {
                            f = 0.0f;
                        }
                        boolean z = l56.A01;
                        c4qw2.E5v(new C4SC(interfaceC74623Ww, new C4QP(false, false, false, false), c75363a3, c4s7, null, l56.A06, f, -1, l56.A00, z));
                    }
                }
                if (l56.A01) {
                    this.A05.remove(c138276Oi.A00());
                }
            }
        }
    }

    public final void A03(String str) {
        String str2;
        C138276Oi c138276Oi;
        LinkedList linkedList = this.A04;
        if (linkedList.isEmpty()) {
            HashMap hashMap = this.A03;
            if (hashMap.size() == 3) {
                HashMap hashMap2 = this.A02;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : hashMap2.entrySet()) {
                    if (hashMap.containsKey(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                Object obj = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        float floatValue = ((Number) ((Map.Entry) obj).getValue()).floatValue();
                        do {
                            Object next = it.next();
                            float floatValue2 = ((Number) ((Map.Entry) next).getValue()).floatValue();
                            if (Float.compare(floatValue, floatValue2) > 0) {
                                obj = next;
                                floatValue = floatValue2;
                            }
                        } while (it.hasNext());
                    }
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (entry2 != null && (c138276Oi = (C138276Oi) entry2.getKey()) != null) {
                    A02(c138276Oi, "context_switch", false);
                }
            }
        }
        C138276Oi A00 = A00(str);
        if (A00 != null) {
            HashMap hashMap3 = this.A05;
            if (hashMap3.containsKey(str)) {
                hashMap3.remove(str);
                A01(A00);
            }
            HashMap hashMap4 = this.A03;
            C68106VBk c68106VBk = (C68106VBk) hashMap4.get(A00);
            if (c68106VBk == null) {
                int size = linkedList.size();
                int size2 = hashMap4.size();
                if (hashMap3.containsKey(str)) {
                    str2 = "stopped";
                } else {
                    str2 = "idle";
                }
                AbstractC25241Le.A02("BKPlayerManager", AnonymousClass001.A0x("Expected video to have been registered to manager | Available: ", ", In-use: ", ", Controller State: ", str2, size, size2));
                return;
            }
            c68106VBk.A01(true);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A00 = true;
        Collection values = this.A03.values();
        C14360o3.A07(values);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((C68106VBk) it.next()).A00(false);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        this.A00 = false;
        HashMap hashMap = this.A03;
        java.util.Set<C138276Oi> keySet = hashMap.keySet();
        C14360o3.A07(keySet);
        for (C138276Oi c138276Oi : keySet) {
            Object obj = hashMap.get(c138276Oi);
            if (obj != null) {
                ((C68106VBk) obj).A01(c138276Oi.A02.A01);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final void A02(C138276Oi c138276Oi, String str, boolean z) {
        int i;
        C3Q0 c3q0;
        C68106VBk c68106VBk = (C68106VBk) this.A03.remove(c138276Oi);
        if (c68106VBk != null) {
            C4QW c4qw = c68106VBk.A02;
            if (c4qw != null && (c3q0 = ((C4QT) c4qw).A0M) != C3Q0.IDLE && c3q0 != C3Q0.STOPPING) {
                i = c4qw.getCurrentPositionMs();
                c68106VBk.A02.Eol(str, false);
                c68106VBk.A06.A03(c68106VBk);
            } else {
                i = 0;
            }
            c68106VBk.A00 = null;
            LinkedList linkedList = this.A04;
            if (!linkedList.contains(c68106VBk)) {
                linkedList.add(c68106VBk);
            }
            L56 l56 = c138276Oi.A02;
            if (z) {
                i = 0;
            }
            l56.A00 = i;
            this.A05.put(c138276Oi.A00(), c138276Oi);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        C62862tP c62862tP = this.A01;
        c62862tP.A06(this);
        this.A03.clear();
        this.A04.clear();
        this.A05.clear();
        this.A02.clear();
        A06.remove(c62862tP);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        Collection values = this.A03.values();
        C14360o3.A07(values);
        for (Object obj : values) {
            C14360o3.A07(obj);
            C68106VBk c68106VBk = (C68106VBk) obj;
            C4QW c4qw = c68106VBk.A02;
            if (c4qw != null) {
                c4qw.EE4("fragment_paused");
                c68106VBk.A03 = false;
                c68106VBk.A02 = null;
            }
        }
        this.A04.addAll(values);
    }

    public C147466kW(C62862tP c62862tP) {
        this.A01 = c62862tP;
        c62862tP.A05(this);
    }
}
