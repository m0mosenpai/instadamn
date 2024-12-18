package X;

import android.content.Context;
import java.util.Locale;

/* renamed from: X.LEk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47916LEk {
    public static final SWY A04 = new SWY();
    public long A00;
    public boolean A01;
    public final C47735L5w A02;
    public final Locale A03;

    public C47916LEk(Context context, C47409Kwy c47409Kwy) {
        C14360o3.A0B(context, 2);
        Locale locale = ((C53092bq) AbstractC61637Rr1.A00(context.getResources().getConfiguration()).A00).A00.get(0);
        if (locale == null && (locale = Locale.getDefault()) == null) {
            locale = Locale.US;
        }
        C14360o3.A0A(locale);
        C14360o3.A0B(locale, 2);
        this.A03 = locale;
        this.A01 = true;
        this.A02 = new C47735L5w(c47409Kwy);
    }
}
