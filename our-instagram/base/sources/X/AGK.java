package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AGK {
    public InterfaceC23471Cj A00;
    public final Activity A01;
    public final Context A02;
    public final ViewGroup A03;
    public final ViewGroup A04;
    public final Map A05;
    public final Drawable A06;

    public AGK(Activity activity, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        this.A01 = activity;
        this.A03 = viewGroup;
        Context context = viewGroup.getContext();
        this.A02 = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.permission_multiitem_preprompt_view, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.A04 = (ViewGroup) inflate;
        this.A05 = AbstractC166987dD.A1I();
        C14360o3.A07(context);
        Drawable A01 = AbstractC85953sP.A01(context, R.drawable.instagram_check_pano_outline_24, AbstractC53242c7.A0B(activity));
        if (A01 != null) {
            int A0C = AbstractC166987dD.A0C(activity, 12);
            A01.setBounds(0, 0, A0C, A0C);
        } else {
            A01 = null;
        }
        this.A06 = A01;
    }

    public static final void A00(TextView textView, AGK agk, String str) {
        LinearLayout.LayoutParams layoutParams;
        int i;
        Activity activity = agk.A01;
        if (AbstractC23451Ch.A07(activity, str)) {
            AbstractC166987dD.A1O(activity, textView, AbstractC53242c7.A09(activity));
            textView.setOnClickListener(null);
            textView.setCompoundDrawablePadding(AbstractC166987dD.A0C(activity, 8));
            textView.setCompoundDrawablesRelative(agk.A06, null, null, null);
            textView.setTextAlignment(4);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            C14360o3.A0C(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            i = 8388627;
        } else {
            AbstractC166987dD.A1O(textView.getContext(), textView, AbstractC53242c7.A0H(activity, R.attr.igds_color_gradient_blue));
            C0fQ.A00(new ViewOnClickListenerC35585Fnc(textView, agk, str, 6), textView);
            textView.setCompoundDrawablesRelative(null, null, null, null);
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            C14360o3.A0C(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            layoutParams = (LinearLayout.LayoutParams) layoutParams3;
            i = 17;
        }
        layoutParams.gravity = i;
        textView.setLayoutParams(layoutParams);
    }
}
