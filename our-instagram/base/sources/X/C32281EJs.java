package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.EJs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32281EJs extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EditFullNameFragment";
    public ActionButton A00;
    public IgTextView A01;
    public IgFormField A02;
    public C34649FOh A03;
    public C155506yf A04;
    public User A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public IgTextView A0E;
    public boolean A0F;
    public final InterfaceC09390do A0G = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_edit_full_name";
    }

    /* JADX WARN: Type inference failed for: r0v57, types: [X.U9N, android.text.method.LinkMovementMethod] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        ArrayList arrayList;
        IgFormField igFormField;
        IgTextView igTextView;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = AbstractC31172DnG.A0k(view, R.id.full_name);
        this.A01 = AbstractC31172DnG.A0X(view, R.id.full_name_change_limiting_textview);
        InterfaceC09390do interfaceC09390do = this.A0G;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A0o, 36328525606698600L) || C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36328525606764137L)) {
            this.A0E = AbstractC31172DnG.A0X(view, R.id.full_name_data_transparency_textview);
            boolean A06 = C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36328525606698600L);
            IgTextView igTextView2 = this.A0E;
            if (A06) {
                if (igTextView2 != null) {
                    AbstractC25227BEk.A12(igTextView2, this, 2131957524);
                }
            } else {
                String A0v = AbstractC25227BEk.A0v(this, 2131957521);
                String A0w = AbstractC31174DnI.A0w(this, A0v, 2131957525);
                C14360o3.A07(A0w);
                if (igTextView2 != null) {
                    AbstractC25227BEk.A11(igTextView2);
                    Context A0L = AbstractC166997dE.A0L(igTextView2);
                    SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0w);
                    AnonymousClass773.A05(A0H, new Em1(this, AbstractC31174DnI.A02(A0L)), A0v);
                    igTextView2.setText(A0H);
                    igTextView2.setVisibility(0);
                }
            }
            AbstractC151856sV.A00(AbstractC166987dD.A0r(interfaceC09390do), C05F.A0C);
            IgTextView igTextView3 = this.A0E;
            if (igTextView3 != null) {
                igTextView3.setVisibility(0);
            }
        }
        String str = this.A07;
        if (str != null && str.length() != 0 && (igTextView = this.A01) != null) {
            igTextView.setText(str);
        }
        IgFormField igFormField2 = this.A02;
        if (igFormField2 != null) {
            igFormField2.getMEditText().setImeOptions(6);
        }
        IgFormField igFormField3 = this.A02;
        if (igFormField3 != null) {
            C35754Fqr.A00(igFormField3.getMEditText(), this, 18);
        }
        if (!this.A0F && (igFormField = this.A02) != null) {
            String str2 = this.A09;
            if (str2 != null) {
                igFormField.setText(str2);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        A00(this);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.fx_im_name_sync_reminder_textview);
        AnonymousClass435 anonymousClass435 = AbstractC70201WGq.A00;
        if (anonymousClass435 != null && (obj = anonymousClass435.A01) != null && ((InterfaceC72042XIv) obj).B9J() != null && ((InterfaceC72042XIv) AbstractC70201WGq.A00.A01).B9J().BW7() != null) {
            Context requireContext = requireContext();
            AbstractC12990ll A0o2 = AbstractC166987dD.A0o(interfaceC09390do);
            InterfaceC37284Gbl A03 = AbstractC70201WGq.A03();
            if (A03.Agm() != null && !AbstractC126965oa.A03(A03.Agm().getText())) {
                String text = A03.Agm().getText();
                InterfaceC37284Gbl A032 = AbstractC70201WGq.A03();
                if (A032.Agm() != null) {
                    int offset = ((InterfaceC37283Gbk) A032.Agm().Bk4().get(0)).getOffset();
                    if (C18U.A06(c06090Tz, A0o2, 36325695223379220L)) {
                        try {
                            arrayList = AbstractC70201WGq.A0C();
                        } catch (IllegalStateException unused) {
                            AbstractC166987dD.A1T(C18950wb.A01, "crash_getting_name_passive_reminder_style", 817890849);
                            arrayList = null;
                        }
                    } else {
                        arrayList = AbstractC70201WGq.A0C();
                    }
                    SpannableString A00 = IQ4.A00(requireContext, new TextWithEntities(null, null, text.substring(0, offset), null, arrayList, null));
                    String substring = text.substring(offset);
                    int A02 = AbstractC31173DnH.A02(requireContext);
                    SpannableString spannableString = new SpannableString(substring);
                    spannableString.setSpan(new C31752Dx5(A02, 3, this, A0o2), 0, substring.length(), 33);
                    CharSequence concat = TextUtils.concat(A00, spannableString);
                    C14360o3.A07(concat);
                    A0N.setVisibility(0);
                    A0N.setText(concat);
                    U9N u9n = U9N.A00;
                    U9N u9n2 = u9n;
                    if (u9n == null) {
                        ?? linkMovementMethod = new LinkMovementMethod();
                        U9N.A00 = linkMovementMethod;
                        u9n2 = linkMovementMethod;
                    }
                    A0N.setMovementMethod(u9n2);
                    C35241Fga.A02(EnumC33507Erg.BIZ_EDIT_NAME, AbstractC166987dD.A0r(interfaceC09390do), "reminder_shown");
                    return;
                }
                throw AbstractC166987dD.A14(AbstractC111324zv.A00(54));
            }
            throw AbstractC166987dD.A14(AbstractC111324zv.A00(54));
        }
    }

    public static final void A00(C32281EJs c32281EJs) {
        if (c32281EJs.A0B) {
            IgFormField igFormField = c32281EJs.A02;
            if (igFormField != null) {
                igFormField.getMEditText().setFocusable(false);
            }
            IgFormField igFormField2 = c32281EJs.A02;
            if (igFormField2 != null) {
                igFormField2.getMEditText().setEnabled(false);
            }
            ActionButton actionButton = c32281EJs.A00;
            if (actionButton != null) {
                actionButton.setEnabled(false);
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    public static final void A01(C32281EJs c32281EJs) {
        C193328hC A0O;
        String A0p;
        DialogInterface.OnClickListener onClickListener;
        AnonymousClass435 anonymousClass435;
        Object obj;
        if (c32281EJs.getActivity() != null) {
            InterfaceC09390do interfaceC09390do = c32281EJs.A0G;
            FRl A00 = FA7.A00(AbstractC166987dD.A0r(interfaceC09390do));
            EnumC33422Ept enumC33422Ept = EnumC33422Ept.A06;
            A00.A00(enumC33422Ept, C05F.A01);
            FA7.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00(enumC33422Ept, C05F.A0C);
            C155506yf c155506yf = c32281EJs.A04;
            CharSequence charSequence = null;
            if (c155506yf != null) {
                c155506yf.A09("name_change_confirmed", false);
            }
            AbstractC13880nE.A0O(AbstractC31178DnM.A0B(c32281EJs));
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            Integer num = C05F.A0Y;
            if (!AbstractC166987dD.A0x(A0r).getBoolean(AbstractC111324zv.A00(2414), false) && (anonymousClass435 = AbstractC70201WGq.A00) != null && (obj = anonymousClass435.A01) != null && ((InterfaceC72042XIv) obj).B9J() != null && ((InterfaceC72042XIv) AbstractC70201WGq.A00.A01).B9J().BW6() != null) {
                VTK.A00(c32281EJs.getContext(), new DialogInterfaceOnClickListenerC35338FiF(c32281EJs, AbstractC166987dD.A0r(interfaceC09390do), num), AbstractC166987dD.A0r(interfaceC09390do), new C36491G7p(c32281EJs), num);
                return;
            }
            if (c32281EJs.A0D) {
                A0O = AbstractC31175DnJ.A0O(c32281EJs);
                String str = c32281EJs.A06;
                if (str == null || str.length() == 0) {
                    str = c32281EJs.requireContext().getString(2131953191);
                }
                A0O.A0r(str);
                A0O.A0e(DialogInterfaceOnClickListenerC35454FkB.A00(c32281EJs, 42), AbstractC166997dE.A0p(c32281EJs.requireContext(), 2131968948));
                A0p = AbstractC166997dE.A0p(c32281EJs.requireContext(), 2131954754);
                onClickListener = DialogInterfaceOnClickListenerC35431Fjo.A00;
            } else {
                IgFormField igFormField = c32281EJs.A02;
                if (igFormField != null) {
                    charSequence = igFormField.getText();
                }
                String valueOf = String.valueOf(charSequence);
                if (!C14360o3.A0K(c32281EJs.A09, valueOf)) {
                    A0O = AbstractC31175DnJ.A0O(c32281EJs);
                    A0O.A05 = AbstractC167007dF.A0f(c32281EJs.requireContext(), valueOf, 2131970216);
                    AbstractC31173DnH.A16(c32281EJs.requireContext(), A0O, 2131970215);
                    A0O.A0Z(DialogInterfaceOnClickListenerC35454FkB.A00(c32281EJs, 43), EnumC193348hE.A02, AbstractC166997dE.A0p(c32281EJs.requireContext(), 2131968153), true);
                    A0p = AbstractC166997dE.A0p(c32281EJs.requireContext(), 2131954754);
                    onClickListener = DialogInterfaceOnClickListenerC35432Fjp.A00;
                } else {
                    A02(c32281EJs);
                    return;
                }
            }
            A0O.A0c(onClickListener, A0p);
            AbstractC31178DnM.A1R(A0O, true);
        }
    }

    public static final void A02(C32281EJs c32281EJs) {
        CharSequence charSequence;
        C1ON A07;
        int i;
        CharSequence charSequence2;
        if (c32281EJs.getActivity() != null) {
            if (!c32281EJs.A0F) {
                C56352iT.A0t.A03(c32281EJs.requireActivity()).setIsLoading(true);
                AbstractC12990ll A0o = AbstractC166987dD.A0o(c32281EJs.A0G);
                IgFormField igFormField = c32281EJs.A02;
                if (igFormField != null) {
                    charSequence2 = igFormField.getText();
                } else {
                    charSequence2 = null;
                }
                String valueOf = String.valueOf(charSequence2);
                AbstractC25230BEn.A15(1, A0o, valueOf);
                C25621Ms A0c = AbstractC167017dG.A0c(A0o);
                A0c.A0B("accounts/update_profile_name/");
                A0c.A9s("first_name", valueOf);
                A07 = AbstractC25227BEk.A0e(A0c, C32185ECg.class, C34864FXz.class);
                i = 10;
            } else {
                C34649FOh c34649FOh = c32281EJs.A03;
                if (c34649FOh == null) {
                    if (c32281EJs.A0A) {
                        return;
                    }
                    A07 = AbstractC152476ta.A06(AbstractC166987dD.A0r(c32281EJs.A0G));
                    i = 9;
                } else {
                    IgFormField igFormField2 = c32281EJs.A02;
                    if (igFormField2 != null) {
                        charSequence = igFormField2.getText();
                    } else {
                        charSequence = null;
                    }
                    c34649FOh.A0F = String.valueOf(charSequence);
                    UserSession A0r = AbstractC166987dD.A0r(c32281EJs.A0G);
                    C34649FOh c34649FOh2 = c32281EJs.A03;
                    if (c34649FOh2 != null) {
                        A07 = AbstractC152476ta.A07(A0r, c34649FOh2, AbstractC31173DnH.A0l(c32281EJs), false);
                        i = 11;
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            }
            C31702Dw7.A00(c32281EJs, A07, i);
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C35197Ffp A00 = C35197Ffp.A00(interfaceC56362iU);
        C35197Ffp.A02(AbstractC166997dE.A0N(this), A00, 2131968148);
        this.A00 = C31722DwR.A00(ViewOnClickListenerC31723DwS.A00(this, 18), interfaceC56362iU, A00);
        if (this.A0F && this.A03 == null) {
            interfaceC56362iU.setIsLoading(this.A0A);
            ActionButton actionButton = this.A00;
            if (actionButton != null) {
                actionButton.setBackground(null);
                actionButton.setButtonResource(R.drawable.instagram_arrow_cw_pano_outline_24);
                actionButton.setVisibility(8);
            }
        } else {
            interfaceC56362iU.setIsLoading(this.A0C);
        }
        A00(this);
        AbstractC31176DnK.A1C(ViewOnClickListenerC31723DwS.A00(this, 19), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1430170076);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0G;
        FA7.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02(EnumC33422Ept.A06, C05F.A00);
        C155506yf A00 = AbstractC155496ye.A00(AbstractC166987dD.A0r(interfaceC09390do));
        this.A04 = A00;
        if (A00 != null) {
            A00.A06("edit_full_name");
        }
        EVO.A00(this);
        this.A0F = AbstractC25229BEm.A1Z(requireArguments().getString("full_name"));
        this.A09 = requireArguments().getString("full_name");
        this.A0B = requireArguments().getBoolean("is_pending_review");
        this.A07 = requireArguments().getString("disclaimer_text");
        this.A0D = requireArguments().getBoolean(AbstractC111324zv.A00(1265));
        this.A06 = requireArguments().getString("confirmation_dialog_text");
        this.A08 = AbstractC31180DnO.A0b(this);
        this.A05 = (User) requireArguments().getParcelable("display_user");
        if (this.A0F && !this.A0A) {
            C31702Dw7.A00(this, AbstractC152476ta.A06(AbstractC166987dD.A0r(interfaceC09390do)), 9);
        }
        C0f9.A09(473345416, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1921330035);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_fullname, viewGroup, false);
        C0f9.A09(-298476806, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1303716940);
        super.onDestroy();
        FA7.A00(AbstractC166987dD.A0r(this.A0G)).A03(EnumC33422Ept.A06, "edit_fullname_cancel");
        C0f9.A09(1790202114, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-62403955);
        super.onDestroyView();
        this.A0E = null;
        C0f9.A09(-208722193, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1229263897);
        super.onPause();
        AbstractC13880nE.A0O(AbstractC31178DnM.A0B(this));
        C0f9.A09(499880370, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(502197784);
        super.onResume();
        if (!this.A0B) {
            IgFormField igFormField = this.A02;
            if (igFormField != null) {
                igFormField.requestFocus();
            }
            IgFormField igFormField2 = this.A02;
            if (igFormField2 != null) {
                AbstractC13880nE.A0N(igFormField2);
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(-119210856, A02);
                throw A0g;
            }
        }
        C0f9.A09(-1743939914, A02);
    }
}
