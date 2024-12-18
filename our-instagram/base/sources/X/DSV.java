package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutElement;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class DSV extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSV(long j, Object obj, Object obj2, int i) {
        super(2);
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
        this.A03 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String valueOf;
        int i;
        C118125Vw A01;
        C5Tl c5Tl = (C5Tl) obj;
        switch (this.A00) {
            case 0:
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(57986718, "com.instagram.barcelona.feed.post.ui.MultiAccountLikePopup.<anonymous>.<anonymous> (MultiAccountLikePopup.kt:57)");
                    }
                    C6ID A012 = AbstractC118255Wn.A01(8.0f);
                    InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A02;
                    C1130158n c1130158n = Modifier.A00;
                    Modifier A08 = AbstractC118175Wb.A08(c1130158n, 8.0f);
                    List list = (List) this.A02;
                    long j = this.A01;
                    Object obj3 = this.A03;
                    InterfaceC1127857k A013 = AbstractC119595bH.A01(A012, c5Tl, interfaceC118245Wl);
                    int A00 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C59P A04 = C117505Tk.A04(c117505Tk);
                    Modifier A014 = C5X3.A01(c5Tl, A08);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk);
                    AbstractC25231BEo.A12(c5Tl, A013, A04);
                    InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                    if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A014);
                    String A002 = C5YD.A00(c5Tl, 2131953758);
                    A01 = C118125Vw.A01(null, AbstractC25226BEj.A0f(c5Tl), null, null, null, 0, 0, 16777214, AbstractC25226BEj.A0M(c5Tl), 0L, 0L);
                    C5WR.A0j(c5Tl, A01, A002);
                    Iterator A0x = AbstractC25227BEk.A0x(c5Tl, list, 2043349906);
                    while (A0x.hasNext()) {
                        User A15 = AbstractC25226BEj.A15(A0x);
                        if (!C14360o3.A0K(A15, AbstractC001800i.A0K(list))) {
                            c5Tl.Eno(-616911656);
                            boolean A1Y = AbstractC25232BEp.A1Y(c5Tl, obj3, A15, -2098106850);
                            Object EEc = c5Tl.EEc();
                            if (A1Y || EEc == C5UI.A00) {
                                EEc = AbstractC25230BEn.A12(c5Tl, obj3, A15, 47);
                            }
                            AbstractC28027CXb.A01(c5Tl, A15, AbstractC25225BEi.A1B(c117505Tk, EEc, false), 0, j);
                            AbstractC28389Cfs.A02(c5Tl, AbstractC118185Wd.A0D(c1130158n, 160.0f).Eq3(new LayoutElement(C30630Ddq.A00)), 0.0f, 0, 6, 0L);
                        } else {
                            c5Tl.Eno(-616194874);
                            boolean A1Y2 = AbstractC25232BEp.A1Y(c5Tl, obj3, A15, -2098083202);
                            Object EEc2 = c5Tl.EEc();
                            if (A1Y2 || EEc2 == C5UI.A00) {
                                EEc2 = AbstractC25230BEn.A12(c5Tl, obj3, A15, 48);
                            }
                            AbstractC28027CXb.A01(c5Tl, A15, AbstractC25225BEi.A1B(c117505Tk, EEc2, false), 0, j);
                        }
                        C117505Tk.A0L(c117505Tk, false);
                    }
                    if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                        i = -1567069727;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 1:
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1579515488, "com.instagram.barcelona.feed.post.ui.MultiAccountLikePopup.<anonymous> (MultiAccountLikePopup.kt:51)");
                    }
                    long A09 = AbstractC25226BEj.A09(c5Tl);
                    C5XL.A02(c5Tl);
                    C5WI c5wi = C5WE.A00;
                    AbstractC25649BVl.A00(c5Tl, AbstractC118185Wd.A0D(Modifier.A00, 200.0f), c5wi, C5UA.A01(c5Tl, new DSV(this.A01, this.A02, this.A03, 0), -1820133455), 8.0f, 1769478, 24, A09);
                    if (C0fH.A02()) {
                        i = -1917968039;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 2:
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-94966099, "com.instagram.compose.igds.components.navigation.actionbar.IgdsActionBarEndAddOn.<anonymous> (IgdsActionBar.kt:283)");
                    }
                    C26184Bi9 c26184Bi9 = (C26184Bi9) ((InterfaceC30938Dis) this.A02);
                    C5YS.A09(c5Tl, (Modifier) this.A03, c26184Bi9.A00, c26184Bi9.A02, this.A01);
                    if (C0fH.A02()) {
                        i = -446740338;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 3:
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(171148226, "com.instagram.compose.igds.components.navigation.actionbar.IgdsActionBarEndAddOn.<anonymous> (IgdsActionBar.kt:300)");
                    }
                    C26184Bi9 c26184Bi92 = (C26184Bi9) ((InterfaceC30938Dis) this.A02);
                    C5YS.A09(c5Tl, (Modifier) this.A03, c26184Bi92.A00, c26184Bi92.A02, this.A01);
                    if (C0fH.A02()) {
                        i = 1107272531;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 4:
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(304199913, "com.instagram.compose.igds.components.segmentedtabs.IgdsSegmentedTabImpl.<anonymous>.<anonymous> (IgdsSegmentedTab.kt:109)");
                    }
                    Modifier Eq3 = AbstractC25226BEj.A0V(AbstractC25226BEj.A0X(Modifier.A00, this.A01)).Eq3((Modifier) this.A02);
                    Alignment alignment = C118195Wf.A09;
                    C26038BfR c26038BfR = (C26038BfR) this.A03;
                    InterfaceC1127857k A003 = C5XX.A00(alignment, false);
                    int A004 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk2 = (C117505Tk) c5Tl;
                    C59P A042 = C117505Tk.A04(c117505Tk2);
                    Modifier A015 = C5X3.A01(c5Tl, Eq3);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk2);
                    AbstractC25231BEo.A12(c5Tl, A003, A042);
                    InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                    if (c117505Tk2.A0K || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A015);
                    int intValue = c26038BfR.A02.intValue();
                    if (intValue != 0) {
                        if (intValue == 1) {
                            c5Tl.Eno(-1597942244);
                            Integer num = c26038BfR.A00;
                            if (num != null) {
                                AbstractC28387Cfq.A02(c5Tl, c26038BfR.A03, num.intValue(), 0, 0);
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC25231BEo.A0v(c5Tl, c117505Tk2, -2129769206, false);
                        }
                    } else {
                        c5Tl.Eno(-1598292296);
                        c5Tl.Eno(-2129766541);
                        String str = c26038BfR.A04;
                        if (str == null || str.length() == 0) {
                            Integer num2 = c26038BfR.A01;
                            if (num2 != null) {
                                str = AbstractC25228BEl.A16(c5Tl, num2);
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                        C117505Tk.A0L(c117505Tk2, false);
                        if (c26038BfR.A05) {
                            Locale locale = ((C122575gs) AbstractC122545gp.A00.Au7().A01.get(0)).A00;
                            if (str.length() > 0) {
                                StringBuilder A1C = AbstractC166987dD.A1C();
                                char charAt = str.charAt(0);
                                if (Character.isLowerCase(charAt)) {
                                    valueOf = C11K.A00(locale, charAt);
                                } else {
                                    valueOf = String.valueOf(charAt);
                                }
                                A1C.append((Object) valueOf);
                                String substring = str.substring(1);
                                C14360o3.A07(substring);
                                str = AbstractC166997dE.A0x(substring, A1C);
                            }
                        }
                        AbstractC28387Cfq.A03(str, c5Tl, 0);
                    }
                    if (AbstractC25230BEn.A1U(c5Tl, c117505Tk2, false)) {
                        i = 1759710600;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            default:
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(206676320, "com.instagram.compose.igds.components.segmentedtabs.IgdsSegmentedTabImpl.<anonymous> (IgdsSegmentedTab.kt:108)");
                    }
                    C5WR.A0z(c5Tl, AbstractC25225BEi.A0X(c5Tl), C5UA.A01(c5Tl, new DSV(this.A01, this.A02, this.A03, 4), -1552851209), 48);
                    if (C0fH.A02()) {
                        i = 675586560;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
        }
    }
}
