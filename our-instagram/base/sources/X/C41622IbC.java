package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IbC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41622IbC {
    public Product A00;
    public final UserSession A01;
    public final C57112jm A02;
    public final C63622uj A03;
    public final HK2 A04;
    public final C42378Ipf A05;
    public final C42388Ipp A06;
    public final C39117HJp A07;
    public final C42389Ipq A08;
    public final C42373Ipa A09;
    public final C42381Ipi A0A;
    public final String A0B;

    public C41622IbC(UserSession userSession, C57112jm c57112jm, C41702IdW c41702IdW, C41727Idy c41727Idy, AdsProductPageFragment adsProductPageFragment, AdsProductPageFragment adsProductPageFragment2, String str, List list) {
        AbstractC167027dH.A0a(1, str, c57112jm, userSession, c41727Idy);
        C14360o3.A0B(list, 6);
        C63622uj c63622uj = new C63622uj();
        C42388Ipp c42388Ipp = new C42388Ipp(c41702IdW, c41727Idy);
        C39117HJp c39117HJp = new C39117HJp(userSession, c41702IdW, c41727Idy, adsProductPageFragment);
        C42378Ipf c42378Ipf = new C42378Ipf(userSession);
        C42373Ipa c42373Ipa = new C42373Ipa(list);
        C42389Ipq c42389Ipq = new C42389Ipq(c41702IdW, c41727Idy, adsProductPageFragment);
        C42381Ipi c42381Ipi = new C42381Ipi(adsProductPageFragment2);
        HK2 hk2 = new HK2(AbstractC37302Gc3.A0J(userSession), userSession, c41727Idy);
        this.A0B = str;
        this.A02 = c57112jm;
        this.A03 = c63622uj;
        this.A01 = userSession;
        this.A06 = c42388Ipp;
        this.A07 = c39117HJp;
        this.A05 = c42378Ipf;
        this.A09 = c42373Ipa;
        this.A08 = c42389Ipq;
        this.A0A = c42381Ipi;
        this.A04 = hk2;
    }

    public final void A01(C39347HZm c39347HZm, String str, String str2, String str3) {
        AbstractC167017dG.A1O(str, str3);
        C63622uj c63622uj = this.A03;
        C59062n7 A00 = c63622uj.A00(str2);
        C41044IFn c41044IFn = new C41044IFn(c39347HZm, str3);
        C0eB c0eB = C0eB.A00;
        C59062n7 c59062n7 = C59062n7.A07;
        ArrayList A0z = AbstractC31174DnI.A0z(this.A07);
        A0z.add(this.A08);
        c63622uj.A01(new C59062n7(A00, c41044IFn, c0eB, str, A0z), str);
    }

    public static void A00(AbstractC42328Ioq abstractC42328Ioq, C41622IbC c41622IbC, String str, String str2) {
        C59072n8 A00 = C59062n7.A00(new C41044IFn(abstractC42328Ioq, str), C0eB.A00, str2);
        A00.A00(c41622IbC.A06);
        A00.A00(c41622IbC.A07);
        A00.A00(c41622IbC.A05);
        c41622IbC.A03.A01(A00.A01(), str2);
    }
}
