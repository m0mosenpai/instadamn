package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.7Ma, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161657Ma extends AbstractC66412zI {
    public final UserSession A00;
    public final InterfaceC165857bD A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.layout_quiet_mode_nudge, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        return new C44672JqH(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        ViewOnClickListenerC23205AQp viewOnClickListenerC23205AQp;
        long currentTimeMillis;
        InterfaceC19610xo ARD;
        String str;
        String A00;
        StringBuilder sb;
        EY8 ey8 = (EY8) interfaceC66482zP;
        C44672JqH c44672JqH = (C44672JqH) c3oo;
        C14360o3.A0B(ey8, 0);
        C14360o3.A0B(c44672JqH, 1);
        String str2 = ey8.A03;
        if (str2 != null && str2.length() != 0) {
            IgTextView igTextView = c44672JqH.A01;
            igTextView.setText(str2);
            igTextView.setVisibility(0);
        } else {
            c44672JqH.A01.setVisibility(8);
        }
        IgTextView igTextView2 = c44672JqH.A00;
        igTextView2.setText(ey8.A01);
        Integer num = ey8.A02;
        if (num == C05F.A00) {
            viewOnClickListenerC23205AQp = new ViewOnClickListenerC23205AQp(this);
        } else {
            viewOnClickListenerC23205AQp = null;
        }
        C0fQ.A00(viewOnClickListenerC23205AQp, igTextView2);
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        int intValue = num.intValue();
        if (intValue != 1 && intValue != 0) {
            if (intValue != 4) {
                if (intValue != 2 && intValue != 3) {
                    throw new RuntimeException();
                }
                InterfaceC83733oI interfaceC83733oI = ey8.A00.A0P;
                if (interfaceC83733oI != null) {
                    C2056398n A002 = AbstractC2056298m.A00(userSession);
                    String A003 = AbstractC53958NtV.A00(num);
                    A00 = AbstractC1345466e.A01(interfaceC83733oI).A00;
                    currentTimeMillis = System.currentTimeMillis();
                    C14360o3.A0B(A00, 1);
                    ARD = A002.A00.ARD();
                    sb = new StringBuilder();
                    sb.append("preference_quiet_mode_nudge_last_seen_timestamp_");
                    sb.append(A003);
                    sb.append('_');
                } else {
                    return;
                }
            } else {
                C2056398n A004 = AbstractC2056298m.A00(userSession);
                A00 = AbstractC53958NtV.A00(num);
                currentTimeMillis = System.currentTimeMillis();
                ARD = A004.A00.ARD();
                sb = new StringBuilder();
                sb.append("preference_quiet_mode_nudge_last_seen_timestamp_");
            }
            sb.append(A00);
            str = sb.toString();
        } else {
            C2056398n A005 = AbstractC2056298m.A00(userSession);
            currentTimeMillis = System.currentTimeMillis();
            ARD = A005.A00.ARD();
            str = "preference_quiet_mode_nudge_last_seen_timestamp";
        }
        ARD.E7G(str, currentTimeMillis);
        ARD.apply();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return EY8.class;
    }

    public C161657Ma(UserSession userSession, InterfaceC165857bD interfaceC165857bD) {
        this.A00 = userSession;
        this.A01 = interfaceC165857bD;
    }
}
