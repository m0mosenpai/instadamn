package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.LlX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48983LlX implements InterfaceC162527Pp {
    public final C98K A00;

    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        KT4 kt4;
        C160787Im c160787Im = (C160787Im) c7vc;
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A0a(1, userSession, c18a, c7im, c160787Im);
        C14360o3.A0B(anonymousClass988, 5);
        C163157Sa A01 = AbstractC47854LBx.A01(context, userSession, anonymousClass988, c160787Im, c7im);
        C98K c98k = this.A00;
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        Object obj = c83403nh.A1T;
        String str = null;
        Class<?> cls = null;
        if (!C9CL.A00(obj, 2)) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("message.content required to be DirectMediaShare but is");
            if (obj != null) {
                cls = obj.getClass();
            }
            throw AbstractC43594JPz.A0n(cls, A1C);
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectMediaShare");
        String str2 = ((C9CL) obj).A04;
        if (str2 == null) {
            kt4 = new KT4(A01, null);
        } else {
            C1580677q c1580677q = C1580677q.A00;
            boolean CVC = A01.CVC();
            C7QL c7ql = A01.A05;
            C7IM c7im2 = c7ql.A03;
            AnonymousClass988 anonymousClass9882 = c7ql.A02;
            CharSequence A07 = c1580677q.A07(context, userSession, c98k, anonymousClass9882, c160787Im, c7im2, str2, null, CVC, false);
            boolean A012 = C4GU.A01(c83403nh.A1F);
            boolean A1Z = c83403nh.A1Z();
            C2EY c2ey = C2EY.A1i;
            boolean z2 = false;
            if (c83403nh.A2P != c160787Im.A0G.A0x) {
                z2 = true;
            }
            boolean z3 = c160787Im.A0Y;
            InterfaceC09390do interfaceC09390do = c7ql.A05;
            boolean z4 = c7ql.A07;
            boolean z5 = c7ql.A00;
            boolean z6 = c7ql.A01;
            C14360o3.A0B(c2ey, 0);
            C14360o3.A0B(anonymousClass9882, 1);
            C14360o3.A0B(interfaceC09390do, 2);
            C14360o3.A0B(c7im2, 9);
            C7QL c7ql2 = new C7QL(anonymousClass9882, c7im2, c2ey, interfaceC09390do, false, z4, z5, z6, z2, z3);
            C7QX c7qx = A01.A04;
            MessageIdentifier messageIdentifier = c7qx.A06;
            long j = c7qx.A00;
            boolean z7 = c7qx.A0B;
            boolean z8 = c7qx.A08;
            boolean z9 = c7qx.A0A;
            C7QV c7qv = c7qx.A02;
            List list = c7qx.A07;
            boolean z10 = c7qx.A09;
            boolean z11 = c7qx.A0C;
            MessageIdentifier messageIdentifier2 = c7qx.A05;
            C26084BgD c26084BgD = c7qx.A01;
            C7P3 c7p3 = c7qx.A03;
            C14360o3.A0B(messageIdentifier, 0);
            AbstractC25229BEm.A1L(c7qv, 5, c7p3);
            C7QX c7qx2 = new C7QX(c26084BgD, c7qv, c7p3, c2ey, messageIdentifier, messageIdentifier2, list, j, z7, z8, z9, z10, z11);
            AnonymousClass541 anonymousClass541 = AnonymousClass541.A0J;
            User user = c160787Im.A0K;
            if (user != null) {
                str = user.getId();
            }
            boolean z12 = c83403nh.A2O;
            C14360o3.A0B(A07, 2);
            A07.toString();
            C2EY c2ey2 = c7ql.A04;
            boolean z13 = c7ql.A06;
            boolean z14 = c7ql.A08;
            boolean z15 = c7ql.A09;
            C14360o3.A0B(c2ey2, 0);
            C7QL c7ql3 = new C7QL(anonymousClass9882, c7im2, c2ey2, interfaceC09390do, z13, z4, z5, true, z14, z15);
            String str3 = A01.A0D;
            float f = A01.A00;
            C206409Bx c206409Bx = A01.A02;
            AbstractC46448Kh8 abstractC46448Kh8 = A01.A07;
            Hashtag hashtag = A01.A0A;
            AbstractC46447Kh7 abstractC46447Kh7 = A01.A06;
            Integer num = A01.A0B;
            AbstractC46450KhA abstractC46450KhA = A01.A09;
            C163157Sa c163157Sa = new C163157Sa(c206409Bx, A01.A03, c7qx, c7ql3, abstractC46447Kh7, abstractC46448Kh8, A01.A08, abstractC46450KhA, hashtag, num, A01.A0C, str3, A01.A0E, f, A01.A01);
            C2EY c2ey3 = c7ql2.A04;
            AnonymousClass988 anonymousClass9883 = c7ql2.A02;
            InterfaceC09390do interfaceC09390do2 = c7ql2.A05;
            boolean z16 = c7ql2.A07;
            boolean z17 = c7ql2.A08;
            boolean z18 = c7ql2.A09;
            C7IM c7im3 = c7ql2.A03;
            C14360o3.A0B(c2ey3, 0);
            C14360o3.A0B(anonymousClass9883, 1);
            C14360o3.A0B(interfaceC09390do2, 2);
            C14360o3.A0B(c7im3, 9);
            kt4 = new KT4(c163157Sa, new AnonymousClass781(anonymousClass541, null, c7qx2, new C7QL(anonymousClass9883, c7im3, c2ey3, interfaceC09390do2, false, z16, true, z6, z17, z18), A07, str, null, null, A012, A1Z, false, z12, false, false, false, false));
        }
        return new K0J(C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im, c18a), kt4, ((MessageIdentifier) A01.A0F.getValue()).A01);
    }

    public C48983LlX(C98K c98k) {
        this.A00 = c98k;
    }
}
