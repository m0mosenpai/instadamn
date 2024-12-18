package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public final class WMb implements View.OnClickListener {
    public Context A00;
    public Method A01;
    public final View A02;
    public final String A03;

    public WMb(View view, String str) {
        this.A02 = view;
        this.A03 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IllegalStateException illegalStateException;
        int i;
        String A0g;
        int A05 = C0f9.A05(-1856024572);
        Method method = this.A01;
        if (method == null) {
            View view2 = this.A02;
            Context context = view2.getContext();
            for (Context context2 = context; context2 != null; context2 = ((ContextWrapper) context2).getBaseContext()) {
                try {
                    if (!context2.isRestricted() && (method = context2.getClass().getMethod(this.A03, View.class)) != null) {
                        this.A01 = method;
                        this.A00 = context2;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                }
            }
            int id = view2.getId();
            if (id == -1) {
                A0g = "";
            } else {
                A0g = AnonymousClass001.A0g(" with id '", context.getResources().getResourceEntryName(id), "'");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find method ");
            sb.append(this.A03);
            sb.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            sb.append(view2.getClass());
            throw AbstractC58320PtC.A0o(A0g, sb);
        }
        try {
            method.invoke(this.A00, view);
            C0f9.A0C(-677595971, A05);
        } catch (IllegalAccessException e) {
            illegalStateException = new IllegalStateException("Could not execute non-public method for android:onClick", e);
            i = 318258167;
            C0f9.A0C(i, A05);
            throw illegalStateException;
        } catch (InvocationTargetException e2) {
            illegalStateException = new IllegalStateException("Could not execute method for android:onClick", e2);
            i = -1849108503;
            C0f9.A0C(i, A05);
            throw illegalStateException;
        }
    }
}
