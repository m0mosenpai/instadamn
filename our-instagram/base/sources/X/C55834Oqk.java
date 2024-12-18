package X;

import android.content.Context;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oqk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55834Oqk implements InterfaceC58022Po8 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC018607g A01;
    public final /* synthetic */ C55122Obj A02;
    public final /* synthetic */ EnumC53243Ngg A03;
    public final /* synthetic */ C1P1 A04;

    public C55834Oqk(Context context, AbstractC018607g abstractC018607g, C55122Obj c55122Obj, EnumC53243Ngg enumC53243Ngg, C1P1 c1p1) {
        this.A02 = c55122Obj;
        this.A03 = enumC53243Ngg;
        this.A04 = c1p1;
        this.A00 = context;
        this.A01 = abstractC018607g;
    }

    @Override // X.InterfaceC58022Po8
    public final void D8y(Rect rect, ImageUrl imageUrl, String str) {
        C55122Obj c55122Obj = this.A02;
        c55122Obj.A00.getClass();
        if (c55122Obj.A00.A03 == null) {
            c55122Obj.A00 = new C54662OCo(rect, imageUrl, null, str);
        }
    }

    @Override // X.InterfaceC58022Po8
    public final void onFinish() {
        C55122Obj c55122Obj = this.A02;
        EnumC53243Ngg enumC53243Ngg = this.A03;
        c55122Obj.A02.getClass();
        Reel reel = c55122Obj.A02;
        UserSession userSession = c55122Obj.A05;
        List A0O = reel.A0O(userSession);
        HashSet hashSet = new HashSet(A0O.size());
        Iterator it = A0O.iterator();
        while (it.hasNext()) {
            C38321qM c38321qM = ((C41181vS) it.next()).A0b;
            c38321qM.getClass();
            hashSet.add(c38321qM.getId());
        }
        C38091pt c38091pt = c55122Obj.A02.A0L;
        c38091pt.getClass();
        String str = c38091pt.A02;
        C54662OCo c54662OCo = c55122Obj.A00;
        c54662OCo.getClass();
        String str2 = c54662OCo.A04;
        if (str == null && str2 == null) {
            C38321qM c38321qM2 = c55122Obj.A02.A0A(userSession, 0).A0b;
            c38321qM2.getClass();
            str = c38321qM2.getId();
        }
        String str3 = c55122Obj.A02.A0r;
        if (str3 == null) {
            str3 = "";
        }
        C54662OCo c54662OCo2 = c55122Obj.A00;
        ImageUrl imageUrl = c54662OCo2.A02;
        int height = imageUrl.getHeight();
        int width = imageUrl.getWidth();
        List A03 = C55197Oe4.A03(c54662OCo2);
        String id = c55122Obj.A02.getId();
        AbstractC167007dF.A1K(userSession, enumC53243Ngg);
        C1ON A00 = AbstractC1571873x.A00(enumC53243Ngg, userSession, str3, str, str2, id, A03, hashSet, height, width, false);
        A00.A00 = this.A04;
        C1GJ.A00(this.A00, this.A01, A00);
    }
}
