package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.7TE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7TE extends AbstractC66422zJ {
    public final Context A00;

    @Override // X.AbstractC66422zJ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C44634Jpe createViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.thread_message_action_log, viewGroup, false);
        int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        C44634Jpe c44634Jpe = new C44634Jpe(inflate);
        TextView textView = c44634Jpe.A00;
        textView.setTypeface(textView.getTypeface(), 0);
        Context context = textView.getContext();
        Drawable drawable = context.getDrawable(R.drawable.rounded_background_secondary);
        if (drawable != null) {
            int A06 = AbstractC56842jH.A06(context.getColor(AbstractC53242c7.A04(context)), 199);
            Drawable mutate = drawable.mutate();
            C14360o3.A07(mutate);
            mutate.setTint(A06);
            textView.setBackground(drawable);
        }
        Resources resources = textView.getResources();
        C14360o3.A07(resources);
        try {
            i = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        } catch (Resources.NotFoundException unused) {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int i5 = marginLayoutParams.topMargin;
            int i6 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.topMargin = i5;
            marginLayoutParams.setMarginEnd(i);
            marginLayoutParams.bottomMargin = i6;
        }
        try {
            i2 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        } catch (Resources.NotFoundException unused2) {
            i2 = 0;
        }
        try {
            i3 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        } catch (Resources.NotFoundException unused3) {
            i3 = 0;
        }
        textView.setPadding(i3, i2, i3, i2);
        return c44634Jpe;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        K2A k2a = (K2A) interfaceC66482zP;
        C44634Jpe c44634Jpe = (C44634Jpe) c3oo;
        C14360o3.A0B(k2a, 0);
        C14360o3.A0B(c44634Jpe, 1);
        TextView textView = c44634Jpe.A00;
        textView.setTextColor(k2a.A00);
        CharSequence charSequence = k2a.A01;
        int i = 0;
        if (charSequence.length() <= 0) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return K2A.class;
    }

    public C7TE(Context context) {
        this.A00 = context;
    }
}
