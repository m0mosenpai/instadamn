package X;

import android.content.Context;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Arrays;

/* renamed from: X.3yY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89323yY {
    public final UserSession A00;
    public final InterfaceC686036x A01;
    public final C57332k8 A02;
    public final C693839y A03;
    public final C1M1 A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final C89313yX A0F;
    public final C77233d9 A0G;
    public final C691739d A0H;
    public final C77133cz A0I;
    public final C79563h7 A0J;
    public final C65502xm A0K;
    public final C57462kL A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    public C89323yY(UserSession userSession, C89313yX c89313yX, C77233d9 c77233d9, InterfaceC686036x interfaceC686036x, C77133cz c77133cz, C79563h7 c79563h7, C57332k8 c57332k8, C693839y c693839y, C57462kL c57462kL, C1M1 c1m1, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(c77133cz, 1);
        C14360o3.A0B(c77233d9, 2);
        C14360o3.A0B(c693839y, 10);
        this.A0I = c77133cz;
        this.A0G = c77233d9;
        this.A0J = c79563h7;
        this.A0F = c89313yX;
        this.A00 = userSession;
        this.A0N = z;
        this.A0O = z2;
        this.A01 = interfaceC686036x;
        this.A0M = z3;
        this.A03 = c693839y;
        this.A02 = c57332k8;
        this.A0L = c57462kL;
        this.A04 = c1m1;
        this.A0K = AbstractC65492xl.A00(userSession);
        C14360o3.A0B(userSession, 0);
        this.A0H = (C691739d) userSession.A01(C691739d.class, new DGY(userSession, 28));
        this.A09 = AbstractC09440dt.A01(new C206939Dy(this, 5));
        this.A06 = AbstractC09440dt.A01(new C206939Dy(this, 2));
        this.A0E = AbstractC09440dt.A01(new C206939Dy(this, 10));
        this.A0C = AbstractC09440dt.A01(new C206939Dy(this, 8));
        this.A07 = AbstractC09440dt.A01(new C206939Dy(this, 3));
        this.A0A = AbstractC09440dt.A01(new C206939Dy(this, 6));
        this.A0B = AbstractC09440dt.A01(new C206939Dy(this, 7));
        this.A0D = AbstractC09440dt.A01(new C206939Dy(this, 9));
        this.A08 = AbstractC09440dt.A01(new C206939Dy(this, 4));
        this.A05 = AbstractC09440dt.A01(new C206939Dy(this, 1));
    }

    public final int A00(Context context, C38321qM c38321qM, C75113Zb c75113Zb) {
        Integer num;
        Integer num2;
        Object[] objArr;
        String str;
        Integer num3;
        Integer num4;
        String str2;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(context, 2);
        boolean A0E = Systrace.A0E(1L);
        if (A0E) {
            C0fO.A01("CoalescedFooterUseCase#getViewModelHash", -973768799);
        }
        boolean z = this.A0K.A0R;
        boolean CdW = c38321qM.CdW();
        if (z) {
            String id = c38321qM.getId();
            Integer valueOf = Integer.valueOf(this.A0I.A01(c38321qM));
            Boolean valueOf2 = Boolean.valueOf(c75113Zb.A1p);
            Object obj = c75113Zb.A3b.A00;
            Integer valueOf3 = Integer.valueOf(AbstractC89343ya.A00(c38321qM));
            if (CdW) {
                this.A09.getValue();
                num3 = Integer.valueOf(Arrays.hashCode(new Object[]{Integer.valueOf(c75113Zb.A03)}));
            } else {
                num3 = null;
            }
            if (CdW && this.A0F != null) {
                User A2D = c38321qM.A2D();
                if (A2D != null) {
                    str2 = A2D.getUsername();
                } else {
                    str2 = null;
                }
                num4 = Integer.valueOf(Arrays.hashCode(new Object[]{str2}));
            } else {
                num4 = null;
            }
            objArr = new Object[]{id, valueOf, valueOf2, obj, valueOf3, num3, num4};
        } else {
            Integer valueOf4 = Integer.valueOf(this.A0G.A00(c38321qM));
            Integer valueOf5 = Integer.valueOf(this.A0I.A01(c38321qM));
            this.A06.getValue();
            Integer valueOf6 = Integer.valueOf(Arrays.hashCode(new Object[]{Boolean.valueOf(c75113Zb.A1p)}));
            Integer valueOf7 = Integer.valueOf(AbstractC89343ya.A00(c38321qM));
            this.A0B.getValue();
            Integer valueOf8 = Integer.valueOf(C77283dE.A00(c75113Zb));
            if (CdW) {
                this.A09.getValue();
                num = Integer.valueOf(Arrays.hashCode(new Object[]{Integer.valueOf(c75113Zb.A03)}));
            } else {
                num = null;
            }
            if (CdW && this.A0F != null) {
                User A2D2 = c38321qM.A2D();
                if (A2D2 != null) {
                    str = A2D2.getUsername();
                } else {
                    str = null;
                }
                num2 = Integer.valueOf(Arrays.hashCode(new Object[]{str}));
            } else {
                num2 = null;
            }
            Integer valueOf9 = Integer.valueOf(((C77293dF) this.A08.getValue()).A00(context, c38321qM, C05F.A00));
            this.A05.getValue();
            objArr = new Object[]{valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, num, num2, valueOf9, Integer.valueOf(Arrays.hashCode(new Object[]{c38321qM.getId()}))};
        }
        int hashCode = Arrays.hashCode(objArr);
        if (A0E) {
            C0fO.A00(2040537448);
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if (r59 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if (r7 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0151, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 36327473339841119L) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015b, code lost:
    
        if (r57.A3E != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        if (r55.A4k() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x022a, code lost:
    
        if (r3.A06 != X.EnumC84933qh.A09) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0242, code lost:
    
        if (r7.A1Z().A02.contains(r6) == true) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C89623z3 A01(android.content.Context r54, X.C38321qM r55, X.InterfaceC60442pS r56, final X.C75113Zb r57, X.C1M1 r58, boolean r59) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89323yY.A01(android.content.Context, X.1qM, X.2pS, X.3Zb, X.1M1, boolean):X.3z3");
    }
}
