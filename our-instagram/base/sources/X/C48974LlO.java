package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.LlO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48974LlO implements InterfaceC162527Pp {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.78t, kotlin.jvm.internal.DefaultConstructorMarker, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C158747Ak c158747Ak;
        C9CP c9cp;
        C160787Im c160787Im = (C160787Im) c7vc;
        C14360o3.A0B(context, 0);
        JQ0.A1O(userSession, c18a, c7im, c160787Im, anonymousClass988);
        boolean A00 = C7Q1.A00(userSession, z);
        C83403nh c83403nh = c160787Im.A0e;
        String A0v = AbstractC43594JPz.A0v(c83403nh, A00 ? 1 : 0);
        C14360o3.A0A(A0v);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C17050sx A01 = AbstractC09440dt.A01(MG2.A00);
        C2EY c2ey = c83403nh.A10;
        C14360o3.A07(c2ey);
        C7QL A03 = C7QK.A03(userSession, anonymousClass988, c160787Im, c7im, c2ey, A01);
        String str = 0;
        str = 0;
        C1582378i c1582378i = new C1582378i(str, str, str, 3);
        ImmutableList A0H = c83403nh.A0H();
        if (A0H == null) {
            A0H = ImmutableList.of();
            C14360o3.A07(A0H);
        }
        if (A0H.size() == 2) {
            C910143t c910143t = (C910143t) A0H.get(0);
            C910143t c910143t2 = (C910143t) A0H.get(1);
            C7QY A012 = c1582378i.A01(context, userSession, A03, anonymousClass988, c160787Im);
            C83553nw c83553nw = c83403nh.A0N;
            List list = null;
            if (c83553nw != null) {
                c158747Ak = LBz.A01(context, userSession, c160787Im, A03.A03, c83553nw, false, false, AbstractC162597Pw.A01(c83403nh, userSession.userId), false);
            } else {
                c158747Ak = null;
            }
            Long l = c910143t.A0p;
            String str2 = c910143t.A1Q;
            ImmutableList A013 = c910143t.A01();
            if (A013 != null && (c9cp = (C9CP) A013.get(0)) != null) {
                str = c9cp.A04;
            }
            ImmutableList A014 = c910143t.A01();
            if (A014 != null) {
                A014.get(0);
            }
            String str3 = c910143t.A0w;
            Integer A015 = AbstractC1583478u.A01(c910143t2.A08);
            String str4 = c910143t2.A13;
            String str5 = c910143t2.A1Q;
            String str6 = c910143t2.A0v;
            C51755Mte c51755Mte = c910143t2.A0M;
            if (c51755Mte != null) {
                list = (List) c51755Mte.A00;
            }
            return new K0Q(C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im, c18a), new KT2(c158747Ak, AbstractC43592JPx.A0d(context, userSession, anonymousClass988, c160787Im, c83403nh), A03, A012, A015, l, str2, str, str3, str4, str5, str6, list), A0v);
        }
        throw AbstractC166987dD.A12("TwoCardXmaItemDefinitionShimViewHolder requires 2 attachments");
    }
}
