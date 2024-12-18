package com.facebookpay.form.cell;

import X.AbstractC001900j;
import X.AbstractC129435t5;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC37304Gc5;
import X.AbstractC43592JPx;
import X.AbstractC69334Vlg;
import X.AbstractC69845VwV;
import X.C00O;
import X.C129445t7;
import X.C14360o3;
import X.C1LC;
import X.C2FP;
import X.C5t6;
import X.C67675Uvn;
import X.C67676Uvo;
import X.C67677Uvp;
import X.EnumC61219RhJ;
import X.EnumC68132VCq;
import X.UC3;
import X.UCb;
import X.UCc;
import X.UDT;
import X.UDu;
import X.UvD;
import X.UvE;
import X.UvF;
import X.UvG;
import X.UvH;
import X.UvI;
import X.UvJ;
import X.UvK;
import X.UvL;
import X.UvM;
import X.UvN;
import X.UvO;
import X.UvP;
import X.UvS;
import X.UvT;
import X.UvX;
import X.UvY;
import X.Uvq;
import X.VD0;
import X.VKA;
import X.VYX;
import X.X9f;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TableRow;
import com.facebook.R;
import com.facebook.common.locale.Country;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.address.BriefAddressCellParams;
import com.facebookpay.form.cell.addresslist.AddressListCellParams;
import com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams;
import com.facebookpay.form.cell.apm.APMLinkCellParams;
import com.facebookpay.form.cell.card.CardCellParams;
import com.facebookpay.form.cell.checkbox.CheckboxCellParams;
import com.facebookpay.form.cell.contactinfo.ContactInfoCellParams;
import com.facebookpay.form.cell.creditcard.CardScannerCellParams;
import com.facebookpay.form.cell.creditcard.CreditCardCellParams;
import com.facebookpay.form.cell.fulfillmentoption.FulfillmentOptionCellParams;
import com.facebookpay.form.cell.label.LabelCellParams;
import com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams;
import com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.selector.CountrySelectorCellParams;
import com.facebookpay.form.cell.selector.SelectorCellParams;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.form.cell.text.util.TextFieldHandler;
import com.facebookpay.form.cell.toggle.SwitchCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.LoggingContext;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class CellParams implements Parcelable {
    public AbstractC129435t5 A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final FormCellLoggingEvents A04;
    public final boolean A05;
    public final boolean A06;

    public CellParams(FormCellLoggingEvents formCellLoggingEvents, float f, int i, int i2, boolean z, boolean z2) {
        this.A03 = 0;
        this.A02 = i;
        this.A06 = true;
        this.A05 = true;
        this.A01 = 1.0f;
        this.A04 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.WEa] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.WEa] */
    /* JADX WARN: Type inference failed for: r3v10, types: [X.UC3] */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v13, types: [X.Uvq, android.view.View] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v21, types: [X.X9f] */
    /* JADX WARN: Type inference failed for: r3v22, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v9, types: [X.X9f] */
    public final X9f A00(Context context) {
        boolean z;
        UDT udt;
        UDT udt2;
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(0, -2);
        ((LinearLayout.LayoutParams) layoutParams).weight = this.A01;
        if (this instanceof SwitchCellParams) {
            udt2 = new UDu(context);
        } else if (this instanceof SelectorCellParams) {
            AbstractC167017dG.A1N(context, layoutParams);
            udt2 = new C67675Uvn(context);
        } else if (this instanceof CountrySelectorCellParams) {
            AbstractC167017dG.A1N(context, layoutParams);
            udt2 = new C67676Uvo(context);
        } else if (this instanceof SupportedLogosCellParams) {
            AbstractC167017dG.A1N(context, layoutParams);
            udt2 = new FrameLayout(context);
        } else {
            if (this instanceof LabelCellParams) {
                LabelCellParams labelCellParams = (LabelCellParams) this;
                if (labelCellParams instanceof PaymentMethodLabelCellParams) {
                    AbstractC167017dG.A1N(context, layoutParams);
                    udt2 = new UCc(context, labelCellParams.A04);
                } else {
                    udt2 = new UCc(context, labelCellParams.A04);
                }
            } else if (this instanceof FulfillmentOptionCellParams) {
                AbstractC167017dG.A1N(context, layoutParams);
                udt2 = new FrameLayout(context);
            } else {
                if (this instanceof CreditCardCellParams) {
                    AbstractC167017dG.A1N(context, layoutParams);
                    udt2 = new Uvq(context);
                    udt2.setLayoutParams(layoutParams);
                    VD0 vd0 = ((CreditCardCellParams) this).A04;
                    if (vd0 != null) {
                        VYX.A00.A03(context, udt2, vd0, 22);
                    }
                } else {
                    if (this instanceof CardScannerCellParams) {
                        AbstractC167017dG.A1N(context, layoutParams);
                        View.inflate(context, R.layout.ecp_card_scanner_view, new LinearLayout(context));
                        C2FP.A0A().A04(context, 8, 5);
                        throw C00O.createAndThrow();
                    }
                    if (this instanceof ContactInfoCellParams) {
                        AbstractC167017dG.A1N(context, layoutParams);
                        Uvq uvq = new Uvq(context);
                        uvq.setLayoutParams(layoutParams);
                        z = ((ContactInfoCellParams) this).A04;
                        udt2 = uvq;
                    } else if (this instanceof CheckboxCellParams) {
                        AbstractC167017dG.A1N(context, layoutParams);
                        String str = ((CheckboxCellParams) this).A02;
                        if (str != null && !AbstractC001900j.A0T(str)) {
                            udt = new UC3(context);
                        } else {
                            udt = new UDT(context);
                        }
                        udt.setLayoutParams(layoutParams);
                        udt2 = udt;
                    } else if (this instanceof TextCellParams) {
                        if (((TextCellParams) this) instanceof CardCellParams) {
                            AbstractC167017dG.A1N(context, layoutParams);
                            udt2 = new UvX(context);
                        } else {
                            AbstractC167017dG.A1N(context, layoutParams);
                            udt2 = new C67677Uvp(context);
                        }
                    } else if (this instanceof APMLinkCellParams) {
                        AbstractC167017dG.A1N(context, layoutParams);
                        LinearLayout linearLayout = new LinearLayout(context);
                        View.inflate(linearLayout.getContext(), R.layout.fbpay_ui_apm_link_cell, linearLayout);
                        udt2 = linearLayout;
                    } else if (this instanceof AddressListHeaderCellParams) {
                        AbstractC167017dG.A1N(context, layoutParams);
                        udt2 = new LinearLayout(context);
                    } else if (this instanceof AddressListCellParams) {
                        AbstractC167017dG.A1N(context, layoutParams);
                        udt2 = new UCb(context);
                    } else if (this instanceof BriefAddressCellParams) {
                        AbstractC167017dG.A1N(context, layoutParams);
                        udt2 = new Uvq(context);
                    } else {
                        AbstractC167017dG.A1N(context, layoutParams);
                        Uvq uvq2 = new Uvq(context);
                        uvq2.setLayoutParams(layoutParams);
                        z = ((AddressCellParams) this).A0T;
                        udt2 = uvq2;
                    }
                    if (z) {
                        VYX.A00.A03(context, udt2, VD0.A02, 22);
                    }
                }
                AbstractC129435t5 abstractC129435t5 = this.A00;
                abstractC129435t5.getClass();
                udt2.setViewModel(abstractC129435t5);
                return udt2;
            }
            udt2.setLayoutParams(layoutParams);
            AbstractC129435t5 abstractC129435t52 = this.A00;
            abstractC129435t52.getClass();
            udt2.setViewModel(abstractC129435t52);
            return udt2;
        }
        udt2.setLayoutParams(layoutParams);
        AbstractC129435t5 abstractC129435t522 = this.A00;
        abstractC129435t522.getClass();
        udt2.setViewModel(abstractC129435t522);
        return udt2;
    }

    public final AbstractC129435t5 A01() {
        if (this instanceof SwitchCellParams) {
            SwitchCellParams switchCellParams = (SwitchCellParams) this;
            return new UvI(switchCellParams.A02, switchCellParams.A00, switchCellParams.A06, switchCellParams.A05, switchCellParams.A01);
        }
        if (this instanceof SelectorCellParams) {
            SelectorCellParams selectorCellParams = (SelectorCellParams) this;
            int i = ((CellParams) selectorCellParams).A02;
            boolean z = selectorCellParams.A06;
            boolean z2 = selectorCellParams.A05;
            return new UvJ(selectorCellParams.A02, selectorCellParams.A03, i, selectorCellParams.A00, selectorCellParams.A01, z, z2);
        }
        if (this instanceof CountrySelectorCellParams) {
            CountrySelectorCellParams countrySelectorCellParams = (CountrySelectorCellParams) this;
            int i2 = ((CellParams) countrySelectorCellParams).A03;
            int i3 = ((CellParams) countrySelectorCellParams).A02;
            boolean z3 = countrySelectorCellParams.A06;
            boolean z4 = countrySelectorCellParams.A05;
            return new C5t6(countrySelectorCellParams.A01, ((CellParams) countrySelectorCellParams).A04, countrySelectorCellParams.A02, countrySelectorCellParams.A03, i2, i3, countrySelectorCellParams.A00, z3, z4, countrySelectorCellParams.A04);
        }
        if (this instanceof SupportedLogosCellParams) {
            SupportedLogosCellParams supportedLogosCellParams = (SupportedLogosCellParams) this;
            return new UvE(supportedLogosCellParams.A02, supportedLogosCellParams.A05, supportedLogosCellParams.A00);
        }
        if (this instanceof LabelCellParams) {
            LabelCellParams labelCellParams = (LabelCellParams) this;
            if (labelCellParams instanceof PaymentMethodLabelCellParams) {
                PaymentMethodLabelCellParams paymentMethodLabelCellParams = (PaymentMethodLabelCellParams) labelCellParams;
                return new UvS(paymentMethodLabelCellParams.A05, paymentMethodLabelCellParams.A01, paymentMethodLabelCellParams.A03, paymentMethodLabelCellParams.A04, paymentMethodLabelCellParams.A00, paymentMethodLabelCellParams.A02);
            }
            int i4 = ((CellParams) labelCellParams).A02;
            boolean z5 = ((CellParams) labelCellParams).A06;
            boolean z6 = ((CellParams) labelCellParams).A05;
            return new UvT(labelCellParams.A07, labelCellParams.A08, i4, labelCellParams.A03, labelCellParams.A05, labelCellParams.A00, labelCellParams.A02, labelCellParams.A06, labelCellParams.A01, z5, z6);
        }
        if (this instanceof FulfillmentOptionCellParams) {
            FulfillmentOptionCellParams fulfillmentOptionCellParams = (FulfillmentOptionCellParams) this;
            return new UvG(fulfillmentOptionCellParams.A02, fulfillmentOptionCellParams.A00, fulfillmentOptionCellParams.A01, fulfillmentOptionCellParams.A05);
        }
        if (this instanceof CreditCardCellParams) {
            CreditCardCellParams creditCardCellParams = (CreditCardCellParams) this;
            int i5 = ((CellParams) creditCardCellParams).A02;
            boolean z7 = ((CellParams) creditCardCellParams).A06;
            boolean z8 = ((CellParams) creditCardCellParams).A05;
            String str = creditCardCellParams.A09;
            String str2 = creditCardCellParams.A0E;
            String str3 = creditCardCellParams.A0D;
            String str4 = creditCardCellParams.A0F;
            String str5 = creditCardCellParams.A0A;
            String str6 = creditCardCellParams.A0C;
            String str7 = creditCardCellParams.A0B;
            EnumC61219RhJ enumC61219RhJ = creditCardCellParams.A08;
            List list = creditCardCellParams.A0G;
            List list2 = creditCardCellParams.A0H;
            boolean z9 = creditCardCellParams.A0N;
            boolean z10 = creditCardCellParams.A0M;
            boolean z11 = creditCardCellParams.A00;
            Map map = creditCardCellParams.A0I;
            int i6 = creditCardCellParams.A02;
            EnumC68132VCq enumC68132VCq = creditCardCellParams.A06;
            boolean z12 = creditCardCellParams.A0K;
            int i7 = creditCardCellParams.A01;
            int i8 = creditCardCellParams.A03;
            return new UvO(creditCardCellParams.A05, enumC68132VCq, creditCardCellParams.A07, enumC61219RhJ, str, str2, str3, str4, str5, str6, str7, list, list2, map, i5, i6, i7, i8, z7, z8, z9, z10, z11, z12, AbstractC167007dF.A1W(creditCardCellParams.A04), creditCardCellParams.A0L, creditCardCellParams.A0J);
        }
        if (this instanceof CardScannerCellParams) {
            CardScannerCellParams cardScannerCellParams = (CardScannerCellParams) this;
            return new UvD(cardScannerCellParams, cardScannerCellParams.A00);
        }
        if (this instanceof ContactInfoCellParams) {
            ContactInfoCellParams contactInfoCellParams = (ContactInfoCellParams) this;
            int i9 = ((CellParams) contactInfoCellParams).A02;
            boolean z13 = ((CellParams) contactInfoCellParams).A05;
            return new C129445t7(contactInfoCellParams.A02, contactInfoCellParams.A01, contactInfoCellParams.A03, i9, contactInfoCellParams.A00, z13, contactInfoCellParams.A05, contactInfoCellParams.A04);
        }
        if (this instanceof CheckboxCellParams) {
            CheckboxCellParams checkboxCellParams = (CheckboxCellParams) this;
            int i10 = ((CellParams) checkboxCellParams).A02;
            boolean z14 = checkboxCellParams.A05;
            boolean z15 = checkboxCellParams.A03;
            return new UvK(checkboxCellParams.A02, i10, checkboxCellParams.A01, checkboxCellParams.A00, z14, z15, checkboxCellParams.A04);
        }
        if (this instanceof TextCellParams) {
            TextCellParams textCellParams = (TextCellParams) this;
            if (textCellParams instanceof CardCellParams) {
                CardCellParams cardCellParams = (CardCellParams) textCellParams;
                ImmutableList.Builder builder = new ImmutableList.Builder();
                C1LC A0I = AbstractC43592JPx.A0I(cardCellParams.A07);
                while (A0I.hasNext()) {
                    TextValidatorParams textValidatorParams = (TextValidatorParams) A0I.next();
                    Integer num = textValidatorParams.A02;
                    String str8 = textValidatorParams.A04;
                    String str9 = textValidatorParams.A03;
                    int i11 = textValidatorParams.A01;
                    int i12 = textValidatorParams.A00;
                    List list3 = cardCellParams.A01;
                    C14360o3.A0B(str8, 0);
                    VKA A00 = AbstractC69845VwV.A00(num, list3);
                    A00.A02 = str9;
                    A00.A00 = i11;
                    A00.A01 = i12;
                    A00.A00(str8);
                    builder.add((Object) A00);
                }
                int i13 = ((CellParams) cardCellParams).A03;
                int i14 = ((CellParams) cardCellParams).A02;
                boolean z16 = ((CellParams) cardCellParams).A06;
                boolean z17 = ((CellParams) cardCellParams).A05;
                FormCellLoggingEvents formCellLoggingEvents = ((CellParams) cardCellParams).A04;
                String str10 = cardCellParams.A0B;
                int i15 = ((TextCellParams) cardCellParams).A03;
                String str11 = cardCellParams.A0A;
                FBPayIcon fBPayIcon = ((TextCellParams) cardCellParams).A06;
                Integer num2 = cardCellParams.A08;
                ImmutableList build = builder.build();
                C14360o3.A07(build);
                int i16 = cardCellParams.A00;
                boolean z18 = cardCellParams.A0C;
                return new UvY(formCellLoggingEvents, ((TextCellParams) cardCellParams).A04, fBPayIcon, build, num2, str10, str11, cardCellParams.A09, i13, i14, i15, i16, z16, z17, z18, cardCellParams.A02);
            }
            ImmutableList.Builder builder2 = new ImmutableList.Builder();
            C1LC A0I2 = AbstractC43592JPx.A0I(textCellParams.A07);
            while (A0I2.hasNext()) {
                TextValidatorParams textValidatorParams2 = (TextValidatorParams) A0I2.next();
                Integer num3 = textValidatorParams2.A02;
                String str12 = textValidatorParams2.A04;
                String str13 = textValidatorParams2.A03;
                int i17 = textValidatorParams2.A01;
                int i18 = textValidatorParams2.A00;
                C14360o3.A0B(str12, 0);
                VKA A002 = AbstractC69845VwV.A00(num3, null);
                A002.A02 = str13;
                A002.A00 = i17;
                A002.A01 = i18;
                A002.A00(str12);
                builder2.add((Object) A002);
            }
            int i19 = ((CellParams) textCellParams).A03;
            int i20 = ((CellParams) textCellParams).A02;
            boolean z19 = ((CellParams) textCellParams).A06;
            boolean z20 = ((CellParams) textCellParams).A05;
            FormCellLoggingEvents formCellLoggingEvents2 = ((CellParams) textCellParams).A04;
            String str14 = textCellParams.A0B;
            int i21 = textCellParams.A03;
            String str15 = textCellParams.A0A;
            int i22 = textCellParams.A00;
            int i23 = textCellParams.A01;
            FBPayIcon fBPayIcon2 = textCellParams.A06;
            Integer num4 = textCellParams.A08;
            ImmutableList build2 = builder2.build();
            C14360o3.A07(build2);
            TextFieldHandler textFieldHandler = textCellParams.A05;
            boolean z21 = textCellParams.A0E;
            int i24 = textCellParams.A02;
            boolean z22 = textCellParams.A0F;
            boolean z23 = textCellParams.A0C;
            return new UvM(formCellLoggingEvents2, textCellParams.A04, textFieldHandler, fBPayIcon2, build2, num4, str14, str15, textCellParams.A09, i19, i20, i21, i22, i23, i24, z19, z20, z21, z22, z23, textCellParams.A0D);
        }
        if (this instanceof APMLinkCellParams) {
            APMLinkCellParams aPMLinkCellParams = (APMLinkCellParams) this;
            return new UvF(aPMLinkCellParams.A02, aPMLinkCellParams.A00, aPMLinkCellParams.A01);
        }
        if (this instanceof AddressListHeaderCellParams) {
            AddressListHeaderCellParams addressListHeaderCellParams = (AddressListHeaderCellParams) this;
            int i25 = ((CellParams) addressListHeaderCellParams).A02;
            boolean z24 = addressListHeaderCellParams.A05;
            boolean z25 = addressListHeaderCellParams.A03;
            boolean z26 = addressListHeaderCellParams.A04;
            return new UvH(addressListHeaderCellParams.A02, i25, addressListHeaderCellParams.A01, addressListHeaderCellParams.A00, z24, z25, z26);
        }
        if (this instanceof AddressListCellParams) {
            AddressListCellParams addressListCellParams = (AddressListCellParams) this;
            int i26 = ((CellParams) addressListCellParams).A02;
            boolean z27 = addressListCellParams.A05;
            List list4 = addressListCellParams.A03;
            return new UvL(addressListCellParams.A01, addressListCellParams.A02, list4, i26, addressListCellParams.A00, z27, addressListCellParams.A04);
        }
        if (this instanceof BriefAddressCellParams) {
            BriefAddressCellParams briefAddressCellParams = (BriefAddressCellParams) this;
            int i27 = ((CellParams) briefAddressCellParams).A02;
            boolean z28 = briefAddressCellParams.A06;
            boolean z29 = briefAddressCellParams.A05;
            return new UvN(briefAddressCellParams.A00, briefAddressCellParams.A01, briefAddressCellParams.A02, i27, z28, z29);
        }
        AddressCellParams addressCellParams = (AddressCellParams) this;
        int i28 = ((CellParams) addressCellParams).A02;
        boolean z30 = ((CellParams) addressCellParams).A06;
        boolean z31 = ((CellParams) addressCellParams).A05;
        String str16 = addressCellParams.A0I;
        String str17 = addressCellParams.A0P;
        String str18 = addressCellParams.A0K;
        String str19 = addressCellParams.A0M;
        String str20 = addressCellParams.A0Q;
        String str21 = addressCellParams.A0L;
        String str22 = addressCellParams.A0N;
        String str23 = addressCellParams.A0O;
        Country country = addressCellParams.A0D;
        AddressFormFieldsConfig addressFormFieldsConfig = addressCellParams.A0E;
        boolean z32 = addressCellParams.A0Y;
        int i29 = addressCellParams.A05;
        int i30 = addressCellParams.A06;
        int i31 = addressCellParams.A09;
        int i32 = addressCellParams.A0A;
        int i33 = addressCellParams.A07;
        int i34 = addressCellParams.A0B;
        int i35 = addressCellParams.A03;
        int i36 = addressCellParams.A08;
        int i37 = addressCellParams.A0C;
        int i38 = addressCellParams.A04;
        boolean z33 = addressCellParams.A0a;
        boolean z34 = addressCellParams.A0W;
        boolean z35 = addressCellParams.A0X;
        boolean z36 = addressCellParams.A0V;
        String str24 = addressCellParams.A0J;
        ImmutableList immutableList = addressCellParams.A0H;
        Map map2 = addressCellParams.A0S;
        boolean z37 = addressCellParams.A0Z;
        LoggingContext loggingContext = addressCellParams.A0F;
        boolean z38 = addressCellParams.A01;
        List list5 = addressCellParams.A0R;
        boolean z39 = addressCellParams.A00;
        return new UvP(country, addressFormFieldsConfig, loggingContext, immutableList, addressCellParams.A0G, str16, str17, str18, str19, str20, str21, str22, str23, str24, list5, map2, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, addressCellParams.A02, z30, z31, z32, z33, z34, z35, z36, z37, z38, z39, addressCellParams.A0T, addressCellParams.A0U);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeByte(this.A06 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A05 ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.A01);
        parcel.writeParcelable(this.A04, i);
    }

    public CellParams(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A06 = AbstractC167007dF.A1M(parcel.readByte());
        this.A05 = parcel.readByte() != 0;
        this.A01 = parcel.readFloat();
        this.A04 = (FormCellLoggingEvents) AbstractC37304Gc5.A04(parcel, FormCellLoggingEvents.class);
    }

    public CellParams(AbstractC69334Vlg abstractC69334Vlg) {
        this.A03 = abstractC69334Vlg.A01;
        this.A02 = abstractC69334Vlg.A05;
        this.A06 = abstractC69334Vlg.A04;
        this.A05 = abstractC69334Vlg.A03;
        this.A01 = abstractC69334Vlg.A00;
        this.A04 = abstractC69334Vlg.A02;
    }

    public CellParams(int i) {
        this.A03 = 0;
        this.A02 = i;
        this.A06 = false;
        this.A05 = true;
        this.A01 = 1.0f;
        this.A04 = null;
    }
}
