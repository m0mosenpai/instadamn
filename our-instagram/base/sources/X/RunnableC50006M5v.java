package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.M5v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50006M5v implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ GY1 A02;

    public RunnableC50006M5v(Context context, FragmentActivity fragmentActivity, GY1 gy1) {
        this.A00 = context;
        this.A02 = gy1;
        this.A01 = fragmentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC31176DnK.A12(this.A00, C3DN.A00);
        this.A02.CIz(this.A01);
    }
}
