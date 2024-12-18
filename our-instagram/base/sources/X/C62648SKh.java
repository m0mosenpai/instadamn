package X;

import java.lang.reflect.Field;

/* renamed from: X.SKh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62648SKh {
    public final Field A00;

    public final void A00(Object instance, Object value) {
        try {
            this.A00.set(instance, value);
        } catch (IllegalAccessException e) {
            throw AbstractC58318PtA.A0W(e);
        }
    }

    public C62648SKh(Field field) {
        this.A00 = field;
        field.setAccessible(true);
    }
}
