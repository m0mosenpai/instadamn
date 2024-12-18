package X;

import android.content.Context;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.actionmenu.InlineActionMenu;
import com.facebookpay.widget.listcell.ListCell;

/* renamed from: X.Uub, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67646Uub extends UGL {
    public final Context A00;
    public final C07X A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16660sJ A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67646Uub(Context context, C07X c07x, LoggingContext loggingContext, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, boolean z) {
        super(VG3.A08, loggingContext, false);
        C14360o3.A0B(interfaceC16660sJ, 2);
        this.A04 = interfaceC16660sJ;
        this.A02 = interfaceC16660sJ2;
        this.A03 = interfaceC16660sJ3;
        this.A00 = context;
        this.A01 = c07x;
        this.A05 = z;
    }

    public static final void A04(UJ9 uj9, C67646Uub c67646Uub, C63406Sjd c63406Sjd) {
        InlineActionMenu inlineActionMenu;
        ListCell listCell = uj9.A01;
        listCell.A03();
        SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) c63406Sjd.A01;
        if (selectionShippingAddressItem != null) {
            listCell.setPrimaryText(selectionShippingAddressItem.A03);
            listCell.setSecondaryText(selectionShippingAddressItem.A02);
            listCell.setTertiaryText(selectionShippingAddressItem.A04);
            String str = null;
            if (selectionShippingAddressItem.A0H) {
                inlineActionMenu = uj9.A00;
            } else {
                inlineActionMenu = null;
            }
            listCell.setActionMenu(inlineActionMenu);
            String str2 = selectionShippingAddressItem.A05;
            if (str2 == null) {
                Integer num = selectionShippingAddressItem.A00;
                if (num != null) {
                    str = c67646Uub.A00.getString(num.intValue());
                }
            } else {
                str = str2;
            }
            listCell.setErrorText(str);
        }
        AbstractC167007dF.A0w(listCell.A07);
        WNX.A00(listCell, c63406Sjd, c67646Uub, uj9, 5);
    }
}
