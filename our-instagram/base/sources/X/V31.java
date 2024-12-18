package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V31 extends AbstractC65632xz {
    public final Context A00;
    public final LayoutInflater A01;
    public final V1X A02;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public V31(Context context, V1X v1x) {
        this.A00 = context;
        this.A02 = v1x;
        this.A01 = LayoutInflater.from(context);
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int i3;
        Drawable drawable;
        int A03 = C0f9.A03(-2065049190);
        Context context = this.A00;
        V1X v1x = this.A02;
        VgM vgM = (VgM) AbstractC31172DnG.A0x(view);
        String str = (String) obj;
        C69312VlK c69312VlK = (C69312VlK) obj2;
        Resources resources = context.getResources();
        View view2 = vgM.A00;
        Integer num = c69312VlK.A03;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        Integer num2 = c69312VlK.A00;
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        }
        int i4 = 0;
        view2.setPadding(0, dimensionPixelSize, 0, resources.getDimensionPixelSize(i3));
        if (c69312VlK.A01 != null) {
            vgM.A01.setTextSize(0, resources.getDimensionPixelSize(r0.intValue()));
        }
        Integer num3 = c69312VlK.A02;
        if (num3 != null && (drawable = context.getDrawable(num3.intValue())) != null) {
            TextView textView = vgM.A01;
            textView.measure(0, 0);
            drawable.setBounds(0, 0, textView.getMeasuredHeight(), textView.getMeasuredHeight());
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.igds_color_link, typedValue, true);
            drawable.setColorFilter(typedValue.data, PorterDuff.Mode.SRC_ATOP);
            textView.setCompoundDrawables(null, null, drawable, null);
        }
        TextView textView2 = vgM.A01;
        textView2.setText(str);
        if (c69312VlK.A04) {
            i4 = 17;
        }
        textView2.setGravity(i4);
        WNS.A00(view2, 43, v1x);
        C0f9.A0A(442504701, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(480432179);
        View inflate = this.A01.inflate(R.layout.reporting_guidelines_collapsible_button, (ViewGroup) null);
        inflate.setTag(new VgM(inflate));
        C0f9.A0A(62299421, A03);
        return inflate;
    }
}
