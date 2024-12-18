package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V3M extends AbstractC168697g3 {
    public final Context A00;
    public final V1X A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public V3M(Context context, V1X v1x) {
        this.A00 = context;
        this.A01 = v1x;
    }

    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(2056004866);
        if (view == null) {
            view = LayoutInflater.from(this.A00).inflate(R.layout.reporting_report_tag_row, (ViewGroup) null);
            view.setTag(new C69172Vj1(view));
        }
        C69172Vj1 c69172Vj1 = (C69172Vj1) AbstractC31172DnG.A0x(view);
        C69313VlL c69313VlL = (C69313VlL) obj;
        V1X v1x = this.A01;
        TextView textView = c69172Vj1.A02;
        textView.setText(c69313VlL.A01.A00);
        AbstractC56952jT.A01(textView);
        textView.setEnabled(true);
        View view2 = c69172Vj1.A00;
        WNW.A00(view2, 31, v1x, c69313VlL);
        int dimensionPixelSize = view2.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        view2.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.height = -2;
        textView.setLayoutParams(layoutParams);
        int ordinal = ((VDZ) obj2).ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                RadioButton radioButton = c69172Vj1.A01;
                radioButton.setVisibility(0);
                radioButton.setChecked(c69313VlL.A04);
            }
        } else {
            c69172Vj1.A01.setVisibility(8);
        }
        C70169WEl c70169WEl = v1x.A09;
        c70169WEl.getClass();
        c70169WEl.A00.A07((short) 2);
        C0f9.A0A(1246337017, A03);
        return view;
    }
}
