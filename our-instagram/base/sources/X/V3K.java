package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V3K extends AbstractC168697g3 {
    public final LayoutInflater A00;
    public final C67897V1f A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public V3K(Context context, C67897V1f c67897V1f) {
        this.A01 = c67897V1f;
        this.A00 = LayoutInflater.from(context);
    }

    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int dimensionPixelSize;
        int A03 = C0f9.A03(-1372745165);
        if (view == null) {
            LayoutInflater layoutInflater = this.A00;
            C14360o3.A0B(layoutInflater, 0);
            view = layoutInflater.inflate(R.layout.reporting_bottom_sheet_inverse_primary_action_button_row, (ViewGroup) null);
            C14360o3.A0A(view);
            view.setTag(new VgO(view));
        }
        VgO vgO = (VgO) AbstractC31172DnG.A0x(view);
        C67897V1f c67897V1f = this.A01;
        C69365VmB c69365VmB = (C69365VmB) obj;
        VJI vji = (VJI) obj2;
        C14360o3.A0B(vgO, 0);
        AbstractC167027dH.A13(c67897V1f, c69365VmB, vji);
        C70155WDf c70155WDf = c67897V1f.A06;
        if (c70155WDf != null) {
            c70155WDf.A07((short) 2);
        }
        View view2 = vgO.A00;
        int i2 = 0;
        if (vji.A01) {
            i2 = 8;
        }
        view2.setVisibility(i2);
        TextView textView = vgO.A01;
        textView.setText(c69365VmB.A03.A00);
        WNW.A00(textView, 29, c67897V1f, c69365VmB);
        ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(textView);
        if (vji.A00 > 0) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = AbstractC25228BEl.A0M(textView).getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        }
        A0G.setMargins(A0G.leftMargin, dimensionPixelSize, A0G.rightMargin, A0G.bottomMargin);
        textView.setLayoutParams(A0G);
        C0f9.A0A(-1860283427, A03);
        return view;
    }
}
