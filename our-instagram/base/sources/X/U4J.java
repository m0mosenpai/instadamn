package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes11.dex */
public final class U4J implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C135266Ab A03;
    public final /* synthetic */ C6AY A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ AbstractC79173gO[] A06;

    public U4J(Context context, C135266Ab c135266Ab, C6AY c6ay, Object obj, AbstractC79173gO[] abstractC79173gOArr, int i, long j) {
        this.A02 = context;
        this.A04 = c6ay;
        this.A05 = obj;
        this.A06 = abstractC79173gOArr;
        this.A03 = c135266Ab;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return C135266Ab.A04.A02(this.A02, this.A03, this.A04, this.A05, this.A06, this.A00, this.A01);
    }
}
