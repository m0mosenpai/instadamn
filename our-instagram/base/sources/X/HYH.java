package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class HYH extends C4A7 {
    public final UserSession A00;
    public final C05A A01;
    public final Context A02;

    public static final C75363a3 A00(C120985dq c120985dq) {
        InterfaceC38831rF interfaceC38831rF;
        String str;
        List list;
        String str2;
        Integer num;
        String str3;
        C38321qM c38321qM = c120985dq.A02;
        Boolean bool = null;
        if (c38321qM != null) {
            interfaceC38831rF = c38321qM.A0C;
        } else {
            interfaceC38831rF = null;
        }
        Integer num2 = C05F.A00;
        if (interfaceC38831rF == null || (str = interfaceC38831rF.getId()) == null) {
            str = "0";
        }
        ProductType productType = (ProductType) ProductType.A01.get("clips");
        if (interfaceC38831rF != null) {
            list = interfaceC38831rF.CFe();
        } else {
            list = null;
        }
        ArrayList A00 = AbstractC75353a2.A00(list);
        if (interfaceC38831rF != null) {
            str2 = interfaceC38831rF.getVideoDashManifest();
            num = interfaceC38831rF.CSN();
            str3 = interfaceC38831rF.getVideoCodec();
            bool = interfaceC38831rF.BB7();
        } else {
            str2 = null;
            num = null;
            str3 = null;
        }
        return new C75363a3(null, productType, null, bool, null, num2, num, str, null, null, str2, null, str3, null, null, null, A00, null, null, -1, -1, Long.MAX_VALUE, false, false, false, false, false, false, true, false);
    }

    public static final String A01(C120985dq c120985dq, HYH hyh) {
        C3x9 A0u;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM == null || (A0u = AbstractC25226BEj.A0u(c38321qM)) == null) {
            return null;
        }
        String A07 = AbstractC76643c9.A07(A0u);
        String A06 = AbstractC76643c9.A06(A0u);
        C14360o3.A07(A06);
        boolean A0D = AbstractC76643c9.A0D(A0u);
        InterfaceC84033on AZi = A0u.AZi();
        C206239Bg A00 = AbstractC76643c9.A00(A0u.BZw());
        C38321qM c38321qM2 = c120985dq.A02;
        UserSession userSession = hyh.A00;
        C92584Cs c92584Cs = new C92584Cs(A00, AZi, A07, A06, R.dimen.abc_text_size_menu_header_material, false, A0D, false, false, true, true, AbstractC76643c9.A0H(userSession, c38321qM2), AbstractC92574Cr.A03(A0u), false);
        Context context = hyh.A02;
        return C92604Cu.A03(AbstractC166997dE.A0M(context), C92604Cu.A01(context, c92584Cs), C92604Cu.A00(context, c92584Cs), userSession, c92584Cs, false).toString();
    }

    public static final void A02(EnumC27382C6l enumC27382C6l, HYH hyh) {
        Object value;
        C51755Mte c51755Mte;
        C05A c05a = hyh.A01;
        do {
            value = c05a.getValue();
            c51755Mte = (C51755Mte) ((C51761Mtk) value).A00;
            C14360o3.A0B(enumC27382C6l, 1);
        } while (!c05a.AIi(value, new C51761Mtk(c51755Mte, enumC27382C6l)));
    }

    public HYH(UserSession userSession, Context context) {
        super("ig_nux_reels_tuning", C4A8.A00(2097882485));
        this.A00 = userSession;
        this.A02 = context;
        this.A01 = AbstractC25225BEi.A1H(new C51761Mtk());
    }
}
