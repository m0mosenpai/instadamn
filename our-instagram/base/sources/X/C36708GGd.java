package X;

import android.app.Activity;

/* renamed from: X.GGd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36708GGd implements GYL {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ GYL A01;
    public final /* synthetic */ C70806WhM A02;

    public C36708GGd(Activity activity, GYL gyl, C70806WhM c70806WhM) {
        this.A02 = c70806WhM;
        this.A00 = activity;
        this.A01 = gyl;
    }

    @Override // X.GYL
    public final void onCancel() {
        this.A01.onCancel();
    }
}
