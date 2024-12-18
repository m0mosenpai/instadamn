package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;

/* loaded from: classes5.dex */
public final class D2Y implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ IgImageView A04;
    public final /* synthetic */ InterfaceC56392iX A05;
    public final /* synthetic */ Reel A06;
    public final /* synthetic */ C54606OAh A07;
    public final /* synthetic */ C72943Ou A08;
    public final /* synthetic */ InterfaceC64002vL A09;
    public final /* synthetic */ boolean A0A;

    public D2Y(View view, ImageView imageView, InterfaceC11380iw interfaceC11380iw, UserSession userSession, IgImageView igImageView, InterfaceC56392iX interfaceC56392iX, Reel reel, C54606OAh c54606OAh, C72943Ou c72943Ou, InterfaceC64002vL interfaceC64002vL, boolean z) {
        this.A08 = c72943Ou;
        this.A01 = imageView;
        this.A00 = view;
        this.A04 = igImageView;
        this.A06 = reel;
        this.A03 = userSession;
        this.A09 = interfaceC64002vL;
        this.A02 = interfaceC11380iw;
        this.A05 = interfaceC56392iX;
        this.A07 = c54606OAh;
        this.A0A = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView A04 = this.A08.A02.A05.A04();
        CharSequence text = A04.getText();
        View view = this.A00;
        Reel reel = this.A06;
        UserSession userSession = this.A03;
        InterfaceC64002vL interfaceC64002vL = this.A09;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        InterfaceC56392iX interfaceC56392iX = this.A05;
        C29376Cx9 c29376Cx9 = new C29376Cx9(view, interfaceC11380iw, userSession, interfaceC56392iX, reel, interfaceC64002vL);
        ImageView imageView = this.A01;
        IgImageView igImageView = this.A04;
        C57536PgA c57536PgA = new C57536PgA(11, interfaceC56392iX, igImageView);
        C57536PgA c57536PgA2 = new C57536PgA(12, this.A07, A04);
        imageView.postDelayed(new RunnableC71635Wxh(imageView, view, C29377CxA.A00, c29376Cx9, MSV.A00(577), c57536PgA, c57536PgA2, C29811DDd.A00), 2000L);
        igImageView.postDelayed(new RunnableC71577WwU(igImageView, new C57527Pg1(igImageView, 21), new BUN(2, userSession, interfaceC56392iX, imageView, A04, text, view, this.A0A)), 2400L);
    }
}
