package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* loaded from: classes5.dex */
public final class D2C implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C29290Cvl A02;

    public D2C(UserSession userSession, C38321qM c38321qM, C29290Cvl c29290Cvl) {
        this.A02 = c29290Cvl;
        this.A00 = userSession;
        this.A01 = c38321qM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C29290Cvl c29290Cvl = this.A02;
        View view = c29290Cvl.A02;
        int width = view.getWidth();
        int height = view.getHeight();
        UserSession userSession = this.A00;
        C38321qM c38321qM = this.A01;
        int i = width;
        int i2 = height;
        double A0m = c38321qM.A0m();
        C06090Tz c06090Tz = C06090Tz.A06;
        if (A0m <= C18U.A00(c06090Tz, userSession, 37157299686473776L)) {
            if (!C18U.A06(c06090Tz, userSession, 36312874756539871L) && !C18U.A06(c06090Tz, userSession, 36312874756474334L)) {
                i = (int) (width * 0.8d);
            }
        } else if (c38321qM.A0m() >= C18U.A00(c06090Tz, userSession, 37157299683328047L)) {
            i2 = (int) (height / c38321qM.A0m());
        }
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        if (width != intValue || height != intValue2) {
            IgImageView igImageView = c29290Cvl.A0P;
            ViewGroup.LayoutParams layoutParams = igImageView.getLayoutParams();
            String A00 = MSV.A00(524);
            if (layoutParams != null) {
                layoutParams.width = intValue;
                layoutParams.height = intValue2;
                igImageView.setLayoutParams(layoutParams);
                SimpleVideoLayout simpleVideoLayout = c29290Cvl.A0U;
                ViewGroup.LayoutParams layoutParams2 = simpleVideoLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = intValue;
                    layoutParams2.height = intValue2;
                    simpleVideoLayout.setLayoutParams(layoutParams2);
                    return;
                }
                throw AbstractC166987dD.A15(A00);
            }
            throw AbstractC166987dD.A15(A00);
        }
    }
}
