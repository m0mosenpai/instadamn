package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;

/* renamed from: X.6am, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC141696am {
    public static void A00(UserSession userSession, final C41181vS c41181vS, ReelViewerConfig reelViewerConfig, final InterfaceC144786fy interfaceC144786fy, final C144176ez c144176ez, String str) {
        final AlC alC;
        View.OnClickListener onClickListener;
        final C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A0O, c41181vS.A0c());
        if (!AbstractC25351Lp.A00(userSession).A01() && c144176ez.A01 == null) {
            ImageView imageView = (ImageView) c144176ez.A02.getView();
            c144176ez.A01 = imageView;
            c144176ez.A00 = (ViewGroup) imageView.getParent();
        }
        if (A00 == null) {
            c144176ez.A02.setVisibility(8);
            return;
        }
        if (AbstractC25351Lp.A00(userSession).A01() && c144176ez.A01 == null) {
            ImageView imageView2 = (ImageView) c144176ez.A02.getView();
            c144176ez.A01 = imageView2;
            c144176ez.A00 = (ViewGroup) imageView2.getParent();
        }
        c144176ez.A02.setVisibility(0);
        c144176ez.A01.getClass();
        URL url = A00.A0R;
        if (url == null) {
            alC = null;
        } else {
            alC = new AlC(url, AlC.A03);
        }
        alC.getClass();
        C220919pF c220919pF = new C220919pF(c144176ez.A01.getContext(), userSession, alC, str, true);
        c220919pF.A01.A09.A04 = true;
        c144176ez.A01.setImageDrawable(c220919pF);
        boolean z = reelViewerConfig.A06;
        ImageView imageView3 = c144176ez.A01;
        if (!z) {
            onClickListener = new View.OnClickListener() { // from class: X.IiY
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    interfaceC144786fy.D7u(c41181vS, alC);
                }
            };
        } else {
            onClickListener = null;
        }
        C0fQ.A00(onClickListener, imageView3);
        AbstractC13880nE.A0r(c144176ez.A01, new Runnable() { // from class: X.J5l
            @Override // java.lang.Runnable
            public final void run() {
                C144176ez c144176ez2 = c144176ez;
                C41181vS c41181vS2 = c41181vS;
                C84823qW c84823qW = A00;
                InterfaceC144786fy interfaceC144786fy2 = interfaceC144786fy;
                c144176ez2.A01.getClass();
                c144176ez2.A00.getClass();
                ImageView imageView4 = c144176ez2.A01;
                int width = c144176ez2.A00.getWidth();
                int height = c144176ez2.A00.getHeight();
                float A002 = c41181vS2.A00();
                C138436Oz c138436Oz = C138436Oz.A00;
                C14360o3.A0B(imageView4, 0);
                C138436Oz.A04(imageView4, c84823qW, A002, width, height, true);
                ImageView imageView5 = c144176ez2.A01;
                imageView5.getClass();
                interfaceC144786fy2.Dok(imageView5, c41181vS2, c84823qW);
            }
        });
    }
}
