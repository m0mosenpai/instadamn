package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ESK extends AbstractC168697g3 {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final ENQ A03;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(-2085550915);
        if (view == null) {
            view = AbstractC25227BEk.A0C(LayoutInflater.from(this.A00), R.layout.featured_user_header);
            view.setTag(new GF6(view));
        }
        Context context = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        GF6 gf6 = (GF6) AbstractC31172DnG.A0x(view);
        ED9 ed9 = (ED9) obj;
        UserSession userSession = this.A02;
        ENQ enq = this.A03;
        User user = ed9.A03;
        CircularImageView circularImageView = gf6.A0B;
        AbstractC31173DnH.A1T(interfaceC11380iw, circularImageView, user);
        AbstractC31173DnH.A1F(gf6.A08, user);
        String fullName = user.getFullName();
        boolean isEmpty = TextUtils.isEmpty(fullName);
        TextView textView = gf6.A06;
        if (isEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(fullName);
        }
        gf6.A07.setText(user.A03.Bhe());
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = gf6.A0D.A0J;
        viewOnAttachStateChangeListenerC110564yT.A08(new C33272EnT(1, context, userSession, gf6, enq));
        viewOnAttachStateChangeListenerC110564yT.A04(interfaceC11380iw, userSession, user);
        ViewOnClickListenerC35687FpM.A00(gf6.A09, 69, enq, user);
        C1567071s c1567071s = ed9.A02;
        Reel reel = ed9.A01;
        if (reel == null && c1567071s != null && c1567071s.A00() != null) {
            reel = C1OU.A04(userSession).A0I(c1567071s.A00(), false);
            ed9.A01 = reel;
        }
        if (ed9.A04.booleanValue() && reel != null && (!reel.A15(userSession) || !reel.A0z(userSession))) {
            gf6.A03 = reel.getId();
            boolean A16 = reel.A16(userSession);
            GradientSpinner gradientSpinner = gf6.A0C;
            if (A16) {
                gradientSpinner.A04();
            } else {
                gradientSpinner.A02();
            }
            gradientSpinner.setVisibility(0);
            circularImageView.setClickable(false);
            gf6.A05.setOnTouchListener(gf6.A0A);
        } else {
            gf6.A03 = null;
            gf6.A0C.setVisibility(4);
            gf6.A05.setOnTouchListener(null);
        }
        gf6.A0A.A02();
        C140626Xq c140626Xq = gf6.A01;
        if (c140626Xq != null) {
            c140626Xq.A05(C05F.A0C);
            gf6.A01 = null;
        }
        gf6.A02 = new C34533FJt(gf6, enq);
        C0f9.A0A(1313919961, A03);
        return view;
    }

    public ESK(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ENQ enq) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = enq;
    }
}
