package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* renamed from: X.Az2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24842Az2 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C190448c2 A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ boolean A03;

    public RunnableC24842Az2(View view, C190448c2 c190448c2, Integer num, boolean z) {
        this.A02 = num;
        this.A01 = c190448c2;
        this.A03 = z;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Integer num = this.A02;
        int intValue = num.intValue();
        C190448c2 c190448c2 = this.A01;
        Context context = c190448c2.A02;
        if (intValue != 0) {
            i = 2131969951;
        } else {
            if (C18U.A06(C06090Tz.A05, c190448c2.A03, 36320944989545486L)) {
                i = 2131966293;
            } else {
                i = 2131966294;
                if (this.A03) {
                    i = 2131966292;
                }
            }
        }
        C5SU c5su = new C5SU((Activity) context, new C149686oL(AbstractC166997dE.A0p(context, i)));
        c5su.A0F = false;
        c5su.A03(this.A00);
        c5su.A02();
        c5su.A04 = new C220479oX(0, num, c190448c2);
        C5SW A00 = c5su.A00();
        A00.A06();
        c190448c2.A00 = A00;
    }
}
