package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N9u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52231N9u extends C1P1 {
    public final int A00;
    public final Activity A01;
    public final Context A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final C84923qg A05;
    public final C38321qM A06;
    public final InterfaceC60442pS A07;
    public final WeakReference A08;
    public final WeakReference A09 = AbstractC25225BEi.A16(null);
    public final int A0A;
    public final int A0B;
    public final boolean A0C;

    public C52231N9u(Activity activity, Context context, AbstractC59962oe abstractC59962oe, InterfaceC58139Pq4 interfaceC58139Pq4, UserSession userSession, C84923qg c84923qg, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2, int i3, boolean z) {
        this.A05 = c84923qg;
        this.A06 = c38321qM;
        this.A08 = AbstractC25225BEi.A16(interfaceC58139Pq4);
        this.A04 = userSession;
        this.A02 = context;
        this.A01 = activity;
        this.A03 = abstractC59962oe;
        this.A07 = interfaceC60442pS;
        this.A0C = z;
        this.A0A = i;
        this.A00 = i2;
        this.A0B = i3;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        C84923qg c84923qg;
        String str;
        String str2;
        int A03 = C0f9.A03(538445233);
        C14360o3.A0B(abstractC115105If, 0);
        boolean z = abstractC115105If instanceof C115115Ig;
        if (!z) {
            c84923qg = this.A05;
            c84923qg.A06 = EnumC84933qh.A08;
            C57682kh.A00(this.A04).A0L(new OW1(c84923qg, this.A07.getModuleName(), AbstractC15820qc.A09(this.A02), this.A0A, this.A00, this.A0B, this.A0C, false));
        } else {
            N3H n3h = (N3H) ((C115115Ig) abstractC115105If).A00;
            c84923qg = this.A05;
            c84923qg.A06 = EnumC84933qh.A04;
            String str3 = n3h.A04;
            if (str3 != null) {
                c84923qg.A0C = str3;
            }
            AbstractC53974Ntl.A00(n3h.A05);
            c84923qg.A0M = n3h.A06;
            c84923qg.A09 = AbstractC53975Ntm.A00(n3h.A03);
        }
        this.A06.A0d.A01();
        N3H n3h2 = (N3H) abstractC115105If.A00();
        C06860Yd c06860Yd = new C06860Yd();
        if (n3h2 != null) {
            str = Integer.valueOf(n3h2.mStatusCode).toString();
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        c06860Yd.put(TraceFieldType.ErrorCode, str);
        if (n3h2 == null || (str2 = n3h2.A02) == null || str2.length() == 0) {
            str2 = "comment_client_error";
        }
        c06860Yd.put("error_key", str2);
        if (n3h2 != null && n3h2.getErrorMessage() != null) {
            str4 = n3h2.getErrorMessage();
        }
        c06860Yd.put("error_message", str4);
        c06860Yd.put("m_pk", c84923qg.A0E);
        C06860Yd A0N = AbstractC16850sd.A0N(c06860Yd);
        InterfaceC58139Pq4 interfaceC58139Pq4 = (InterfaceC58139Pq4) this.A08.get();
        if (interfaceC58139Pq4 != null) {
            if (!z) {
                AbstractC15820qc.A0E(this.A02);
            } else if (((N3H) ((C115115Ig) abstractC115105If).A00).A07) {
                interfaceC58139Pq4.DZu();
            }
            interfaceC58139Pq4.DZv(c84923qg, A0N);
        }
        ((C28191Xx) AbstractC53854Nri.A00()).A00 = new C54590O9r("latest_comment_posting_error", A0N);
        C0f9.A0A(833662864, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ProductType A1z;
        int A03 = C0f9.A03(1881409896);
        N3H n3h = (N3H) obj;
        int A032 = C0f9.A03(2110177887);
        C14360o3.A0B(n3h, 0);
        C84923qg c84923qg = this.A05;
        EnumC84933qh enumC84933qh = c84923qg.A06;
        String str = c84923qg.A0G;
        C38891rO c38891rO = n3h.A00;
        if (c38891rO != null) {
            C84923qg c84923qg2 = new C84923qg(c38891rO);
            c84923qg.A03 = c84923qg2.A03;
            c84923qg.A06 = EnumC84933qh.A09;
            String str2 = c84923qg2.A0G;
            C14360o3.A0B(str2, 0);
            c84923qg.A0G = str2;
            c84923qg.A0J = c84923qg2.A0J;
            c84923qg.A0D = c84923qg2.A0D;
            List list = c84923qg2.A0K;
            C14360o3.A0B(list, 0);
            c84923qg.A0K = list;
            c84923qg.A0J = c84923qg2.A0J;
            C38321qM c38321qM = this.A06;
            C40041tV c40041tV = c38321qM.A0d;
            C40061tX c40061tX = c40041tV.A0B;
            String str3 = c84923qg2.A0G;
            C14360o3.A0B(str3, 1);
            java.util.Set set = c40061tX.A02;
            if (set.contains(c84923qg.A0G)) {
                set.remove(c84923qg.A0G);
                c84923qg.A0G = str3;
                set.add(str3);
            }
            c84923qg.A0I = c84923qg2.A0I;
            c38321qM.A0C.ERm(Integer.valueOf(c38321qM.A0s() + 1));
            c40041tV.A01();
            if (enumC84933qh == EnumC84933qh.A02) {
                InterfaceC58140Pq5 interfaceC58140Pq5 = (InterfaceC58140Pq5) this.A09.get();
                UserSession userSession = this.A04;
                String moduleName = this.A07.getModuleName();
                C14360o3.A0B(userSession, 3);
                HashSet hashSet = new HashSet(1);
                hashSet.add(c84923qg);
                C55217Oeg.A06(interfaceC58140Pq5, userSession, c38321qM, hashSet);
                String valueOf = String.valueOf(moduleName);
                C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                A0c.A0L("media/%s/comment/%s/delete/", c84923qg.A0E, c84923qg.A0G);
                A0c.A0R(N2Y.class, ONN.class);
                A0c.A9s("comment_id", c84923qg.A0G);
                A0c.A9s("media_id", c84923qg.A0E);
                C1ON A0I = MSY.A0I(A0c, "container_module", valueOf);
                A0I.A00 = new NAC(1, hashSet, interfaceC58140Pq5, c38321qM, userSession);
                C1GJ.A03(A0I);
            }
            InterfaceC58139Pq4 interfaceC58139Pq4 = (InterfaceC58139Pq4) this.A08.get();
            if (interfaceC58139Pq4 != null) {
                interfaceC58139Pq4.DZx(c84923qg, str);
            }
            User A14 = AbstractC25226BEj.A14(c38321qM);
            if (A14 != null && c84923qg.A0q && (A1z = c38321qM.A1z()) != null) {
                C99694dm A00 = AbstractC99684dl.A00(this.A04);
                String id = A14.getId();
                String str4 = c84923qg.A0E;
                String name = c38321qM.BRp().name();
                String str5 = A1z.A00;
                C14360o3.A07(str5);
                A00.A0B(id, str4, name, str5);
            }
            ProductType A1z2 = c38321qM.A1z();
            if (c84923qg2.A0r && (A1z2 == ProductType.CLIPS || A1z2 == ProductType.FEED)) {
                UserSession userSession2 = this.A04;
                if (C18U.A06(C06090Tz.A05, userSession2, 36318290699622487L) && AbstractC25226BEj.A14(c38321qM) != null && this.A01 != null && !this.A03.mDetached) {
                    G98 g98 = new G98(1, C8d.CREATOR_RESHARE_NUDGE, EnumC33488ErN.COMMENTS, c38321qM.A1z(), this, AbstractC12220kQ.A01(AbstractC31171DnF.A0D("PostCommentUtil"), userSession2));
                    C146106i8 A0Y = AbstractC31174DnI.A0Y();
                    Context context = this.A02;
                    AbstractC25226BEj.A1N(context, A0Y, 2131952410);
                    User A142 = AbstractC25226BEj.A14(c38321qM);
                    if (A142 != null) {
                        A0Y.A0I = AbstractC31178DnM.A0c(context, A142, 2131952411);
                        A0Y.A09 = c38321qM.A1S();
                        A0Y.A03();
                        AbstractC31175DnJ.A0l(context, A0Y, 2131952409);
                        A0Y.A01 = 5000;
                        A0Y.A0A(g98);
                        A0Y.A0L = true;
                        C41451vu c41451vu = C41451vu.A01;
                        C31349DqE A002 = A0Y.A00();
                        C14360o3.A0C(A002, AbstractC111324zv.A00(4988));
                        AbstractC166997dE.A1O(c41451vu, A002);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
            String str6 = n3h.A01;
            if (str6 != null) {
                UserSession userSession3 = this.A04;
                List A003 = AbstractC186788Pv.A00(userSession3).A00(str6);
                if (A003 == null) {
                    A003 = C16930sl.A00;
                }
                List list2 = c84923qg2.A0K;
                C28531Zo.A04.A0G(userSession3, "COMMENT", list2, A003);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        User A15 = AbstractC25226BEj.A15(it);
                        if (AbstractC186788Pv.A01(userSession3) || A003.contains(A15.getUsername())) {
                            C28531Zo.A04.A09(userSession3, c84923qg2, new DirectShareTarget(A15));
                        }
                    }
                }
            }
            C0f9.A0A(-1814967954, A032);
            C0f9.A0A(-1358022470, A03);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1285301556);
        this.A08.get();
        C0f9.A0A(32152, A03);
    }
}
