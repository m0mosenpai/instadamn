package X;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: X.V6d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68011V6d extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68011V6d(Context context, Bitmap bitmap, String str) {
        super(281740630, 1, false, false);
        this.A02 = str;
        this.A01 = bitmap;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.A02;
        AbstractC97414Zb.A03(this.A00, this.A01, str);
    }
}
