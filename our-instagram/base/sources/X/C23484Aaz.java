package X;

import android.content.SharedPreferences;
import java.io.File;

/* renamed from: X.Aaz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23484Aaz implements C1MU {
    public final C1MX A00;
    public final C23111Aq A01;

    @Override // X.C1MU
    public final /* bridge */ /* synthetic */ void DXo(C1F9 c1f9, C1B1 c1b1, File file) {
        this.A01.A04(C05F.A00).execute(new RunnableC24830Ayq(c1f9, this, (C1FC) c1b1, file));
    }

    public C23484Aaz(C23111Aq c23111Aq) {
        C1MX c1mw;
        this.A01 = c23111Aq;
        SharedPreferences sharedPreferences = c23111Aq.A06;
        if (sharedPreferences == null) {
            c1mw = new C1MX("stale_removal");
        } else {
            c1mw = new C1MW(sharedPreferences, "stale_removal");
        }
        this.A00 = c1mw;
    }
}
