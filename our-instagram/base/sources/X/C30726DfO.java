package X;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.api.schemas.AchievementIntf;
import com.instagram.api.schemas.CloseToEarningAchievementMediaIntf;
import com.instagram.archive.updateshub.UserReelMerlinModifierElement;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: X.DfO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30726DfO extends C0YY implements InterfaceC16600sD {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30726DfO(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(4);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C5Tl c5Tl;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String A00;
        switch (this.A00) {
            case 0:
                int A0H = AbstractC166987dD.A0H(obj2);
                c5Tl = (C5Tl) obj3;
                int A0H2 = AbstractC166987dD.A0H(obj4);
                if ((A0H2 & 6) == 0) {
                    i6 = AbstractC25232BEp.A0R(c5Tl, obj) | A0H2;
                } else {
                    i6 = A0H2;
                }
                if ((A0H2 & 48) == 0) {
                    i6 |= AbstractC25232BEp.A09(c5Tl, A0H);
                }
                if ((i6 & 147) != 146 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1384791925, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
                    }
                    Object A13 = AbstractC25225BEi.A13(this.A02, A0H);
                    int A02 = AbstractC25225BEi.A02(i6);
                    C26021BfA c26021BfA = (C26021BfA) A13;
                    c5Tl.Eno(1678503244);
                    c5Tl.Eno(1301071255);
                    c5Tl.Eno(1301071846);
                    C5UP c5up = AbstractC117935Vd.A00;
                    AbstractC12990ll A0v = AbstractC25226BEj.A0v(c5Tl, c5up);
                    C06090Tz c06090Tz = C06090Tz.A05;
                    boolean A06 = C18U.A06(c06090Tz, A0v, 36325081046463194L);
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C117505Tk.A0L(c117505Tk, false);
                    if (A06) {
                        c5Tl.Eno(1678582541);
                        C26003Ber c26003Ber = (C26003Ber) ((C50726MaR) this.A04).A02;
                        AbstractC28496Chp.A05(c5Tl, c26021BfA, c26003Ber, (C28370CfW) this.A01, (String) AbstractC001800i.A0O(c26003Ber.A04, A0H), (InterfaceC16610sE) this.A03, A0H, ((A02 >> 3) & 112) | ((A02 << 6) & 7168));
                    } else {
                        c5Tl.Eno(1301083910);
                        boolean A062 = C18U.A06(c06090Tz, AbstractC25226BEj.A0v(c5Tl, c5up), 36325081045480144L);
                        C117505Tk.A0L(c117505Tk, false);
                        if (A062) {
                            c5Tl.Eno(1678956525);
                            C26003Ber c26003Ber2 = (C26003Ber) ((C50726MaR) this.A04).A02;
                            AbstractC28496Chp.A04(c5Tl, c26021BfA, c26003Ber2, (C28370CfW) this.A01, (String) AbstractC001800i.A0O(c26003Ber2.A04, A0H), (InterfaceC16610sE) this.A03, A0H, ((A02 >> 3) & 112) | ((A02 << 6) & 7168));
                        } else {
                            c5Tl.Eno(1301096038);
                            boolean A063 = C18U.A06(c06090Tz, AbstractC25226BEj.A0v(c5Tl, c5up), 36325081044693706L);
                            C117505Tk.A0L(c117505Tk, false);
                            if (A063) {
                                c5Tl.Eno(1679332431);
                                C26003Ber c26003Ber3 = (C26003Ber) ((C50726MaR) this.A04).A02;
                                AbstractC28496Chp.A03(c5Tl, c26021BfA, c26003Ber3, (C28370CfW) this.A01, (String) AbstractC001800i.A0O(c26003Ber3.A04, A0H), (InterfaceC16610sE) this.A03, A0H, ((A02 >> 3) & 112) | ((A02 << 6) & 7168));
                            } else {
                                Modifier A0D = AbstractC118185Wd.A0D(AbstractC25225BEi.A0N(c5Tl, 1679596861), 318.0f);
                                InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                                int A002 = C5X2.A00(c5Tl);
                                C59P A04 = C117505Tk.A04(c117505Tk);
                                Modifier A01 = C5X3.A01(c5Tl, A0D);
                                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                                AbstractC25231BEo.A12(c5Tl, A0b, A04);
                                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
                                }
                                AbstractC25225BEi.A1K(c5Tl, A01);
                                C26003Ber c26003Ber4 = (C26003Ber) ((C50726MaR) this.A04).A02;
                                AbstractC28496Chp.A06(c5Tl, c26021BfA, c26003Ber4, (C28370CfW) this.A01, (String) AbstractC001800i.A0O(c26003Ber4.A04, A0H), (InterfaceC16610sE) this.A03, A0H, ((A02 >> 3) & 112) | ((A02 << 6) & 7168));
                                c5Tl.ASW();
                            }
                        }
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    C117505Tk.A0L(c117505Tk, false);
                    if (AbstractC25227BEk.A1b(c117505Tk, false)) {
                        i2 = 1742675055;
                        C0fH.A00(i2);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 1:
                int A0H3 = AbstractC166987dD.A0H(obj2);
                c5Tl = (C5Tl) obj3;
                int A0H4 = AbstractC166987dD.A0H(obj4);
                if ((A0H4 & 6) == 0) {
                    i5 = AbstractC25232BEp.A0R(c5Tl, obj) | A0H4;
                } else {
                    i5 = A0H4;
                }
                if ((A0H4 & 48) == 0) {
                    i5 |= AbstractC25232BEp.A09(c5Tl, A0H3);
                }
                if ((i5 & 147) != 146 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1399416175, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
                    }
                    Object A132 = AbstractC25225BEi.A13(this.A02, A0H3);
                    int A022 = AbstractC25225BEi.A02(i5);
                    c5Tl.Eno(676624949);
                    CXQ.A01(c5Tl, (C26021BfA) A132, (C26003Ber) ((C50726MaR) this.A04).A02, (C28370CfW) this.A01, (InterfaceC16610sE) this.A03, A0H3, ((A022 >> 6) & 14) | ((A022 << 3) & 896));
                    if (AbstractC25230BEn.A1Y(c5Tl)) {
                        i2 = -1834260525;
                        C0fH.A00(i2);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 2:
                int A0H5 = AbstractC166987dD.A0H(obj2);
                c5Tl = (C5Tl) obj3;
                int A0H6 = AbstractC166987dD.A0H(obj4);
                if ((A0H6 & 6) == 0) {
                    i4 = AbstractC25232BEp.A0R(c5Tl, obj) | A0H6;
                } else {
                    i4 = A0H6;
                }
                if ((A0H6 & 48) == 0) {
                    i4 |= AbstractC25232BEp.A09(c5Tl, A0H5);
                }
                if ((i4 & 147) != 146 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(2146215492, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:498)");
                    }
                    Object A133 = AbstractC25225BEi.A13(this.A02, A0H5);
                    int A012 = AbstractC25225BEi.A01(i4);
                    Bf4 bf4 = (Bf4) A133;
                    Modifier Eq3 = AbstractC25225BEi.A0N(c5Tl, -2092200350).Eq3(new LazyLayoutAnimateItemElement(AbstractC25236BEt.A0F()));
                    Integer num = C05F.A0E;
                    AbstractC167017dG.A1N(Eq3, bf4);
                    Modifier Eq32 = Eq3.Eq3(new UserReelMerlinModifierElement(bf4, num));
                    AbstractC28382Cfl.A02((Drawable) this.A01, c5Tl, Eq32, bf4, (InterfaceC16660sJ) this.A04, (InterfaceC16620sF) this.A03, (A012 >> 3) & 112, 0);
                    if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                        i2 = -429343088;
                        C0fH.A00(i2);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 3:
                AbstractC25225BEi.A1R(obj2);
                c5Tl = (C5Tl) obj3;
                if ((AbstractC166987dD.A0H(obj4) & 129) != 128 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1314604609, "com.instagram.creation.genai.magicmod.tools.backdrop.ui.MagicModBackdropGeneratedImageVariants.<anonymous>.<anonymous>.<anonymous> (MagicModBackdropGeneratedImageVariants.kt:111)");
                    }
                    AbstractC28437Cgl.A01(c5Tl, (InterfaceC137546La) this.A01, (InterfaceC137546La) this.A03, (C27866CQd) this.A04, 0, ((C26196BiM) this.A02).A03);
                    if (C0fH.A02()) {
                        i2 = -1304551056;
                        C0fH.A00(i2);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 4:
                int A0H7 = AbstractC166987dD.A0H(obj2);
                c5Tl = (C5Tl) obj3;
                int A0H8 = AbstractC166987dD.A0H(obj4);
                if ((A0H8 & 6) == 0) {
                    i3 = A0H8 | AbstractC25232BEp.A0R(c5Tl, obj);
                } else {
                    i3 = A0H8;
                }
                if ((A0H8 & 48) == 0) {
                    i3 |= AbstractC25232BEp.A09(c5Tl, A0H7);
                }
                if ((i3 & 147) != 146 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        AbstractC25225BEi.A1J(-1484733710);
                    }
                    CloseToEarningAchievementMediaIntf closeToEarningAchievementMediaIntf = (CloseToEarningAchievementMediaIntf) AbstractC25225BEi.A13(this.A02, A0H7);
                    c5Tl.Eno(-712646096);
                    InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
                    C1130158n c1130158n = Modifier.A00;
                    InterfaceC1127857k A0V = AbstractC25225BEi.A0V(c5Tl, interfaceC118225Wj);
                    int A003 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk2 = (C117505Tk) c5Tl;
                    C59P A042 = C117505Tk.A04(c117505Tk2);
                    Modifier A013 = C5X3.A01(c5Tl, c1130158n);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk2);
                    AbstractC25231BEo.A12(c5Tl, A0V, A042);
                    InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                    if (c117505Tk2.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A013);
                    C2DB A0d = AbstractC25235BEs.A0d(c5Tl, closeToEarningAchievementMediaIntf.BQi());
                    Modifier modifier = (Modifier) this.A03;
                    C6LQ.A04(c5Tl, C5XR.A06(AbstractC25228BEl.A0X(C6L7.A01(C6G9.A00(1.0f, AbstractC25226BEj.A0E(c5Tl)), AbstractC118185Wd.A0C(modifier, 50.0f), C5WF.A01(4.0f)), 4.0f), new C29894DGi(14, this.A04, closeToEarningAchievementMediaIntf)), A0d);
                    CI4.A00(c5Tl, AbstractC118175Wb.A05(modifier), AbstractC25226BEj.A0c(c5Tl), closeToEarningAchievementMediaIntf.BiJ(), ((AchievementIntf) this.A01).getValue(), 0, 0, AbstractC25226BEj.A0G(c5Tl));
                    c5Tl.ASW();
                    if (AbstractC25227BEk.A1b(c117505Tk2, false)) {
                        i2 = 2048567566;
                        C0fH.A00(i2);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 5:
                int A0H9 = AbstractC166987dD.A0H(obj2);
                c5Tl = (C5Tl) obj3;
                int A0H10 = AbstractC166987dD.A0H(obj4);
                if ((A0H10 & 6) == 0) {
                    i = AbstractC25232BEp.A0R(c5Tl, obj) | A0H10;
                } else {
                    i = A0H10;
                }
                if ((A0H10 & 48) == 0) {
                    i |= AbstractC25232BEp.A09(c5Tl, A0H9);
                }
                if ((i & 147) != 146 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        AbstractC25225BEi.A1J(-536371978);
                    }
                    C25984BeY c25984BeY = (C25984BeY) AbstractC25225BEi.A13(this.A03, A0H9);
                    c5Tl.Eno(1258444134);
                    AbstractC28441Cgp.A02(c5Tl, (EnumC27380C6j) this.A04, c25984BeY, (InterfaceC16660sJ) this.A02, (InterfaceC16610sE) this.A01, i & 14 & 112);
                    if (AbstractC25230BEn.A1Y(c5Tl)) {
                        i2 = 978600094;
                        C0fH.A00(i2);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            default:
                int A0H11 = AbstractC166987dD.A0H(obj2);
                c5Tl = (C5Tl) obj3;
                int A0H12 = AbstractC166987dD.A0H(obj4);
                if ((A0H12 & 6) == 0) {
                    i7 = A0H12 | AbstractC25232BEp.A0R(c5Tl, obj);
                } else {
                    i7 = A0H12;
                }
                if ((A0H12 & 48) == 0) {
                    i7 |= AbstractC25232BEp.A09(c5Tl, A0H11);
                }
                if ((i7 & 147) != 146 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        AbstractC25225BEi.A1J(-95370395);
                    }
                    C45110Jxf c45110Jxf = (C45110Jxf) AbstractC25225BEi.A13(this.A02, A0H11);
                    C1130158n A0N = AbstractC25225BEi.A0N(c5Tl, 559212842);
                    InterfaceC1127857k A023 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
                    int A004 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk3 = (C117505Tk) c5Tl;
                    C59P A043 = C117505Tk.A04(c117505Tk3);
                    Modifier A014 = C5X3.A01(c5Tl, A0N);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk3);
                    AbstractC25231BEo.A12(c5Tl, A023, A043);
                    InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
                    if (c117505Tk3.A0K || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A004);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A014);
                    BY1.A05(c5Tl, BHY.A01(c5Tl, (C5QE) c45110Jxf.A01));
                    String str = c45110Jxf.A02;
                    C118125Vw A0g = AbstractC25226BEj.A0g(c5Tl);
                    long A0G = AbstractC25226BEj.A0G(c5Tl);
                    if (AbstractC25227BEk.A1U(c5Tl, 38334593)) {
                        C0fH.A01(1860382837, "com.instagram.direct.fragment.thread.keymanagement.mvvm.ui.publicIdentityModifier (EncryptedDeviceList.kt:110)");
                    }
                    Modifier A0E = AbstractC118175Wb.A0E(A0N, C5XT.A00(c5Tl), 0.0f, C5XT.A00(c5Tl), C5XT.A02(c5Tl, R.dimen.abc_edit_text_inset_top_material));
                    if (C0fH.A02()) {
                        C0fH.A00(-983505084);
                    }
                    C117505Tk.A0L(c117505Tk3, false);
                    Boolean A0b2 = AbstractC166997dE.A0b();
                    c5Tl.Eno(-1421191310);
                    C25864BcJ c25864BcJ = (C25864BcJ) this.A04;
                    boolean A1R = AbstractC25231BEo.A1R(c5Tl, c25864BcJ, c45110Jxf);
                    Object EEc = c5Tl.EEc();
                    if (A1R || EEc == C5UI.A00) {
                        EEc = new MCI(c45110Jxf, c25864BcJ, null);
                        c5Tl.FBy(EEc);
                    }
                    C5WR.A0R(c5Tl, AbstractC25229BEm.A0U(c117505Tk3, A0E, EEc, A0b2, false), A0g, str, A0G);
                    long j = c45110Jxf.A00;
                    if (AbstractC25227BEk.A1U(c5Tl, -1519473994)) {
                        C0fH.A01(294538099, "com.instagram.direct.fragment.thread.keymanagement.mvvm.ui.getLastSeen (EncryptedDeviceList.kt:98)");
                    }
                    if (j > 0) {
                        c5Tl.Eno(962608067);
                        A00 = AnonymousClass001.A0T(AbstractC136736Hc.A00(c5Tl, 2131959096), DateFormat.getDateInstance().format(new Date(j)), ' ');
                    } else {
                        c5Tl.Eno(962880495);
                        A00 = AbstractC136736Hc.A00(c5Tl, 2131959097);
                    }
                    if (AbstractC25227BEk.A1b(c117505Tk3, false)) {
                        C0fH.A00(-655298018);
                    }
                    C117505Tk.A0L(c117505Tk3, false);
                    C5WR.A0R(c5Tl, AbstractC118175Wb.A0E(A0N, C5XT.A00(c5Tl), 0.0f, C5XT.A00(c5Tl), 0.0f), AbstractC25225BEi.A0Y(c5Tl), A00, AbstractC25226BEj.A0M(c5Tl));
                    c5Tl.Eno(-1421169248);
                    InterfaceC74963Ym interfaceC74963Ym = (InterfaceC74963Ym) this.A03;
                    if (((C45094JxO) interfaceC74963Ym.getValue()).A05 && C14360o3.A0K(((C45094JxO) interfaceC74963Ym.getValue()).A04, c45110Jxf)) {
                        long j2 = ((C45094JxO) interfaceC74963Ym.getValue()).A01;
                        boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c25864BcJ, -1421166314);
                        Object EEc2 = c5Tl.EEc();
                        if (A1Z || EEc2 == C5UI.A00) {
                            EEc2 = new C37060GUu(c25864BcJ, 13);
                            c5Tl.FBy(EEc2);
                        }
                        AbstractC28413CgJ.A00(c5Tl, null, null, AbstractC25225BEi.A1A(c117505Tk3, EEc2, false), C5UA.A01(c5Tl, new DSA(6, this.A01, c25864BcJ), 2075432219), DalvikInternals.IOPRIO_BACKGROUND, 9, j2);
                    }
                    C117505Tk.A0L(c117505Tk3, false);
                    c5Tl.ASW();
                    if (AbstractC25227BEk.A1b(c117505Tk3, false)) {
                        i2 = 678953570;
                        C0fH.A00(i2);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
        }
        return C0eB.A00;
    }
}
