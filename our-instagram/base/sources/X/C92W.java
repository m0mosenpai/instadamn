package X;

import java.lang.reflect.Field;

/* renamed from: X.92W, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C92W {
    public final Field A00;
    public final Field A01;

    public C92W(Object obj) {
        Class<?> cls = obj.getClass();
        Field declaredField = cls.getDeclaredField("paused");
        this.A01 = declaredField;
        declaredField.setAccessible(true);
        Field declaredField2 = cls.getDeclaredField("activity");
        this.A00 = declaredField2;
        declaredField2.setAccessible(true);
    }
}
