package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.listcell.ListCell;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes11.dex */
public final class UEy extends Fragment {
    public ContextThemeWrapper A00;
    public TextView A01;
    public PuxTermsConditionItem A02;
    public UFX A03;
    public ListCell A04;
    public ListCell A05;
    public ListCell A06;
    public ListCell A07;
    public int A08 = 1;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        Parcelable parcelable = requireArguments().getParcelable("logging_context");
        C14360o3.A0C(parcelable, "null cannot be cast to non-null type com.facebookpay.logging.LoggingContext");
        this.A03 = AbstractC69842VwS.A01(this, null, (LoggingContext) parcelable);
        if (getActivity() != null) {
            view.requireViewById(R.id.terms_scroll_view);
            TextView textView = (TextView) view.requireViewById(R.id.sheet_body_text);
            C14360o3.A0A(textView);
            WF7.A02(textView, VEP.A0p);
            AbstractC70177WFc.A05(textView, R.style.FBPayUITerms_Sheet, false);
            this.A01 = textView;
            ListCell listCell = (ListCell) view.requireViewById(R.id.terms_link);
            C14360o3.A0A(listCell);
            A01(listCell);
            this.A07 = listCell;
            ListCell listCell2 = (ListCell) view.requireViewById(R.id.policy_link);
            C14360o3.A0A(listCell2);
            A01(listCell2);
            this.A05 = listCell2;
            ListCell listCell3 = (ListCell) view.requireViewById(R.id.support_link);
            C14360o3.A0A(listCell3);
            A01(listCell3);
            this.A06 = listCell3;
            ListCell listCell4 = (ListCell) view.requireViewById(R.id.additional_link);
            C14360o3.A0A(listCell4);
            A01(listCell4);
            this.A04 = listCell4;
        }
        int i = this.A08;
        if (i == 0 || i == 8) {
            Fragment fragment = this.mParentFragment;
            C14360o3.A0C(fragment, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            ((C67752UxP) fragment).A0H();
        }
    }

    private final void A00(R0Z r0z, ListCell listCell) {
        if (r0z != null) {
            listCell.setPrimaryText(r0z.getOptionalStringField(0, "text"));
            ImmutableList A0E = r0z.A0E();
            C14360o3.A07(A0E);
            C0fQ.A00(new WMS((String) W6V.A00(A0E).get(0), this, 1), listCell);
            AbstractC69838VwO.A01(listCell, C05F.A01, null);
            return;
        }
        listCell.setVisibility(8);
    }

    public static final void A01(ListCell listCell) {
        listCell.setPrimaryTextStyle(VEP.A0o);
        UBV ubv = new UBV(AbstractC166997dE.A0L(listCell));
        ubv.setIcon(VET.A0e);
        listCell.setRightAddOnIcon(ubv);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CheckoutConfiguration checkoutConfiguration;
        int A02 = C0f9.A02(1337189204);
        super.onCreate(bundle);
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) requireArguments().getParcelable("ECP_LAUNCH_PARAMS");
        if (eCPPaymentRequest != null && (checkoutConfiguration = eCPPaymentRequest.A01) != null) {
            this.A08 = checkoutConfiguration.A00;
        }
        C0f9.A09(-1104134292, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(419946044);
        C14360o3.A0B(layoutInflater, 0);
        Context requireContext = requireContext();
        C2FP.A0A();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireContext, R.style.FBPayUIWidget);
        this.A00 = contextThemeWrapper;
        View inflate = layoutInflater.cloneInContext(contextThemeWrapper).inflate(R.layout.ecp_terms_condition_content_fragment, viewGroup, false);
        C0f9.A09(365068557, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        PuxTermsConditionItem puxTermsConditionItem;
        String str;
        String str2;
        int A02 = C0f9.A02(-1225017767);
        super.onResume();
        UFX ufx = this.A03;
        if (ufx == null) {
            str = "ecpViewModel";
        } else {
            C63406Sjd c63406Sjd = (C63406Sjd) ufx.A0z.A02();
            if (c63406Sjd == null || (puxTermsConditionItem = (PuxTermsConditionItem) c63406Sjd.A01) == null || c63406Sjd.A00 == EnumC68120VCd.ERROR) {
                puxTermsConditionItem = new PuxTermsConditionItem(null, null, null, null, VG3.A0m, null, null, null, null, false);
            }
            this.A02 = puxTermsConditionItem;
            String str3 = puxTermsConditionItem.A06;
            if (str3 != null) {
                ContextThemeWrapper contextThemeWrapper = this.A00;
                if (contextThemeWrapper == null) {
                    str2 = "viewContext";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                AbstractC68346VNg.A00(contextThemeWrapper, this, VEY.A0G, str3, null, X4D.A00, X4E.A00, false, false);
            }
            PuxTermsConditionItem puxTermsConditionItem2 = this.A02;
            String str4 = "termsCondition";
            if (puxTermsConditionItem2 != null) {
                List list = puxTermsConditionItem2.A07;
                if (list != null) {
                    TextView textView = this.A01;
                    if (textView == null) {
                        str = "sheetBodyTextView";
                    } else {
                        textView.setText(AbstractC31175DnJ.A0a("\n\n", list));
                    }
                }
                ListCell listCell = this.A07;
                if (listCell == null) {
                    str4 = "termsListCell";
                } else {
                    PuxTermsConditionItem puxTermsConditionItem3 = this.A02;
                    if (puxTermsConditionItem3 != null) {
                        A00(puxTermsConditionItem3.A02, listCell);
                        ListCell listCell2 = this.A05;
                        if (listCell2 == null) {
                            str4 = "policyListCell";
                        } else {
                            PuxTermsConditionItem puxTermsConditionItem4 = this.A02;
                            if (puxTermsConditionItem4 != null) {
                                A00(puxTermsConditionItem4.A03, listCell2);
                                PuxTermsConditionItem puxTermsConditionItem5 = this.A02;
                                if (puxTermsConditionItem5 != null) {
                                    List list2 = puxTermsConditionItem5.A08;
                                    if (list2 != null) {
                                        int size = list2.size();
                                        str = "additionalListCell";
                                        str2 = "supportListCell";
                                        if (size != 1) {
                                            if (size == 2) {
                                                ListCell listCell3 = this.A06;
                                                if (listCell3 != null) {
                                                    A00((R0Z) list2.get(0), listCell3);
                                                    ListCell listCell4 = this.A04;
                                                    if (listCell4 != null) {
                                                        A00((R0Z) list2.get(1), listCell4);
                                                    }
                                                }
                                                C14360o3.A0F(str2);
                                            }
                                        } else {
                                            ListCell listCell5 = this.A06;
                                            if (listCell5 != null) {
                                                A00((R0Z) list2.get(0), listCell5);
                                                ListCell listCell6 = this.A04;
                                                if (listCell6 != null) {
                                                    listCell6.setVisibility(8);
                                                }
                                            }
                                            C14360o3.A0F(str2);
                                        }
                                        throw C00O.createAndThrow();
                                    }
                                    C0f9.A09(1768747827, A02);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str4);
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
