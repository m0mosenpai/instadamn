package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.tagging.activity.TaggingActivity;

/* loaded from: classes9.dex */
public final class N9Z extends C1P1 {
    public final boolean A00;
    public final /* synthetic */ OXN A01;

    public N9Z(OXN oxn, boolean z) {
        this.A01 = oxn;
        this.A00 = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x003e. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        OXN oxn;
        int A03 = C0f9.A03(1902381830);
        OXN oxn2 = this.A01;
        oxn2.A02 = C05F.A00;
        InterfaceC57994Pne interfaceC57994Pne = oxn2.A00;
        if (interfaceC57994Pne != null) {
            Context context = oxn2.A05;
            String A0q = AbstractC166997dE.A0q(context.getResources(), 2131954787);
            boolean A0E = AbstractC15820qc.A0E(context);
            Resources resources = context.getResources();
            int i = 2131955141;
            if (A0E) {
                i = 2131969697;
            }
            String string = resources.getString(i);
            C14360o3.A0A(string);
            C54567O8t c54567O8t = new C54567O8t(A0q, string);
            C56736PGe c56736PGe = (C56736PGe) interfaceC57994Pne;
            switch (c56736PGe.A00) {
                case 0:
                    C23127AMf.A05((C23127AMf) c56736PGe.A01, c54567O8t);
                    C0f9.A0A(1718047157, A03);
                    return;
                case 1:
                    oxn = ((EditMediaInfoFragment) c56736PGe.A01).A0O;
                    oxn.A03();
                    C0f9.A0A(1718047157, A03);
                    return;
                case 2:
                    C55099ObA c55099ObA = (C55099ObA) c56736PGe.A01;
                    C55099ObA.A01(c55099ObA);
                    String str2 = c54567O8t.A01;
                    String str3 = c54567O8t.A00;
                    C193328hC A0I = AbstractC31171DnF.A0I(c55099ObA.A0A);
                    A0I.A05 = str2;
                    A0I.A0r(str3);
                    AbstractC31175DnJ.A1O(A0I);
                    AbstractC31176DnK.A1W(A0I);
                    C0f9.A0A(1718047157, A03);
                    return;
                case 3:
                    C56741PGj.A00((C56741PGj) c56736PGe.A01, true);
                    C0f9.A0A(1718047157, A03);
                    return;
                default:
                    oxn = ((TaggingActivity) c56736PGe.A01).A0D;
                    if (oxn == null) {
                        str = "merchantTaggingStatusHelper";
                        break;
                    }
                    oxn.A03();
                    C0f9.A0A(1718047157, A03);
                    return;
            }
        }
        str = "delegate";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x006f. Please report as an issue. */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        IllegalArgumentException A12;
        int i;
        OXN oxn;
        C44063Jdo c44063Jdo;
        String str;
        int A03 = C0f9.A03(-893511388);
        C38881HAd c38881HAd = (C38881HAd) obj;
        int A032 = C0f9.A03(1260921645);
        C14360o3.A0B(c38881HAd, 0);
        if (c38881HAd.A02) {
            OXN oxn2 = this.A01;
            oxn2.A02 = C05F.A0C;
            InterfaceC57994Pne interfaceC57994Pne = oxn2.A00;
            if (interfaceC57994Pne != null) {
                C56736PGe c56736PGe = (C56736PGe) interfaceC57994Pne;
                switch (c56736PGe.A00) {
                    case 2:
                        C55099ObA.A01((C55099ObA) c56736PGe.A01);
                        break;
                    case 3:
                        C56741PGj.A00((C56741PGj) c56736PGe.A01, true);
                        break;
                }
                if (this.A00) {
                    InterfaceC57994Pne interfaceC57994Pne2 = oxn2.A00;
                    if (interfaceC57994Pne2 != null) {
                        interfaceC57994Pne2.Enl();
                    }
                }
                C0f9.A0A(47877307, A032);
                C0f9.A0A(381774919, A03);
                return;
            }
            str = "delegate";
        } else {
            OXN oxn3 = this.A01;
            oxn3.A02 = C05F.A0N;
            String str2 = c38881HAd.A01;
            if (str2 != null) {
                String str3 = c38881HAd.A00;
                if (str3 != null) {
                    C54567O8t c54567O8t = new C54567O8t(str2, str3);
                    InterfaceC57994Pne interfaceC57994Pne3 = oxn3.A00;
                    if (interfaceC57994Pne3 != null) {
                        C56736PGe c56736PGe2 = (C56736PGe) interfaceC57994Pne3;
                        switch (c56736PGe2.A00) {
                            case 0:
                                C23127AMf c23127AMf = (C23127AMf) c56736PGe2.A01;
                                C23127AMf.A05(c23127AMf, c54567O8t);
                                C150286pc c150286pc = c23127AMf.A06.A1K;
                                if (c150286pc.A03 && (c44063Jdo = ((C9LN) c150286pc.get()).A0B) != null) {
                                    C0fA.A00(c44063Jdo, -883493503);
                                }
                                oxn3.A01 = c54567O8t;
                                C0f9.A0A(47877307, A032);
                                C0f9.A0A(381774919, A03);
                                return;
                            case 1:
                                oxn = ((EditMediaInfoFragment) c56736PGe2.A01).A0O;
                                oxn.A03();
                                oxn3.A01 = c54567O8t;
                                C0f9.A0A(47877307, A032);
                                C0f9.A0A(381774919, A03);
                                return;
                            case 2:
                                C55099ObA c55099ObA = (C55099ObA) c56736PGe2.A01;
                                C55099ObA.A01(c55099ObA);
                                c55099ObA.A02();
                                String str4 = c54567O8t.A01;
                                String str5 = c54567O8t.A00;
                                C193328hC A0I = AbstractC31171DnF.A0I(c55099ObA.A0A);
                                A0I.A05 = str4;
                                A0I.A0r(str5);
                                AbstractC31175DnJ.A1O(A0I);
                                AbstractC31176DnK.A1W(A0I);
                                oxn3.A01 = c54567O8t;
                                C0f9.A0A(47877307, A032);
                                C0f9.A0A(381774919, A03);
                                return;
                            case 3:
                                C56741PGj.A00((C56741PGj) c56736PGe2.A01, false);
                                oxn3.A01 = c54567O8t;
                                C0f9.A0A(47877307, A032);
                                C0f9.A0A(381774919, A03);
                                return;
                            default:
                                oxn = ((TaggingActivity) c56736PGe2.A01).A0D;
                                if (oxn == null) {
                                    str = "merchantTaggingStatusHelper";
                                    break;
                                }
                                oxn.A03();
                                oxn3.A01 = c54567O8t;
                                C0f9.A0A(47877307, A032);
                                C0f9.A0A(381774919, A03);
                                return;
                        }
                    }
                    str = "delegate";
                } else {
                    A12 = AbstractC166987dD.A12("Required value was null.");
                    i = -656964212;
                }
            } else {
                A12 = AbstractC166987dD.A12("Required value was null.");
                i = 713657725;
            }
            C0f9.A0A(i, A032);
            throw A12;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
