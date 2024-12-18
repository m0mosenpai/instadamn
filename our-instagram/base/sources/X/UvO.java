package X;

import android.util.SparseArray;
import com.facebook.R;
import com.facebook.graphql.enums.EnumHelper;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.creditcard.CardScannerCellParams;
import com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.form.cell.text.util.CvvTextFieldHandler;
import com.facebookpay.form.cell.text.util.TextFieldHandler;
import com.facebookpay.form.model.CardFormFieldConfig;
import com.facebookpay.form.model.FormField;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class UvO extends AbstractC129455t8 {
    public TextFieldHandler A00;
    public final int A01;
    public final List A02;
    public final Map A03;
    public final boolean A04;
    public final boolean A05;
    public final int A06;
    public final int A07;
    public final AddressCellParams A08;
    public final EnumC68132VCq A09;
    public final CardFormFieldConfig A0A;
    public final EnumC61219RhJ A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.VKA, java.lang.Object] */
    @Override // X.AbstractC129455t8
    public final void A0L(AbstractC129435t5 abstractC129435t5, Object obj, Object obj2) {
        EnumC61219RhJ A02;
        EnumC61219RhJ A022;
        UvY uvY;
        Object obj3;
        C2GT c2gt;
        UvM uvM;
        if (abstractC129435t5.A02 == 13) {
            if (obj2 == null) {
                A02 = EnumC61219RhJ.A0E;
            } else {
                A02 = EnumC61219RhJ.A06.A02((String) obj2);
            }
            if (obj == null) {
                A022 = EnumC61219RhJ.A0E;
            } else {
                A022 = EnumC61219RhJ.A06.A02((String) obj);
            }
            if (A02 != A022 || this.A0E) {
                Object obj4 = ((AbstractC129455t8) this).A00.get(15);
                if ((obj4 instanceof UvM) && (uvM = (UvM) obj4) != null) {
                    VKA A00 = AbstractC69845VwV.A00(C05F.A0Y, null);
                    A00.A02 = null;
                    A00.A00 = 2131954880;
                    A00.A01 = 2131954886;
                    A00.A00("");
                    String str = A022.A04;
                    C14360o3.A0B(str, 0);
                    ?? obj5 = new Object();
                    obj5.A02 = null;
                    obj5.A00 = 2131954881;
                    obj5.A01 = 0;
                    obj5.A00(str);
                    ImmutableList of = ImmutableList.of((Object) A00, (Object) obj5);
                    C14360o3.A07(of);
                    uvM.A00 = of;
                    uvM.A09.A0B(UvM.A00(uvM));
                }
                Object obj6 = ((AbstractC129455t8) this).A00.get(13);
                if ((obj6 instanceof UvY) && (uvY = (UvY) obj6) != null) {
                    if (A022 != EnumC61219RhJ.A0E && A022 != EnumC61219RhJ.A0L) {
                        ((UvM) uvY).A07.A0B(new C70071W1o(A022.A00()));
                        c2gt = uvY.A01;
                        obj3 = false;
                    } else {
                        FBPayIcon fBPayIcon = uvY.A0K;
                        if (fBPayIcon != null) {
                            obj3 = new C70071W1o(fBPayIcon);
                        } else {
                            obj3 = null;
                        }
                        c2gt = ((UvM) uvY).A07;
                    }
                    c2gt.A0B(obj3);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.UvU, X.Vlg, X.Uuw] */
    private final void A00(SparseArray sparseArray, ImmutableList.Builder builder, Integer num, String str, String str2, boolean z) {
        TextValidatorParams textValidatorParams;
        FBPayIcon fBPayIcon;
        FormCellLoggingEvents formCellLoggingEvents;
        ?? c67664Uuw = new C67664Uuw(13);
        c67664Uuw.A00 = this.A06;
        List list = this.A02;
        c67664Uuw.A01 = list;
        c67664Uuw.A02 = this.A0D;
        c67664Uuw.A01 = R.id.card_number_field;
        c67664Uuw.A04 = new Object();
        ImmutableList.Builder builder2 = new ImmutableList.Builder();
        if (str2 != null) {
            textValidatorParams = new TextValidatorParams(str2, 2131954867, C05F.A0Y);
        } else {
            textValidatorParams = new TextValidatorParams(C05F.A0Y, "", 2131954874, 2131954867);
        }
        builder2.add((Object) textValidatorParams);
        if (list != null) {
            builder2.add((Object) new TextValidatorParams(C05F.A1F, "", 2131954883, 0));
        }
        builder2.add((Object) new TextValidatorParams(C05F.A15, "", 2131954875, 0));
        ImmutableList build = builder2.build();
        C14360o3.A07(build);
        c67664Uuw.A0G.addAll(build);
        Object obj = sparseArray.get(13);
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        c67664Uuw.A0B = (String) obj;
        c67664Uuw.A03 = !this.A0G;
        EnumC68132VCq enumC68132VCq = this.A09;
        if (enumC68132VCq == EnumC68132VCq.A04) {
            fBPayIcon = FBPayIcon.A04;
        } else {
            fBPayIcon = null;
        }
        c67664Uuw.A06 = fBPayIcon;
        Map map = this.A03;
        if (map != null) {
            formCellLoggingEvents = (FormCellLoggingEvents) AbstractC166997dE.A0m(map, 13);
        } else {
            formCellLoggingEvents = null;
        }
        c67664Uuw.A02 = formCellLoggingEvents;
        c67664Uuw.A09 = AbstractC58317Pt9.A00(752);
        boolean z2 = this.A05;
        c67664Uuw.A0C = z2;
        c67664Uuw.A01(num);
        c67664Uuw.A04 = z;
        if (str != null) {
            c67664Uuw.A0A = str;
        } else {
            c67664Uuw.A03 = 2131954879;
        }
        CardScannerCellParams cardScannerCellParams = new CardScannerCellParams(35, z2);
        if (!z2 && enumC68132VCq == EnumC68132VCq.A02) {
            builder.add((Object) cardScannerCellParams);
        }
        builder.add((Object) c67664Uuw.A00());
        if (z2 && enumC68132VCq == EnumC68132VCq.A02) {
            builder.add((Object) cardScannerCellParams);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    private final void A01(SparseArray sparseArray, ImmutableList.Builder builder, Integer num, String str, String str2, boolean z) {
        TextValidatorParams textValidatorParams;
        FormCellLoggingEvents formCellLoggingEvents;
        C67664Uuw c67664Uuw = new C67664Uuw(14);
        ((AbstractC69334Vlg) c67664Uuw).A01 = R.id.expiration_date_field;
        c67664Uuw.A00 = 2131954893;
        c67664Uuw.A01 = 2131954894;
        c67664Uuw.A01(num);
        c67664Uuw.A04 = new Object();
        if (str2 != null) {
            textValidatorParams = new TextValidatorParams(str2, 2131954895, C05F.A0Y);
        } else {
            textValidatorParams = new TextValidatorParams(C05F.A0Y, "", 2131954876, 2131954895);
        }
        ImmutableList of = ImmutableList.of((Object) textValidatorParams, (Object) new TextValidatorParams(C05F.A0C, "4", 2131954877, 0), (Object) new TextValidatorParams(C05F.A0u, "", 2131954877, 0));
        C14360o3.A07(of);
        c67664Uuw.A0G.addAll(of);
        List list = this.A0C;
        String str3 = null;
        if (!list.contains(14)) {
            Object obj = sparseArray.get(14);
            if (obj instanceof String) {
                str3 = (String) obj;
            }
        }
        c67664Uuw.A0B = str3;
        ((AbstractC69334Vlg) c67664Uuw).A00 = 0.5f;
        c67664Uuw.A0E = list.contains(14);
        Map map = this.A03;
        if (map != null) {
            formCellLoggingEvents = (FormCellLoggingEvents) map.get(14);
        } else {
            formCellLoggingEvents = null;
        }
        ((AbstractC69334Vlg) c67664Uuw).A02 = formCellLoggingEvents;
        c67664Uuw.A09 = AbstractC58317Pt9.A00(751);
        c67664Uuw.A0C = this.A05;
        ((AbstractC69334Vlg) c67664Uuw).A04 = z;
        if (str != null) {
            c67664Uuw.A0A = str;
        } else {
            c67664Uuw.A03 = 2131954878;
        }
        builder.add((Object) c67664Uuw.A00());
    }

    private final void A02(SparseArray sparseArray, ImmutableList.Builder builder, Integer num, String str, String str2, boolean z) {
        TextValidatorParams textValidatorParams;
        String str3;
        String str4;
        FormCellLoggingEvents formCellLoggingEvents;
        if (this.A0D) {
            C2FP.A0H();
        }
        C67664Uuw c67664Uuw = new C67664Uuw(15);
        ((AbstractC69334Vlg) c67664Uuw).A01 = R.id.security_code_field;
        c67664Uuw.A00 = 2131954885;
        c67664Uuw.A01(num);
        if (str2 != null) {
            textValidatorParams = new TextValidatorParams(str2, 2131954886, C05F.A0Y);
        } else {
            textValidatorParams = new TextValidatorParams(C05F.A0Y, "", 2131954880, 2131954886);
        }
        Integer num2 = C05F.A0C;
        EnumC61219RhJ enumC61219RhJ = this.A0B;
        if (enumC61219RhJ != null) {
            str3 = enumC61219RhJ.A04;
        } else {
            str3 = "3";
        }
        ImmutableList of = ImmutableList.of((Object) textValidatorParams, (Object) new TextValidatorParams(num2, str3, 2131954881, 0));
        C14360o3.A07(of);
        c67664Uuw.A0G.addAll(of);
        c67664Uuw.A05 = this.A00;
        boolean z2 = this.A0F;
        if (z2) {
            if (enumC61219RhJ == EnumC61219RhJ.A0B) {
                str4 = "••••";
            } else {
                str4 = "•••";
            }
        } else {
            Object obj = sparseArray.get(15);
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            str4 = (String) obj;
        }
        c67664Uuw.A0B = str4;
        ((AbstractC69334Vlg) c67664Uuw).A03 = !z2;
        ((AbstractC69334Vlg) c67664Uuw).A00 = 0.5f;
        c67664Uuw.A0E = this.A0C.contains(15);
        c67664Uuw.A0F = this.A0H;
        Map map = this.A03;
        if (map != null) {
            formCellLoggingEvents = (FormCellLoggingEvents) map.get(15);
        } else {
            formCellLoggingEvents = null;
        }
        ((AbstractC69334Vlg) c67664Uuw).A02 = formCellLoggingEvents;
        c67664Uuw.A09 = AbstractC58317Pt9.A00(753);
        c67664Uuw.A0C = this.A05;
        ((AbstractC69334Vlg) c67664Uuw).A04 = z;
        if (str != null) {
            c67664Uuw.A0A = str;
        } else {
            c67664Uuw.A03 = 2131954882;
        }
        builder.add((Object) c67664Uuw.A00());
    }

    @Override // X.AbstractC129435t5
    public final boolean A0H() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Object A02 = super.A05.A02();
        if (A02 != null) {
            SparseArray sparseArray = (SparseArray) A02;
            Object obj = null;
            if (this.A0E) {
                Object obj2 = sparseArray.get(13);
                if (!(obj2 instanceof String) || (str6 = (String) obj2) == null || str6.length() == 0) {
                    Object obj3 = sparseArray.get(14);
                    if (!(obj3 instanceof String) || (str5 = (String) obj3) == null || str5.length() == 0) {
                        Object obj4 = sparseArray.get(15);
                        if (!(obj4 instanceof String) || (str4 = (String) obj4) == null || str4.length() == 0) {
                            Object obj5 = super.A04.get(21);
                            if (!(obj5 instanceof String)) {
                                obj5 = null;
                            }
                            Object obj6 = sparseArray.get(21);
                            if (!(obj6 instanceof String)) {
                                obj6 = null;
                            }
                            if (C14360o3.A0K(obj5, obj6)) {
                                Object obj7 = sparseArray.get(2);
                                if ((obj7 instanceof String) && (str3 = (String) obj7) != null && str3.length() != 0) {
                                    return true;
                                }
                            } else {
                                return true;
                            }
                        } else {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                SparseArray sparseArray2 = super.A04;
                Object obj8 = sparseArray2.get(13);
                if (!(obj8 instanceof String)) {
                    obj8 = null;
                }
                Object obj9 = sparseArray.get(13);
                if (!(obj9 instanceof String)) {
                    obj9 = null;
                }
                if (C14360o3.A0K(obj8, obj9)) {
                    Object obj10 = sparseArray2.get(14);
                    if (!(obj10 instanceof String)) {
                        obj10 = null;
                    }
                    Object obj11 = sparseArray.get(14);
                    if (!(obj11 instanceof String)) {
                        obj11 = null;
                    }
                    if (C14360o3.A0K(obj10, obj11)) {
                        TextFieldHandler textFieldHandler = this.A00;
                        Object obj12 = sparseArray2.get(15);
                        boolean z = obj12 instanceof String;
                        if (textFieldHandler != null) {
                            if (z) {
                                str = (String) obj12;
                            } else {
                                str = null;
                            }
                            Object obj13 = sparseArray.get(15);
                            if (obj13 instanceof String) {
                                str2 = (String) obj13;
                            } else {
                                str2 = null;
                            }
                            if (textFieldHandler.CL3(str, str2)) {
                                return true;
                            }
                        } else {
                            if (!z) {
                                obj12 = null;
                            }
                            Object obj14 = sparseArray.get(15);
                            if (!(obj14 instanceof String)) {
                                obj14 = null;
                            }
                            if (!C14360o3.A0K(obj12, obj14)) {
                                return true;
                            }
                        }
                        Object obj15 = sparseArray2.get(20);
                        if (!(obj15 instanceof String)) {
                            obj15 = null;
                        }
                        Object obj16 = sparseArray.get(20);
                        if (!(obj16 instanceof String)) {
                            obj16 = null;
                        }
                        if (!C14360o3.A0K(obj15, obj16)) {
                            return true;
                        }
                        Object obj17 = sparseArray2.get(21);
                        if (!(obj17 instanceof String)) {
                            obj17 = null;
                        }
                        Object obj18 = sparseArray.get(21);
                        if (!(obj18 instanceof String)) {
                            obj18 = null;
                        }
                        if (!C14360o3.A0K(obj17, obj18)) {
                            return true;
                        }
                        Object obj19 = sparseArray2.get(2);
                        if (!(obj19 instanceof String)) {
                            obj19 = null;
                        }
                        Object obj20 = sparseArray.get(2);
                        if (obj20 instanceof String) {
                            obj = obj20;
                        }
                        if (!C14360o3.A0K(obj19, obj)) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.common.collect.ImmutableList$Builder] */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.facebookpay.form.cell.CellParams, com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r18v0, types: [X.UvO, X.5t5] */
    @Override // X.AbstractC129455t8
    public final ImmutableList A0J() {
        FormCellLoggingEvents formCellLoggingEvents;
        ?? r12;
        Object A02 = this.A05.A02();
        if (A02 != null) {
            SparseArray sparseArray = (SparseArray) A02;
            if (this.A0F) {
                this.A00 = new CvvTextFieldHandler(this.A0B);
            }
            ?? builder = new ImmutableList.Builder();
            Object A022 = this.A07.A02();
            if (A022 != null) {
                if (((Boolean) A022).booleanValue()) {
                    int i = this.A01;
                    if (i != 0) {
                        List list = this.A02;
                        if (list != null) {
                            r12 = AbstractC167017dG.A0q(list);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                AbstractC166997dE.A1W(r12, ((EnumC61219RhJ) it.next()).A00());
                            }
                        } else {
                            r12 = C16930sl.A00;
                        }
                        List list2 = r12;
                        boolean A1P = AbstractC58319PtB.A1P(r12.size(), 5);
                        boolean z = this.A04;
                        int i2 = R.attr.fbpay_hub_header_item_margin_top;
                        if (z) {
                            i2 = 0;
                        }
                        ArrayList arrayList = r12;
                        if (!A1P) {
                            arrayList = new ArrayList();
                        }
                        builder.add(new PaymentMethodLabelCellParams(arrayList, 27, i, i2, R.attr.fbpay_card_form_header_bottom_padding, 2));
                        if (!A1P) {
                            ?? cellParams = new CellParams(null, 1.0f, 40, 0, true, true);
                            cellParams.A00 = new ArrayList();
                            cellParams.A00 = list2;
                            builder.add(cellParams);
                        }
                    }
                    int i3 = this.A07;
                    if (i3 != 0) {
                        C67663Uuv c67663Uuv = new C67663Uuv(38);
                        c67663Uuv.A03 = i3;
                        c67663Uuv.A05 = R.attr.fbpay_card_form_subtitle_top_padding;
                        c67663Uuv.A01 = R.attr.fbpay_card_form_subtitle_bottom_padding;
                        builder.add(c67663Uuv.A00());
                    }
                    CardFormFieldConfig cardFormFieldConfig = this.A0A;
                    if (cardFormFieldConfig != null) {
                        for (FormField formField : cardFormFieldConfig.A00) {
                            EnumC68166VEk enumC68166VEk = (EnumC68166VEk) EnumHelper.A00(formField.A02, EnumC68166VEk.A02);
                            if (enumC68166VEk != null) {
                                int ordinal = enumC68166VEk.ordinal();
                                if (ordinal != 3) {
                                    if (ordinal != 11) {
                                        if (ordinal == 8) {
                                            A02(sparseArray, builder, formField.A00, formField.A03, formField.A01, !formField.A05);
                                        }
                                    } else {
                                        A01(sparseArray, builder, formField.A00, formField.A03, formField.A01, !formField.A05);
                                    }
                                } else {
                                    A00(sparseArray, builder, formField.A00, formField.A03, formField.A01, !formField.A05);
                                }
                            }
                        }
                    } else {
                        Integer num = C05F.A0C;
                        A00(sparseArray, builder, num, null, null, true);
                        A01(sparseArray, builder, num, null, null, true);
                        A02(sparseArray, builder, num, null, null, true);
                    }
                    if (this.A0I) {
                        C67664Uuw c67664Uuw = new C67664Uuw(2);
                        ((AbstractC69334Vlg) c67664Uuw).A01 = R.id.cardholder_name_field;
                        c67664Uuw.A03 = 2131954866;
                        Integer num2 = C05F.A0N;
                        c67664Uuw.A01(num2);
                        ImmutableList of = ImmutableList.of((Object) new TextValidatorParams(C05F.A0Y, "", 2131962954, 2131954903), (Object) new TextValidatorParams(num2, "^.*[\\S]+[ ]+[\\S]+.*$", 2131962954, 2131954903));
                        C14360o3.A07(of);
                        c67664Uuw.A0G.addAll(of);
                        c67664Uuw.A04 = new Object();
                        Object obj = sparseArray.get(2);
                        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
                        c67664Uuw.A0B = (String) obj;
                        Map map = this.A03;
                        if (map != null) {
                            formCellLoggingEvents = (FormCellLoggingEvents) AbstractC166997dE.A0m(map, 2);
                        } else {
                            formCellLoggingEvents = null;
                        }
                        ((AbstractC69334Vlg) c67664Uuw).A02 = formCellLoggingEvents;
                        c67664Uuw.A09 = "personName";
                        c67664Uuw.A0C = this.A05;
                        builder.add(c67664Uuw.A00());
                    }
                    AddressCellParams addressCellParams = this.A08;
                    if (addressCellParams != null) {
                        builder.add(addressCellParams);
                    }
                }
                ImmutableList build = builder.build();
                C14360o3.A07(build);
                return build;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UvO(AddressCellParams addressCellParams, EnumC68132VCq enumC68132VCq, CardFormFieldConfig cardFormFieldConfig, EnumC61219RhJ enumC61219RhJ, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, Map map, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        super(i, z, z2);
        List list3 = list2;
        C14360o3.A0B(enumC68132VCq, 19);
        this.A0G = AbstractC167007dF.A1W(str2);
        this.A0B = enumC61219RhJ;
        SparseArray sparseArray = super.A04;
        if (str2 != null) {
            str = AnonymousClass001.A0R("••• ", str2);
        } else if (str == null) {
            str = "";
        }
        sparseArray.put(13, str);
        sparseArray.put(14, str3 == null ? "" : str3);
        sparseArray.put(2, str5 == null ? "" : str5);
        sparseArray.put(15, str4 == null ? "" : str4);
        sparseArray.put(20, str6 == null ? "" : str6);
        sparseArray.put(21, str7 != null ? str7 : "");
        this.A0C = list2 == null ? C16930sl.A00 : list3;
        super.A05.A0B(sparseArray.clone());
        this.A02 = list;
        this.A0H = z3;
        this.A0F = z4;
        this.A0I = z5;
        this.A03 = map;
        this.A06 = i2;
        this.A09 = enumC68132VCq;
        this.A05 = z6;
        this.A01 = i3;
        this.A07 = i4;
        this.A08 = addressCellParams;
        this.A04 = z7;
        this.A0E = z8;
        this.A0A = cardFormFieldConfig;
        this.A0D = z9;
        A0K();
    }
}
