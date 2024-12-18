package X;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public abstract class BUV {
    public static BUW A00() {
        try {
            return (BUW) AbstractC25234BEr.A0d(BUX.class);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
