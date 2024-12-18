package X;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import com.instagram.user.model.User;

/* renamed from: X.6ZG, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6ZG {
    public static final void A00(C41181vS c41181vS, C144406fM c144406fM) {
        int i;
        C14360o3.A0B(c144406fM, 0);
        C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A1F, c41181vS.A0c());
        if (A00 != null) {
            C38822H7p c38822H7p = A00.A0s;
            if (c38822H7p != null && !"storefront_reshare_sticker".equals(I4G.A00(c38822H7p))) {
                ImageView imageView = (ImageView) c144406fM.A03.getValue();
                Context context = c144406fM.A00;
                C14360o3.A06(context);
                String A002 = I4G.A00(c38822H7p);
                User user = c38822H7p.A00;
                if (user != null) {
                    C221109pY c221109pY = new C221109pY(context, user, A002);
                    String str = c38822H7p.A06;
                    if (str != null) {
                        i = Color.parseColor(str);
                    } else {
                        i = -1;
                    }
                    c221109pY.A00(c38822H7p.A03, i);
                    C9SA c9sa = c221109pY.A01;
                    c9sa.A02 = i;
                    c9sa.invalidateSelf();
                    c221109pY.setTextFormat(AbstractC190898cl.A00(c38822H7p.A04));
                    imageView.setImageDrawable(c221109pY);
                    imageView.setFocusable(true);
                    imageView.setVisibility(0);
                    imageView.requestLayout();
                    AbstractC13880nE.A0r(imageView, new RunnableC24806AyS(c41181vS, A00, c144406fM));
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        c144406fM.A02.setVisibility(8);
    }
}
