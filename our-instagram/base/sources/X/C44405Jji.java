package X;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Jji, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44405Jji extends GestureDetector.SimpleOnGestureListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C44405Jji(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj5;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (1 - this.A00 != 0) {
            return super.onDoubleTap(motionEvent);
        }
        C158677Ad c158677Ad = (C158677Ad) this.A05;
        new C158667Ac(c158677Ad.A01, c158677Ad.A02, new C7Q7((InterfaceC165247aD) c158677Ad.A03)).DBb((C129535tI) this.A03, (C158697Af) this.A04);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (2 - this.A00 == 0) {
            C14360o3.A0B(motionEvent, 0);
            ((ViewOnTouchListenerC48078LQd) this.A05).A00 = false;
            AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A04;
            C141596ac c141596ac = (C141596ac) this.A03;
            View view = (View) this.A01;
            View view2 = (View) this.A02;
            if (view2 != null) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, abstractC12990ll, 36324204870119395L)) {
                    int A07 = AbstractC25225BEi.A07(c06090Tz, abstractC12990ll, 36605679846757705L);
                    if (c141596ac.A0O > 0.0d && (c141596ac.A0D > 0 || SystemClock.uptimeMillis() - r2 >= A07)) {
                        return true;
                    }
                    Rect A0U = AbstractC166987dD.A0U();
                    view.getHitRect(A0U);
                    Rect A0U2 = AbstractC166987dD.A0U();
                    view2.getHitRect(A0U2);
                    int i = A0U.left - A0U2.left;
                    int i2 = A0U.top - A0U2.top;
                    return AbstractC43594JPz.A1V(AbstractC166987dD.A0V(i, i2, A0U.width() + i, A0U.height() + i2), motionEvent);
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                if (AbstractC166987dD.A1a(((C51762Yz) this.A01).A03)) {
                    return;
                }
                BRG brg = (BRG) this.A05;
                BRG.A04((C77123cy) ((C37838Gks) this.A02).A05, (C76223bS) this.A04, (C51762Yz) this.A03, brg);
                return;
            case 2:
                C14360o3.A0B(motionEvent, 0);
                ((ViewOnTouchListenerC48078LQd) this.A05).A00 = true;
            case 1:
            default:
                super.onLongPress(motionEvent);
                return;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                BRG brg = (BRG) this.A05;
                BRG.A05((C76223bS) this.A04, brg.A03, brg);
                return true;
            case 1:
                C158677Ad c158677Ad = (C158677Ad) this.A05;
                UserSession userSession = c158677Ad.A02;
                InterfaceC11380iw interfaceC11380iw = c158677Ad.A01;
                AbstractC129515tG abstractC129515tG = (AbstractC129515tG) this.A03;
                AbstractC43821JZj.A00(interfaceC11380iw, userSession, null, "selfie_thumbnail_xma", "tap", "direct_thread", null, AbstractC06930Yk.A02(AbstractC166987dD.A1L("viewer_is_sender", String.valueOf(abstractC129515tG.CVC()))));
                InterfaceC164957Zk interfaceC164957Zk = (InterfaceC164957Zk) c158677Ad.A03;
                List A1J = AbstractC166987dD.A1J(this.A01);
                View view = (View) this.A02;
                interfaceC164957Zk.CrH(view, JQ0.A0U(view), C05F.A00, A1J, 0, abstractC129515tG.BCt(), false);
                return true;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (2 - this.A00 != 0) {
            return super.onSingleTapUp(motionEvent);
        }
        C14360o3.A0B(motionEvent, 0);
        ViewOnTouchListenerC48078LQd viewOnTouchListenerC48078LQd = (ViewOnTouchListenerC48078LQd) this.A05;
        viewOnTouchListenerC48078LQd.A00 = false;
        viewOnTouchListenerC48078LQd.A04.invoke(motionEvent);
        return true;
    }
}
