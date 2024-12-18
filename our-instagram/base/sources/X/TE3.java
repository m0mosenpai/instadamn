package X;

import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes10.dex */
public final /* synthetic */ class TE3 implements InterfaceC65438TkA {
    public final String A00;

    public TE3(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC65438TkA
    public final Object get() {
        String str = this.A00;
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return AbstractC58320PtC.A0t(cls);
            }
            throw new RuntimeException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            android.util.Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(String.format("Could not instantiate %s", str), e4);
        }
    }
}
