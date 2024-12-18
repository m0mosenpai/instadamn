package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.avatars.pokes.PokeReceiverView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class LO5 implements GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ C26069Bfx A00;
    public final /* synthetic */ PokeReceiverView A01;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public LO5(C26069Bfx c26069Bfx, PokeReceiverView pokeReceiverView) {
        this.A01 = pokeReceiverView;
        this.A00 = c26069Bfx;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i;
        PokeReceiverView pokeReceiverView = this.A01;
        AtomicBoolean atomicBoolean = pokeReceiverView.A09;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            View view = pokeReceiverView.A03;
            if (view != null) {
                pokeReceiverView.removeView(view);
            }
            AbstractC25229BEm.A1R(pokeReceiverView.A06);
            C5SW c5sw = pokeReceiverView.A04;
            if (c5sw != null) {
                c5sw.A08(true);
            }
            C44518JmO c44518JmO = pokeReceiverView.A01;
            if (c44518JmO != null) {
                String str = this.A00.A01;
                C50120MBu.A01(c44518JmO, str, AbstractC37302Gc3.A08(c44518JmO, str), 12);
            }
            C26069Bfx c26069Bfx = this.A00;
            UserSession userSession = pokeReceiverView.A02;
            if (userSession != null) {
                L62 l62 = pokeReceiverView.A08;
                MHV mhv = new MHV(38, c26069Bfx, pokeReceiverView);
                Context context = l62.A00;
                IgImageView igImageView = new IgImageView(context);
                C74P A00 = l62.A00(userSession, R.drawable.nudges_nudgeback);
                A00.A0I = mhv;
                A00.A0A(1);
                igImageView.setImageDrawable(A00);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(JQ0.A06(context), JQ0.A06(context));
                Resources resources = context.getResources();
                if (resources != null) {
                    i = resources.getDimensionPixelSize(R.dimen.action_button_settings_height);
                } else {
                    i = 0;
                }
                layoutParams.setMargins(0, 0, 0, -(i / 2));
                igImageView.setAlpha(0.0f);
                igImageView.setLayoutParams(layoutParams);
                igImageView.setElevation(1.0f);
                pokeReceiverView.addView(igImageView, 0);
                AbstractC125325le A0E = AbstractC43592JPx.A0o(igImageView, 0).A0E(C55942hf.A03(2.0d, 1.0d));
                A0E.A0I(1.0f);
                A0E.A0H();
            }
        }
        return true;
    }
}
