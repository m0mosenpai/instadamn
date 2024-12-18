package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.Date;

/* loaded from: classes8.dex */
public final class L8G {
    public int A00;
    public InterfaceC58115Ppe A01;
    public V1G A02;
    public C189468aQ A03;
    public Integer A04;
    public String A05;
    public String A06;
    public String A07;
    public Date A08;
    public Date A09;
    public Date A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public C189448aO A0E;
    public final Activity A0F;
    public final Context A0G;
    public final UserSession A0H;

    public final L3H A00() {
        this.A02 = new V1G();
        C189448aO A0y = AbstractC25225BEi.A0y(this.A0H);
        boolean z = this.A0C;
        A0y.A0k = z;
        A0y.A0q = !z;
        A0y.A1O = z;
        A0y.A11 = z;
        String str = this.A07;
        int i = this.A00;
        A0y.A0d = str;
        A0y.A0D = i;
        A0y.A0U = new C49623LwG(this, 4);
        this.A0E = A0y;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("extra_show_all_day_toggle", false);
        A0b.putSerializable("extra_selected_date", this.A09);
        A0b.putSerializable("extra_date_range_start", this.A0A);
        A0b.putSerializable("extra_date_range_end", this.A08);
        A0b.putSerializable("extra_show_done_button", Boolean.valueOf(this.A0D));
        A0b.putString("extra_hint_text", this.A06);
        A0b.putBoolean("extra_listen_for_past_dates", this.A0B);
        Integer num = this.A04;
        if (num != null) {
            A0b.putInt("extra_minute_interval_length", num.intValue());
        }
        V1G v1g = this.A02;
        if (v1g == null) {
            C14360o3.A0F("bottomSheetFragment");
        } else {
            v1g.setArguments(A0b);
            InterfaceC58115Ppe interfaceC58115Ppe = this.A01;
            if (interfaceC58115Ppe != null) {
                v1g.A03 = interfaceC58115Ppe;
            }
            boolean z2 = this.A0D;
            if (z2) {
                C189448aO c189448aO = this.A0E;
                if (c189448aO != null) {
                    c189448aO.A0g = this.A05;
                    c189448aO.A0K = new ViewOnClickListenerC48063LPo(this, 39);
                }
                C14360o3.A0F("bottomSheetBuilder");
            }
            C189468aQ c189468aQ = this.A03;
            if (c189468aQ != null) {
                C189448aO c189448aO2 = this.A0E;
                if (c189448aO2 != null) {
                    c189448aO2.A0Q = c189468aQ;
                }
                C14360o3.A0F("bottomSheetBuilder");
            }
            Activity activity = this.A0F;
            C189448aO c189448aO3 = this.A0E;
            if (c189448aO3 != null) {
                return new L3H(activity, v1g, c189448aO3, z2);
            }
            C14360o3.A0F("bottomSheetBuilder");
        }
        throw C00O.createAndThrow();
    }

    public L8G(Activity activity, Context context, UserSession userSession) {
        this.A0H = userSession;
        this.A0G = context;
        this.A0F = activity;
        this.A05 = AbstractC166997dE.A0p(context, 2131961124);
    }
}
