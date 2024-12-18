package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3sI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC85893sI {
    public static final C81283jy A00(View view) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
        C81283jy c81283jy = new C81283jy((ViewGroup) view);
        ViewGroup viewGroup = ((AbstractC81293jz) c81283jy).A00;
        viewGroup.setTouchDelegate(new C85923sL(viewGroup));
        return c81283jy;
    }
}
