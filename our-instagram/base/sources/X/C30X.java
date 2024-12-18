package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.30X, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30X {
    public static final void A00(UserSession userSession, C82713mZ c82713mZ, C38321qM c38321qM, String str) {
        String str2;
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(str, 3);
        if (c82713mZ != null && c38321qM.CdW()) {
            c82713mZ.A1i = Boolean.valueOf(AbstractC41071vF.A0O(userSession, c38321qM));
            C38576Gxf c38576Gxf = c38321qM.A0B;
            if (c38576Gxf != null) {
                c82713mZ.A1h = true;
                c82713mZ.A3s = Long.valueOf(c38576Gxf.A00);
                String str3 = c38576Gxf.A01;
                c82713mZ.A69 = str3;
                c82713mZ.A6B = str3;
                if (c38576Gxf.A04) {
                    c82713mZ.A5i = c38576Gxf.A03;
                    c82713mZ.A5h = c38576Gxf.A02;
                } else {
                    c82713mZ.A5g = c38576Gxf.A03;
                }
            }
            if (str.equals("feed_contextual_ads_chain")) {
                Integer A2T = c38321qM.A2T();
                if (A2T != null) {
                    str2 = A2T.toString();
                } else {
                    str2 = null;
                }
                c82713mZ.A5o = str2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        if (r0 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C82713mZ r3, X.C38321qM r4) {
        /*
            r2 = 1
            if (r4 == 0) goto L21
            boolean r0 = r4.A5O()
            if (r0 == 0) goto L40
            X.1rF r0 = r4.A0C
            java.util.List r1 = r0.AmB()
            if (r1 == 0) goto L40
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L40
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L29
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L29
        L21:
            r2 = 0
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.A1D = r0
            return
        L29:
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()
            X.1qM r0 = (X.C38321qM) r0
            X.3vf r0 = r0.A1H()
            if (r0 == 0) goto L2d
            goto L22
        L40:
            boolean r0 = r4.A5Q()
            if (r0 == 0) goto L51
            X.1qM r0 = r4.A1d()
            X.3vf r0 = r0.A1H()
        L4e:
            if (r0 == 0) goto L21
            goto L22
        L51:
            X.3vf r0 = r4.A1H()
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30X.A02(X.3mZ, X.1qM):void");
    }

    public final void A03(UserSession userSession, C82713mZ c82713mZ, C38321qM c38321qM, C75113Zb c75113Zb, StringBuilder sb) {
        List list;
        double d;
        long j;
        long A00;
        String str;
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(sb, 3);
        if (c38321qM.CdW()) {
            C11T.A06("This operation must be run on UI thread.");
            sb.delete(0, sb.length());
            sb.append(AbstractC41071vF.A0E(userSession, c38321qM));
            c82713mZ.A78 = sb.toString();
            c82713mZ.A4Y = C32V.A00(userSession);
            if (AbstractC41071vF.A0D(userSession, c38321qM) != null) {
                c82713mZ.A4g = AbstractC41071vF.A0D(userSession, c38321qM);
            }
            if (AbstractC41071vF.A0B(userSession, c38321qM) != null) {
                c82713mZ.A5D = AbstractC41071vF.A0B(userSession, c38321qM);
                c82713mZ.A5C = AbstractC41071vF.A0A(userSession, c38321qM);
                c82713mZ.A5E = AbstractC41071vF.A0C(userSession, c38321qM);
            }
            c82713mZ.A2w = Integer.valueOf(AbstractC19730y1.A00(AbstractC12960li.A00).A00());
            c82713mZ.A30 = Integer.valueOf(C1H6.A03() ? 1 : 0);
            if (AbstractC61652rS.A02(userSession)) {
                c82713mZ.A4d = AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession)).toString();
                c82713mZ.A4e = AbstractC61652rS.A00(userSession).toString();
            }
            InterfaceC39541sb injected = c38321qM.A0C.getInjected();
            if (injected != null) {
                list = injected.Ark();
            } else {
                list = null;
            }
            Map A0L = AbstractC41071vF.A0L(list);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : A0L.entrySet()) {
                EnumC41091vH enumC41091vH = (EnumC41091vH) entry.getKey();
                int intValue = ((Number) entry.getValue()).intValue();
                if (enumC41091vH.ordinal() == 13) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("optimization_type", String.valueOf(enumC41091vH.A00));
                    if (c38321qM.A4n()) {
                        str = String.valueOf(intValue);
                    } else {
                        str = "1120001";
                    }
                    hashMap.put("option_value", str);
                    arrayList.add(hashMap);
                }
            }
            if (!(!arrayList.isEmpty())) {
                arrayList = null;
            }
            c82713mZ.A7b = arrayList;
            if (!c38321qM.A67()) {
                C689838k A002 = AbstractC689738j.A00(userSession);
                if (C689838k.A00(c38321qM, A002, c75113Zb)) {
                    if (C18U.A06(C06090Tz.A05, A002.A00, 36323470430186783L)) {
                        A00 = 3000;
                    } else {
                        A00 = 4000;
                    }
                } else {
                    UserSession userSession2 = A002.A00;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession2, 36316048727674784L) && c38321qM.Cff()) {
                        d = 1000.0d;
                        j = 37160473657737333L;
                    } else {
                        d = 1000.0d;
                        j = 37160473656885364L;
                    }
                    A00 = (long) (d * C18U.A00(c06090Tz, userSession2, j));
                }
                c38321qM.getId();
                c82713mZ.A2O = Double.valueOf(A00 / 1000);
                c82713mZ.A28 = false;
                c82713mZ.A27 = false;
            }
            c82713mZ.A1S = c38321qM.A0G;
            if (C87153uY.A0A(userSession, c38321qM)) {
                c82713mZ.A34 = c38321qM.A0I;
            }
        }
    }

    public static final void A01(C82713mZ c82713mZ) {
        if (c82713mZ != null) {
            c82713mZ.A2w = Integer.valueOf(AbstractC19730y1.A00(AbstractC12960li.A00).A00());
            c82713mZ.A30 = Integer.valueOf(C1H6.A03() ? 1 : 0);
        }
    }
}
