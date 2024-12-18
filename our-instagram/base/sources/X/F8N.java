package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class F8N {
    public static final void A00(Context context, UserSession userSession, C57112jm c57112jm, InterfaceC1569372x interfaceC1569372x, E30 e30, C32077E8b c32077E8b, Integer num) {
        C14360o3.A0B(context, 0);
        AbstractC25233BEq.A0x(1, userSession, num, interfaceC1569372x);
        C51758Mth c51758Mth = c32077E8b.A00;
        TextView textView = e30.A01;
        textView.setTextAppearance(R.style.igds_emphasized_body_1);
        boolean z = c51758Mth.A01;
        int i = R.color.igds_bio_pill_text;
        if (z) {
            i = R.color.igds_bio_pill_active_text;
        }
        AbstractC166987dD.A1O(context, textView, i);
        InterfaceC37273GbQ interfaceC37273GbQ = (InterfaceC37273GbQ) c51758Mth.A00;
        String name = interfaceC37273GbQ.getName();
        if (name == null) {
            name = "";
        }
        A1C.A00(context, textView, name, interfaceC37273GbQ.getEmoji());
        e30.A02.setVisibility(8);
        View view = e30.A00;
        ViewOnClickListenerC31591DuJ.A00(view, 45, c51758Mth, interfaceC1569372x);
        view.setSelected(z);
        if (c57112jm != null) {
            C59072n8 A00 = C59062n7.A00(interfaceC37273GbQ, C0eB.A00, String.valueOf(interfaceC37273GbQ.B6s()));
            A00.A00(new C32674EZy(userSession, interfaceC1569372x));
            AbstractC25227BEk.A10(view, A00, c57112jm);
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC35718Fps(view, c51758Mth, interfaceC1569372x, e30, c32077E8b));
        if (num == C05F.A0C) {
            AbstractC13880nE.A0V(view, AbstractC166987dD.A0C(context, 8));
        }
    }
}
