package X;

import android.content.res.Resources;
import android.util.LongSparseArray;
import java.io.File;
import java.lang.reflect.Field;

/* renamed from: X.2Td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50352Td extends AbstractC50362Te {
    public static volatile File A00;

    public static void A00(Resources resources, File file) {
        Class cls;
        A00 = file;
        try {
            try {
                cls = Class.forName("android.content.res.ResourcesImpl");
            } catch (ClassNotFoundException unused) {
                cls = Resources.class;
            }
            Field declaredField = cls.getDeclaredField("sPreloadedDrawables");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            if (obj instanceof LongSparseArray) {
                if (!(obj instanceof AbstractC50362Te)) {
                    declaredField.set(null, new AbstractC50362Te(resources, (LongSparseArray) obj));
                }
            } else if (obj instanceof LongSparseArray[]) {
                LongSparseArray[] longSparseArrayArr = (LongSparseArray[]) obj;
                for (int i = 0; i < longSparseArrayArr.length; i++) {
                    LongSparseArray longSparseArray = longSparseArrayArr[i];
                    if (!(longSparseArray instanceof AbstractC50362Te)) {
                        longSparseArrayArr[i] = new AbstractC50362Te(resources, longSparseArray);
                    }
                }
            }
        } catch (Exception e) {
            C0K8.A0J("NetworkDrawableCache", "Could not enable custom drawable support", e);
        }
    }
}
