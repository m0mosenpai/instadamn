package X;

import com.facebook.R;
import com.instagram.wonderwall.model.WallImage;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallMenuConfig;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallText;
import com.instagram.wonderwall.repository.WallPostRepository;
import java.util.List;

/* renamed from: X.CKh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27714CKh {
    public static final WallMenuConfig A00(WallInfo wallInfo, WallPostInfo wallPostInfo, WallPostItem wallPostItem, WallPostRepository wallPostRepository, InterfaceC31058Dl0 interfaceC31058Dl0, C19L c19l) {
        C7B c7b;
        C7B c7b2;
        AbstractC167007dF.A1F(wallPostRepository, 2, wallPostInfo);
        WallMenuConfig wallMenuConfig = new WallMenuConfig();
        WallPostInfo Bez = wallPostItem.Bez();
        int i = 2131976983;
        if (Bez.A09) {
            i = 2131976985;
        }
        WallText.Res A10 = AbstractC25228BEl.A10(i);
        boolean z = wallPostInfo.A09;
        int i2 = R.drawable.instagram_pin_pano_outline_24;
        if (z) {
            i2 = R.drawable.instagram_unpin_pano_outline_24;
        }
        C27916CSb c27916CSb = new C27916CSb(new WallImage.Drawable(i2), A10, new C29895DGj(33, wallPostItem, wallPostRepository), false, false);
        boolean z2 = wallInfo.A03;
        if (!z2 || wallPostInfo.A01()) {
            c27916CSb = null;
        }
        C27916CSb c27916CSb2 = new C27916CSb(new WallImage.Drawable(R.drawable.instagram_delete_pano_outline_24), AbstractC25228BEl.A10(2131976981), C29901DGp.A00(c19l, interfaceC31058Dl0, wallPostRepository, wallPostItem, 30), true, false);
        boolean z3 = wallPostInfo.A0B;
        if (!z3 || wallPostInfo.A01()) {
            c27916CSb2 = null;
        }
        C27916CSb c27916CSb3 = new C27916CSb(new WallImage.Drawable(R.drawable.instagram_arrow_cw_pano_outline_24), AbstractC25228BEl.A10(2131972568), new C43210J8h(46, wallPostRepository, wallPostItem, wallInfo), false, false);
        boolean z4 = Bez.A0B;
        if (!z4 || wallPostInfo.A00 >= 2 || ((c7b2 = wallPostInfo.A05) != C7B.A09 && c7b2 != C7B.A07)) {
            c27916CSb3 = null;
        }
        C27916CSb c27916CSb4 = new C27916CSb(new WallImage.Drawable(R.drawable.instagram_delete_pano_outline_24), AbstractC25228BEl.A10(2131960921), new C43210J8h(47, wallPostRepository, wallPostItem, c19l), true, false);
        if (!z4 || ((c7b = wallPostInfo.A05) != C7B.A09 && c7b != C7B.A07 && c7b != C7B.A06)) {
            c27916CSb4 = null;
        }
        C27916CSb c27916CSb5 = new C27916CSb(new WallImage.Drawable(R.drawable.instagram_eye_off_pano_outline_24), AbstractC25228BEl.A10(2131976982), new C43210J8h(48, wallPostRepository, wallPostItem, c19l), false, false);
        if (!z2 || z3) {
            c27916CSb5 = null;
        }
        C27916CSb c27916CSb6 = new C27916CSb(new WallImage.Drawable(R.drawable.instagram_block_pano_outline_24), new WallText.Res(2131976980, new String[]{wallPostInfo.A03.getUsername()}), new C43210J8h(44, interfaceC31058Dl0, c19l, wallPostInfo), true, false);
        if (!z2 || z3) {
            c27916CSb6 = null;
        }
        C27916CSb c27916CSb7 = new C27916CSb(new WallImage.Drawable(R.drawable.instagram_report_pano_outline_24), AbstractC25228BEl.A10(2131976984), new C43210J8h(45, interfaceC31058Dl0, wallPostItem, c19l), true, false);
        if (!z2 || z3) {
            c27916CSb7 = null;
        }
        C27916CSb[] c27916CSbArr = {c27916CSb, c27916CSb2, c27916CSb3, c27916CSb4, c27916CSb5, c27916CSb6, c27916CSb7};
        C14360o3.A0B(c27916CSbArr, 0);
        List A0I = AbstractC009903n.A0I(c27916CSbArr);
        List list = wallMenuConfig.A01;
        list.addAll(A0I);
        if (!AbstractC166987dD.A1b(list)) {
            return null;
        }
        return wallMenuConfig;
    }
}
