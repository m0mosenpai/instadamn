package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: X.Oe4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55197Oe4 {
    public C54662OCo A00;
    public String A02;
    public C54662OCo A03;
    public String A04;
    public final UserSession A08;
    public String A01 = "";
    public final Map A09 = AbstractC166987dD.A1G();
    public final Map A05 = AbstractC166987dD.A1G();
    public final SortedMap A07 = new TreeMap();
    public final java.util.Set A06 = AbstractC166987dD.A1H();

    public static C55197Oe4 A00(UserSession userSession) {
        return (C55197Oe4) userSession.A01(C55197Oe4.class, new C57089PUc(userSession, 0));
    }

    public static C54662OCo A01(Reel reel) {
        RectF rectF;
        Rect A01;
        C38091pt c38091pt = reel.A0L;
        c38091pt.getClass();
        C130565v1 c130565v1 = c38091pt.A01;
        if (c130565v1 == null) {
            c130565v1 = c38091pt.A00;
        }
        SimpleImageUrl A00 = AbstractC152686tv.A00(c130565v1);
        List list = c38091pt.A04;
        if (list == null) {
            rectF = null;
        } else {
            rectF = new RectF(AbstractC167007dF.A04(list, 0), AbstractC167007dF.A04(list, 1), AbstractC167007dF.A04(list, 2), AbstractC167007dF.A04(list, 3));
        }
        int i = A00.A01;
        int i2 = A00.A00;
        if (rectF != null) {
            A01 = MX2.A05(rectF, i, i2, 1, 1);
        } else {
            A01 = MX2.A01(new Rect(0, 0, i, i2));
        }
        return new C54662OCo(A01, A00, c38091pt.A02, null);
    }

    public static ArrayList A02(C55197Oe4 c55197Oe4) {
        return new ArrayList(c55197Oe4.A07.values());
    }

    public static List A03(C54662OCo c54662OCo) {
        Rect rect = c54662OCo.A00;
        ImageUrl imageUrl = c54662OCo.A02;
        RectF A07 = MX2.A07(rect, imageUrl.getWidth(), imageUrl.getHeight());
        return Arrays.asList(Float.valueOf(A07.left), Float.valueOf(A07.top), Float.valueOf(A07.right), Float.valueOf(A07.bottom));
    }

    public static synchronized void A04(UserSession userSession) {
        synchronized (C55197Oe4.class) {
            userSession.A03(C55197Oe4.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (X.AbstractC50102Ry.A00(r2.A04, r3.A04) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C54661OCn A05() {
        /*
            r6 = this;
            X.OCn r4 = new X.OCn
            r4.<init>()
            java.util.Map r5 = r6.A05
            java.util.Iterator r3 = X.AbstractC166997dE.A16(r5)
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            X.1qM r2 = X.AbstractC31172DnG.A0i(r3)
            java.util.Map r0 = r6.A09
            java.util.Set r1 = r0.keySet()
            java.lang.String r0 = r2.getId()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lb
            java.util.Map r1 = r4.A03
            java.lang.String r0 = r2.getId()
            r1.put(r0, r2)
            goto Lb
        L2f:
            java.util.Map r0 = r6.A09
            java.util.Iterator r3 = X.AbstractC166997dE.A16(r0)
        L35:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L57
            X.1qM r2 = X.AbstractC31172DnG.A0i(r3)
            java.util.Set r1 = r5.keySet()
            java.lang.String r0 = r2.getId()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L35
            java.util.Map r1 = r4.A04
            java.lang.String r0 = r2.getId()
            r1.put(r0, r2)
            goto L35
        L57:
            java.lang.String r1 = r6.A01
            java.lang.String r0 = r6.A04
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            r4.A02 = r0
            X.OCo r3 = r6.A03
            X.OCo r2 = r6.A00
            if (r2 == 0) goto L8f
            if (r3 == 0) goto L8f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.AbstractC50102Ry.A00(r1, r0)
            if (r0 == 0) goto L80
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r1 = X.AbstractC50102Ry.A00(r1, r0)
            r0 = 0
            if (r1 != 0) goto L81
        L80:
            r0 = 1
        L81:
            r4.A01 = r0
            android.graphics.Rect r1 = r2.A00
            android.graphics.Rect r0 = r3.A00
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            r4.A00 = r0
        L8f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55197Oe4.A05():X.OCn");
    }

    public final void A06(Context context) {
        C54662OCo c54662OCo;
        SortedMap sortedMap = this.A07;
        Object obj = sortedMap.get(sortedMap.firstKey());
        obj.getClass();
        C38321qM c38321qM = (C38321qM) obj;
        ExtendedImageUrl A1q = c38321qM.A1q(context);
        A1q.getClass();
        String id = c38321qM.getId();
        Rect A01 = MX2.A01(new Rect(0, 0, A1q.getWidth(), A1q.getHeight()));
        if (id != null) {
            c54662OCo = new C54662OCo(A01, A1q, id, null);
        } else {
            c54662OCo = new C54662OCo(A01, A1q, null, null);
        }
        this.A00 = c54662OCo;
    }

    public final void A07(C38321qM c38321qM) {
        Map map = this.A05;
        boolean containsKey = map.containsKey(c38321qM.getId());
        String id = c38321qM.getId();
        if (containsKey) {
            map.remove(id);
            this.A07.remove(Long.valueOf(c38321qM.A1B()));
        } else {
            map.put(id, c38321qM);
            this.A07.put(Long.valueOf(c38321qM.A1B()), c38321qM);
        }
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            ((InterfaceC57916PmM) it.next()).DSF();
        }
    }

    public final void A08(Reel reel) {
        String str;
        Map map = this.A09;
        if (map.isEmpty() && reel != null) {
            List<C41181vS> A0O = reel.A0O(this.A08);
            ArrayList A1E = AbstractC166987dD.A1E();
            for (C41181vS c41181vS : A0O) {
                if (c41181vS.A0e == EnumC41231vY.A09) {
                    A1E.add(c41181vS.A0b);
                }
            }
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                C38321qM A0i = AbstractC31172DnG.A0i(it);
                map.put(A0i.getId(), A0i);
            }
            String str2 = reel.A0r;
            this.A04 = str2;
            if (str2 != null) {
                this.A01 = str2;
            }
            if (reel.A0p()) {
                str = reel.getId();
            } else {
                str = null;
            }
            this.A02 = str;
            this.A00 = A01(reel);
            this.A03 = A01(reel);
            Iterator it2 = A1E.iterator();
            while (it2.hasNext()) {
                C38321qM A0i2 = AbstractC31172DnG.A0i(it2);
                this.A05.put(A0i2.getId(), A0i2);
                this.A07.put(Long.valueOf(A0i2.A1B()), A0i2);
            }
        }
    }

    public C55197Oe4(UserSession userSession) {
        this.A08 = userSession;
    }
}
