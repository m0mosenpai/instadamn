package X;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AnD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24128AnD implements C7XU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C24128AnD(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
    }

    @Override // X.C7XU
    public final void DAy() {
        C210099Qy c210099Qy;
        EnumC172837mv enumC172837mv;
        switch (this.A00) {
            case 0:
                AbstractC226299ym.A00((Activity) this.A01, (Fragment) this.A02, (UserSession) this.A03);
                return;
            case 1:
                A5V a5v = (A5V) this.A02;
                GalleryGridFormat galleryGridFormat = (GalleryGridFormat) this.A01;
                List list = (List) this.A03;
                C14360o3.A0B(list, 1);
                int ordinal = galleryGridFormat.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 1) {
                        C8YY c8yy = a5v.A00.A0w;
                        UserSession userSession = c8yy.A0E;
                        C198438ps A00 = AbstractC198428pr.A00(userSession);
                        C22P c22p = c8yy.A0O.A00.A01;
                        C55U A02 = C1810981l.A02(c8yy.A0F);
                        ArrayList A0q = AbstractC167017dG.A0q(list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            A0q.add(((C09530e4) it.next()).A00);
                        }
                        A00.A00(c22p, A02, AnonymousClass229.A01(userSession).A0R(), A0q, true);
                        C23790Ag1 c23790Ag1 = (C23790Ag1) c8yy.A0W.A00.A00();
                        C0fJ.A00((Dialog) c23790Ag1.A0F.getValue());
                        c23790Ag1.A07.A03(0);
                        int size = list.size();
                        c23790Ag1.A00 = size;
                        EnumC172837mv[] enumC172837mvArr = AbstractC172827mu.A00;
                        ArrayList A1E = AbstractC166987dD.A1E();
                        AnonymousClass016.A18(A1E, AbstractC172827mu.A01);
                        AnonymousClass016.A18(A1E, AbstractC172827mu.A02);
                        C210089Qx c210089Qx = c23790Ag1.A0B;
                        List list2 = c210089Qx.A01;
                        if (list2.size() != A1E.size()) {
                            c210089Qx.A02.clear();
                            c210089Qx.A03.clear();
                            c210089Qx.A04.clear();
                            list2.clear();
                            Iterator it2 = A1E.iterator();
                            while (it2.hasNext()) {
                                EnumC172837mv enumC172837mv2 = (EnumC172837mv) it2.next();
                                AbstractC226629zK abstractC226629zK = AbstractC226629zK.$redex_init_class;
                                switch (enumC172837mv2.ordinal()) {
                                    case 0:
                                        c210089Qx.A07();
                                        continue;
                                    case 1:
                                        c210099Qy = c210089Qx.A00;
                                        enumC172837mv = EnumC172837mv.A0E;
                                        break;
                                    case 2:
                                        c210089Qx.A06();
                                        continue;
                                    case 3:
                                        c210099Qy = c210089Qx.A00;
                                        enumC172837mv = EnumC172837mv.A0D;
                                        break;
                                    case 4:
                                        c210089Qx.A09();
                                        continue;
                                    case 5:
                                        c210099Qy = c210089Qx.A00;
                                        enumC172837mv = EnumC172837mv.A0B;
                                        break;
                                    case 6:
                                        c210089Qx.A05();
                                        continue;
                                    case 7:
                                        c210099Qy = c210089Qx.A00;
                                        enumC172837mv = EnumC172837mv.A0A;
                                        break;
                                    case 8:
                                        c210089Qx.A08();
                                        continue;
                                    case 9:
                                        c210099Qy = c210089Qx.A00;
                                        enumC172837mv = EnumC172837mv.A0C;
                                        break;
                                    default:
                                        AbstractC12120kG.A07("LayoutPostCaptureController", AnonymousClass001.A0R("Unsupported layout configuration: ", c23790Ag1.A01.A05), null);
                                        continue;
                                }
                                C210089Qx.A01(c210089Qx, C210099Qy.A00(c210099Qy, enumC172837mv));
                            }
                        }
                        EnumC172837mv[] A002 = AbstractC172827mu.A00(size);
                        EnumC172837mv enumC172837mv3 = (EnumC172837mv) AbstractC009903n.A05(A002);
                        c23790Ag1.A01 = enumC172837mv3;
                        GridLayoutManager gridLayoutManager = c23790Ag1.A04;
                        gridLayoutManager.A1v(enumC172837mv3.A00);
                        AbstractC154146wP abstractC154146wP = c23790Ag1.A01.A04;
                        if (abstractC154146wP == null) {
                            abstractC154146wP = new AbstractC154146wP();
                        }
                        gridLayoutManager.A01 = abstractC154146wP;
                        C218249kw c218249kw = (C218249kw) c23790Ag1.A0E.getValue();
                        c218249kw.A01.A05(AbstractC009903n.A0J(A002));
                        AbstractC13880nE.A0u(((C8J9) c218249kw).A01.A0P, new CallableC24924B0x(c218249kw, 5));
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        int size2 = list.size();
                        for (int i = 0; i < size2; i++) {
                            C22918A8o A04 = c210089Qx.A04(c23790Ag1.A01, i);
                            C56302iJ A03 = c210089Qx.A03(c23790Ag1.A01, i);
                            Bitmap bitmap = (Bitmap) ((C09530e4) list.get(i)).A01;
                            Medium medium = (Medium) ((C09530e4) list.get(i)).A00;
                            AbstractC224309vG A003 = AbstractC178007vZ.A00(null, c23790Ag1.A06, medium.A0X, true);
                            if (A003 != null) {
                                String A022 = A003.A02();
                                if (!AbstractC001900j.A0T(A022)) {
                                    medium.A0G.A03 = A022;
                                }
                            }
                            if (A03 != null) {
                                A1E2.add(new C22919A8p(bitmap, A03, medium, A04));
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                        C006802i.A0p.markerStart(18943966, "total_photos", String.valueOf(size));
                        UH0 uh0 = c23790Ag1.A0C;
                        uh0.A00 = new ABL(c23790Ag1, uh0, size);
                        ArrayList arrayList = uh0.A05;
                        arrayList.clear();
                        arrayList.addAll(A1E2);
                        uh0.notifyDataSetChanged();
                        c8yy.A0M.A02.A01.A03 = GalleryGridFormat.A07;
                        return;
                    }
                    throw AbstractC167007dF.A0c("Unsupported gallery format: ", galleryGridFormat.name());
                }
                C193838i4 c193838i4 = a5v.A00;
                ArrayList A0q2 = AbstractC167017dG.A0q(list);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    A0q2.add(AbstractC167017dG.A0d((Medium) ((C09530e4) it3.next()).A00));
                }
                C193838i4.A0K(c193838i4, A0q2);
                return;
            default:
                ((C189478aR) this.A02).A02((Activity) this.A01, (Fragment) this.A03);
                return;
        }
    }

    @Override // X.C7XU
    public final void DB3() {
    }
}
