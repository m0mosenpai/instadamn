package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.LPv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48070LPv implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ RecyclerView A03;
    public final /* synthetic */ InterfaceC11380iw A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ C1121854m A06;
    public final /* synthetic */ C63972vI A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    public ViewOnClickListenerC48070LPv(Context context, TextView textView, RecyclerView recyclerView, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1121854m c1121854m, C63972vI c63972vI, Integer num, String str, int i, boolean z) {
        this.A05 = userSession;
        this.A07 = c63972vI;
        this.A03 = recyclerView;
        this.A09 = str;
        this.A08 = num;
        this.A0A = z;
        this.A06 = c1121854m;
        this.A01 = context;
        this.A02 = textView;
        this.A04 = interfaceC11380iw;
        this.A00 = i;
    }

    public static void A00(ViewOnClickListenerC48070LPv viewOnClickListenerC48070LPv) {
        C63972vI c63972vI = viewOnClickListenerC48070LPv.A07;
        RecyclerView recyclerView = viewOnClickListenerC48070LPv.A03;
        String str = viewOnClickListenerC48070LPv.A09;
        c63972vI.A05(recyclerView, viewOnClickListenerC48070LPv.A08, str, AbstractC124135jS.A00(viewOnClickListenerC48070LPv.A06.A00()), viewOnClickListenerC48070LPv.A0A);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(135016363);
        UserSession userSession = this.A05;
        if (AbstractC31206Dnp.A01(userSession)) {
            AbstractC31206Dnp.A00(this.A01, userSession, new C49692LxN(this));
        } else {
            Integer num = C05F.A00;
            if (AbstractC43607JQo.A00(userSession, num)) {
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                int A01 = AbstractC31172DnG.A01(A00.A01, "zero_rating_story_nux_count");
                C1R0 C98 = C26661Qv.A00(userSession).C98();
                ViewOnClickListenerC48067LPs viewOnClickListenerC48067LPs = new ViewOnClickListenerC48067LPs(A01, 5, this, A00);
                Context context = this.A02.getContext();
                InterfaceC11380iw interfaceC11380iw = this.A04;
                boolean z = true;
                if (this.A00 > 0) {
                    z = false;
                }
                AbstractC34362FDe.A00(context, viewOnClickListenerC48067LPs, C98, interfaceC11380iw, null, Boolean.valueOf(z), num);
            } else {
                A00(this);
            }
        }
        C0f9.A0C(-1092793672, A05);
    }
}
