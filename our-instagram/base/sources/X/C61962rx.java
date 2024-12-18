package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2rx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61962rx {
    public C1GL A00;
    public C1GL A01;
    public final UserSession A02;
    public final C1CL A03;

    public /* synthetic */ C61962rx(AbstractC018607g abstractC018607g, UserSession userSession) {
        Integer num;
        C1CL c1cl = new C1CL(userSession);
        this.A02 = userSession;
        this.A03 = c1cl;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36328057459981440L);
        int A01 = (int) C18U.A01(c06090Tz, userSession, 36609532436617116L);
        if (A06) {
            num = Integer.valueOf(A01);
        } else {
            num = null;
        }
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        this.A01 = new C61972ry(context, abstractC018607g, num);
        Context context2 = AbstractC12290kX.A00;
        C14360o3.A07(context2);
        this.A00 = new C61972ry(context2, abstractC018607g, null);
    }
}
