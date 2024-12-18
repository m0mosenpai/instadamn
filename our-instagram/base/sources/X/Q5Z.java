package X;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes10.dex */
public final class Q5Z extends SOP {
    public final PowerManager A00;
    public final /* synthetic */ LayoutInflaterFactory2C52042a4 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q5Z(Context context, LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4) {
        super(layoutInflaterFactory2C52042a4);
        this.A01 = layoutInflaterFactory2C52042a4;
        this.A00 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
