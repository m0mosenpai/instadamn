package com.instagram.business.ui;

import X.A9M;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31180DnO;
import X.AbstractC31181DnP;
import X.AbstractC53242c7;
import X.AnonymousClass001;
import X.AnonymousClass780;
import X.C00O;
import X.C14360o3;
import X.C208059Im;
import X.C35468Fl3;
import X.C97F;
import X.F0Y;
import X.G9H;
import X.InterfaceC37296Gbx;
import X.ViewOnClickListenerC35690FpP;
import X.ViewOnFocusChangeListenerC35694FpU;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.business.Address;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import java.util.List;

/* loaded from: classes6.dex */
public final class BusinessInfoSectionView extends LinearLayout implements CallerContextable {
    public EditText A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public IgdsSwitch A06;
    public boolean A07;
    public TextWatcher A08;
    public View A09;
    public View A0A;
    public View A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public EditPhoneNumberView A0I;
    public boolean A0J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessInfoSectionView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        A00(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setBusinessInfo(com.instagram.common.session.UserSession r13, com.instagram.model.business.BusinessInfo r14, androidx.fragment.app.Fragment r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, X.InterfaceC37296Gbx r24) {
        /*
            r12 = this;
            r3 = 0
            r7 = r13
            X.C14360o3.A0B(r13, r3)
            r5 = r15
            X.AbstractC167017dG.A1P(r14, r15)
            r0 = 11
            r10 = r24
            X.C14360o3.A0B(r10, r0)
            android.widget.EditText r1 = r12.A00
            java.lang.String r4 = "emailEditView"
            r6 = 0
            if (r1 == 0) goto La3
            java.lang.String r0 = r14.A0B
            r1.setText(r0)
            r0 = r16
            r12.A0J = r0
            com.instagram.model.business.PublicPhoneContact r1 = r14.A01
            android.content.Context r0 = r15.requireContext()
            r12.A03(r0, r1)
            boolean r0 = r12.A0J
            java.lang.String r2 = "editPhoneNumberView"
            r1 = 8
            if (r0 == 0) goto L87
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r11 = r12.A0I
            if (r11 == 0) goto L99
            r8 = r6
            r9 = r6
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView.A01(r5, r6, r7, r8, r9, r10, r11)
            android.widget.EditText r3 = r12.A00
            if (r3 == 0) goto La3
            android.content.Context r2 = r15.requireContext()
            r0 = 2131237877(0x7f081bf5, float:1.8092017E38)
            X.AbstractC31173DnH.A0z(r2, r3, r0)
        L48:
            if (r17 == 0) goto L7c
            com.instagram.model.business.Address r0 = r14.A00
            r12.A05(r0)
            java.util.List r0 = r14.A0M
            r2 = r18
            r12.A06(r0, r2)
        L56:
            if (r20 == 0) goto L71
            boolean r0 = r14.A0P
            r12.A07(r0)
        L5d:
            if (r19 == 0) goto L9d
            r12.A04(r13)
        L62:
            if (r23 == 0) goto L67
            r12.A01()
        L67:
            boolean r0 = r14.A0S
            r2 = r21
            r1 = r22
            r12.A08(r2, r0, r1)
            return
        L71:
            android.widget.TextView r0 = r12.A0G
            if (r0 != 0) goto L78
            java.lang.String r4 = "nativeCallingTextView"
            goto La3
        L78:
            r0.setVisibility(r1)
            goto L5d
        L7c:
            android.view.View r0 = r12.A09
            if (r0 != 0) goto L83
            java.lang.String r4 = "addressRowView"
            goto La3
        L83:
            r0.setVisibility(r1)
            goto L56
        L87:
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r12.A0I
            if (r0 == 0) goto L99
            r0.setVisibility(r1)
            android.widget.TextView r0 = r12.A0H
            if (r0 != 0) goto L95
            java.lang.String r4 = "phoneNumberTextView"
            goto La3
        L95:
            r0.setVisibility(r3)
            goto L48
        L99:
            X.C14360o3.A0F(r2)
            goto La6
        L9d:
            android.widget.TextView r0 = r12.A05
            if (r0 != 0) goto Lab
            java.lang.String r4 = "whatsAppTextView"
        La3:
            X.C14360o3.A0F(r4)
        La6:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lab:
            r0.setVisibility(r1)
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.ui.BusinessInfoSectionView.setBusinessInfo(com.instagram.common.session.UserSession, com.instagram.model.business.BusinessInfo, androidx.fragment.app.Fragment, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, X.Gbx):void");
    }

    public final void setBusinessInfoListeners(InterfaceC37296Gbx interfaceC37296Gbx) {
        C14360o3.A0B(interfaceC37296Gbx, 0);
        C35468Fl3 c35468Fl3 = new C35468Fl3(0, this, interfaceC37296Gbx);
        this.A08 = c35468Fl3;
        EditText editText = this.A00;
        String str = "emailEditView";
        if (editText != null) {
            editText.addTextChangedListener(c35468Fl3);
            EditText editText2 = this.A00;
            if (editText2 != null) {
                ViewOnFocusChangeListenerC35694FpU.A00(editText2, 1, interfaceC37296Gbx);
                EditPhoneNumberView editPhoneNumberView = this.A0I;
                if (editPhoneNumberView == null) {
                    str = "editPhoneNumberView";
                } else {
                    editPhoneNumberView.A01.addTextChangedListener(new C35468Fl3(1, this, interfaceC37296Gbx));
                    if (!this.A0J) {
                        TextView textView = this.A0H;
                        if (textView == null) {
                            str = "phoneNumberTextView";
                        } else {
                            textView.setOnClickListener(ViewOnClickListenerC35690FpP.A00(interfaceC37296Gbx, 59));
                        }
                    }
                    View view = this.A09;
                    if (view == null) {
                        str = "addressRowView";
                    } else {
                        view.setOnClickListener(ViewOnClickListenerC35690FpP.A00(interfaceC37296Gbx, 60));
                        TextView textView2 = this.A0G;
                        if (textView2 == null) {
                            str = "nativeCallingTextView";
                        } else {
                            textView2.setOnClickListener(ViewOnClickListenerC35690FpP.A00(interfaceC37296Gbx, 61));
                            TextView textView3 = this.A05;
                            if (textView3 == null) {
                                str = "whatsAppTextView";
                            } else {
                                textView3.setOnClickListener(ViewOnClickListenerC35690FpP.A00(interfaceC37296Gbx, 62));
                                IgdsSwitch igdsSwitch = this.A06;
                                if (igdsSwitch == null) {
                                    str = "profileDisplayToggle";
                                } else {
                                    igdsSwitch.A07 = new G9H(interfaceC37296Gbx, 6);
                                    View view2 = this.A0A;
                                    if (view2 == null) {
                                        str = "profileDisplayRow";
                                    } else {
                                        view2.setOnClickListener(ViewOnClickListenerC35690FpP.A00(this, 63));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void setCountryCode(CountryCodeData countryCodeData) {
        C14360o3.A0B(countryCodeData, 0);
        EditPhoneNumberView editPhoneNumberView = this.A0I;
        if (editPhoneNumberView == null) {
            C14360o3.A0F("editPhoneNumberView");
            throw C00O.createAndThrow();
        }
        editPhoneNumberView.setCountryCodeWithCountryPrefix(countryCodeData);
    }

    private final void setDarkModeTint(TextView textView) {
        if (textView != null) {
            for (Drawable drawable : textView.getCompoundDrawables()) {
                if (drawable != null) {
                    AbstractC166997dE.A1F(drawable.mutate(), AbstractC53242c7.A01(getContext()));
                }
            }
        }
    }

    public final void A01() {
        String str;
        TextView textView = this.A0E;
        if (textView == null) {
            str = "bottomText";
        } else {
            textView.setText(2131961647);
            TextView textView2 = this.A0F;
            str = "bottomText2";
            if (textView2 != null) {
                AbstractC31180DnO.A13(getResources(), textView2, 2131961648);
                TextView textView3 = this.A0F;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A02() {
        String str;
        TextView textView = this.A0H;
        if (textView == null) {
            str = "phoneNumberTextView";
        } else {
            textView.setOnClickListener(null);
            View view = this.A09;
            if (view == null) {
                str = "addressRowView";
            } else {
                view.setOnClickListener(null);
                TextWatcher textWatcher = this.A08;
                if (textWatcher != null) {
                    EditText editText = this.A00;
                    if (editText == null) {
                        str = "emailEditView";
                    } else {
                        editText.removeTextChangedListener(textWatcher);
                    }
                }
                this.A08 = null;
                IgdsSwitch igdsSwitch = this.A06;
                if (igdsSwitch == null) {
                    str = "profileDisplayToggle";
                } else {
                    igdsSwitch.A07 = null;
                    View view2 = this.A0A;
                    if (view2 == null) {
                        str = "profileDisplayRow";
                    } else {
                        view2.setOnClickListener(null);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A04(UserSession userSession) {
        C208059Im c208059Im;
        TextView textView;
        String A00;
        C14360o3.A0B(userSession, 0);
        TextView textView2 = this.A05;
        if (textView2 != null) {
            textView2.setVisibility(AbstractC167007dF.A05(F0Y.A00(userSession) ? 1 : 0));
            if (!AbstractC166997dE.A0Y(userSession).A1a()) {
                textView = this.A05;
                if (textView != null) {
                    A00 = "";
                    textView.setText(A00);
                    return;
                }
            } else {
                A9M A01 = C97F.A01(C97F.A00(BusinessInfoSectionView.class), userSession);
                if (A01 == null || (c208059Im = A01.A00) == null) {
                    return;
                }
                textView = this.A05;
                if (textView != null) {
                    A00 = c208059Im.A00(C97F.A00(BusinessInfoSectionView.class), userSession);
                    textView.setText(A00);
                    return;
                }
            }
        }
        C14360o3.A0F("whatsAppTextView");
        throw C00O.createAndThrow();
    }

    public final void A05(Address address) {
        String str;
        if (address != null && (str = address.A03) != null && str.length() != 0) {
            TextView textView = this.A01;
            if (textView != null) {
                textView.setText(str);
                return;
            }
        } else {
            TextView textView2 = this.A01;
            if (textView2 != null) {
                AbstractC31171DnF.A14(textView2);
                return;
            }
        }
        C14360o3.A0F("addressTextView");
        throw C00O.createAndThrow();
    }

    public final void A06(List list, boolean z) {
        TextView textView = this.A01;
        if (textView != null) {
            textView.setVisibility(0);
            TextView textView2 = this.A0D;
            if (textView2 != null) {
                textView2.setVisibility(8);
                TextView textView3 = this.A0C;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                    TextView textView4 = this.A0C;
                    if (textView4 != null) {
                        AbstractC31171DnF.A14(textView4);
                        if (z && list != null && AbstractC166987dD.A1b(list)) {
                            TextView textView5 = this.A01;
                            if (textView5 != null) {
                                textView5.setVisibility(8);
                                TextView textView6 = this.A0D;
                                if (textView6 != null) {
                                    textView6.setVisibility(0);
                                    TextView textView7 = this.A0C;
                                    if (textView7 != null) {
                                        textView7.setVisibility(0);
                                        int size = list.size() + 1;
                                        TextView textView8 = this.A0C;
                                        if (textView8 != null) {
                                            textView8.setText(String.valueOf(size));
                                            return;
                                        }
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
                C14360o3.A0F("addressCountTextView");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F("addressTitleTextView");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("addressTextView");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(boolean r4) {
        /*
            r3 = this;
            java.lang.String r2 = "nativeCallingTextView"
            r0 = 0
            android.widget.TextView r1 = r3.A0G
            if (r4 == 0) goto L1a
            if (r1 == 0) goto L20
            r0 = 2131954419(0x7f130af3, float:1.9545337E38)
            r1.setText(r0)
        Lf:
            r3.A07 = r4
            android.widget.TextView r1 = r3.A0G
            if (r1 == 0) goto L20
            r0 = 0
            r1.setVisibility(r0)
            return
        L1a:
            if (r1 == 0) goto L20
            r1.setText(r0)
            goto Lf
        L20:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.ui.BusinessInfoSectionView.A07(boolean):void");
    }

    public final void A08(boolean z, boolean z2, boolean z3) {
        String str = "profileDisplayRow";
        View view = this.A0A;
        if (z) {
            if (view != null) {
                view.setVisibility(0);
                str = "profileDisplayToggle";
                IgdsSwitch igdsSwitch = this.A06;
                if (z3) {
                    if (igdsSwitch != null) {
                        igdsSwitch.setCheckedAnimated(z2);
                        return;
                    }
                } else if (igdsSwitch != null) {
                    igdsSwitch.setChecked(z2);
                    return;
                }
            }
        } else if (view != null) {
            view.setVisibility(8);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final boolean A09() {
        String str;
        EditText editText = this.A00;
        if (editText == null) {
            str = "emailEditView";
        } else {
            Editable text = editText.getText();
            if ((text == null || text.length() == 0) && A0A()) {
                TextView textView = this.A01;
                if (textView == null) {
                    str = "addressTextView";
                } else {
                    CharSequence text2 = textView.getText();
                    if (text2 == null || text2.length() == 0) {
                        TextView textView2 = this.A05;
                        if (textView2 == null) {
                            str = "whatsAppTextView";
                        } else {
                            CharSequence text3 = textView2.getText();
                            if (text3 == null || text3.length() == 0) {
                                return true;
                            }
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final boolean A0A() {
        CharSequence text;
        if (this.A0J) {
            text = getNationalNumber();
        } else {
            TextView textView = this.A0H;
            if (textView == null) {
                C14360o3.A0F("phoneNumberTextView");
                throw C00O.createAndThrow();
            }
            text = textView.getText();
        }
        if (text != null && text.length() != 0) {
            return false;
        }
        return true;
    }

    public final String getAddress() {
        TextView textView = this.A01;
        if (textView == null) {
            C14360o3.A0F("addressTextView");
            throw C00O.createAndThrow();
        }
        return AbstractC31174DnI.A0v(textView);
    }

    public final String getCountryCode() {
        EditPhoneNumberView editPhoneNumberView = this.A0I;
        if (editPhoneNumberView == null) {
            C14360o3.A0F("editPhoneNumberView");
            throw C00O.createAndThrow();
        }
        String countryCodeWithoutPlus = editPhoneNumberView.A04.getCountryCodeWithoutPlus();
        C14360o3.A07(countryCodeWithoutPlus);
        return countryCodeWithoutPlus;
    }

    public final String getEmail() {
        EditText editText = this.A00;
        if (editText == null) {
            C14360o3.A0F("emailEditView");
            throw C00O.createAndThrow();
        }
        return AbstractC167007dF.A0g(editText);
    }

    public final String getNationalNumber() {
        EditPhoneNumberView editPhoneNumberView = this.A0I;
        if (editPhoneNumberView == null) {
            C14360o3.A0F("editPhoneNumberView");
            throw C00O.createAndThrow();
        }
        String A0g = AbstractC167007dF.A0g(editPhoneNumberView.A01);
        C14360o3.A07(A0g);
        return A0g;
    }

    public final String getPhoneNumber() {
        EditPhoneNumberView editPhoneNumberView = this.A0I;
        if (editPhoneNumberView == null) {
            C14360o3.A0F("editPhoneNumberView");
            throw C00O.createAndThrow();
        }
        return editPhoneNumberView.getPhoneNumber();
    }

    private final void A00(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_business_info_section, this);
        this.A0B = inflate;
        if (inflate != null) {
            this.A00 = AbstractC31173DnH.A0H(inflate, R.id.email);
            View view = this.A0B;
            if (view != null) {
                this.A09 = view.requireViewById(R.id.address_row);
                View view2 = this.A0B;
                if (view2 != null) {
                    this.A01 = AbstractC166997dE.A0T(view2, R.id.address);
                    View view3 = this.A0B;
                    if (view3 != null) {
                        this.A0D = AbstractC166997dE.A0T(view3, R.id.address_title);
                        View view4 = this.A0B;
                        if (view4 != null) {
                            this.A0C = AbstractC166997dE.A0T(view4, R.id.address_count);
                            View view5 = this.A0B;
                            if (view5 != null) {
                                this.A05 = AbstractC166997dE.A0T(view5, R.id.whatsapp);
                                View view6 = this.A0B;
                                if (view6 != null) {
                                    this.A0G = AbstractC166997dE.A0T(view6, R.id.native_calling);
                                    View view7 = this.A0B;
                                    if (view7 != null) {
                                        this.A0I = (EditPhoneNumberView) view7.requireViewById(R.id.phone_number_edit_view);
                                        View view8 = this.A0B;
                                        if (view8 != null) {
                                            this.A0H = AbstractC166997dE.A0T(view8, R.id.phone_number_text_view);
                                            View view9 = this.A0B;
                                            if (view9 != null) {
                                                View requireViewById = view9.requireViewById(R.id.profile_display_toggle);
                                                this.A0A = requireViewById;
                                                String str = "profileDisplayRow";
                                                if (requireViewById != null) {
                                                    AbstractC31180DnO.A06(requireViewById).setText(2131970130);
                                                    View view10 = this.A0A;
                                                    if (view10 != null) {
                                                        this.A06 = (IgdsSwitch) view10.requireViewById(R.id.toggle);
                                                        View view11 = this.A0B;
                                                        if (view11 != null) {
                                                            this.A0E = AbstractC166997dE.A0T(view11, R.id.bottom_text);
                                                            View view12 = this.A0B;
                                                            if (view12 != null) {
                                                                this.A0F = AbstractC166997dE.A0T(view12, R.id.bottom_text_2);
                                                                View view13 = this.A0B;
                                                                if (view13 != null) {
                                                                    TextView A0T = AbstractC166997dE.A0T(view13, R.id.email_inline_error_message);
                                                                    this.A03 = A0T;
                                                                    if (A0T == null) {
                                                                        str = "emailInlineErrorMessage";
                                                                    } else {
                                                                        A0T.setText(2131969694);
                                                                        View view14 = this.A0B;
                                                                        if (view14 != null) {
                                                                            TextView A0T2 = AbstractC166997dE.A0T(view14, R.id.phone_inline_error_message);
                                                                            this.A04 = A0T2;
                                                                            if (A0T2 == null) {
                                                                                str = "phoneInlineErrorMessage";
                                                                            } else {
                                                                                A0T2.setText(2131969564);
                                                                                View view15 = this.A0B;
                                                                                if (view15 != null) {
                                                                                    TextView A0T3 = AbstractC166997dE.A0T(view15, R.id.bottom_inline_error_message);
                                                                                    this.A02 = A0T3;
                                                                                    if (A0T3 == null) {
                                                                                        str = "bottomInlineErrorMessage";
                                                                                    } else {
                                                                                        A0T3.setText(2131969696);
                                                                                        EditText editText = this.A00;
                                                                                        if (editText == null) {
                                                                                            str = "emailEditView";
                                                                                        } else {
                                                                                            Drawable drawable = editText.getCompoundDrawables()[0];
                                                                                            if (drawable != null) {
                                                                                                AbstractC166997dE.A1F(drawable.mutate(), AbstractC53242c7.A01(getContext()));
                                                                                            }
                                                                                            TextView textView = this.A0H;
                                                                                            if (textView == null) {
                                                                                                str = "phoneNumberTextView";
                                                                                            } else {
                                                                                                setDarkModeTint(textView);
                                                                                                TextView textView2 = this.A05;
                                                                                                if (textView2 == null) {
                                                                                                    str = "whatsAppTextView";
                                                                                                } else {
                                                                                                    setDarkModeTint(textView2);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                C14360o3.A0F(str);
                                                throw C00O.createAndThrow();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F("view");
        throw C00O.createAndThrow();
    }

    public final void A03(Context context, PublicPhoneContact publicPhoneContact) {
        String str;
        TextView textView;
        String str2;
        CountryCodeData A00 = AnonymousClass780.A00(context);
        String str3 = A00.A01;
        boolean z = false;
        String str4 = null;
        if (publicPhoneContact != null) {
            str3 = publicPhoneContact.A01;
            if (str3 != null && str3.length() != 0) {
                A00 = AnonymousClass780.A01(context, str3);
                str3 = AnonymousClass001.A0D(str3, '+');
            }
            str4 = publicPhoneContact.A02;
        }
        if (this.A0J) {
            EditPhoneNumberView editPhoneNumberView = this.A0I;
            if (editPhoneNumberView == null) {
                str = "editPhoneNumberView";
            } else {
                editPhoneNumberView.setupEditPhoneNumberView(A00, str4);
                return;
            }
        } else {
            if (str4 == null || str4.length() == 0) {
                z = true;
            }
            str = "phoneNumberTextView";
            if (!z) {
                String A0H = AbstractC31181DnP.A0H(str4);
                textView = this.A0H;
                if (textView != null) {
                    str2 = AnonymousClass001.A0g(str3, " ", A0H);
                    textView.setText(str2);
                    return;
                }
            } else {
                textView = this.A0H;
                if (textView != null) {
                    str2 = "";
                    textView.setText(str2);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.instagram.model.business.PublicPhoneContact, java.lang.Object] */
    public final PublicPhoneContact getSubmitPublicPhoneContact() {
        if (getNationalNumber().length() == 0) {
            return null;
        }
        String countryCode = getCountryCode();
        String nationalNumber = getNationalNumber();
        String phoneNumber = getPhoneNumber();
        ?? obj = new Object();
        obj.A01 = countryCode;
        obj.A02 = nationalNumber;
        obj.A03 = phoneNumber;
        obj.A00 = "CALL";
        return obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessInfoSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A00(context);
    }
}
