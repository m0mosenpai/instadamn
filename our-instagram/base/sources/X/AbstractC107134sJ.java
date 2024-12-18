package X;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.4sJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC107134sJ {
    public static final void A00(Drawable drawable, final C9C1 c9c1, UserSession userSession, C81283jy c81283jy, final C107124sI c107124sI, C75113Zb c75113Zb, final String str, int i) {
        C14360o3.A0B(c9c1, 2);
        C14360o3.A0B(c107124sI, 3);
        C14360o3.A0B(str, 7);
        InterfaceC56392iX interfaceC56392iX = c81283jy.A0N;
        ImageView imageView = (ImageView) interfaceC56392iX.getView();
        c81283jy.A0I.setVisibility(8);
        imageView.setOnClickListener(null);
        interfaceC56392iX.setVisibility(0);
        AbstractC77703du.A05(imageView, EnumC77673dr.A0Q);
        imageView.setImageDrawable(drawable);
        C0fQ.A00(new ViewOnClickListenerC77633dn(userSession, null, new C9F4(35, c75113Zb, c9c1), new C9FT(i, 3, c9c1, c107124sI, c75113Zb), true), imageView);
        imageView.setOnTouchListener(new View.OnTouchListener() { // from class: X.4sK
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                View.OnTouchListener DuE;
                C14360o3.A0B(motionEvent, 1);
                if (motionEvent.getAction() == 0) {
                    C107124sI c107124sI2 = c107124sI;
                    C9C1 c9c12 = c9c1;
                    String str2 = str;
                    C100564fL c100564fL = c107124sI2.A00;
                    String str3 = c9c12.A02;
                    if (str3 != null && (DuE = c100564fL.A00.DuE((C38321qM) c9c12.A01, str3, str2)) != null) {
                        return DuE.onTouch(view, motionEvent);
                    }
                    return false;
                }
                return false;
            }
        });
    }
}
