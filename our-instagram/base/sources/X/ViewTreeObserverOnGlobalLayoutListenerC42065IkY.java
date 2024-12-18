package X;

import android.view.ViewTreeObserver;
import com.instagram.common.session.UserSession;

/* renamed from: X.IkY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC42065IkY implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C42713Iv8 A00;
    public final /* synthetic */ C69392Vmc A01;

    public ViewTreeObserverOnGlobalLayoutListenerC42065IkY(C42713Iv8 c42713Iv8, C69392Vmc c69392Vmc) {
        this.A00 = c42713Iv8;
        this.A01 = c69392Vmc;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver = this.A00.A02.getViewTreeObserver();
        C14360o3.A07(viewTreeObserver);
        AbstractC13880nE.A0x(this, viewTreeObserver);
        C69392Vmc c69392Vmc = this.A01;
        UserSession userSession = c69392Vmc.A01;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36312874748937607L) && !C18U.A06(c06090Tz, userSession, 36312874750379411L)) {
            c69392Vmc.A00.postDelayed(new J3E(c69392Vmc), 200L);
        }
    }
}
