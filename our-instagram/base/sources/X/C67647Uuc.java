package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.recyclerview.adapteritems.PayButtonItem;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;
import java.math.BigDecimal;
import java.util.Locale;

/* renamed from: X.Uuc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67647Uuc extends UGL {
    public final ContextThemeWrapper A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16820sZ A02;

    public final void A08(UIK uik, C63406Sjd c63406Sjd) {
        String str;
        PayButtonItem payButtonItem;
        PayButtonItem payButtonItem2;
        boolean A1R = AbstractC167007dF.A1R(0, c63406Sjd, uik);
        FBPayAnimationButton fBPayAnimationButton = uik.A00;
        C0fQ.A00(ViewOnClickListenerC70231WMr.A00, fBPayAnimationButton);
        Object obj = c63406Sjd.A01;
        if (obj != null && (payButtonItem2 = (PayButtonItem) obj) != null && payButtonItem2.A03 == A1R) {
            fBPayAnimationButton.A05();
            if (c63406Sjd.A00 == EnumC68120VCd.LOADING) {
                fBPayAnimationButton.A07();
                return;
            } else {
                fBPayAnimationButton.A08(c63406Sjd);
                return;
            }
        }
        if (C63406Sjd.A0J(c63406Sjd) && (payButtonItem = (PayButtonItem) obj) != null && payButtonItem.A00 != null) {
            String A04 = A04(AbstractC37301Gc2.A03(uik), payButtonItem);
            FBPayAnimationButton.A01(fBPayAnimationButton);
            fBPayAnimationButton.getButtonView().getLayoutParams().width = -1;
            if (super.A01) {
                fBPayAnimationButton.getButtonView().setButtonStyle(VEX.A09);
            }
            if (A04 == null) {
                A04 = "";
            }
            fBPayAnimationButton.setText(A04);
            fBPayAnimationButton.setPayButtonState(A1R);
            fBPayAnimationButton.A05();
            WNV.A00(fBPayAnimationButton, 14, uik, this);
            return;
        }
        if (C63406Sjd.A0H(c63406Sjd)) {
            fBPayAnimationButton.setPayButtonState(false);
            fBPayAnimationButton.A06(A1R);
            InterfaceC16820sZ interfaceC16820sZ = this.A02;
            if (interfaceC16820sZ == null) {
                return;
            }
            interfaceC16820sZ.invoke();
            return;
        }
        if (!C63406Sjd.A0G(c63406Sjd)) {
            return;
        }
        PayButtonItem payButtonItem3 = (PayButtonItem) obj;
        if (payButtonItem3 == null || (str = A04(AbstractC37301Gc2.A03(uik), payButtonItem3)) == null) {
            str = "";
        }
        fBPayAnimationButton.setText(str);
        fBPayAnimationButton.setPayButtonState(false);
        fBPayAnimationButton.A05();
    }

    public C67647Uuc(ContextThemeWrapper contextThemeWrapper, LoggingContext loggingContext, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        super(VG3.A0T, loggingContext, z);
        this.A00 = contextThemeWrapper;
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16820sZ2;
    }

    private final String A04(Context context, PayButtonItem payButtonItem) {
        String str;
        String format;
        if (super.A01) {
            format = payButtonItem.A02;
            if (format == null) {
                format = context.getString(2131961341);
            }
            return format;
        }
        CurrencyAmount currencyAmount = payButtonItem.A00;
        if (currencyAmount != null) {
            str = W43.A00.A00(currencyAmount.A00, new BigDecimal(currencyAmount.A01));
        } else {
            str = null;
        }
        C2FP.A08();
        Locale A02 = C1Q2.A02();
        String A0p = AbstractC166997dE.A0p(context, 2131961343);
        String str2 = payButtonItem.A02;
        if (str2 == null) {
            str2 = AbstractC166997dE.A0p(context, 2131961342);
        }
        format = String.format(A02, A0p, MSX.A1b(str2, str, 2));
        C14360o3.A07(format);
        return format;
    }
}
