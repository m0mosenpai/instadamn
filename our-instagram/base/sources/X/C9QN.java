package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.9QN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9QN implements InterfaceC117985Vi {
    public static final C9QN A00 = new Object();

    @Override // X.InterfaceC117985Vi
    public final Drawable AR6(Context context, int i) {
        C14360o3.A0B(context, 0);
        return context.getDrawable(i);
    }

    @Override // X.InterfaceC117985Vi
    public final String Ep0(Context context, int i) {
        C14360o3.A0B(context, 0);
        String string = context.getString(i);
        C14360o3.A07(string);
        return string;
    }
}
