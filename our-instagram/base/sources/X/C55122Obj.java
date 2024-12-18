package X;

import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Obj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55122Obj {
    public C54662OCo A00;
    public C54662OCo A01;
    public Reel A02;
    public String A03;
    public boolean A04;
    public final UserSession A05;
    public final List A06 = AbstractC166987dD.A1E();

    public static void A01(C55122Obj c55122Obj) {
        List list = c55122Obj.A06;
        list.clear();
        Reel reel = c55122Obj.A02;
        if (reel != null) {
            Iterator it = reel.A0O(c55122Obj.A05).iterator();
            while (it.hasNext()) {
                list.add(((C41181vS) it.next()).A0b);
            }
            String str = reel.A0r;
            str.getClass();
            c55122Obj.A03 = str;
            c55122Obj.A01 = C55197Oe4.A01(reel);
            c55122Obj.A00 = C55197Oe4.A01(reel);
        }
    }

    public static boolean A02(C54662OCo c54662OCo, C54662OCo c54662OCo2, UserSession userSession, Reel reel, String str, List list) {
        if (str.equals(reel.A0r)) {
            c54662OCo.getClass();
            c54662OCo2.getClass();
            if (AbstractC50102Ry.A00(c54662OCo.A03, c54662OCo2.A03) && AbstractC50102Ry.A00(c54662OCo.A04, c54662OCo2.A04) && !(!c54662OCo.A00.equals(c54662OCo2.A00))) {
                List A0O = reel.A0O(userSession);
                if (list.size() == A0O.size()) {
                    for (int i = 0; i < list.size(); i++) {
                        C38321qM c38321qM = ((C41181vS) A0O.get(i)).A0b;
                        c38321qM.getClass();
                        String id = AbstractC25225BEi.A0x(list, i).getId();
                        id.getClass();
                        if (!id.equals(c38321qM.getId())) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public C55122Obj(UserSession userSession) {
        this.A05 = userSession;
    }

    public static C38091pt A00(C54662OCo c54662OCo) {
        ArrayList A1E = AbstractC166987dD.A1E();
        RectF rectF = c54662OCo.A01;
        MSX.A1Q(A1E, rectF.left);
        MSX.A1Q(A1E, rectF.top);
        MSX.A1Q(A1E, rectF.right);
        MSX.A1Q(A1E, rectF.bottom);
        ImageUrl imageUrl = c54662OCo.A02;
        int height = imageUrl.getHeight();
        String url = imageUrl.getUrl();
        return new C38091pt(new C130565v1(height, "", url, imageUrl.getWidth()), new C130565v1(imageUrl.getHeight(), "", url, imageUrl.getWidth()), c54662OCo.A03, c54662OCo.A04, A1E);
    }
}
