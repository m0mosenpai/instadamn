package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.N8c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52189N8c extends EPU {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52189N8c(C012804r c012804r, Integer num, Object obj, Object obj2, String str, int i, int i2) {
        super(c012804r, num, str, i);
        this.A00 = i2;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.instagram.monetization.impl.MonetizationFragmentFactoryImpl] */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        String str;
        if (this.A00 != 0) {
            C130135uJ c130135uJ = (C130135uJ) this.A01;
            String A19 = AbstractC166987dD.A19(c130135uJ.A02);
            P1E p1e = (P1E) this.A02;
            if (c130135uJ.A00) {
                str = c130135uJ.A04;
            } else {
                p1e.A0I.requireContext();
                C131975xX c131975xX = C131965xW.A05;
                C131975xX.A00(p1e.A0J);
                str = null;
            }
            UserSession userSession = p1e.A0J;
            AbstractC130145uK.A02(userSession, "default_privacy_instruction_view_click", A19, str, "share_sheet", c130135uJ.A01.toString(), false, C196218mC.A00(userSession), c130135uJ.A05);
            p1e.A0L.Ekv(c130135uJ, str, "share_sheet", false);
            return;
        }
        Object obj = this.A01;
        Integer num = C05F.A00;
        C52143N5s c52143N5s = (C52143N5s) this.A02;
        if (obj == num) {
            FragmentActivity requireActivity = c52143N5s.requireActivity();
            InterfaceC09390do interfaceC09390do = c52143N5s.A03;
            C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity, interfaceC09390do);
            AbstractC34823FVz.A01();
            AbstractC25229BEm.A18(new Object().A00(UserMonetizationProductType.A0E, AbstractC166987dD.A0r(interfaceC09390do), "not_eligible", false), A0c);
            return;
        }
        C63397SjR A0y = AbstractC25228BEl.A0y(c52143N5s.requireActivity(), AbstractC166987dD.A0r(c52143N5s.A03), C2Fb.A2l, "https://help.instagram.com/331274061770840");
        A0y.A0S = C52143N5s.__redex_internal_original_name;
        A0y.A0A();
    }
}
