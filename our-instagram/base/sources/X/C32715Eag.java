package X;

import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Eag, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32715Eag extends Dz7 {
    public AnonymousClass195 A00;
    public final C05A A01;
    public final C0UO A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32715Eag(Resources resources, UserSession userSession, DirectCardGalleryRepository directCardGalleryRepository, AnonymousClass988 anonymousClass988, C7IM c7im, C75H c75h, DirectThreadKey directThreadKey, String str, String str2, String str3, String str4, List list, boolean z) {
        super(resources, userSession, F2C.A00(userSession), directCardGalleryRepository, anonymousClass988, c7im, c75h, directThreadKey, str, str2, str3, str4, list, null);
        Object value;
        C51761Mtk c51761Mtk;
        E6W e6w;
        AbstractC167027dH.A13(resources, userSession, directThreadKey);
        AbstractC167007dF.A1H(str2, 5, str4);
        C14360o3.A0B(directCardGalleryRepository, 8);
        C14360o3.A0B(c75h, 10);
        AbstractC25229BEm.A1L(anonymousClass988, 11, c7im);
        this.A03 = z;
        C008002u A1H = AbstractC25225BEi.A1H(new C51761Mtk(6, C05F.A00, (Object) null));
        this.A01 = A1H;
        this.A02 = A1H;
        do {
            value = A1H.getValue();
            c51761Mtk = (C51761Mtk) value;
            C2EC A01 = Dz7.A01(this);
            if (A01 != null) {
                e6w = ((C81663kb) A01).A01.A12;
            } else {
                e6w = null;
            }
        } while (!A1H.AIi(value, new C51761Mtk(6, c51761Mtk.A02, e6w)));
    }

    @Override // X.Dz7
    public final C32055E6h A03(C37838Gks c37838Gks, EnumC33345Eoe enumC33345Eoe, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3, String str4, ArrayList arrayList, List list, int i, boolean z) {
        C45209Jzp c45209Jzp;
        EnumC33345Eoe enumC33345Eoe2 = enumC33345Eoe;
        String str5 = str2;
        C32055E6h A03 = super.A03(c37838Gks, enumC33345Eoe2, user, bool, bool2, bool3, bool4, str, str5, str3, str4, arrayList, list, i, z);
        Double d = null;
        if (str != null) {
            if (C7HD.A03(this.A04) && c37838Gks != null) {
                d = (Double) c37838Gks.A03;
            }
            if (str2 == null) {
                str5 = "";
            }
            c45209Jzp = new C45209Jzp(d, Integer.valueOf(R.drawable.instagram_trophy_pano_outline_24), str, str5);
        } else {
            c45209Jzp = null;
        }
        if (AbstractC166997dE.A1Z(bool4, true) && this.A03) {
            enumC33345Eoe2 = EnumC33345Eoe.A02;
        }
        List list2 = A03.A0E;
        List list3 = A03.A0C;
        List list4 = A03.A0F;
        List list5 = A03.A0D;
        String str6 = A03.A0A;
        String str7 = A03.A09;
        User user2 = A03.A04;
        Boolean bool5 = A03.A06;
        Boolean bool6 = A03.A07;
        C37838Gks c37838Gks2 = A03.A01;
        int i2 = A03.A00;
        boolean z2 = A03.A0G;
        boolean z3 = A03.A0H;
        Boolean bool7 = A03.A08;
        ArrayList arrayList2 = A03.A0B;
        Boolean bool8 = A03.A05;
        C14360o3.A0B(list2, 0);
        AbstractC167007dF.A1D(list3, 1, list4);
        return new C32055E6h(c37838Gks2, c45209Jzp, enumC33345Eoe2, user2, bool5, bool6, bool7, bool8, str6, str7, arrayList2, list2, list3, list4, list5, i2, z2, z3);
    }
}
