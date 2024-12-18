package com.instagram.business.fragment;

import X.AbstractC10360h2;
import X.AbstractC13880nE;
import X.AbstractC1566171j;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC25233BEq;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC31180DnO;
import X.AbstractC53242c7;
import X.AbstractC59962oe;
import X.AbstractC81793ku;
import X.AnonymousClass773;
import X.C08730cb;
import X.C0f9;
import X.C17060sy;
import X.C18C;
import X.C193328hC;
import X.C25621Ms;
import X.C31722DwR;
import X.C35198Ffq;
import X.C3LY;
import X.C6WQ;
import X.DialogInterfaceOnClickListenerC35446Fk3;
import X.DialogInterfaceOnClickListenerC35452Fk9;
import X.EBJ;
import X.EUP;
import X.Em1;
import X.EnumC193348hE;
import X.FTR;
import X.InterfaceC02590Ai;
import X.InterfaceC111194zh;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.ViewOnClickListenerC35690FpP;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.user.model.User;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class SupportServiceEditUrlFragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public ActionButton A00;
    public SMBPartnerType A01;
    public C35198Ffq A02;
    public UserSession A03;
    public C6WQ A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public String A0E;
    public String A0F;
    public final Handler A0G = AbstractC167007dF.A0J();
    public BusinessNavBar mBusinessNavBar;
    public EditText mURLEditText;
    public TextView mURLTitleTextView;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "service_partner_edit_url";
    }

    public static void A00(InterfaceC111194zh interfaceC111194zh, SupportServiceEditUrlFragment supportServiceEditUrlFragment) {
        User A10 = AbstractC166987dD.A10(supportServiceEditUrlFragment.A03);
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        if (sMBPartnerType.equals(SMBPartnerType.A09)) {
            A10.A03.EeX(interfaceC111194zh);
        } else if (sMBPartnerType.equals(SMBPartnerType.A06)) {
            A10.A03.EeU(interfaceC111194zh);
        } else if (sMBPartnerType.equals(SMBPartnerType.A05)) {
            A10.A03.EeV(interfaceC111194zh);
        }
        AbstractC31172DnG.A1R(supportServiceEditUrlFragment.A03, A10);
    }

    public static void A01(SupportServiceEditUrlFragment supportServiceEditUrlFragment) {
        String str = supportServiceEditUrlFragment.A0A;
        if (!"sticker".equals(str) && !"business_hub".equals(str)) {
            supportServiceEditUrlFragment.getParentFragmentManager().A0x(SupportLinksFragment.A06, 1);
        } else {
            AbstractC25227BEk.A1B(supportServiceEditUrlFragment);
        }
    }

    public static void A02(SupportServiceEditUrlFragment supportServiceEditUrlFragment, String str) {
        UserSession userSession = supportServiceEditUrlFragment.A03;
        String str2 = supportServiceEditUrlFragment.A05;
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        EUP eup = new EUP(str, supportServiceEditUrlFragment, 2);
        AbstractC167007dF.A1F(userSession, 0, sMBPartnerType);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("accounts/update_smb_partner/");
        A0c.A0R(EBJ.class, FTR.class);
        A0c.A0R = true;
        A0c.A9s("smb_partner_type", sMBPartnerType.toString());
        A0c.A9s("url", str);
        A0c.A9s("app_id", str2);
        AbstractC31175DnJ.A1L(A0c, eup, supportServiceEditUrlFragment);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        ?? obj = new Object();
        String str = this.A0A;
        C18C.A0F(AbstractC167007dF.A1W(str));
        boolean z = this.A0C;
        boolean equals = str.equals("sticker");
        if (z) {
            i = 2131961654;
            if (equals) {
                i = 2131961651;
            }
        } else {
            i = 2131952140;
            if (equals) {
                i = 2131975007;
            }
        }
        obj.A02 = getString(i);
        this.A00 = C31722DwR.A00(ViewOnClickListenerC35690FpP.A00(this, 46), interfaceC56362iU, obj);
        if (getParentFragmentManager().A0L() != 0) {
            interfaceC56362iU.Ehd(new C3LY(AbstractC31174DnI.A0K()));
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        View view = this.mView;
        if (view != null) {
            AbstractC13880nE.A0O(view);
        }
        if (getParentFragmentManager().A0L() == 0) {
            AbstractC25227BEk.A1B(this);
            return true;
        }
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        if (abstractC10360h2 == null) {
            return true;
        }
        abstractC10360h2.A0b();
        return true;
    }

    public static void A03(SupportServiceEditUrlFragment supportServiceEditUrlFragment, String str) {
        int i;
        String string;
        DialogInterface.OnClickListener dialogInterfaceOnClickListenerC35446Fk3;
        EnumC193348hE enumC193348hE;
        int i2;
        C193328hC A0P = AbstractC31180DnO.A0P(supportServiceEditUrlFragment);
        boolean isEmpty = TextUtils.isEmpty(str);
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        boolean equals = sMBPartnerType.equals(SMBPartnerType.A05);
        if (isEmpty) {
            if (equals) {
                A0P.A0A(2131972266);
                i2 = 2131972265;
            } else if (sMBPartnerType.equals(SMBPartnerType.A09)) {
                A0P.A0A(2131972264);
                i2 = 2131972267;
            } else {
                if (sMBPartnerType.equals(SMBPartnerType.A06)) {
                    A0P.A0A(2131972264);
                    i2 = 2131972263;
                }
                string = supportServiceEditUrlFragment.getString(2131972262);
                dialogInterfaceOnClickListenerC35446Fk3 = DialogInterfaceOnClickListenerC35452Fk9.A00(supportServiceEditUrlFragment, 25);
                enumC193348hE = EnumC193348hE.A06;
            }
            A0P.A09(i2);
            string = supportServiceEditUrlFragment.getString(2131972262);
            dialogInterfaceOnClickListenerC35446Fk3 = DialogInterfaceOnClickListenerC35452Fk9.A00(supportServiceEditUrlFragment, 25);
            enumC193348hE = EnumC193348hE.A06;
        } else {
            if (equals) {
                A0P.A0A(2131976281);
                i = 2131976280;
            } else if (sMBPartnerType.equals(SMBPartnerType.A09)) {
                A0P.A0A(2131976279);
                i = 2131976282;
            } else {
                if (sMBPartnerType.equals(SMBPartnerType.A06)) {
                    A0P.A0A(2131976279);
                    i = 2131976278;
                }
                string = supportServiceEditUrlFragment.getString(2131976277);
                dialogInterfaceOnClickListenerC35446Fk3 = new DialogInterfaceOnClickListenerC35446Fk3(str, supportServiceEditUrlFragment, 0);
                enumC193348hE = EnumC193348hE.A04;
            }
            A0P.A09(i);
            string = supportServiceEditUrlFragment.getString(2131976277);
            dialogInterfaceOnClickListenerC35446Fk3 = new DialogInterfaceOnClickListenerC35446Fk3(str, supportServiceEditUrlFragment, 0);
            enumC193348hE = EnumC193348hE.A04;
        }
        A0P.A0Z(dialogInterfaceOnClickListenerC35446Fk3, enumC193348hE, string, true);
        A0P.A0b(DialogInterfaceOnClickListenerC35452Fk9.A00(supportServiceEditUrlFragment, 22), supportServiceEditUrlFragment.getString(2131954762));
        AbstractC166987dD.A1W(A0P);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean A1W;
        int i;
        int A02 = C0f9.A02(264595987);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = AbstractC31176DnK.A0S(this);
        this.A0F = AbstractC31173DnH.A0j(requireArguments, "args_session_id");
        this.A05 = AbstractC31173DnH.A0j(requireArguments, "APP_ID");
        this.A0B = AbstractC31173DnH.A0j(requireArguments, "PARTNER_NAME");
        this.A0E = requireArguments.getString("PLACEHOLDER_URL");
        this.A06 = requireArguments.getString("AUTOFILL_URL");
        String A0j = AbstractC31173DnH.A0j(requireArguments, "args_entry_point");
        this.A0A = A0j;
        this.A02 = new C35198Ffq(this, this.A03, this.A0F, A0j);
        this.A0D = "profile".equals(this.A0A);
        String str = null;
        if (requireArguments.getString("args_category_type") != null) {
            String string = requireArguments.getString("args_category_type");
            this.A07 = string;
            this.A01 = AbstractC81793ku.A00(string);
            InterfaceC111194zh Ayj = AbstractC31174DnI.A0m(this.A03).Ayj();
            if (Ayj != null) {
                str = Ayj.Amd();
            }
            this.A08 = str;
            if (Ayj != null) {
                this.A09 = Ayj.AyS();
            }
            A1W = AbstractC31171DnF.A1X(this.A06);
        } else {
            Serializable serializable = requireArguments.getSerializable("args_service_type");
            serializable.getClass();
            SMBPartnerType sMBPartnerType = (SMBPartnerType) serializable;
            this.A01 = sMBPartnerType;
            this.A07 = sMBPartnerType.toString();
            UserSession userSession = this.A03;
            C08730cb c08730cb = C17060sy.A01;
            SMBPartnerType Ayk = AbstractC31171DnF.A0T(userSession, c08730cb).Ayk();
            if (Ayk != null) {
                str = Ayk.toString();
            }
            this.A08 = str;
            if (Ayk != null) {
                int ordinal = Ayk.ordinal();
                if (ordinal != 6) {
                    if (ordinal != 3) {
                        if (ordinal == 2) {
                            i = 2131961123;
                        } else {
                            throw AbstractC31180DnO.A0m(Ayk);
                        }
                    } else {
                        i = 2131957733;
                    }
                } else {
                    i = 2131963232;
                }
                this.A09 = getString(i);
            }
            A1W = AbstractC167007dF.A1W(AbstractC1566171j.A00(this.A01, c08730cb.A01(this.A03)));
        }
        this.A0C = A1W;
        C0f9.A09(770879893, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(777482716);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.support_service_edit_url_fragment);
        C0f9.A09(1793741416, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        Integer num;
        super.onViewCreated(view, bundle);
        C35198Ffq c35198Ffq = this.A02;
        String str = this.A07;
        boolean z = this.A0C;
        String str2 = this.A05;
        String str3 = this.A0B;
        String str4 = this.A06;
        AbstractC25233BEq.A0v(0, str, str2, str3);
        InterfaceC02590Ai A00 = C35198Ffq.A00(c35198Ffq);
        AbstractC31171DnF.A1A(A00, "add_url");
        AbstractC31171DnF.A1C(A00, "view");
        C35198Ffq.A01(A00, c35198Ffq, str, str2, z);
        AbstractC31176DnK.A1L(A00, str3, str4);
        A00.Cht();
        TextView A06 = AbstractC31180DnO.A06(view);
        SMBPartnerType sMBPartnerType = this.A01;
        SMBPartnerType sMBPartnerType2 = SMBPartnerType.A05;
        boolean equals = sMBPartnerType.equals(sMBPartnerType2);
        int i2 = 2131952422;
        if (equals) {
            i2 = 2131952303;
        }
        AbstractC25227BEk.A12(A06, this, i2);
        TextView A0E = AbstractC31176DnK.A0E(view);
        boolean equals2 = this.A0A.equals("sticker");
        SMBPartnerType sMBPartnerType3 = this.A01;
        boolean equals3 = sMBPartnerType3.equals(SMBPartnerType.A09);
        if (equals2) {
            if (equals3) {
                i = 2131973327;
            } else {
                if (sMBPartnerType3.equals(SMBPartnerType.A06)) {
                    i = 2131973326;
                }
                num = null;
            }
            num = Integer.valueOf(i);
        } else {
            if (equals3) {
                i = 2131952421;
            } else if (sMBPartnerType3.equals(SMBPartnerType.A06)) {
                i = 2131952418;
            } else {
                if (sMBPartnerType3.equals(sMBPartnerType2)) {
                    i = 2131952419;
                }
                num = null;
            }
            num = Integer.valueOf(i);
        }
        String string = getString(2131954430);
        num.getClass();
        SpannableStringBuilder A08 = AbstractC31178DnM.A08(this, string, num.intValue());
        AnonymousClass773.A05(A08, new Em1(Integer.valueOf(AbstractC31179DnN.A01(this)), this, 4), string);
        A0E.setText(A08);
        A0E.setHighlightColor(0);
        AbstractC25227BEk.A11(A0E);
        EditText A0H = AbstractC31173DnH.A0H(view, R.id.url_edit_text);
        this.mURLEditText = A0H;
        A0H.setHint(this.A0E);
        if (!TextUtils.isEmpty(this.A06)) {
            this.mURLEditText.setText(this.A06);
        }
        this.mURLTitleTextView = AbstractC166997dE.A0T(view, R.id.edit_url_title);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.bottom_text);
        int i3 = 2131952420;
        if (this.A01.equals(sMBPartnerType2)) {
            i3 = 2131952302;
        }
        A0T.setText(i3);
        if (this.A0C) {
            BusinessNavBar businessNavBar = (BusinessNavBar) view.requireViewById(R.id.remove_action_bar);
            this.mBusinessNavBar = businessNavBar;
            businessNavBar.setVisibility(0);
            this.mBusinessNavBar.A01.setVisibility(8);
            BusinessNavBar businessNavBar2 = this.mBusinessNavBar;
            String string2 = getString(2131972280);
            int color = requireContext().getColor(AbstractC53242c7.A03(requireContext()));
            int dimensionPixelSize = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
            TitleTextView titleTextView = businessNavBar2.A03;
            titleTextView.setText(string2);
            titleTextView.setIsBold(true);
            titleTextView.setTextColor(color);
            titleTextView.setTextSize(0, dimensionPixelSize);
            this.mBusinessNavBar.setSecondaryButtonOnclickListeners(ViewOnClickListenerC35690FpP.A00(this, 45));
        }
        C6WQ A0T2 = AbstractC31180DnO.A0T(this);
        this.A04 = A0T2;
        A0T2.A00(requireContext().getString(2131969964));
        this.A04.setCancelable(false);
    }
}
