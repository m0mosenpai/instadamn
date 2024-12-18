package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.R;

/* renamed from: X.732, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass732 {
    public static final void A00(final Context context, View.OnTouchListener onTouchListener, View view, TextView textView, final TextView textView2, Integer num, Integer num2, final String str, final InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        textView.setText(str);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        textView2.setText(C84963qk.A04(resources, num, 10000, true, false));
        textView2.setTextColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text)));
        textView.setTextColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text)));
        if (num2 != null) {
            textView2.setTextAppearance(num2.intValue());
        }
        if (z) {
            C0fQ.A00(new View.OnClickListener() { // from class: X.6wt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int A05 = C0f9.A05(1421688453);
                    InterfaceC16820sZ.this.invoke();
                    C0f9.A0C(-493175190, A05);
                }
            }, view);
            AbstractC010103p.A0B(view, new C02V() { // from class: X.6wu
                @Override // X.C02V
                public final void A0Y(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    C14360o3.A0B(view2, 0);
                    C14360o3.A0B(accessibilityNodeInfoCompat, 1);
                    super.A0Y(view2, accessibilityNodeInfoCompat);
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) textView2.getText());
                    sb.append(str);
                    accessibilityNodeInfoCompat.setContentDescription(sb.toString());
                    accessibilityNodeInfoCompat.setClassName(null);
                    accessibilityNodeInfoCompat.setRoleDescription(context.getString(2131954438));
                }
            });
        } else {
            view.setOnClickListener(null);
        }
        if (onTouchListener != null) {
            view.setOnTouchListener(onTouchListener);
        }
    }
}
