package X;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: X.VXs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68616VXs {
    public static final Field A00;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        A00 = field;
    }
}
