package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.barcelonaig.fragment.BarcelonaIgViewModel$handleWebLinkClick$1;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$commentLikeClicked$1;
import java.util.Map;

/* renamed from: X.Dfq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30753Dfq extends C0YY implements InterfaceC16590sC {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30753Dfq(Object obj, int i) {
        super(5);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C141796aw A00;
        InterfaceC16620sF barcelonaIgViewModel$handleWebLinkClick$1;
        Object obj6;
        switch (this.A00) {
            case 0:
                AbstractC25225BEi.A1R(obj2);
                String str = (String) obj3;
                C5Tl c5Tl = (C5Tl) obj4;
                int A0H = AbstractC166987dD.A0H(obj5);
                int i = 0;
                AbstractC167007dF.A1D(obj, 0, str);
                if ((A0H & 384) == 0) {
                    A0H |= AbstractC25232BEp.A0T(c5Tl, str);
                }
                if ((A0H & 1153) == 1152 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                } else {
                    if (C0fH.A02()) {
                        C0fH.A01(284522705, "com.instagram.barcelona.feed.post.ui.RelevantTagsRow.<anonymous>.<anonymous>.<anonymous> (RelevantTagsRow.kt:51)");
                    }
                    boolean z = false;
                    C2DC A002 = C5Y7.A00(c5Tl, R.drawable.barcelona_search_filled_26, 0);
                    long A0C = AbstractC25226BEj.A0C(c5Tl);
                    C1130158n c1130158n = Modifier.A00;
                    C5YS.A04(c5Tl, AbstractC118185Wd.A0C(AbstractC25227BEk.A0I(c1130158n, 6.0f), 12.0f), A002, A0C);
                    long A0C2 = AbstractC25226BEj.A0C(c5Tl);
                    C118125Vw A0c = AbstractC25226BEj.A0c(c5Tl);
                    C118125Vw c118125Vw = C118125Vw.A03;
                    long j = 0;
                    long A01 = AbstractC118155Vz.A01(13);
                    C118125Vw A0D = A0c.A0D(new C118125Vw(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 16777213, j, A01, j, j));
                    c5Tl.Eno(-250959487);
                    Object obj7 = this.A01;
                    boolean AH4 = c5Tl.AH4(obj7);
                    if ((A0H & 896) == 256) {
                        z = true;
                    }
                    boolean z2 = AH4 | z;
                    Object EEc = c5Tl.EEc();
                    if (z2 || EEc == C5UI.A00) {
                        EEc = AbstractC25230BEn.A14(c5Tl, obj7, str, 17);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    C5WR.A0N(c5Tl, AbstractC118635Yc.A04(c5Tl, c1130158n, (InterfaceC16820sZ) EEc), A0D, str, (A0H >> 6) & 14, A0C2);
                    if (C0fH.A02()) {
                        C0fH.A00(1086099854);
                    }
                }
                return C0eB.A00;
            case 1:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                C2Fb c2Fb = (C2Fb) obj3;
                long A0N = AbstractC166987dD.A0N(obj4);
                AbstractC167027dH.A12(str2, str3, c2Fb);
                C25797BbE c25797BbE = (C25797BbE) this.A01;
                A00 = AbstractC141776au.A00(c25797BbE);
                barcelonaIgViewModel$handleWebLinkClick$1 = new BarcelonaIgViewModel$handleWebLinkClick$1(c25797BbE, c2Fb, str2, str3, (String) obj5, null, A0N);
                AbstractC166987dD.A1Z(barcelonaIgViewModel$handleWebLinkClick$1, A00);
                return C0eB.A00;
            case 2:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                EnumC185018Iq enumC185018Iq = (EnumC185018Iq) obj2;
                C22952A9w c22952A9w = (C22952A9w) obj3;
                float A09 = AbstractC166987dD.A09(obj4);
                float A092 = AbstractC166987dD.A09(obj5);
                C14360o3.A0B(enumC185018Iq, 1);
                if (booleanValue && c22952A9w != null) {
                    W37 w37 = (W37) this.A01;
                    Map map = w37.A04;
                    if (!map.containsKey(enumC185018Iq)) {
                        w37.A09 = enumC185018Iq;
                        map.put(enumC185018Iq, c22952A9w);
                    }
                    C22952A9w c22952A9w2 = (C22952A9w) map.get(enumC185018Iq);
                    if (c22952A9w2 != null) {
                        String str4 = c22952A9w.A04;
                        C22952A9w.A00(c22952A9w2.A05);
                        c22952A9w2.A05 = str4;
                        if (A09 >= 0.0f) {
                            c22952A9w2.A00 = A09;
                        }
                        if (A092 >= 0.0f && A092 >= c22952A9w2.A00) {
                            c22952A9w2.A01 = A092;
                        }
                    }
                }
                W37 w372 = (W37) this.A01;
                w372.A05.set(0);
                InterfaceC16620sF interfaceC16620sF = w372.A02;
                if (interfaceC16620sF != null) {
                    if (c22952A9w != null) {
                        obj6 = c22952A9w.A04;
                    } else {
                        obj6 = null;
                    }
                    interfaceC16620sF.invoke(bool, obj6);
                }
                return C0eB.A00;
            case 3:
            case 4:
            default:
                InterfaceC16600sD interfaceC16600sD = (InterfaceC16600sD) ((C50627MWo) ((C44135Jf0) this.A01).A00).A01;
                C14360o3.A0A(obj);
                C14360o3.A0A(obj2);
                interfaceC16600sD.invoke(obj, obj2, obj3, obj5);
                return null;
            case 5:
                String str5 = (String) obj;
                String str6 = (String) obj2;
                AbstractC167007dF.A1K(str5, str6);
                ((NKB) this.A01).A08(new C51685MsG(null, null, str6, (String) obj5, (String) obj3, str5, 0, false));
                return null;
            case 6:
                C38321qM c38321qM = (C38321qM) obj;
                C75113Zb c75113Zb = (C75113Zb) obj2;
                int A0H2 = AbstractC166987dD.A0H(obj3);
                String str7 = (String) obj4;
                AbstractC167017dG.A1N(c38321qM, c75113Zb);
                C14360o3.A0B(str7, 3);
                ((CTA) this.A01).A03.DOu(c38321qM, c75113Zb, str7, new DGY(obj5, 24), A0H2);
                return C0eB.A00;
            case 7:
                boolean A1a = AbstractC166987dD.A1a(obj);
                C5HW c5hw = (C5HW) obj2;
                int A0H3 = AbstractC166987dD.A0H(obj3);
                boolean A1a2 = AbstractC166987dD.A1a(obj4);
                C14360o3.A0B(c5hw, 1);
                ActivityFeedViewModel activityFeedViewModel = (ActivityFeedViewModel) this.A01;
                A00 = AbstractC141776au.A00(activityFeedViewModel);
                barcelonaIgViewModel$handleWebLinkClick$1 = new ActivityFeedViewModel$commentLikeClicked$1((MUD) obj5, c5hw, activityFeedViewModel, null, A0H3, A1a2, A1a);
                AbstractC166987dD.A1Z(barcelonaIgViewModel$handleWebLinkClick$1, A00);
                return C0eB.A00;
            case 8:
                C38321qM c38321qM2 = (C38321qM) obj;
                C5qT c5qT = (C5qT) obj2;
                AbstractC25225BEi.A1R(obj3);
                View view = (View) obj4;
                MotionEvent motionEvent = (MotionEvent) obj5;
                C14360o3.A0B(c38321qM2, 0);
                AbstractC25233BEq.A0w(1, c5qT, view, motionEvent);
                C30A c30a = ((AbstractC67878V0j) this.A01).A09;
                if (c30a == null) {
                    C14360o3.A0F("previewMediaController");
                    throw C00O.createAndThrow();
                }
                return Boolean.valueOf(c30a.DuC(motionEvent, view, c38321qM2, (c5qT.A01 * 3) + c5qT.A00));
            case 9:
                AbstractC167017dG.A1N(obj, obj2);
                ((C41176IKp) this.A01).A08.invoke(obj, obj2);
                return C0eB.A00;
        }
    }
}
