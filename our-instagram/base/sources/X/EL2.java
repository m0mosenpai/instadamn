package X;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.nux.cal.model.ContentText;
import com.instagram.nux.cal.model.SignupContent;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EL2 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SignupContentFragment";
    public Toast A00;
    public Toast A01;
    public AbstractC18680vv A02;
    public AbstractC34680FPp A03;
    public FH2 A04;
    public EnumC33359Eos A05;
    public EnumC33360Eot A06;
    public SignupContent A07;
    public Integer A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C = false;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "signup_content";
    }

    private void A00(IgTextView igTextView, String str) {
        String url;
        if (str == null) {
            str = "";
        }
        igTextView.setText(Html.fromHtml(str));
        CharSequence text = igTextView.getText();
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(text);
        for (ClickableSpan clickableSpan : (ClickableSpan[]) A0H.getSpans(0, text.length(), ClickableSpan.class)) {
            if ((clickableSpan instanceof URLSpan) && (url = ((URLSpan) clickableSpan).getURL()) != null) {
                int spanStart = A0H.getSpanStart(clickableSpan);
                int spanEnd = A0H.getSpanEnd(clickableSpan);
                A0H.removeSpan(clickableSpan);
                A0H.setSpan(new C31749Dx2(url, this, 3), spanStart, spanEnd, 33);
            }
        }
        AbstractC31176DnK.A1G(igTextView, A0H);
    }

    public final EnumC31713DwI A01() {
        int ordinal = this.A06.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            return EnumC31713DwI.A0z;
                        }
                        return EnumC31713DwI.A14;
                    }
                    return EnumC31713DwI.A0S;
                }
                return EnumC31713DwI.A0L;
            }
            return EnumC31713DwI.A0O;
        }
        return EnumC31713DwI.A0Q;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        EnumC33359Eos enumC33359Eos = this.A05;
        EnumC33359Eos enumC33359Eos2 = EnumC33359Eos.A02;
        boolean z = true;
        interfaceC56362iU.EkF(AbstractC167007dF.A1X(enumC33359Eos, enumC33359Eos2));
        if (this.A05 != enumC33359Eos2) {
            z = false;
        }
        interfaceC56362iU.EkS(z);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC12990ll abstractC12990ll;
        String str;
        String str2;
        AbstractC34680FPp abstractC34680FPp = this.A03;
        boolean z = this.A0C;
        if (abstractC34680FPp instanceof Egd) {
            Egd egd = (Egd) abstractC34680FPp;
            if (egd instanceof Egc) {
                if (z) {
                    AbstractC12990ll abstractC12990ll2 = egd.A00;
                    String obj = EnumC33360Eot.A05.toString();
                    AbstractC167017dG.A1N(abstractC12990ll2, obj);
                    C35191Ffj.A00(abstractC12990ll2, "disclosures_screen_navigate_back", obj);
                }
                abstractC12990ll = egd.A00;
                str = egd.A02;
                AbstractC167017dG.A1N(abstractC12990ll, str);
                str2 = "disclosures_v2_screen_pt1_navigate_back";
                C35191Ffj.A00(abstractC12990ll, str2, str);
            }
        } else if (!(abstractC34680FPp instanceof Egb) && z) {
            abstractC12990ll = abstractC34680FPp.A00;
            str = abstractC34680FPp.A02;
            AbstractC167017dG.A1N(abstractC12990ll, str);
            str2 = "disclosures_screen_navigate_back";
            C35191Ffj.A00(abstractC12990ll, str2, str);
        }
        EnumC33360Eot enumC33360Eot = this.A06;
        if (enumC33360Eot != null && enumC33360Eot != EnumC33360Eot.A05) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC31176DnK.A0R(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x005f, code lost:
    
        if (r3 != X.EnumC33360Eot.A05) goto L6;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = -695564064(0xffffffffd68a88e0, float:-7.616024E13)
            int r4 = X.C0f9.A02(r0)
            super.onCreate(r6)
            X.0vv r0 = X.AbstractC31176DnK.A0R(r5)
            r5.A02 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_content"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            r0.getClass()
            com.instagram.nux.cal.model.SignupContent r0 = (com.instagram.nux.cal.model.SignupContent) r0
            r5.A07 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_flow"
            java.lang.String r0 = X.AbstractC31173DnH.A0j(r1, r0)
            java.lang.Integer r0 = X.AbstractC34254F9a.A00(r0)
            r5.A08 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_entry_point"
            java.io.Serializable r0 = r1.getSerializable(r0)
            X.Eot r0 = (X.EnumC33360Eot) r0
            r5.A06 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_selected_age_account_id"
            java.lang.String r0 = r1.getString(r0)
            r5.A09 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_selected_age_account_type"
            java.lang.String r0 = r1.getString(r0)
            r5.A0A = r0
            X.Eot r3 = r5.A06
            r2 = 0
            if (r3 == 0) goto L61
            X.Eot r1 = X.EnumC33360Eot.A05
            r0 = 1
            if (r3 == r1) goto L62
        L61:
            r0 = 0
        L62:
            r5.A0C = r0
            android.os.Bundle r0 = r5.requireArguments()
            java.lang.String r1 = "argument_disclosure_version"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L8f
            android.os.Bundle r0 = r5.requireArguments()
            java.lang.Object r0 = r0.get(r1)
            X.Eos r0 = (X.EnumC33359Eos) r0
        L7a:
            r5.A05 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_force_disclosure_reading"
            boolean r0 = r1.getBoolean(r0, r2)
            r5.A0B = r0
            r0 = 449957256(0x1ad1cd88, float:8.677243E-23)
            X.C0f9.A09(r0, r4)
            return
        L8f:
            X.Eos r0 = X.EnumC33359Eos.A04
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EL2.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String obj;
        AbstractC34680FPp abstractC34680FPp;
        AbstractC12990ll abstractC12990ll;
        String str;
        String str2;
        int A02 = C0f9.A02(430423270);
        View inflate = layoutInflater.inflate(R.layout.signup_content, viewGroup, false);
        AbstractC31175DnJ.A09(inflate, R.id.contentTitle).setText(this.A07.A02);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        AppCompatActivity appCompatActivity = (AppCompatActivity) requireActivity();
        appCompatActivity.setSupportActionBar(toolbar);
        VKK supportActionBar = appCompatActivity.getSupportActionBar();
        supportActionBar.getClass();
        if (this.A08 == C05F.A00) {
            supportActionBar.A0D(false);
            supportActionBar.A07();
        }
        supportActionBar.A08();
        supportActionBar.A09();
        AbstractC18680vv abstractC18680vv = this.A02;
        String str3 = A01().A01;
        AbstractC167017dG.A1N(abstractC18680vv, str3);
        C35203Ffv.A01(abstractC18680vv, str3);
        FH2 fh2 = new FH2(this.A05, this.A07.A07);
        this.A04 = fh2;
        AbstractC18680vv abstractC18680vv2 = this.A02;
        EnumC33359Eos enumC33359Eos = EnumC33359Eos.A04;
        EnumC33360Eot enumC33360Eot = this.A06;
        if (enumC33360Eot == null) {
            obj = "";
        } else {
            obj = enumC33360Eot.toString();
        }
        EnumC33359Eos enumC33359Eos2 = this.A05;
        boolean z = this.A0B;
        if (enumC33359Eos2 == enumC33359Eos) {
            if (!z) {
                abstractC34680FPp = new AbstractC34680FPp(abstractC18680vv2, fh2, obj);
            }
            abstractC34680FPp = new AbstractC34680FPp(abstractC18680vv2, fh2, obj);
        } else {
            if (enumC33359Eos2 != EnumC33359Eos.A05 && enumC33359Eos2 != EnumC33359Eos.A06) {
                if (enumC33359Eos2 == EnumC33359Eos.A03) {
                    abstractC34680FPp = new AbstractC34680FPp(abstractC18680vv2, fh2, obj);
                } else {
                    abstractC34680FPp = new AbstractC34680FPp(abstractC18680vv2, fh2, obj);
                }
            }
            abstractC34680FPp = new AbstractC34680FPp(abstractC18680vv2, fh2, obj);
        }
        this.A03 = abstractC34680FPp;
        boolean z2 = this.A0C;
        if (abstractC34680FPp instanceof Egd) {
            abstractC12990ll = abstractC34680FPp.A00;
            str = abstractC34680FPp.A02;
            AbstractC167017dG.A1N(abstractC12990ll, str);
            str2 = "disclosures_v2_screen_pt1_shown";
        } else {
            boolean z3 = abstractC34680FPp instanceof Egb;
            abstractC12990ll = abstractC34680FPp.A00;
            if (z3) {
                str = abstractC34680FPp.A02;
                AbstractC167017dG.A1N(abstractC12990ll, str);
                str2 = "disclosures_v2_screen_shown";
            } else {
                if (z2) {
                    str = EnumC33360Eot.A05.toString();
                } else {
                    str = abstractC34680FPp.A02;
                }
                AbstractC167017dG.A1N(abstractC12990ll, str);
                str2 = "disclosures_screen_shown";
            }
        }
        C35191Ffj.A00(abstractC12990ll, str2, str);
        List<ContentText> list = ((C34564FKy) this.A04.A00.get(0)).A02;
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31173DnH.A0D(inflate, R.id.contentText);
        viewGroup2.removeAllViews();
        AbstractC31173DnH.A0D(inflate, R.id.page1).scrollTo(0, 0);
        for (ContentText contentText : list) {
            if (contentText != null) {
                Integer num = contentText.A01;
                num.getClass();
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            List list2 = contentText.A02;
                            if (list2 == null) {
                                list2 = AbstractC25225BEi.A17(0);
                            }
                            List unmodifiableList = Collections.unmodifiableList(list2);
                            unmodifiableList.getClass();
                            Iterator it = unmodifiableList.iterator();
                            while (it.hasNext()) {
                                String A1B = AbstractC166987dD.A1B(it);
                                View inflate2 = layoutInflater.inflate(R.layout.bulleted_list_item_layout, viewGroup2, false);
                                A00((IgTextView) AbstractC31173DnH.A0D(inflate2, R.id.listItemText), A1B);
                                viewGroup2.addView(inflate2);
                            }
                        }
                    } else {
                        List list3 = contentText.A02;
                        if (list3 == null) {
                            list3 = AbstractC25225BEi.A17(0);
                        }
                        List unmodifiableList2 = Collections.unmodifiableList(list3);
                        unmodifiableList2.getClass();
                        Iterator it2 = unmodifiableList2.iterator();
                        while (it2.hasNext()) {
                            String A1B2 = AbstractC166987dD.A1B(it2);
                            IgTextView igTextView = (IgTextView) layoutInflater.inflate(R.layout.paragraph_layout, viewGroup2, false);
                            A00(igTextView, A1B2);
                            viewGroup2.addView(igTextView);
                        }
                    }
                } else {
                    List list4 = contentText.A02;
                    if (list4 == null) {
                        list4 = AbstractC25225BEi.A17(0);
                    }
                    List unmodifiableList3 = Collections.unmodifiableList(list4);
                    unmodifiableList3.getClass();
                    Iterator it3 = unmodifiableList3.iterator();
                    while (it3.hasNext()) {
                        String A1B3 = AbstractC166987dD.A1B(it3);
                        IgTextView igTextView2 = (IgTextView) layoutInflater.inflate(R.layout.paragraph_header_layout, viewGroup2, false);
                        A00(igTextView2, A1B3);
                        viewGroup2.addView(igTextView2);
                    }
                }
            }
        }
        View A0D = AbstractC31173DnH.A0D(inflate, R.id.page1);
        A0D.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserverOnScrollChangedListenerC35723Fpx(2, this, A0D));
        ProgressButton progressButton = (ProgressButton) AbstractC31173DnH.A0D(inflate, R.id.registrationButton);
        String str4 = this.A07.A00;
        if (str4 != null) {
            progressButton.setText(str4);
        }
        ViewOnClickListenerC35667Fp2.A00(progressButton, 27, this);
        TextView A09 = AbstractC31175DnJ.A09(inflate, R.id.cancelButton);
        A09.setText(this.A07.A01);
        ViewOnClickListenerC35667Fp2.A00(A09, 26, this);
        AbstractC31175DnJ.A09(inflate, R.id.step_label).setText(AbstractC166997dE.A0N(this).getString(2131960964, AbstractC25228BEl.A1Z(1, this.A04.A00.size())));
        this.A01 = C9GR.A02(requireContext(), this.A07.A05, null, 0);
        this.A00 = C9GR.A02(requireContext(), this.A07.A03, null, 0);
        AbstractC31173DnH.A0D(inflate, R.id.page1).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC35716Fpq(3, inflate, this));
        AbstractC31173DnH.A0D(inflate, R.id.cancelButton).setVisibility(0);
        C0f9.A09(-1771063198, A02);
        return inflate;
    }
}
