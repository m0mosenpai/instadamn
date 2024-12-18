package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class M62 implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C47677L3k A01;
    public final /* synthetic */ User A02;

    public M62(ViewGroup viewGroup, C47677L3k c47677L3k, User user) {
        this.A01 = c47677L3k;
        this.A02 = user;
        this.A00 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47677L3k c47677L3k = this.A01;
        C47423KxE c47423KxE = c47677L3k.A00;
        if (c47423KxE != null) {
            c47423KxE.A00.A0W("dialog");
        }
        Context context = c47677L3k.A03;
        C5SU c5su = new C5SU((Activity) context, new C23964Ajy(context.getString(2131969743), AbstractC167007dF.A0f(context, this.A02.getUsername(), 2131969741)));
        c5su.A03(this.A00);
        c5su.A01();
        c5su.A0F = false;
        C5SW A00 = KYR.A00(c5su, this, 14);
        c47677L3k.A01 = A00;
        A00.A06();
    }
}
