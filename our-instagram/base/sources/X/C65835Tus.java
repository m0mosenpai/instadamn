package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Tus, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65835Tus {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final int A05;
    public final Activity A06;
    public final C2Vj A07;
    public final InterfaceC59892oW A08;

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.2Vj] */
    public C65835Tus(Activity activity, Context context, UserSession userSession, boolean z) {
        int A01;
        int A00;
        int i;
        int i2;
        int i3;
        this.A06 = activity;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C1AD.A06(c06090Tz, 18303479873279633L) && !C18U.A06(c06090Tz, userSession, 36317904152565402L)) {
            A01 = AbstractC13880nE.A07(context);
            A00 = AbstractC13880nE.A06(context);
        } else {
            A01 = AbstractC13890nF.A01(context);
            A00 = AbstractC13890nF.A00(context);
        }
        ?? obj = new Object();
        obj.A01 = A01;
        obj.A00 = A00;
        this.A07 = obj;
        if (C57992lC.A03()) {
            i = C57992lC.A01();
        } else {
            i = 0;
        }
        this.A03 = i;
        if (C57992lC.A03()) {
            i2 = C57992lC.A00();
        } else {
            i2 = 0;
        }
        this.A02 = i2;
        if (z) {
            i3 = AbstractC43594JPz.A03(context);
        } else {
            i3 = 0;
        }
        this.A04 = i3;
        int A0G = activity instanceof ModalActivity ? 0 : AbstractC53242c7.A0G(activity.getApplicationContext(), AbstractC57322k7.A01(userSession));
        this.A05 = A0G;
        this.A01 = obj.A01;
        this.A00 = obj.A00 - (((A0G + this.A04) + this.A03) + this.A02);
        this.A08 = new C65860TvN(this, 5);
    }
}
