package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineFormItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.fragment.model.FeatureConfiguration;
import com.facebookpay.form.fragment.model.FormLoggingEvents;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.form.fragment.model.ListCellParams;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.UFe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66393UFe extends AbstractC52922bZ implements InterfaceC71988XEb {
    public static final EnumC68138VCz A0M = EnumC68138VCz.A05;
    public SparseArray A00;
    public C62735SOb A01;
    public ECPPaymentRequest A02;
    public LoggingContext A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C58252li A0A;
    public final C58252li A0B;
    public final C2GS A0C;
    public final C2GS A0D;
    public final C2GS A0E;
    public final C2GS A0F;
    public final C2GS A0G;
    public final C2GS A0H;
    public final InterfaceC58362lv A0I;
    public final InterfaceC58362lv A0J;
    public final UFS A0K;
    public final InterfaceC09390do A0L = AbstractC09440dt.A01(X3f.A00);

    public static final void A0A(String str, List list) {
        if (str != null) {
            list.add(C63406Sjd.A04(new SelectionHeaderItem(VG3.A0p, null, C05F.A01, str, null)));
        }
    }

    public final C63406Sjd A0G() {
        C69074VhP c69074VhP;
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        VEP vep;
        VEP vep2;
        PuxContactItem puxContactItem;
        String str3 = null;
        VG3 vg3 = VG3.A0c;
        C63406Sjd A03 = C63406Sjd.A03(new PuxContactItem(vg3, null, null, null, null, null, null, false));
        C63406Sjd c63406Sjd = (C63406Sjd) this.A0A.A02();
        if (c63406Sjd != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null) {
            C69754Vup c69754Vup = (C69754Vup) c69074VhP.A01;
            String str4 = c69754Vup.A02;
            C69776VvD c69776VvD = c69754Vup.A00;
            String str5 = null;
            if (c69776VvD != null) {
                str = c69776VvD.A02;
            } else {
                str = null;
            }
            C69772Vv9 c69772Vv9 = c69754Vup.A01;
            if (c69772Vv9 != null) {
                str2 = c69772Vv9.A01;
            } else {
                str2 = null;
            }
            if (this.A08 && (str4 == null || AbstractC001900j.A0T(str4))) {
                z = true;
            } else {
                z = false;
            }
            if (this.A07 && (str == null || AbstractC001900j.A0T(str))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.A09 && (str2 == null || AbstractC001900j.A0T(str2))) {
                z3 = true;
            } else {
                z3 = false;
            }
            Boolean[] boolArr = {Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)};
            int i = 0;
            int i2 = 0;
            do {
                if (boolArr[i].booleanValue()) {
                    i2++;
                }
                i++;
            } while (i < 3);
            if (i2 == 1) {
                int i3 = 2131961362;
                if (A0D()) {
                    i3 = 2131961368;
                }
                if (A0D()) {
                    vep2 = VEP.A1F;
                } else {
                    vep2 = VEP.A0Y;
                }
                X1p x1p = new X1p(vep2, i3);
                if (z) {
                    puxContactItem = new PuxContactItem(vg3, 5, null, null, null, null, null, false);
                } else if (z2) {
                    puxContactItem = new PuxContactItem(vg3, 1, null, null, null, null, null, false);
                } else {
                    puxContactItem = new PuxContactItem(vg3, 0, null, null, null, null, null, false);
                }
                return C63406Sjd.A05(puxContactItem, x1p);
            }
            if (!this.A08) {
                str4 = null;
            }
            if (!this.A07) {
                str = null;
            }
            if (!this.A09) {
                str2 = null;
            }
            List A1Q = AbstractC16960so.A1Q(str4, str, str2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : A1Q) {
                String str6 = (String) obj;
                if (str6 != null && !AbstractC001900j.A0T(str6)) {
                    arrayList.add(obj);
                }
            }
            if (!z && !z2 && !z3) {
                if (this.A07) {
                    if (c69776VvD != null) {
                        str3 = c69776VvD.A01;
                    }
                } else if (this.A09) {
                    if (c69772Vv9 != null) {
                        str3 = c69772Vv9.A02;
                    }
                }
                str5 = String.valueOf(str3);
            }
            PuxContactItem puxContactItem2 = new PuxContactItem(vg3, null, null, (String) AbstractC001800i.A0O(arrayList, 0), (String) AbstractC001800i.A0O(arrayList, 1), (String) AbstractC001800i.A0O(arrayList, 2), str5, false);
            if (!z && !z2 && !z3) {
                return C63406Sjd.A04(puxContactItem2);
            }
            int i4 = 2131961362;
            if (A0D()) {
                i4 = 2131961368;
            }
            if (A0D()) {
                vep = VEP.A1F;
            } else {
                vep = VEP.A0Y;
            }
            return C63406Sjd.A05(puxContactItem2, new X1p(vep, i4));
        }
        return A03;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC71988XEb
    public final void AGw(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, C63406Sjd c63406Sjd) {
        String str;
        SOu sOu;
        Object obj;
        C63406Sjd c63406Sjd2;
        C69074VhP c69074VhP;
        C69754Vup c69754Vup;
        C69754Vup c69754Vup2;
        SOu sOu2;
        Object obj2;
        C63406Sjd c63406Sjd3;
        C69074VhP c69074VhP2;
        C69754Vup c69754Vup3;
        C14360o3.A0B(contextThemeWrapper, 2);
        String str2 = null;
        C63406Sjd A05 = C63406Sjd.A05(null, new NullPointerException("Selected item not in the list"));
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) c63406Sjd.A01;
        if (baseCheckoutItem != null && (baseCheckoutItem instanceof BaseSelectionCheckoutItem)) {
            int ordinal = baseCheckoutItem.BKB().ordinal();
            if (ordinal != 30) {
                if (ordinal == 31) {
                    SelectionPhoneNumberViewItem selectionPhoneNumberViewItem = (SelectionPhoneNumberViewItem) baseCheckoutItem;
                    str = null;
                    A08(AbstractC25228BEl.A13(selectionPhoneNumberViewItem.A04), "select_existing_phone", false);
                    C63406Sjd c63406Sjd4 = (C63406Sjd) this.A0D.A02();
                    if (c63406Sjd4 != null && (sOu2 = (SOu) c63406Sjd4.A01) != null) {
                        Iterator it = sOu2.A02.A03.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (C14360o3.A0K(((C69772Vv9) obj2).A01, selectionPhoneNumberViewItem.A01)) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        C69772Vv9 c69772Vv9 = (C69772Vv9) obj2;
                        if (c69772Vv9 != null && (c63406Sjd3 = (C63406Sjd) this.A0H.A02()) != null && (c69074VhP2 = (C69074VhP) c63406Sjd3.A01) != null && (c69754Vup3 = (C69754Vup) c69074VhP2.A01) != null) {
                            String id = ((BaseSelectionCheckoutItem) baseCheckoutItem).getId();
                            C69772Vv9 c69772Vv92 = c69754Vup3.A01;
                            if (c69772Vv92 != null) {
                                str2 = c69772Vv92.A02;
                            }
                            if (!C14360o3.A0K(id, str2)) {
                                c69754Vup2 = new C69754Vup(c69754Vup3.A00, c69772Vv9, c69754Vup3.A02);
                                A05 = C63406Sjd.A04(new C69074VhP(C05F.A01, c69754Vup2, str));
                            }
                        }
                    }
                }
            } else {
                SelectionEmailViewItem selectionEmailViewItem = (SelectionEmailViewItem) baseCheckoutItem;
                str = null;
                A08(AbstractC25228BEl.A13(selectionEmailViewItem.A04), "select_existing_email", false);
                C63406Sjd c63406Sjd5 = (C63406Sjd) this.A0D.A02();
                if (c63406Sjd5 != null && (sOu = (SOu) c63406Sjd5.A01) != null) {
                    Iterator it2 = sOu.A00.A03.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (C14360o3.A0K(((C69776VvD) obj).A02, selectionEmailViewItem.A01)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C69776VvD c69776VvD = (C69776VvD) obj;
                    if (c69776VvD != null && (c63406Sjd2 = (C63406Sjd) this.A0H.A02()) != null && (c69074VhP = (C69074VhP) c63406Sjd2.A01) != null && (c69754Vup = (C69754Vup) c69074VhP.A01) != null) {
                        String id2 = ((BaseSelectionCheckoutItem) baseCheckoutItem).getId();
                        C69776VvD c69776VvD2 = c69754Vup.A00;
                        if (c69776VvD2 != null) {
                            str2 = c69776VvD2.A01;
                        }
                        if (!C14360o3.A0K(id2, str2)) {
                            c69754Vup2 = new C69754Vup(c69776VvD, c69754Vup.A01, c69754Vup.A02);
                            A05 = C63406Sjd.A04(new C69074VhP(C05F.A01, c69754Vup2, str));
                        }
                    }
                }
            }
        }
        if (A05.A01 != null) {
            this.A0H.A0B(A05);
        }
        ((InterfaceC72028XFq) fragment).D7Z();
    }

    @Override // X.InterfaceC71988XEb
    public final void ARF(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, C63406Sjd c63406Sjd) {
        C14360o3.A0B(contextThemeWrapper, 2);
        D6l(bundle, contextThemeWrapper, fragment, c63406Sjd);
    }

    @Override // X.InterfaceC71988XEb
    public final void D6l(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, C63406Sjd c63406Sjd) {
        Integer B7v;
        C67524UnO c67524UnO;
        FormParams A01;
        C67524UnO c67524UnO2;
        C67524UnO c67524UnO3;
        C67524UnO c67524UnO4;
        C67524UnO c67524UnO5;
        C67524UnO c67524UnO6;
        C14360o3.A0B(contextThemeWrapper, 2);
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) c63406Sjd.A01;
        if (baseCheckoutItem != null) {
            if (baseCheckoutItem instanceof SelectionNameViewItem) {
                A08(null, "edit_name", A0C());
                W3T w3t = VYP.A00;
                int i = 2131961472;
                if (A0C()) {
                    i = 2131961471;
                }
                C63406Sjd c63406Sjd2 = (C63406Sjd) this.A0F.A02();
                if (c63406Sjd2 != null && (c67524UnO6 = (C67524UnO) c63406Sjd2.A01) != null) {
                    A01 = w3t.A01(c67524UnO6, ((SelectionNameViewItem) baseCheckoutItem).A01, i, A0C(), A0B());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (baseCheckoutItem instanceof SelectionEmailViewItem) {
                SelectionEmailViewItem selectionEmailViewItem = (SelectionEmailViewItem) baseCheckoutItem;
                String str = selectionEmailViewItem.A04;
                A08(AbstractC25228BEl.A13(str), "edit_email", A0C());
                W3S w3s = VYO.A00;
                int i2 = 2131961470;
                if (A0C()) {
                    i2 = 2131961469;
                }
                C63406Sjd c63406Sjd3 = (C63406Sjd) this.A0E.A02();
                if (c63406Sjd3 != null && (c67524UnO5 = (C67524UnO) c63406Sjd3.A01) != null) {
                    A01 = w3s.A01(c67524UnO5, 2131961477, str, selectionEmailViewItem.A01, i2, A0C(), A0B());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (baseCheckoutItem instanceof SelectionPhoneNumberViewItem) {
                SelectionPhoneNumberViewItem selectionPhoneNumberViewItem = (SelectionPhoneNumberViewItem) baseCheckoutItem;
                String str2 = selectionPhoneNumberViewItem.A04;
                A08(AbstractC25228BEl.A13(str2), "edit_phone", A0C());
                W3U w3u = VYQ.A00;
                C63406Sjd c63406Sjd4 = (C63406Sjd) this.A0G.A02();
                if (c63406Sjd4 != null && (c67524UnO4 = (C67524UnO) c63406Sjd4.A01) != null) {
                    A01 = w3u.A01(c67524UnO4, 2131961480, str2, selectionPhoneNumberViewItem.A01, 2131961473, A0C(), A0B());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                if (!(baseCheckoutItem instanceof InterfaceC71897X9e) || (B7v = ((InterfaceC71897X9e) baseCheckoutItem).B7v()) == null) {
                    return;
                }
                int intValue = B7v.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 5) {
                            return;
                        }
                        A09("add_name");
                        W3T w3t2 = VYP.A00;
                        int i3 = 2131961463;
                        if (A0C()) {
                            i3 = 2131961462;
                        }
                        C63406Sjd c63406Sjd5 = (C63406Sjd) this.A0F.A02();
                        if (c63406Sjd5 != null && (c67524UnO3 = (C67524UnO) c63406Sjd5.A01) != null) {
                            A01 = w3t2.A01(c67524UnO3, null, i3, A0C(), A0B());
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        A09("add_email");
                        W3S w3s2 = VYO.A00;
                        int i4 = 2131961461;
                        if (A0C()) {
                            i4 = 2131961460;
                        }
                        C63406Sjd c63406Sjd6 = (C63406Sjd) this.A0E.A02();
                        if (c63406Sjd6 != null && (c67524UnO2 = (C67524UnO) c63406Sjd6.A01) != null) {
                            A01 = w3s2.A01(c67524UnO2, null, null, null, i4, A0C(), A0B());
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else {
                    A09("add_phone");
                    W3U w3u2 = VYQ.A00;
                    C63406Sjd c63406Sjd7 = (C63406Sjd) this.A0G.A02();
                    if (c63406Sjd7 != null && (c67524UnO = (C67524UnO) c63406Sjd7.A01) != null) {
                        A01 = w3u2.A01(c67524UnO, null, null, null, 2131961464, A0C(), A0B());
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            bundle.putParcelable("ECP_FORM_FRAGMENT_PARAMS", A01);
            WCw.A00(bundle, fragment, "content_form_fragment", true, false);
        }
    }

    public static final InlineFormItem A00(InlineFormItem inlineFormItem, C66393UFe c66393UFe) {
        String str;
        C67524UnO c67524UnO;
        TextCellParams A00;
        C67524UnO c67524UnO2;
        C67524UnO c67524UnO3;
        FormParams formParams = inlineFormItem.A00;
        ArrayList arrayList = formParams.A0I;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CellParams cellParams = (CellParams) it.next();
            if ((cellParams instanceof TextCellParams) && cellParams != null) {
                int i = cellParams.A02;
                if (Integer.valueOf(i) == null) {
                    continue;
                } else {
                    if (i == 2) {
                        String A0Y = AbstractC65702TsY.A0Y(c66393UFe.A00, 2);
                        C63406Sjd c63406Sjd = (C63406Sjd) c66393UFe.A0F.A02();
                        if (c63406Sjd != null && (c67524UnO = (C67524UnO) c63406Sjd.A01) != null) {
                            A00 = W3T.A00(c67524UnO, null, A0Y, "add_name", true, true);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else if (i == 1) {
                        String A0Y2 = AbstractC65702TsY.A0Y(c66393UFe.A00, 1);
                        C63406Sjd c63406Sjd2 = (C63406Sjd) c66393UFe.A0E.A02();
                        if (c63406Sjd2 != null && (c67524UnO2 = (C67524UnO) c63406Sjd2.A01) != null) {
                            A00 = W3S.A00(c67524UnO2, A0Y2, "add_email", true, true);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else if (i == 0) {
                        String A0Y3 = AbstractC65702TsY.A0Y(c66393UFe.A00, 0);
                        C63406Sjd c63406Sjd3 = (C63406Sjd) c66393UFe.A0G.A02();
                        if (c63406Sjd3 != null && (c67524UnO3 = (C67524UnO) c63406Sjd3.A01) != null) {
                            A00 = W3U.A00(c67524UnO3, A0Y3, "add_phone", true, true);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        continue;
                    }
                    arrayList2.add(A00);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        int i2 = formParams.A04;
        String str2 = formParams.A0H;
        int i3 = formParams.A06;
        Integer num = formParams.A0F;
        Integer num2 = formParams.A0E;
        FormLoggingEvents formLoggingEvents = formParams.A09;
        VET vet = formParams.A0B;
        int i4 = formParams.A03;
        int i5 = formParams.A00;
        int i6 = formParams.A02;
        int i7 = formParams.A01;
        ListCellParams listCellParams = formParams.A0A;
        FeatureConfiguration featureConfiguration = formParams.A08;
        Integer num3 = formParams.A0G;
        List list = formParams.A0J;
        FormParams formParams2 = new FormParams(formParams.A07, featureConfiguration, formLoggingEvents, listCellParams, vet, formParams.A0C, num, num2, num3, formParams.A0D, str2, arrayList3, list, formParams.A0K, i2, i3, i4, i5, i6, i7, formParams.A05, formParams.A0L);
        ECPPaymentRequest eCPPaymentRequest = c66393UFe.A02;
        if (eCPPaymentRequest == null) {
            C14360o3.A0F("ecpPaymentRequest");
            throw C00O.createAndThrow();
        }
        PaymentReceiverInfo paymentReceiverInfo = eCPPaymentRequest.A05;
        if (paymentReceiverInfo != null && ((str = paymentReceiverInfo.A00) != null || (str = paymentReceiverInfo.A02) != null)) {
            return new InlineFormItem(VG3.A05, formParams2, str);
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r39.A00.A03.isEmpty() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r39.A02.A03.isEmpty() == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A01(X.SOu r39, X.C66393UFe r40) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66393UFe.A01(X.SOu, X.UFe):java.util.List");
    }

    public static final void A02(BaseSelectionCheckoutItem baseSelectionCheckoutItem, C66393UFe c66393UFe) {
        C69074VhP c69074VhP;
        C69754Vup c69754Vup;
        Integer num;
        EnumC68138VCz enumC68138VCz = (EnumC68138VCz) c66393UFe.A0C.A02();
        if (enumC68138VCz != null) {
            if (enumC68138VCz.ordinal() == 1) {
                num = C05F.A01;
            } else {
                C63406Sjd c63406Sjd = (C63406Sjd) c66393UFe.A0H.A02();
                if (c63406Sjd == null || (c69074VhP = (C69074VhP) c63406Sjd.A01) == null || (c69754Vup = (C69754Vup) c69074VhP.A01) == null) {
                    return;
                }
                VG3 BKB = baseSelectionCheckoutItem.BKB();
                int ordinal = BKB.ordinal();
                String str = null;
                if (ordinal != 30) {
                    if (ordinal != 31) {
                        if (ordinal == 29) {
                            num = C05F.A00;
                        } else {
                            throw AbstractC43594JPz.A0o(BKB, "Invalid contact item type: ", new StringBuilder());
                        }
                    } else {
                        C69772Vv9 c69772Vv9 = c69754Vup.A01;
                        if (c69772Vv9 != null) {
                            str = c69772Vv9.A02;
                        }
                    }
                } else {
                    C69776VvD c69776VvD = c69754Vup.A00;
                    if (c69776VvD != null) {
                        str = c69776VvD.A01;
                    }
                }
                VND.A00(baseSelectionCheckoutItem, str, false);
                return;
            }
            baseSelectionCheckoutItem.Eda(num);
        }
    }

    private final void A03(C69763Vv0 c69763Vv0, List list, boolean z, boolean z2) {
        String A07 = c69763Vv0.A00.A07("label");
        A0A(A07, list);
        List<C69776VvD> list2 = c69763Vv0.A03;
        ArrayList arrayList = new ArrayList();
        for (C69776VvD c69776VvD : list2) {
            String str = c69776VvD.A02;
            if (str != null) {
                String str2 = c69776VvD.A01;
                if (str2 != null) {
                    boolean z3 = c69776VvD.A04;
                    SelectionEmailViewItem selectionEmailViewItem = new SelectionEmailViewItem(VG3.A0o, C05F.A0N, str2, str, A07, c69776VvD.A00, z2, z3);
                    A02(selectionEmailViewItem, this);
                    AbstractC65702TsY.A1S(selectionEmailViewItem, arrayList);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        list.addAll(arrayList);
        if (z) {
            int i = 2131961311;
            if (A0C()) {
                i = 2131961312;
            }
            list.add(C63406Sjd.A04(new SelectionActionViewItem(VG3.A0n, 1, Integer.valueOf(i), A07, null)));
        }
    }

    private final void A04(C62736SOc c62736SOc, List list) {
        Object selectionActionViewItem;
        String A07 = c62736SOc.A00.A07("label");
        A0A(A07, list);
        String str = c62736SOc.A01;
        if (str != null && !AbstractC001900j.A0T(str)) {
            selectionActionViewItem = new SelectionNameViewItem(VG3.A0q, C05F.A00, "", str, A07);
        } else {
            selectionActionViewItem = new SelectionActionViewItem(VG3.A0n, 5, 2131961313, A07, null);
        }
        list.add(C63406Sjd.A04(selectionActionViewItem));
    }

    private final void A05(C69764Vv1 c69764Vv1, List list, boolean z, boolean z2) {
        SelectionPhoneNumberViewItem selectionPhoneNumberViewItem;
        String optionalStringField = c69764Vv1.A00.getOptionalStringField(0, "label");
        A0A(optionalStringField, list);
        List<C69772Vv9> list2 = c69764Vv1.A03;
        ArrayList arrayList = new ArrayList();
        for (C69772Vv9 c69772Vv9 : list2) {
            String str = c69772Vv9.A01;
            if (str != null) {
                String str2 = c69772Vv9.A02;
                if (str2 != null) {
                    boolean z3 = c69772Vv9.A05;
                    selectionPhoneNumberViewItem = new SelectionPhoneNumberViewItem(VG3.A0s, C05F.A0N, str2, str, optionalStringField, c69772Vv9.A00, z2, z3);
                    A02(selectionPhoneNumberViewItem, this);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                selectionPhoneNumberViewItem = null;
            }
            AbstractC65702TsY.A1S(selectionPhoneNumberViewItem, arrayList);
        }
        list.addAll(arrayList);
        if (z) {
            int i = 2131961314;
            if (A0C()) {
                i = 2131961497;
            }
            list.add(C63406Sjd.A04(new SelectionActionViewItem(VG3.A0n, 0, Integer.valueOf(i), optionalStringField, null)));
        }
    }

    public static final void A06(C66393UFe c66393UFe) {
        List<C63406Sjd> list;
        Object obj;
        C58252li c58252li = c66393UFe.A0B;
        C63406Sjd c63406Sjd = (C63406Sjd) c58252li.A02();
        if (c63406Sjd != null && (list = (List) c63406Sjd.A01) != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            for (C63406Sjd c63406Sjd2 : list) {
                Object obj2 = c63406Sjd2.A01;
                if (obj2 != null) {
                    obj = (BaseCheckoutItem) obj2;
                    C14360o3.A0B(obj, 0);
                    if (obj instanceof InlineFormItem) {
                        obj = A00((InlineFormItem) obj, c66393UFe);
                    } else if (obj instanceof BaseSelectionCheckoutItem) {
                        A02((BaseSelectionCheckoutItem) obj, c66393UFe);
                    }
                } else {
                    obj = null;
                }
                A0q.add(C63406Sjd.A02(c63406Sjd2, obj));
            }
            Object A02 = c58252li.A02();
            if (A02 != null) {
                c58252li.A0B(C63406Sjd.A02((C63406Sjd) A02, A0q));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0176, code lost:
    
        if (r8 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0108, code lost:
    
        if (r11 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r7 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r6 = r13.A0H;
        r1 = (X.C63406Sjd) r6.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r1 = (X.C69074VhP) r1.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        r1 = (X.C69754Vup) r1.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        r1 = r1.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        r2 = r1.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        if (X.C14360o3.A0K(r2, r7.A01) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        if (r10 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        r8 = null;
        r5 = r9.A02.A03.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        if (r5.hasNext() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        r3 = r5.next();
        r1 = (X.C69772Vv9) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b3, code lost:
    
        if (r1 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        r2 = r1.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
    
        if (X.C14360o3.A0K(r2, r7.A00) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c0, code lost:
    
        r8 = (X.C69772Vv9) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
    
        if (r8 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c4, code lost:
    
        r5 = (X.C63406Sjd) r6.A02();
        r4 = (X.C69074VhP) r5.A01;
        r1 = (X.C69754Vup) r4.A01;
        r6.A0B(X.C63406Sjd.A02(r5, new X.C69074VhP(r4.A00, new X.C69754Vup(r1.A00, r8, r1.A02), null)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x019a, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a0, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e9, code lost:
    
        r3 = (X.T2O) r13.A0L.getValue();
        r2 = r13.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f3, code lost:
    
        if (r2 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f5, code lost:
    
        X.C14360o3.A0F("productID");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fe, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0189, code lost:
    
        r3.A0A(X.UFS.A00(X.EnumC129485tD.A05, r13.A0K, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0194, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0101, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017d, code lost:
    
        if (r7 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ac, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(X.C66393UFe r13, X.C63406Sjd r14) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66393UFe.A07(X.UFe, X.Sjd):void");
    }

    private final void A08(Long l, String str, boolean z) {
        String A00;
        Map linkedHashMap;
        if (this.A0C.A02() != EnumC68138VCz.A03 && !z) {
            A00 = "user_click_contact_atomic";
        } else {
            A00 = AbstractC58317Pt9.A00(386);
        }
        Wap wap = C2FP.A01().A03;
        LoggingContext loggingContext = this.A03;
        if (loggingContext == null) {
            C14360o3.A0F("loggingContext");
            throw C00O.createAndThrow();
        }
        C70073W1q A05 = this.A0K.A05();
        LinkedHashMap A0o = AbstractC65702TsY.A0o(loggingContext);
        AbstractC65703TsZ.A1N(l, "TARGET_NAME", str, A0o);
        Object obj = A0o.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof InterfaceC15590qF) && !(obj instanceof InterfaceC16540rz)) || (linkedHashMap = (Map) obj) == null)) {
            linkedHashMap = new LinkedHashMap();
        }
        C70199WGm.A08(A05, linkedHashMap);
        Wap.A09(wap, "extra_data", linkedHashMap, A00, A0o);
    }

    private final boolean A0B() {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        if (eCPPaymentRequest == null) {
            C14360o3.A0F("ecpPaymentRequest");
            throw C00O.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return AbstractC31177DnL.A1b(checkoutConfiguration.A08);
        }
        return false;
    }

    private final boolean A0C() {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        if (eCPPaymentRequest == null) {
            C14360o3.A0F("ecpPaymentRequest");
            throw C00O.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return AbstractC31177DnL.A1b(checkoutConfiguration.A09);
        }
        return false;
    }

    private final boolean A0D() {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        if (eCPPaymentRequest == null) {
            C14360o3.A0F("ecpPaymentRequest");
            throw C00O.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return AbstractC31177DnL.A1b(checkoutConfiguration.A0A);
        }
        return false;
    }

    private final boolean A0E(SOu sOu, String str) {
        Object obj;
        Iterator it = sOu.A00.A03.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C69776VvD) obj).A01, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C69776VvD c69776VvD = (C69776VvD) obj;
        if (c69776VvD != null) {
            C2GS c2gs = this.A0H;
            C63406Sjd c63406Sjd = (C63406Sjd) c2gs.A02();
            C69754Vup c69754Vup = (C69754Vup) ((C69074VhP) c63406Sjd.A01).A01;
            c2gs.A0B(C63406Sjd.A02(c63406Sjd, new C69074VhP(C05F.A00, new C69754Vup(c69776VvD, c69754Vup.A01, c69754Vup.A02), null)));
            return true;
        }
        return false;
    }

    private final boolean A0F(SOu sOu, String str) {
        Object obj;
        Iterator it = sOu.A02.A03.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C69772Vv9) obj).A02, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C69772Vv9 c69772Vv9 = (C69772Vv9) obj;
        if (c69772Vv9 != null) {
            C2GS c2gs = this.A0H;
            C63406Sjd c63406Sjd = (C63406Sjd) c2gs.A02();
            C69754Vup c69754Vup = (C69754Vup) ((C69074VhP) c63406Sjd.A01).A01;
            c2gs.A0B(C63406Sjd.A02(c63406Sjd, new C69074VhP(C05F.A00, new C69754Vup(c69754Vup.A00, c69772Vv9, c69754Vup.A02), null)));
            return true;
        }
        return false;
    }

    public final boolean A0H(String str) {
        C62735SOb A00 = UFS.A00(EnumC129485tD.A05, this.A0K, str);
        if ((!this.A08 || ((T2O) this.A0L.getValue()).A0G(A00)) && ((!this.A07 || ((T2O) this.A0L.getValue()).A0F(A00)) && (!this.A09 || ((T2O) this.A0L.getValue()).A0H(A00)))) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC71988XEb
    public final C2GS Aup() {
        return this.A0C;
    }

    @Override // X.InterfaceC71988XEb
    public final void EJu() {
        C2GS c2gs = this.A0C;
        if (c2gs.A02() != EnumC68138VCz.A04) {
            c2gs.A0B(A0M);
            A06(this);
        }
    }

    @Override // X.InterfaceC71988XEb
    public final C2GT EMy() {
        return this.A0B;
    }

    @Override // X.InterfaceC71988XEb
    public final boolean EiA() {
        List A1Q = AbstractC16960so.A1Q(Boolean.valueOf(this.A08), Boolean.valueOf(this.A07), Boolean.valueOf(this.A09));
        if (!(A1Q instanceof Collection) || !A1Q.isEmpty()) {
            Iterator it = A1Q.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue() && (i = i + 1) < 0) {
                    AbstractC16960so.A1T();
                    throw C00O.createAndThrow();
                }
            }
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC71988XEb
    public final void Epg() {
        C2GS c2gs = this.A0C;
        EnumC68138VCz enumC68138VCz = (EnumC68138VCz) c2gs.A02();
        if (enumC68138VCz != null) {
            int ordinal = enumC68138VCz.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    enumC68138VCz = EnumC68138VCz.A03;
                }
            } else {
                enumC68138VCz = EnumC68138VCz.A05;
            }
            c2gs.A0B(enumC68138VCz);
        }
        A06(this);
    }

    @Override // X.InterfaceC71988XEb
    public final void FBD(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A00 = sparseArray;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2GT, X.2GS] */
    public C66393UFe(UFS ufs) {
        this.A0K = ufs;
        C58252li c58252li = new C58252li();
        this.A0B = c58252li;
        C2GS c2gs = new C2GS();
        C63406Sjd.A0D(c2gs, null);
        this.A0D = c2gs;
        ?? c2gt = new C2GT(C63406Sjd.A03(null));
        this.A0H = c2gt;
        this.A0C = new C2GT(A0M);
        C58252li c58252li2 = new C58252li();
        C63406Sjd.A0D(c58252li2, null);
        this.A0A = c58252li2;
        this.A0F = new C2GS();
        this.A0E = new C2GS();
        this.A0G = new C2GS();
        this.A0I = new C70302WQh(this, 1);
        C70302WQh c70302WQh = new C70302WQh(this, 2);
        this.A0J = c70302WQh;
        this.A00 = new SparseArray();
        c58252li2.A0E(c2gt, c70302WQh);
        c58252li.A0E(c2gt, c70302WQh);
    }

    private final void A09(String str) {
        Map linkedHashMap;
        Wap wap = C2FP.A01().A03;
        LoggingContext loggingContext = this.A03;
        if (loggingContext == null) {
            C14360o3.A0F("loggingContext");
            throw C00O.createAndThrow();
        }
        C70073W1q A05 = this.A0K.A05();
        LinkedHashMap A0o = AbstractC65702TsY.A0o(loggingContext);
        A0o.put("TARGET_NAME", str);
        Object obj = A0o.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof InterfaceC15590qF) && !(obj instanceof InterfaceC16540rz)) || (linkedHashMap = (Map) obj) == null)) {
            linkedHashMap = new LinkedHashMap();
        }
        C70199WGm.A08(A05, linkedHashMap);
        A0o.put("extra_data", linkedHashMap);
        ImmutableMap copyOf = ImmutableMap.copyOf((Map) A0o);
        C14360o3.A07(copyOf);
        wap.Chz(AbstractC58317Pt9.A00(384), copyOf);
    }
}
