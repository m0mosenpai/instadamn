package X;

import android.view.Choreographer;
import com.instagram.common.session.UserSession;

/* renamed from: X.6bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142196bc implements InterfaceC43071ya {
    public static final C146736jB A08 = new Object();
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final Integer A05;
    public final UserSession A06;
    public final InterfaceC146336iW A07;
    public final Choreographer A04 = Choreographer.getInstance();
    public final Choreographer.FrameCallback A03 = new WKm(this);

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue == 2) {
                this.A07.F9c(this);
                return;
            }
            return;
        }
        this.A07.EDQ(this);
    }

    public C142196bc(UserSession userSession, InterfaceC146336iW interfaceC146336iW, Integer num, long j) {
        this.A06 = userSession;
        this.A05 = num;
        this.A07 = interfaceC146336iW;
        this.A02 = j;
    }
}
