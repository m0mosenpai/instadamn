package X;

import android.view.View;

/* renamed from: X.0fQ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fQ {
    public static void A00(final View.OnClickListener onClickListener, final View view) {
        View.OnClickListener onClickListener2;
        if (onClickListener == null) {
            onClickListener2 = null;
        } else {
            onClickListener2 = new View.OnClickListener() { // from class: X.0fP
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    View view3 = view;
                    View.OnClickListener onClickListener3 = onClickListener;
                    C2ZK.A00(onClickListener3, view3);
                    onClickListener3.onClick(view2);
                }
            };
        }
        view.setOnClickListener(onClickListener2);
    }
}
