package X;

import android.content.Context;

/* renamed from: X.5wr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C131555wr extends C131565ws {
    public final C51092Wf A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131555wr(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A00 = new C51092Wf(this, C1LN.A01);
    }

    @Override // X.C131565ws
    public final C51092Wf getMountState() {
        return this.A00;
    }
}
