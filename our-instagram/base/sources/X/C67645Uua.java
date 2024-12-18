package X;

import android.content.Context;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.listcell.ListCell;

/* renamed from: X.Uua, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67645Uua extends UGL {
    public final Context A00;
    public final C07X A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16660sJ A04;
    public final InterfaceC16610sE A05;

    public C67645Uua(Context context, C07X c07x, LoggingContext loggingContext, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16610sE interfaceC16610sE) {
        super(VG3.A0s, loggingContext, false);
        this.A04 = interfaceC16660sJ;
        this.A02 = interfaceC16660sJ2;
        this.A03 = interfaceC16660sJ3;
        this.A05 = interfaceC16610sE;
        this.A00 = context;
        this.A01 = c07x;
    }

    public static final void A04(UJ8 uj8, C67645Uua c67645Uua, C63406Sjd c63406Sjd) {
        ListCell listCell = uj8.A01;
        listCell.A03();
        SelectionPhoneNumberViewItem selectionPhoneNumberViewItem = (SelectionPhoneNumberViewItem) c63406Sjd.A01;
        if (selectionPhoneNumberViewItem != null) {
            listCell.setPrimaryText(selectionPhoneNumberViewItem.A01);
            listCell.setQuaternaryText(selectionPhoneNumberViewItem.A03);
        }
        AbstractC167007dF.A0w(listCell.A07);
        listCell.setActionMenu(uj8.A00);
        C0fQ.A00(new WNX(uj8, c67645Uua, c63406Sjd, 4), listCell);
    }
}
