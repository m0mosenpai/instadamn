package X;

import com.facebook.pando.TreeJNI;
import com.facebook.tigon.tigonhuc.HucClient;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.17T, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C17T extends TreeJNI {
    public final Map A00 = new HashMap();

    public final float A02(int i) {
        Number number = (Number) A00(this, new C207069El(this, i, 3), i);
        if (number != null) {
            return number.floatValue();
        }
        return 0.0f;
    }

    public final long A03(int i) {
        Number number = (Number) A00(this, new C207069El(this, i, 5), i);
        if (number != null) {
            return number.longValue();
        }
        return 0L;
    }

    public final TreeJNI A04(int i, Class cls) {
        Object A00 = A00(this, new C9FE(i, 4, this, cls), i);
        C14360o3.A0A(A00);
        return (TreeJNI) A00;
    }

    public final TreeJNI A05(int i, Class cls) {
        return (TreeJNI) A00(this, new C9FE(i, 6, this, cls), i);
    }

    public final ImmutableList A08(int i, Class cls) {
        return (ImmutableList) A00(this, new C9FE(i, 5, this, cls), i);
    }

    public final ImageUrl A09(int i) {
        Object A00 = A00(this, new C207069El(this, i, 4), i);
        C14360o3.A0A(A00);
        return (ImageUrl) A00;
    }

    public final String A0h(int i) {
        String str = (String) A00(this, new C207069El(this, i, 6), i);
        if (str == null) {
            return "";
        }
        return str;
    }

    public final List A0l(int i) {
        AbstractCollection abstractCollection = (AbstractCollection) A00(this, new C207069El(this, i, 7), i);
        if (abstractCollection != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(abstractCollection, 10));
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf((float) ((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }
        return null;
    }

    public final List A0o(int i, Class cls) {
        List list = (List) A00(this, new C9FE(i, 3, this, cls), i);
        if (list == null) {
            return C16930sl.A00;
        }
        return list;
    }

    public static final Object A00(C17T c17t, InterfaceC16820sZ interfaceC16820sZ, int i) {
        Object obj;
        Map map = c17t.A00;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            obj = map.get(valueOf);
        } else {
            obj = map.get(valueOf);
            if (obj == null) {
                obj = interfaceC16820sZ.invoke();
                map.put(valueOf, obj);
            }
            return obj;
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final ImageUrl A0A(int i) {
        return (ImageUrl) A00(this, new C207069El(this, i, 9), i);
    }

    public final Boolean A0B(int i) {
        return (Boolean) A00(this, new C57249PbX(i, 35, this), i);
    }

    public final Float A0H() {
        return A0K(121);
    }

    public final Float A0I() {
        return A0K(122);
    }

    public final Float A0J() {
        return A0K(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
    }

    public final Float A0K(int i) {
        return (Float) A00(this, new C207069El(this, i, 8), i);
    }

    public final Long A0L(int i) {
        return (Long) A00(this, new C207069El(this, i, 11), i);
    }

    public final String A0e() {
        return A0j(3355);
    }

    public final String A0g() {
        return A0k(3355);
    }

    public final String A0i(int i) {
        return (String) A00(this, new C207069El(this, i, 12), i);
    }

    public final String A0j(int i) {
        return (String) A00(this, new C207069El(this, i, 14), i);
    }

    public final String A0k(int i) {
        String str = (String) A00(this, new C207069El(this, i, 15), i);
        if (str == null) {
            return "";
        }
        return str;
    }

    public final List A0m(int i) {
        return (List) A00(this, new C207069El(this, i, 10), i);
    }

    public final List A0n(int i) {
        return (List) A00(this, new C207069El(this, i, 13), i);
    }

    public final TreeJNI A06(Class cls) {
        return A05(278043675, cls);
    }

    public final TreeJNI A07(Class cls) {
        return A05(3599307, cls);
    }

    public final Float A0C() {
        return A0K(-1221029593);
    }

    public final Float A0D() {
        return A0K(1106770299);
    }

    public final Float A0E() {
        return A0K(-557632268);
    }

    public final Float A0F() {
        return A0K(-40300674);
    }

    public final Float A0G() {
        return A0K(113126854);
    }

    public final Object A0M(int i, InterfaceC16660sJ interfaceC16660sJ) {
        Object invoke = interfaceC16660sJ.invoke(A0j(i));
        C14360o3.A0A(invoke);
        return invoke;
    }

    public final Object A0N(int i, InterfaceC16660sJ interfaceC16660sJ) {
        String A0j = A0j(i);
        if (A0j != null) {
            return interfaceC16660sJ.invoke(A0j);
        }
        return null;
    }

    public final Object A0O(InterfaceC16660sJ interfaceC16660sJ) {
        return A0N(-1853231955, interfaceC16660sJ);
    }

    public final String A0P() {
        return A0h(3556653);
    }

    public final String A0Q() {
        return A0h(3373707);
    }

    public final String A0R() {
        return A0h(116079);
    }

    public final String A0S() {
        return A0h(110371416);
    }

    public final String A0T() {
        return A0i(-1724546052);
    }

    public final String A0U() {
        return A0i(-2060497896);
    }

    public final String A0V() {
        return A0i(116079);
    }

    public final String A0W() {
        return A0i(3373707);
    }

    public final String A0X() {
        return A0i(3556653);
    }

    public final String A0Y() {
        return A0i(110371416);
    }

    public final String A0Z() {
        return A0i(1615288471);
    }

    public final String A0a() {
        return A0i(1939875509);
    }

    public final String A0b() {
        return A0i(1940351839);
    }

    public final String A0c() {
        return A0i(-966120017);
    }

    public final String A0d() {
        return A0i(-309882753);
    }

    public final String A0f() {
        return A0j(-900774058);
    }

    public final List A0p(int i, InterfaceC16660sJ interfaceC16660sJ) {
        List A0n = A0n(i);
        if (A0n != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0n, 10));
            Iterator it = A0n.iterator();
            while (it.hasNext()) {
                arrayList.add(interfaceC16660sJ.invoke(it.next()));
            }
            return arrayList;
        }
        return null;
    }
}
