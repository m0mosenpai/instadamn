package com.instagram.login.smartlock.impl;

import X.AbstractC12990ll;
import X.AbstractC1335861e;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25230BEn;
import X.AbstractC27461Uz;
import X.AbstractC43592JPx;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC62396S9v;
import X.AnonymousClass001;
import X.C005001p;
import X.C1340363l;
import X.C3U5;
import X.C60650RGb;
import X.C61U;
import X.C61W;
import X.C63179See;
import X.C69I;
import X.InterfaceC1340663q;
import X.InterfaceC65457TkT;
import X.InterfaceC65566Tms;
import X.MSW;
import X.MSY;
import X.RH1;
import X.SA2;
import X.T50;
import X.T51;
import X.T53;
import X.TGW;
import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes10.dex */
public class SmartLockPluginImpl extends AbstractC27461Uz {
    public final Map A02 = new WeakHashMap();
    public final Map A01 = new WeakHashMap();
    public boolean A00 = true;
    public final Map A03 = new WeakHashMap();

    @Override // X.AbstractC27461Uz
    public boolean getShouldShowSmartLockForLogin() {
        return this.A00;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [X.01p, X.0yX, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.01p, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.01p, X.0yX, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.01p, java.util.Map] */
    @Override // X.AbstractC27461Uz
    public void getSmartLockBroker(FragmentActivity fragmentActivity, InterfaceC65457TkT interfaceC65457TkT, AbstractC12990ll abstractC12990ll, boolean z) {
        Object obj;
        if (fragmentActivity == null) {
            obj = null;
        } else {
            Map map = this.A02;
            if (map.containsKey(fragmentActivity)) {
                obj = map.get(fragmentActivity);
            } else {
                Map map2 = this.A01;
                Set set = (Set) map2.get(fragmentActivity);
                if (set != null) {
                    set.add(interfaceC65457TkT);
                    return;
                }
                HashSet A1H = AbstractC166987dD.A1H();
                A1H.add(interfaceC65457TkT);
                map2.put(fragmentActivity, A1H);
                TGW tgw = new TGW(1, this, fragmentActivity);
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
                if (AbstractC58318PtA.A05(fragmentActivity, googleApiAvailability) == 0) {
                    C63179See c63179See = new C63179See(abstractC12990ll);
                    Context applicationContext = fragmentActivity.getApplicationContext();
                    C61W c61w = null;
                    HashSet A1H2 = AbstractC166987dD.A1H();
                    HashSet A1H3 = AbstractC166987dD.A1H();
                    ?? c005001p = new C005001p(0);
                    ?? c005001p2 = new C005001p(0);
                    C61U c61u = AbstractC62396S9v.A00;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Looper mainLooper = applicationContext.getMainLooper();
                    String packageName = applicationContext.getPackageName();
                    String A0h = MSY.A0h(applicationContext);
                    C61W c61w2 = SA2.A04;
                    C3U5.A03(c61w2, "Api must not be null");
                    c005001p2.put(c61w2, null);
                    C3U5.A03(c61w2.A00, "Base client builder must not be null");
                    List emptyList = Collections.emptyList();
                    A1H3.addAll(emptyList);
                    A1H2.addAll(emptyList);
                    T51 t51 = new T51(new TGW(0, tgw, c63179See), z);
                    int i = t51.A01;
                    A1E.add(t51);
                    C3U5.A08(MSW.A1b(c005001p2), "must call addApi() to add at least one API");
                    C69I c69i = C69I.A00;
                    C61W c61w3 = AbstractC62396S9v.A04;
                    if (c005001p2.containsKey(c61w3)) {
                        c69i = (C69I) c005001p2.get(c61w3);
                    }
                    C1340363l c1340363l = new C1340363l(c69i, packageName, A0h, c005001p, A1H2);
                    Map map3 = c1340363l.A04;
                    ?? c005001p3 = new C005001p(0);
                    ?? c005001p4 = new C005001p(0);
                    ArrayList A1E3 = AbstractC166987dD.A1E();
                    for (C61W c61w4 : c005001p2.keySet()) {
                        Object obj2 = c005001p2.get(c61w4);
                        boolean A1W = AbstractC167007dF.A1W(map3.get(c61w4));
                        AbstractC43592JPx.A1W(c61w4, c005001p3, A1W);
                        T50 t50 = new T50(c61w4, A1W);
                        A1E3.add(t50);
                        C61U c61u2 = c61w4.A00;
                        C3U5.A02(c61u2);
                        InterfaceC1340663q A00 = c61u2.A00(applicationContext, mainLooper, t50, t50, c1340363l, obj2);
                        c005001p4.put(c61w4.A01, A00);
                        if (A00.E6l()) {
                            if (c61w == null) {
                                c61w = c61w4;
                            } else {
                                throw AbstractC58319PtB.A0k(c61w4.A02, " cannot be used with ", c61w.A02);
                            }
                        }
                    }
                    if (c61w != null) {
                        Object[] objArr = {c61w.A02};
                        if (!A1H2.equals(A1H3)) {
                            throw AbstractC58319PtB.A0l("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", objArr);
                        }
                    }
                    C60650RGb c60650RGb = new C60650RGb(applicationContext, mainLooper, googleApiAvailability, c61u, c1340363l, A1E3, A1E, A1E2, c005001p3, c005001p4, new ReentrantLock(), i, C60650RGb.A00(c005001p4.values(), true));
                    Set set2 = AbstractC1335861e.A00;
                    synchronized (set2) {
                        set2.add(c60650RGb);
                    }
                    InterfaceC65566Tms A002 = LifecycleCallback.A00(fragmentActivity);
                    RH1 rh1 = (RH1) A002.Ajs(RH1.class, "AutoManageHelper");
                    if (rh1 == null) {
                        rh1 = new RH1(A002);
                    }
                    SparseArray sparseArray = rh1.A00;
                    int indexOfKey = sparseArray.indexOfKey(i);
                    C3U5.A09(AbstractC25230BEn.A1P(indexOfKey), AnonymousClass001.A0O("Already managing a GoogleApiClient with id ", i));
                    Object obj3 = rh1.A01.get();
                    String.valueOf(obj3);
                    T53 t53 = new T53(t51, c60650RGb, rh1, i);
                    c60650RGb.A0D(t53);
                    sparseArray.put(i, t53);
                    if (rh1.A03 && obj3 == null) {
                        c60650RGb.toString();
                        c60650RGb.A08();
                    }
                    t51.A00 = c60650RGb;
                    c63179See.A00 = t51;
                    return;
                }
                tgw.D6e(null);
                return;
            }
        }
        interfaceC65457TkT.D6e(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001c, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.RGT, X.61Q] */
    @Override // X.AbstractC27461Uz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.InterfaceC37102GWm listenForSmsResponse(android.app.Activity r6, boolean r7) {
        /*
            r5 = this;
            java.util.Map r4 = r5.A03
            java.lang.Object r3 = r4.get(r6)
            X.GWm r3 = (X.InterfaceC37102GWm) r3
            if (r7 != 0) goto L1c
            if (r3 == 0) goto L34
            r1 = r3
            X.Dwp r1 = (X.C31736Dwp) r1
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A03
            boolean r0 = r0.get()
            if (r0 != 0) goto L1b
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L1e
        L1b:
            return r3
        L1c:
            if (r3 == 0) goto L34
        L1e:
            X.Dwp r3 = (X.C31736Dwp) r3
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A03
            boolean r0 = r1.get()
            if (r0 == 0) goto L34
            r0 = 0
            boolean r0 = r1.getAndSet(r0)
            if (r0 == 0) goto L34
            android.content.Context r0 = r3.A02
            r0.unregisterReceiver(r3)
        L34:
            X.61W r2 = X.RGT.A00
            X.61Y r1 = X.C61X.A00
            X.61Z r0 = X.C61Z.A02
            X.RGT r3 = new X.RGT
            r3.<init>(r6, r1, r2, r0)
            X.SYp r2 = X.SWk.A00()
            X.T5E r0 = new X.T5E
            r0.<init>()
            r2.A01 = r0
            r1 = 1
            com.google.android.gms.common.Feature r0 = X.AbstractC62386S9l.A02
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[]{r0}
            r2.A03 = r0
            r0 = 1567(0x61f, float:2.196E-42)
            X.5KS r2 = X.C62947SYp.A00(r3, r2, r0, r1)
            X.Dwp r3 = new X.Dwp
            r3.<init>(r6)
            r1 = 3
            X.T70 r0 = new X.T70
            r0.<init>(r3, r1)
            r2.A0A(r0)
            r4.put(r6, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.login.smartlock.impl.SmartLockPluginImpl.listenForSmsResponse(android.app.Activity, boolean):X.GWm");
    }

    @Override // X.AbstractC27461Uz
    public void setShouldShowSmartLockForLogin(boolean z) {
        this.A00 = z;
    }

    @Override // X.AbstractC27461Uz
    public void getSmartLockBroker(FragmentActivity fragmentActivity, InterfaceC65457TkT interfaceC65457TkT, AbstractC12990ll abstractC12990ll) {
        getSmartLockBroker(fragmentActivity, interfaceC65457TkT, abstractC12990ll, false);
    }
}
