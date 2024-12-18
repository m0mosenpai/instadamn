package X;

import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.common.session.UserSession;
import com.instagram.profile.productsonprofile.producttab.ui.ProductTabRepository;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MfE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50945MfE extends AbstractC52922bZ {
    public int A00;
    public boolean A01;
    public final UserSession A02;
    public final ProductTabRepository A03;
    public final String A04;
    public final C05A A05;
    public final String A06;
    public final List A07;

    public C50945MfE(UserSession userSession, ProductTabRepository productTabRepository, String str, String str2) {
        boolean z;
        Boolean BUz;
        List BhR;
        AbstractC167007dF.A1D(userSession, 1, str);
        this.A02 = userSession;
        this.A06 = str;
        this.A04 = str2;
        this.A03 = productTabRepository;
        this.A05 = C10E.A00(C52668NRp.A00);
        this.A07 = AbstractC166987dD.A1E();
        IGAdProfileProductTabDict A00 = new C154616xB(this.A02).A00(str);
        if (A00 != null && (BhR = A00.BhR()) != null) {
            Iterator it = BhR.iterator();
            while (it.hasNext()) {
                this.A07.add(new C42292IoG((ProductDetailsProductItemDictIntf) it.next()));
            }
        }
        this.A00 = this.A07.size();
        IGAdProfileProductTabDict A002 = new C154616xB(this.A02).A00(this.A06);
        if (A002 != null && (BUz = A002.BUz()) != null) {
            z = BUz.booleanValue();
        } else {
            z = false;
        }
        this.A01 = z;
        if (this.A07.isEmpty() && this.A01) {
            PZW.A01(this, AbstractC141776au.A00(this), 41, true);
        } else {
            this.A05.Egh(new C52667NRo(this.A07, true));
        }
    }
}
