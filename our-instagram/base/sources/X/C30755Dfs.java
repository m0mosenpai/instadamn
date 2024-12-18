package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.comments.mvvm.view.viewpoint.CommentRowMerlinModifierElement;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dfs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30755Dfs extends C0YY implements InterfaceC16590sC {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30755Dfs(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(5);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A05 = obj4;
        this.A02 = obj5;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        boolean z;
        List list;
        SpannableStringBuilder append;
        InterfaceC76613c6 interfaceC76613c6;
        String id;
        List AmB;
        Object obj6;
        if (this.A00 != 0) {
            C77243dA c77243dA = (C77243dA) obj;
            C76853cX c76853cX = (C76853cX) obj2;
            int A0H = AbstractC166987dD.A0H(obj3);
            InterfaceC75453aC interfaceC75453aC = (InterfaceC75453aC) obj4;
            C77143d0 c77143d0 = (C77143d0) obj5;
            AbstractC25233BEq.A0w(1, c76853cX, interfaceC75453aC, c77143d0);
            C38321qM c38321qM = (C38321qM) this.A03;
            if (!c38321qM.A5u() && (((list = (List) this.A01) != null && !list.isEmpty()) || c38321qM.A6c((UserSession) this.A05))) {
                UserSession userSession = (UserSession) this.A05;
                User user = (User) this.A04;
                if (list == null) {
                    list = C16930sl.A00;
                }
                Context context = (Context) this.A02;
                if (C41754IeU.A03(userSession)) {
                    List carouselMediaImmutable = c76853cX.A09.A00.getCarouselMediaImmutable();
                    User user2 = null;
                    if (carouselMediaImmutable != null && (interfaceC76613c6 = (InterfaceC76613c6) AbstractC001800i.A0O(carouselMediaImmutable, A0H)) != null && (id = interfaceC76613c6.getId()) != null && (AmB = c38321qM.A0C.AmB()) != null) {
                        Iterator it = AmB.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj6 = it.next();
                                if (C14360o3.A0K(((C38321qM) obj6).getId(), id)) {
                                    break;
                                }
                            } else {
                                obj6 = null;
                                break;
                            }
                        }
                        C38321qM c38321qM2 = (C38321qM) obj6;
                        if (c38321qM2 != null) {
                            user2 = c38321qM2.A0C.Bg6();
                        }
                    }
                    return C28423CgV.A00(context, c38321qM, c77143d0, interfaceC75453aC, c76853cX, user, user2);
                }
                if (list.isEmpty()) {
                    append = AbstractC25225BEi.A0H(user.getUsername());
                } else if (list.size() == 1 && C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36320244913938644L)) {
                    append = C28423CgV.A00(context, c38321qM, c77143d0, interfaceC75453aC, c76853cX, user, (User) AbstractC001800i.A0I(list));
                } else {
                    append = new SpannableStringBuilder().append((CharSequence) AbstractC07900bA.A02(context.getResources(), new String[]{user.getUsername(), String.valueOf(list.size())}, R.plurals.open_carousel_media_user_name_header, list.size()));
                }
                C14360o3.A0A(append);
                C28423CgV.A01(context, append, c38321qM, c77143d0, interfaceC75453aC, c76853cX.A0E, user, false);
                return append;
            }
            if (c38321qM.A5u()) {
                String username = ((User) this.A04).getUsername();
                Context context2 = (Context) this.A02;
                String valueOf = String.valueOf(c38321qM.A3C(context2));
                if (c77243dA != null && (c77243dA.A01 || c77243dA.A02)) {
                    z = false;
                    valueOf = "";
                } else {
                    z = true;
                }
                String string = context2.getString(2131969169, username, valueOf);
                C14360o3.A07(string);
                SpannableStringBuilder append2 = new SpannableStringBuilder().append((CharSequence) string);
                append2.setSpan(new StyleSpan(1), 0, AbstractC167007dF.A0A(username), 18);
                if (!z) {
                    return append2;
                }
                int length = string.length();
                append2.setSpan(new ForegroundColorSpan(AbstractC167007dF.A09(context2, R.attr.igds_color_secondary_text)), length - AbstractC167007dF.A0A(valueOf), length, 18);
                return append2;
            }
            return new SpannableStringBuilder();
        }
        int A0H2 = AbstractC166987dD.A0H(obj2);
        AbstractC166097bd abstractC166097bd = (AbstractC166097bd) obj3;
        C5Tl c5Tl = (C5Tl) obj4;
        int A0H3 = AbstractC166987dD.A0H(obj5);
        C14360o3.A0B(abstractC166097bd, 2);
        if ((A0H3 & 112) == 0) {
            i = AbstractC25232BEp.A09(c5Tl, A0H2) | A0H3;
        } else {
            i = A0H3;
        }
        if ((A0H3 & 896) == 0) {
            i |= AbstractC25232BEp.A0T(c5Tl, abstractC166097bd);
        }
        if ((i & 5841) == 1168 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1679608393, "com.instagram.comments.mvvm.view.compose.CommentListContent.<anonymous>.<anonymous> (CommentList.kt:162)");
            }
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            EnumC09460dv enumC09460dv = EnumC09460dv.A02;
            Object obj7 = this.A05;
            InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C57261Pbj(49, A19, abstractC166097bd, obj7));
            if (abstractC166097bd instanceof C167297di) {
                c5Tl.Eno(1158442246);
                C167297di c167297di = (C167297di) abstractC166097bd;
                C27961CUg c27961CUg = (C27961CUg) A00.getValue();
                C166047bW c166047bW = (C166047bW) this.A01;
                Modifier modifier = Modifier.A00;
                boolean A06 = C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A04, 36318741672696268L);
                List list2 = (List) this.A02;
                if (A06) {
                    AbstractC167007dF.A1E(modifier, 0, list2);
                    modifier = modifier.Eq3(new CommentRowMerlinModifierElement(abstractC166097bd, c166047bW, list2, A0H2));
                }
                AbstractC28043CXv.A00(c5Tl, AbstractC25225BEi.A0Q(modifier), c167297di, c166047bW, c27961CUg, 0, 0);
            } else if (abstractC166097bd instanceof C166087bc) {
                c5Tl.Eno(1158466703);
                AbstractC28462ChE.A04(c5Tl, (C25314BIj) this.A03, 0, ((C166087bc) abstractC166097bd).A03);
            } else if (abstractC166097bd instanceof C166117bf) {
                c5Tl.Eno(1158471573);
                AbstractC28462ChE.A05(((C166117bf) abstractC166097bd).A03, c5Tl, 0);
            } else if (abstractC166097bd instanceof C169207gt) {
                c5Tl.Eno(1158475699);
                AbstractC27583CFc.A00(c5Tl, (C169207gt) abstractC166097bd, (C27961CUg) A00.getValue(), 0);
            } else if (abstractC166097bd instanceof C169217gu) {
                c5Tl.Eno(1158479783);
                AbstractC27595CFo.A00(c5Tl, (C169217gu) abstractC166097bd, 0);
            } else if (abstractC166097bd instanceof C169227gv) {
                c5Tl.Eno(1158483876);
                Object value = A00.getValue();
                boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, value, 1158485121);
                Object EEc = c5Tl.EEc();
                if (A1Y || EEc == C5UI.A00) {
                    EEc = AbstractC25230BEn.A0t(c5Tl, value, 37);
                }
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) ((C0YS) EEc);
                Object value2 = A00.getValue();
                boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, value2, 1158487714);
                Object EEc2 = c5Tl.EEc();
                if (A1Y2 || EEc2 == C5UI.A00) {
                    EEc2 = AbstractC25229BEm.A0u(c5Tl, value2, 3);
                }
                C169227gv c169227gv = (C169227gv) abstractC166097bd;
                AbstractC28042CXu.A01(c5Tl, c169227gv.A00, AbstractC25228BEl.A1D(A0K, EEc2, false), interfaceC16660sJ, 0, c169227gv.A01);
            } else if (abstractC166097bd instanceof C169537hT) {
                c5Tl.Eno(1158495350);
                C169537hT c169537hT = (C169537hT) abstractC166097bd;
                CFZ.A00(c5Tl, c169537hT.A00, c169537hT.A01, 0, c169537hT.A02);
            } else if (abstractC166097bd instanceof C169547hU) {
                c5Tl.Eno(1158500199);
                AbstractC27592CFl.A00(c5Tl, ((C169547hU) abstractC166097bd).A00, (C27961CUg) A00.getValue(), 0);
            } else if (abstractC166097bd instanceof C169527hS) {
                c5Tl.Eno(1158505096);
                C169527hS c169527hS = (C169527hS) abstractC166097bd;
                C166047bW c166047bW2 = (C166047bW) this.A01;
                C27961CUg c27961CUg2 = (C27961CUg) A00.getValue();
                boolean A1Y3 = AbstractC25227BEk.A1Y(c5Tl, obj7, 1158508274);
                Object EEc3 = c5Tl.EEc();
                if (A1Y3 || EEc3 == C5UI.A00) {
                    EEc3 = AbstractC25229BEm.A0s(c5Tl, obj7, 18);
                }
                C117505Tk A0K2 = AbstractC25225BEi.A0K(c5Tl, false);
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) ((C0YS) EEc3);
                boolean A1Y4 = AbstractC25227BEk.A1Y(c5Tl, obj7, 1158510378);
                Object EEc4 = c5Tl.EEc();
                if (A1Y4 || EEc4 == C5UI.A00) {
                    EEc4 = AbstractC25230BEn.A0t(c5Tl, obj7, 38);
                }
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) AbstractC25225BEi.A1G(A0K2, EEc4, false);
                Modifier modifier2 = Modifier.A00;
                boolean A062 = C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A04, 36318741672696268L);
                List list3 = (List) this.A02;
                if (A062) {
                    AbstractC167007dF.A1E(modifier2, 0, list3);
                    modifier2 = modifier2.Eq3(new CommentRowMerlinModifierElement(abstractC166097bd, c166047bW2, list3, A0H2));
                }
                AbstractC28040CXs.A00(c5Tl, modifier2, c169527hS, c166047bW2, c27961CUg2, interfaceC16660sJ2, interfaceC16620sF, 0, 0);
            } else if (abstractC166097bd instanceof C26947Buo) {
                c5Tl.Eno(1158530673);
                C26947Buo c26947Buo = (C26947Buo) abstractC166097bd;
                Object value3 = A00.getValue();
                boolean A1Y5 = AbstractC25227BEk.A1Y(c5Tl, value3, 1158532873);
                Object EEc5 = c5Tl.EEc();
                if (A1Y5 || EEc5 == C5UI.A00) {
                    EEc5 = AbstractC25229BEm.A0u(c5Tl, value3, 4);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                AbstractC27591CFk.A00(c5Tl, c26947Buo, (InterfaceC16820sZ) ((C0YS) EEc5), 0);
            } else if (abstractC166097bd instanceof C166127bg) {
                c5Tl.Eno(1158536019);
                AbstractC28462ChE.A02(c5Tl, 0);
            } else if (abstractC166097bd instanceof C26949Buq) {
                c5Tl.Eno(1554979035);
                C26949Buq c26949Buq = (C26949Buq) abstractC166097bd;
                Object value4 = A00.getValue();
                boolean A1Y6 = AbstractC25227BEk.A1Y(c5Tl, value4, 1158542224);
                Object EEc6 = c5Tl.EEc();
                if (A1Y6 || EEc6 == C5UI.A00) {
                    EEc6 = new D5g(value4, 1);
                    c5Tl.FBy(EEc6);
                }
                C0YS c0ys = (C0YS) EEc6;
                C117505Tk A0K3 = AbstractC25225BEi.A0K(c5Tl, false);
                Object value5 = A00.getValue();
                boolean A1Y7 = AbstractC25227BEk.A1Y(c5Tl, value5, 1158545138);
                Object EEc7 = c5Tl.EEc();
                if (A1Y7 || EEc7 == C5UI.A00) {
                    EEc7 = new BV8(value5, 2);
                    c5Tl.FBy(EEc7);
                }
                C0YS A1G = AbstractC25225BEi.A1G(A0K3, EEc7, false);
                Object value6 = A00.getValue();
                boolean A1Y8 = AbstractC25227BEk.A1Y(c5Tl, value6, 1158548985);
                Object EEc8 = c5Tl.EEc();
                if (A1Y8 || EEc8 == C5UI.A00) {
                    EEc8 = new C29642D5f(value6, 3);
                    c5Tl.FBy(EEc8);
                }
                C0YS A1G2 = AbstractC25225BEi.A1G(A0K3, EEc8, false);
                Object value7 = A00.getValue();
                boolean A1Y9 = AbstractC25227BEk.A1Y(c5Tl, value7, 1158551950);
                Object EEc9 = c5Tl.EEc();
                if (A1Y9 || EEc9 == C5UI.A00) {
                    EEc9 = AbstractC25230BEn.A0t(c5Tl, value7, 36);
                }
                C0YS A1G3 = AbstractC25225BEi.A1G(A0K3, EEc9, false);
                boolean A1Y10 = AbstractC25227BEk.A1Y(c5Tl, obj7, 1158560305);
                Object EEc10 = c5Tl.EEc();
                if (A1Y10 || EEc10 == C5UI.A00) {
                    EEc10 = new BV8(obj7, 1);
                    c5Tl.FBy(EEc10);
                }
                AbstractC27589CFi.A00(c5Tl, c26949Buq, (C166047bW) this.A01, (InterfaceC16660sJ) A1G3, C30712DfA.A00(A00, 38), (InterfaceC16610sE) A1G2, (InterfaceC16600sD) AbstractC25225BEi.A1G(A0K3, EEc10, false), (InterfaceC16600sD) A1G, (InterfaceC16590sC) c0ys, 0);
            } else {
                c5Tl.Eno(1158562790);
            }
            if (AbstractC25230BEn.A1Y(c5Tl)) {
                C0fH.A00(-1880086307);
            }
        }
        return C0eB.A00;
    }
}
