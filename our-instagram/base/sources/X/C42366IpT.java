package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.IpT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42366IpT implements InterfaceC69513Al {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C42366IpT(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC69513Al
    public final void DLu(View view) {
        Integer valueOf;
        if (this.A00 != 0) {
            View requireViewById = view.requireViewById(R.id.indicator_background_view);
            AbstractC41193ILh abstractC41193ILh = (AbstractC41193ILh) this.A01;
            abstractC41193ILh.A00 = AbstractC31173DnH.A0I(view, R.id.indicator_icon_view);
            TextView A0T = AbstractC166997dE.A0T(view, R.id.indicator_text_view);
            abstractC41193ILh.A01 = A0T;
            int lineHeight = A0T.getLineHeight();
            Context context = (Context) this.A02;
            int dimensionPixelSize = (lineHeight - context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
            requireViewById.setBackground(AbstractC80603ip.A00(context, lineHeight));
            AbstractC13880nE.A0g(abstractC41193ILh.A00, lineHeight);
            AbstractC13880nE.A0W(abstractC41193ILh.A00, lineHeight);
            abstractC41193ILh.A00.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            return;
        }
        C14360o3.A0B(view, 0);
        IJ4 ij4 = (IJ4) this.A02;
        ij4.A01 = view;
        ij4.A00 = view.requireViewById(R.id.indicator_background_view);
        View requireViewById2 = view.requireViewById(R.id.indicator_icon_view);
        ImageView imageView = (ImageView) requireViewById2;
        ij4.A02 = imageView;
        C14360o3.A07(requireViewById2);
        TextView A0T2 = AbstractC166997dE.A0T(view, R.id.indicator_text_view);
        ij4.A03 = A0T2;
        if (A0T2 != null) {
            A0T2.setTextSize(0, AbstractC25228BEl.A0M((View) this.A01).getDimension(R.dimen.abc_text_size_menu_header_material));
        }
        TextView textView = ij4.A03;
        if (textView != null && (valueOf = Integer.valueOf(textView.getLineHeight())) != null) {
            View view2 = (View) this.A01;
            int intValue = valueOf.intValue();
            View view3 = ij4.A00;
            if (view3 != null) {
                view3.setBackground(AbstractC80603ip.A00(view2.getContext(), intValue));
            }
            AbstractC13880nE.A0g(imageView, intValue);
            AbstractC13880nE.A0W(imageView, intValue);
        }
        Context context2 = view.getContext();
        AbstractC166997dE.A19(context2, imageView, R.drawable.instagram_camera_filled_16);
        AbstractC166997dE.A19(context2, imageView, R.drawable.instagram_camera_filled_16);
    }
}
