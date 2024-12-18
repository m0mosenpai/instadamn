package X;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class OL3 {
    public int A00;
    public int A01;
    public final Context A02;
    public final ConstraintLayout A03;
    public final C55043OZp A04;
    public final Map A05;
    public final Map A06;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.O5n] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.Pps, java.lang.Object] */
    public OL3(ConstraintLayout constraintLayout) {
        this.A03 = constraintLayout;
        this.A02 = constraintLayout.getContext();
        ?? obj = new Object();
        ?? obj2 = new Object();
        C55043OZp c55043OZp = new C55043OZp(AbstractC167007dF.A0J(), constraintLayout, new C54820OKy(obj, 0, 0, 0, false), obj2);
        this.A04 = c55043OZp;
        this.A05 = AbstractC166987dD.A1I();
        this.A06 = AbstractC166987dD.A1I();
        this.A01 = 1;
        c55043OZp.A02 = this;
    }

    public final void A01(View view) {
        C14360o3.A0B(view, 0);
        C54571O8x c54571O8x = (C54571O8x) this.A06.remove(view);
        if (c54571O8x != null) {
            this.A05.remove(c54571O8x.A01);
            C55043OZp c55043OZp = this.A04;
            int i = c54571O8x.A00;
            Map map = c55043OZp.A09;
            Integer valueOf = Integer.valueOf(i);
            map.remove(valueOf);
            c55043OZp.A0A.add(valueOf);
            c55043OZp.A06.A01(new C54483O5l(c55043OZp));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A02(View view, String str, String str2) {
        View view2;
        C52832NZp c52832NZp;
        C14360o3.A0B(view, 0);
        if (str != null) {
            view.setId(this.A01);
            this.A01++;
            view.setImportantForAccessibility(1);
            if (str2 != null) {
                view.setContentDescription(str2);
            }
            Map map = this.A05;
            if (map.get(str) == null) {
                NYQ nyq = (NYQ) this;
                UserSession userSession = nyq.A03;
                if (C14360o3.A0K(userSession.userId, str)) {
                    C52833NZq c52833NZq = new C52833NZq(view, nyq.A01, userSession, nyq.A06);
                    nyq.A05.invoke(c52833NZq.A01, c52833NZq);
                    c52832NZp = c52833NZq;
                } else {
                    c52832NZp = new C52832NZp(AbstractC166997dE.A0L(((OL3) nyq).A03), view, nyq.A02, userSession, nyq.A04, AbstractC31174DnI.A0k(userSession, str));
                }
                if (!str.equals("empty_key")) {
                    map.put(str, c52832NZp);
                }
                Map map2 = this.A06;
                C54571O8x c54571O8x = new C54571O8x(str, this.A00);
                C55043OZp c55043OZp = this.A04;
                int i = c54571O8x.A00;
                Map map3 = c55043OZp.A09;
                Integer valueOf = Integer.valueOf(i);
                map3.put(valueOf, c52832NZp);
                c55043OZp.A0A.remove(valueOf);
                c55043OZp.A06.A01(new C54483O5l(c55043OZp));
                map2.put(view, c54571O8x);
                this.A00++;
                return;
            }
            NXV nxv = (NXV) map.get(str);
            if (nxv == null) {
                return;
            }
            Map map4 = this.A06;
            boolean z = nxv instanceof C52833NZq;
            if (z) {
                view2 = ((C52833NZq) nxv).A00;
            } else {
                view2 = ((C52832NZp) nxv).A00;
            }
            Object remove = C15500q5.A04(map4).remove(view2);
            if (remove == null) {
                return;
            }
            map4.put(view, remove);
            if (z) {
                C52833NZq c52833NZq2 = (C52833NZq) nxv;
                RelativeLayout relativeLayout = c52833NZq2.A01;
                relativeLayout.addView(view, 0);
                relativeLayout.removeView(c52833NZq2.A00);
                c52833NZq2.A00 = view;
                return;
            }
            C52832NZp c52832NZp2 = (C52832NZp) nxv;
            RelativeLayout relativeLayout2 = c52832NZp2.A02;
            relativeLayout2.addView(view, 0);
            view.getLayoutParams().height = -1;
            AbstractC43592JPx.A1G(view, -1);
            relativeLayout2.removeView(c52832NZp2.A00);
            c52832NZp2.A00 = view;
        }
    }
}
