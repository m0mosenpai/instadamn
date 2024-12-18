package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DcK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30537DcK extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30537DcK(Object obj, Object obj2, String str, int i) {
        super(3);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl;
        int i;
        switch (this.A00) {
            case 0:
                c5Tl = (C5Tl) obj2;
                if (AbstractC25228BEl.A0D(obj3) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(937352845, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:1244)");
                    }
                    InterfaceC132245y2 interfaceC132245y2 = (InterfaceC132245y2) this.A02;
                    C26151Bhc c26151Bhc = (C26151Bhc) interfaceC132245y2;
                    String str = c26151Bhc.A07;
                    String str2 = c26151Bhc.A02;
                    boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, interfaceC132245y2, -1659678012);
                    Object obj4 = this.A01;
                    boolean A1X = AbstractC25225BEi.A1X(c5Tl, obj4, A1Y);
                    String str3 = this.A03;
                    boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, str3, A1X);
                    Object EEc = c5Tl.EEc();
                    if (A1X2 || EEc == C5UI.A00) {
                        EEc = new C50253MHi(obj4, interfaceC132245y2, str3, 15);
                        c5Tl.FBy(EEc);
                    }
                    CEX.A00(c5Tl, null, str, str2, (InterfaceC16820sZ) EEc, AbstractC25228BEl.A1W(c5Tl) ? 1 : 0, 4);
                    if (C0fH.A02()) {
                        i = -419713895;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 1:
                c5Tl = (C5Tl) obj2;
                if (AbstractC25228BEl.A0D(obj3) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1783372888, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:1268)");
                    }
                    c5Tl.Eno(-1659655959);
                    Object obj5 = this.A01;
                    boolean AH4 = c5Tl.AH4(obj5);
                    String str4 = this.A03;
                    boolean A1X3 = AbstractC25225BEi.A1X(c5Tl, str4, AH4);
                    Object obj6 = this.A02;
                    boolean A1X4 = AbstractC25225BEi.A1X(c5Tl, obj6, A1X3);
                    Object EEc2 = c5Tl.EEc();
                    if (A1X4 || EEc2 == C5UI.A00) {
                        EEc2 = new C50253MHi(obj5, obj6, str4, 16);
                        c5Tl.FBy(EEc2);
                    }
                    CEA.A00(c5Tl, null, (InterfaceC16820sZ) EEc2, AbstractC25228BEl.A1W(c5Tl) ? 1 : 0, 1);
                    if (C0fH.A02()) {
                        i = -1413916605;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 2:
                c5Tl = (C5Tl) obj2;
                int A0H = AbstractC166987dD.A0H(obj3);
                C14360o3.A0B(obj, 0);
                if ((A0H & 17) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(831747600, "instagram.features.clips.bottomsheet.blend.ui.BlendContextMemberListComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlendContextBottomSheetComposables.kt:119)");
                    }
                    C2JS c2js = (C2JS) this.A02;
                    C2DB A00 = AbstractC43541zP.A00(c5Tl, AbstractC25225BEi.A0t(c2js.A0C("profile_pic_url")));
                    String A08 = c2js.A08(AbstractC50531MSk.A00());
                    if (A08 == null) {
                        A08 = "";
                    }
                    String A09 = c2js.A09("full_name");
                    boolean coercedBooleanField = c2js.getCoercedBooleanField(4, "is_verified");
                    boolean contains = c2js.getCoercedCompactedIntListField(3, "account_badges").contains(0);
                    c5Tl.Eno(1424025520);
                    Object obj7 = this.A01;
                    boolean AH6 = c5Tl.AH6(obj7);
                    String str5 = this.A03;
                    boolean A1X5 = AbstractC25225BEi.A1X(c5Tl, str5, AH6);
                    Object EEc3 = c5Tl.EEc();
                    if (A1X5 || EEc3 == C5UI.A00) {
                        EEc3 = new C57259Pbh(str5, obj7, 29);
                        c5Tl.FBy(EEc3);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    BI4.A09(c5Tl, A00, A08, A09, (InterfaceC16820sZ) EEc3, 0, 56556, coercedBooleanField, contains);
                    if (C0fH.A02()) {
                        i = -767929741;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 3:
                c5Tl = (C5Tl) obj2;
                if (AbstractC25228BEl.A0D(obj3) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-536587112, "instagram.features.clips.bottomsheet.blend.ui.BlendSuggestedUsersForReelListComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlendContextBottomSheetComposables.kt:154)");
                    }
                    C5TR A01 = C5UA.A01(c5Tl, new DSB(this.A03, this.A02, 7), 1740186904);
                    C5TR A012 = C5UA.A01(c5Tl, new C30506Dbp(this.A01, 19), 46110647);
                    C28118CaR c28118CaR = C28118CaR.A00;
                    boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c28118CaR, -1441808473);
                    Object EEc4 = c5Tl.EEc();
                    if (A1Z || EEc4 == C5UI.A00) {
                        EEc4 = new BV8(c28118CaR, 10);
                        c5Tl.FBy(EEc4);
                    }
                    AbstractC25225BEi.A1T(c5Tl);
                    CGO.A00(c5Tl, null, A01, A012, (InterfaceC16600sD) ((C0YS) EEc4), 54, 4);
                    if (C0fH.A02()) {
                        i = -1025581818;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            default:
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) obj;
                c5Tl = (C5Tl) obj2;
                int A0H2 = AbstractC166987dD.A0H(obj3);
                C14360o3.A0B(interfaceC16620sF, 0);
                if ((A0H2 & 6) == 0) {
                    A0H2 |= AbstractC25232BEp.A0H(c5Tl, interfaceC16620sF);
                }
                if ((A0H2 & 19) != 18 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1800740907, "instagram.features.clips.spins.feedback.ui.FeedbackRow.<anonymous>.<anonymous> (ClipsSpinsReplyBottomSheetContent.kt:99)");
                    }
                    Modifier A092 = AbstractC118175Wb.A09(C6L3.A01(Modifier.A00, C5WF.A00(), C5XL.A00(c5Tl).A0C), 10.0f);
                    InterfaceC58202Pr8 interfaceC58202Pr8 = (InterfaceC58202Pr8) this.A02;
                    String str6 = this.A03;
                    InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) this.A01;
                    InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                    int A002 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C59P A04 = C117505Tk.A04(c117505Tk);
                    Modifier A013 = C5X3.A01(c5Tl, A092);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk);
                    AbstractC25231BEo.A12(c5Tl, A0b, A04);
                    InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                    if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A013);
                    c5Tl.Eno(2062987113);
                    if (AbstractC25226BEj.A1D(interfaceC74953Yl).length() == 0) {
                        AbstractC25236BEt.A0l(c5Tl, AbstractC25235BEs.A0p(c5Tl, str6, interfaceC58202Pr8.BnT()));
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    AbstractC25231BEo.A14(c5Tl, interfaceC16620sF, A0H2);
                    if (C0fH.A02()) {
                        i = -2108193271;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
        }
        return C0eB.A00;
    }
}
