package X;

import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes9.dex */
public final class NJF extends AbstractC51210Mjv {
    public final IgdsListCell A00;
    public final InterfaceC16660sJ A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NJF(View view, InterfaceC16660sJ interfaceC16660sJ) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = interfaceC16660sJ;
        IgdsListCell igdsListCell = (IgdsListCell) view.findViewById(R.id.funded_content_text_cell);
        this.A00 = igdsListCell;
        if (igdsListCell != null) {
            igdsListCell.setTextCellType(EnumC53237Nga.A07);
            igdsListCell.A06(2131968670);
        }
    }
}
