package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.468, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass468 extends AnonymousClass469 implements Serializable {
    public List A00;
    public transient LinkedHashMap A01;

    public final Object A0k(C16L c16l, AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, Object obj) {
        boolean A0C;
        Object A0C2;
        Object[] objArr;
        String str;
        String A08;
        String A082;
        String A083;
        C912845h c912845h = this.A02;
        C913945y c913945y = ((C45S) c912845h).A00;
        if (c913945y != null) {
            A0C = !c913945y.A02();
        } else {
            A0C = c912845h.A0C(EnumC912945i.A0M);
        }
        if (A0C) {
            if (c913945y == null) {
                c913945y = ((C45S) c912845h).A04.A00(c912845h, abstractC910944l.A00);
            }
            String str2 = c913945y.A02;
            C16R A10 = c16l.A10();
            C16R c16r = C16R.A0D;
            if (A10 != c16r) {
                AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
                if (str2 == null) {
                    A083 = "[null]";
                } else {
                    A083 = C914045z.A08(str2);
                }
                objArr = new Object[]{A083, A10};
                str = "Current token not START_OBJECT (needed to unwrap root name %s), but %s";
            } else {
                C16R A1J = c16l.A1J();
                c16r = C16R.A0A;
                if (A1J != c16r) {
                    AnonymousClass460[] anonymousClass460Arr2 = C914045z.A01;
                    if (str2 == null) {
                        A082 = "[null]";
                    } else {
                        A082 = C914045z.A08(str2);
                    }
                    objArr = new Object[]{A082, c16l.A10()};
                    str = "Current token not FIELD_NAME (to contain expected root name %s), but %s";
                } else {
                    String A0Y = c16l.A0Y();
                    if (!str2.equals(A0Y)) {
                        if (A0Y == null) {
                            A08 = "[null]";
                        } else {
                            A08 = C914045z.A08(A0Y);
                        }
                        Object[] objArr2 = {A08, C914045z.A08(str2), C914045z.A04(abstractC910944l)};
                        Class cls = abstractC910944l.A00;
                        C102314j6 c102314j6 = new C102314j6(this.A07, String.format("Root name (%s) does not match expected (%s) for type %s", objArr2));
                        if (A0Y == null) {
                            throw c102314j6;
                        }
                        c102314j6.A08(cls, A0Y);
                        throw c102314j6;
                    }
                    c16l.A1J();
                    if (obj == null) {
                        A0C2 = jsonDeserializer.A0D(c16l, this);
                    } else {
                        A0C2 = jsonDeserializer.A0C(c16l, this, obj);
                    }
                    C16R A1J2 = c16l.A1J();
                    c16r = C16R.A09;
                    if (A1J2 != c16r) {
                        objArr = new Object[]{C914045z.A08(str2), c16l.A10()};
                        str = "Current token not END_OBJECT (to match wrapper object with root name %s), but %s";
                    } else {
                        return A0C2;
                    }
                }
            }
            A0U(c16r, str, objArr);
            throw C00O.createAndThrow();
        }
        if (obj == null) {
            return jsonDeserializer.A0D(c16l, this);
        }
        return jsonDeserializer.A0C(c16l, this, obj);
    }
}
