package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Collection;

/* renamed from: X.NZu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52837NZu extends AbstractC52184N7v implements InterfaceC60152ox {
    public static final String __redex_internal_original_name = "IgLiveQuestionViewerFragment";
    public View A00;
    public IgEditText A01;
    public IgdsButton A02;
    public IgdsButton A03;
    public String A04;
    public final C3I9 A07 = C3I7.A01(this, false, false);
    public final C55536OlV A05 = new C55536OlV(this, 3);
    public final NG3 A06 = new NG3(this, 4);

    public final void A0F(View view, View view2, IgEditText igEditText, IgdsButton igdsButton) {
        InterfaceC147786l3 interfaceC147786l3;
        C14360o3.A0B(view, 0);
        if (igdsButton != null) {
            igdsButton.setVisibility(0);
        }
        view.setVisibility(8);
        if (view2 != null) {
            view2.setVisibility(0);
        }
        if (igEditText != null) {
            igEditText.requestFocus();
            AbstractC13880nE.A0R(igEditText);
            C147896lL c147896lL = super.A03;
            if (c147896lL != null && (interfaceC147786l3 = c147896lL.A06) != null) {
                interfaceC147786l3.CiP();
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A0G(TextView textView) {
        String str;
        C14360o3.A0B(textView, 0);
        LinearLayout linearLayout = super.A00;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            updateUi(MXS.A04, C16930sl.A00);
            String A01 = A01(textView);
            C147896lL c147896lL = super.A03;
            if (c147896lL != null) {
                String str2 = super.A04;
                if (str2 != null) {
                    AbstractC166987dD.A1Z(new MBX(c147896lL, str2, A01, (InterfaceC23621Ds) null, 21), MSX.A0B(c147896lL, A01, 1));
                } else {
                    str = "broadcastId";
                }
            }
            AbstractC13880nE.A0O(textView);
            textView.setText("");
            textView.clearFocus();
            return;
        }
        str = "emptyStateContainer";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "live_question_sheet";
    }

    @Override // X.AbstractC52184N7v, X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C2GS c2gs;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        MSX.A17(this, this.A07);
        C147896lL c147896lL = super.A03;
        if (c147896lL != null && (c2gs = c147896lL.A01) != null) {
            AbstractC37301Gc2.A0w(getViewLifecycleOwner(), c2gs, C57755Pji.A02(this, 32), 34);
        }
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        Editable editable;
        View view = this.A00;
        IgEditText igEditText = this.A01;
        IgdsButton igdsButton = this.A03;
        if (i == 0) {
            if (igEditText != null) {
                editable = igEditText.getText();
            } else {
                editable = null;
            }
            if (String.valueOf(editable).length() == 0) {
                AbstractC167007dF.A0x(view);
                if (igdsButton != null) {
                    igdsButton.setVisibility(0);
                }
            }
        }
    }

    public static final String A01(TextView textView) {
        String obj = textView.getText().toString();
        int length = obj.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A19 = AbstractC167027dH.A19(obj, i2);
            if (!z) {
                if (!A19) {
                    z = true;
                } else {
                    i++;
                }
            } else {
                if (!A19) {
                    break;
                }
                length--;
            }
        }
        return AbstractC31177DnL.A0g(obj, length, i);
    }

    @Override // X.AbstractC52184N7v
    public final void A0D() {
        String str;
        super.A0D();
        View view = this.mView;
        if (view != null) {
            View requireViewById = view.requireViewById(R.id.question_empty_input);
            C14360o3.A0A(requireViewById);
            IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0R(view, R.id.question_sheet_empty_action_button);
            IgEditText igEditText = (IgEditText) requireViewById.requireViewById(R.id.question_input_edit_text);
            igEditText.setOnEditorActionListener(this.A05);
            igEditText.addTextChangedListener(this.A06);
            this.A01 = igEditText;
            this.A03 = igdsButton;
            igdsButton.setVisibility(0);
            C0fQ.A00(ViewOnClickListenerC55459OkE.A00(igdsButton, igEditText, this, 44), igdsButton);
            IgdsButton A0W = AbstractC31173DnH.A0W(requireViewById, R.id.question_input_submit_button);
            ViewOnClickListenerC55468OkN.A00(A0W, 46, igEditText, this);
            this.A02 = A0W;
            AbstractC31172DnG.A1J(requireViewById, R.id.question_input_bottom_divider, 0);
            this.A00 = requireViewById;
        }
        TextView textView = super.A02;
        if (textView != null) {
            Context requireContext = requireContext();
            String str2 = this.A04;
            str = "broadcaster";
            if (str2 != null) {
                AbstractC31177DnL.A0r(requireContext, textView, str2, 2131965480);
                TextView textView2 = super.A01;
                if (textView2 != null) {
                    Context requireContext2 = requireContext();
                    String str3 = this.A04;
                    if (str3 != null) {
                        AbstractC31177DnL.A0r(requireContext2, textView2, str3, 2131965478);
                        this.A07.A9e(this);
                        return;
                    }
                } else {
                    str = "emptyDescription";
                }
            }
        } else {
            str = "emptyTitle";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC52184N7v, X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC001800i.A0T(new V5L(this.A05, this.A07, this), super.getDefinitions());
    }

    @Override // X.AbstractC52184N7v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1638213457);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        setModuleNameV2("live_question_sheet");
        this.A04 = requireArguments.getString("IgLiveQuestionListFragment.ARGUMENTS_KEY_EXTRA_BROADCASTER_USERNAME", "broadcaster");
        C0f9.A09(2144344933, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1499051106);
        super.onDestroy();
        this.A07.onStop();
        C0f9.A09(2103437559, A02);
    }
}
