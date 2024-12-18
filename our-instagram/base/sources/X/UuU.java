package X;

import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutPuxLink;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes11.dex */
public final class UuU extends UGL {
    public final ContextThemeWrapper A00;
    public final boolean A01;

    public final void A08(C66460UIk c66460UIk, C63406Sjd c63406Sjd) {
        R0Z r0z;
        ImmutableList A0E;
        List A02;
        List list;
        FrameLayout.LayoutParams layoutParams;
        ImmutableList A0E2;
        boolean A1R = AbstractC167007dF.A1R(0, c63406Sjd, c66460UIk);
        AnonCheckoutPuxLink anonCheckoutPuxLink = (AnonCheckoutPuxLink) c63406Sjd.A01;
        if (C63406Sjd.A0J(c63406Sjd) && anonCheckoutPuxLink != null) {
            ShimmerFrameLayout shimmerFrameLayout = c66460UIk.A01;
            shimmerFrameLayout.A05();
            String str = null;
            shimmerFrameLayout.setBackground(null);
            if (this.A01) {
                if (anonCheckoutPuxLink.A02) {
                    A02 = C16930sl.A00;
                    r0z = anonCheckoutPuxLink.A00;
                    if (r0z != null && (A0E2 = r0z.A0E()) != null) {
                        list = W6V.A01(A0E2, C2FP.A0A().A02(this.A00, 17), 0);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    r0z = anonCheckoutPuxLink.A00;
                    if (r0z != null && (A0E = r0z.A0E()) != null) {
                        A02 = W6V.A02(A0E, 0, false);
                        list = C16930sl.A00;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                TextView textView = c66460UIk.A00;
                String optionalStringField = r0z.getOptionalStringField(0, "text");
                if (optionalStringField != null) {
                    AbstractC167017dG.A1P(A02, list);
                    C60613RDi c60613RDi = new C60613RDi(optionalStringField, A02, list);
                    WbO wbO = new WbO(0, this, c66460UIk);
                    C14360o3.A0B(wbO, 0);
                    textView.setText(c60613RDi.A00(wbO, false));
                    textView.setMovementMethod(new LinkMovementMethod());
                    W5t A0A = C2FP.A0A();
                    ContextThemeWrapper contextThemeWrapper = this.A00;
                    textView.setLinkTextColor(A0A.A02(contextThemeWrapper, 5));
                    Integer valueOf = Integer.valueOf(AbstractC167017dG.A03(contextThemeWrapper));
                    WFM.A03(textView, null, null, valueOf, valueOf);
                    WFM.A03(shimmerFrameLayout, 0, 0, 0, 0);
                    WF7.A02(textView, VEP.A14);
                    ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                    if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                        layoutParams.gravity = 8388611;
                        textView.setLayoutParams(layoutParams);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            WFM.A03(shimmerFrameLayout, null, null, 0, null);
            TextView textView2 = c66460UIk.A00;
            WF7.A02(textView2, VEP.A1G);
            C0fQ.A00(super.A00, textView2);
            R0Z r0z2 = anonCheckoutPuxLink.A00;
            if (r0z2 != null) {
                str = r0z2.getOptionalStringField(0, "text");
            }
            textView2.setText(str);
            return;
        }
        if (!C63406Sjd.A0H(c63406Sjd)) {
            return;
        }
        c66460UIk.A01.A06(A1R);
    }

    public UuU(ContextThemeWrapper contextThemeWrapper, LoggingContext loggingContext, boolean z) {
        super(VG3.A09, loggingContext, false);
        this.A00 = contextThemeWrapper;
        this.A01 = z;
    }
}
