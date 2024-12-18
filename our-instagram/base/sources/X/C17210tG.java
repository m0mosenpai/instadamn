package X;

import android.content.SharedPreferences;

/* renamed from: X.0tG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17210tG implements InterfaceC13050lr {
    public boolean A00;

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        SharedPreferences sharedPreferences = C20150ym.A00;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (AbstractC20080yf abstractC20080yf : C20150ym.A04) {
                if (abstractC20080yf instanceof C0tH) {
                    String A02 = C20150ym.A02(abstractC20080yf);
                    edit.remove(A02);
                    C20150ym.A03.remove(A02);
                }
            }
            edit.apply();
        }
        this.A00 = false;
    }
}
