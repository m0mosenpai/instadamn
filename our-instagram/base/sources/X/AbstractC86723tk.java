package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.instagram.user.model.User;

/* renamed from: X.3tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86723tk {
    public static final void A00(C9BH c9bh, InterfaceC80083hx interfaceC80083hx, C3W9 c3w9, User user) {
        C14360o3.A0B(c3w9, 0);
        C14360o3.A0B(c9bh, 1);
        C14360o3.A0B(interfaceC80083hx, 2);
        C206259Bi c206259Bi = (C206259Bi) c9bh.A00;
        if (((Boolean) ((InterfaceC16660sJ) c206259Bi.A04).invoke(user)).booleanValue()) {
            View A00 = c3w9.A00();
            String string = A00.getResources().getString(((Number) ((InterfaceC16820sZ) c206259Bi.A01).invoke()).intValue());
            C14360o3.A07(string);
            String string2 = c3w9.A00().getResources().getString(((Number) ((InterfaceC16820sZ) c206259Bi.A03).invoke()).intValue(), string);
            C14360o3.A07(string2);
            InterfaceC16600sD interfaceC16600sD = (InterfaceC16600sD) c206259Bi.A02;
            Context context = A00.getContext();
            C14360o3.A07(context);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) interfaceC16600sD.invoke(interfaceC80083hx, string, string2, context);
            InterfaceC09390do interfaceC09390do = c3w9.A01;
            Object value = interfaceC09390do.getValue();
            C14360o3.A07(value);
            ((TextView) value).setMovementMethod(LinkMovementMethod.getInstance());
            Object value2 = interfaceC09390do.getValue();
            C14360o3.A07(value2);
            ((TextView) value2).setText(spannableStringBuilder);
            c3w9.A00().setVisibility(0);
            return;
        }
        AbstractC13880nE.A0P(c3w9.A00());
    }
}
