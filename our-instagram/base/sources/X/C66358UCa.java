package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.UCa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66358UCa extends LinearLayout implements X9f {
    public UvH A00;

    @Override // X.X9f
    public void setViewModel(UvH uvH) {
        String str;
        C14360o3.A0B(uvH, 0);
        this.A00 = uvH;
        String str2 = "viewModel";
        WNN wnn = null;
        if (uvH.A03) {
            Boolean bool = (Boolean) uvH.A05.A02();
            if (bool == null || !bool.booleanValue()) {
                UvH uvH2 = this.A00;
                if (uvH2 != null) {
                    Integer num = uvH2.A02;
                    if (num != null) {
                        str = AbstractC167007dF.A0f(getContext(), num, R.string.res_0x7f130026_name_removed);
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
            str = getContext().getString(R.string.res_0x7f130025_name_removed);
        } else {
            str = null;
        }
        C2FP.A0H();
        Context A0L = AbstractC166997dE.A0L(this);
        UvH uvH3 = this.A00;
        if (uvH3 != null) {
            String A0p = AbstractC166997dE.A0p(A0L, uvH3.A01);
            UvH uvH4 = this.A00;
            if (uvH4 != null) {
                String string = A0L.getString(uvH4.A00);
                UvH uvH5 = this.A00;
                if (uvH5 != null) {
                    if (uvH5.A03) {
                        wnn = new WNN(this, 13);
                    }
                    C38311Gsx c38311Gsx = new C38311Gsx(A0L);
                    c38311Gsx.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    c38311Gsx.A01(A0p);
                    int A00 = (int) (33.0f * AbstractC65702TsY.A00(A0L));
                    IgLinearLayout igLinearLayout = c38311Gsx.A01;
                    if (igLinearLayout == null) {
                        str2 = "headerCellContainer";
                    } else {
                        igLinearLayout.setPadding(0, A00, 0, 0);
                        if (str != null && wnn != null) {
                            c38311Gsx.A03(str, wnn);
                        }
                        if (string != null) {
                            View inflate = LayoutInflater.from(A0L).inflate(R.layout.ig_fbpay_ui_address_list_header_body, (ViewGroup) null, false);
                            C14360o3.A0C(inflate, AbstractC111324zv.A00(3));
                            TextView textView = (TextView) inflate;
                            textView.setText(string);
                            textView.setLetterSpacing(-0.01f);
                            c38311Gsx.addView(textView);
                        }
                        c38311Gsx.requestLayout();
                        addView(c38311Gsx);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    private final View.OnClickListener getOnClickListener() {
        return new WNN(this, 13);
    }
}
