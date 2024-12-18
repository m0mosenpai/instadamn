package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4pt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105824pt extends C40781ul implements C1NI, InterfaceC38401qU {
    public C109894xH A00;
    public C109914xJ A01;
    public C109054vU A02;
    public C109834xB A03;
    public C109084vX A04;
    public ImageUrl A05;
    public EnumC109104va A06;
    public C109954xP A07;
    public C41022IEr A08;
    public User A09;
    public C3PO A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Long A0S;
    public Long A0T;
    public Long A0U;
    public Long A0V;
    public Long A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public List A0k;
    public List A0l;
    public List A0m;
    public java.util.Set A0n;
    public final C109114vb A0o;

    @Override // X.InterfaceC38401qU
    public final void AHs() {
        this.A0G = false;
    }

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return "";
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return true;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return true;
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return false;
    }

    public final int A00() {
        Integer num = this.A0R;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long A01() {
        Long l = this.A0T;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final ImageUrl A02() {
        ImageUrl imageUrl = this.A05;
        if (AbstractC81033jX.A03(imageUrl)) {
            return null;
        }
        return imageUrl;
    }

    public final User A03() {
        User user = this.A09;
        user.getClass();
        return user;
    }

    public final C75363a3 A04(UserSession userSession) {
        String str;
        long longValue;
        String str2;
        C101644hZ c101644hZ;
        boolean booleanValue;
        long longValue2;
        boolean isEmpty;
        String str3;
        long longValue3;
        boolean z = false;
        if (this.A07 != null) {
            z = true;
        }
        boolean z2 = false;
        if (z) {
            if (this.A0i != null && (str3 = this.A0e) != null) {
                c101644hZ = new C101644hZ(C05F.A0j, str3);
                c101644hZ.A0B = this.A0i;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Long l = this.A0S;
                if (l == null) {
                    longValue3 = 0;
                } else {
                    longValue3 = l.longValue();
                }
                c101644hZ.A02 = timeUnit.toMillis(longValue3);
                Boolean bool = this.A0L;
                if (bool != null && !bool.booleanValue()) {
                    z2 = true;
                }
                c101644hZ.A05 = Boolean.valueOf(z2);
                isEmpty = this.A0i.isEmpty();
                c101644hZ.A0I = !isEmpty;
                return c101644hZ.A00();
            }
            return null;
        }
        String A05 = A05(userSession);
        if (A05 != null && (str2 = this.A0X) != null) {
            c101644hZ = new C101644hZ(C05F.A0N, str2);
            c101644hZ.A0B = A05;
            c101644hZ.A0E = A05.equals(this.A0Z);
            Boolean bool2 = this.A0H;
            if (bool2 == null) {
                booleanValue = false;
            } else {
                booleanValue = bool2.booleanValue();
            }
            c101644hZ.A0F = booleanValue;
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            Long l2 = this.A0S;
            if (l2 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l2.longValue();
            }
            c101644hZ.A02 = timeUnit2.toMillis(longValue2);
            Boolean bool3 = this.A0L;
            if (bool3 != null && !bool3.booleanValue()) {
                z2 = true;
            }
            c101644hZ.A05 = Boolean.valueOf(z2);
            isEmpty = A05.isEmpty();
            c101644hZ.A0I = !isEmpty;
            return c101644hZ.A00();
        }
        if (this.A0a != null && (str = this.A0X) != null) {
            C101644hZ c101644hZ2 = new C101644hZ(C05F.A0Y, str);
            c101644hZ2.A08 = this.A0a;
            TimeUnit timeUnit3 = TimeUnit.SECONDS;
            Long l3 = this.A0S;
            if (l3 == null) {
                longValue = 0;
            } else {
                longValue = l3.longValue();
            }
            c101644hZ2.A02 = timeUnit3.toMillis(longValue);
            Boolean bool4 = this.A0L;
            if (bool4 != null && !bool4.booleanValue()) {
                z2 = true;
            }
            c101644hZ2.A05 = Boolean.valueOf(z2);
            c101644hZ2.A0I = !this.A0a.isEmpty();
            c101644hZ2.A00();
        }
        return null;
    }

    public final String A05(UserSession userSession) {
        String str = this.A0Z;
        if (str != null || (str = this.A0b) != null) {
            if (!str.contains("&ms=")) {
                String A04 = C18U.A04(C06090Tz.A05, userSession, 36875524053008454L);
                if (!A04.isEmpty()) {
                    return AbstractC13670mt.A06("%s&ms=%s", str, A04);
                }
                return str;
            }
            return str;
        }
        return str;
    }

    public final java.util.Set A06() {
        java.util.Set set = this.A0n;
        if (set == null) {
            return new HashSet();
        }
        return Collections.unmodifiableSet(set);
    }

    public final boolean A07() {
        User user = this.A09;
        if (user != null && user.A26()) {
            return true;
        }
        java.util.Set set = this.A0n;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((User) it.next()).A26()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r1 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A08() {
        /*
            r2 = this;
            java.lang.Boolean r0 = r2.A0G
            if (r0 != 0) goto L16
            X.4vX r0 = r2.A04
            if (r0 == 0) goto Lf
            boolean r1 = X.BFB.A04(r0)
            r0 = 1
            if (r1 != 0) goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0G = r0
        L16:
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105824pt.A08():boolean");
    }

    @Override // X.InterfaceC38401qU
    public final /* bridge */ /* synthetic */ InterfaceC109094vY BRN() {
        return this.A04;
    }

    @Override // X.InterfaceC38401qU
    public final String BU6() {
        return this.A0g;
    }

    @Override // X.InterfaceC38401qU
    public final String Biv() {
        String str = this.A0e;
        str.getClass();
        return str.split("_")[1];
    }

    @Override // X.InterfaceC38401qU
    public final String Biw() {
        String str = this.A0e;
        str.getClass();
        return str.split("_")[0];
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String str = this.A0X;
        str.getClass();
        return str;
    }

    public C105824pt(C37941pb c37941pb) {
        C108544uf c108544uf;
        this.A0m = new ArrayList();
        this.A06 = EnumC109104va.A0E;
        this.A0n = new HashSet();
        this.A0G = null;
        this.A0l = new ArrayList();
        this.A0K = true;
        this.A0k = new ArrayList();
        this.A0M = false;
        this.A0J = false;
        this.A0O = null;
        this.A0N = C05F.A0C;
        this.A0o = new C109114vb(this);
        this.A07 = null;
        Long l = c37941pb.A0b;
        if (l != null) {
            this.A0X = l.toString();
        }
        String str = c37941pb.A0j;
        if (str != null) {
            this.A05 = new SimpleImageUrl(str);
        }
        this.A02 = c37941pb.A03;
        this.A0b = c37941pb.A0m;
        this.A0Z = c37941pb.A0k;
        this.A0a = c37941pb.A0l;
        this.A0i = c37941pb.A0s;
        C41022IEr c41022IEr = this.A08;
        if (c41022IEr != null && (c108544uf = c37941pb.A06) != null) {
            c41022IEr.A00 = c108544uf.A00;
            c41022IEr.A01 = c108544uf.A01;
        }
        this.A09 = c37941pb.A09;
        Float f = c37941pb.A0Q;
        if (f != null) {
            this.A0R = Integer.valueOf(f.intValue());
        }
        this.A0m = c37941pb.A0y;
        this.A0Q = c37941pb.A0Y;
        Integer num = c37941pb.A0V;
        if (num != null) {
            this.A0T = Long.valueOf(num.longValue());
        }
        Integer num2 = c37941pb.A0R;
        if (num2 != null) {
            this.A0S = Long.valueOf(num2.longValue());
        }
        this.A0L = c37941pb.A0L;
        this.A0e = c37941pb.A0o;
        String str2 = c37941pb.A0i;
        if (str2 != null) {
            this.A06 = AbstractC109124vc.A00(str2);
        }
        this.A0C = c37941pb.A0D;
        Integer num3 = c37941pb.A0Z;
        if (num3 != null) {
            this.A0A = AbstractC109134vd.A00(num3.intValue());
        }
        this.A0P = c37941pb.A0U;
        this.A0I = c37941pb.A0J;
        this.A0F = c37941pb.A0E;
        Integer num4 = c37941pb.A0T;
        if (num4 != null && num4.intValue() == 1) {
            this.A0H = true;
        } else {
            this.A0H = false;
        }
        this.A0E = c37941pb.A0C;
        this.A0g = c37941pb.A0r;
        this.A04 = c37941pb.A08;
        this.A01 = c37941pb.A01;
        this.A03 = c37941pb.A07;
        this.A0Y = c37941pb.A0g;
        Integer num5 = c37941pb.A0W;
        if (num5 != null) {
            this.A0V = Long.valueOf(num5.longValue());
        }
        Integer num6 = c37941pb.A0X;
        if (num6 != null) {
            this.A0W = Long.valueOf(num6.longValue());
        }
        this.A0h = c37941pb.A0p;
        this.A0c = c37941pb.A0n;
        Long l2 = c37941pb.A0c;
        if (l2 != null) {
            this.A0d = l2.toString();
        }
        List list = c37941pb.A0v;
        if (list != null) {
            this.A0n = new HashSet(list);
        }
        String str3 = c37941pb.A0t;
        if (str3 != null) {
            this.A0U = Long.valueOf(Long.parseLong(str3));
        }
        Boolean bool = c37941pb.A0K;
        if (bool != null) {
            this.A0K = bool;
        }
        C109894xH c109894xH = c37941pb.A00;
        if (c109894xH != null) {
            this.A00 = c109894xH;
        }
        this.A0k = c37941pb.A0u;
        this.A0M = c37941pb.A0M;
        this.A0D = c37941pb.A0B;
        this.A0J = c37941pb.A0O;
        this.A0O = c37941pb.A0S;
        this.A0B = c37941pb.A0A;
        this.A0l = c37941pb.A0w;
        Long l3 = c37941pb.A0f;
        if (l3 != null) {
            this.A0j = l3.toString();
        }
        if (c109894xH != null) {
            this.A00 = c109894xH;
        }
    }

    public final boolean A09(UserSession userSession) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (((Boolean) A00.A09.CES(A00, C23031Ai.A8c[176])).booleanValue() || (A01() * 1000) + 86400000 >= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }

    public C105824pt() {
        this.A0m = new ArrayList();
        this.A06 = EnumC109104va.A0E;
        this.A0n = new HashSet();
        this.A0G = null;
        this.A0l = new ArrayList();
        this.A0K = true;
        this.A0k = new ArrayList();
        this.A0M = false;
        this.A0J = false;
        this.A0O = null;
        this.A0N = C05F.A0C;
        this.A0o = new C109114vb(this);
        this.A07 = null;
    }
}
