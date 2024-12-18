package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class EPT extends EPU {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EPT(C012804r c012804r, C32073E6z c32073E6z, E46 e46, Integer num, String str, int i) {
        super(c012804r, num, str, i);
        this.A03 = str;
        this.A02 = e46;
        this.A01 = c32073E6z;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Context context;
        UserSession userSession;
        String str;
        String str2;
        if (this.A00 != 0) {
            context = (Context) this.A01;
            userSession = AbstractC166987dD.A0r(((C32284EJv) this.A02).A0G);
            str = this.A03;
            C14360o3.A0B(userSession, 1);
            str2 = AbstractC166997dE.A0p(context, 2131963320);
        } else {
            E46 e46 = (E46) this.A02;
            List list = E46.A0A;
            context = e46.A00;
            userSession = e46.A04;
            str = ((C32073E6z) this.A01).A05;
            if (str != null) {
                str2 = this.A03;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        AbstractC35237FgW.A04(context, userSession, str, str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EPT(Context context, C012804r c012804r, C32284EJv c32284EJv, Integer num, String str, String str2, int i) {
        super(c012804r, num, str, i);
        this.A01 = context;
        this.A02 = c32284EJv;
        this.A03 = str2;
    }
}
