package X;

import android.content.res.Configuration;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.R;
import com.instagram.api.schemas.LineType;
import java.util.List;

/* renamed from: X.DcS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30545DcS extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30545DcS(int i, Object obj, Object obj2, Object obj3, boolean z) {
        super(3);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = z;
        this.A01 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        C117505Tk c117505Tk;
        Modifier A02;
        C2DC A00;
        int i2;
        C5Tl c5Tl = (C5Tl) obj2;
        switch (this.A00) {
            case 0:
                if (AbstractC25228BEl.A0D(obj3) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1930829079, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:766)");
                    }
                    InterfaceC132245y2 interfaceC132245y2 = (InterfaceC132245y2) this.A03;
                    C9C5 c9c5 = (C9C5) interfaceC132245y2;
                    InterfaceC132185xw interfaceC132185xw = (InterfaceC132185xw) c9c5.A02;
                    C38641Gyi c38641Gyi = (C38641Gyi) c9c5.A01;
                    LineType lineType = (LineType) this.A02;
                    boolean z = this.A04;
                    boolean z2 = ((C26036BfP) c9c5.A03).A00;
                    float f = 12.0f;
                    if (z) {
                        f = 16.0f;
                    }
                    float f2 = 16.0f;
                    if (z2) {
                        f2 = 0.0f;
                    }
                    C25982BeW c25982BeW = new C25982BeW(new C1333560c(12.0f, 0.0f, f, f2), z);
                    boolean z3 = c9c5.A06;
                    c5Tl.Eno(-1660315904);
                    Object obj4 = this.A01;
                    boolean A1W = AbstractC25230BEn.A1W(c5Tl, obj4, interfaceC132245y2);
                    Object EEc = c5Tl.EEc();
                    if (A1W || EEc == C5UI.A00) {
                        EEc = new MHV(49, obj4, interfaceC132245y2);
                        c5Tl.FBy(EEc);
                    }
                    AbstractC28036CXk.A00(c5Tl, null, lineType, interfaceC132185xw, c38641Gyi, c25982BeW, (InterfaceC16820sZ) EEc, AbstractC25228BEl.A1W(c5Tl) ? 1 : 0, 32, z3);
                    if (C0fH.A02()) {
                        i = -1518037525;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 1:
                if (AbstractC25228BEl.A0D(obj3) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(2118675890, "com.instagram.creation.genai.memu.settings.MemuPhotosLayout.<anonymous> (MemuPhotosGridLayout.kt:46)");
                    }
                    List list = (List) this.A03;
                    boolean z4 = this.A04;
                    InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A02;
                    InterfaceC16620sF interfaceC16620sF2 = (InterfaceC16620sF) this.A01;
                    int i3 = 0;
                    for (Object obj5 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        AbstractC28311Cdx.A02(c5Tl, (BJF) obj5, interfaceC16620sF, interfaceC16620sF2, i3, 0, z4);
                        i3 = i4;
                    }
                    if (C0fH.A02()) {
                        i = 1504797227;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 2:
                int A0H = AbstractC166987dD.A0H(obj3);
                C14360o3.A0B(obj, 0);
                if ((A0H & 17) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(176847475, "com.instagram.newsfeed.compose.ui.SuggestedUserRow.<anonymous> (SuggestedUserRow.kt:77)");
                    }
                    AbstractC25276BGq.A00(c5Tl, null, (BJ3) this.A01, null, (InterfaceC16820sZ) this.A03, 0, 6);
                    if (this.A04) {
                        if (((Configuration) c5Tl.AJX(AndroidCompositionLocals_androidKt.A00)).screenWidthDp < 320) {
                            C1130158n A0N = AbstractC25225BEi.A0N(c5Tl, 2137777755);
                            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1732151492);
                            Object obj6 = C5UI.A00;
                            C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(c5Tl, A0q, obj6);
                            c117505Tk = AbstractC25225BEi.A0K(c5Tl, false);
                            InterfaceC118075Vr interfaceC118075Vr = (InterfaceC118075Vr) c5Tl.AJX(C5WM.A00);
                            c5Tl.Eno(-1732147373);
                            Object obj7 = this.A02;
                            boolean AH4 = c5Tl.AH4(obj7);
                            Object EEc2 = c5Tl.EEc();
                            if (AH4 || EEc2 == obj6) {
                                EEc2 = AbstractC25230BEn.A0z(c5Tl, obj7, 33);
                            }
                            A02 = C5XR.A02(interfaceC118075Vr, c5xo, A0N, AbstractC25225BEi.A1A(c117505Tk, EEc2, false));
                            A00 = C5Y7.A00(c5Tl, R.drawable.instagram_more_vertical_pano_outline_24, 0);
                            i2 = 2131966337;
                        } else {
                            Modifier A0K = AbstractC25227BEk.A0K(AbstractC25225BEi.A0N(c5Tl, 2138312350), 4.0f);
                            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1732132836);
                            Object obj8 = C5UI.A00;
                            C5XO c5xo2 = (C5XO) AbstractC25232BEp.A1C(c5Tl, A0q2, obj8);
                            c117505Tk = (C117505Tk) c5Tl;
                            C117505Tk.A0L(c117505Tk, false);
                            InterfaceC118075Vr interfaceC118075Vr2 = (InterfaceC118075Vr) c5Tl.AJX(C5WM.A00);
                            c5Tl.Eno(-1732128462);
                            Object obj9 = this.A02;
                            boolean AH42 = c5Tl.AH4(obj9);
                            Object EEc3 = c5Tl.EEc();
                            if (AH42 || EEc3 == obj8) {
                                EEc3 = AbstractC25230BEn.A0z(c5Tl, obj9, 34);
                            }
                            A02 = AbstractC118185Wd.A02(C118195Wf.A09, AbstractC118185Wd.A0C(C5XR.A02(interfaceC118075Vr2, c5xo2, A0K, AbstractC25225BEi.A1A(c117505Tk, EEc3, false)), 28.0f));
                            A00 = C5Y7.A00(c5Tl, R.drawable.small_x, 0);
                            i2 = 2131960994;
                        }
                        AbstractC25229BEm.A17(c5Tl, A02, A00, C5YD.A00(c5Tl, i2));
                        C117505Tk.A0L(c117505Tk, false);
                    }
                    if (C0fH.A02()) {
                        i = -187768989;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            default:
                int A0H2 = AbstractC166987dD.A0H(obj3);
                C14360o3.A0B(obj, 0);
                if ((A0H2 & 17) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-946824739, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequest.<anonymous> (FollowRequest.kt:44)");
                    }
                    if (this.A04) {
                        c5Tl.Eno(1737569904);
                        c5Tl.Eno(56050699);
                        Number number = (Number) this.A01;
                        if (number != null) {
                            Modifier A0I = AbstractC25227BEk.A0I(Modifier.A00, 4.0f);
                            Object obj10 = this.A03;
                            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, obj10, 56054788);
                            Object EEc4 = c5Tl.EEc();
                            if (A1Y || EEc4 == C5UI.A00) {
                                EEc4 = AbstractC25229BEm.A0t(c5Tl, obj10, 16);
                            }
                            AbstractC25225BEi.A1V(c5Tl, false);
                            CJM.A00(c5Tl, A0I, AbstractC25225BEi.A0u(c5Tl), AbstractC25228BEl.A16(c5Tl, number), (InterfaceC16820sZ) ((C0YS) EEc4), 384, 0);
                        }
                        C117505Tk A0K2 = AbstractC25225BEi.A0K(c5Tl, false);
                        Object obj11 = this.A03;
                        boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, obj11, 56061155);
                        Object EEc5 = c5Tl.EEc();
                        if (A1Y2 || EEc5 == C5UI.A00) {
                            EEc5 = AbstractC25229BEm.A0t(c5Tl, obj11, 17);
                        }
                        C0YS A1G = AbstractC25225BEi.A1G(A0K2, EEc5, false);
                        CJM.A00(c5Tl, null, AbstractC25235BEs.A0c(c5Tl, false), C5YD.A00(c5Tl, 2131957640), (InterfaceC16820sZ) A1G, 0, 4);
                    } else {
                        c5Tl.Eno(1738043770);
                        AbstractC25227BEk.A1P(c5Tl, (InterfaceC16620sF) this.A02, 0);
                    }
                    if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                        i = 774327114;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
        }
    }
}
