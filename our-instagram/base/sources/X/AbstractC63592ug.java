package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC63592ug extends AbstractC63602uh {
    public Integer A00;
    public boolean A01;
    public final long A02;
    public final C1BX A03;
    public final UserSession A04;
    public final C62792tI A05;
    public final InterfaceC62702t9 A06;
    public final InterfaceC60442pS A07;
    public final InterfaceC63482uV A08;
    public final Map A09;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AbstractC63592ug(X.C1BX r6, com.instagram.common.session.UserSession r7, X.InterfaceC62702t9 r8, X.InterfaceC60442pS r9, X.InterfaceC63482uV r10, int r11, long r12, boolean r14) {
        /*
            r5 = this;
            r2 = 0
            r3 = 0
            r0 = r11 & 8
            if (r0 == 0) goto L13
            X.1BY r4 = X.C1BX.A03
            java.lang.String r1 = "merlin_impression"
            X.34y r0 = new X.34y
            r0.<init>(r7, r1)
            X.1BX r6 = r4.A01(r0)
        L13:
            r0 = r11 & 16
            if (r0 == 0) goto L1e
            X.0nI r0 = X.C13920nI.A00
            X.2tI r2 = new X.2tI
            r2.<init>(r6, r0)
        L1e:
            r0 = r11 & 32
            if (r0 == 0) goto L2a
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 1
            long r12 = r4.toMillis(r0)
        L2a:
            r0 = r11 & 64
            if (r0 == 0) goto L33
            X.2x4 r8 = new X.2x4
            r8.<init>()
        L33:
            r0 = r11 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L79
            java.lang.Integer r1 = X.C05F.A0N
        L39:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L42
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
        L42:
            r0 = r11 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L47
            r14 = 0
        L47:
            r0 = 3
            X.C14360o3.A0B(r10, r0)
            r0 = 4
            X.C14360o3.A0B(r6, r0)
            r0 = 5
            X.C14360o3.A0B(r2, r0)
            r0 = 7
            X.C14360o3.A0B(r8, r0)
            r0 = 8
            X.C14360o3.A0B(r1, r0)
            r0 = 9
            X.C14360o3.A0B(r3, r0)
            r5.<init>(r7, r9, r10, r3)
            r5.A07 = r9
            r5.A04 = r7
            r5.A08 = r10
            r5.A03 = r6
            r5.A05 = r2
            r5.A02 = r12
            r5.A06 = r8
            r5.A00 = r1
            r5.A09 = r3
            r5.A01 = r14
            return
        L79:
            r1 = r3
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63592ug.<init>(X.1BX, com.instagram.common.session.UserSession, X.2t9, X.2pS, X.2uV, int, long, boolean):void");
    }

    public void A05(Context context, InterfaceC82553mJ interfaceC82553mJ, Object obj, String str) {
        C14360o3.A0B(str, 3);
        if (interfaceC82553mJ != null && context != null && (!AbstractC001900j.A0T(str))) {
            C28091Xn A00 = C28071Xl.A00(context, this.A04);
            List list = ((C82543mI) interfaceC82553mJ).A06;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C82493mD) it.next()).A01);
            }
            C82513mF c82513mF = (C82513mF) AbstractC001800i.A0J(arrayList);
            if (c82513mF != null && AbstractC124635kR.A00(c82513mF) >= 250) {
                A00.A02(AnonymousClass001.A0R("NETEGO_VPV_KEY_PREFIX", str));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C82713mZ A01(Object obj, Object obj2) {
        C82713mZ c82713mZ;
        Boolean bool;
        C125225lT c125225lT;
        if (this instanceof C63772uy) {
            C63772uy c63772uy = (C63772uy) this;
            InterfaceC73233Pz interfaceC73233Pz = (InterfaceC73233Pz) obj;
            C14360o3.A0B(interfaceC73233Pz, 0);
            Long l = null;
            if (c63772uy.A01) {
                C28091Xn A00 = C28071Xl.A00(c63772uy.A00, c63772uy.A04);
                String id = interfaceC73233Pz.getId();
                if (id == null) {
                    id = "";
                }
                bool = Boolean.valueOf(A00.A03(AnonymousClass001.A0R("NETEGO_VPV_KEY_PREFIX", id)));
            } else {
                bool = null;
            }
            InterfaceC60442pS interfaceC60442pS = c63772uy.A07;
            c82713mZ = new C82713mZ(interfaceC60442pS, "impression");
            String id2 = interfaceC73233Pz.getId();
            if (id2 != null) {
                String moduleName = interfaceC60442pS.getModuleName();
                if (interfaceC73233Pz.BWa() != null) {
                    l = Long.valueOf(r2.intValue());
                }
                c125225lT = new C125225lT(l, id2, null, interfaceC73233Pz.CAR(), null, moduleName, 64486);
                String str = "SUGGESTED_BUSINESSES";
                switch (interfaceC73233Pz.B5n().ordinal()) {
                    case 2:
                    case 7:
                    case 8:
                        c125225lT.A03 = str;
                        break;
                    case 16:
                        str = "GENERIC_SURVEY";
                        c125225lT.A03 = str;
                        break;
                    case 18:
                        str = "SIFU_NETEGO";
                        c125225lT.A03 = str;
                        break;
                    case 21:
                    case 33:
                        break;
                    case 34:
                        str = "BLOKS_NETEGO";
                        c125225lT.A03 = str;
                        break;
                    case 38:
                        str = "RIFU_NETEGO";
                        c125225lT.A03 = str;
                        break;
                    default:
                        str = "GENERIC_NETEGO";
                        c125225lT.A03 = str;
                        break;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            if (this instanceof C63582uf) {
                C63582uf c63582uf = (C63582uf) this;
                C47K c47k = (C47K) obj;
                C14360o3.A0B(c47k, 0);
                if (c63582uf.A02) {
                    C28091Xn A002 = C28071Xl.A00(c63582uf.A01, c63582uf.A04);
                    InterfaceC73233Pz interfaceC73233Pz2 = c63582uf.A00;
                    if (interfaceC73233Pz2 != null) {
                        String id3 = interfaceC73233Pz2.getId();
                        if (id3 == null) {
                            id3 = "";
                        }
                        bool = Boolean.valueOf(A002.A03(AnonymousClass001.A0R("NETEGO_VPV_KEY_PREFIX", id3)));
                    }
                    C14360o3.A0F("netegoItem");
                    throw C00O.createAndThrow();
                }
                bool = null;
                InterfaceC60442pS interfaceC60442pS2 = c63582uf.A07;
                c82713mZ = new C82713mZ(interfaceC60442pS2, "impression");
                InterfaceC73233Pz interfaceC73233Pz3 = c63582uf.A00;
                if (interfaceC73233Pz3 != null) {
                    String id4 = interfaceC73233Pz3.getId();
                    if (id4 == null) {
                        id4 = "";
                    }
                    C1XV c1xv = c47k.A05;
                    if (c1xv == null) {
                        c1xv = C1XV.A0v;
                    }
                    c125225lT = new C125225lT(null, id4, c1xv.name(), null, null, interfaceC60442pS2.getModuleName(), 64508);
                    c125225lT.A04 = c47k.A0I;
                    c125225lT.A02 = c47k.A0G;
                    c125225lT.A00 = null;
                }
                C14360o3.A0F("netegoItem");
                throw C00O.createAndThrow();
            }
            if (this instanceof AnonymousClass359) {
                AnonymousClass359 anonymousClass359 = (AnonymousClass359) this;
                C79233gU c79233gU = (C79233gU) obj2;
                c82713mZ = null;
                if (c79233gU != null) {
                    C84923qg c84923qg = c79233gU.A01;
                    if (!c84923qg.A02() && c84923qg.A06 == EnumC84933qh.A09) {
                        return anonymousClass359.A00.A01(c84923qg, true);
                    }
                }
                return c82713mZ;
            }
            return null;
        }
        c82713mZ.A0w = c125225lT;
        c82713mZ.A14 = bool;
        return c82713mZ;
    }

    public String A02() {
        if (!(this instanceof AnonymousClass359) && !(this instanceof C63772uy) && (this instanceof C63582uf)) {
            InterfaceC73233Pz interfaceC73233Pz = ((C63582uf) this).A00;
            if (interfaceC73233Pz != null) {
                String id = interfaceC73233Pz.getId();
                if (id == null) {
                    return "";
                }
                return id;
            }
            C14360o3.A0F("netegoItem");
            throw C00O.createAndThrow();
        }
        return null;
    }

    public String A03() {
        if (!(this instanceof C63772uy) && !(this instanceof C63582uf)) {
            return "merlin_";
        }
        return "";
    }

    public String A04() {
        if (this instanceof AnonymousClass359) {
            return "feed_comment";
        }
        return "feed_netego";
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        float f;
        boolean z;
        C82713mZ A01;
        C82543mI ECO;
        Integer num;
        Integer num2;
        InterfaceC63482uV interfaceC63482uV;
        String id;
        float CGk;
        long BmE;
        Integer num3;
        InterfaceC82433m7 interfaceC82433m7;
        if (this instanceof C680834w) {
            C680834w c680834w = (C680834w) this;
            C14360o3.A0B(c59062n7, 0);
            C14360o3.A0B(interfaceC57162jr, 1);
            if (c680834w.A00) {
                Integer CFq = interfaceC57162jr.CFq(c59062n7);
                C14360o3.A07(CFq);
                int intValue = CFq.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        num2 = C05F.A01;
                    } else {
                        num2 = C05F.A0C;
                    }
                } else {
                    num2 = C05F.A00;
                }
                int intValue2 = interfaceC57162jr.CFq(c59062n7).intValue();
                if (intValue2 != 0 && intValue2 != 1) {
                    interfaceC63482uV = c680834w.A08;
                    id = ((C38321qM) c59062n7.A03).getId();
                    if (id != null) {
                        BmE = interfaceC57162jr.BmE();
                        num3 = ((AbstractC63592ug) c680834w).A00;
                        interfaceC82433m7 = null;
                        CGk = 0.5f;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    interfaceC63482uV = c680834w.A08;
                    id = ((C38321qM) c59062n7.A03).getId();
                    if (id != null) {
                        CGk = interfaceC57162jr.CGk(c59062n7);
                        BmE = interfaceC57162jr.BmE();
                        num3 = ((AbstractC63592ug) c680834w).A00;
                        interfaceC82433m7 = null;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                interfaceC63482uV.CpS(new C82453m9(interfaceC82433m7, num2, num3, id, C16930sl.A00, CGk, BmE, false, false));
                c680834w.A00(c59062n7, interfaceC57162jr);
                return;
            }
            return;
        }
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        Integer CFq2 = interfaceC57162jr.CFq(c59062n7);
        Integer num4 = C05F.A00;
        if (CFq2 == num4) {
            String A0R = AnonymousClass001.A0R(A03(), this.A06.BKe(c59062n7));
            C62792tI c62792tI = this.A05;
            if (!c62792tI.A00.A0F(A0R)) {
                num = num4;
            } else if (c62792tI.A03(A0R, this.A02)) {
                num = C05F.A01;
            } else {
                this.A00 = C05F.A0N;
            }
            this.A00 = num;
            c62792tI.A02(A0R);
        }
        int intValue3 = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue3 != 0) {
            if (intValue3 != 1) {
                num4 = C05F.A01;
            } else {
                num4 = C05F.A0C;
            }
        }
        float CGk2 = interfaceC57162jr.CGk(c59062n7);
        Map map = this.A09;
        String str = c59062n7.A05;
        Number number = (Number) map.get(str);
        if (number != null) {
            f = number.floatValue();
        } else {
            f = -1.0f;
        }
        boolean z2 = false;
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A01) {
            z2 = true;
        }
        if ((f < 0.5f && CGk2 >= 0.5f) || (f >= 0.5f && CGk2 < 0.5f)) {
            z = true;
        } else {
            z = false;
        }
        if ((!z2 || z) && (A01 = A01(c59062n7.A03, c59062n7.A04)) != null) {
            InterfaceC63482uV interfaceC63482uV2 = this.A08;
            InterfaceC60442pS interfaceC60442pS = this.A07;
            String A04 = A04();
            String A02 = A02();
            if (A02 == null) {
                A02 = str;
            }
            C14360o3.A0A(A02);
            ECO = interfaceC63482uV2.ECO(interfaceC60442pS, new C82453m9(new C82753md(A01), num4, this.A00, A02, C16930sl.A00, interfaceC57162jr.CGk(c59062n7), interfaceC57162jr.BmE(), false, false), A04, true);
        } else {
            ECO = null;
        }
        A00(c59062n7, interfaceC57162jr);
        if (!this.A01 || interfaceC57162jr.CFq(c59062n7) != C05F.A0C) {
            return;
        }
        A05(null, ECO, c59062n7.A03, "");
    }
}
