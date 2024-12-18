package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.ExR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33863ExR {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        final String str = (String) c6fw.A00();
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 3);
        String A0s2 = AbstractC31173DnH.A0s(list, 4);
        String A0s3 = AbstractC31173DnH.A0s(list, 5);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        InterfaceC11380iw interfaceC11380iw = new InterfaceC11380iw() { // from class: X.Fua
            public static final String __redex_internal_original_name = "BKBloksActionIgWellbeingOpenSensitiveContentControlImpl$$ExternalSyntheticLambda0";

            @Override // X.InterfaceC11380iw
            public final String getModuleName() {
                return str;
            }
        };
        C189478aR A06 = AbstractC70200WGp.A06(C6BQ.A09(c6fq));
        if (A06 != null) {
            if (A0s2 != null && Arrays.asList(A0s2.split(":")).contains(AbstractC111324zv.A00(953))) {
                FragmentActivity A042 = C6BQ.A04(c6fq);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("analytics_module_name", str);
                AbstractC31171DnF.A13(A0b, A0s2);
                A0b.putString("location", A0s);
                A0b.putString("nua_action", A0s3);
                AbstractC25228BEl.A1G(A042, A0b, A0K, ModalActivity.class, AbstractC111324zv.A00(5298));
                return null;
            }
            C34995FbS c34995FbS = C34995FbS.A00;
            boolean A1R = AbstractC167007dF.A1R(0, A04, A0K);
            C189448aO A0y = AbstractC25225BEi.A0y(A0K);
            AbstractC25226BEj.A1M(A04, A0y, 2131965132);
            AbstractC25225BEi.A1Q(A0y, A1R);
            A0y.A19 = A1R;
            A0y.A0x = false;
            A06.A0F(c34995FbS.A00(A04, interfaceC11380iw, A0K, A0s2, A0s, A0s3, AbstractC167017dG.A0r(CacheBehaviorLogger.SOURCE, "bottom_sheet_android")), A0y);
            return null;
        }
        C140966Yy A0F = AbstractC31180DnO.A0F(c6fq);
        A0F.A0E(C34995FbS.A00.A00(A04, interfaceC11380iw, A0K, A0s2, A0s, A0s3, null));
        A0F.A0F = true;
        A0F.A04();
        return null;
    }
}
