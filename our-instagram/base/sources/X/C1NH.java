package X;

import android.graphics.Bitmap;
import android.os.Looper;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1NH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NH implements C1NJ, InterfaceC220315d, C1NK {
    public int A00;
    public int A01;
    public final Map A02 = Collections.synchronizedMap(new LinkedHashMap<String, C141756as>() { // from class: X.1NL
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.containsKey(obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof C141756as)) {
                return false;
            }
            return super.containsValue(obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return super.get(obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return super.getOrDefault(obj, obj2);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return super.remove(obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ java.util.Set entrySet() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ java.util.Set keySet() {
            return super.keySet();
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, C141756as> entry) {
            if (size() <= 100) {
                return false;
            }
            return true;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return super.size();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return super.values();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String) || !(obj2 instanceof C141756as)) {
                return false;
            }
            return super.remove(obj, obj2);
        }
    });
    public final java.util.Set A03 = new HashSet();

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(interfaceC59502nt, 0);
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            ImageUrl BGt = interfaceC59502nt.BGt();
            Looper.myLooper();
            Looper.getMainLooper();
            BGt.AjX();
            String str = ((ImageCacheKey) BGt.AjX()).A03;
            C14360o3.A07(str);
            C141756as c141756as = (C141756as) this.A02.get(str);
            if (c141756as != null && !AbstractC25061Kk.A00().A0E()) {
                c141756as.A01 = bitmap;
                this.A01 += bitmap.getByteCount();
                this.A00++;
            }
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public static final void A00(C1NH c1nh, List list, int i) {
        HashSet hashSet;
        if (list != null) {
            hashSet = new HashSet(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC222716g interfaceC222716g = (InterfaceC222716g) it.next();
                if (interfaceC222716g != null) {
                    Looper.myLooper();
                    Looper.getMainLooper();
                    interfaceC222716g.AjX();
                    hashSet.add(((ImageCacheKey) interfaceC222716g.AjX()).A03);
                }
            }
        } else {
            hashSet = null;
        }
        Iterator it2 = c1nh.A02.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            C141756as c141756as = (C141756as) entry.getValue();
            if (c141756as.A00 == i && (hashSet == null || !hashSet.contains(key))) {
                Bitmap bitmap = c141756as.A01;
                if (bitmap != null) {
                    c1nh.A01 -= bitmap.getByteCount();
                    c1nh.A00--;
                }
                it2.remove();
            }
        }
    }

    @Override // X.InterfaceC220315d
    public final void F8d(C1KJ c1kj) {
        this.A02.clear();
        this.A01 = 0;
        this.A00 = 0;
    }

    public C1NH() {
        AbstractC25061Kk.A00().A0B(this, 0, 1);
    }
}
