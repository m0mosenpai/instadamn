package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class D2P implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC56392iX A03;

    public D2P(View view, ImageView imageView, UserSession userSession, InterfaceC56392iX interfaceC56392iX) {
        this.A00 = view;
        this.A01 = imageView;
        this.A02 = userSession;
        this.A03 = interfaceC56392iX;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView = this.A01;
        C71048Wn3 c71048Wn3 = new C71048Wn3(imageView, 2);
        View view = this.A00;
        C57527Pg1 c57527Pg1 = new C57527Pg1(this.A02, 23);
        C57527Pg1 c57527Pg12 = new C57527Pg1(this.A03, 24);
        view.postDelayed(new RunnableC71635Wxh(view, imageView, C29377CxA.A00, c71048Wn3, "hide_memory_badge_animator_key", C29809DDb.A00, c57527Pg1, c57527Pg12), 0L);
    }
}
