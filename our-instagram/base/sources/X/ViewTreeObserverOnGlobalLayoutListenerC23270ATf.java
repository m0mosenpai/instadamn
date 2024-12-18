package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.ATf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23270ATf implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C6SY A01;

    public ViewTreeObserverOnGlobalLayoutListenerC23270ATf(Context context, C6SY c6sy) {
        this.A01 = c6sy;
        this.A00 = context;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int A0C;
        int i;
        C6SY c6sy = this.A01;
        LinearLayout linearLayout = c6sy.A07;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        C14360o3.A0C(layoutParams, AbstractC111324zv.A00(0));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        TextView textView = c6sy.A09;
        int lineCount = textView.getLineCount();
        Context context = this.A00;
        if (lineCount == 2) {
            C14360o3.A0A(context);
            A0C = AbstractC166987dD.A0C(context, 8);
            C14360o3.A0A(context);
            i = 10;
        } else {
            C14360o3.A0A(context);
            A0C = AbstractC166987dD.A0C(context, 14);
            C14360o3.A0A(context);
            i = 4;
        }
        marginLayoutParams.setMargins(0, A0C, 0, AbstractC166987dD.A0C(context, i));
        linearLayout.setLayoutParams(marginLayoutParams);
        AbstractC166997dE.A1K(textView, this);
    }
}
