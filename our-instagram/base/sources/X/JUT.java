package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final class JUT implements InterfaceC71916XAa {
    public final /* synthetic */ InterfaceC37159GYw A00;
    public final /* synthetic */ C2EC A01;
    public final /* synthetic */ C43699JUj A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;

    public JUT(InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, C43699JUj c43699JUj, Long l, String str) {
        this.A02 = c43699JUj;
        this.A00 = interfaceC37159GYw;
        this.A04 = str;
        this.A03 = l;
        this.A01 = c2ec;
    }

    @Override // X.InterfaceC71916XAa
    public final void DQ1(C46h c46h) {
        Integer num;
        EnumC72433Xdd enumC72433Xdd;
        EnumC72377XcD enumC72377XcD;
        if (c46h instanceof C4JL) {
            C43699JUj c43699JUj = this.A02;
            if (C18U.A06(C06090Tz.A05, c43699JUj.A02, 36310980665475470L)) {
                C45078Jx7 c45078Jx7 = (C45078Jx7) c46h.A03();
                c43699JUj.A01 = c45078Jx7;
                Integer num2 = null;
                if (c45078Jx7 != null) {
                    num = c45078Jx7.A02;
                } else {
                    num = null;
                }
                if (num == C05F.A01) {
                    C50570MUb c50570MUb = c43699JUj.A03;
                    if (c45078Jx7 != null) {
                        LinkedHashMap A1I = AbstractC166987dD.A1I();
                        A1I.put(DialogModule.KEY_TITLE, c45078Jx7.A0D);
                        A1I.put("subtitle", c45078Jx7.A06);
                        A1I.put("context", c45078Jx7.A09);
                        String str = c45078Jx7.A08;
                        String str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        A1I.put(AbstractC58317Pt9.A00(125), str);
                        String str3 = c45078Jx7.A0B;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        A1I.put(AbstractC58317Pt9.A00(364), str2);
                        AbstractC192798gL A02 = C192108fB.A02(null, c50570MUb.A02, "com.bloks.www.proactive_warning.composer_block.action", AbstractC06930Yk.A0B(A1I));
                        A02.A00(new N89(c50570MUb, c45078Jx7));
                        C1GJ.A03(A02);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    if (c45078Jx7 != null) {
                        num2 = c45078Jx7.A02;
                    }
                    if (num2 != C05F.A0C) {
                        JUk jUk = c43699JUj.A04;
                        String str4 = this.A04;
                        Long l = this.A03;
                        C14360o3.A0A(l);
                        long longValue = l.longValue();
                        if (this.A01.CVQ()) {
                            enumC72433Xdd = EnumC72433Xdd.A05;
                        } else {
                            enumC72433Xdd = EnumC72433Xdd.A06;
                        }
                        C45078Jx7 c45078Jx72 = c43699JUj.A01;
                        if (c45078Jx72 == null || (enumC72377XcD = c45078Jx72.A01) == null) {
                            enumC72377XcD = EnumC72377XcD.A0D;
                        }
                        jUk.A01(enumC72433Xdd, enumC72377XcD, str4, longValue);
                        this.A00.Dpu(c43699JUj);
                        return;
                    }
                }
            }
        }
        this.A00.onFailure();
    }
}
