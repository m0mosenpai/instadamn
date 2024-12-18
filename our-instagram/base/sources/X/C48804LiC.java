package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LiC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48804LiC implements AnonymousClass797 {
    public final int A00;
    public final Object A01;

    public C48804LiC(AnonymousClass795 anonymousClass795, int i) {
        this.A00 = i;
        this.A01 = anonymousClass795;
    }

    @Override // X.AnonymousClass797
    public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
        switch (this.A00) {
            case 0:
                return C1580677q.A03(context, userSession, ((AnonymousClass795) this.A01).A0C, anonymousClass988, c160787Im, c7im);
            case 1:
                return AnonymousClass795.A05(context, userSession, anonymousClass988, c160787Im, c7im, AbstractC166997dE.A0b(), Boolean.valueOf(c160787Im.A0V));
            case 2:
            default:
                AnonymousClass795 anonymousClass795 = (AnonymousClass795) this.A01;
                return C1580677q.A05(context, userSession, anonymousClass795.A0C, anonymousClass988, c160787Im, c7im, c160787Im.A0V);
            case 3:
                return C1580677q.A02(context, userSession, ((AnonymousClass795) this.A01).A0C, anonymousClass988, c160787Im, c7im);
        }
    }
}
