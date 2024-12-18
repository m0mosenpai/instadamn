package X;

import android.content.Context;

/* loaded from: classes11.dex */
public final class U3u extends C126545np {
    public final C65743TtI A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U3u(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A00 = new C65743TtI(this) { // from class: X.6PD
            public final C131585wu A00;

            @Override // X.C65743TtI
            public final /* bridge */ /* synthetic */ C51092Wf A00() {
                return this.A00;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.5wu, X.2Wf] */
            {
                super(this);
                this.A00 = new C51092Wf(this, C1LN.A01);
            }
        };
    }

    @Override // X.C126545np
    public C65743TtI getRootHostDelegate() {
        return this.A00;
    }
}
