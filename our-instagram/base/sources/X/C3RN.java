package X;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: X.3RN, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3RN implements C3R9 {
    @Override // X.C3RB
    public final Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        Object A02 = A02();
        int A00 = A00(A02);
        C3T8 ADQ = decoder.ADQ(getDescriptor());
        while (true) {
            int ANz = ADQ.ANz(getDescriptor());
            if (ANz != -1) {
                A06(A02, ADQ, ANz + A00, true);
            } else {
                ADQ.ASc(getDescriptor());
                return A04(A02);
            }
        }
    }

    public int A00(Object obj) {
        if (!(this instanceof C73863Sv)) {
            if (!(this instanceof C3SG)) {
                if (!(this instanceof C3RL)) {
                    if (!(this instanceof C3TZ)) {
                        AbstractC224269vA abstractC224269vA = (AbstractC224269vA) obj;
                        C14360o3.A0B(abstractC224269vA, 0);
                        return abstractC224269vA.A00();
                    }
                }
            }
            AbstractCollection abstractCollection = (AbstractCollection) obj;
            C14360o3.A0B(abstractCollection, 0);
            return abstractCollection.size();
        }
        AbstractMap abstractMap = (AbstractMap) obj;
        C14360o3.A0B(abstractMap, 0);
        return abstractMap.size() * 2;
    }

    public int A01(Object obj) {
        if (!(this instanceof C73863Sv)) {
            if (this instanceof C3SH) {
                Collection collection = (Collection) obj;
                C14360o3.A0B(collection, 0);
                return collection.size();
            }
            if (!(this instanceof C3RL)) {
                if (this instanceof C3TZ) {
                    Object[] objArr = (Object[]) obj;
                    C14360o3.A0B(objArr, 0);
                    return objArr.length;
                }
                float[] fArr = (float[]) obj;
                C14360o3.A0B(fArr, 0);
                return fArr.length;
            }
        }
        Map map = (Map) obj;
        C14360o3.A0B(map, 0);
        return map.size();
    }

    public Object A02() {
        if (this instanceof C73863Sv) {
            return new HashMap();
        }
        if (!(this instanceof C3SG)) {
            if (this instanceof C3RL) {
                return new LinkedHashMap();
            }
            if (!(this instanceof C3TZ)) {
                C3TV c3tv = (C3TV) this;
                return c3tv.A03(c3tv.A08());
            }
        }
        return new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r0 != false) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.BAr, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A03(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C3RL
            if (r0 == 0) goto L14
            java.util.Map r5 = (java.util.Map) r5
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            boolean r0 = r5 instanceof java.util.LinkedHashMap
            if (r0 != 0) goto L72
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r5)
        L13:
            return r3
        L14:
            boolean r0 = r4 instanceof X.C73863Sv
            if (r0 == 0) goto L28
            java.util.Map r5 = (java.util.Map) r5
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            boolean r0 = r5 instanceof java.util.HashMap
            if (r0 != 0) goto L72
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r5)
            return r3
        L28:
            boolean r0 = r4 instanceof X.C3TZ
            if (r0 == 0) goto L3f
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            java.util.List r5 = java.util.Arrays.asList(r5)
            X.C14360o3.A07(r5)
        L39:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r5)
            return r3
        L3f:
            boolean r0 = r4 instanceof X.C3TU
            if (r0 == 0) goto L68
            float[] r5 = (float[]) r5
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.BAr r3 = new X.BAr
            r3.<init>()
            r3.A01 = r5
            int r0 = r5.length
            r3.A00 = r0
            r2 = 10
            if (r0 >= r2) goto L13
            int r1 = r0 * 2
            r0 = 10
            if (r2 >= r1) goto L5e
            r0 = r1
        L5e:
            float[] r0 = java.util.Arrays.copyOf(r5, r0)
            X.C14360o3.A07(r0)
            r3.A01 = r0
            return r3
        L68:
            java.util.Collection r5 = (java.util.Collection) r5
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            boolean r0 = r5 instanceof java.util.ArrayList
            if (r0 == 0) goto L39
        L72:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3RN.A03(java.lang.Object):java.lang.Object");
    }

    public Object A04(Object obj) {
        if (!(this instanceof C73863Sv) && !(this instanceof C3SG) && !(this instanceof C3RL)) {
            if (this instanceof C3TZ) {
                AbstractCollection abstractCollection = (AbstractCollection) obj;
                C14360o3.A0B(abstractCollection, 0);
                InterfaceC16510rw interfaceC16510rw = ((C3TZ) this).A00;
                C14360o3.A0B(interfaceC16510rw, 1);
                Object newInstance = Array.newInstance((Class<?>) AbstractC53012bi.A00(interfaceC16510rw), abstractCollection.size());
                C14360o3.A0C(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
                Object[] array = abstractCollection.toArray((Object[]) newInstance);
                C14360o3.A07(array);
                return array;
            }
            AbstractC224269vA abstractC224269vA = (AbstractC224269vA) obj;
            C14360o3.A0B(abstractC224269vA, 0);
            return abstractC224269vA.A01();
        }
        C14360o3.A0B(obj, 0);
        return obj;
    }

    public final Iterator A05(Object obj) {
        if (!(this instanceof C73863Sv)) {
            if (this instanceof C3SH) {
                Collection collection = (Collection) obj;
                C14360o3.A0B(collection, 0);
                return collection.iterator();
            }
            if (!(this instanceof C3RL)) {
                if (this instanceof C3TZ) {
                    Object[] objArr = (Object[]) obj;
                    C14360o3.A0B(objArr, 0);
                    return new C0s6(objArr);
                }
                throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
            }
        }
        Map map = (Map) obj;
        C14360o3.A0B(map, 0);
        return map.entrySet().iterator();
    }

    public void A06(Object obj, C3T8 c3t8, int i, boolean z) {
        int i2;
        Object AOF;
        if (this instanceof C3RM) {
            C3RM c3rm = (C3RM) this;
            Map map = (Map) obj;
            C14360o3.A0B(c3t8, 0);
            C14360o3.A0B(map, 2);
            SerialDescriptor descriptor = c3rm.getDescriptor();
            Object AOF2 = c3t8.AOF(null, c3rm.A00, descriptor, i);
            if (z) {
                i2 = c3t8.ANz(descriptor);
                if (i2 != i + 1) {
                    throw new IllegalArgumentException(AnonymousClass001.A02(i, i2, "Value must follow key in a map, index for key: ", ", returned index for value: "));
                }
            } else {
                i2 = i + 1;
            }
            if (map.containsKey(AOF2)) {
                C3R9 c3r9 = c3rm.A01;
                if (!(c3r9.getDescriptor().BKw() instanceof C3RF)) {
                    AOF = c3t8.AOF(AbstractC09990gB.A0I(AOF2, map), c3r9, descriptor, i2);
                    map.put(AOF2, AOF);
                    return;
                }
            }
            AOF = c3t8.AOF(null, c3rm.A01, descriptor, i2);
            map.put(AOF2, AOF);
            return;
        }
        C3SI c3si = (C3SI) this;
        if (c3si instanceof C3TU) {
            C25147BAr c25147BAr = (C25147BAr) obj;
            C14360o3.A0B(c3t8, 0);
            C14360o3.A0B(c25147BAr, 2);
            float AO2 = c3t8.AO2(((C3TV) c3si).A00, i);
            int A00 = c25147BAr.A00() + 1;
            float[] fArr = c25147BAr.A01;
            int length = fArr.length;
            if (length < A00) {
                int i3 = length * 2;
                if (A00 < i3) {
                    A00 = i3;
                }
                fArr = Arrays.copyOf(fArr, A00);
                C14360o3.A07(fArr);
                c25147BAr.A01 = fArr;
            }
            int i4 = c25147BAr.A00;
            c25147BAr.A00 = i4 + 1;
            fArr[i4] = AO2;
            return;
        }
        C14360o3.A0B(c3t8, 0);
        c3si.A07(obj, i, c3t8.AOF(null, c3si.A00, c3si.getDescriptor(), i));
    }
}
