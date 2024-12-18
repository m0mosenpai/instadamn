package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LJp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47987LJp {
    public RecyclerView A00;
    public C45111Jxg A01;
    public List A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final View.OnTouchListener A07;
    public final InterfaceC11380iw A08;
    public final UserSession A09;
    public final C47341Kvq A0A;
    public final C44527JmX A0B;
    public final C47972LIg A0C;
    public final EnumC46186KcO A0D;
    public final String A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;

    public final void A04(String str) {
        C14360o3.A0B(str, 0);
        C45111Jxg c45111Jxg = this.A01;
        C16930sl c16930sl = C16930sl.A00;
        int i = 0;
        A01(C45111Jxg.A00(C05F.A0C, (Integer) c45111Jxg.A02, c45111Jxg.A04, c16930sl, false), this);
        int length = str.length() - 1;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A19 = AbstractC167027dH.A19(str, i2);
            if (!z) {
                if (!A19) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!A19) {
                break;
            } else {
                length--;
            }
        }
        if (AbstractC31177DnL.A0g(str, length, i).length() != 0) {
            this.A02 = AbstractC166987dD.A1E();
            C47972LIg c47972LIg = this.A0C;
            LGU lgu = new LGU(str, c16930sl);
            c47972LIg.A00 = lgu;
            c47972LIg.A0A.invoke();
            C47972LIg.A01(c47972LIg, lgu, false);
        }
    }

    public C47987LJp(Context context, View.OnTouchListener onTouchListener, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC56392iX interfaceC56392iX, C47341Kvq c47341Kvq, C44527JmX c44527JmX, EnumC46186KcO enumC46186KcO, String str, String str2) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        C14360o3.A0B(onTouchListener, 6);
        C14360o3.A0B(c44527JmX, 10);
        this.A06 = context;
        this.A09 = userSession;
        this.A08 = interfaceC11380iw;
        this.A0A = c47341Kvq;
        this.A07 = onTouchListener;
        this.A0E = str;
        this.A0D = enumC46186KcO;
        this.A0B = c44527JmX;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A03 = C18U.A06(c06090Tz, userSession, 36317706586297841L) ? 2 : 3;
        this.A05 = C18U.A06(c06090Tz, userSession, 36317706586297841L) ? 4 : 3;
        this.A04 = C18U.A06(c06090Tz, userSession, 36317706586297841L) ? 40 : 30;
        this.A02 = AbstractC166987dD.A1E();
        this.A0C = new C47972LIg(EnumC46271Ke3.AI_STICKER, interfaceC11380iw, userSession, str, str2, new C43603JQj(this, 10), new C43603JQj(this, 11), new C43887Jau(this, 3));
        this.A0F = C50249MHe.A01(this, 5);
        this.A0H = C50249MHe.A01(this, 7);
        this.A0G = C50249MHe.A01(this, 6);
        this.A01 = new C45111Jxg(C05F.A0C, C05F.A01, (String) null, C16930sl.A00, A1V);
        JnN.A00((GridLayoutManager) this.A0F.getValue(), this, 9);
        interfaceC56392iX.EZv(new C48556Ldt(this, 0));
    }

    public static Integer A00(C47987LJp c47987LJp) {
        if (AbstractC46753KmA.A00(c47987LJp.A09).booleanValue()) {
            return C05F.A01;
        }
        return AbstractC46758KmF.A00((Integer) c47987LJp.A01.A02);
    }

    public static final void A01(C45111Jxg c45111Jxg, C47987LJp c47987LJp) {
        InterfaceC66482zP k04;
        String string;
        c47987LJp.A01 = c45111Jxg;
        C47330Kvf c47330Kvf = (C47330Kvf) c47987LJp.A0H.getValue();
        Context context = c47987LJp.A06;
        C45111Jxg c45111Jxg2 = c47987LJp.A01;
        C14360o3.A0B(c45111Jxg2, 1);
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        Number number = (Number) c45111Jxg2.A03;
        Integer num = C05F.A0C;
        boolean z = true;
        if (number != num) {
            int intValue = number.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    string = "";
                } else {
                    string = c45111Jxg2.A04;
                    if (string == null) {
                        string = AbstractC166997dE.A0p(context, 2131958727);
                    }
                }
            } else {
                string = context.getString(2131958728);
            }
            C14360o3.A0A(string);
            k04 = new LZJ(string);
        } else {
            List list = (List) c45111Jxg2.A01;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                A0q.add(new C45219Jzz((JWd) obj, i));
                i = i2;
            }
            A0E.A01(A0q);
            if (c45111Jxg2.A05) {
                int i3 = c47330Kvf.A00;
                ArrayList A17 = AbstractC25225BEi.A17(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    A17.add(new C45219Jzz(null, 0));
                }
                A0E.A01(A17);
            }
            Object obj2 = c45111Jxg2.A02;
            if (obj2 != C05F.A01) {
                if (obj2 != num) {
                    z = false;
                }
                k04 = new K04(z);
            }
            ((L48) c47987LJp.A0G.getValue()).A00.A05(A0E);
        }
        A0E.A00(k04);
        ((L48) c47987LJp.A0G.getValue()).A00.A05(A0E);
    }

    public static final void A02(C47987LJp c47987LJp, Integer num, String str) {
        C05A c05a = c47987LJp.A0B.A04;
        C45098JxS c45098JxS = (C45098JxS) c05a.getValue();
        C73 c73 = C73.A03;
        boolean z = c45098JxS.A05;
        String str2 = c45098JxS.A03;
        String str3 = c45098JxS.A02;
        boolean z2 = c45098JxS.A06;
        KzF kzF = c45098JxS.A00;
        AbstractC167017dG.A1O(c73, str2);
        c05a.Egh(new C45098JxS(kzF, c73, str2, str3, str, z, z2));
        A01(C45111Jxg.A00(num, C05F.A01, str, C16930sl.A00, false), c47987LJp);
    }

    public final void A03() {
        Integer num;
        C45111Jxg c45111Jxg = this.A01;
        Integer num2 = C05F.A0C;
        if (AbstractC46753KmA.A00(this.A09).booleanValue()) {
            num = C05F.A01;
        } else {
            num = num2;
        }
        A01(C45111Jxg.A00(num2, num, c45111Jxg.A04, (List) c45111Jxg.A01, true), this);
        this.A0C.A02();
    }
}
