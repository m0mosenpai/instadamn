package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Fzm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36292Fzm implements InterfaceC13000lm {
    public C1ON A00;
    public C1ON A01;
    public InterfaceC37166GZd A02;
    public InterfaceC37166GZd A03;
    public InterfaceC37166GZd A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C25671My A0A;
    public final UserSession A0B;
    public final C2056398n A0C;
    public final C1P1 A0D = new EV0(this, 4);
    public final C1P1 A0F = new EV0(this, 5);
    public final C1P1 A0E = new EV0(this, 6);
    public Map A05 = null;

    public final synchronized int A01() {
        int size;
        Map map = this.A05;
        if (map != null) {
            size = map.size();
        } else {
            size = 0;
        }
        return size;
    }

    public final synchronized Integer A02() {
        Integer num;
        Map map = this.A05;
        if (map != null) {
            if (map.isEmpty()) {
                num = C05F.A0N;
            } else {
                num = C05F.A0C;
            }
        } else if (this.A00 != null) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        return num;
    }

    public final synchronized void A03() {
        C25621Ms A0N = AbstractC31173DnH.A0N(this.A0B);
        A0N.A0B("direct_v2/icebreakers/get/");
        C1ON A0S = AbstractC31172DnG.A0S(A0N, ED0.class, FU5.class);
        this.A00 = A0S;
        A0S.A00 = this.A0D;
        C1GJ.A03(A0S);
    }

    public final synchronized void A04(ImmutableList immutableList) {
        Map map = this.A05;
        if (map == null) {
            map = AbstractC166987dD.A1I();
            this.A05 = map;
        }
        map.clear();
        C1LC it = immutableList.iterator();
        while (it.hasNext()) {
            FR9 fr9 = (FR9) it.next();
            fr9.A01.getClass();
            this.A05.put(fr9.A01, fr9);
        }
    }

    public static void A00(ImmutableList immutableList, C36292Fzm c36292Fzm, boolean z) {
        try {
            C2056398n c2056398n = c36292Fzm.A0C;
            ArrayList A1F = AbstractC166987dD.A1F(immutableList);
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            C16V.A03(A0S, "icebreaker_list");
            Iterator it = A1F.iterator();
            while (it.hasNext()) {
                FR9 fr9 = (FR9) it.next();
                if (fr9 != null) {
                    A0S.A0d();
                    String str = fr9.A01;
                    if (str != null) {
                        A0S.A0S("ib_id", str);
                    }
                    String str2 = fr9.A02;
                    if (str2 != null) {
                        A0S.A0S("question_text", str2);
                    }
                    String str3 = fr9.A03;
                    if (str3 != null) {
                        A0S.A0S("response_text", str3);
                    }
                    String str4 = fr9.A00;
                    if (str4 != null) {
                        A0S.A0S("ib_cta_type", str4);
                    }
                    A0S.A0a();
                }
            }
            A0S.A0Z();
            A0S.A0T("is_icebreaker_enabled", z);
            AbstractC31171DnF.A1S(c2056398n, AbstractC167017dG.A0l(A0S, stringWriter), c2056398n.A0Q, C2056398n.A0d, 3);
        } catch (IOException e) {
            C0w9.A06("IceBreakerSettingManager", "Error while serializing IceBreakerCollection", e);
        }
    }

    public final void A06(FR9 fr9, Integer num) {
        InterfaceC37166GZd interfaceC37166GZd = this.A02;
        if (interfaceC37166GZd != null) {
            interfaceC37166GZd.Cun();
        }
        UserSession userSession = this.A0B;
        EV0 ev0 = new EV0(this, 7);
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0R = true;
        A0M.A0S(EBL.class, FU6.class);
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                if (intValue == 2) {
                    fr9.A01.getClass();
                    A0M.A0L(F2H.A00(num), fr9.A01);
                    AbstractC31175DnJ.A1K(A0M, ev0);
                }
                throw AbstractC167007dF.A0c("Unknown Icebreaker update request type: ", "CREATE");
            }
            A0M.A0B(F2H.A00(num));
        } else {
            fr9.A01.getClass();
            A0M.A0L(F2H.A00(num), fr9.A01);
        }
        A0M.A9s("question_text", fr9.A02);
        A0M.A0H("response_text", fr9.A03);
        AbstractC31175DnJ.A1K(A0M, ev0);
    }

    public final void A07(boolean z) {
        InterfaceC37166GZd interfaceC37166GZd = this.A04;
        if (interfaceC37166GZd != null) {
            interfaceC37166GZd.Cun();
            this.A08 = z;
            C25621Ms A0M = AbstractC31173DnH.A0M(this.A0B);
            A0M.A0R = true;
            A0M.A0B("direct_v2/icebreakers/toggle/");
            A0M.A0I("enabled", z);
            C1ON A0S = AbstractC31172DnG.A0S(A0M, EBM.class, FU7.class);
            this.A01 = A0S;
            A0S.A00 = this.A0F;
            C1GJ.A03(A0S);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A0B.A03(C36292Fzm.class);
    }

    public C36292Fzm(C25671My c25671My, UserSession userSession, C2056398n c2056398n) {
        this.A0B = userSession;
        this.A0C = c2056398n;
        this.A0A = c25671My;
    }

    public final void A05(ImmutableList immutableList, boolean z) {
        A04(immutableList);
        this.A08 = z;
        C14120nc.A00().ATO(new C32661EZk(immutableList, this, z));
    }
}
