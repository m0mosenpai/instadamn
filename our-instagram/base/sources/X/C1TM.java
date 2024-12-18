package X;

import android.os.Build;
import android.os.Handler;
import com.facebook.common.hiddenapis2.ApiExemption;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.1TM, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1TM {
    public static Handler A00;
    public static Object A01;
    public static Field A02;
    public static Field A03;
    public static final C0h7 A04;

    public static /* synthetic */ Boolean A00() {
        try {
            if (ApiExemption.removeRestriction_DO_NOT_USE() && !((Boolean) C220915k.A00().A01.get()).booleanValue()) {
                Class<?> cls = Class.forName("android.app.QueuedWork");
                Field declaredField = cls.getDeclaredField("sHandler");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(null);
                A00 = handler;
                if (handler == null) {
                    Method declaredMethod = cls.getDeclaredMethod("getHandler", new Class[0]);
                    declaredMethod.setAccessible(true);
                    Handler handler2 = (Handler) declaredMethod.invoke(null, new Object[0]);
                    A00 = handler2;
                    if (handler2 == null) {
                        C220915k.A00().A01("RefQueuedWork.NullField_sHandle").report();
                        return false;
                    }
                }
                Field declaredField2 = cls.getDeclaredField("sLock");
                declaredField2.setAccessible(true);
                A01 = declaredField2.get(null);
                Field declaredField3 = cls.getDeclaredField("sWork");
                A03 = declaredField3;
                declaredField3.setAccessible(true);
                Field declaredField4 = cls.getDeclaredField("sFinishers");
                A02 = declaredField4;
                declaredField4.setAccessible(true);
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            C0f5 A012 = C220915k.A00().A01("RefQueuedWork");
            A012.ABU("sdk_int", Build.VERSION.SDK_INT);
            A012.ERI(e);
            A012.report();
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0gv, X.0h7, java.lang.Object] */
    static {
        InterfaceC08830cm interfaceC08830cm = new InterfaceC08830cm() { // from class: X.1TN
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return C1TM.A00();
            }
        };
        ?? obj = new Object();
        obj.A00 = interfaceC08830cm;
        A04 = obj;
    }
}
