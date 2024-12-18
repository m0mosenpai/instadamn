package X;

import android.view.ViewStub;

/* renamed from: X.3sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86093sg {
    public C86123sj A00;
    public final C86143sl A01;
    public final C86103sh A02;

    public C86093sg(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        C86123sj c86123sj;
        C14360o3.A0B(viewStub, 1);
        this.A02 = new C86103sh(viewStub);
        if (viewStub2 != null) {
            c86123sj = new C86123sj(viewStub2);
        } else {
            c86123sj = null;
        }
        this.A00 = c86123sj;
        this.A01 = new C86143sl(viewStub3);
    }
}
