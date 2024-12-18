package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.Liz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C48851Liz implements C79O {
    public final /* synthetic */ AnonymousClass795 A00;

    public /* synthetic */ C48851Liz(AnonymousClass795 anonymousClass795) {
        this.A00 = anonymousClass795;
    }

    @Override // X.C79O
    public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, final C7IM c7im, C18A c18a) {
        C910143t c910143t;
        C83403nh c83403nh = c160787Im.A0e;
        AnonymousClass442 A0P = c83403nh.A0P();
        if (A0P == null) {
            C7QL A03 = C7QK.A03(userSession, anonymousClass988, c160787Im, c7im, c83403nh.A10, AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8b
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC43594JPz.A0C(C7IM.this);
                }
            }));
            new C1582378i();
            C14360o3.A0B(context, 0);
            AbstractC43594JPz.A1P(userSession, anonymousClass988);
            ImmutableList A0H = c83403nh.A0H();
            if (A0H != null && (c910143t = (C910143t) AbstractC001800i.A0O(A0H, 0)) != null) {
                return C1583378t.A02(context, userSession, A03, anonymousClass988, c160787Im, c910143t, false);
            }
            return null;
        }
        return new C1582378i().A02(context, userSession, C7QK.A01(userSession, anonymousClass988, c160787Im, c7im, A0P, C2EY.A0q), anonymousClass988, c160787Im, A0P);
    }
}
