package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class AKL {
    public final Context A00;
    public final C8SF A01;
    public final C66362zD A02;
    public final UserSession A03;
    public final C159407Da A04;
    public final InterfaceC195388ke A05;
    public final LinkedHashMap A06;

    public AKL(Context context, C8SF c8sf, UserSession userSession, C159407Da c159407Da, InterfaceC195388ke interfaceC195388ke) {
        AbstractC167007dF.A1G(userSession, 2, c159407Da);
        this.A00 = context;
        this.A03 = userSession;
        this.A05 = interfaceC195388ke;
        this.A01 = c8sf;
        this.A04 = c159407Da;
        C66392zG A00 = C66362zD.A00(context);
        UserSession userSession2 = this.A03;
        Integer num = C05F.A01;
        A00.A01(new C195568kw(new C9BW(4, new C206279Bk(num, num, num, (Integer) null, 24), new C206259Bi(C05F.A0C, num, C05F.A00, Integer.valueOf(((int) C18U.A01(C06090Tz.A05, userSession2, 36602046304162350L)) != 24 ? 16 : 24))), null, this.A01, userSession2, this.A05, null, C25032B6f.A00));
        A00.A08 = true;
        this.A02 = A00.A00();
        this.A06 = AbstractC166987dD.A1I();
    }

    public final void A02(List list) {
        LinkedHashMap linkedHashMap = this.A06;
        linkedHashMap.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Medium A0l = AbstractC166987dD.A0l(it);
            int CNS = this.A04.CNS(A0l);
            Integer valueOf = Integer.valueOf(A0l.A05);
            String A00 = C195778lI.A00.A00(A0l, this.A03);
            GalleryItem.LocalGalleryMedium A0d = AbstractC167017dG.A0d(A0l);
            boolean z = false;
            if (CNS != -1) {
                z = true;
            }
            linkedHashMap.put(valueOf, new C195598kz(new C9BB(null, CNS, 0, 12, 3, z, false), A0d, new C195788lL(null, null, true, false, true, false, false, false, false), A00));
        }
        A01(this);
    }

    public static final void A00(Medium medium, AKL akl) {
        LinkedHashMap linkedHashMap = akl.A06;
        if (linkedHashMap.containsKey(Integer.valueOf(medium.A05))) {
            int CNS = akl.A04.CNS(medium);
            String A00 = C195778lI.A00.A00(medium, akl.A03);
            GalleryItem.LocalGalleryMedium A0d = AbstractC167017dG.A0d(medium);
            boolean z = false;
            if (CNS != -1) {
                z = true;
            }
            linkedHashMap.put(Integer.valueOf(medium.A05), new C195598kz(new C9BB(null, CNS, 0, 12, 3, z, false), A0d, new C195788lL(null, null, true, false, true, false, false, false, false), A00));
        }
    }

    public static final void A01(AKL akl) {
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        Iterator A0k = AbstractC167007dF.A0k(akl.A06);
        while (A0k.hasNext()) {
            viewModelListUpdate.A00((C195598kz) AbstractC166997dE.A0l(A0k));
        }
        akl.A02.A05(viewModelListUpdate);
    }
}
