package X;

import android.content.Context;

/* renamed from: X.SzS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64111SzS implements InterfaceC65348TiV {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C19240x6 A01;
    public final /* synthetic */ C07270a1 A02;

    public C64111SzS(Context context, C19240x6 c19240x6, C07270a1 c07270a1) {
        this.A01 = c19240x6;
        this.A02 = c07270a1;
        this.A00 = context;
    }

    @Override // X.InterfaceC65348TiV
    public final void DxE(C19U c19u, C19U c19u2, Integer num, String str) {
        AbstractC167017dG.A1P(c19u2, str);
        C19240x6 c19240x6 = this.A01;
        C07270a1 c07270a1 = this.A02;
        c19240x6.A01(c19u, c19u2, c07270a1, str);
        Context context = this.A00;
        String str2 = c19u2.A01;
        C14360o3.A06(str2);
        S51.A00(context, c07270a1, str2);
    }
}
