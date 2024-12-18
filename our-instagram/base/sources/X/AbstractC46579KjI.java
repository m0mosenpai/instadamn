package X;

import java.lang.reflect.InvocationTargetException;

/* renamed from: X.KjI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46579KjI {
    public static LTN A00() {
        try {
            return (LTN) LAN.class.getMethod("create", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
