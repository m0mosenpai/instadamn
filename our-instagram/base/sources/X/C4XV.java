package X;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4XV, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4XV implements C4XW {
    public C4WZ A00;
    public Looper A01;
    public Timeline A02;
    public final ArrayList A06 = new ArrayList(1);
    public final HashSet A05 = new HashSet(1);
    public final C4XX A04 = new C4XX();
    public final C4XY A03 = new C4XY();

    public abstract void A0B();

    public abstract void A0C(C2BC c2bc);

    public final C4XX A09(C4WX c4wx) {
        return new C4XX(c4wx, this.A04.A02, 0, 0L);
    }

    public final void A0A(Timeline timeline) {
        this.A02 = timeline;
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            ((InterfaceC96694We) it.next()).DnO(timeline, this);
        }
    }

    @Override // X.C4XW
    public final void APN(InterfaceC96694We interfaceC96694We) {
        HashSet hashSet = this.A05;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(interfaceC96694We);
        if (z && hashSet.isEmpty() && (this instanceof AbstractC96994Xj)) {
            for (C97044Xp c97044Xp : ((AbstractC96994Xj) this).A02.values()) {
                c97044Xp.A02.APN(c97044Xp.A01);
            }
        }
    }

    @Override // X.C4XW
    public final void ARR(InterfaceC96694We interfaceC96694We) {
        this.A01.getClass();
        HashSet hashSet = this.A05;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC96694We);
        if (isEmpty && (this instanceof AbstractC96994Xj)) {
            for (C97044Xp c97044Xp : ((AbstractC96994Xj) this).A02.values()) {
                c97044Xp.A02.ARR(c97044Xp.A01);
            }
        }
    }

    @Override // X.C4XW
    public final /* synthetic */ Timeline BHj() {
        if (this instanceof AbstractC96984Xi) {
            return ((AbstractC96984Xi) this).A00.BHj();
        }
        return null;
    }

    @Override // X.C4XW
    public final /* synthetic */ boolean CdN() {
        if (this instanceof AbstractC96984Xi) {
            return ((AbstractC96984Xi) this).A00.CdN();
        }
        return true;
    }

    @Override // X.C4XW
    public final void EER(InterfaceC96694We interfaceC96694We) {
        ArrayList arrayList = this.A06;
        arrayList.remove(interfaceC96694We);
        if (arrayList.isEmpty()) {
            this.A01 = null;
            this.A02 = null;
            this.A00 = null;
            this.A05.clear();
            A0B();
            return;
        }
        APN(interfaceC96694We);
    }

    @Override // X.C4XW
    public final void EFC(C4WA c4wa) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03.A02;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C97054Xq c97054Xq = (C97054Xq) it.next();
            if (c97054Xq.A01 == c4wa) {
                copyOnWriteArrayList.remove(c97054Xq);
            }
        }
    }

    @Override // X.C4XW
    public final void EFJ(C4TW c4tw) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A04.A02;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C96954Xf c96954Xf = (C96954Xf) it.next();
            if (c96954Xf.A01 == c4tw) {
                copyOnWriteArrayList.remove(c96954Xf);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.4Xf, java.lang.Object] */
    @Override // X.C4XW
    public final void A8U(Handler handler, C4TW c4tw) {
        handler.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = this.A04.A02;
        ?? obj = new Object();
        obj.A00 = handler;
        obj.A01 = c4tw;
        copyOnWriteArrayList.add(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r1 == r2) goto L6;
     */
    @Override // X.C4XW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E5p(X.C4WZ r4, X.InterfaceC96694We r5, X.C2BC r6) {
        /*
            r3 = this;
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r1 = r3.A01
            if (r1 == 0) goto Lb
            r0 = 0
            if (r1 != r2) goto Lc
        Lb:
            r0 = 1
        Lc:
            X.C4B8.A03(r0)
            r3.A00 = r4
            com.google.android.exoplayer2.Timeline r1 = r3.A02
            java.util.ArrayList r0 = r3.A06
            r0.add(r5)
            android.os.Looper r0 = r3.A01
            if (r0 != 0) goto L27
            r3.A01 = r2
            java.util.HashSet r0 = r3.A05
            r0.add(r5)
            r3.A0C(r6)
        L26:
            return
        L27:
            if (r1 == 0) goto L26
            r3.ARR(r5)
            r5.DnO(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4XV.E5p(X.4WZ, X.4We, X.2BC):void");
    }
}
