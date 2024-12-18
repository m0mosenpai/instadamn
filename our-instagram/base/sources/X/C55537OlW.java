package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

/* renamed from: X.OlW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55537OlW implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C55537OlW(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C52567NNn c52567NNn;
        ScrollView scrollView;
        Runnable runnableC57007PQx;
        if (this.A00 != 0) {
            if (i != 5) {
                if (i == 6) {
                    ((N68) this.A02).A01().A01();
                    return false;
                }
                return false;
            }
            N68 n68 = (N68) this.A02;
            View view = (View) this.A01;
            scrollView = n68.A02;
            if (scrollView == null) {
                return false;
            }
            runnableC57007PQx = new RunnableC57006PQw(view, n68);
        } else {
            if (i != 5) {
                if (i != 6) {
                    return false;
                }
                ((N66) this.A02).A01().A02();
                return false;
            }
            N66 n66 = (N66) this.A02;
            View view2 = (View) this.A01;
            if (!(n66 instanceof C52567NNn) || (scrollView = (c52567NNn = (C52567NNn) n66).A01) == null) {
                return false;
            }
            runnableC57007PQx = new RunnableC57007PQx(view2, c52567NNn);
        }
        scrollView.post(runnableC57007PQx);
        return false;
    }
}
