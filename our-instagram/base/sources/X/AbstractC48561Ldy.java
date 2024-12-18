package X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ldy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC48561Ldy implements InterfaceC57142jp {
    public View A00;
    public final int A01;
    public final View A02;

    @Override // X.InterfaceC57142jp
    public final void Ao7(Rect rect) {
        C14360o3.A0B(rect, 0);
        View view = this.A00;
        if (view == null) {
            view = this.A02.findViewById(R.id.carousel_viewpager);
            this.A00 = view;
            if (view == null) {
                return;
            }
        }
        view.getGlobalVisibleRect(rect);
        int i = this.A01;
        if (this instanceof KXQ) {
            rect.left = ((KXQ) this).A00 - i;
        } else {
            rect.right = i;
        }
    }

    public AbstractC48561Ldy(View view, UserSession userSession) {
        this.A02 = view;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A01 = AbstractC13690mv.A01(AbstractC166997dE.A0L(view), (int) ((C18U.A01(c06090Tz, userSession, 36612143772670313L) / Math.max(C18U.A01(c06090Tz, userSession, 36612143772735850L), 1L)) + C18U.A01(c06090Tz, userSession, 36612143772604776L) + 1));
    }
}
