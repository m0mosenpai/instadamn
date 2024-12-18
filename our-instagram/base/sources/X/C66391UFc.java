package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.models.ErrorDialogContent;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineFormItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.form.fragment.model.FeatureConfiguration;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.UFc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66391UFc extends AbstractC52922bZ implements InterfaceC71988XEb {
    public static final EnumC68138VCz A0H = EnumC68138VCz.A05;
    public C62735SOb A00;
    public ECPPaymentRequest A01;
    public LoggingContext A02;
    public String A03;
    public String A04;
    public SparseArray A05;
    public final C58252li A06;
    public final C58252li A07;
    public final C2GS A08;
    public final C2GS A09;
    public final C2GS A0A;
    public final InterfaceC58362lv A0B;
    public final UFS A0C;
    public final Map A0D;
    public final InterfaceC09390do A0E = AbstractC09440dt.A01(X4B.A00);
    public final C2GS A0F;
    public final InterfaceC58362lv A0G;

    public static final PuxShippingAddressItem A00(ShippingAddress shippingAddress) {
        if (shippingAddress != null) {
            return new PuxShippingAddressItem(VG3.A0l, shippingAddress, shippingAddress.A00, W6W.A02(shippingAddress), W6W.A01(shippingAddress), false);
        }
        return new PuxShippingAddressItem(VG3.A0l, null, null, null, null, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x011d, code lost:
    
        if (r0.A01 != null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC71988XEb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AGw(android.os.Bundle r9, android.view.ContextThemeWrapper r10, androidx.fragment.app.Fragment r11, X.C63406Sjd r12) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66391UFc.AGw(android.os.Bundle, android.view.ContextThemeWrapper, androidx.fragment.app.Fragment, X.Sjd):void");
    }

    public static final FormParams A01(C66391UFc c66391UFc) {
        String str;
        boolean z;
        CheckoutConfiguration checkoutConfiguration;
        C69499VpU c69499VpU = VYN.A00;
        AddressFormFieldsConfig A00 = WF4.A00((UXS) C63406Sjd.A07(c66391UFc.A0A));
        SparseArray sparseArray = c66391UFc.A05;
        String A02 = A02(sparseArray, 2);
        String A022 = A02(sparseArray, 5);
        String A023 = A02(sparseArray, 6);
        String A024 = A02(sparseArray, 30);
        sparseArray.get(31);
        String A025 = A02(sparseArray, 7);
        String A026 = A02(sparseArray, 9);
        Object obj = sparseArray.get(8);
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String A027 = A02(sparseArray, 21);
        boolean A09 = c66391UFc.A09();
        ECPPaymentRequest eCPPaymentRequest = c66391UFc.A01;
        if (eCPPaymentRequest != null && (checkoutConfiguration = eCPPaymentRequest.A01) != null) {
            z = AbstractC31177DnL.A1b(checkoutConfiguration.A08);
        } else {
            z = false;
        }
        FeatureConfiguration featureConfiguration = new FeatureConfiguration(A09, true, z);
        LoggingContext loggingContext = c66391UFc.A02;
        if (loggingContext == null) {
            C14360o3.A0F("loggingContext");
            throw C00O.createAndThrow();
        }
        return c69499VpU.A00(featureConfiguration, A00, loggingContext, null, null, null, A02, A022, A023, A024, A025, A026, str, A027, 2131961391, 0, 2131961466, false, true);
    }

    private final List A03(List list) {
        boolean z;
        Object selectionActionViewItem;
        VG3 vg3;
        Integer num;
        PaymentReceiverInfo paymentReceiverInfo;
        String str;
        CheckoutConfiguration checkoutConfiguration;
        ArrayList arrayList = new ArrayList();
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        if (eCPPaymentRequest != null && (checkoutConfiguration = eCPPaymentRequest.A01) != null) {
            z = AbstractC31177DnL.A1b(checkoutConfiguration.A0A);
        } else {
            z = false;
        }
        if (z && A0B() && this.A02 != null) {
            if (this.A0A.A02() != null) {
                FormParams A01 = A01(this);
                ECPPaymentRequest eCPPaymentRequest2 = this.A01;
                if (eCPPaymentRequest2 != null && (paymentReceiverInfo = eCPPaymentRequest2.A05) != null && ((str = paymentReceiverInfo.A00) != null || (str = paymentReceiverInfo.A02) != null)) {
                    selectionActionViewItem = new InlineFormItem(VG3.A05, A01, str);
                    AbstractC65702TsY.A1S(selectionActionViewItem, arrayList);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return AbstractC001800i.A0a(arrayList);
        }
        this.A05 = new SparseArray();
        if (A09()) {
            AbstractC65702TsY.A1S(new SelectionHeaderItem(VG3.A0p, 2131961391, C05F.A0C, null, null), arrayList);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ShippingAddress shippingAddress = (ShippingAddress) it.next();
                String str2 = shippingAddress.A04;
                if (str2 != null) {
                    if (A09()) {
                        vg3 = VG3.A08;
                    } else {
                        vg3 = VG3.A0l;
                    }
                    String str3 = shippingAddress.A00;
                    String A02 = W6W.A02(shippingAddress);
                    String A012 = W6W.A01(shippingAddress);
                    String str4 = shippingAddress.A08;
                    String str5 = shippingAddress.A09;
                    String str6 = shippingAddress.A06;
                    String str7 = shippingAddress.A01;
                    String str8 = shippingAddress.A07;
                    String str9 = shippingAddress.A02;
                    Map map = this.A0D;
                    X1s x1s = (X1s) map.get(str2);
                    if (x1s != null) {
                        num = x1s.A01;
                    } else {
                        num = null;
                    }
                    map.get(str2);
                    SelectionShippingAddressItem selectionShippingAddressItem = new SelectionShippingAddressItem(vg3, C05F.A0N, num, str2, str4, str5, null, null, str7, str8, str9, str6, str3, A02, A012, null, shippingAddress.A03, null, shippingAddress.A0D);
                    A05(selectionShippingAddressItem, this);
                    AbstractC65702TsY.A1S(selectionShippingAddressItem, arrayList);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        if (this.A0C.A03(EnumC129485tD.A0J) != EnumC68133VCr.A03) {
            int i = 2131961310;
            if (A09()) {
                i = 2131961315;
            }
            selectionActionViewItem = new SelectionActionViewItem(VG3.A0n, null, Integer.valueOf(i), null, null);
            AbstractC65702TsY.A1S(selectionActionViewItem, arrayList);
        }
        return AbstractC001800i.A0a(arrayList);
    }

    private final void A04(Bundle bundle, Fragment fragment, SelectionShippingAddressItem selectionShippingAddressItem) {
        ErrorDialogContent errorDialogContent;
        boolean z;
        CheckoutConfiguration checkoutConfiguration;
        List list;
        int i;
        ImmutableList immutableList = null;
        List list2 = selectionShippingAddressItem.A06;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList A0q = AbstractC167017dG.A0q(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                switch (AbstractC25227BEk.A05((VDs) it.next(), 0)) {
                    case 1:
                        i = 7;
                        break;
                    case 2:
                        i = 10;
                        break;
                    case 3:
                        i = 8;
                        break;
                    case 4:
                        i = 2;
                        break;
                    case 5:
                        i = 9;
                        break;
                    case 6:
                        i = 11;
                        break;
                    default:
                        throw new IllegalStateException("Invalid Error Field");
                }
                AbstractC166997dE.A1W(A0q, i);
            }
            immutableList = ImmutableList.copyOf((Collection) A0q);
            int i2 = 2131961420;
            int i3 = 2131961419;
            if (list2.size() == 1) {
                int ordinal = ((VDs) AbstractC166987dD.A16(list2)).ordinal();
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        i2 = 2131961422;
                        if (ordinal != 5) {
                            i2 = 2131961420;
                        }
                    } else {
                        i2 = 2131961421;
                    }
                } else {
                    i2 = 2131961417;
                }
                i3 = 2131961418;
            }
            errorDialogContent = new ErrorDialogContent(VEJ.A04, null, null, null, Integer.valueOf(i2), Integer.valueOf(i3), null, null, null, null);
        } else {
            errorDialogContent = null;
        }
        C63406Sjd c63406Sjd = (C63406Sjd) this.A09.A02();
        if (c63406Sjd != null && (list = (List) c63406Sjd.A01) != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext() && !C14360o3.A0K(((ShippingAddress) it2.next()).A04, selectionShippingAddressItem.A0A)) {
            }
        }
        C69499VpU c69499VpU = VYN.A00;
        int i4 = 2131961465;
        if (A09()) {
            i4 = 2131961458;
        }
        int i5 = 2131961474;
        if (A09()) {
            i5 = 2131961467;
        }
        C2GS c2gs = this.A0A;
        AddressFormFieldsConfig A00 = WF4.A00((UXS) C63406Sjd.A07(c2gs));
        String str = selectionShippingAddressItem.A0A;
        String str2 = selectionShippingAddressItem.A03;
        String str3 = selectionShippingAddressItem.A0E;
        String str4 = selectionShippingAddressItem.A0F;
        String str5 = selectionShippingAddressItem.A0B;
        String str6 = selectionShippingAddressItem.A07;
        String str7 = selectionShippingAddressItem.A0C;
        String str8 = selectionShippingAddressItem.A0D;
        String str9 = selectionShippingAddressItem.A08;
        boolean A09 = A09();
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        if (eCPPaymentRequest != null && (checkoutConfiguration = eCPPaymentRequest.A01) != null) {
            z = AbstractC31177DnL.A1b(checkoutConfiguration.A08);
        } else {
            z = false;
        }
        FeatureConfiguration featureConfiguration = new FeatureConfiguration(A09, false, z);
        LoggingContext loggingContext = this.A02;
        if (loggingContext == null) {
            C14360o3.A0F("loggingContext");
            throw C00O.createAndThrow();
        }
        FormParams A002 = c69499VpU.A00(featureConfiguration, A00, loggingContext, immutableList, 2131961475, str, str2, str3, str4, str5, str6, str7, str8, str9, i4, i5, 2131961481, A0C(str), false);
        bundle.putAll(AbstractC69836VwM.A00(c2gs, null, null));
        bundle.putParcelable("ECP_FORM_FRAGMENT_PARAMS", A002);
        if (errorDialogContent != null) {
            bundle.putParcelable("ECP_FORM_FRAGMENT_ERROR_MESSAGE", errorDialogContent);
        }
        WCw.A00(bundle, fragment, "content_form_fragment", true, false);
    }

    public static final void A05(BaseSelectionCheckoutItem baseSelectionCheckoutItem, C66391UFc c66391UFc) {
        C69074VhP c69074VhP;
        ShippingAddress shippingAddress;
        EnumC68138VCz enumC68138VCz = (EnumC68138VCz) c66391UFc.A08.A02();
        if (enumC68138VCz != null) {
            if (enumC68138VCz.ordinal() == 1) {
                baseSelectionCheckoutItem.Eda(C05F.A01);
                return;
            }
            C63406Sjd c63406Sjd = (C63406Sjd) c66391UFc.A06.A02();
            String str = null;
            if (c63406Sjd != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null && (shippingAddress = (ShippingAddress) c69074VhP.A01) != null) {
                str = shippingAddress.A04;
            }
            VND.A00(baseSelectionCheckoutItem, str, false);
        }
    }

    private final void A06(LoggingContext loggingContext, long j, boolean z) {
        if (this.A08.A02() != EnumC68138VCz.A03 && !z) {
            C2FP.A01().A04.A0I(loggingContext, Long.valueOf(j), "select_existing_shipping_address", UFS.A01(this.A0C));
            return;
        }
        Wap wap = C2FP.A01().A04;
        Long valueOf = Long.valueOf(j);
        LinkedHashMap A01 = UFS.A01(this.A0C);
        Wap.A03(new C25531Mh(MSY.A0H(wap.A00, AbstractC58317Pt9.A00(1028)), 409), loggingContext, new C50365MLr(loggingContext, valueOf, AbstractC58317Pt9.A00(767), A01, 7));
    }

    public static final void A07(C66391UFc c66391UFc) {
        List<C63406Sjd> list;
        BaseCheckoutItem baseCheckoutItem;
        C58252li c58252li = c66391UFc.A07;
        C63406Sjd c63406Sjd = (C63406Sjd) c58252li.A02();
        if (c63406Sjd != null && (list = (List) c63406Sjd.A01) != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            for (C63406Sjd c63406Sjd2 : list) {
                Object obj = c63406Sjd2.A01;
                if (obj != null) {
                    baseCheckoutItem = (BaseCheckoutItem) obj;
                    C14360o3.A0B(baseCheckoutItem, 0);
                    if (baseCheckoutItem instanceof SelectionShippingAddressItem) {
                        A05((BaseSelectionCheckoutItem) baseCheckoutItem, c66391UFc);
                    }
                } else {
                    baseCheckoutItem = null;
                }
                A0q.add(C63406Sjd.A02(c63406Sjd2, baseCheckoutItem));
            }
            Object A02 = c58252li.A02();
            if (A02 != null) {
                c58252li.A0B(C63406Sjd.A02((C63406Sjd) A02, A0q));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A08(X.C66391UFc r9, X.C63406Sjd r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66391UFc.A08(X.UFc, X.Sjd):void");
    }

    private final boolean A09() {
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        if (eCPPaymentRequest != null && (checkoutConfiguration = eCPPaymentRequest.A01) != null) {
            return AbstractC31177DnL.A1b(checkoutConfiguration.A09);
        }
        return false;
    }

    public final void A0A(X1s x1s) {
        C63406Sjd A04;
        C69074VhP c69074VhP;
        ShippingAddress shippingAddress;
        String str;
        List<C63406Sjd> list;
        BaseCheckoutItem baseCheckoutItem;
        String str2;
        Integer num;
        SelectionShippingAddressItem selectionShippingAddressItem;
        C58252li c58252li = this.A06;
        C63406Sjd c63406Sjd = (C63406Sjd) c58252li.A02();
        if (c63406Sjd != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null && (shippingAddress = (ShippingAddress) c69074VhP.A01) != null && (str = shippingAddress.A04) != null) {
            this.A0D.put(str, x1s);
            C58252li c58252li2 = this.A07;
            C63406Sjd c63406Sjd2 = (C63406Sjd) c58252li2.A02();
            if (c63406Sjd2 != null && (list = (List) c63406Sjd2.A01) != null) {
                ArrayList A0q = AbstractC167017dG.A0q(list);
                for (C63406Sjd c63406Sjd3 : list) {
                    Object obj = c63406Sjd3.A01;
                    if (obj != null) {
                        baseCheckoutItem = (BaseCheckoutItem) obj;
                        C14360o3.A0B(baseCheckoutItem, 0);
                        List list2 = null;
                        if ((baseCheckoutItem instanceof SelectionShippingAddressItem) && (selectionShippingAddressItem = (SelectionShippingAddressItem) baseCheckoutItem) != null) {
                            str2 = selectionShippingAddressItem.A0A;
                        } else {
                            str2 = null;
                        }
                        if (C14360o3.A0K(str2, str)) {
                            SelectionShippingAddressItem selectionShippingAddressItem2 = (SelectionShippingAddressItem) baseCheckoutItem;
                            if (x1s != null) {
                                num = x1s.A01;
                            } else {
                                num = null;
                            }
                            selectionShippingAddressItem2.A00 = num;
                            if (x1s != null) {
                                list2 = x1s.A02;
                            }
                            selectionShippingAddressItem2.A06 = list2;
                        }
                    } else {
                        baseCheckoutItem = null;
                    }
                    A0q.add(C63406Sjd.A02(c63406Sjd3, baseCheckoutItem));
                }
                Object A02 = c58252li2.A02();
                if (A02 != null) {
                    c58252li2.A0B(C63406Sjd.A02((C63406Sjd) A02, A0q));
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        if (!A0B()) {
            Object obj2 = null;
            C63406Sjd c63406Sjd4 = (C63406Sjd) c58252li.A02();
            if (x1s != null) {
                if (c63406Sjd4 != null) {
                    obj2 = c63406Sjd4.A01;
                }
                A04 = C63406Sjd.A05(obj2, x1s);
            } else {
                if (c63406Sjd4 != null) {
                    obj2 = c63406Sjd4.A01;
                }
                A04 = C63406Sjd.A04(obj2);
            }
            c58252li.A0B(A04);
        }
    }

    public final boolean A0B() {
        List list;
        C63406Sjd c63406Sjd = (C63406Sjd) this.A09.A02();
        if (c63406Sjd != null && (list = (List) c63406Sjd.A01) != null) {
            return list.isEmpty();
        }
        return true;
    }

    public final boolean A0C(String str) {
        List list;
        Object obj;
        C63406Sjd c63406Sjd = (C63406Sjd) this.A09.A02();
        if (c63406Sjd != null && (list = (List) c63406Sjd.A01) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C14360o3.A0K(((ShippingAddress) obj).A04, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ShippingAddress shippingAddress = (ShippingAddress) obj;
            if (shippingAddress != null) {
                return shippingAddress.A0E;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC71988XEb
    public final void ARF(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, C63406Sjd c63406Sjd) {
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) c63406Sjd.A01;
        if (baseCheckoutItem != null) {
            LoggingContext loggingContext = this.A02;
            if (loggingContext == null) {
                C14360o3.A0F("loggingContext");
                throw C00O.createAndThrow();
            }
            SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) baseCheckoutItem;
            A06(loggingContext, Long.parseLong(selectionShippingAddressItem.A0A), A09());
            A04(bundle, fragment, selectionShippingAddressItem);
        }
    }

    @Override // X.InterfaceC71988XEb
    public final C2GS Aup() {
        return this.A08;
    }

    @Override // X.InterfaceC71988XEb
    public final void EJu() {
        C2GS c2gs = this.A08;
        if (c2gs.A02() != EnumC68138VCz.A04) {
            c2gs.A0B(A0H);
            A07(this);
        }
    }

    @Override // X.InterfaceC71988XEb
    public final C2GT EMy() {
        return this.A07;
    }

    @Override // X.InterfaceC71988XEb
    public final /* synthetic */ boolean EiA() {
        return true;
    }

    @Override // X.InterfaceC71988XEb
    public final void Epg() {
        C2GS c2gs = this.A08;
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
        A07(this);
    }

    @Override // X.InterfaceC71988XEb
    public final void FBD(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A05 = sparseArray;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2GT, X.2GS] */
    public C66391UFc(UFS ufs) {
        this.A0C = ufs;
        C58252li c58252li = new C58252li();
        this.A07 = c58252li;
        this.A09 = new C2GS();
        C2GS c2gs = new C2GS();
        this.A0F = c2gs;
        this.A08 = new C2GT(A0H);
        C58252li c58252li2 = new C58252li();
        C63406Sjd.A0D(c58252li2, null);
        this.A06 = c58252li2;
        this.A0A = new C2GS();
        this.A0D = new LinkedHashMap();
        this.A0B = new C70303WQi(this, 15);
        C70303WQi c70303WQi = new C70303WQi(this, 16);
        this.A0G = c70303WQi;
        this.A05 = new SparseArray();
        c58252li2.A0E(c2gs, c70303WQi);
        c58252li.A0E(c2gs, c70303WQi);
    }

    public static String A02(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Override // X.InterfaceC71988XEb
    public final void D6l(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, C63406Sjd c63406Sjd) {
        boolean z;
        CheckoutConfiguration checkoutConfiguration;
        boolean A1U = AbstractC167007dF.A1U(contextThemeWrapper);
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) c63406Sjd.A01;
        if (baseCheckoutItem != null) {
            if (baseCheckoutItem instanceof SelectionActionViewItem) {
                Wap wap = C2FP.A01().A04;
                LoggingContext loggingContext = this.A02;
                if (loggingContext != null) {
                    Wap.A02(new C25531Mh(MSY.A0H(wap.A00, AbstractC58317Pt9.A00(1026)), 389), loggingContext, UFS.A01(this.A0C), AbstractC58317Pt9.A00(216), 3);
                    C2GS c2gs = this.A0A;
                    boolean A09 = A09();
                    ECPPaymentRequest eCPPaymentRequest = this.A01;
                    if (eCPPaymentRequest != null && (checkoutConfiguration = eCPPaymentRequest.A01) != null) {
                        z = AbstractC31177DnL.A1b(checkoutConfiguration.A08);
                    } else {
                        z = false;
                    }
                    FeatureConfiguration featureConfiguration = new FeatureConfiguration(A09, A1U, z);
                    LoggingContext loggingContext2 = this.A02;
                    if (loggingContext2 != null) {
                        C14360o3.A0B(c2gs, 1);
                        bundle.putAll(AbstractC69836VwM.A00(c2gs, featureConfiguration, loggingContext2));
                        WCw.A00(bundle, fragment, "content_form_fragment", true, A1U);
                        return;
                    }
                }
            } else {
                SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) baseCheckoutItem;
                LoggingContext loggingContext3 = this.A02;
                if (loggingContext3 != null) {
                    A06(loggingContext3, Long.parseLong(selectionShippingAddressItem.A0A), A1U);
                    A04(bundle, fragment, selectionShippingAddressItem);
                    return;
                }
            }
            C14360o3.A0F("loggingContext");
            throw C00O.createAndThrow();
        }
    }
}
