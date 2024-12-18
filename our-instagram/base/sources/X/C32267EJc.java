package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.EJc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32267EJc extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacConfirmCodeFragment";
    public FJE A00;
    public ConfirmationCodeEditText A01;
    public ProgressButton A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A09 = AbstractC31180DnO.A0v(this, 39);
    public final InterfaceC09390do A07 = AbstractC31180DnO.A0v(this, 37);
    public final InterfaceC09390do A0C = AbstractC31180DnO.A0v(this, 41);
    public final InterfaceC09390do A0B = AbstractC31180DnO.A0v(this, 40);
    public final InterfaceC09390do A08 = AbstractC31180DnO.A0v(this, 38);
    public final InterfaceC09390do A0H = AbstractC31180DnO.A0v(this, 46);
    public final InterfaceC09390do A0E = AbstractC31180DnO.A0v(this, 43);
    public final InterfaceC09390do A0G = AbstractC31180DnO.A0v(this, 45);
    public final InterfaceC09390do A06 = AbstractC31180DnO.A0v(this, 36);
    public final InterfaceC09390do A0F = AbstractC31180DnO.A0v(this, 44);
    public final InterfaceC09390do A0D = AbstractC31180DnO.A0v(this, 42);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131975873);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    public static final void A00(C32267EJc c32267EJc) {
        String str;
        C1ON A03;
        InterfaceC09390do interfaceC09390do;
        C1P1 c1p1;
        C25621Ms A0c;
        ConfirmationCodeEditText confirmationCodeEditText = c32267EJc.A01;
        if (confirmationCodeEditText == null) {
            str = "confirmationCodeEditText";
        } else {
            String A0g = AbstractC167007dF.A0g(confirmationCodeEditText);
            InterfaceC09390do interfaceC09390do2 = c32267EJc.A0A;
            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do2);
            int A06 = AbstractC167007dF.A06(0, A0o, A0g);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(C34918Fa4.A01, A0o), "instagram_two_fac_setup_action");
            AbstractC31171DnF.A1C(A0f, "next");
            A0f.AAP("view", "");
            AbstractC31181DnP.A0c(A0f);
            String A05 = AbstractC31182DnR.A05(808, 17, 46);
            A0f.AAP(A05, A0g);
            A0f.Cht();
            Integer num = c32267EJc.A03;
            if (num == null) {
                str = "twoFacConfirmCodeSource";
            } else {
                int intValue = num.intValue();
                str = "phoneNumberOrEmail";
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                if (intValue == A06) {
                                    AbstractC12990ll A0o2 = AbstractC166987dD.A0o(interfaceC09390do2);
                                    Context requireContext = c32267EJc.requireContext();
                                    c1p1 = (C1P1) c32267EJc.A06.getValue();
                                    Bundle requireArguments = c32267EJc.requireArguments();
                                    String A0Y = AbstractC31178DnM.A0Y();
                                    String string = requireArguments.getString(A0Y, "");
                                    C14360o3.A07(string);
                                    AbstractC25230BEn.A15(A06, A0o2, c1p1);
                                    A0c = AbstractC167017dG.A0c(A0o2);
                                    AbstractC31172DnG.A1Q(A0c, 549, 35, 54);
                                    AbstractC31177DnL.A0t(requireContext, A0c);
                                    A0c.A9s(A05, A0g);
                                    A0c.A9s(A0Y, string);
                                    A0c.A0R(EAZ.class, FSL.class);
                                } else {
                                    return;
                                }
                            } else {
                                AbstractC12990ll A0o3 = AbstractC166987dD.A0o(interfaceC09390do2);
                                String A0c2 = AbstractC31180DnO.A0c(c32267EJc);
                                C14360o3.A0B(A0o3, 0);
                                C25621Ms A0c3 = AbstractC167017dG.A0c(A0o3);
                                AbstractC31172DnG.A1Q(A0c3, 661, 38, 126);
                                AbstractC31173DnH.A1N(A0c3);
                                A0c3.A9s(AbstractC31182DnR.A00(), A0c2);
                                A03 = AbstractC31172DnG.A0T(A0c3, A05, A0g);
                                interfaceC09390do = c32267EJc.A0G;
                            }
                        } else {
                            AbstractC12990ll A0o4 = AbstractC166987dD.A0o(interfaceC09390do2);
                            String str2 = c32267EJc.A05;
                            if (str2 != null) {
                                A03 = AbstractC152476ta.A01(c32267EJc.requireContext(), A0o4, str2, A0g);
                                interfaceC09390do = c32267EJc.A0D;
                            }
                        }
                        c1p1 = (C1P1) interfaceC09390do.getValue();
                    } else {
                        AbstractC12990ll A0o5 = AbstractC166987dD.A0o(interfaceC09390do2);
                        Context requireContext2 = c32267EJc.requireContext();
                        c1p1 = (C1P1) c32267EJc.A0F.getValue();
                        AbstractC167007dF.A1E(A0o5, 0, c1p1);
                        A0c = AbstractC167017dG.A0c(A0o5);
                        AbstractC31172DnG.A1Q(A0c, 33, 32, 118);
                        A0c.A0R(EA7.class, FS7.class);
                        A0c.A9s(A05, A0g);
                        AbstractC31177DnL.A0t(requireContext2, A0c);
                        A0c.A0R = true;
                    }
                    A03 = A0c.A0N();
                } else {
                    Context requireContext3 = c32267EJc.requireContext();
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do2);
                    String str3 = c32267EJc.A05;
                    if (str3 != null) {
                        A03 = AbstractC35177FfU.A03(requireContext3, A0r, str3, A0g);
                        interfaceC09390do = c32267EJc.A0E;
                        c1p1 = (C1P1) interfaceC09390do.getValue();
                    }
                }
                A03.A00 = c1p1;
                C1GJ.A03(A03);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        Integer num2;
        int A02 = C0f9.A02(-293139339);
        super.onCreate(bundle);
        this.A00 = new FJE();
        Bundle requireArguments = requireArguments();
        this.A05 = requireArguments.getString("phone_number_or_email", "");
        String string = requireArguments.getString("two_fac_method", "");
        C14360o3.A07(string);
        Integer[] A00 = C05F.A00(4);
        int length = A00.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A00[i];
                if (C14360o3.A0K(AbstractC34233F8f.A00(num), string)) {
                    break;
                } else {
                    i++;
                }
            } else {
                num = C05F.A0N;
                break;
            }
        }
        this.A04 = num;
        String string2 = requireArguments.getString("two_fac_confirm_code_source", "");
        C14360o3.A07(string2);
        Integer[] A002 = C05F.A00(6);
        int length2 = A002.length;
        int i2 = 0;
        while (true) {
            if (i2 < length2) {
                num2 = A002[i2];
                if (C14360o3.A0K(AbstractC34232F8e.A00(num2), string2)) {
                    break;
                } else {
                    i2++;
                }
            } else {
                num2 = C05F.A0j;
                break;
            }
        }
        this.A03 = num2;
        if (requireArguments.getBoolean("two_fac_should_fetch_code")) {
            Context requireContext = requireContext();
            UserSession A0r = AbstractC166987dD.A0r(this.A0A);
            String str = this.A05;
            if (str == null) {
                C14360o3.A0F("phoneNumberOrEmail");
                throw C00O.createAndThrow();
            }
            EV0.A01(this, AbstractC35177FfU.A02(requireContext, A0r, str), 48);
        }
        AbstractC35075Fcm.A02(AbstractC166987dD.A0r(this.A0A), "enter_code");
        C0f9.A09(1679319068, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(256696166);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_confirm_phone_number_fragment, viewGroup, false);
        ProgressButton A0U = AbstractC31180DnO.A0U(inflate);
        C0fQ.A00((View.OnClickListener) this.A09.getValue(), A0U);
        A0U.setEnabled(false);
        this.A02 = A0U;
        ConfirmationCodeEditText confirmationCodeEditText = (ConfirmationCodeEditText) inflate.requireViewById(R.id.edit_text);
        confirmationCodeEditText.addTextChangedListener((WKa) this.A0C.getValue());
        confirmationCodeEditText.setOnEditorActionListener((C35754Fqr) this.A07.getValue());
        confirmationCodeEditText.setOnLongClickListener(new ViewOnLongClickListenerC35705Fpf(3, confirmationCodeEditText, confirmationCodeEditText));
        this.A01 = confirmationCodeEditText;
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.two_fac_confirm_phone_number_body);
        TextView A0N2 = AbstractC167007dF.A0N(inflate, R.id.footer);
        Em1 em1 = new Em1(this, AbstractC31181DnP.A02(this), 28);
        Integer num = this.A03;
        if (num == null) {
            str = "twoFacConfirmCodeSource";
        } else {
            int intValue = num.intValue();
            str = "phoneNumberOrEmail";
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            TextView A0N3 = AbstractC167007dF.A0N(inflate, R.id.two_fac_confirm_phone_number_title);
                            TextView A0N4 = AbstractC167007dF.A0N(inflate, R.id.two_fac_confirm_phone_number_description);
                            A0N3.setText(2131976009);
                            A0N.setText(2131976007);
                            A0N4.setText(2131976008);
                            String A0v = AbstractC25227BEk.A0v(this, 2131975880);
                            C14360o3.A0B(A0N2, 0);
                            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0v);
                            A0H.setSpan(em1, 0, A0v.length(), 33);
                            AbstractC25227BEk.A11(A0N2);
                            A0N2.setHighlightColor(0);
                            A0N2.setText(AbstractC25225BEi.A0H(A0H));
                        }
                    } else {
                        A0N2.setText(2131975880);
                        String A0v2 = AbstractC25227BEk.A0v(this, 2131975880);
                        SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(A0v2);
                        A0H2.setSpan(em1, 0, A0v2.length(), 33);
                        AbstractC25227BEk.A11(A0N2);
                        A0N2.setHighlightColor(0);
                        A0N2.setText(AbstractC25225BEi.A0H(A0H2));
                        String str2 = this.A05;
                        if (str2 != null) {
                            AbstractC31177DnL.A10(A0N, this, str2, 2131975838);
                        }
                    }
                } else {
                    A0N.setText(2131975875);
                    A0N2.setVisibility(8);
                    AbstractC31172DnG.A1J(inflate, R.id.space, 0);
                }
                EVO.A01(this);
                C0f9.A09(-1864916589, A02);
                return inflate;
            }
            String str3 = this.A05;
            if (str3 != null) {
                AbstractC31177DnL.A10(A0N, this, AbstractC35235FgT.A00(str3), 2131975874);
                AbstractC35235FgT.A02(em1, new Em1(this, AbstractC31181DnP.A02(this), 27), A0N2, AbstractC25227BEk.A0v(this, 2131975880), AbstractC25227BEk.A0v(this, 2131975879));
                EVO.A01(this);
                C0f9.A09(-1864916589, A02);
                return inflate;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        int A02 = C0f9.A02(-1772228201);
        super.onPause();
        Activity rootActivity = getRootActivity();
        if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
            window.setSoftInputMode(0);
            ConfirmationCodeEditText confirmationCodeEditText = this.A01;
            if (confirmationCodeEditText == null) {
                C14360o3.A0F("confirmationCodeEditText");
                throw C00O.createAndThrow();
            }
            AbstractC13880nE.A0O(confirmationCodeEditText);
        }
        C0f9.A09(-1700705866, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        int A02 = C0f9.A02(1515815582);
        super.onResume();
        Activity rootActivity = getRootActivity();
        if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
            window.setSoftInputMode(16);
            ConfirmationCodeEditText confirmationCodeEditText = this.A01;
            if (confirmationCodeEditText != null) {
                confirmationCodeEditText.requestFocus();
                ConfirmationCodeEditText confirmationCodeEditText2 = this.A01;
                if (confirmationCodeEditText2 != null) {
                    AbstractC13880nE.A0R(confirmationCodeEditText2);
                }
            }
            C14360o3.A0F("confirmationCodeEditText");
            throw C00O.createAndThrow();
        }
        C0f9.A09(-1402823773, A02);
    }
}
