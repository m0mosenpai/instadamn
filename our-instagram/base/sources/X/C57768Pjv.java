package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Pjv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57768Pjv extends C0YY implements InterfaceC16610sE {
    public static final C57768Pjv A00 = new C57768Pjv();

    public C57768Pjv() {
        super(3);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj;
        UserSession userSession = (UserSession) obj3;
        AbstractC167007dF.A1D(viewGroup, 0, userSession);
        List list = AbstractC51358MmJ.A00;
        return new NHY(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_stacked_timeline_bottom_sheet_color_filter_item, false), userSession);
    }
}
