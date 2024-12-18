package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Im2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42154Im2 implements InterfaceC58109PpY {
    public final /* synthetic */ C38334GtU A00;

    @Override // X.InterfaceC58109PpY
    public final void DiE(Activity activity) {
        C38334GtU c38334GtU = this.A00;
        C40997IDs c40997IDs = c38334GtU.A01;
        if (c40997IDs != null) {
            C42276Io0 c42276Io0 = c40997IDs.A00;
            InterfaceC56392iX interfaceC56392iX = c42276Io0.A0F;
            if (interfaceC56392iX != null) {
                ((IgdsButton) interfaceC56392iX.getView()).setText(2131974361);
                InterfaceC56392iX interfaceC56392iX2 = c42276Io0.A0F;
                if (interfaceC56392iX2 != null) {
                    interfaceC56392iX2.getView().setOnClickListener(null);
                    InterfaceC56392iX interfaceC56392iX3 = c42276Io0.A0F;
                    if (interfaceC56392iX3 != null) {
                        interfaceC56392iX3.getView().setClickable(false);
                    }
                }
            }
            C14360o3.A0F("spotifyButtonByPlaybackStub");
            throw C00O.createAndThrow();
        }
        C38334GtU.A00(activity, c38334GtU, C05F.A00);
    }

    @Override // X.InterfaceC58109PpY
    public final void Dy1(Activity activity) {
        C38334GtU c38334GtU = this.A00;
        Context applicationContext = activity.getApplicationContext();
        C38904HBb c38904HBb = new C38904HBb();
        C189448aO A0y = AbstractC25225BEi.A0y(c38334GtU.A03);
        A0y.A0g = applicationContext.getResources().getString(2131974356);
        A0y.A1J = true;
        A0y.A0K = new ViewOnClickListenerC42034Ik3(6, activity, c38334GtU);
        A0y.A0h = applicationContext.getResources().getString(2131954754);
        C189478aR c189478aR = c38334GtU.A00;
        if (c189478aR != null) {
            AbstractC25225BEi.A1Q(A0y, false);
            A0y.A1G = true;
            A0y.A0L = ViewOnClickListenerC42032Ik1.A00(c38334GtU, 4);
            A0y.A1N = true;
            c189478aR.A0H(c38904HBb, A0y, true, true, false, true);
            return;
        }
        A0y.A0w = true;
        AbstractC31173DnH.A0w(activity, c38904HBb, A0y);
    }

    public C42154Im2(C38334GtU c38334GtU) {
        this.A00 = c38334GtU;
    }

    @Override // X.InterfaceC58109PpY
    public final void DiD(Activity activity) {
        C38334GtU.A00(activity, this.A00, C05F.A01);
    }
}
