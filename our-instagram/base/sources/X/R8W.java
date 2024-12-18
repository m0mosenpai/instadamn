package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebookpay.offsite.models.message.AvailabilityResponse;
import com.facebookpay.offsite.models.message.AvailableMessageContent;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes10.dex */
public final class R8W extends VKC {
    public final Context A00;
    public final InterfaceC172717mh A01;
    public final InterfaceC172717mh A02;
    public final InterfaceC65619ToA A03;
    public final UserSession A04;

    @Override // X.VKC
    public final void A01() {
        View findViewById;
        View view = ((BrowserLiteFragment) this.A01).A0C;
        if (view != null && (findViewById = view.findViewById(R.id.metacheckout_disclosure_footer)) != null) {
            findViewById.setVisibility(8);
            A00(view, 0);
        }
    }

    @Override // X.VKC
    public final void A02() {
        int A00;
        int A002;
        int indexOfKey;
        int indexOfKey2;
        int i;
        Resources resources;
        View view = ((BrowserLiteFragment) this.A01).A0C;
        if (view != null) {
            View findViewById = view.findViewById(R.id.metacheckout_disclosure_footer);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            } else {
                ViewStub viewStub = (ViewStub) view.findViewById(R.id.shops_lite_disclaimer_stub);
                if (viewStub == null) {
                    return;
                }
                View A0E = AbstractC31173DnH.A0E(viewStub, R.layout.ads_disclosure_footer_metacheckout);
                C14360o3.A07(A0E);
                Q1y q1y = super.A00;
                if (q1y != null) {
                    View A0c = AbstractC166987dD.A0c(A0E, R.id.metacheckout_disclosure_footer_divider);
                    C2FP.A0A();
                    AbstractC31174DnI.A1C(A0E, q1y.getColor(R.color.igds_elevated_background));
                    C2FP.A0A();
                    AbstractC31174DnI.A1C(A0c, q1y.getColor(R.color.igds_separator));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    C66328U9c c66328U9c = new C66328U9c(1, this, q1y);
                    InterfaceC65619ToA interfaceC65619ToA = this.A03;
                    spannableStringBuilder.append((CharSequence) interfaceC65619ToA.getText());
                    int AtZ = interfaceC65619ToA.AtZ();
                    int Atd = interfaceC65619ToA.Atd();
                    spannableStringBuilder.setSpan(c66328U9c, AtZ, Atd, 33);
                    TextView textView = (TextView) AbstractC166987dD.A0c(A0E, R.id.metacheckout_disclosure_footer_body_text);
                    AbstractC31176DnK.A1G(textView, spannableStringBuilder);
                    C2FP.A0A();
                    textView.setHighlightColor(q1y.getColor(R.color.igds_elevated_background));
                    C62473SDa A003 = AbstractC61740Rsv.A00(q1y);
                    EnumC72413Xd9 enumC72413Xd9 = EnumC72413Xd9.A04;
                    SparseIntArray sparseIntArray = A003.A01;
                    if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(R.attr.fds_usage_primary_text)) >= 0) {
                        A00 = sparseIntArray.valueAt(indexOfKey2);
                    } else {
                        A00 = AbstractC61773RtT.A00(A003.A00, enumC72413Xd9);
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(A00), 0, AtZ, 33);
                    C62473SDa A004 = AbstractC61740Rsv.A00(q1y);
                    EnumC72413Xd9 enumC72413Xd92 = EnumC72413Xd9.A03;
                    SparseIntArray sparseIntArray2 = A004.A01;
                    if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(R.attr.fds_usage_blue_link)) >= 0) {
                        A002 = sparseIntArray2.valueAt(indexOfKey);
                    } else {
                        A002 = AbstractC61773RtT.A00(A004.A00, enumC72413Xd92);
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(A002), AtZ, Atd, 33);
                    try {
                        textView.setContentDescription(interfaceC65619ToA.getDescription());
                    } catch (Exception unused) {
                    }
                }
            }
            Context context = this.A00;
            if (context != null && (resources = context.getResources()) != null) {
                i = (resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material) * 2) + resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size) + resources.getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
            } else {
                i = 0;
            }
            A00(view, i);
            Intent intent = this.A02.getIntent();
            if (intent == null || intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_LOGGING_ENABLED", true)) {
                VDH vdh = VDH.A0N;
                Map map = super.A01;
                if (map == null) {
                    map = AbstractC06930Yk.A0E();
                }
                C70189WFs.A03(vdh, map);
            }
        }
    }

    @Override // X.VKC
    public final boolean A03(AvailabilityResponse availabilityResponse) {
        String str;
        AvailableMessageContent availableMessageContent = availabilityResponse.content;
        if (availableMessageContent != null) {
            str = availableMessageContent.availability;
        } else {
            str = null;
        }
        return C14360o3.A0K(str, MessageAvailabilityResponseId$Companion.AVAILABLE);
    }

    public R8W(Context context, InterfaceC172717mh interfaceC172717mh, InterfaceC65619ToA interfaceC65619ToA, UserSession userSession) {
        if (context != null) {
            VTA A09 = C2FP.A09();
            C14360o3.A0A(A09);
            super.A00 = new Q1y(context, A09);
        }
        this.A01 = interfaceC172717mh;
        this.A00 = context;
        this.A03 = interfaceC65619ToA;
        this.A04 = userSession;
        this.A02 = interfaceC172717mh;
    }

    public static final void A00(View view, int i) {
        View findViewById;
        if (C18U.A06(C06090Tz.A05, AbstractC58318PtA.A0T(), 36313501812262956L) && (findViewById = view.findViewById(R.id.webview_container)) != null) {
            findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), i);
            findViewById.requestLayout();
        }
    }
}
