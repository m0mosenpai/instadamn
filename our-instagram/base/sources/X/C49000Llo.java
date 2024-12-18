package X;

import android.content.Context;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Llo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49000Llo implements InterfaceC50431MOl {
    public static final C49000Llo A00 = new Object();

    @Override // X.InterfaceC50431MOl
    public final C51761Mtk AWo(Context context, C51753Mtc c51753Mtc, C160787Im c160787Im, int i, int i2, boolean z) {
        String str;
        int i3;
        int i4;
        String A0f;
        User user = c160787Im.A0K;
        String str2 = null;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        C50679MYx c50679MYx = (C50679MYx) c51753Mtc.A02;
        if (c50679MYx != null) {
            str2 = c50679MYx.A00;
        }
        if (C14360o3.A0K(str2, "screen_recording")) {
            if (z) {
                i3 = 2131961873;
            } else if (str != null && str.length() != 0) {
                i4 = 2131961872;
                A0f = AbstractC167007dF.A0f(context, str, i4);
            } else {
                i3 = 2131961874;
            }
            A0f = context.getString(i3);
        } else {
            if (z) {
                i3 = 2131961876;
            } else if (str != null && str.length() != 0) {
                i4 = 2131961875;
                A0f = AbstractC167007dF.A0f(context, str, i4);
            } else {
                i3 = 2131961877;
            }
            A0f = context.getString(i3);
        }
        C14360o3.A07(A0f);
        return new C51761Mtk(AbstractC43592JPx.A07(A0f), (List) C16930sl.A00);
    }
}
