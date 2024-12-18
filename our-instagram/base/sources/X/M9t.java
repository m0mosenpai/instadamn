package X;

import com.instagram.model.shopping.ProductGroup;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class M9t extends LinkedHashMap {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M9t(int i) {
        super(100);
        this.A00 = i;
        if (i != 0) {
            return;
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        switch (this.A00) {
            case 1:
            case 2:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.containsKey(obj);
            default:
                return super.containsKey(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        boolean z;
        switch (this.A00) {
            case 1:
                z = obj instanceof String;
                break;
            case 2:
                z = obj instanceof ProductGroup;
                break;
            default:
                return super.containsValue(obj);
        }
        if (!z) {
            return false;
        }
        return super.containsValue(obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        switch (this.A00) {
            case 1:
            case 2:
                return super.entrySet();
            default:
                return super.entrySet();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        switch (this.A00) {
            case 1:
            case 2:
                if (!(obj instanceof String)) {
                    return null;
                }
                return super.get(obj);
            default:
                return super.get(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        switch (this.A00) {
            case 1:
            case 2:
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return super.getOrDefault(obj, obj2);
            default:
                return super.getOrDefault(obj, obj2);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        switch (this.A00) {
            case 1:
            case 2:
                return super.keySet();
            default:
                return super.keySet();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        switch (this.A00) {
            case 1:
            case 2:
                if (!(obj instanceof String)) {
                    return null;
                }
                return super.remove(obj);
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        int i;
        int i2 = this.A00;
        int size = size();
        switch (i2) {
            case 0:
                i = 100;
                break;
            case 1:
                i = 10;
                break;
            default:
                i = 25;
                break;
        }
        return AbstractC25230BEn.A1S(size, i);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        switch (this.A00) {
            case 1:
            case 2:
                return super.size();
            default:
                return super.size();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        switch (this.A00) {
            case 1:
            case 2:
                return super.values();
            default:
                return super.values();
        }
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        switch (this.A00) {
            case 1:
                z = false;
                if (!(obj instanceof String)) {
                    return false;
                }
                z2 = obj2 instanceof String;
                break;
            case 2:
                z = false;
                if (!(obj instanceof String)) {
                    return false;
                }
                z2 = obj2 instanceof ProductGroup;
                break;
            default:
                return super.remove(obj, obj2);
        }
        if (!z2) {
            return z;
        }
        return super.remove(obj, obj2);
    }
}
