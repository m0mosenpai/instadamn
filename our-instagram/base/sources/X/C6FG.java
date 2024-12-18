package X;

import android.content.Context;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6FG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6FG implements C6FH {
    public final Context A00;
    public final SparseArray A01;
    public final InterfaceC62872tQ A02;
    public final Map A03 = Collections.synchronizedMap(new HashMap(4));
    public final Map A04 = new HashMap(4);
    public final boolean A05;

    public final Object A00(int i) {
        Object obj = this.A01.get(i);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(AnonymousClass001.A0R("Null value associated with key: ", this.A00.getResources().getResourceEntryName(i)));
    }

    public final Object A01(InterfaceC102914kS interfaceC102914kS, C102884kP c102884kP, int i) {
        Integer valueOf;
        Object obj;
        Object obj2;
        int i2 = c102884kP.A04;
        synchronized (this) {
            Map map = this.A04;
            valueOf = Integer.valueOf(i2);
            obj = map.get(valueOf);
            if (obj == null) {
                obj = new Object();
                map.put(valueOf, obj);
            }
        }
        synchronized (obj) {
            Map map2 = this.A03;
            SparseArray sparseArray = (SparseArray) map2.get(valueOf);
            if (sparseArray == null) {
                sparseArray = new SparseArray(2);
                map2.put(valueOf, sparseArray);
            }
            obj2 = sparseArray.get(i);
            if (obj2 == null) {
                obj2 = interfaceC102914kS.CsV(this, c102884kP);
            }
            sparseArray.put(i, obj2);
        }
        return obj2;
    }

    @Override // X.C6FH
    public final boolean CSL() {
        return this.A05;
    }

    public C6FG(Context context, SparseArray sparseArray, InterfaceC62872tQ interfaceC62872tQ) {
        this.A00 = context;
        this.A02 = interfaceC62872tQ;
        this.A05 = interfaceC62872tQ.AgS().AF5(context);
        this.A01 = sparseArray;
    }
}
