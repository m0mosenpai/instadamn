package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* loaded from: classes10.dex */
public final class Q1z extends ContextWrapper {
    public final /* synthetic */ T34 A00;
    public final /* synthetic */ C15370ps A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1z(T34 t34, C15370ps c15370ps) {
        super((Context) c15370ps.A00);
        this.A01 = c15370ps;
        this.A00 = t34;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Context context = (Context) this.A01.A00;
        C14360o3.A0B(context, 0);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        return resources;
    }
}
