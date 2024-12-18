package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.EQy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32446EQy extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32446EQy(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        E71 e71;
        int A03 = C0f9.A03(-931255104);
        if (view != null && obj != null && E71.A00(obj, 6) && (e71 = (E71) obj) != null) {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.wellbeing.reporting.common.adapter.BottomSheetListHeaderViewBinder.Holder");
            View view2 = ((FI2) tag).A00;
            TextView A0C = AbstractC31178DnM.A0C(view2);
            TextView A0N = AbstractC167007dF.A0N(view2, R.id.subtitle);
            A0C.setText(e71.A00);
            String str = e71.A02;
            if (str != null || e71.A01 != null) {
                A0N.setVisibility(0);
                Number number = (Number) e71.A01;
                if (number != null) {
                    A0N.setText(number.intValue());
                } else if (str != null) {
                    A0N.setText(str);
                }
            }
        }
        C0f9.A0A(-1780538924, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1120468393);
        LayoutInflater from = LayoutInflater.from(this.A00);
        C14360o3.A0A(from);
        C14360o3.A0B(from, 0);
        View A0C = AbstractC31173DnH.A0C(from, viewGroup, R.layout.reporting_bottom_sheet_list_header_row, false);
        A0C.setTag(new FI2(A0C));
        C0f9.A0A(-1791982402, A03);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31180DnO.A1S(anonymousClass306);
    }
}
