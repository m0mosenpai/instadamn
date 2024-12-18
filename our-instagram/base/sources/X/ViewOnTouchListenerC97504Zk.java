package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.4Zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnTouchListenerC97504Zk implements View.OnTouchListener {
    public ChoreographerFrameCallbackC66315U8o A00;
    public V9X A01;
    public final Context A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final TouchInterceptorFrameLayout A06;

    public ViewOnTouchListenerC97504Zk(View view) {
        View requireViewById;
        C14360o3.A0B(view, 1);
        Context context = view.getContext();
        C14360o3.A07(context);
        this.A02 = context;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.slider_sticker_stub);
        if (viewStub == null || (requireViewById = viewStub.inflate()) == null) {
            requireViewById = view.requireViewById(R.id.slider_sticker_root);
            C14360o3.A07(requireViewById);
        }
        this.A03 = requireViewById;
        View requireViewById2 = requireViewById.requireViewById(R.id.slider_sticker_container);
        C14360o3.A07(requireViewById2);
        this.A06 = (TouchInterceptorFrameLayout) requireViewById2;
        View requireViewById3 = requireViewById.requireViewById(R.id.slider_sticker);
        C14360o3.A07(requireViewById3);
        this.A05 = (ImageView) requireViewById3;
        View requireViewById4 = requireViewById.requireViewById(R.id.slider_particle_system);
        C14360o3.A07(requireViewById4);
        this.A04 = requireViewById4;
    }

    public final void A01(UserSession userSession, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU) {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A06;
        View view = this.A03;
        C138436Oz.A04(touchInterceptorFrameLayout, c84823qW, interfaceC41201vU.Ack(userSession), view.getWidth(), view.getHeight(), false);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A06;
        if (touchInterceptorFrameLayout.isEnabled() && motionEvent.getActionMasked() == 0) {
            touchInterceptorFrameLayout.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public final V9X A00() {
        V9X v9x = this.A01;
        if (v9x != null) {
            return v9x;
        }
        C14360o3.A0F("sliderStickerDrawable");
        throw C00O.createAndThrow();
    }
}
