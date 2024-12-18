package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class OKA {
    public final void A00(InterfaceC11380iw interfaceC11380iw, C56803PIu c56803PIu, InterfaceC58172Pqc interfaceC58172Pqc, C51362MmN c51362MmN, boolean z) {
        boolean A1a = AbstractC167017dG.A1a(c51362MmN, c56803PIu);
        String str = c56803PIu.A0D;
        if (str != null) {
            A01(c56803PIu, interfaceC58172Pqc, c51362MmN, str);
            User user = c56803PIu.A08;
            if (user != null) {
                c51362MmN.A0A.setUrl(user.Bhu(), interfaceC11380iw);
            }
            if (c56803PIu.A0H) {
                GradientSpinner gradientSpinner = c51362MmN.A0B;
                gradientSpinner.A02();
                gradientSpinner.setGradientColors(R.style.OrangePurpleGradientPatternStyle);
                gradientSpinner.setVisibility(0);
            }
            c51362MmN.A03.setVisibility(0);
            TextView textView = c51362MmN.A08;
            textView.setVisibility(0);
            User user2 = c56803PIu.A08;
            if (user2 != null) {
                AbstractC31173DnH.A1F(textView, user2);
            }
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            Context A0L = AbstractC166997dE.A0L(textView);
            ODR odr = c51362MmN.A0C;
            C14360o3.A0B(odr, A1a ? 1 : 0);
            User user3 = c56803PIu.A08;
            if (user3 != null && user3.isVerified()) {
                odr.A04.setVisibility(0);
            }
            LiveUserPaySupportTier liveUserPaySupportTier = c56803PIu.A06;
            if (liveUserPaySupportTier != null) {
                AbstractC54905OQc.A01(A0L, odr.A02, odr.A00, liveUserPaySupportTier, c56803PIu.A01);
            }
            if (z) {
                odr.A03.setVisibility(0);
                odr.A01.setVisibility(0);
            }
            View view = c51362MmN.A01;
            view.setVisibility(8);
            view.setSelected(z);
            ViewOnClickListenerC55468OkN.A00(view, 31, c56803PIu, interfaceC58172Pqc);
            if (z) {
                O15.A00.post(new RunnableC57056PSv(c56803PIu, interfaceC58172Pqc, c51362MmN));
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A01(InterfaceC58171Pqb interfaceC58171Pqb, InterfaceC58172Pqc interfaceC58172Pqc, C51362MmN c51362MmN, CharSequence charSequence) {
        c51362MmN.A00();
        c51362MmN.A07.setText(charSequence);
        View view = c51362MmN.A04;
        view.setAlpha(1.0f);
        List A1Q = AbstractC16960so.A1Q(c51362MmN.A05, c51362MmN.A02, c51362MmN.A03, view);
        ViewOnTouchListenerC55494Okn viewOnTouchListenerC55494Okn = new ViewOnTouchListenerC55494Okn(interfaceC58171Pqb, interfaceC58172Pqc, c51362MmN);
        Iterator it = A1Q.iterator();
        while (it.hasNext()) {
            AbstractC43592JPx.A09(it).setOnTouchListener(viewOnTouchListenerC55494Okn);
        }
    }
}
