package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class F80 {
    public static final void A00(Context context, ViewGroup viewGroup, List list) {
        LayoutInflater from;
        int i;
        View view;
        int A06 = AbstractC167007dF.A06(1, viewGroup, list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FJB fjb = (FJB) it.next();
            int intValue = fjb.A00.intValue();
            if (intValue != 1) {
                if (intValue != A06) {
                    if (intValue != 3) {
                        if (intValue == 0) {
                            from = LayoutInflater.from(context);
                            i = R.layout.gdpr_subheading_text_view;
                        }
                    } else {
                        View inflate = LayoutInflater.from(context).inflate(R.layout.gdpr_bullet_point_paragraph, viewGroup, false);
                        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                        AbstractC166997dE.A0T(inflate, R.id.text_view).setText(fjb.A01);
                        view = inflate;
                        viewGroup.addView(view);
                    }
                } else {
                    from = LayoutInflater.from(context);
                    i = R.layout.gdpr_emphasize_text_view;
                }
            } else {
                from = LayoutInflater.from(context);
                i = R.layout.gdpr_text_view;
            }
            View inflate2 = from.inflate(i, viewGroup, false);
            C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) inflate2;
            textView.setText(fjb.A01);
            view = textView;
            viewGroup.addView(view);
        }
    }
}
