package com.google.vr.dynamite.client;

import X.AbstractC166987dD;
import X.C0f9;
import android.os.IBinder;
import java.lang.reflect.Field;

/* loaded from: classes10.dex */
public final class ObjectWrapper extends c {
    public final Object wrappedObject;

    public static Object unwrap(IObjectWrapper iObjectWrapper, Class cls) {
        if (iObjectWrapper == null) {
            return null;
        }
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).wrappedObject;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        Field field = null;
        while (true) {
            if (i >= length) {
                break;
            }
            Field field2 = declaredFields[i];
            if (!field2.isSynthetic()) {
                Field field3 = field;
                field = field2;
                if (field3 != null) {
                    field = null;
                    break;
                }
            }
            i++;
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    Object obj = field.get(asBinder);
                    if (obj == null) {
                        return null;
                    }
                    if (cls.isInstance(obj)) {
                        return cls.cast(obj);
                    }
                    throw AbstractC166987dD.A12("remoteBinder is the wrong class.");
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
                } catch (NullPointerException e3) {
                    throw new IllegalArgumentException("Binder object is null.", e3);
                }
            }
            throw AbstractC166987dD.A12("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        throw AbstractC166987dD.A12("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }

    public ObjectWrapper(Object obj) {
        int A03 = C0f9.A03(652179987);
        this.wrappedObject = obj;
        C0f9.A0A(496130142, A03);
    }
}
