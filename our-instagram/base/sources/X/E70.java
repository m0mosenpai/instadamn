package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class E70 extends C0T6 {
    public List A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final ImageUrl A0C;
    public final C81613kW A0D;
    public final C81543kP A0E;
    public final MessagingUser A0F;
    public final CreatorSubscriberThreadInfo A0G;
    public final C1118752z A0H;
    public final EnumC160877Iv A0I;
    public final C32065E6r A0J;
    public final InterfaceC83733oI A0K;
    public final InterfaceC83733oI A0L;
    public final Long A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final List A0R;
    public final List A0S;
    public final List A0T;
    public final Map A0U;
    public final Map A0V;
    public final Map A0W;
    public final Map A0X;
    public final InterfaceC09390do A0Y;
    public final InterfaceC09390do A0Z;
    public final InterfaceC09390do A0a;
    public final InterfaceC09390do A0b;
    public final InterfaceC09390do A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;

    public final boolean A0E(String str) {
        C14360o3.A0B(str, 0);
        return this.A0S.contains(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E70) {
                E70 e70 = (E70) obj;
                if (!C14360o3.A0K(this.A0L, e70.A0L) || !C14360o3.A0K(this.A0Q, e70.A0Q) || this.A0A != e70.A0A || this.A08 != e70.A08 || !C14360o3.A0K(this.A0P, e70.A0P) || !C14360o3.A0K(this.A0C, e70.A0C) || !C14360o3.A0K(this.A0N, e70.A0N) || this.A12 != e70.A12 || this.A10 != e70.A10 || this.A0w != e70.A0w || this.A04 != e70.A04 || this.A0B != e70.A0B || this.A0v != e70.A0v || this.A0o != e70.A0o || this.A0q != e70.A0q || this.A0n != e70.A0n || this.A0u != e70.A0u || this.A0z != e70.A0z || this.A0i != e70.A0i || this.A0k != e70.A0k || this.A13 != e70.A13 || this.A0s != e70.A0s || this.A0r != e70.A0r || this.A0e != e70.A0e || this.A0d != e70.A0d || this.A0y != e70.A0y || !C14360o3.A0K(this.A0X, e70.A0X) || !C14360o3.A0K(this.A0F, e70.A0F) || !C14360o3.A0K(this.A0T, e70.A0T) || !C14360o3.A0K(this.A00, e70.A00) || !C14360o3.A0K(this.A0S, e70.A0S) || !C14360o3.A0K(this.A0J, e70.A0J) || !C14360o3.A0K(this.A0R, e70.A0R) || this.A0j != e70.A0j || !C14360o3.A0K(this.A0O, e70.A0O) || !C14360o3.A0K(this.A0G, e70.A0G) || this.A0l != e70.A0l || this.A0p != e70.A0p || this.A0g != e70.A0g || this.A0x != e70.A0x || this.A0m != e70.A0m || !C14360o3.A0K(this.A0K, e70.A0K) || this.A09 != e70.A09 || !C14360o3.A0K(this.A0E, e70.A0E) || this.A07 != e70.A07 || this.A06 != e70.A06 || this.A0I != e70.A0I || !C14360o3.A0K(this.A0H, e70.A0H) || this.A11 != e70.A11 || !C14360o3.A0K(this.A0M, e70.A0M) || this.A0h != e70.A0h || this.A01 != e70.A01 || !C14360o3.A0K(this.A0U, e70.A0U) || this.A0f != e70.A0f || this.A0t != e70.A0t || !C14360o3.A0K(this.A0D, e70.A0D) || this.A02 != e70.A02 || this.A03 != e70.A03 || this.A05 != e70.A05 || !C14360o3.A0K(this.A0V, e70.A0V) || !C14360o3.A0K(this.A0W, e70.A0W)) {
                }
            }
            return false;
        }
        return true;
    }

    public static String A02(E70 e70) {
        C81543kP c81543kP = e70.A0E;
        if (c81543kP != null) {
            return c81543kP.A07;
        }
        return null;
    }

    public static String A03(E70 e70) {
        return AbstractC1345466e.A07(e70.A0L);
    }

    public static boolean A04(E70 e70) {
        return LCG.A00(e70.A0A);
    }

    public final int A06() {
        C81543kP c81543kP = this.A0E;
        if (c81543kP != null) {
            return c81543kP.A00;
        }
        return 0;
    }

    public final C32107E9f A07() {
        for (C32107E9f c32107E9f : this.A0T) {
            if (MessagingUser.A00(c32107E9f.A00).A02(this.A0F)) {
                return c32107E9f;
            }
        }
        return null;
    }

    public final C3o9 A08() {
        Object obj;
        String str = this.A0Q;
        if (str != null) {
            Object obj2 = this.A0L;
            C14360o3.A0B(obj2, 0);
            if (obj2 instanceof C83693oE) {
                C83693oE c83693oE = (C83693oE) obj2;
                C14360o3.A0B(c83693oE, 0);
                DirectThreadKey directThreadKey = new DirectThreadKey(c83693oE.A00, null);
                directThreadKey.A01 = str;
                obj = directThreadKey;
            } else {
                boolean z = obj2 instanceof MsysThreadId;
                obj = obj2;
                if (!z) {
                    if (obj2 instanceof EgH) {
                        EgH egH = (EgH) obj2;
                        DirectThreadKey directThreadKey2 = new DirectThreadKey(egH.A00.A00, null);
                        directThreadKey2.A01 = str;
                        obj = new DirectMsysMixedThreadKey(directThreadKey2, egH.A01);
                    } else {
                        throw AbstractC166987dD.A14(AbstractC167017dG.A0n(obj2, AbstractC111324zv.A00(1616), AbstractC166987dD.A1C()));
                    }
                }
            }
            return (C3o9) obj;
        }
        return AbstractC1345466e.A05(this.A0L);
    }

    public final List A09() {
        return AbstractC31171DnF.A0n(this.A0c);
    }

    public final void A0A(User user, String str) {
        List list = this.A0T;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (AbstractC31174DnI.A1Y(user, C32107E9f.A01(it).getId())) {
                if (i != -1) {
                    C32107E9f c32107E9f = (C32107E9f) list.get(i);
                    list.remove(c32107E9f);
                    User user2 = c32107E9f.A00;
                    boolean z = c32107E9f.A07;
                    boolean z2 = c32107E9f.A08;
                    boolean z3 = c32107E9f.A0A;
                    boolean z4 = c32107E9f.A04;
                    boolean z5 = c32107E9f.A09;
                    boolean z6 = c32107E9f.A0D;
                    boolean z7 = c32107E9f.A0C;
                    boolean z8 = c32107E9f.A0B;
                    boolean z9 = c32107E9f.A05;
                    boolean z10 = c32107E9f.A0F;
                    boolean z11 = c32107E9f.A0E;
                    boolean z12 = c32107E9f.A06;
                    C14360o3.A0B(user2, 0);
                    list.add(i, new C32107E9f(user2, str, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12));
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final boolean A0C() {
        return C14360o3.A0K(this.A0N, "pending");
    }

    public final boolean A0F(String str) {
        List list = this.A0T;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (MessagingUser.A00(C32107E9f.A01(it)).A03(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((AbstractC167007dF.A0D(this.A0t, AbstractC167007dF.A0D(this.A0f, AbstractC166997dE.A0J(this.A0U, (AbstractC167007dF.A0D(this.A0h, (AbstractC167007dF.A0D(this.A11, AbstractC166997dE.A0J(this.A0H, AbstractC166997dE.A0J(this.A0I, (((((((((AbstractC167007dF.A0D(this.A0m, AbstractC167007dF.A0D(this.A0x, AbstractC167007dF.A0D(this.A0g, AbstractC167007dF.A0D(this.A0p, AbstractC167007dF.A0D(this.A0l, (((AbstractC167007dF.A0D(this.A0j, (AbstractC166997dE.A0J(this.A0J, AbstractC166997dE.A0J(this.A0S, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A0T, AbstractC166997dE.A0J(this.A0F, (AbstractC167007dF.A0D(this.A0y, AbstractC167007dF.A0D(this.A0d, AbstractC167007dF.A0D(this.A0e, AbstractC167007dF.A0D(this.A0r, AbstractC167007dF.A0D(this.A0s, AbstractC167007dF.A0D(this.A13, AbstractC167007dF.A0D(this.A0k, AbstractC167007dF.A0D(this.A0i, AbstractC167007dF.A0D(this.A0z, AbstractC167007dF.A0D(this.A0u, AbstractC167007dF.A0D(this.A0n, AbstractC167007dF.A0D(this.A0q, AbstractC167007dF.A0D(this.A0o, AbstractC167007dF.A0D(this.A0v, (((AbstractC167007dF.A0D(this.A0w, AbstractC167007dF.A0D(this.A10, AbstractC167007dF.A0D(this.A12, (((((((((((AbstractC166987dD.A0G(this.A0L) + AbstractC167017dG.A0O(this.A0Q)) * 31) + this.A0A) * 31) + this.A08) * 31) + AbstractC167017dG.A0O(this.A0P)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0N)) * 31))) + this.A04) * 31) + this.A0B) * 31)))))))))))))) + AbstractC167017dG.A0M(this.A0X)) * 31))))) + AbstractC167017dG.A0M(this.A0R)) * 31) + AbstractC167017dG.A0O(this.A0O)) * 31) + AbstractC167017dG.A0M(this.A0G)) * 31))))) + AbstractC167017dG.A0M(this.A0K)) * 31) + this.A09) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31) + this.A07) * 31) + this.A06) * 31))) + AbstractC167017dG.A0M(this.A0M)) * 31) + this.A01) * 31))) + AbstractC167017dG.A0M(this.A0D)) * 31) + this.A02) * 31) + this.A03) * 31) + this.A05) * 31) + AbstractC167017dG.A0M(this.A0V)) * 31) + AbstractC166997dE.A0I(this.A0W);
    }

    public static int A00(E70 e70) {
        return e70.A09().size();
    }

    public static DirectThreadKey A01(E70 e70) {
        return JRE.A01(e70.A08());
    }

    public static boolean A05(E70 e70) {
        return AbstractC31224Do7.A04(e70.A09(), e70.A0C(), LCG.A00(e70.A0A));
    }

    public final boolean A0B() {
        if (!A04(this) && AbstractC166987dD.A1b(AbstractC31171DnF.A0n(this.A0c)) && C32107E9f.A00(this).CYY()) {
            return true;
        }
        return false;
    }

    public final boolean A0D() {
        C81543kP c81543kP;
        if (A04(this) && (c81543kP = this.A0E) != null && c81543kP.A0Q) {
            return true;
        }
        return false;
    }

    public E70(ImageUrl imageUrl, C81613kW c81613kW, C81543kP c81543kP, MessagingUser messagingUser, CreatorSubscriberThreadInfo creatorSubscriberThreadInfo, C1118752z c1118752z, EnumC160877Iv enumC160877Iv, C32065E6r c32065E6r, InterfaceC83733oI interfaceC83733oI, InterfaceC83733oI interfaceC83733oI2, Long l, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, Map map, Map map2, Map map3, Map map4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27) {
        C14360o3.A0B(messagingUser, 28);
        C14360o3.A0B(list3, 31);
        this.A0L = interfaceC83733oI;
        this.A0Q = str;
        this.A0A = i;
        this.A08 = i2;
        this.A0P = str2;
        this.A0C = imageUrl;
        this.A0N = str3;
        this.A12 = z;
        this.A10 = z2;
        this.A0w = z3;
        this.A04 = i3;
        this.A0B = i4;
        this.A0v = z4;
        this.A0o = z5;
        this.A0q = z6;
        this.A0n = z7;
        this.A0u = z8;
        this.A0z = z9;
        this.A0i = z10;
        this.A0k = z11;
        this.A13 = z12;
        this.A0s = z13;
        this.A0r = z14;
        this.A0e = z15;
        this.A0d = z16;
        this.A0y = z17;
        this.A0X = map;
        this.A0F = messagingUser;
        this.A0T = list;
        this.A00 = list2;
        this.A0S = list3;
        this.A0J = c32065E6r;
        this.A0R = list4;
        this.A0j = z18;
        this.A0O = str4;
        this.A0G = creatorSubscriberThreadInfo;
        this.A0l = z19;
        this.A0p = z20;
        this.A0g = z21;
        this.A0x = z22;
        this.A0m = z23;
        this.A0K = interfaceC83733oI2;
        this.A09 = i5;
        this.A0E = c81543kP;
        this.A07 = i6;
        this.A06 = i7;
        this.A0I = enumC160877Iv;
        this.A0H = c1118752z;
        this.A11 = z24;
        this.A0M = l;
        this.A0h = z25;
        this.A01 = i8;
        this.A0U = map2;
        this.A0f = z26;
        this.A0t = z27;
        this.A0D = c81613kW;
        this.A02 = i9;
        this.A03 = i10;
        this.A05 = i11;
        this.A0V = map3;
        this.A0W = map4;
        this.A0c = C37054GUk.A00(this, 10);
        this.A0b = C37054GUk.A00(this, 9);
        this.A0a = C37054GUk.A00(this, 8);
        this.A0Z = C37054GUk.A00(this, 7);
        this.A0Y = C37054GUk.A00(this, 6);
    }
}
