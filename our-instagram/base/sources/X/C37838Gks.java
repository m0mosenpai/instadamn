package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Gks, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37838Gks extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public static /* synthetic */ C37838Gks A00(C37838Gks c37838Gks, C38321qM c38321qM, EnumC46210Kcm enumC46210Kcm, Integer num, List list, List list2, List list3, Map map, int i) {
        Map map2 = map;
        Integer num2 = num;
        EnumC46210Kcm enumC46210Kcm2 = enumC46210Kcm;
        List list4 = list3;
        List list5 = list2;
        List list6 = list;
        C38321qM c38321qM2 = c38321qM;
        if ((i & 1) != 0) {
            c38321qM2 = (C38321qM) c37838Gks.A05;
        }
        if ((i & 2) != 0) {
            list6 = (List) c37838Gks.A02;
        }
        if ((i & 4) != 0) {
            list5 = (List) c37838Gks.A06;
        }
        if ((i & 8) != 0) {
            list4 = (List) c37838Gks.A03;
        }
        if ((i & 16) != 0) {
            enumC46210Kcm2 = (EnumC46210Kcm) c37838Gks.A01;
        }
        if ((i & 32) != 0) {
            num2 = (Integer) c37838Gks.A04;
        }
        if ((i & 64) != 0) {
            map2 = (Map) c37838Gks.A07;
        }
        C14360o3.A0B(list6, 1);
        AbstractC25234BEr.A1R(list5, list4, enumC46210Kcm2, num2, map2);
        return new C37838Gks(c38321qM2, enumC46210Kcm2, num2, list6, list5, list4, map2);
    }

    public C37838Gks(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A06 = obj6;
        this.A07 = obj7;
    }

    public final boolean A01() {
        Number number = (Number) this.A03;
        if (number == null || ((long) number.doubleValue()) - System.currentTimeMillis() <= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 1:
                if (this != obj) {
                    if (obj instanceof C37838Gks) {
                        C37838Gks c37838Gks = (C37838Gks) obj;
                        if (c37838Gks.A00 == 1 && this.A04 == c37838Gks.A04 && this.A06 == c37838Gks.A06 && this.A02 == c37838Gks.A02 && C14360o3.A0K(this.A05, c37838Gks.A05) && C14360o3.A0K(this.A01, c37838Gks.A01) && C14360o3.A0K(this.A07, c37838Gks.A07)) {
                            obj2 = this.A03;
                            obj3 = c37838Gks.A03;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            case 2:
            default:
                return super.equals(obj);
            case 3:
                if (this != obj) {
                    if (obj instanceof C37838Gks) {
                        C37838Gks c37838Gks2 = (C37838Gks) obj;
                        if (c37838Gks2.A00 == 3 && C14360o3.A0K(this.A07, c37838Gks2.A07) && C14360o3.A0K(this.A02, c37838Gks2.A02) && C14360o3.A0K(this.A03, c37838Gks2.A03) && C14360o3.A0K(this.A04, c37838Gks2.A04) && C14360o3.A0K(this.A01, c37838Gks2.A01) && C14360o3.A0K(this.A05, c37838Gks2.A05)) {
                            obj2 = this.A06;
                            obj3 = c37838Gks2.A06;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            case 4:
                if (this != obj) {
                    if (obj instanceof C37838Gks) {
                        C37838Gks c37838Gks3 = (C37838Gks) obj;
                        if (c37838Gks3.A00 == 4 && C14360o3.A0K(this.A05, c37838Gks3.A05) && C14360o3.A0K(this.A02, c37838Gks3.A02) && C14360o3.A0K(this.A06, c37838Gks3.A06) && C14360o3.A0K(this.A03, c37838Gks3.A03) && this.A01 == c37838Gks3.A01 && this.A04 == c37838Gks3.A04) {
                            obj2 = this.A07;
                            obj3 = c37838Gks3.A07;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        int A0J;
        Object obj;
        String str2;
        switch (this.A00) {
            case 1:
                Integer num = (Integer) this.A04;
                int A0C = AbstractC25230BEn.A0C(num, AbstractC39713Hjj.A00(num)) * 31;
                int A0H = AbstractC166987dD.A0H(this.A06);
                switch (A0H) {
                    case 1:
                        str = "NAVIGATION";
                        break;
                    case 2:
                        str = "VIEW";
                        break;
                    default:
                        str = "CLICK";
                        break;
                }
                int A0H2 = AbstractC25231BEo.A0H(str, A0H, A0C);
                Integer num2 = (Integer) this.A02;
                int A0L = AbstractC167017dG.A0L(num2, AbstractC39714Hjk.A00(num2), A0H2);
                InterfaceC16510rw interfaceC16510rw = (InterfaceC16510rw) this.A05;
                if (interfaceC16510rw == null) {
                    hashCode = 0;
                } else {
                    hashCode = interfaceC16510rw.hashCode();
                }
                A0J = AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A01, (A0L + hashCode) * 31));
                obj = this.A03;
                break;
            case 2:
            default:
                return super.hashCode();
            case 3:
                return (((((((((((AbstractC167017dG.A0M(this.A07) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A06);
            case 4:
                int A0J2 = AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A02, AbstractC167017dG.A0M(this.A05) * 31))));
                int A0H3 = AbstractC166987dD.A0H(this.A04);
                switch (A0H3) {
                    case 1:
                        str2 = "LOADING";
                        break;
                    case 2:
                        str2 = "LOADED";
                        break;
                    default:
                        str2 = "INITIAL";
                        break;
                }
                A0J = AbstractC25231BEo.A0H(str2, A0H3, A0J2);
                obj = this.A07;
                break;
        }
        return AbstractC166987dD.A0I(obj, A0J);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("OxEnrichedEvent(name=");
        Integer num = (Integer) this.A04;
        if (num != null) {
            str = AbstractC39713Hjj.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", type=");
        Number number = (Number) this.A06;
        if (number != null) {
            switch (number.intValue()) {
                case 1:
                    str2 = "NAVIGATION";
                    break;
                case 2:
                    str2 = "VIEW";
                    break;
                default:
                    str2 = "CLICK";
                    break;
            }
        } else {
            str2 = "null";
        }
        A1C.append(str2);
        A1C.append(AbstractC111324zv.A00(1404));
        Integer num2 = (Integer) this.A02;
        if (num2 != null) {
            str3 = AbstractC39714Hjk.A00(num2);
        } else {
            str3 = "null";
        }
        A1C.append(str3);
        A1C.append(MSV.A00(134));
        A1C.append(this.A05);
        A1C.append(", appInfo=");
        A1C.append(this.A01);
        A1C.append(", utm=");
        A1C.append(this.A07);
        A1C.append(MSV.A00(288));
        return AbstractC167017dG.A0o(this.A03, A1C);
    }

    public C37838Gks(SZC szc, AbstractC61599RqO abstractC61599RqO, Integer num, Integer num2, Integer num3, Map map, InterfaceC16510rw interfaceC16510rw) {
        this.A00 = 1;
        AbstractC25233BEq.A0v(1, num, num2, num3);
        this.A04 = num;
        this.A06 = num2;
        this.A02 = num3;
        this.A05 = interfaceC16510rw;
        this.A01 = abstractC61599RqO;
        this.A07 = szc;
        this.A03 = map;
    }

    public C37838Gks(C77123cy c77123cy, C77123cy c77123cy2, C77123cy c77123cy3, C77123cy c77123cy4, C77123cy c77123cy5, C77123cy c77123cy6, C77123cy c77123cy7) {
        this.A00 = 2;
        C14360o3.A0B(c77123cy, 1);
        AbstractC167007dF.A1E(c77123cy2, 2, c77123cy3);
        AbstractC25234BEr.A0k(4, c77123cy4, c77123cy5, c77123cy6, c77123cy7);
        this.A06 = c77123cy;
        this.A07 = c77123cy2;
        this.A03 = c77123cy3;
        this.A04 = c77123cy4;
        this.A01 = c77123cy5;
        this.A02 = c77123cy6;
        this.A05 = c77123cy7;
    }

    public C37838Gks(C38321qM c38321qM, EnumC46210Kcm enumC46210Kcm, Integer num, List list, List list2, List list3, Map map) {
        this.A00 = 4;
        this.A05 = c38321qM;
        this.A02 = list;
        this.A06 = list2;
        this.A03 = list3;
        this.A01 = enumC46210Kcm;
        this.A04 = num;
        this.A07 = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C37838Gks() {
        /*
            r9 = this;
            r0 = 4
            r1 = r9
            r9.A00 = r0
            r2 = 0
            X.0sl r5 = X.C16930sl.A00
            X.Kcm r3 = X.EnumC46210Kcm.A04
            java.lang.Integer r4 = X.C05F.A00
            X.0sk r8 = X.AbstractC06930Yk.A0E()
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37838Gks.<init>():void");
    }
}
