package X;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.user.model.ProductCollection;

/* renamed from: X.6ZF, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6ZF {
    public static final void A00(C41181vS c41181vS, InterfaceC144866g6 interfaceC144866g6, C144396fL c144396fL) {
        int i;
        C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A0z, c41181vS.A0c());
        if (A00 == null) {
            c144396fL.A02.setVisibility(8);
            return;
        }
        C38820H7m c38820H7m = A00.A0p;
        if (c38820H7m != null) {
            if (!"seller_collection_reshare_sticker".equals(I45.A00(c38820H7m))) {
                IgFrameLayout igFrameLayout = c144396fL.A02;
                ImageView imageView = c144396fL.A01;
                ProductCollection productCollection = c38820H7m.A02;
                if (productCollection != null) {
                    String str = c38820H7m.A09;
                    if (str != null) {
                        i = Color.parseColor(str);
                    } else {
                        i = -1;
                    }
                    Context context = igFrameLayout.getContext();
                    C14360o3.A07(context);
                    C221059pT c221059pT = new C221059pT(context, productCollection, I45.A00(c38820H7m));
                    c221059pT.A00(i);
                    C9SA c9sa = c221059pT.A00;
                    c9sa.A02 = i;
                    c9sa.invalidateSelf();
                    c221059pT.setTextFormat(AbstractC190898cl.A00(c38820H7m.A07));
                    imageView.setImageDrawable(c221059pT);
                    imageView.setContentDescription(context.getString(2131974027, productCollection.getTitle()));
                    igFrameLayout.setFocusable(true);
                    igFrameLayout.setVisibility(0);
                }
            }
            IgFrameLayout igFrameLayout2 = c144396fL.A02;
            igFrameLayout2.requestLayout();
            AbstractC13880nE.A0r(igFrameLayout2, new RunnableC24873AzY(igFrameLayout2, c41181vS, A00, interfaceC144866g6, c144396fL));
            return;
        }
        throw new IllegalStateException("product collection sticker expected");
    }
}
