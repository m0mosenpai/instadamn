package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.mainactivity.InstagramMainActivity;

/* loaded from: classes8.dex */
public final class M24 implements Runnable {
    public final /* synthetic */ C43596JQb A00;

    public M24(C43596JQb c43596JQb) {
        this.A00 = c43596JQb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00.A01;
        Intent intent = new Intent(context, (Class<?>) InstagramMainActivity.class);
        intent.setFlags(335577088);
        C0b3.A00().A07().A0G(context, intent);
    }
}
