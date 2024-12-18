package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class G35 implements InterfaceC37156GYt {
    public final Context A00;
    public final FragmentActivity A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final E70 A04;
    public final Integer A05;

    public G35(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, E70 e70, Integer num) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = e70;
        this.A05 = num;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        return AbstractC34096F2y.A00(this.A03, this.A04);
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        Integer num;
        Context context;
        String string;
        int i;
        int i2;
        Object[] objArr;
        ArrayList A1E = AbstractC166987dD.A1E();
        E70 e70 = this.A04;
        C3o9 A08 = e70.A08();
        String str = e70.A0N;
        if (str != null) {
            Locale locale = Locale.US;
            C14360o3.A08(locale);
            int ordinal = EnumC31648DvE.valueOf(AbstractC166997dE.A10(locale, str)).ordinal();
            if (ordinal != 6) {
                if (ordinal == 5) {
                    num = 2131964422;
                    context = this.A00;
                    string = context.getString(2131964432);
                    i = 1;
                }
                return A1E;
            }
            num = 2131964423;
            context = this.A00;
            string = context.getString(2131964411);
            i = 0;
            if (string != null) {
                UserSession userSession = this.A03;
                boolean A1X = AbstractC167007dF.A1X(AbstractC31179DnN.A0E(userSession), BizUserInboxState.A04);
                A1E.add(new FMQ(new ViewOnClickListenerC35688FpN(i, 4, A08, this), 2131964415, num.intValue(), A1X));
                boolean A04 = E70.A04(e70);
                if (A04 && C18U.A05(C06090Tz.A05, userSession)) {
                    i2 = 2131964418;
                } else {
                    i2 = 2131964419;
                    if (!A04) {
                        i2 = 2131964420;
                        objArr = new Object[]{C4GQ.A08(context, userSession, e70.A0P, AbstractC31171DnF.A0n(e70.A0c), false), string};
                        A1E.add(new C35246Fgf(context.getString(i2, objArr)));
                    }
                }
                objArr = new Object[]{string};
                A1E.add(new C35246Fgf(context.getString(i2, objArr)));
            }
            return A1E;
        }
        throw AbstractC166997dE.A0g();
    }
}
