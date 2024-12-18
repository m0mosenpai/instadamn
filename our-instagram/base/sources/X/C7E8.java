package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7E8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7E8 {
    public final UserSession A00;
    public final C7EA A01;
    public final C7DO A02;
    public final List A03;
    public final InterfaceC09390do A04;

    public /* synthetic */ C7E8(UserSession userSession) {
        C7EA c7ea = new C7EA(userSession, new C7E9(userSession));
        C7DO c7do = new C7DO(userSession, null, null, 2);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = c7ea;
        this.A02 = c7do;
        this.A03 = new ArrayList();
        this.A04 = AbstractC09440dt.A01(new C9EW(this, 31));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(X.InterfaceC11380iw r5, X.L5T r6, X.C158797Aq r7, X.InterfaceC08830cm r8) {
        /*
            r4 = this;
            r3 = 1
            X.7AS r2 = r7.A00
            r1 = 0
            if (r2 == 0) goto L18
            boolean r0 = r2 instanceof X.C7DA
            if (r0 == 0) goto L1c
            X.7S0 r0 = r6.A0C
        Lc:
            r0.A03(r5, r2)
        Lf:
            com.google.common.collect.ImmutableList r0 = r2.A02
            int r0 = r0.size()
            if (r0 <= 0) goto L18
            r1 = 1
        L18:
            A01(r6, r7, r8, r3)
            return r1
        L1c:
            boolean r0 = r2 instanceof X.C32869EdB
            if (r0 == 0) goto Lf
            X.EdD r0 = r6.A0B
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7E8.A02(X.0iw, X.L5T, X.7Aq, X.0cm):boolean");
    }

    public static final void A00(Activity activity, L5T l5t, C158797Aq c158797Aq, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, float f, boolean z) {
        int i;
        IgProgressImageView igProgressImageView = (IgProgressImageView) l5t.A06.getView();
        igProgressImageView.setAspectRatio(f);
        igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean z2 = c158797Aq.A0q;
        RoundedCornerFrameLayout roundedCornerFrameLayout = l5t.A0E;
        ViewGroup.LayoutParams layoutParams = roundedCornerFrameLayout.getLayoutParams();
        C14360o3.A07(layoutParams);
        C35139Feg c35139Feg = C35139Feg.A00;
        Context context = l5t.A02;
        C09530e4 A01 = c35139Feg.A01(activity, context, interfaceC08830cm, interfaceC08830cm2, f, z, z2);
        float floatValue = ((Number) A01.A00).floatValue();
        float floatValue2 = ((Number) A01.A01).floatValue();
        layoutParams.height = (int) floatValue;
        layoutParams.width = (int) floatValue2;
        roundedCornerFrameLayout.setLayoutParams(layoutParams);
        int i2 = 0;
        if (interfaceC08830cm2 == null || !C14360o3.A0K(interfaceC08830cm2.get(), true)) {
            if (z2) {
                i = context.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height);
            } else {
                i = 20;
            }
            i2 = (int) AbstractC13880nE.A04(context, i);
        }
        roundedCornerFrameLayout.setCornerRadius(i2);
    }

    public static final void A01(L5T l5t, C158797Aq c158797Aq, InterfaceC08830cm interfaceC08830cm, boolean z) {
        View BKF;
        int i;
        C7AS c7as = c158797Aq.A00;
        if (z) {
            i = 0;
            if (interfaceC08830cm != null && C14360o3.A0K(interfaceC08830cm.get(), false) && c7as != null && c7as.A02.size() > 0) {
                BKF = l5t.A0C.BKF();
                BKF.setVisibility(i);
                l5t.A0B.BKF().setVisibility(i);
            }
        }
        BKF = l5t.A0C.BKF();
        i = 8;
        BKF.setVisibility(i);
        l5t.A0B.BKF().setVisibility(i);
    }
}
