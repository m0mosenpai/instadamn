package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class NAB extends C1P1 {
    public final /* synthetic */ C55067OaN A00;

    public NAB(C55067OaN c55067OaN) {
        this.A00 = c55067OaN;
    }

    private final void A00() {
        OGc oGc = C56141Ow2.A04;
        C55067OaN c55067OaN = this.A00;
        UserSession userSession = c55067OaN.A02;
        C56141Ow2 A00 = oGc.A00(userSession);
        String str = c55067OaN.A05;
        C51415MnN A002 = A00.A00(str, str);
        if (A002 != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c55067OaN.A01, userSession), "instagram_shopping_suggested_tags_request_completion");
            A0f.AAQ(A002, "suggested_tags_info");
            MSW.A1U(A0f, str);
            A0f.Cht();
        }
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(347510191);
        C52086N2m c52086N2m = (C52086N2m) obj;
        int A032 = C0f9.A03(682685681);
        C14360o3.A0B(c52086N2m, 0);
        super.onSuccess(c52086N2m);
        OGc oGc = C56141Ow2.A04;
        C55067OaN c55067OaN = this.A00;
        UserSession userSession = c55067OaN.A02;
        C56141Ow2 A00 = oGc.A00(userSession);
        String str = c55067OaN.A05;
        Integer num = C05F.A00;
        ArrayList arrayList = c55067OaN.A06;
        A00.A02 = str;
        A00.A01 = num;
        A00.A00 = c52086N2m;
        A00.A03 = arrayList;
        A00();
        List list = c52086N2m.A00;
        list.getClass();
        ImmutableList A0L = AbstractC31173DnH.A0L(list);
        C25671My A002 = AbstractC25651Mw.A00(userSession);
        C3NX A0z = AbstractC25225BEi.A0z(A0L);
        String str2 = c55067OaN.A03;
        A002.E4s(new C8PB(A0z, str2));
        InterfaceC11380iw interfaceC11380iw = c55067OaN.A01;
        long currentTimeMillis = System.currentTimeMillis() - c55067OaN.A00;
        boolean A003 = C55067OaN.A00(c55067OaN);
        List list2 = c52086N2m.A00;
        list2.getClass();
        ImmutableList A0L2 = AbstractC31173DnH.A0L(list2);
        String str3 = c55067OaN.A04;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator<E> it = A0L2.iterator();
        while (it.hasNext()) {
            List list3 = ((C53615NnM) it.next()).A02;
            if (list3 != null && AbstractC166987dD.A1b(list3)) {
                A1E.addAll(list3);
            }
        }
        HashMap A04 = AbstractC55216Oef.A04(A1E);
        long j = 0;
        long A05 = AbstractC50523MSb.A05(AbstractC31171DnF.A0W("high_confidence_count", A04));
        long A052 = AbstractC50523MSb.A05(AbstractC31171DnF.A0W("medium_confidence_count", A04));
        Number A0W = AbstractC31171DnF.A0W("low_confidence_count", A04);
        if (A0W != null) {
            j = A0W.intValue();
        }
        InterfaceC02590Ai A01 = AbstractC55216Oef.A01(AbstractC37302Gc3.A0I(interfaceC11380iw, userSession), userSession, "ig_suggested_tags_request_success", str);
        AbstractC50522MSa.A1D(A01, AbstractC50523MSb.A0T(A01, userSession, str));
        A01.AAP("user_tag_type", str3);
        AbstractC43593JPy.A1F(A01, currentTimeMillis);
        MSY.A18(A01, A003);
        A01.A9K("high_confidence_suggestions_count", Long.valueOf(A05));
        AbstractC50523MSb.A0v(A01, A052, j);
        A01.AAP("media_format", str2);
        A01.Cht();
        C0f9.A0A(-1683200615, A032);
        C0f9.A0A(-1312716437, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 248898950);
        super.onFail(abstractC115105If);
        OGc oGc = C56141Ow2.A04;
        C55067OaN c55067OaN = this.A00;
        UserSession userSession = c55067OaN.A02;
        C56141Ow2 A00 = oGc.A00(userSession);
        String str = c55067OaN.A05;
        Integer num = C05F.A01;
        ArrayList arrayList = c55067OaN.A06;
        A00.A02 = str;
        A00.A01 = num;
        A00.A00 = null;
        A00.A03 = arrayList;
        A00();
        AbstractC25651Mw.A00(userSession).E4s(new C8PB(AbstractC25227BEk.A0h(), c55067OaN.A03));
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null && A01.getMessage() != null) {
            AbstractC55216Oef.A08(c55067OaN.A01, userSession, str, A01.getMessage(), System.currentTimeMillis() - c55067OaN.A00, C55067OaN.A00(c55067OaN));
        }
        C0f9.A0A(-553208953, A0N);
    }
}
