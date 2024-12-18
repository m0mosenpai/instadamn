package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Fxc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36162Fxc implements InterfaceC23471Cj {
    public final int A00;
    public final Object A01;

    public C36162Fxc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        String str;
        InterfaceC02590Ai A0f;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(map, 0);
                java.util.Set entrySet = map.entrySet();
                LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(entrySet, 10)));
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(it);
                    String A17 = AbstractC31172DnG.A17(A1K);
                    switch (A17.hashCode()) {
                        case -1921431796:
                            if (A17.equals("android.permission.READ_CALL_LOG")) {
                                str = "READ_CALL_LOG";
                                break;
                            }
                            break;
                        case -1674700861:
                            if (A17.equals("android.permission.ANSWER_PHONE_CALLS")) {
                                str = "ANSWER_PHONE_CALLS";
                                break;
                            }
                            break;
                        case -5573545:
                            if (A17.equals("android.permission.READ_PHONE_STATE")) {
                                str = "READ_PHONE_STATE";
                                break;
                            }
                            break;
                        case 112197485:
                            if (A17.equals("android.permission.CALL_PHONE")) {
                                str = "CALL_PHONE";
                                break;
                            }
                            break;
                    }
                    str = "INVALID_PERMISSION_NAME";
                    int ordinal = ((EnumC172127lh) A1K.getValue()).ordinal();
                    String str2 = "DENIED";
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                str2 = "UNKNOWN";
                            } else {
                                Map map2 = FEP.A00;
                                C14360o3.A0B(AbstractC31172DnG.A17(A1K), 0);
                                if (!(!AbstractC31171DnF.A0Q().A05(r1))) {
                                    str2 = "PERMANENTLY_DENIED";
                                }
                            }
                        }
                    } else {
                        str2 = "GRANTED";
                    }
                    A18.put(str, str2);
                }
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    Map.Entry A1K2 = AbstractC166987dD.A1K(A15);
                    String A172 = AbstractC31172DnG.A17(A1K2);
                    if (A1K2.getValue() == EnumC172127lh.A04) {
                        Map map3 = FEP.A00;
                        C14360o3.A0B(A172, 0);
                        if (!(!AbstractC31171DnF.A0Q().A05(A172))) {
                        }
                    }
                    AbstractC31171DnF.A0Q().A02(A172);
                }
                C34578FLn c34578FLn = (C34578FLn) this.A01;
                AbstractC25227BEk.A1M(c34578FLn.A01, AbstractC31179DnN.A0I(A18), c34578FLn.A02);
                return;
            case 1:
                ((InterfaceC23621Ds) this.A01).resumeWith(Boolean.valueOf(AbstractC167007dF.A1X(map.get(AbstractC43591JPw.A00(8)), EnumC172127lh.A05)));
                return;
            case 2:
                if (map.get(AbstractC43591JPw.A00(2)) == EnumC172127lh.A05) {
                    C33231ElP.A01((C33231ElP) this.A01);
                    return;
                } else {
                    AbstractC31171DnF.A0z(2131953611);
                    return;
                }
            case 3:
                if (map.get(AbstractC43591JPw.A00(2)) == EnumC172127lh.A05) {
                    EL6 el6 = (EL6) this.A01;
                    C1GJ.A03(new KK9(EL6.A00(el6), el6));
                    return;
                } else {
                    C9GR.A07(AbstractC31172DnG.A07(this.A01), 2131953611);
                    return;
                }
            default:
                EnumC172127lh enumC172127lh = (EnumC172127lh) map.get("android.permission.READ_CONTACTS");
                if (enumC172127lh == null) {
                    enumC172127lh = EnumC172127lh.A03;
                }
                int ordinal2 = enumC172127lh.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            C07270a1 c07270a1 = ((EKC) this.A01).A01;
                            double A00 = AbstractC31174DnI.A00(c07270a1, 0);
                            double A002 = AbstractC31171DnF.A00();
                            A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a1), "nux_contacts_upsell_automatically_declined");
                            AbstractC31179DnN.A18(A0f, A00, A002);
                            AbstractC31171DnF.A1A(A0f, "contacts_upsell");
                            AbstractC31179DnN.A15(A0f);
                            AbstractC35274Fh9.A05(A0f);
                            AbstractC35274Fh9.A0C(A0f, c07270a1, "release_channel", AbstractC35274Fh9.A01());
                        }
                    } else {
                        C1Q9 c1q9 = C1Q9.A0X;
                        EKC ekc = (EKC) this.A01;
                        AbstractC31173DnH.A1S(c1q9.A02(ekc.A01).A05(null, EnumC33523Erw.A0A.A00), ekc.A01);
                    }
                    EKC.A00((EKC) this.A01);
                    return;
                }
                C07270a1 c07270a12 = ((EKC) this.A01).A01;
                String str3 = EnumC33523Erw.A0A.A00.A01;
                AbstractC167007dF.A1K(c07270a12, str3);
                double A01 = AbstractC31171DnF.A01();
                double A003 = AbstractC31171DnF.A00();
                A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a12), "nux_contacts_upsell_accepted");
                AbstractC31179DnN.A16(A0f, A01, A003);
                AbstractC35274Fh9.A06(A0f);
                AbstractC31176DnK.A1J(A0f, A003);
                AbstractC31178DnM.A19(A0f, str3);
                AbstractC35274Fh9.A09(A0f, c07270a12);
                A0f.A7v("silent", false);
                A0f.Cht();
                EKC.A00((EKC) this.A01);
                return;
        }
    }
}
