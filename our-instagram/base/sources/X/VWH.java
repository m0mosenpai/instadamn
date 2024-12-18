package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public abstract class VWH {
    public static final void A00(View view, StringBuilder sb, int i) {
        sb.append(AbstractC002300n.A0c("  ", i));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("|- ");
        sb2.append(view);
        sb2.append('\n');
        AbstractC58318PtA.A1V(sb, sb2);
        if (view instanceof ViewGroup) {
            C12500ku c12500ku = new C12500ku((ViewGroup) view);
            while (c12500ku.hasNext()) {
                A00((View) c12500ku.next(), sb, i + 1);
            }
        }
    }
}
