package X;

import android.util.SparseArray;
import com.facebook.R;
import com.facebook.common.locale.Country;
import com.facebookpay.addresstypeahead.controller.AddressTypeaheadController;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.form.model.FormField;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class UvP extends AbstractC129455t8 {
    public AddressTypeaheadController A00;
    public UvM A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final LoggingContext A0B;
    public final int A0C;
    public final SparseArray A0D;
    public final AddressFormFieldsConfig A0E;
    public final String A0F;
    public final List A0G;
    public final Map A0H;
    public final java.util.Set A0I;
    public final java.util.Set A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;

    private final FormCellLoggingEvents A00(int i) {
        Map map = this.A0H;
        if (map != null) {
            return (FormCellLoggingEvents) AbstractC166997dE.A0m(map, i);
        }
        return null;
    }

    public static void A01(SparseArray sparseArray, UvP uvP, C67664Uuw c67664Uuw, int i) {
        Object obj = sparseArray.get(i);
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        c67664Uuw.A0B = (String) obj;
        ((AbstractC69334Vlg) c67664Uuw).A02 = uvP.A00(i);
    }

    public static final void A02(C66744Ua2 c66744Ua2, UvP uvP) {
        ArrayList arrayList = new ArrayList();
        uvP.A04(arrayList, 5, c66744Ua2.A07("address_line_1"));
        uvP.A04(arrayList, 6, c66744Ua2.A08("address_line_2"));
        uvP.A04(arrayList, 7, c66744Ua2.A09(ServerW3CShippingAddressConstants.CITY));
        uvP.A04(arrayList, 9, c66744Ua2.A0A("postal_code"));
        String A0C = c66744Ua2.A0C("state_code");
        if (A0C == null) {
            A0C = c66744Ua2.A0B(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        }
        uvP.A04(arrayList, 8, A0C);
        W4G w4g = ((AbstractC129435t5) uvP).A00;
        if (w4g != null) {
            String A00 = AbstractC58317Pt9.A00(75);
            Wap wap = C2FP.A01().A04;
            LoggingContext loggingContext = w4g.A00;
            LinkedHashMap A01 = UFS.A01(w4g.A01);
            C14360o3.A0B(loggingContext, 0);
            Wap.A03(new C25531Mh(MSY.A0H(wap.A00, "client_add_ecpaddresstypeahead_success"), 17), loggingContext, new C50365MLr(arrayList, loggingContext, A01, A00, 3));
        }
    }

    public static void A03(C67664Uuw c67664Uuw, FormField formField) {
        ImmutableList copyOf = ImmutableList.copyOf((Collection) formField.A04);
        C14360o3.A07(copyOf);
        c67664Uuw.A0G.addAll(copyOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r2 == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.facebookpay.form.cell.CellParams, java.lang.Object, com.facebookpay.form.cell.addresslist.AddressListCellParams] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A05(android.util.SparseArray r14, com.google.common.collect.ImmutableList.Builder r15) {
        /*
            r13 = this;
            boolean r0 = r13.A0Q
            r10 = 0
            if (r0 == 0) goto L72
            com.facebookpay.logging.LoggingContext r4 = r13.A0B
            if (r4 == 0) goto L72
            java.util.List r3 = r13.A0G
            if (r3 == 0) goto L72
            r9 = 33
            java.lang.Object r0 = r14.get(r9)
            if (r0 == 0) goto L72
            int r0 = r3.size()
            r5 = 2
            r11 = 1
            boolean r2 = X.AbstractC25230BEn.A1S(r0, r5)
            r1 = 34
            java.lang.Object r0 = r14.get(r1)
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L36
            java.lang.Object r0 = r14.get(r1)
            boolean r0 = X.MSY.A1X(r0)
            if (r0 != 0) goto L36
            r0 = 1
            if (r2 != 0) goto L37
        L36:
            r0 = 0
        L37:
            r2 = 2131951651(0x7f130023, float:1.9539723E38)
            if (r0 == 0) goto L40
            java.util.List r3 = r3.subList(r10, r5)
        L40:
            java.lang.Object r5 = r14.get(r9)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem"
            X.C14360o3.A0C(r5, r0)
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r5 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r5
            boolean r1 = r13.A0L
            r7 = 0
            X.AbstractC37302Gc3.A1U(r3, r5)
            r0 = 6
            X.C14360o3.A0B(r4, r0)
            r8 = 1065353216(0x3f800000, float:1.0)
            com.facebookpay.form.cell.addresslist.AddressListCellParams r6 = new com.facebookpay.form.cell.addresslist.AddressListCellParams
            r12 = r11
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.A03 = r0
            r6.A03 = r3
            r6.A01 = r5
            r6.A00 = r2
            r6.A02 = r4
            r6.A04 = r1
            r15.add(r6)
            return r11
        L72:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UvP.A05(android.util.SparseArray, com.google.common.collect.ImmutableList$Builder):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.facebookpay.form.cell.CellParams, com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams, java.lang.Object] */
    private final boolean A06(SparseArray sparseArray, ImmutableList.Builder builder) {
        List list;
        boolean z;
        Integer num;
        boolean z2 = false;
        if (!this.A0Q || (list = this.A0G) == null || list.isEmpty()) {
            return false;
        }
        if (list.size() > 2) {
            z = true;
            num = Integer.valueOf(list.size() - 2);
        } else {
            z = false;
            num = null;
        }
        if (sparseArray.get(34) != null) {
            z2 = MSY.A1X(sparseArray.get(34));
        }
        int size = list.size();
        int i = R.string.res_0x7f130027_name_removed;
        if (size == 1) {
            i = R.string.res_0x7f130028_name_removed;
        }
        ?? cellParams = new CellParams(null, 1.0f, 34, 0, true, true);
        cellParams.A03 = z2;
        cellParams.A04 = z;
        cellParams.A01 = R.string.res_0x7f130024_name_removed;
        cellParams.A00 = i;
        cellParams.A02 = num;
        builder.add((Object) cellParams);
        return true;
    }

    private final boolean A07(SparseArray sparseArray, ImmutableList.Builder builder) {
        List list;
        boolean z = false;
        if (sparseArray.get(24) != null) {
            Object obj = sparseArray.get(24);
            if (obj != null) {
                int intValue = ((Number) obj).intValue();
                if (intValue != 0) {
                    if (this.A0Q && (list = this.A0G) != null && !list.isEmpty()) {
                        z = true;
                    }
                    C67663Uuv c67663Uuv = new C67663Uuv(24);
                    c67663Uuv.A03 = intValue;
                    c67663Uuv.A07 = true;
                    int i = R.attr.fbpay_hub_header_item_below_name_margin_top;
                    if (z) {
                        i = R.attr.fbpay_hub_header_item_within_billing_section_margin_top;
                    }
                    c67663Uuv.A04 = i;
                    builder.add((Object) c67663Uuv.A00());
                    return true;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.facebookpay.form.cell.CellParams, java.lang.Object, com.facebookpay.form.cell.checkbox.CheckboxCellParams] */
    private final boolean A08(SparseArray sparseArray, ImmutableList.Builder builder) {
        boolean A1X;
        if (this.A0S) {
            if (sparseArray.get(29) == null) {
                A1X = false;
            } else {
                A1X = MSY.A1X(sparseArray.get(29));
            }
            boolean z = this.A0L;
            String str = this.A0F;
            ?? cellParams = new CellParams(null, 1.0f, 29, 0, true, true);
            cellParams.A03 = A1X;
            cellParams.A01 = R.string.res_0x7f130029_name_removed;
            cellParams.A00 = 2131954914;
            cellParams.A04 = z;
            cellParams.A02 = str;
            builder.add((Object) cellParams);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x018d, code lost:
    
        if ((!X.C14360o3.A0K(r2, r1)) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ad, code lost:
    
        if ((!X.C14360o3.A0K(r2, r1)) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
    
        if (r1.length() != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d2, code lost:
    
        if (r1.length() != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0108, code lost:
    
        if (r0 != 0) goto L69;
     */
    @Override // X.AbstractC129435t5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0H() {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UvP.A0H():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0209, code lost:
    
        if (r25.A0I.contains(9) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0277, code lost:
    
        if (r25.A0I.contains(r3) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02fd, code lost:
    
        if (r25.A0I.contains(r3) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r3.A05 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        if (r3.A05 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
    
        if (r4 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f2, code lost:
    
        if (r25.A0J.contains(28) == false) goto L53;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x010b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0337  */
    /* JADX WARN: Type inference failed for: r0v105, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    @Override // X.AbstractC129455t8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.collect.ImmutableList A0J() {
        /*
            Method dump skipped, instructions count: 1658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UvP.A0J():com.google.common.collect.ImmutableList");
    }

    @Override // X.AbstractC129455t8
    public final void A0L(AbstractC129435t5 abstractC129435t5, Object obj, Object obj2) {
        LoggingContext loggingContext;
        Boolean bool;
        if (((abstractC129435t5 instanceof C5t6) || (abstractC129435t5 instanceof UvK) || (abstractC129435t5 instanceof UvH) || (abstractC129435t5 instanceof UvL)) && !C14360o3.A0K(obj, obj2) && obj2 != null) {
            if ((abstractC129435t5 instanceof UvK) && (loggingContext = this.A0B) != null && (obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                Wap.A03(new C25531Mh(MSY.A0H(C2FP.A01().A04.A00, "user_click_shippingasbilling_atomic"), 407), loggingContext, new MIG(loggingContext, null, "checkbox", 3, bool.booleanValue()));
            }
            A0K();
        }
    }

    public final Country A0M() {
        Object A02 = super.A05.A02();
        if (A02 != null) {
            SparseArray sparseArray = (SparseArray) A02;
            if (sparseArray.get(10) != null) {
                Object obj = sparseArray.get(10);
                C14360o3.A0C(obj, AbstractC58317Pt9.A00(28));
                return (Country) obj;
            }
            return this.A0E.A00;
        }
        throw AbstractC166997dE.A0g();
    }

    private final void A04(List list, int i, String str) {
        Map map;
        AbstractC129435t5 A0A = A0A(i);
        if (A0A instanceof UvM) {
            UvM uvM = (UvM) A0A;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            uvM.A0F.A0B(new C69077VhT(str2, false, true));
            if (str != null && str.length() != 0 && (map = this.A0H) != null) {
                Integer valueOf = Integer.valueOf(i);
                if (map.get(valueOf) != null) {
                    Object obj = map.get(valueOf);
                    if (obj != null) {
                        list.add(((FormCellLoggingEvents) obj).A00.A03);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
            }
        }
    }

    @Override // X.AbstractC129455t8, X.AbstractC129435t5
    public final void A0G() {
        super.A0G();
        AddressTypeaheadController addressTypeaheadController = this.A00;
        if (addressTypeaheadController != null) {
            AnonymousClass194.A05(null, addressTypeaheadController.A0A);
        }
    }

    @Override // X.AbstractC129455t8
    public final void A0K() {
        UvM uvM;
        super.A0K();
        AbstractC129435t5 A0A = A0A(5);
        if ((A0A instanceof UvM) && (uvM = (UvM) A0A) != null) {
            this.A01 = uvM;
            if (this.A00 != null) {
                ((AbstractC129435t5) uvM).A05.A09(new C70302WQh(this, 35));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UvP(Country country, AddressFormFieldsConfig addressFormFieldsConfig, LoggingContext loggingContext, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, Map map, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        super(i, z, z2);
        LoggingContext loggingContext2;
        Country country2 = country;
        String str10 = str4;
        String str11 = str3;
        String str12 = str2;
        String str13 = str;
        int i13 = i4;
        int i14 = i5;
        int i15 = i6;
        int i16 = i7;
        String str14 = str5;
        int i17 = i8;
        String str15 = str6;
        int i18 = i9;
        String str16 = str7;
        int i19 = i10;
        String str17 = str8;
        int i20 = i11;
        C14360o3.A0B(addressFormFieldsConfig, 13);
        HashSet hashSet = new HashSet();
        this.A0J = hashSet;
        HashSet hashSet2 = new HashSet();
        this.A0I = hashSet2;
        this.A0D = new SparseArray();
        this.A0P = z3;
        this.A0S = z4;
        this.A0O = z5;
        this.A0N = z7;
        this.A0F = str9;
        this.A0Q = z8;
        this.A0R = z9;
        this.A04 = i3 == 0 ? R.id.full_name_field : i3;
        this.A07 = i3 == 0 ? R.id.street1_field : i13;
        this.A08 = i3 == 0 ? R.id.street2_field : i14;
        this.A05 = i3 == 0 ? R.id.neighborhood_field : i15;
        this.A09 = i3 == 0 ? R.id.subdistrict_field : i16;
        this.A02 = i3 == 0 ? R.id.city_field : i17;
        this.A06 = i3 == 0 ? R.id.state_field : i18;
        this.A0A = i3 == 0 ? R.id.zip_code_field : i19;
        this.A03 = i3 == 0 ? R.id.country_field : i20;
        this.A0H = map;
        this.A0B = loggingContext;
        this.A0G = list;
        this.A0L = z10;
        this.A0C = i12;
        this.A0K = z11;
        this.A0M = z12;
        if (z4) {
            super.A04.put(29, Boolean.valueOf(z6));
        }
        if (z8 && list != null && !list.isEmpty()) {
            SparseArray sparseArray = super.A04;
            sparseArray.put(34, false);
            sparseArray.put(33, list.get(0));
        }
        SparseArray sparseArray2 = super.A04;
        sparseArray2.put(2, str == null ? "" : str13);
        sparseArray2.put(5, str2 == null ? "" : str12);
        sparseArray2.put(6, str3 == null ? "" : str11);
        sparseArray2.put(30, str4 == null ? "" : str10);
        sparseArray2.put(31, str5 == null ? "" : str14);
        sparseArray2.put(7, str6 == null ? "" : str15);
        sparseArray2.put(9, str7 == null ? "" : str16);
        sparseArray2.put(8, str8 == null ? "" : str17);
        sparseArray2.put(24, Integer.valueOf(i2));
        sparseArray2.put(10, country == null ? Country.A00(null, addressFormFieldsConfig.A00.A00.getCountry()) : country2);
        if (immutableList != null && !immutableList.isEmpty()) {
            hashSet.addAll(immutableList);
        }
        if (immutableList2 != null && !immutableList2.isEmpty()) {
            hashSet2.addAll(immutableList2);
        }
        super.A05.A0B(sparseArray2.clone());
        this.A0E = addressFormFieldsConfig;
        if (C18U.A06(C06090Tz.A05, C2FP.A0D().A00, 36313415912064973L) && (loggingContext2 = this.A0B) != null) {
            AddressTypeaheadController addressTypeaheadController = new AddressTypeaheadController(loggingContext2, new X2x(this, 11), new X59(this, 16));
            this.A00 = addressTypeaheadController;
            addressTypeaheadController.A04.A09(new C9LO(12, new X59(this, 17)));
            AddressTypeaheadController addressTypeaheadController2 = this.A00;
            if (addressTypeaheadController2 != null) {
                addressTypeaheadController2.A03.A09(new C9LO(12, new X59(this, 18)));
            }
        }
        A0K();
    }
}
