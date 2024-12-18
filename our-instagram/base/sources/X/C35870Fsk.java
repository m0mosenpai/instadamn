package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.Fsk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35870Fsk implements C2n2 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C35870Fsk(Activity activity, String str, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = activity;
    }

    @Override // X.C2n2
    public final Object apply(Object obj) {
        AbstractC35101FdC.A02((Context) this.A01, this.A02, (String) obj);
        return null;
    }
}
