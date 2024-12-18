package X;

import android.util.Property;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.R;
import com.facebookpay.widget.otc.AnonCheckoutToggleButton;
import com.instagram.api.schemas.XFBCTXWelcomeMessageStatus;
import com.instagram.business.promote.model.PromoteData;

/* renamed from: X.WOs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70265WOs implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public C70265WOs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        InterfaceC16660sJ interfaceC16660sJ;
        String str;
        XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus;
        switch (this.A00) {
            case 0:
                interfaceC16660sJ = ((UuR) this.A01).A04;
                AbstractC25227BEk.A1Q(interfaceC16660sJ, z);
                return;
            case 1:
                UDu uDu = (UDu) this.A01;
                Property property = SwitchCompat.A0i;
                MSX.A1B(uDu.A00.A05, z);
                return;
            case 2:
                interfaceC16660sJ = ((AnonCheckoutToggleButton) this.A01).A00;
                AbstractC25227BEk.A1Q(interfaceC16660sJ, z);
                return;
            case 3:
                C70879Wik c70879Wik = (C70879Wik) this.A01;
                if (z) {
                    if (c70879Wik.A05.A1k != null) {
                        C70879Wik.A01(c70879Wik);
                        return;
                    } else {
                        C70879Wik.A00(c70879Wik);
                        return;
                    }
                }
                c70879Wik.A06.A09 = false;
                TextView textView = c70879Wik.A00;
                if (textView == null) {
                    str = "subtitleView";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                textView.setVisibility(8);
                return;
            case 4:
                V0X v0x = (V0X) this.A01;
                PromoteData promoteData = v0x.A0A;
                if (promoteData == null) {
                    str = "promoteData";
                } else {
                    if (z) {
                        xFBCTXWelcomeMessageStatus = XFBCTXWelcomeMessageStatus.A04;
                    } else {
                        xFBCTXWelcomeMessageStatus = XFBCTXWelcomeMessageStatus.A05;
                    }
                    promoteData.A0a = xFBCTXWelcomeMessageStatus;
                    C70399WUb c70399WUb = v0x.A06;
                    if (c70399WUb == null) {
                        str = "promoteLogger";
                    } else {
                        VG4 vg4 = v0x.A05;
                        if (vg4 == null) {
                            str = "currentStep";
                        } else {
                            C70399WUb.A03(vg4, c70399WUb, null, null, null, null, Boolean.valueOf(z), "default_welcome_message_toggle");
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                ViewGroup viewGroup = ((C66354UBs) this.A01).A08;
                int i = 0;
                if (z) {
                    i = R.color.black_20_transparent;
                }
                viewGroup.setBackgroundColor(i);
                return;
        }
    }
}
