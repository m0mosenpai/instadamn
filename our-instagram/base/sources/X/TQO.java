package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* loaded from: classes10.dex */
public final class TQO implements Runnable {
    public static Field A03;
    public final C211511r A00;
    public final WeakReference A01;
    public final boolean A02;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.A01.get();
        if (obj != null) {
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                for (Field field : cls.getDeclaredFields()) {
                    if (!field.isSynthetic() && !field.getType().isPrimitive() && !Context.class.isAssignableFrom(field.getType())) {
                        boolean z = this.A02;
                        try {
                            if (!Modifier.isStatic(field.getModifiers())) {
                                boolean isFinal = Modifier.isFinal(field.getModifiers());
                                if (z) {
                                    if (isFinal) {
                                        if (A03 == null) {
                                            Field declaredField = Field.class.getDeclaredField("accessFlags");
                                            A03 = declaredField;
                                            declaredField.setAccessible(true);
                                        }
                                        int modifiers = field.getModifiers();
                                        A03.setInt(field, modifiers & (-17));
                                        if (!field.isAccessible()) {
                                            field.setAccessible(true);
                                            field.set(obj, null);
                                            field.setAccessible(false);
                                        } else {
                                            field.set(obj, null);
                                        }
                                        A03.setInt(field, modifiers | 16);
                                    }
                                } else if (isFinal) {
                                }
                                if (!field.isAccessible()) {
                                    field.setAccessible(true);
                                    field.set(obj, null);
                                    field.setAccessible(false);
                                } else {
                                    field.set(obj, null);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    public TQO(C211511r c211511r, Object obj, boolean z) {
        this.A01 = AbstractC25225BEi.A16(obj);
        this.A00 = c211511r;
        this.A02 = z;
    }
}
