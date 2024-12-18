package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.Llf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48991Llf implements InterfaceC162527Pp {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC162527Pp
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final K0Z AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a, boolean z) {
        C14360o3.A0B(context, 0);
        AbstractC167017dG.A1P(userSession, c18a);
        AbstractC25233BEq.A0x(3, c7im, c160787Im, anonymousClass988);
        C17050sx A01 = AbstractC09440dt.A01(MG0.A00);
        C83403nh c83403nh = c160787Im.A0e;
        C2EY c2ey = c83403nh.A10;
        C14360o3.A07(c2ey);
        C7QL A03 = C7QK.A03(userSession, anonymousClass988, c160787Im, c7im, c2ey, A01);
        C1582378i c1582378i = new C1582378i(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3);
        ImmutableList A0H = c83403nh.A0H();
        if (A0H != null) {
            boolean z2 = true;
            if (!A0H.isEmpty()) {
                int i = ((C910143t) A0H.get(0)).A02;
                if (i != 8) {
                    if (i != 10) {
                        if (i != 13) {
                            throw AbstractC166987dD.A14(AnonymousClass001.A0O("unsupported xma layout type ", ((C910143t) A0H.get(0)).A02));
                        }
                    }
                    C7SZ A032 = c1582378i.A03(context, userSession, A03, anonymousClass988, c160787Im, z2);
                    String A0k = JQ0.A0k(userSession, c83403nh, z);
                    C14360o3.A0A(A0k);
                    KVE kve = new KVE(C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im, c18a), A032, A0k);
                    return new K0Z(kve.A00, kve.A01, ((AbstractC48325LZy) kve).A02);
                }
                z2 = false;
                C7SZ A0322 = c1582378i.A03(context, userSession, A03, anonymousClass988, c160787Im, z2);
                String A0k2 = JQ0.A0k(userSession, c83403nh, z);
                C14360o3.A0A(A0k2);
                KVE kve2 = new KVE(C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im, c18a), A0322, A0k2);
                return new K0Z(kve2.A00, kve2.A01, ((AbstractC48325LZy) kve2).A02);
            }
            throw AbstractC31172DnG.A0u();
        }
        throw AbstractC166997dE.A0g();
    }
}
