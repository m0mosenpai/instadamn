package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0YZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YZ implements InterfaceC16510rw, C0s4 {
    public static final HashMap A01;
    public static final Map A02;
    public static final Map A03;
    public static final HashMap A04;
    public static final HashMap A05;
    public final Class A00;

    public C0YZ(Class cls) {
        C14360o3.A0B(cls, 1);
        this.A00 = cls;
    }

    static {
        int i = 0;
        List A1Q = AbstractC16960so.A1Q(InterfaceC16820sZ.class, InterfaceC16660sJ.class, InterfaceC16620sF.class, InterfaceC16610sE.class, InterfaceC16600sD.class, InterfaceC16590sC.class, InterfaceC16570sA.class, C0s9.class, C0s8.class, C0s7.class, InterfaceC16810sY.class, InterfaceC16800sX.class, InterfaceC16790sW.class, InterfaceC16780sV.class, InterfaceC16770sU.class, InterfaceC16760sT.class, InterfaceC16750sS.class, InterfaceC16740sR.class, InterfaceC16720sP.class, InterfaceC16670sK.class, InterfaceC16650sI.class, InterfaceC16640sH.class, InterfaceC16630sG.class);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A1Q, 10));
        for (Object obj : A1Q) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            arrayList.add(new C09530e4(obj, Integer.valueOf(i)));
            i = i2;
        }
        A02 = AbstractC06930Yk.A08(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        A04 = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        A05 = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("X.0q4", "kotlin.String.Companion");
        hashMap3.put("X.0nH", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C14360o3.A07(values);
        for (String str : values) {
            C14360o3.A0A(str);
            hashMap3.put(AnonymousClass001.A0g("kotlin.jvm.internal.", AbstractC001900j.A0I(str, str, '.'), "CompanionObject"), AnonymousClass001.A0R(str, ".Companion"));
        }
        for (Map.Entry entry : A02.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), AnonymousClass001.A0O("X.0da", ((Number) entry.getValue()).intValue()));
        }
        A01 = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, AbstractC001900j.A0I(str2, str2, '.'));
        }
        A03 = linkedHashMap;
    }

    @Override // X.C0s4
    public final Class BKI() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0YZ) && C14360o3.A0K(AbstractC53012bi.A01(this), AbstractC53012bi.A01((InterfaceC16510rw) obj))) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return AnonymousClass001.A0R(this.A00.toString(), " (Kotlin reflection is not available)");
    }

    @Override // X.InterfaceC16340rf
    public final List getAnnotations() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC16510rw
    public final int hashCode() {
        return AbstractC53012bi.A01(this).hashCode();
    }
}
