package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebookpay.widget.listcell.ListCell;

/* loaded from: classes11.dex */
public final class UCY extends LinearLayout implements X9f {
    public UvF A00;

    @Override // X.X9f
    public void setViewModel(UvF uvF) {
        C14360o3.A0B(uvF, 0);
        this.A00 = uvF;
        ListCell listCell = (ListCell) findViewById(R.id.list_cell);
        listCell.setTextStyle(VEW.A0G);
        Context A0L = AbstractC166997dE.A0L(this);
        UBV ubv = new UBV(A0L);
        ubv.setIcon(VET.A0X);
        listCell.setRightAddOnIcon(ubv);
        UvF uvF2 = this.A00;
        if (uvF2 != null) {
            listCell.setPrimaryText(A0L.getString(uvF2.A00));
            UvF uvF3 = this.A00;
            if (uvF3 != null) {
                listCell.A06(R.dimen.action_bar_item_spacing_left, uvF3.A01);
                listCell.A0C(false, true);
                listCell.A07(AbstractC166987dD.A0c(listCell, R.id.image), null, R.style.FBPayUIListCellElement_Image_APMLink);
                listCell.A07(AbstractC166987dD.A0c(listCell, R.id.right_add_on_container), null, R.style.FBPayUIListCellElement_AddOnContainer_IconSmall);
                TextView textView = (TextView) listCell.findViewById(R.id.primary_text);
                textView.setGravity(16);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                C14360o3.A0C(layoutParams, AbstractC111324zv.A00(0));
                C56302iJ c56302iJ = (C56302iJ) layoutParams;
                c56302iJ.A0u = R.id.image;
                c56302iJ.A0F = R.id.image;
                listCell.setOnClickListener(new WNN(this, 14));
                VYX.A00.A03(A0L, this, VD0.A04, 30);
                return;
            }
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }
}
