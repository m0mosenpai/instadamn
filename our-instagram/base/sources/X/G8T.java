package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes6.dex */
public final class G8T implements GZB {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    @Override // X.GZB
    public final void onDismiss() {
    }

    public G8T(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // X.GZB
    public final void D3J(Context context) {
        FragmentActivity A07;
        C6XJ A0a;
        if (this.A00 != 0) {
            ArrayList A1E = AbstractC166987dD.A1E();
            String str = this.A03;
            A1E.add(str);
            HashMap A1G = AbstractC166987dD.A1G();
            HashSet A1H = AbstractC166987dD.A1H();
            A1H.add(this.A02);
            A1G.put(str, A1H);
            C141586ab A0U = AbstractC31171DnF.A0U();
            A0U.A0O = A1E;
            A0U.A0Q = A1E;
            AbstractC31177DnL.A1P(A0U);
            A0U.A03(C3G2.A1E);
            A0U.A02 = new C70873Fz();
            A0U.A0T = A1G;
            A0U.A0V = true;
            A07 = AbstractC31179DnN.A07();
            if (A07 != null) {
                A0a = AbstractC31176DnK.A0d(A07, A0U.A00(), ((C36508G8g) this.A01).A00, TransparentModalActivity.class, "reel_viewer");
            } else {
                return;
            }
        } else {
            A07 = AbstractC31179DnN.A07();
            UserSession userSession = ((C36506G8e) this.A01).A00;
            IgFragmentFactoryImpl.A00();
            String str2 = this.A03;
            C35028Fc1 c35028Fc1 = new C35028Fc1();
            c35028Fc1.A0B = str2;
            c35028Fc1.A0N = true;
            String str3 = this.A02;
            c35028Fc1.A09 = str3;
            c35028Fc1.A0G = str3;
            c35028Fc1.A0T = true;
            A0a = AbstractC31174DnI.A0a(A07, c35028Fc1.A01(), userSession, ModalActivity.class, "single_media_feed");
        }
        A0a.A0C(A07);
    }
}
