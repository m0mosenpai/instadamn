package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7SE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SE implements C7QD {
    public final InterfaceC165507ad A00;
    public final UserSession A01;
    public final C57012jc A02;

    public final void A01(C7BT c7bt) {
        C57012jc c57012jc = this.A02;
        c57012jc.A03(0);
        ImageView imageView = (ImageView) c57012jc.A01();
        imageView.setBackgroundColor(c7bt.A00);
        imageView.setImageTintList(ColorStateList.valueOf(c7bt.A01));
        C0fQ.A00(new ViewOnClickListenerC48034LOg(this, c7bt), imageView);
    }

    public final void A00() {
        C57012jc c57012jc = this.A02;
        c57012jc.A03(8);
        if (!C18U.A06(C06090Tz.A05, this.A01, 36324612892340504L) || c57012jc.A00 != null) {
            c57012jc.A01().setOnClickListener(null);
        }
    }

    @Override // X.C7QD
    public final View BKF() {
        View view;
        C57012jc c57012jc = this.A02;
        if (c57012jc.A00 != null) {
            view = c57012jc.A01();
        } else {
            view = c57012jc.A01;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C7SE(UserSession userSession, C57012jc c57012jc, InterfaceC165507ad interfaceC165507ad) {
        this.A02 = c57012jc;
        this.A00 = interfaceC165507ad;
        this.A01 = userSession;
    }
}
