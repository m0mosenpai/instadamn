package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.instagram.user.model.User;

/* renamed from: X.Fx0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36126Fx0 implements InterfaceC41501vz {
    public final /* synthetic */ C172707mf A00;

    public C36126Fx0(C172707mf c172707mf) {
        this.A00 = c172707mf;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        User user;
        String str;
        int A03 = C0f9.A03(108898556);
        int A032 = C0f9.A03(644121702);
        C172707mf c172707mf = this.A00;
        C58877QEn c58877QEn = new C58877QEn(((BrowserLiteFragment) c172707mf).A09);
        C38321qM A01 = C172707mf.A01(c172707mf, c58877QEn);
        String A0T = c172707mf.A0T();
        String str2 = null;
        if (A01 != null) {
            user = A01.A2E(AbstractC166987dD.A0r(c172707mf.A08));
        } else {
            user = null;
        }
        C34725FRo A06 = C28531Zo.A04.A02.A06(c172707mf, AbstractC166987dD.A0r(c172707mf.A08), AbstractC111324zv.A00(1373));
        String string = c58877QEn.A00.getString(AbstractC58317Pt9.A00(207));
        Bundle bundle = A06.A01;
        bundle.putString(AbstractC111324zv.A00(149), string);
        C14360o3.A0B(A0T, 0);
        bundle.putString(AbstractC111324zv.A00(297), A0T);
        if (A01 != null) {
            str = A01.getId();
        } else {
            str = null;
        }
        A06.A02(str);
        FragmentActivity requireActivity = c172707mf.requireActivity();
        if (user != null) {
            str2 = user.B8y();
        }
        String A0f = AbstractC167007dF.A0f(requireActivity, str2, 2131957299);
        C14360o3.A0B(A0f, 0);
        bundle.putString(AbstractC111324zv.A00(883), A0f);
        C3DN A0m = AbstractC25230BEn.A0m(c172707mf);
        if (A0m != null) {
            A0m.A0K(A06.A00());
        }
        C0f9.A0A(1352554401, A032);
        C0f9.A0A(-721736437, A03);
    }
}
