package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Azu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24895Azu implements Runnable {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ C84823qW A03;
    public final /* synthetic */ InterfaceC41201vU A04;
    public final /* synthetic */ InterfaceC144766fw A05;
    public final /* synthetic */ C144526fY A06;

    public RunnableC24895Azu(InterfaceC11380iw interfaceC11380iw, UserSession userSession, ImageUrl imageUrl, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU, InterfaceC144766fw interfaceC144766fw, C144526fY c144526fY) {
        this.A04 = interfaceC41201vU;
        this.A06 = c144526fY;
        this.A02 = imageUrl;
        this.A00 = interfaceC11380iw;
        this.A05 = interfaceC144766fw;
        this.A01 = userSession;
        this.A03 = c84823qW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C144526fY c144526fY;
        int i;
        View view;
        InterfaceC41201vU interfaceC41201vU = this.A04;
        C38321qM BQN = interfaceC41201vU.BQN();
        if (BQN != null && BQN.A6N()) {
            c144526fY = this.A06;
            ImageUrl imageUrl = this.A02;
            InterfaceC11380iw interfaceC11380iw = this.A00;
            View view2 = c144526fY.A03;
            ViewGroup A01 = AbstractC124845kp.A01(view2);
            IgImageView igImageView = c144526fY.A07;
            AbstractC13880nE.A0g(igImageView, A01.getWidth());
            AbstractC13880nE.A0W(igImageView, A01.getHeight());
            igImageView.setUrl(imageUrl, interfaceC11380iw);
            igImageView.setAlpha(1.0f);
            i = 0;
            igImageView.setVisibility(0);
            InterfaceC144766fw interfaceC144766fw = this.A05;
            ViewGroup A012 = AbstractC124845kp.A01(view2);
            Context context = A012.getContext();
            float A00 = AbstractC84863qa.A00(context);
            C14360o3.A07(context);
            int A013 = (int) (A00 * AbstractC13890nF.A01(context));
            view = c144526fY.A02;
            AbstractC13880nE.A0g(view, A013);
            View view3 = c144526fY.A05;
            AbstractC13880nE.A0g(view3, A012.getWidth() - A013);
            AbstractC13880nE.A0W(view, A012.getHeight());
            AbstractC13880nE.A0W(view3, A012.getHeight());
            AbstractC13880nE.A0e(view3, A013);
            GestureDetector gestureDetector = new GestureDetector(view2.getContext(), new C9TH(1, interfaceC144766fw, c144526fY));
            view3.setOnTouchListener(new ViewOnTouchListenerC42056IkP(6, gestureDetector, interfaceC144766fw, c144526fY));
            view.setOnTouchListener(new ViewOnTouchListenerC42056IkP(7, gestureDetector, interfaceC144766fw, c144526fY));
            view3.setVisibility(0);
        } else {
            c144526fY = this.A06;
            i = 8;
            c144526fY.A07.setVisibility(8);
            c144526fY.A05.setVisibility(8);
            view = c144526fY.A02;
        }
        view.setVisibility(i);
        UserSession userSession = this.A01;
        C84823qW c84823qW = this.A03;
        ViewGroup A014 = AbstractC124845kp.A01(c144526fY.A03);
        C138436Oz.A04(c144526fY.A04, c84823qW, interfaceC41201vU.Ack(userSession), A014.getWidth(), A014.getHeight(), true);
    }
}
