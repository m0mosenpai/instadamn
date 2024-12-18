package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G8S implements GZB {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    @Override // X.GZB
    public final void onDismiss() {
    }

    public G8S(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.GZB
    public final void D3J(Context context) {
        FragmentActivity A07;
        if (this.A00 != 0) {
            C14360o3.A0B(context, 0);
            AbstractC34339FCh.A00(context, AbstractC31171DnF.A0D(this.A03), (UserSession) this.A02, "reply_modal", null, AbstractC166987dD.A1J(this.A01));
            return;
        }
        String str = this.A03;
        if (str == null) {
            AbstractC34103F3f.A00().A00((Context) this.A01, C35112FeE.A00, "all");
        } else {
            if (C36881nl.A13 == null || (A07 = AbstractC31179DnN.A07()) == null) {
                return;
            }
            C36881nl A01 = C36881nl.A01(A07, C35112FeE.A00, (UserSession) this.A02, "banner");
            A01.A0A(str);
            A01.A06();
        }
    }
}
