package X;

import android.text.TextUtils;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public final class GFX implements InterfaceC169357h9 {
    public InterfaceC169357h9 A00;
    public InterfaceC169507hQ A01;
    public InterfaceC37208GaJ A03;
    public final long A04;
    public final long A05;
    public final C7NH A06;
    public final FQB A07;
    public final C64451TEn A08;
    public final C2DS A09;
    public final C18A A0A;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final int A0L;
    public final C42221xC A0M;
    public final C41761wQ A0N;
    public final UserSession A0O;
    public final List A0B = new CopyOnWriteArrayList();
    public final Map A0E = new ConcurrentHashMap();
    public final Map A0D = AbstractC166987dD.A1I();
    public final ConcurrentHashMap A0F = new ConcurrentHashMap();
    public final Map A0C = new ConcurrentHashMap();
    public String A02 = "";

    public static void A03(Map map, List list) {
        synchronized (map) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DirectSearchResult A0M = AbstractC31171DnF.A0M(it);
                if (A0M instanceof DirectShareTarget) {
                    map.put(((DirectShareTarget) A0M).A09(), A0M);
                } else if (A0M != null) {
                    map.put(A0M.toString(), A0M);
                }
            }
        }
    }

    public static String[] A05(CQLResultSet cQLResultSet, int i, int i2) {
        String string = cQLResultSet.getString(i, i2);
        if (!TextUtils.isEmpty(string)) {
            return TextUtils.split(string, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
        return new String[0];
    }

    @Override // X.InterfaceC169517hR
    public final void DEw() {
        this.A01 = null;
        FQB fqb = this.A07;
        fqb.A03.A03.A01();
        fqb.A02.A01();
        this.A0N.A01();
        InterfaceC37208GaJ interfaceC37208GaJ = this.A03;
        if (interfaceC37208GaJ != null) {
            interfaceC37208GaJ.stop();
        }
    }

    public static List A00(C46h c46h, GFX gfx) {
        EnumC92794Ds enumC92794Ds;
        int intValue;
        PendingRecipient pendingRecipient;
        User A02;
        if (c46h != null && (c46h instanceof C4JL)) {
            ArrayList A1E = AbstractC166987dD.A1E();
            AbstractC1351869s abstractC1351869s = (AbstractC1351869s) c46h.A03();
            boolean isEmpty = TextUtils.isEmpty(gfx.A02);
            int count = abstractC1351869s.mResultSet.getCount();
            if (isEmpty) {
                count = Math.min(count, gfx.A0L);
            }
            for (int i = 0; i < abstractC1351869s.mResultSet.getCount() && A1E.size() < count; i++) {
                if (!AbstractC46878KoL.A00(Integer.valueOf(abstractC1351869s.mResultSet.getInteger(i, 3))).A02) {
                    if (abstractC1351869s.mResultSet.getNullableLong(i, 0) != null) {
                        String[] A05 = A05(abstractC1351869s.mResultSet, i, 9);
                        String[] A052 = A05(abstractC1351869s.mResultSet, i, 10);
                        String[] A053 = A05(abstractC1351869s.mResultSet, i, 13);
                        String[] A054 = A05(abstractC1351869s.mResultSet, i, 14);
                        int length = A054.length;
                        int min = Math.min(length, Math.min(A05.length, length));
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        for (int i2 = 0; i2 < min; i2++) {
                            if (i2 < A052.length && (A02 = gfx.A0A.A02(A052[i2])) != null) {
                                pendingRecipient = new PendingRecipient(A02);
                            } else {
                                ImageUrl imageUrl = PendingRecipient.A0g;
                                pendingRecipient = new PendingRecipient(AbstractC25225BEi.A0t(A054[i2]), A05[i2], A053[i2]);
                            }
                            A1E2.add(pendingRecipient);
                        }
                        long longValue = abstractC1351869s.mResultSet.getNullableLong(i, 0).longValue();
                        Long nullableLong = abstractC1351869s.mResultSet.getNullableLong(i, 1);
                        if (Ko0.A00(abstractC1351869s.mResultSet.getInteger(i, 2))) {
                            enumC92794Ds = EnumC92794Ds.A04;
                        } else {
                            enumC92794Ds = EnumC92794Ds.A07;
                        }
                        MsysThreadId msysThreadId = new MsysThreadId(enumC92794Ds, nullableLong, longValue);
                        String string = abstractC1351869s.mResultSet.getString(i, 12);
                        if (string == null) {
                            string = "";
                        }
                        if (abstractC1351869s.mResultSet.getNullableInteger(i, 5) == null) {
                            intValue = 0;
                        } else {
                            intValue = abstractC1351869s.mResultSet.getNullableInteger(i, 5).intValue();
                        }
                        DirectShareTarget directShareTarget = new DirectShareTarget(msysThreadId, abstractC1351869s.mResultSet.getNullableBoolean(i, 17), string, A1E2, intValue);
                        if (abstractC1351869s.mResultSet.getString(i, 15) != null) {
                            directShareTarget.A02 = new ExtendedImageUrl(abstractC1351869s.mResultSet.getString(i, 15), -1, -1);
                        }
                        A1E.add(directShareTarget);
                    }
                }
            }
            return A1E;
        }
        return Collections.emptyList();
    }

    public static List A01(C46h c46h, GFX gfx, List list, Map map) {
        InterfaceC169357h9 interfaceC169357h9 = gfx.A00;
        interfaceC169357h9.getClass();
        FQB fqb = gfx.A07;
        fqb.getClass();
        String str = gfx.A02;
        String str2 = (String) fqb.A01.A0W();
        if (str2 == null) {
            str2 = "";
        }
        if (AbstractC13670mt.A0G(str, str2)) {
            Map map2 = gfx.A0E;
            map2.clear();
            boolean z = gfx.A0H;
            List A00 = A00(c46h, gfx);
            if (z) {
                ArrayList A12 = AbstractC166997dE.A12(A00, 0);
                for (Object obj : A00) {
                    Boolean bool = ((DirectShareTarget) ((DirectSearchResult) obj)).A0A;
                    if (bool != null && bool.booleanValue()) {
                        A12.add(obj);
                    }
                }
                A00 = A12;
            }
            A03(map2, A00);
        }
        if (AbstractC13670mt.A0G(gfx.A02, interfaceC169357h9.BjQ())) {
            Map map3 = gfx.A0D;
            map3.clear();
            A03(map3, list);
        }
        gfx.A0F.putAll(map);
        if (!gfx.A0I || !list.isEmpty()) {
            A02(gfx);
        }
        return gfx.A0B;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0147 A[Catch: all -> 0x01bf, TRY_LEAVE, TryCatch #1 {, blocks: (B:62:0x00ab, B:63:0x00af, B:65:0x00b5, B:123:0x00c1, B:68:0x00cb, B:70:0x00d9, B:72:0x00dd, B:75:0x00e6, B:115:0x00ea, B:78:0x00ee, B:80:0x00f6, B:82:0x0111, B:84:0x011b, B:87:0x018e, B:90:0x019a, B:93:0x01a8, B:96:0x01b1, B:103:0x0141, B:105:0x0147, B:107:0x0158, B:108:0x0183, B:109:0x00fb, B:111:0x00ff, B:113:0x010b, B:126:0x01bd), top: B:61:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0183 A[Catch: all -> 0x01bf, TryCatch #1 {, blocks: (B:62:0x00ab, B:63:0x00af, B:65:0x00b5, B:123:0x00c1, B:68:0x00cb, B:70:0x00d9, B:72:0x00dd, B:75:0x00e6, B:115:0x00ea, B:78:0x00ee, B:80:0x00f6, B:82:0x0111, B:84:0x011b, B:87:0x018e, B:90:0x019a, B:93:0x01a8, B:96:0x01b1, B:103:0x0141, B:105:0x0147, B:107:0x0158, B:108:0x0183, B:109:0x00fb, B:111:0x00ff, B:113:0x010b, B:126:0x01bd), top: B:61:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.GFX r13) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFX.A02(X.GFX):void");
    }

    private boolean A04(String str) {
        if (!AbstractC13670mt.A0B(this.A02) && str != null && str.toLowerCase(C1Q2.A02()).startsWith(this.A02.toLowerCase(C1Q2.A02()))) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC169517hR
    public final String An8() {
        InterfaceC169357h9 interfaceC169357h9 = this.A00;
        if (interfaceC169357h9 != null) {
            return interfaceC169357h9.An8();
        }
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final Object B3l() {
        InterfaceC169357h9 interfaceC169357h9 = this.A00;
        if (interfaceC169357h9 != null) {
            return interfaceC169357h9.B3l();
        }
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final boolean BC6() {
        InterfaceC169357h9 interfaceC169357h9 = this.A00;
        if (interfaceC169357h9 != null && interfaceC169357h9.BC6()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC169517hR
    public final String Bk6() {
        InterfaceC169357h9 interfaceC169357h9 = this.A00;
        if (interfaceC169357h9 != null) {
            return interfaceC169357h9.Bk6();
        }
        return null;
    }

    @Override // X.InterfaceC169357h9
    public final Integer BmK() {
        InterfaceC169357h9 interfaceC169357h9 = this.A00;
        if (interfaceC169357h9 != null) {
            return interfaceC169357h9.BmK();
        }
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final String Bo9() {
        InterfaceC169357h9 interfaceC169357h9 = this.A00;
        if (interfaceC169357h9 != null) {
            return interfaceC169357h9.Bo9();
        }
        return null;
    }

    @Override // X.InterfaceC169357h9, X.InterfaceC169517hR
    public final List Bri() {
        InterfaceC169357h9 interfaceC169357h9 = this.A00;
        if (interfaceC169357h9 != null) {
            return interfaceC169357h9.Bri();
        }
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CUG() {
        InterfaceC169357h9 interfaceC169357h9 = this.A00;
        if (interfaceC169357h9 != null && interfaceC169357h9.CUG()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CXh() {
        FQB fqb;
        InterfaceC169357h9 interfaceC169357h9 = this.A00;
        if (interfaceC169357h9 != null && interfaceC169357h9.CXh() && (fqb = this.A07) != null) {
            Boolean bool = (Boolean) fqb.A00.A0W();
            if (bool == null || !bool.booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CZV() {
        InterfaceC169357h9 interfaceC169357h9 = this.A00;
        if (interfaceC169357h9 != null) {
            return interfaceC169357h9.CZV();
        }
        return false;
    }

    @Override // X.InterfaceC169517hR
    public final void EKu() {
        this.A07.A03.A01(new G5O(this.A02));
        InterfaceC169357h9 interfaceC169357h9 = this.A00;
        if (interfaceC169357h9 != null) {
            interfaceC169357h9.EKu();
        }
    }

    @Override // X.InterfaceC169517hR
    public final void ERL(List list) {
        InterfaceC169357h9 interfaceC169357h9 = this.A00;
        if (interfaceC169357h9 != null) {
            interfaceC169357h9.ERL(list);
        }
    }

    @Override // X.InterfaceC169517hR
    public final void EYJ(InterfaceC169507hQ interfaceC169507hQ) {
        if (this.A01 != interfaceC169507hQ) {
            this.A01 = interfaceC169507hQ;
        }
    }

    @Override // X.InterfaceC169517hR
    public final void Eby(String str) {
        if (str == null) {
            str = "";
        }
        this.A02 = str;
        this.A07.A03.A01(new G5O(str));
        InterfaceC169357h9 interfaceC169357h9 = this.A00;
        if (interfaceC169357h9 != null) {
            interfaceC169357h9.Eby(this.A02);
        }
    }

    @Override // X.InterfaceC169517hR
    public final boolean isLoading() {
        Boolean bool = (Boolean) this.A07.A00.A0W();
        if (bool == null || !bool.booleanValue()) {
            InterfaceC169357h9 interfaceC169357h9 = this.A00;
            if (interfaceC169357h9 != null && interfaceC169357h9.isLoading()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public GFX(UserSession userSession, InterfaceC169357h9 interfaceC169357h9, boolean z, boolean z2, boolean z3) {
        C42221xC A01;
        this.A0O = userSession;
        this.A0A = AnonymousClass189.A00(userSession);
        this.A0H = z2;
        this.A08 = (C64451TEn) userSession.A01(C64451TEn.class, new C50160MDn(userSession, 3));
        this.A0I = z;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0K = C18U.A06(c06090Tz, userSession, 36319381621317013L);
        this.A04 = C18U.A01(c06090Tz, userSession, 36600856598089781L);
        this.A05 = C18U.A01(c06090Tz, userSession, 36600856598155318L);
        this.A0L = AbstractC31178DnM.A01(c06090Tz, userSession, 36595316090210424L);
        this.A0J = C18U.A06(c06090Tz, userSession, 36313841113630988L);
        this.A0G = C18U.A06(c06090Tz, userSession, 36313841113827597L);
        boolean A06 = C18U.A06(c06090Tz, userSession, 2342156051466094224L);
        this.A06 = C7NH.A00(userSession);
        this.A00 = interfaceC169357h9;
        C42221xC A062 = C42221xC.A06(new C43645JSd(this, 11));
        FQB fqb = new FQB(C137746Lw.A00(userSession, "MsysSearchResultProvider"));
        this.A07 = fqb;
        fqb.A00();
        this.A09 = AbstractC28761aE.A00(userSession);
        if (A06) {
            InterfaceC37208GaJ A00 = AbstractC44044JdV.A00(userSession);
            this.A03 = A00;
            A00.start();
            this.A03.ChV();
            if (z3) {
                this.A00 = null;
                A01 = C42221xC.A01(new JYF(this, 3), fqb.A03.A01.A0K(C36236Fyp.A00), this.A03.ANg());
            } else {
                A01 = C42221xC.A03(new MOI() { // from class: X.Fyb
                    @Override // X.MOI
                    public final Object ABr(Object obj, Object obj2, Object obj3) {
                        return GFX.A01((C46h) obj2, GFX.this, (List) obj, (Map) obj3);
                    }
                }, A062, fqb.A03.A01.A0K(C36236Fyp.A00), this.A03.ANg());
            }
        } else {
            A01 = C42221xC.A01(new JYF(this, 4), A062, fqb.A03.A01.A0K(C36236Fyp.A00));
        }
        this.A0M = A01;
        C41761wQ A0S = AbstractC31173DnH.A0S();
        this.A0N = A0S;
        GKK.A00(A01, A0S, this, 21);
    }

    @Override // X.InterfaceC169517hR
    public final String BjQ() {
        return this.A02;
    }

    @Override // X.InterfaceC169517hR
    public final /* bridge */ /* synthetic */ Object Bov() {
        return this.A0B;
    }
}
