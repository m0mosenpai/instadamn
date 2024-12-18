package X;

import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creator.achievements.modules.models.Badge;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DcT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30546DcT extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30546DcT(Object obj, Object obj2, Object obj3, String str, int i) {
        super(3);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A04 = str;
        this.A02 = obj3;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        C5Tl c5Tl = (C5Tl) obj2;
        switch (this.A00) {
            case 0:
                if (AbstractC25229BEm.A1X(obj3)) {
                    C0fH.A01(-1345539656, "com.instagram.barcelona.feed.mediaviewer.ui.MediaViewerScreen.<anonymous>.<anonymous>.<anonymous> (MediaViewerScreen.kt:492)");
                }
                C2DC A00 = C5Y7.A00(c5Tl, R.drawable.instagram_more_horizontal_pano_outline_24, 0);
                String A002 = C5YD.A00(c5Tl, 2131953721);
                C1130158n c1130158n = Modifier.A00;
                C5XQ A0W = AbstractC25225BEi.A0W(0);
                c5Tl.Eno(-257572663);
                Object obj4 = this.A03;
                boolean AH4 = c5Tl.AH4(obj4);
                Object obj5 = this.A01;
                boolean A1X = AbstractC25225BEi.A1X(c5Tl, obj5, AH4);
                String str = this.A04;
                boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, str, A1X);
                Object obj6 = this.A02;
                Object EEc = c5Tl.EEc();
                if (A1X2 || EEc == C5UI.A00) {
                    EEc = new ME8(obj5, obj4, obj6, str, 4);
                    c5Tl.FBy(EEc);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                C5YS.A09(c5Tl, AbstractC118185Wd.A04(AbstractC118635Yc.A02(c5Tl, c1130158n, A0W, (InterfaceC16820sZ) EEc)), A00, A002, AbstractC25233BEq.A07(c5Tl, AbstractC25226BEj.A0D(c5Tl)));
                if (C0fH.A02()) {
                    i = 2019170808;
                    C0fH.A00(i);
                    break;
                }
                break;
            case 1:
                if (AbstractC25228BEl.A0E(obj3) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-147985079, "com.instagram.creator.achievements.modules.views.EarnedAchievementsScreen.<anonymous>.<anonymous>.<anonymous> (EarnedAchievementsScreen.kt:32)");
                    }
                    List list = (List) this.A01;
                    if (list != null) {
                        UserSession userSession = (UserSession) this.A03;
                        FragmentActivity fragmentActivity = (FragmentActivity) this.A02;
                        String str2 = this.A04;
                        Iterator A0x = AbstractC25227BEk.A0x(c5Tl, list, 1427843744);
                        while (A0x.hasNext()) {
                            AbstractC27645CHq.A00(c5Tl, fragmentActivity, userSession, (Badge) A0x.next(), str2, 584);
                        }
                        C117505Tk c117505Tk = (C117505Tk) c5Tl;
                        C117505Tk.A0L(c117505Tk, false);
                        if (AbstractC25227BEk.A04(c5Tl, list, 1427847979) % 3 == 2) {
                            AbstractC27652CHx.A00(c5Tl, 0);
                        }
                        C117505Tk.A0L(c117505Tk, false);
                    }
                    if (C0fH.A02()) {
                        i = -2054940549;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 2:
                int A0H = AbstractC166987dD.A0H(obj3);
                C14360o3.A0B(obj, 0);
                if ((A0H & 81) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1698860682, "com.instagram.creator.achievements.modules.views.EarnedAchievementsScreen.<anonymous>.<anonymous> (EarnedAchievementsScreen.kt:28)");
                    }
                    AbstractC28419CgQ.A02(AbstractC118255Wn.A04, null, null, c5Tl, AbstractC118175Wb.A05(AbstractC25226BEj.A0T(Modifier.A00)), C5UA.A01(c5Tl, new C30546DcT(this.A03, this.A01, this.A02, this.A04, 1), 753971369), 3, 0, 1575990, 52);
                    if (C0fH.A02()) {
                        i = -387331516;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            default:
                int A0H2 = AbstractC166987dD.A0H(obj3);
                C14360o3.A0B(obj, 0);
                if ((A0H2 & 17) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1916288718, "instagram.features.clips.bottomsheet.blend.ui.BlendSuggestedUsersForReelListComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlendContextBottomSheetComposables.kt:151)");
                    }
                    C2JS c2js = (C2JS) this.A03;
                    C2DB A003 = AbstractC43541zP.A00(c5Tl, AbstractC25225BEi.A0t(c2js.A0C("profile_pic_url")));
                    Object obj7 = this.A02;
                    String str3 = this.A04;
                    C5TR A01 = C5UA.A01(c5Tl, new C30537DcK(obj7, A003, str3, 3), -862273014);
                    String A08 = c2js.A08(AbstractC50531MSk.A00());
                    if (A08 == null) {
                        A08 = "";
                    }
                    String A09 = c2js.A09("full_name");
                    boolean coercedBooleanField = c2js.getCoercedBooleanField(4, "is_verified");
                    boolean contains = c2js.getCoercedCompactedIntListField(3, "account_badges").contains(0);
                    c5Tl.Eno(-809142604);
                    Object obj8 = this.A01;
                    boolean A1X3 = AbstractC25225BEi.A1X(c5Tl, str3, c5Tl.AH6(obj8));
                    Object EEc2 = c5Tl.EEc();
                    if (A1X3 || EEc2 == C5UI.A00) {
                        EEc2 = new C57259Pbh(str3, obj8, 30);
                        c5Tl.FBy(EEc2);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    BI4.A02(c5Tl, null, null, null, A08, A09, null, (InterfaceC16820sZ) EEc2, A01, null, 6, 0, 1428, coercedBooleanField, contains);
                    if (C0fH.A02()) {
                        i = -935088524;
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
