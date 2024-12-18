package X;

import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.TZj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64909TZj extends HashMap<String, RBV> {
    public final Locale A00;

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return super.get(((String) obj).toLowerCase(this.A00));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put(((String) obj).toLowerCase(this.A00), obj2);
    }

    public C64909TZj(Locale locale) {
        this.A00 = locale;
    }

    @Deprecated
    public C64909TZj() {
        this(Locale.getDefault());
    }
}
