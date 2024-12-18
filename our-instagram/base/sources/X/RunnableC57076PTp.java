package X;

import android.app.Activity;
import android.content.Context;
import androidx.cardview.widget.CardView;
import com.instagram.model.reels.Reel;

/* renamed from: X.PTp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57076PTp implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ CardView A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ InterfaceC64002vL A03;
    public final /* synthetic */ C3P2 A04;
    public final /* synthetic */ boolean A05;

    public RunnableC57076PTp(Context context, CardView cardView, Reel reel, InterfaceC64002vL interfaceC64002vL, C3P2 c3p2, boolean z) {
        this.A00 = context;
        this.A05 = z;
        this.A03 = interfaceC64002vL;
        this.A02 = reel;
        this.A01 = cardView;
        this.A04 = c3p2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        Context context = this.A00;
        if ((context instanceof Activity) && (activity = (Activity) context) != null && !activity.isFinishing()) {
            if (this.A05) {
                InterfaceC64002vL interfaceC64002vL = this.A03;
                if (interfaceC64002vL != null) {
                    interfaceC64002vL.CMu(AbstractC37301Gc2.A0i(this.A02));
                    return;
                }
                return;
            }
            AbstractC43593JPy.A0E(this.A01.animate(), 0.8f).alpha(0.0f).withEndAction(new PNZ(this.A04)).setDuration(250L).start();
        }
    }
}
