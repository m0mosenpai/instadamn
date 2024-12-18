package X;

import android.app.Activity;

/* renamed from: X.Jhi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44292Jhi extends AbstractRunnableC14200nk {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C44291Jhh A01;

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Activity activity = this.A00;
        C18240vB c18240vB = AbstractC196848nE.A00;
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation != 1) {
            if (rotation != 2) {
                i = 270;
                if (rotation != 3) {
                    i = 0;
                }
            } else {
                i = 180;
            }
        } else {
            i = 90;
        }
        C44265JhC c44265JhC = this.A01.A00;
        c44265JhC.A08.post(new RunnableC44311Ji2(c44265JhC, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44292Jhi(Activity activity, C44291Jhh c44291Jhh) {
        super(1092088265, 3, false, false);
        this.A00 = activity;
        this.A01 = c44291Jhh;
    }
}
