package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.AzF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24854AzF implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C84823qW A02;
    public final /* synthetic */ C144366fI A03;

    public RunnableC24854AzF(ViewGroup viewGroup, C41181vS c41181vS, C84823qW c84823qW, C144366fI c144366fI) {
        this.A03 = c144366fI;
        this.A02 = c84823qW;
        this.A00 = viewGroup;
        this.A01 = c41181vS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A03.A00.getView();
        C84823qW c84823qW = this.A02;
        ViewGroup viewGroup = this.A00;
        C138436Oz.A04(view, c84823qW, this.A01.A00(), viewGroup.getWidth(), viewGroup.getHeight(), false);
    }
}
