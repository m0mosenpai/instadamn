package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* loaded from: classes10.dex */
public final class Q1y extends ContextWrapper {
    public final Context A00;
    public final VTA A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1y(Context context, VTA vta) {
        super(context);
        C14360o3.A0B(vta, 2);
        this.A00 = context;
        this.A01 = vta;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Context context = this.A00;
        C14360o3.A0B(context, 0);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        return resources;
    }
}
