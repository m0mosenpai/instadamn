package X;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.Calendar;

/* renamed from: X.FfS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35175FfS {
    public static final void A01(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        AbstractC31172DnG.A1C(context, A0I, 2131956574);
        AbstractC31173DnH.A16(context, A0I, 2131956571);
        A0I.A0J(onClickListener, 2131956572);
        A0I.A0I(onClickListener2, 2131956573);
        A0I.A0t(false);
        AbstractC166987dD.A1W(A0I);
    }

    public static final void A02(Context context, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, InterfaceC37125GXm interfaceC37125GXm, String str, String str2) {
        boolean A1R = AbstractC167007dF.A1R(0, context, abstractC12990ll);
        C35208Fg0.A04.A00().A02(interfaceC11380iw, abstractC12990ll, C05F.A0C, interfaceC37125GXm.B9K(), str);
        SimpleWebViewActivity.A02.A02(context, abstractC12990ll, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, A1R, false, false, A1R, false, false, false, str2, str));
    }

    public static final int A00(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.set(i, i2, i3);
        int i4 = calendar2.get(1) - calendar.get(1);
        if (calendar.get(2) > calendar2.get(2) || (calendar.get(2) == calendar2.get(2) && calendar.get(5) > calendar2.get(5))) {
            return i4 - 1;
        }
        return i4;
    }

    public static final void A03(TextView textView, Context context) {
        boolean A1Y = AbstractC25229BEm.A1Y(textView);
        if (C35154Few.A00().A04 == C05F.A00) {
            textView.setTextSize(A1Y ? 1 : 0, context.getResources().getDimensionPixelSize(R.dimen.avatar_search_sticker_tray_text_size));
            textView.setGravity(17);
        }
    }
}
