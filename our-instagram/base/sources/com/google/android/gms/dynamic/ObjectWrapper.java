package com.google.android.gms.dynamic;

import X.AbstractC58317Pt9;
import X.AnonymousClass001;
import X.C0f9;
import X.C3U5;
import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class ObjectWrapper extends IObjectWrapper.Stub {
    public final Object A00;

    public static Object A00(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).A00;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C3U5.A02(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException(AbstractC58317Pt9.A00(544), e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException(AbstractC58317Pt9.A00(463), e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("Unexpected number of IObjectWrapper declared fields: ", length));
    }

    public ObjectWrapper(Object obj) {
        int A03 = C0f9.A03(-212057726);
        this.A00 = obj;
        C0f9.A0A(-1921809681, A03);
    }
}
