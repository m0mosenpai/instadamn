package X;

import android.content.Context;

/* renamed from: X.2KL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2KL extends AbstractC48222Jl {
    public static final android.net.Uri A00;

    @Override // X.AbstractC48222Jl
    public final boolean A01(Context context, int i) {
        C14360o3.A0B(context, 1);
        try {
            if (context.getContentResolver().call(A00, "updateMessageBadge", (String) null, AbstractC61636Rr0.A00(new C09530e4("badge_num", Integer.valueOf(i)))) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C0w9.A06("SmartisanLauncherBadges", "unexpected exception", e);
            return false;
        }
    }

    @Override // X.AbstractC48222Jl
    public final boolean A02(Context context, String str) {
        C14360o3.A0B(str, 1);
        return str.equals("com.smartisanos.launcher");
    }

    static {
        android.net.Uri A03 = AbstractC08820cl.A03("content://com.smartisanos.launcher.badge");
        C14360o3.A07(A03);
        A00 = A03;
    }
}
