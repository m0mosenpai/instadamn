package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.canvas.view.widget.RichTextView;

/* loaded from: classes11.dex */
public abstract class VS8 {
    public static final void A00(V2Q v2q, C66452UIc c66452UIc, boolean z) {
        int i;
        AbstractC167017dG.A1N(c66452UIc, v2q);
        RichTextView richTextView = c66452UIc.A01;
        richTextView.setText(v2q.A00);
        X8C x8c = v2q.A01;
        if (x8c != null) {
            richTextView.setTextDescriptor(x8c);
            if (z) {
                richTextView.setMinLines(2);
            }
            C69219Vjm C37 = v2q.C37();
            if (C37 != null) {
                View view = c66452UIc.A00;
                AbstractC69925Vxq.A01(view, C37.A01);
                int i2 = C37.A00;
                C14360o3.A0B(view, 0);
                view.setBackgroundColor(i2);
                switch (C37.A02.intValue()) {
                    case 0:
                        i = 3;
                        break;
                    case 1:
                        i = 1;
                        break;
                    default:
                        i = 5;
                        break;
                }
                richTextView.setGravity(i);
                ViewGroup.LayoutParams layoutParams = richTextView.getLayoutParams();
                C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((FrameLayout.LayoutParams) layoutParams).gravity = i;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
