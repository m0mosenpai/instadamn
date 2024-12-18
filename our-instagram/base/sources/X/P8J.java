package X;

import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class P8J implements InterfaceC81993lL {
    public final int A00;
    public final Object A01;

    public P8J(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC81993lL
    public final void DPm(String str) {
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 0:
                interfaceC09390do = ((C52106N4e) this.A01).A04;
                break;
            case 1:
                interfaceC09390do = ((C52126N4z) this.A01).A05;
                break;
            default:
                return;
        }
        AbstractC82003lM.A00(AbstractC166987dD.A0r(interfaceC09390do)).A04(this, str);
    }

    @Override // X.InterfaceC81993lL
    public final void DPz(String str, boolean z) {
        Reel A0N;
        C1NB c1nb;
        ImageUrl AsM;
        C1NB c1nb2;
        String name;
        String str2;
        Reel A0N2;
        Object obj;
        switch (this.A00) {
            case 0:
                C52106N4e c52106N4e = (C52106N4e) this.A01;
                InterfaceC09390do interfaceC09390do = c52106N4e.A04;
                AbstractC82003lM.A00(AbstractC166987dD.A0r(interfaceC09390do)).A04(this, str);
                if (str == null || (A0N = ReelStore.A03(AbstractC166987dD.A0r(interfaceC09390do)).A0N(str)) == null || (c1nb = A0N.A0W) == null || (AsM = c1nb.AsM()) == null || (c1nb2 = A0N.A0W) == null || (name = c1nb2.getName()) == null) {
                    return;
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                java.util.Set A0Q = A0N.A0Q();
                C14360o3.A07(A0Q);
                Iterator it = A0Q.iterator();
                while (it.hasNext()) {
                    ImageUrl A1S = AbstractC31172DnG.A0i(it).A1S();
                    if (A1S != null) {
                        A1E.add(new C51817MvL(A1S, AsM, Integer.valueOf(R.drawable.instagram_story_pano_outline_24), name));
                    }
                }
                List list = c52106N4e.A03;
                list.addAll(A1E);
                C66362zD c66362zD = c52106N4e.A00;
                if (c66362zD == null) {
                    str2 = "itemAdapter";
                    break;
                } else {
                    c66362zD.A08(list);
                    return;
                }
                break;
            case 1:
                C52126N4z c52126N4z = (C52126N4z) this.A01;
                InterfaceC09390do interfaceC09390do2 = c52126N4z.A05;
                AbstractC82003lM.A00(AbstractC166987dD.A0r(interfaceC09390do2)).A04(this, str);
                if (str == null || (A0N2 = ReelStore.A03(AbstractC166987dD.A0r(interfaceC09390do2)).A0N(str)) == null) {
                    return;
                }
                C41551w4 c41551w4 = new C41551w4(AbstractC166987dD.A0r(interfaceC09390do2), A0N2, false, null, null, C16910sj.A00, -1, System.currentTimeMillis(), false);
                List list2 = c52126N4z.A04;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (obj instanceof C56075Ous) {
                        }
                    } else {
                        obj = null;
                    }
                }
                list2.add(list2.indexOf(obj), new C51811MvF(c41551w4));
                ViewModelListUpdate A0L = AbstractC43593JPy.A0L(list2);
                C66362zD c66362zD2 = c52126N4z.A00;
                if (c66362zD2 == null) {
                    str2 = "immersiveItemAdapter";
                    break;
                } else {
                    c66362zD2.A05(A0L);
                    return;
                }
                break;
            case 2:
                if (str == null) {
                    return;
                }
                HighlightsMigrationFragment.A00((HighlightsMigrationFragment) this.A01, str);
                return;
            case 3:
                C50935Mf4 c50935Mf4 = (C50935Mf4) this.A01;
                Reel A0R = MSY.A0R(c50935Mf4.A00, str);
                if (A0R == null) {
                    return;
                }
                AbstractC166987dD.A1Z(new PZX(c50935Mf4, A0R, (InterfaceC23621Ds) null, 32), AbstractC141776au.A00(c50935Mf4));
                return;
            default:
                return;
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
