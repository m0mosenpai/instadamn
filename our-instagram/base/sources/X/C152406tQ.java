package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6tQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152406tQ {
    public static final Class[] A05;
    public final C08T A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;

    public final void A01(String str, Object obj) {
        C2GT c2gt;
        C14360o3.A0B(str, 0);
        if (obj != null) {
            Class[] clsArr = A05;
            int i = 0;
            do {
                Class cls = clsArr[i];
                C14360o3.A0A(cls);
                if (!cls.isInstance(obj)) {
                    i++;
                }
            } while (i < 29);
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.A02.get(str);
        if ((obj2 instanceof C2GS) && (c2gt = (C2GT) obj2) != null) {
            c2gt.A0B(obj);
        } else {
            this.A03.put(str, obj);
        }
        C05A c05a = (C05A) this.A01.get(str);
        if (c05a != null) {
            c05a.Egh(obj);
        }
    }

    static {
        Class[] clsArr = new Class[29];
        System.arraycopy(new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class}, 0, clsArr, 0, 27);
        System.arraycopy(new Class[]{Size.class, SizeF.class}, 0, clsArr, 27, 2);
        A05 = clsArr;
    }

    public final Object A00(String str) {
        try {
            return this.A03.get(str);
        } catch (ClassCastException unused) {
            this.A03.remove(str);
            C50872Me3 c50872Me3 = (C50872Me3) this.A02.remove(str);
            if (c50872Me3 != null) {
                c50872Me3.A00 = null;
            }
            this.A01.remove(str);
            return null;
        }
    }

    public C152406tQ(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A03 = linkedHashMap;
        this.A04 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
        this.A01 = new LinkedHashMap();
        this.A00 = new C08T() { // from class: X.OmU
            @Override // X.C08T
            public final Bundle ELr() {
                C152406tQ c152406tQ = C152406tQ.this;
                Iterator A15 = AbstractC166997dE.A15(AbstractC06930Yk.A0B(c152406tQ.A04));
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    c152406tQ.A01(AbstractC31172DnG.A17(A1K), ((C08T) A1K.getValue()).ELr());
                }
                Map map2 = c152406tQ.A03;
                java.util.Set keySet = map2.keySet();
                ArrayList A17 = AbstractC25225BEi.A17(keySet.size());
                ArrayList A172 = AbstractC25225BEi.A17(A17.size());
                for (Object obj : keySet) {
                    A17.add(obj);
                    A172.add(map2.get(obj));
                }
                return AbstractC167017dG.A0T("values", A172, AbstractC166987dD.A1L("keys", A17));
            }
        };
        linkedHashMap.putAll(map);
    }

    public C152406tQ() {
        this.A03 = new LinkedHashMap();
        this.A04 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
        this.A01 = new LinkedHashMap();
        this.A00 = new C08T() { // from class: X.OmU
            @Override // X.C08T
            public final Bundle ELr() {
                C152406tQ c152406tQ = C152406tQ.this;
                Iterator A15 = AbstractC166997dE.A15(AbstractC06930Yk.A0B(c152406tQ.A04));
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    c152406tQ.A01(AbstractC31172DnG.A17(A1K), ((C08T) A1K.getValue()).ELr());
                }
                Map map2 = c152406tQ.A03;
                java.util.Set keySet = map2.keySet();
                ArrayList A17 = AbstractC25225BEi.A17(keySet.size());
                ArrayList A172 = AbstractC25225BEi.A17(A17.size());
                for (Object obj : keySet) {
                    A17.add(obj);
                    A172.add(map2.get(obj));
                }
                return AbstractC167017dG.A0T("values", A172, AbstractC166987dD.A1L("keys", A17));
            }
        };
    }
}
