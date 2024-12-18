package X;

import android.app.Activity;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes9.dex */
public final class NJG extends AbstractC51210Mjv {
    public final Activity A00;
    public final IgdsListCell A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16660sJ A03;
    public final UserSession A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NJG(Activity activity, View view, UserSession userSession, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = activity;
        this.A02 = interfaceC16660sJ;
        this.A03 = interfaceC16660sJ2;
        this.A04 = userSession;
        IgdsListCell igdsListCell = (IgdsListCell) view.findViewById(R.id.funded_content_text_cell);
        this.A01 = igdsListCell;
        if (igdsListCell != null) {
            igdsListCell.setTextCellType(EnumC53237Nga.A07);
        }
    }
}
