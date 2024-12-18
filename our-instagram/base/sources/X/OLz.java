package X;

import com.instagram.api.schemas.MediaKitVisibility;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class OLz {
    public C51847Mvp A00;
    public C51851Mvt A01;
    public final ArrayList A04 = AbstractC166987dD.A1E();
    public List A02 = C16930sl.A00;
    public final HashMap A05 = AbstractC166987dD.A1G();
    public final ArrayList A03 = AbstractC166987dD.A1E();

    public final void A02(List list) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C51851Mvt c51851Mvt = (C51851Mvt) it.next();
            this.A05.put(String.valueOf(c51851Mvt.A03), c51851Mvt);
        }
    }

    public final List A00(C51851Mvt c51851Mvt) {
        if (c51851Mvt != null) {
            List list = c51851Mvt.A06;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C38321qM c38321qM = (C38321qM) obj;
                C14360o3.A0B(c38321qM, 0);
                A0q.add(new C51961Mxj(null, c38321qM, C05F.A00, "", i));
                i = i2;
            }
            this.A02 = A0q;
        }
        return this.A02;
    }

    public final void A01(InterfaceC58235Prf interfaceC58235Prf, String str, String str2, List list) {
        C51847Mvp c51847Mvp;
        C51851Mvt c51851Mvt;
        C51851Mvt c51851Mvt2 = this.A01;
        C51851Mvt c51851Mvt3 = null;
        if (c51851Mvt2 != null) {
            List list2 = c51851Mvt2.A06;
            String str3 = c51851Mvt2.A02;
            String str4 = c51851Mvt2.A03;
            boolean z = c51851Mvt2.A07;
            User user = c51851Mvt2.A01;
            String str5 = c51851Mvt2.A04;
            String str6 = c51851Mvt2.A05;
            MediaKitVisibility mediaKitVisibility = c51851Mvt2.A00;
            if (list != null) {
                list2 = list;
            }
            if (str != null) {
                str6 = str;
            }
            if (str2 != null) {
                str3 = str2;
            }
            if (interfaceC58235Prf != null) {
                C51790Muu c51790Muu = (C51790Muu) interfaceC58235Prf;
                mediaKitVisibility = c51790Muu.A00;
                C14360o3.A0B(mediaKitVisibility, 0);
                str5 = c51790Muu.A01;
            }
            AbstractC167017dG.A0x();
            c51851Mvt3 = new C51851Mvt(mediaKitVisibility, user, str3, str4, str5, str6, list2, z);
        }
        this.A01 = c51851Mvt3;
        if (interfaceC58235Prf != null && (c51847Mvp = this.A00) != null && (c51851Mvt = c51847Mvp.A00) != null) {
            String str7 = c51847Mvp.A01;
            List list3 = c51847Mvp.A02;
            C51790Muu c51790Muu2 = (C51790Muu) interfaceC58235Prf;
            MediaKitVisibility mediaKitVisibility2 = c51790Muu2.A00;
            String str8 = c51790Muu2.A01;
            List list4 = c51851Mvt.A06;
            String str9 = c51851Mvt.A02;
            String str10 = c51851Mvt.A03;
            boolean z2 = c51851Mvt.A07;
            User user2 = c51851Mvt.A01;
            String str11 = c51851Mvt.A05;
            AbstractC167007dF.A1F(list4, 0, user2);
            AbstractC167017dG.A1U(str11, mediaKitVisibility2);
            this.A00 = Nv7.A00(new C51851Mvt(mediaKitVisibility2, user2, str9, str10, str8, str11, list4, z2), str7, list3);
        }
    }
}
