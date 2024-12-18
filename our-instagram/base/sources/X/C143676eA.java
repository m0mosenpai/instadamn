package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.6eA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143676eA {
    public Context A00;
    public TextView A01;
    public final C57012jc A02;

    public final Context A00() {
        Context context = this.A00;
        if (context != null) {
            return context;
        }
        C14360o3.A0F("context");
        throw C00O.createAndThrow();
    }

    public C143676eA(C57012jc c57012jc) {
        this.A02 = c57012jc;
        c57012jc.A02 = new InterfaceC69513Al() { // from class: X.6eB
            @Override // X.InterfaceC69513Al
            public final /* bridge */ /* synthetic */ void DLu(View view) {
                TextView textView = (TextView) view;
                C14360o3.A0B(textView, 0);
                C143676eA c143676eA = C143676eA.this;
                c143676eA.A01 = textView;
                Context context = textView.getContext();
                C14360o3.A0B(context, 0);
                c143676eA.A00 = context;
                Context A00 = c143676eA.A00();
                boolean A02 = AbstractC13620mo.A02(A00);
                int i = R.drawable.chevron_right;
                if (A02) {
                    i = R.drawable.chevron_left;
                }
                Drawable drawable = A00.getDrawable(i);
                RectF rectF = AbstractC13880nE.A01;
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            }
        };
    }
}
