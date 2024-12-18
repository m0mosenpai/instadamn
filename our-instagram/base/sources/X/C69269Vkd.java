package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Vkd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69269Vkd {
    public final Bitmap.Config A00;
    public final SparseArray A01;
    public final C69603Vs6 A02;
    public final AbstractC27691Vx A03;
    public final ExecutorService A04;

    public C69269Vkd(Bitmap.Config config, C69603Vs6 c69603Vs6, AbstractC27691Vx abstractC27691Vx, ExecutorService executorService) {
        C14360o3.A0B(abstractC27691Vx, 1);
        this.A03 = abstractC27691Vx;
        this.A02 = c69603Vs6;
        this.A00 = config;
        this.A04 = executorService;
        this.A01 = new SparseArray();
    }
}
