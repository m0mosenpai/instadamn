package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;

/* renamed from: X.J5y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43161J5y implements Runnable {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C41181vS A02;
    public final /* synthetic */ C64842wi A03;
    public final /* synthetic */ C64742wY A04;
    public final /* synthetic */ AlB A05;
    public final /* synthetic */ C84823qW A06;
    public final /* synthetic */ C141596ac A07;
    public final /* synthetic */ C144186f0 A08;
    public final /* synthetic */ InterfaceC144756fv A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    public RunnableC43161J5y(ImageView imageView, UserSession userSession, C41181vS c41181vS, C64842wi c64842wi, C64742wY c64742wY, AlB alB, C84823qW c84823qW, C141596ac c141596ac, C144186f0 c144186f0, InterfaceC144756fv interfaceC144756fv, String str, boolean z) {
        this.A08 = c144186f0;
        this.A02 = c41181vS;
        this.A06 = c84823qW;
        this.A0B = z;
        this.A07 = c141596ac;
        this.A00 = imageView;
        this.A05 = alB;
        this.A09 = interfaceC144756fv;
        this.A01 = userSession;
        this.A0A = str;
        this.A03 = c64842wi;
        this.A04 = c64742wY;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C144186f0 c144186f0 = this.A08;
        C41181vS c41181vS = this.A02;
        C84823qW c84823qW = this.A06;
        ImageView imageView = c144186f0.A01;
        if (imageView != null) {
            ViewGroup viewGroup = c144186f0.A00;
            if (viewGroup != null) {
                int width = viewGroup.getWidth();
                ViewGroup viewGroup2 = c144186f0.A00;
                C14360o3.A0A(viewGroup2);
                C138436Oz.A04(imageView, c84823qW, c41181vS.A00(), width, viewGroup2.getHeight(), true);
                if (!this.A0B && this.A07.A18) {
                    ImageView imageView2 = this.A00;
                    AlB alB = this.A05;
                    InterfaceC144756fv interfaceC144756fv = this.A09;
                    UserSession userSession = this.A01;
                    String str = this.A0A;
                    C64842wi c64842wi = this.A03;
                    C64742wY c64742wY = this.A04;
                    C19270xB A0D = AbstractC31171DnF.A0D(str);
                    String str2 = alB.A00.A08;
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(A0D, userSession), AbstractC111324zv.A00(2488));
                    A0f.A9K("sticker_id", AbstractC25228BEl.A13(str2));
                    A0f.AAP("source_name", "STORY");
                    A0f.A8R(EnumC72419XdP.IG_STICKER_FOR_CHARITY, "fundraiser_type");
                    A0f.Cht();
                    if (c64842wi != null && c64742wY != null) {
                        c64742wY.A00(imageView2, QPTooltipAnchor.A0S, c64842wi);
                    }
                    interfaceC144756fv.Dok(imageView2, c41181vS, c84823qW);
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
