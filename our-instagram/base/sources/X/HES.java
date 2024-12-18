package X;

import android.content.Context;

/* loaded from: classes7.dex */
public final class HES extends C2US {
    public final C65662y2 A00;
    public final AbstractC65632xz A01;
    public final C38993HEv A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.2y2, java.lang.Object, X.2y0] */
    public HES(Context context, boolean z, boolean z2, boolean z3) {
        super(false);
        C38992HEu c38992HEu;
        if (z3) {
            c38992HEu = new Object();
        } else {
            c38992HEu = new C38992HEu(context);
        }
        this.A01 = c38992HEu;
        C38993HEv c38993HEv = new C38993HEv(context);
        this.A02 = c38993HEv;
        ?? obj = new Object();
        obj.A03 = AbstractC167017dG.A06(context);
        this.A00 = obj;
        init(c38992HEu, c38993HEv, obj);
        if (z2) {
            addModel(null, c38992HEu);
        }
        addModel(null, obj);
        addModel(null, new C39097HIv(z), c38993HEv);
    }
}
