package X;

import android.content.Context;

/* loaded from: classes10.dex */
public final class SKO {
    public final InterfaceC216113n A00;

    public SKO(Context context, C61571Rpu c61571Rpu) {
        C14360o3.A0B(context, 1);
        this.A00 = new C216213o(new T87(context, c61571Rpu));
    }

    public final int A00() {
        Object obj = this.A00.get();
        if (obj != null) {
            SWU swu = (SWU) obj;
            C1UM c1um = swu.A02;
            if (c1um.getInt("activated", 0) == 0) {
                return c1um.getInt("native_version_override", swu.A01);
            }
            return c1um.getInt("activated", 0);
        }
        throw AbstractC166997dE.A0g();
    }
}
