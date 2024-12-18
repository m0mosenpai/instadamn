package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.AzW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24871AzW implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C41181vS A03;
    public final /* synthetic */ C84823qW A04;

    public RunnableC24871AzW(View view, ViewGroup viewGroup, UserSession userSession, C41181vS c41181vS, C84823qW c84823qW) {
        this.A00 = view;
        this.A04 = c84823qW;
        this.A01 = viewGroup;
        this.A03 = c41181vS;
        this.A02 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        C84823qW c84823qW = this.A04;
        ViewGroup viewGroup = this.A01;
        AbstractC167017dG.A17(view, this.A03, c84823qW, viewGroup.getWidth(), viewGroup.getHeight());
    }
}
