package X;

import android.util.SparseArray;
import com.instagram.react.modules.base.IgNetworkingModule;

/* renamed from: X.0Am, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C02630Am {
    public Object A00;
    public final SparseArray A01 = new SparseArray(8);
    public final C19210x3 A02;

    public static Object A00(C02630Am c02630Am, int i) {
        int i2;
        String str;
        Object obj = c02630Am.A00;
        if (obj != null) {
            switch (i) {
                case 1:
                    i2 = 0;
                    str = IgNetworkingModule.REQUEST_BODY_KEY_STRING;
                    break;
                case 2:
                case 3:
                    i2 = 1;
                    str = "int";
                    break;
                case 4:
                    i2 = 7;
                    str = "string_array";
                    break;
                case 5:
                default:
                    i2 = 6;
                    str = "int_array";
                    break;
                case 6:
                    i2 = 4;
                    str = "double";
                    break;
                case 7:
                    i2 = 5;
                    str = "double_array";
                    break;
                case 8:
                    i2 = 2;
                    str = "bool";
                    break;
                case 9:
                    i2 = 3;
                    str = "bool_array";
                    break;
            }
            SparseArray sparseArray = c02630Am.A01;
            Object obj2 = sparseArray.get(i2);
            if (obj2 == null) {
                C19260xA A00 = c02630Am.A02.A00(obj, str);
                sparseArray.put(i2, A00);
                return A00;
            }
            return obj2;
        }
        throw new NullPointerException("Attempting to use visitor without destination");
    }

    public C02630Am(C19210x3 c19210x3) {
        this.A02 = c19210x3;
    }
}
