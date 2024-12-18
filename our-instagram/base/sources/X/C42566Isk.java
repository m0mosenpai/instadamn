package X;

import android.os.Handler;
import android.view.View;

/* renamed from: X.Isk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42566Isk implements JG4 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C120985dq A01;
    public final /* synthetic */ C37644Ghd A02;
    public final /* synthetic */ C37599Ggu A03;
    public final /* synthetic */ String A04;

    public C42566Isk(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, C37599Ggu c37599Ggu, String str) {
        this.A03 = c37599Ggu;
        this.A01 = c120985dq;
        this.A02 = c37644Ghd;
        this.A00 = view;
        this.A04 = str;
    }

    @Override // X.JG4
    public final void E2v() {
        Handler A0J = AbstractC167007dF.A0J();
        C37599Ggu c37599Ggu = this.A03;
        A0J.post(new RunnableC43157J5u(this.A00, this.A01, this.A02, c37599Ggu, this.A04));
    }
}
