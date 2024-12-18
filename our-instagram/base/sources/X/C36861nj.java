package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.1nj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36861nj {
    public static C36861nj A00;

    public final void A00(Context context, InterfaceC11380iw interfaceC11380iw, String str) {
        String str2;
        C14360o3.A0B(context, 0);
        if (interfaceC11380iw != null) {
            str2 = interfaceC11380iw.getModuleName();
        } else {
            str2 = null;
        }
        int i = 67108864;
        if (AbstractC13320mI.A00(context, Activity.class) == null) {
            i = 335544320;
        }
        C12260kU.A0C(context, AbstractC34770FTt.A00(context, str, "direct-inbox", str2, i));
    }
}
