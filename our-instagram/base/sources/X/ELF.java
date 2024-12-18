package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class ELF extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BusinessInboxCustomerDetailsFragment";
    public View A00;
    public IgEditText A01;
    public IgEditText A02;
    public IgEditText A03;
    public IgEditText A04;
    public C31812DyW A05;
    public Integer A07;
    public View A09;
    public IgTextView A0A;
    public IgTextView A0B;
    public IgTextView A0C;
    public IgTextView A0D;
    public IgTextView A0E;
    public Integer A06 = C05F.A0Y;
    public String A08 = "";
    public final TextWatcher A0G = new C35469Fl4(this, 15);
    public final InterfaceC09390do A0F = AbstractC60492pY.A02(this);
    public final String A0H = "business_inbox_customer_details_fragment";

    public static final void A00(IgEditText igEditText, ELF elf, CharSequence charSequence) {
        Editable text;
        ClipboardManager clipboardManager;
        if (igEditText != null && (text = igEditText.getText()) != null && text.length() != 0) {
            Object A0X = AbstractC31171DnF.A0X(elf.requireContext());
            if (A0X instanceof ClipboardManager) {
                clipboardManager = (ClipboardManager) A0X;
            } else {
                clipboardManager = null;
            }
            ClipData newPlainText = ClipData.newPlainText(charSequence, igEditText.getText());
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(newPlainText);
            }
            if (Build.VERSION.SDK_INT <= 32) {
                A02(elf, R.drawable.instagram_circle_check_pano_outline_24, 2131959671);
            }
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C3LO A0I;
        int i;
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.setTitle(requireContext().getString(2131959667));
        IgTextView igTextView = this.A0A;
        if (igTextView != null) {
            int intValue = this.A06.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                throw B4Z.A00();
                            }
                            return;
                        }
                        AbstractC166987dD.A1P(requireContext(), igTextView, 2131959666);
                        igTextView.setTextColor(AbstractC31181DnP.A02(this));
                        ViewOnClickListenerC35680FpF.A00(igTextView, 67, this);
                        C3LO A0B = AbstractC31171DnF.A0B();
                        A0B.A0I = this.A09;
                        AbstractC31175DnJ.A1G(A0B, interfaceC56362iU);
                        A0I = AbstractC31176DnK.A0I();
                        i = 68;
                    } else {
                        AbstractC166987dD.A1P(requireContext(), igTextView, 2131959666);
                        AbstractC166987dD.A1O(requireContext(), igTextView, AbstractC53242c7.A0H(getContext(), R.attr.igds_color_primary_text_disabled));
                        C3LO A0B2 = AbstractC31171DnF.A0B();
                        A0B2.A0I = this.A09;
                        AbstractC31175DnJ.A1G(A0B2, interfaceC56362iU);
                        A0I = AbstractC31176DnK.A0I();
                        i = 66;
                    }
                    AbstractC31176DnK.A1C(new ViewOnClickListenerC35680FpF(this, i), A0I, interfaceC56362iU);
                    return;
                }
                A04(this, true);
                AbstractC166987dD.A1P(requireContext(), igTextView, 2131959665);
                AbstractC166987dD.A1O(requireContext(), igTextView, AbstractC31173DnH.A04(this));
                ViewOnClickListenerC35680FpF.A00(igTextView, 65, this);
            } else {
                A04(this, true);
                AbstractC166987dD.A1P(requireContext(), igTextView, 2131959665);
                AbstractC166987dD.A1O(requireContext(), igTextView, AbstractC31173DnH.A04(this));
            }
            C3LO A0B3 = AbstractC31171DnF.A0B();
            A0B3.A0I = this.A09;
            AbstractC31175DnJ.A1G(A0B3, interfaceC56362iU);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C31812DyW c31812DyW = this.A05;
        IgTextView igTextView = null;
        if (c31812DyW == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        C141796aw A00 = AbstractC141776au.A00(c31812DyW);
        GSR gsr = new GSR(c31812DyW, null, 35);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, gsr, A00);
        this.A00 = view;
        Window A0H = AbstractC31174DnI.A0H(this);
        if (A0H != null) {
            A0H.setSoftInputMode(20);
        }
        this.A01 = (IgEditText) view.requireViewById(R.id.business_inbox_customer_details_address);
        this.A0B = AbstractC31172DnG.A0X(view, R.id.business_inbox_customer_details_address_title);
        this.A04 = (IgEditText) view.requireViewById(R.id.business_inbox_customer_details_phone);
        this.A0E = AbstractC31172DnG.A0X(view, R.id.business_inbox_customer_details_phone_title);
        this.A02 = (IgEditText) view.requireViewById(R.id.business_inbox_customer_details_email);
        this.A0C = AbstractC31172DnG.A0X(view, R.id.business_inbox_customer_details_email_title);
        this.A03 = (IgEditText) view.requireViewById(R.id.business_inbox_customer_details_note);
        this.A0D = AbstractC31172DnG.A0X(view, R.id.business_inbox_customer_details_note_title);
        View view2 = this.A09;
        if (view2 != null) {
            igTextView = AbstractC31172DnG.A0X(view2, R.id.customer_details_action_bar_action_text);
        }
        this.A0A = igTextView;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, new MCM(view, viewLifecycleOwner, c07s, this, null, 25), C07Y.A00(viewLifecycleOwner));
        AbstractC23641Du.A05(anonymousClass191, new MCI(A0K, c07s, this, null, 23), C07Y.A00(A0K));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r1 == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r1 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r1 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.ELF r4) {
        /*
            com.instagram.common.ui.base.IgTextView r2 = r4.A0B
            r3 = 4
            if (r2 == 0) goto L1a
            com.instagram.common.ui.base.IgEditText r0 = r4.A01
            if (r0 == 0) goto L16
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L16
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L17
        L16:
            r0 = 4
        L17:
            r2.setVisibility(r0)
        L1a:
            com.instagram.common.ui.base.IgTextView r2 = r4.A0C
            if (r2 == 0) goto L33
            com.instagram.common.ui.base.IgEditText r0 = r4.A02
            if (r0 == 0) goto L2f
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L2f
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L30
        L2f:
            r0 = 4
        L30:
            r2.setVisibility(r0)
        L33:
            com.instagram.common.ui.base.IgTextView r2 = r4.A0E
            if (r2 == 0) goto L4c
            com.instagram.common.ui.base.IgEditText r0 = r4.A04
            if (r0 == 0) goto L48
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L48
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L49
        L48:
            r0 = 4
        L49:
            r2.setVisibility(r0)
        L4c:
            com.instagram.common.ui.base.IgTextView r1 = r4.A0D
            if (r1 == 0) goto L64
            com.instagram.common.ui.base.IgEditText r0 = r4.A03
            if (r0 == 0) goto L61
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L61
            int r0 = r0.length()
            if (r0 == 0) goto L61
            r3 = 0
        L61:
            r1.setVisibility(r3)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELF.A01(X.ELF):void");
    }

    public static final void A02(ELF elf, int i, int i2) {
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC25226BEj.A1N(elf.requireContext(), A0K, i2);
        A0K.A04 = elf.requireActivity().getDrawable(i);
        A0K.A02();
        A0K.A06();
        AbstractC31178DnM.A1N(c41451vu, A0K);
    }

    public static final void A03(ELF elf, String str, String str2, String str3, String str4) {
        IgEditText igEditText = elf.A01;
        if (igEditText != null) {
            if (str == null) {
                str = "";
            }
            igEditText.setText(str);
        }
        IgEditText igEditText2 = elf.A01;
        if (igEditText2 != null) {
            igEditText2.addTextChangedListener(elf.A0G);
        }
        IgEditText igEditText3 = elf.A02;
        if (igEditText3 != null) {
            if (str3 == null) {
                str3 = "";
            }
            igEditText3.setText(str3);
        }
        IgEditText igEditText4 = elf.A02;
        if (igEditText4 != null) {
            igEditText4.addTextChangedListener(elf.A0G);
        }
        IgEditText igEditText5 = elf.A04;
        if (igEditText5 != null) {
            if (str2 == null) {
                str2 = "";
            }
            igEditText5.setText(str2);
        }
        IgEditText igEditText6 = elf.A04;
        if (igEditText6 != null) {
            igEditText6.addTextChangedListener(elf.A0G);
        }
        IgEditText igEditText7 = elf.A03;
        if (igEditText7 != null) {
            if (str4 == null) {
                str4 = "";
            }
            igEditText7.setText(str4);
        }
        IgEditText igEditText8 = elf.A03;
        if (igEditText8 != null) {
            igEditText8.addTextChangedListener(elf.A0G);
        }
        IgEditText igEditText9 = elf.A03;
        if (igEditText9 != null) {
            InterfaceC09390do interfaceC09390do = elf.A0F;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C14360o3.A0B(A0r, 0);
            int A07 = AbstractC25225BEi.A07(C06090Tz.A06, A0r, 36606126523028852L);
            if (A07 <= 0) {
                A07 = DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD;
            }
            igEditText9.setFilters(new C35467Fl2[]{new C35467Fl2(AbstractC166987dD.A0r(interfaceC09390do), elf.A08, A07)});
        }
    }

    public static final void A04(ELF elf, boolean z) {
        ViewOnClickListenerC35666Fp0 viewOnClickListenerC35666Fp0;
        IgEditText igEditText;
        IgEditText igEditText2 = elf.A01;
        if (z) {
            if (igEditText2 != null) {
                igEditText2.setFocusable(false);
            }
            IgEditText igEditText3 = elf.A01;
            if (igEditText3 != null) {
                ViewOnClickListenerC35680FpF.A00(igEditText3, 69, elf);
            }
            IgEditText igEditText4 = elf.A04;
            if (igEditText4 != null) {
                igEditText4.setFocusable(false);
            }
            IgEditText igEditText5 = elf.A04;
            if (igEditText5 != null) {
                ViewOnClickListenerC35680FpF.A00(igEditText5, 70, elf);
            }
            IgEditText igEditText6 = elf.A02;
            if (igEditText6 != null) {
                igEditText6.setFocusable(false);
            }
            IgEditText igEditText7 = elf.A02;
            if (igEditText7 != null) {
                ViewOnClickListenerC35666Fp0.A00(igEditText7, 0, elf);
            }
            IgEditText igEditText8 = elf.A03;
            if (igEditText8 != null) {
                igEditText8.setFocusable(false);
            }
            igEditText = elf.A03;
            if (igEditText != null) {
                viewOnClickListenerC35666Fp0 = new ViewOnClickListenerC35666Fp0(elf, 1);
            } else {
                return;
            }
        } else {
            if (igEditText2 != null) {
                igEditText2.setFocusableInTouchMode(true);
            }
            IgEditText igEditText9 = elf.A04;
            if (igEditText9 != null) {
                igEditText9.setFocusableInTouchMode(true);
            }
            IgEditText igEditText10 = elf.A02;
            if (igEditText10 != null) {
                igEditText10.setFocusableInTouchMode(true);
            }
            IgEditText igEditText11 = elf.A03;
            if (igEditText11 != null) {
                igEditText11.setFocusableInTouchMode(true);
            }
            IgEditText igEditText12 = elf.A01;
            viewOnClickListenerC35666Fp0 = null;
            if (igEditText12 != null) {
                igEditText12.setOnClickListener(null);
            }
            IgEditText igEditText13 = elf.A04;
            if (igEditText13 != null) {
                igEditText13.setOnClickListener(null);
            }
            IgEditText igEditText14 = elf.A02;
            if (igEditText14 != null) {
                igEditText14.setOnClickListener(null);
            }
            igEditText = elf.A03;
            if (igEditText == null) {
                return;
            }
        }
        C0fQ.A00(viewOnClickListenerC35666Fp0, igEditText);
    }

    public final UserSession A05() {
        return AbstractC166987dD.A0r(this.A0F);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0F);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        View view = this.A00;
        if (view != null) {
            AbstractC13880nE.A0O(view);
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0H;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(724713787);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.A09 = AbstractC25227BEk.A0C(layoutInflater, R.layout.direct_inbox_user_details_action_bar);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_user_details, false);
        C0f9.A09(-1427063443, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1643520263);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A04 = null;
        this.A03 = null;
        this.A0B = null;
        this.A0C = null;
        this.A0E = null;
        this.A0D = null;
        this.A09 = null;
        this.A0A = null;
        C0f9.A09(-218753977, A02);
    }
}
