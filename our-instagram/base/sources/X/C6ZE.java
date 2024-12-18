package X;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.reels.MultiProductSticker;
import java.util.List;

/* renamed from: X.6ZE, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6ZE {
    public static final void A00(UserSession userSession, C41181vS c41181vS, C144386fK c144386fK, InterfaceC145626hL interfaceC145626hL) {
        C221049pS c221049pS;
        int A01;
        int i;
        C14360o3.A0B(c144386fK, 0);
        C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A0q, c41181vS.A0c());
        if (A00 != null) {
            MultiProductSticker multiProductSticker = A00.A0o;
            if (multiProductSticker != null) {
                List list = multiProductSticker.A09;
                if (list != null) {
                    Context context = c144386fK.A01;
                    C14360o3.A06(context);
                    String A002 = I40.A00(multiProductSticker);
                    List A03 = AbstractC38048Gob.A03(list);
                    int A02 = AbstractC84863qa.A02(context);
                    if (C143726eF.A0C(context)) {
                        A01 = (int) (A02 * 0.5625f);
                    } else {
                        A01 = AbstractC13890nF.A01(context);
                    }
                    if (c41181vS.CdW()) {
                        A01 -= context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) * 2;
                    }
                    c221049pS = new C221049pS(context, A002, A03, A01, c41181vS.CdW());
                    String str = multiProductSticker.A07;
                    if (str != null) {
                        i = Color.parseColor(str);
                    } else {
                        i = -1;
                    }
                    c221049pS.A01(multiProductSticker.A03, i);
                    C9SA c9sa = c221049pS.A00;
                    c9sa.A02 = i;
                    c9sa.invalidateSelf();
                    c221049pS.setTextFormat(AbstractC190898cl.A00(multiProductSticker.A04));
                } else {
                    c221049pS = null;
                }
                InterfaceC09390do interfaceC09390do = c144386fK.A04;
                ImageView imageView = (ImageView) interfaceC09390do.getValue();
                imageView.setImageDrawable(c221049pS);
                imageView.setFocusable(true);
                imageView.setVisibility(0);
                imageView.requestLayout();
                AbstractC13880nE.A0r(imageView, new RunnableC24805AyR(c41181vS, A00, c144386fK));
                ImageView imageView2 = (ImageView) interfaceC09390do.getValue();
                if (c41181vS.CdW() && c221049pS != null) {
                    C0fQ.A00(new ASV(imageView2, A00, c221049pS, c144386fK, interfaceC145626hL), imageView2);
                }
                if (!c41181vS.CdW() && c221049pS != null && C18U.A06(C06090Tz.A05, userSession, 36312174668940262L)) {
                    C120435cm c120435cm = c144386fK.A00;
                    if (c120435cm == null) {
                        c120435cm = new C120435cm(userSession);
                        c144386fK.A00 = c120435cm;
                    }
                    c120435cm.A00(null);
                    return;
                }
                return;
            }
            return;
        }
        c144386fK.A03.setVisibility(8);
    }
}
