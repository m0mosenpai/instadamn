package X;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import com.instagram.model.shopping.reels.ProductSticker;
import com.instagram.user.model.Product;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I65 {
    public static final void A00(C38321qM c38321qM, C41066IGj c41066IGj) {
        C84823qW c84823qW;
        ImageView imageView;
        C14360o3.A0B(c41066IGj, 0);
        List A3w = c38321qM.A3w(EnumC75383a5.A0y);
        if (A3w != null && !A3w.isEmpty()) {
            c84823qW = (C84823qW) A3w.get(0);
        } else {
            c84823qW = null;
        }
        if (c84823qW == null) {
            imageView = c41066IGj.A02;
            if (imageView == null) {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            Context context = c41066IGj.A00;
            String A0J = c84823qW.A0J();
            if (A0J != null && c84823qW.A0H().A0J != null) {
                C221099pX c221099pX = new C221099pX(context, A0J);
                Product A0H = c84823qW.A0H();
                String A0K = c84823qW.A0K();
                ProductSticker productSticker = c84823qW.A0r;
                productSticker.getClass();
                String str = productSticker.A0D;
                int i = -1;
                if (str != null) {
                    try {
                        i = Color.parseColor(str);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                c221099pX.A03(A0H, A0K, i, false);
                Method method = c221099pX.getClass().getMethod("setTextFormat", C190888ck.class);
                ProductSticker productSticker2 = c84823qW.A0r;
                productSticker2.getClass();
                method.invoke(c221099pX, AbstractC190898cl.A00(productSticker2.A0B));
                ImageView imageView2 = c41066IGj.A02;
                if (imageView2 != null) {
                    imageView2.setImageDrawable(c221099pX);
                    imageView2.setVisibility(0);
                    View view = c41066IGj.A01;
                    if (view != null) {
                        AbstractC13880nE.A0r(view, new J5R(c38321qM, c84823qW, c41066IGj));
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            imageView = c41066IGj.A02;
            if (imageView == null) {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        imageView.setVisibility(8);
    }
}
