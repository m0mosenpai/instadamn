package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.S5f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62286S5f {
    public static Integer A00(Field field) {
        Class<?> type = field.getType();
        Class<?> componentType = type.getComponentType();
        if (type.isArray() && componentType != null && Parcelable.class.isAssignableFrom(componentType)) {
            return C05F.A0j;
        }
        if (type.isArray() && componentType != null && String.class.isAssignableFrom(componentType)) {
            return C05F.A0u;
        }
        if (type.isArray() && componentType != null && Byte.TYPE.isAssignableFrom(componentType)) {
            return C05F.A15;
        }
        if (type.isArray() && componentType != null && Integer.TYPE.isAssignableFrom(componentType)) {
            return C05F.A1I;
        }
        if (Bundle.class.isAssignableFrom(type)) {
            return C05F.A0Y;
        }
        if (Parcelable.class.isAssignableFrom(type)) {
            return C05F.A00;
        }
        if (IBinder.class.isAssignableFrom(type)) {
            return C05F.A01;
        }
        if (IInterface.class.isAssignableFrom(type)) {
            return C05F.A1F;
        }
        if (type != List.class && type != ArrayList.class) {
            if (type != Map.class && type != HashMap.class) {
                if (type != Integer.TYPE && type != Integer.class) {
                    if (type != Boolean.TYPE && type != Boolean.class) {
                        if (type != Long.TYPE && type != Long.class) {
                            if (type != Float.TYPE && type != Float.class) {
                                if (type != Double.TYPE && type != Double.class) {
                                    if (type != Byte.TYPE && type != Byte.class) {
                                        if (type == String.class) {
                                            return C05F.A07;
                                        }
                                        throw AbstractC166987dD.A18(AbstractC167017dG.A0n(type, "Type is not yet usable with SafeParcelUtil: ", AbstractC166987dD.A1C()));
                                    }
                                    return C05F.A09;
                                }
                                return C05F.A06;
                            }
                            return C05F.A05;
                        }
                        return C05F.A03;
                    }
                    return C05F.A04;
                }
                return C05F.A02;
            }
            return C05F.A08;
        }
        if (AbstractC63249Sg5.A02(field) == String.class && !AbstractC63249Sg5.A03(field)) {
            return C05F.A0C;
        }
        return C05F.A0N;
    }
}
