package X;

import android.content.Context;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final /* synthetic */ class JW2 implements C79O {
    public final /* synthetic */ AnonymousClass795 A00;

    public /* synthetic */ JW2(AnonymousClass795 anonymousClass795) {
        this.A00 = anonymousClass795;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C79O
    public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
        C910143t c910143t;
        C83403nh c83403nh = c160787Im.A0e;
        AnonymousClass442 A0P = c83403nh.A0P();
        A0P.getClass();
        AbstractC167017dG.A1N(context, userSession);
        AbstractC167017dG.A1S(c7im, anonymousClass988);
        C2EY c2ey = A0P.A0F;
        C14360o3.A07(c2ey);
        C7QL A01 = C7QK.A01(userSession, anonymousClass988, c160787Im, c7im, A0P, c2ey);
        C1582378i c1582378i = new C1582378i(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3);
        ImmutableList A012 = A0P.A01();
        if (A012 != null && (c910143t = (C910143t) AbstractC001800i.A0O(A012, 0)) != null) {
            C7QY A06 = c1582378i.A00.A06(context, userSession, A01, anonymousClass988, null, c160787Im, A0P, c910143t, null);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.cutout_anything_sticker_animation_margin);
            C2EY c2ey2 = A0P.A0F;
            C14360o3.A07(c2ey2);
            return new C129535tI(null, A06, null, null, null, C158727Ai.A08(context, userSession, c83403nh, A0P), null, "H,0.555555:1", dimensionPixelSize, C158727Ai.A09(c2ey2, null, AbstractC158887Ba.A04(userSession, A0P)), c83403nh.A1S());
        }
        throw AbstractC166997dE.A0g();
    }
}
