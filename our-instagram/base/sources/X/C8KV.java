package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.8KV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8KV implements C8KW {
    public C185348Ka A00;
    public final List A01;
    public final C8KY A02;
    public final C8KU A03;

    @Override // X.C8KW
    public final List AxD(AHC ahc, C8KR c8kr, String str) {
        ArrayList arrayList = new ArrayList();
        AA9 A00 = c8kr.A00(str);
        if (A00 != null) {
            for (EnumC222589rz enumC222589rz : ahc.A03) {
                ArrayList arrayList2 = new ArrayList();
                int size = A00.A02.size() - 1;
                for (int i = 0; i < size; i++) {
                    arrayList2.add(new C23011ACl(enumC222589rz, str, ((Number) A00.A04.get(i)).floatValue(), i, (int) (((Number) A00.A05.get(i)).longValue() / 1000), ahc.A00));
                }
                if (arrayList2.size() > 1) {
                    C01T.A1D(arrayList2, new B0J());
                }
                if (enumC222589rz == EnumC222589rz.A03) {
                    ArrayList arrayList3 = new ArrayList();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (!linkedHashSet.contains(Integer.valueOf(((C23011ACl) arrayList2.get(i2)).A02))) {
                            arrayList3.add(arrayList2.get(i2));
                            linkedHashSet.add(Integer.valueOf(((C23011ACl) arrayList2.get(i2)).A02 - 1));
                            linkedHashSet.add(Integer.valueOf(((C23011ACl) arrayList2.get(i2)).A02 + 1));
                        }
                    }
                    arrayList2 = arrayList3;
                }
                ArrayList A0U = AbstractC001800i.A0U(AbstractC001800i.A0d(arrayList2, Math.min(1, arrayList2.size())));
                if (A0U.size() > 1) {
                    C01T.A1D(A0U, new B0I());
                }
                arrayList.addAll(A0U);
            }
        }
        return arrayList;
    }

    @Override // X.C8KW
    public final void CzY(long j, int i, Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        if (i == 0) {
            List list = this.A01;
            synchronized (list) {
                list.clear();
            }
        }
        C8KY c8ky = this.A02;
        c8ky.A01 = new AZR(this, i, j);
        c8ky.A00(bitmap);
    }

    @Override // X.C8KW
    public final void D9x() {
        C8KY c8ky = this.A02;
        c8ky.A01 = null;
        c8ky.A00 = null;
        c8ky.A02 = null;
    }

    @Override // X.C8KW
    public final void Dz3(C8KR c8kr, String str, boolean z, boolean z2) {
        List list = this.A01;
        synchronized (list) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        float f = ((C224189v2) next).A00;
                        do {
                            Object next2 = it.next();
                            float f2 = ((C224189v2) next2).A00;
                            if (Float.compare(f, f2) < 0) {
                                next = next2;
                                f = f2;
                            }
                        } while (it.hasNext());
                    }
                    int i = (int) (((C224189v2) next).A02 / 1000);
                    AA9 aa9 = new AA9();
                    aa9.A01 = str;
                    aa9.A00 = i;
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(((C224189v2) it2.next()).A01));
                    }
                    aa9.A02 = arrayList;
                    ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(Long.valueOf(((C224189v2) it3.next()).A02));
                    }
                    aa9.A05 = arrayList2;
                    ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(Float.valueOf(((C224189v2) it4.next()).A00));
                    }
                    aa9.A04 = arrayList3;
                    c8kr.A01(aa9);
                    list.clear();
                } else {
                    throw new NoSuchElementException();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.8Ka, java.lang.Object] */
    public C8KV(C8KU c8ku) {
        this.A03 = c8ku;
        this.A02 = new C8KY(c8ku, AbstractC16960so.A1Q(C8KX.A03, C8KX.A02, C8KX.A04));
        ?? obj = new Object();
        obj.A00 = new ArrayList();
        int i = 0;
        do {
            obj.A00.add(Float.valueOf(0.0f));
            i++;
        } while (i < 128);
        this.A00 = obj;
        this.A01 = new ArrayList();
    }
}
