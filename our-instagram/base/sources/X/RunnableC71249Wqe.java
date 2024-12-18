package X;

import com.facebook.locationsharing.core.models.Location;

/* renamed from: X.Wqe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71249Wqe implements Runnable {
    public final /* synthetic */ C66542ULx A00;

    public RunnableC71249Wqe(C66542ULx c66542ULx) {
        this.A00 = c66542ULx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        C66542ULx c66542ULx = this.A00;
        if (((AbstractC68892Vdo) c66542ULx).A00 && (location = C66542ULx.A00(c66542ULx).A05) != null) {
            c66542ULx.A05.A02(new WUB(this, 0), location.A00, location.A01);
        }
    }
}
