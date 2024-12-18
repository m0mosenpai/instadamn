package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.AzR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24866AzR implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C148276lx A02;
    public final /* synthetic */ C8NW A03;
    public final /* synthetic */ C23108AGw A04;

    public RunnableC24866AzR(C148276lx c148276lx, C8NW c8nw, C23108AGw c23108AGw, int i, int i2) {
        this.A03 = c8nw;
        this.A02 = c148276lx;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = c23108AGw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8NW c8nw = this.A03;
        C148276lx c148276lx = this.A02;
        List list = c8nw.A0K;
        list.getClass();
        c8nw.A1G((Drawable) list.get(this.A01 - this.A00), c148276lx, this.A04);
    }
}
