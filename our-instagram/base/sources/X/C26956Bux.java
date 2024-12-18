package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Bux, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26956Bux extends AbstractC65632xz {
    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C14360o3.A0B(anonymousClass306, 0);
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-972129125);
        C14360o3.A0B(view, 1);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.SuggestedPinnablesSectionViewBinder.Holder");
        CQI cqi = (CQI) tag;
        Object obj3 = null;
        if (obj instanceof Boolean) {
            obj3 = obj;
        }
        C14360o3.A0B(cqi, 0);
        TextView textView = cqi.A01;
        Context context = textView.getContext();
        int i2 = 2131974538;
        if (C14360o3.A0K(obj3, true)) {
            i2 = 2131974537;
        }
        AbstractC166987dD.A1P(context, textView, i2);
        TextView textView2 = cqi.A00;
        if (C14360o3.A0K(obj3, true)) {
            textView2.setVisibility(0);
            GradientDrawable A0O = AbstractC25228BEl.A0O(0);
            Context context2 = textView2.getContext();
            A0O.setCornerRadius(context2.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material));
            A0O.setColor(AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_lavender));
            textView2.setBackground(A0O);
        }
        C0f9.A0A(521672491, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1349288791);
        View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.layout_suggested_pinnables_section, viewGroup, false);
        C14360o3.A0A(inflate);
        inflate.setTag(new CQI(inflate));
        C0f9.A0A(1533920633, A0G);
        return inflate;
    }
}
