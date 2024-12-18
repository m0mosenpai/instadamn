package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.3gt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC79463gt {
    public static final InterfaceC79483gv A00;
    public static final InterfaceC79483gv A01;
    public static final InterfaceC79483gv A02;
    public static final InterfaceC79483gv A03;
    public static final InterfaceC79483gv A04;
    public static final InterfaceC79483gv A05;
    public static final InterfaceC79483gv[] A06;

    public static final float A00(View view, boolean z) {
        float y;
        float f = 0.0f;
        while (view != null && (view.getParent() instanceof View) && (!(view instanceof C2WS) || !(view instanceof InterfaceC51062Wc))) {
            if (z) {
                y = view.getX();
            } else {
                y = view.getY();
            }
            f += y;
            view = (View) view.getParent();
        }
        return f;
    }

    public static final View A01(Drawable drawable) {
        Object obj;
        while (true) {
            if (drawable != null) {
                obj = drawable.getCallback();
            } else {
                obj = null;
            }
            if (!(obj instanceof Drawable)) {
                break;
            }
            drawable = (Drawable) obj;
        }
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3gv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.3gv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.3gv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.3gv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.3gv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.3gv, java.lang.Object] */
    static {
        ?? obj = new Object();
        A04 = obj;
        ?? obj2 = new Object();
        A05 = obj2;
        ?? obj3 = new Object();
        A03 = obj3;
        ?? obj4 = new Object();
        A01 = obj4;
        A00 = new Object();
        A02 = new Object();
        A06 = new InterfaceC79483gv[]{obj, obj2, obj3, obj4};
    }

    public static final View A02(InterfaceC79483gv interfaceC79483gv, Object obj) {
        if (obj instanceof View) {
            return (View) obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animating '");
        sb.append(interfaceC79483gv.getName());
        sb.append("' is only supported on Views (got ");
        sb.append(obj);
        sb.append(')');
        throw new RuntimeException(sb.toString());
    }

    public static final ArrayList A03(C2WS c2ws) {
        int mountItemCount = c2ws.getMountItemCount();
        ArrayList arrayList = null;
        for (int i = 0; i < mountItemCount; i++) {
            C3h4 A0I = c2ws.A0I(i);
            if ((A0I.A04 instanceof Drawable) && (A0I.A01.A06 instanceof C2WB)) {
                C2WC c2wc = A0I.A01.A06;
                C14360o3.A0C(c2wc, "null cannot be cast to non-null type com.facebook.rendercore.transitions.TransitionRenderUnit");
                if ((((C2WB) c2wc).A00 & 4) != 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    Object obj = A0I.A04;
                    C14360o3.A0C(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
