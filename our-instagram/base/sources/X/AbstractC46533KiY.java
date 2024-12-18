package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.KiY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46533KiY {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        AbstractC25225BEi.A1S(A03);
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A02()).A00;
        InterfaceC103384lE A0H = AbstractC31175DnJ.A0H(c6fw);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C56138Ovy A00 = AbstractC54071NvV.A00().A00(A04, (UserSession) C6BQ.A0B(c6fq));
        AbstractC31173DnH.A0S().A02(A00.A00(A04, new C51740MtP("ALL_PRODUCTS", 0)), new C36799GJy(A00, c6fq, interfaceC103384lE, A0H, (String) A03, 0));
        return null;
    }
}
