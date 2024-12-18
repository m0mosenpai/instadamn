package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3ty, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86863ty implements InterfaceC86813tt {
    public final UserSession A00;
    public final C86143sl A01;
    public final C86853tx A02;
    public final C75113Zb A03;
    public final Runnable A04;

    public C86863ty(UserSession userSession, C86143sl c86143sl, C86853tx c86853tx, C75113Zb c75113Zb) {
        C14360o3.A0B(c86143sl, 2);
        C14360o3.A0B(c86853tx, 3);
        this.A00 = userSession;
        this.A01 = c86143sl;
        this.A02 = c86853tx;
        this.A03 = c75113Zb;
        this.A04 = new Runnable() { // from class: X.3tz
            @Override // java.lang.Runnable
            public final void run() {
                C86863ty.A01(C86863ty.this);
            }
        };
    }

    public static final void A00(View view) {
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setStartDelay(200L).setDuration(400L);
    }

    @Override // X.InterfaceC86813tt
    public final void ABN() {
    }

    @Override // X.InterfaceC86813tt
    public final void Ekx() {
        C86143sl c86143sl = this.A01;
        InterfaceC56392iX interfaceC56392iX = c86143sl.A05;
        if (interfaceC56392iX != null) {
            C75113Zb c75113Zb = this.A03;
            c75113Zb.A0L(c86143sl, null, false);
            c75113Zb.A0g(true);
            c75113Zb.A0K(EnumC75203Zn.A06);
            Runnable runnable = this.A04;
            C14360o3.A0B(runnable, 0);
            c86143sl.A03 = runnable;
            View view = interfaceC56392iX.getView();
            View findViewById = view.findViewById(R.id.feed_end_scene_backdrop);
            findViewById.setAlpha(0.0f);
            findViewById.animate().alpha(1.0f).setDuration(300L);
            View findViewById2 = view.findViewById(R.id.feed_end_scene_content_group);
            findViewById2.setAlpha(0.0f);
            ViewPropertyAnimator alpha = findViewById2.animate().alpha(1.0f);
            C14360o3.A07(alpha);
            alpha.setStartDelay(300L);
            alpha.setDuration(300L);
            interfaceC56392iX.setVisibility(0);
            TextView textView = c86143sl.A02;
            if (textView != null) {
                A00(textView);
            }
            ViewGroup viewGroup = c86143sl.A00;
            TextView textView2 = c86143sl.A01;
            if (textView2 != null) {
                textView2.setText(this.A02.A02);
            }
            if (viewGroup != null) {
                A00(viewGroup);
            }
            C86853tx c86853tx = this.A02;
            if (!c86853tx.A03) {
                C0fQ.A00(new ViewOnClickListenerC23215AQz(this), findViewById);
            } else {
                findViewById.setOnTouchListener(new ATI(this));
            }
            if (viewGroup != null) {
                C0fQ.A00(new ViewOnClickListenerC77633dn(this.A00, null, C43188J7l.A00, new C206849Dp(this, 30), true), viewGroup);
            }
            ((InterfaceC16820sZ) c86853tx.A01.A01).invoke();
            view.invalidate();
            if (c86853tx.A04 && c75113Zb.A22) {
                c86143sl.A04.postDelayed(runnable, (long) (c86853tx.A00 * 1000.0d));
            }
        }
    }

    @Override // X.InterfaceC86813tt
    public final void hide() {
        C75113Zb c75113Zb = this.A03;
        if (false != c75113Zb.A25) {
            c75113Zb.A25 = false;
        }
        InterfaceC56392iX interfaceC56392iX = this.A01.A05;
        if (interfaceC56392iX != null) {
            c75113Zb.A0g(false);
            interfaceC56392iX.setVisibility(8);
        }
    }

    public static final void A01(C86863ty c86863ty) {
        c86863ty.hide();
        c86863ty.A03.A0K(EnumC75203Zn.A04);
        ((InterfaceC16820sZ) c86863ty.A02.A01.A02).invoke();
    }
}
