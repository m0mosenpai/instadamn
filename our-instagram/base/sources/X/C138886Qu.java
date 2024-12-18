package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Locale;

/* renamed from: X.6Qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138886Qu implements InterfaceC85403rV, InterfaceC85423rX {
    public final View A00;
    public final C6QX A01;
    public final InterfaceC145456h4 A02;

    private final C84823qW A00(ClickableSpan clickableSpan, View view) {
        C51u A00 = VWD.A00(clickableSpan, view, false);
        int[] iArr = {0, 0};
        this.A00.getLocationOnScreen(iArr);
        int intValue = ((Number) A00.A00).intValue() - iArr[0];
        int intValue2 = ((Number) A00.A01).intValue() - iArr[1];
        C84823qW c84823qW = new C84823qW();
        c84823qW.A03 = intValue;
        c84823qW.A04 = intValue2;
        c84823qW.A00 = ((Number) A00.A02).intValue();
        return c84823qW;
    }

    @Override // X.InterfaceC85423rX
    public final void D40(ClickableSpan clickableSpan, View view, String str) {
        C14360o3.A0B(str, 0);
        if (view != null) {
            if (clickableSpan != null) {
                C84823qW A00 = A00(clickableSpan, view);
                String lowerCase = str.toLowerCase(Locale.ROOT);
                C14360o3.A07(lowerCase);
                A00.A0l = AbstractC1120253r.A00(lowerCase).F59();
                A00.A12 = EnumC75383a5.A0d;
                A00.A1g = "text";
                this.A02.D4b(A00);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC85403rV
    public final void D4A(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        User A02;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(view, 2);
        C14360o3.A0B(clickableSpan, 3);
        boolean A022 = C1P8.A02(userSession);
        C6QX c6qx = this.A01;
        if (A022) {
            A02 = AbstractC41735Ie7.A02(c6qx, str);
        } else {
            A02 = C6RX.A02(c6qx, str);
        }
        C84823qW A00 = A00(clickableSpan, view);
        A00.A1C = A02;
        A00.A12 = EnumC75383a5.A0n;
        A00.A1g = "text";
        this.A02.D4b(A00);
    }

    public C138886Qu(View view, C41181vS c41181vS, InterfaceC145456h4 interfaceC145456h4) {
        this.A00 = view;
        this.A02 = interfaceC145456h4;
        this.A01 = c41181vS.A0G();
    }
}
