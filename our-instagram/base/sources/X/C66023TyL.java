package X;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.Map;

/* renamed from: X.TyL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66023TyL extends AbstractC66024TyM {
    public static final String[] A05 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property A04 = new C66041Tyd(1);
    public static final Property A01 = new C66041Tyd(2);
    public static final Property A00 = new C66041Tyd(3);
    public static final Property A03 = new C66041Tyd(4);
    public static final Property A02 = new C66041Tyd(5);

    public static void A00(C66025TyN c66025TyN) {
        View view = c66025TyN.A00;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            Map map = c66025TyN.A02;
            map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put("android:changeBounds:parent", view.getParent());
        }
    }
}
