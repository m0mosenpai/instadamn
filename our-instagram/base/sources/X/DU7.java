package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;

/* loaded from: classes5.dex */
public final class DU7 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ WallPostInfo A00;
    public final /* synthetic */ WallPostItem A01;
    public final /* synthetic */ InterfaceC31065Dl7 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DU7(WallPostInfo wallPostInfo, WallPostItem wallPostItem, InterfaceC31065Dl7 interfaceC31065Dl7, String str, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        super(2);
        this.A00 = wallPostInfo;
        this.A04 = interfaceC16660sJ;
        this.A06 = z;
        this.A03 = str;
        this.A01 = wallPostItem;
        this.A02 = interfaceC31065Dl7;
        this.A05 = z2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1290259173, "com.instagram.wonderwall.ui.compose.components.WallPost.<anonymous> (WallPost.kt:68)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A08 = AbstractC118175Wb.A08(c1130158n, 8.0f);
            WallPostInfo wallPostInfo = this.A00;
            InterfaceC16660sJ interfaceC16660sJ = this.A04;
            boolean z = this.A06;
            String str = this.A03;
            WallPostItem wallPostItem = this.A01;
            InterfaceC31065Dl7 interfaceC31065Dl7 = this.A02;
            boolean z2 = this.A05;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            User user = wallPostInfo.A03;
            String id = user.getId();
            String username = user.getUsername();
            ImageUrl Bhu = user.Bhu();
            C6X c6x = C6X.A02;
            CKX.A00(c5Tl, Bhu, wallPostInfo.A05, c6x, id, username, interfaceC16660sJ, C5UA.A01(c5Tl, new C30519Dc2(wallPostInfo, 12), 1551171271), 12585984, 32, false);
            c5Tl.Eno(793802695);
            if (z) {
                WallInfo wallInfo = wallPostInfo.A04;
                if (!C14360o3.A0K(str, wallInfo.A01)) {
                    String id2 = user.getId();
                    User user2 = wallInfo.A00;
                    if (!C14360o3.A0K(id2, user2.getId())) {
                        CKX.A00(c5Tl, user2.Bhu(), null, c6x, user2.getId(), user2.getUsername(), interfaceC16660sJ, null, 199680, 144, true);
                    }
                }
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC25226BEj.A1O(c5Tl, c1130158n, 8.0f);
            AbstractC28404CgA.A03(c5Tl, wallPostItem, interfaceC31065Dl7, 8.0f, 48, 0, z2);
            AbstractC28403Cg9.A02(c5Tl, wallPostItem, null, 8.0f, 48, 28, false, false);
            c5Tl.Eno(793822973);
            if (!wallPostItem.Bez().A01() && str != null) {
                boolean A002 = wallPostInfo.A00();
                InterfaceC31065Dl7 interfaceC31065Dl72 = null;
                if (A002) {
                    interfaceC31065Dl72 = interfaceC31065Dl7;
                }
                AbstractC27707CKa.A00(c5Tl, wallPostItem, interfaceC31065Dl72, 0, 0);
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC25226BEj.A1O(c5Tl, c1130158n, 4.0f);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1226532793);
            }
        }
        return C0eB.A00;
    }
}
