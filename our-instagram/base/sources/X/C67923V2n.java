package X;

import android.content.Context;
import android.util.LruCache;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V2n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67923V2n extends C2US implements InterfaceC65242xM, InterfaceC65272xP {
    public String A00;
    public boolean A01;
    public final Context A03;
    public final V3A A05;
    public final C70083W2b A06;
    public final InterfaceC62602sz A08;
    public final C65842yM A09;
    public final LruCache A04 = new LruCache(100);
    public final C75113Zb A07 = new C75113Zb();
    public boolean A02 = false;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00() {
        this.A01 = true;
        clear();
        C70083W2b c70083W2b = this.A06;
        C1LC it = AbstractC31173DnH.A0L(c70083W2b.A01).iterator();
        while (it.hasNext()) {
            C84923qg c84923qg = (C84923qg) it.next();
            String str = c84923qg.A0G;
            LruCache lruCache = this.A04;
            C68859VdF c68859VdF = (C68859VdF) lruCache.get(str);
            C68859VdF c68859VdF2 = c68859VdF;
            if (c68859VdF == null) {
                Object obj = new Object();
                lruCache.put(c84923qg.A0G, obj);
                c68859VdF2 = obj;
            }
            X25 x25 = c70083W2b.A00;
            ImmutableSet A03 = ImmutableSet.A03(x25);
            C14360o3.A07(A03);
            c68859VdF2.A00 = A03.contains(c84923qg);
            InterfaceC65642y0 interfaceC65642y0 = this.A05;
            addModel(c84923qg, c68859VdF2, interfaceC65642y0);
            if (c84923qg.A01 > 0) {
                for (C84923qg c84923qg2 : c84923qg.A0L) {
                    if (C70083W2b.A00(c84923qg2)) {
                        C68859VdF c68859VdF3 = (C68859VdF) lruCache.get(c84923qg2.A0G);
                        C68859VdF c68859VdF4 = c68859VdF3;
                        if (c68859VdF3 == null) {
                            Object obj2 = new Object();
                            lruCache.put(c84923qg2.A0G, obj2);
                            c68859VdF4 = obj2;
                        }
                        ImmutableSet A032 = ImmutableSet.A03(x25);
                        C14360o3.A07(A032);
                        c68859VdF4.A00 = A032.contains(c84923qg2);
                        addModel(c84923qg2, c68859VdF4, interfaceC65642y0);
                    }
                }
            }
        }
        if (this.A02) {
            addModel(this.A08, this.A09);
        }
        notifyDataSetChanged();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ void A8q(Object obj, int i) {
    }

    @Override // X.InterfaceC65282xQ
    public final void Ct5() {
        this.A01 = false;
    }

    @Override // X.InterfaceC65272xP
    public final void ETA(InterfaceC686036x interfaceC686036x) {
    }

    @Override // X.InterfaceC65272xP
    public final void EUR(C33P c33p) {
    }

    public final void A01(C38321qM c38321qM) {
        if (c38321qM != null) {
            String id = c38321qM.getId();
            id.getClass();
            if (!id.equals(this.A00)) {
                this.A00 = c38321qM.getId();
            }
            this.A02 = c38321qM.A0X;
            List list = this.A06.A01;
            list.clear();
            List list2 = c38321qM.A0U;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (C70083W2b.A00((C84923qg) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                list.add(it.next());
            }
            this.A05.A00 = c38321qM;
            A00();
        }
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ List CCN() {
        return new ArrayList();
    }

    @Override // X.InterfaceC65282xQ
    public final boolean CSO() {
        return this.A01;
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public C67923V2n(Context context, CST cst, InterfaceC11380iw interfaceC11380iw, C57352kA c57352kA, InterfaceC62602sz interfaceC62602sz, InterfaceC71986XDx interfaceC71986XDx, C68861VdH c68861VdH) {
        this.A03 = context;
        C70083W2b c70083W2b = new C70083W2b();
        this.A06 = c70083W2b;
        C14360o3.A0B(c68861VdH, 0);
        c70083W2b.A00.A00.add(c68861VdH);
        V3A v3a = new V3A(context, cst, interfaceC11380iw, c57352kA, interfaceC71986XDx);
        this.A05 = v3a;
        C65842yM c65842yM = new C65842yM(context);
        this.A09 = c65842yM;
        this.A08 = interfaceC62602sz;
        init(v3a, c65842yM);
    }

    @Override // X.InterfaceC65282xQ
    public final void AVK() {
        A00();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ int BK6(String str) {
        return -1;
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        return this.A07;
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        A00();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ Object EFR(int i) {
        return null;
    }
}
