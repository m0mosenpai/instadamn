package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.39V, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39V implements InterfaceC13280mE {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final boolean A02;
    public final Activity A03;
    public final Context A04;

    public C39V(Activity activity, Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, boolean z) {
        C14360o3.A0B(context, 2);
        C14360o3.A0B(userSession, 3);
        this.A03 = activity;
        this.A04 = context;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = z;
    }

    public final void A01(final C9C3 c9c3, C3QT c3qt, C75113Zb c75113Zb) {
        C14360o3.A0B(c3qt, 0);
        C14360o3.A0B(c75113Zb, 2);
        C206259Bi c206259Bi = (C206259Bi) c9c3.A00;
        ((InterfaceC16660sJ) c206259Bi.A04).invoke(c3qt.A02);
        ((InterfaceC16660sJ) c206259Bi.A03).invoke(c3qt);
        c3qt.A01 = c9c3;
        c3qt.A02 = c75113Zb;
        View view = c3qt.A06;
        if (view.getLayoutParams() != null) {
            AbstractC13880nE.A0W(view, -2);
        }
        if (!((Boolean) ((InterfaceC16660sJ) c206259Bi.A01).invoke(this.A00)).booleanValue() && c9c3.A02) {
            if (c3qt.A00 == null) {
                ViewStub viewStub = c3qt.A07;
                if (viewStub != null) {
                    viewStub.inflate();
                }
                c3qt.A00();
            }
            ViewGroup viewGroup = c3qt.A00;
            if (viewGroup != null) {
                C0fQ.A00(new View.OnClickListener() { // from class: X.9Ji
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int A05 = C0f9.A05(-2000983384);
                        AbstractC166987dD.A1Y(((C206259Bi) C9C3.this.A00).A02);
                        C0f9.A0C(-2117158622, A05);
                    }
                }, viewGroup);
            }
            ViewGroup viewGroup2 = c3qt.A00;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
                return;
            }
            return;
        }
        ViewGroup viewGroup3 = c3qt.A00;
        if (viewGroup3 == null) {
            return;
        }
        viewGroup3.setVisibility(8);
    }

    public final View A00(ViewGroup viewGroup) {
        View inflate;
        Activity activity = this.A03;
        if (activity != null) {
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            C14360o3.A07(layoutInflater);
            inflate = C50802Vb.A00(layoutInflater, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.row_feed_inline_composer_button, 0, false, true);
        } else {
            inflate = LayoutInflater.from(this.A04).inflate(R.layout.row_feed_inline_composer_button, viewGroup, false);
        }
        C14360o3.A0A(inflate);
        inflate.setTag(new C3QT(inflate, this.A00, this.A01, this.A02));
        return inflate;
    }
}
