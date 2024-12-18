package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.facebookpay.widget.listcell.ListCell;

/* loaded from: classes11.dex */
public final class UC2 extends FrameLayout implements X9f {
    public UvG A00;

    @Override // X.X9f
    public void setViewModel(UvG uvG) {
        C14360o3.A0B(uvG, 0);
        this.A00 = uvG;
        Context A0L = AbstractC166997dE.A0L(this);
        Integer num = null;
        ListCell listCell = new ListCell(A0L, null);
        Context A0L2 = AbstractC166997dE.A0L(listCell);
        UBW ubw = new UBW(A0L2);
        Context context = ubw.getContext();
        UvG uvG2 = this.A00;
        if (uvG2 != null) {
            num = Integer.valueOf(uvG2.A00);
        }
        if (num != null) {
            ubw.setText(context.getString(num.intValue()));
            ubw.setTextStyle(VEP.A14);
            listCell.setLeftAddOnText(ubw);
            UvG uvG3 = this.A00;
            if (uvG3 != null) {
                int i = uvG3.A01;
                if (Integer.valueOf(i) != null) {
                    listCell.setPrimaryText(A0L2.getString(i));
                    listCell.setPrimaryTextStyle(VEP.A1F);
                    listCell.setBackgroundStyle(VEV.A09);
                    C70161WEa.A01(A0L, listCell, VD0.A02);
                    addView(listCell, new FrameLayout.LayoutParams(-1, -2));
                    return;
                }
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final UvG getFulfillmentOptionCellViewModel() {
        return this.A00;
    }

    public final void setFulfillmentOptionCellViewModel(UvG uvG) {
        this.A00 = uvG;
    }
}
