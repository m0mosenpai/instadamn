package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.EcpNuxLearnMoreScreenStyle;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.listcell.ListCell;
import com.fbpay.hub.common.link.LinkParams;
import java.util.ArrayList;

/* renamed from: X.Uwm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67720Uwm extends AbstractC66388UEw {
    public ContextThemeWrapper A00;
    public ECPPaymentRequest A01;
    public UFU A02;
    public LoggingContext A03;

    @Override // X.AbstractC66388UEw, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CharSequence A00;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            ImageView imageView = (ImageView) view.requireViewById(R.id.pay_logo);
            imageView.setImageDrawable(C2FP.A0A().A04(AbstractC166997dE.A0L(imageView), 39, 33));
            ContextThemeWrapper contextThemeWrapper = this.A00;
            if (contextThemeWrapper != null) {
                AbstractC166997dE.A18(contextThemeWrapper, imageView, 2131961307);
                TextView textView = (TextView) view.requireViewById(R.id.sheet_title_text);
                C14360o3.A0A(textView);
                WF7.A02(textView, VEP.A0b);
                ContextThemeWrapper contextThemeWrapper2 = this.A00;
                if (contextThemeWrapper2 != null) {
                    textView.setText(contextThemeWrapper2.getText(2131961518));
                    ListCell listCell = (ListCell) view.requireViewById(R.id.payment_cell);
                    VEP vep = VEP.A0c;
                    listCell.setPrimaryTextStyle(vep);
                    ContextThemeWrapper contextThemeWrapper3 = this.A00;
                    if (contextThemeWrapper3 != null) {
                        listCell.setPrimaryText(contextThemeWrapper3.getString(2131961516));
                        ContextThemeWrapper contextThemeWrapper4 = this.A00;
                        if (contextThemeWrapper4 != null) {
                            UBY uby = new UBY(contextThemeWrapper4);
                            uby.setIcon(VET.A0F);
                            listCell.setLeftAddOnIcon(uby);
                            ListCell listCell2 = (ListCell) view.requireViewById(R.id.data_cell);
                            listCell2.setPrimaryTextStyle(vep);
                            ContextThemeWrapper contextThemeWrapper5 = this.A00;
                            if (contextThemeWrapper5 != null) {
                                listCell2.setPrimaryText(contextThemeWrapper5.getString(2131961513));
                                ContextThemeWrapper contextThemeWrapper6 = this.A00;
                                if (contextThemeWrapper6 != null) {
                                    UBY uby2 = new UBY(contextThemeWrapper6);
                                    uby2.setIcon(VET.A0G);
                                    listCell2.setLeftAddOnIcon(uby2);
                                    ListCell listCell3 = (ListCell) view.requireViewById(R.id.fraud_cell);
                                    listCell3.setPrimaryTextStyle(vep);
                                    ContextThemeWrapper contextThemeWrapper7 = this.A00;
                                    if (contextThemeWrapper7 != null) {
                                        listCell3.setPrimaryText(contextThemeWrapper7.getString(2131961500));
                                        ContextThemeWrapper contextThemeWrapper8 = this.A00;
                                        if (contextThemeWrapper8 != null) {
                                            UBY uby3 = new UBY(contextThemeWrapper8);
                                            uby3.setIcon(VET.A0E);
                                            listCell3.setLeftAddOnIcon(uby3);
                                            ListCell listCell4 = (ListCell) view.requireViewById(R.id.pin_cell);
                                            listCell4.setPrimaryTextStyle(vep);
                                            ContextThemeWrapper contextThemeWrapper9 = this.A00;
                                            if (contextThemeWrapper9 != null) {
                                                listCell4.setPrimaryText(contextThemeWrapper9.getString(2131961517));
                                                ContextThemeWrapper contextThemeWrapper10 = this.A00;
                                                if (contextThemeWrapper10 != null) {
                                                    UBY uby4 = new UBY(contextThemeWrapper10);
                                                    uby4.setIcon(VET.A0I);
                                                    listCell4.setLeftAddOnIcon(uby4);
                                                    ListCell listCell5 = (ListCell) view.requireViewById(R.id.help_cell);
                                                    listCell5.setPrimaryTextStyle(vep);
                                                    ContextThemeWrapper contextThemeWrapper11 = this.A00;
                                                    if (contextThemeWrapper11 != null) {
                                                        listCell5.setPrimaryText(contextThemeWrapper11.getString(2131961515));
                                                        ContextThemeWrapper contextThemeWrapper12 = this.A00;
                                                        if (contextThemeWrapper12 != null) {
                                                            UBY uby5 = new UBY(contextThemeWrapper12);
                                                            uby5.setIcon(VET.A0H);
                                                            listCell5.setLeftAddOnIcon(uby5);
                                                            TextView textView2 = (TextView) view.requireViewById(R.id.footer_text);
                                                            C14360o3.A0A(textView2);
                                                            WF7.A02(textView2, VEP.A0a);
                                                            ECPPaymentRequest eCPPaymentRequest = this.A01;
                                                            if (eCPPaymentRequest != null) {
                                                                EcpNuxLearnMoreScreenStyle ecpNuxLearnMoreScreenStyle = eCPPaymentRequest.A04.A08;
                                                                if (ecpNuxLearnMoreScreenStyle == null || (A00 = ecpNuxLearnMoreScreenStyle.A00) == null) {
                                                                    ContextThemeWrapper contextThemeWrapper13 = this.A00;
                                                                    if (contextThemeWrapper13 != null) {
                                                                        String obj = contextThemeWrapper13.getText(2131961514).toString();
                                                                        ArrayList arrayList = new ArrayList();
                                                                        W4W w4w = new W4W();
                                                                        w4w.A01("https://www.facebook.com/help/565350107604363?ref=learn_more");
                                                                        w4w.A01 = 2131961498;
                                                                        w4w.A03 = "[[manage_payment_info_token]]";
                                                                        arrayList.add(new LinkParams(w4w));
                                                                        W4W w4w2 = new W4W();
                                                                        w4w2.A01("https://www.facebook.com/privacy/explanation/");
                                                                        w4w2.A01 = 2131961504;
                                                                        w4w2.A03 = "[[data_terms_token]]";
                                                                        arrayList.add(new LinkParams(w4w2));
                                                                        W4W w4w3 = new W4W();
                                                                        w4w3.A01("https://www.facebook.com/payments_terms/");
                                                                        w4w3.A01 = 2131961554;
                                                                        w4w3.A03 = "[[payment_terms_token]]";
                                                                        arrayList.add(new LinkParams(w4w3));
                                                                        C60613RDi A002 = SSE.A00(requireContext(), AbstractC31173DnH.A0L(arrayList), obj);
                                                                        WbN wbN = new WbN(this, 8);
                                                                        C14360o3.A0B(wbN, 0);
                                                                        A00 = A002.A00(wbN, false);
                                                                    }
                                                                }
                                                                textView2.setText(A00);
                                                                C2FP.A0A();
                                                                textView2.setLinkTextColor(AbstractC166997dE.A0L(textView2).getColor(R.color.igds_link));
                                                                textView2.setMovementMethod(new LinkMovementMethod());
                                                                textView2.setTextAlignment(4);
                                                                View A0S = AbstractC166997dE.A0S(view, R.id.divider);
                                                                ContextThemeWrapper contextThemeWrapper14 = this.A00;
                                                                if (contextThemeWrapper14 != null) {
                                                                    C70161WEa.A00(contextThemeWrapper14, A0S, 19, false);
                                                                }
                                                            }
                                                            C14360o3.A0F("ecpPaymentRequest");
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
                }
            }
            C14360o3.A0F("viewContext");
            throw C00O.createAndThrow();
        }
        WGJ.A05(this, false);
        WGJ.A02(this);
        ECPPaymentRequest eCPPaymentRequest2 = this.A01;
        if (eCPPaymentRequest2 != null) {
            if (WGr.A0L(eCPPaymentRequest2)) {
                Fragment fragment = this.mParentFragment;
                C14360o3.A0C(fragment, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
                ((C67752UxP) fragment).A0H();
                return;
            }
            return;
        }
        C14360o3.A0F("ecpPaymentRequest");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-1671690960);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("logging_context");
        C14360o3.A0C(parcelable, "null cannot be cast to non-null type com.facebookpay.logging.LoggingContext");
        this.A03 = (LoggingContext) parcelable;
        Parcelable parcelable2 = requireArguments().getParcelable("ECP_LAUNCH_PARAMS");
        C14360o3.A0C(parcelable2, "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.ECPPaymentRequest");
        this.A01 = (ECPPaymentRequest) parcelable2;
        LoggingContext loggingContext = this.A03;
        if (loggingContext != null) {
            this.A02 = AbstractC69842VwS.A00(this, null, loggingContext);
            Wap wap = C2FP.A01().A04;
            LoggingContext loggingContext2 = this.A03;
            if (loggingContext2 != null) {
                UFU ufu = this.A02;
                if (ufu == null) {
                    str = "ecpNuxViewModel";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                Wap.A02(new C25531Mh(MSY.A0H(wap.A00, "client_load_ecpbranding_success"), 53), loggingContext2, UFS.A01(ufu.A0S), "ecp_branding_banner_learn_more_detail", 21);
                C0f9.A09(20044657, A02);
                return;
            }
        }
        str = "loggingContext";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(346895413);
        ContextThemeWrapper A00 = AbstractC66388UEw.A00(this, layoutInflater);
        this.A00 = A00;
        View inflate = layoutInflater.cloneInContext(A00).inflate(R.layout.ecp_nux_learn_more_fragment, viewGroup, false);
        C0f9.A09(246790472, A02);
        return inflate;
    }
}
