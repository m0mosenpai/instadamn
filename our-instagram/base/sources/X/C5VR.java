package X;

/* renamed from: X.5VR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5VR extends C5VS implements C5VT {
    public C59O A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.5VU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.57M] */
    public final C59O A06() {
        C57O c57o = this.A01;
        C59O c59o = this.A00;
        C57O c57o2 = c59o.A00;
        C59O c59o2 = c59o;
        if (c57o != c57o2) {
            this.A02 = new Object();
            c59o2 = new C57M(c57o, size());
        }
        this.A00 = c59o2;
        return c59o2;
    }

    @Override // X.C5VS, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof C5UQ)) {
            return false;
        }
        return super.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C5US)) {
            return false;
        }
        return super.containsValue(obj);
    }

    @Override // X.C5VS, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof C5UQ)) {
            return null;
        }
        return super.get(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof C5UQ)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    @Override // X.C5VS, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof C5UQ)) {
            return null;
        }
        return super.remove(obj);
    }
}
