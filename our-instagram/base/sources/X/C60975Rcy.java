package X;

import com.instagram.preferences.common.BoolNux;
import com.instagram.preferences.common.IntNux;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Rcy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60975Rcy extends C1AU {
    @Override // X.C1AU
    public final InterfaceC19630xq A04(C1AV c1av, Class cls) {
        C14360o3.A0B(c1av, 0);
        C17320tT A01 = A01(c1av, "NuxDisabledUserSharedPreferences");
        if (cls == null) {
            return A01;
        }
        List A00 = A00(cls);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        LinkedHashMap A1I2 = AbstractC166987dD.A1I();
        LinkedHashMap A1I3 = AbstractC166987dD.A1I();
        AbstractC62814SSk.A01(A00, C15500q5.A04(A1I2));
        AbstractC62814SSk.A00(A00, C15500q5.A04(A1I));
        Map A04 = C15500q5.A04(A1I2);
        Map A042 = C15500q5.A04(A1I);
        Map A043 = C15500q5.A04(A1I3);
        ArrayList<Field> A1E = AbstractC166987dD.A1E();
        for (Object obj : A00) {
            if (((AccessibleObject) obj).isAnnotationPresent(com.instagram.preferences.common.Nux.class)) {
                A1E.add(obj);
            }
        }
        for (Field field : A1E) {
            Annotation annotation = field.getAnnotation(com.instagram.preferences.common.Nux.class);
            if (annotation != null) {
                com.instagram.preferences.common.Nux nux = (com.instagram.preferences.common.Nux) annotation;
                Object obj2 = field.get(null);
                if (obj2 instanceof String) {
                    AbstractC43592JPx.A1W(obj2, A042, nux.getBooleanAlwaysReturn());
                    int intAlwaysReturn = nux.getIntAlwaysReturn();
                    AbstractC37301Gc2.A1T(obj2, A04, intAlwaysReturn);
                    AbstractC43592JPx.A1V(obj2, intAlwaysReturn, A043);
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return new C70970Wld(A01, A1I, A1I2, A1I3);
    }

    @Override // X.C1AU
    public final InterfaceC19630xq A03(C1AV c1av) {
        if (c1av == C1AV.A3X) {
            return A04(c1av, C23031Ai.class);
        }
        return A01(c1av, "NuxDisabledUserSharedPreferences");
    }

    private final List A00(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList<Field> A10 = AbstractC31174DnI.A10(declaredFields);
        for (Field field : declaredFields) {
            C14360o3.A0A(field);
            if (C14360o3.A0K(field.getType(), String.class) && (field.isAnnotationPresent(com.instagram.preferences.common.Nux.class) || field.isAnnotationPresent(IntNux.class) || field.isAnnotationPresent(BoolNux.class))) {
                A10.add(field);
            }
        }
        for (Field field2 : A10) {
            field2.setAccessible(true);
            int i = 1;
            int i2 = (AbstractC167007dF.A1W(field2.getAnnotation(IntNux.class)) ? 1 : 0) + (AbstractC167007dF.A1W(field2.getAnnotation(BoolNux.class)) ? 1 : 0);
            if (field2.getAnnotation(com.instagram.preferences.common.Nux.class) == null) {
                i = 0;
            }
            if (i2 + i > 1) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("More than one Nux annotation present on ");
                throw AbstractC58320PtC.A0n(field2.get(null), A1C);
            }
        }
        return A10;
    }

    @Override // X.C1AU
    public final InterfaceC100484fC A02(C1AV c1av, Class cls) {
        InterfaceC100484fC A02 = super.A02(c1av, cls);
        if (cls == null) {
            return A02;
        }
        List A00 = A00(cls);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            if (!(!((AccessibleObject) it.next()).isAnnotationPresent(com.instagram.preferences.common.Nux.class))) {
                throw AbstractC166987dD.A14("AsyncKeyValueStores cannot use the @Nux annotation (use @BoolNux or @IntNux)");
            }
        }
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        AbstractC62814SSk.A01(A00, A1I);
        AbstractC62814SSk.A00(A00, A1I);
        return new C56494P6k(A02, A1I);
    }
}
