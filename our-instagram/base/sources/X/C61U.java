package X;

import android.content.Context;
import android.os.Looper;

/* renamed from: X.61U, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C61U extends C61V {
    public InterfaceC1340663q A01(Context context, Looper looper, C69F c69f, C69H c69h, C1340363l c1340363l, Object obj) {
        if (this instanceof C61T) {
            return new AbstractC1340563o(context, looper, c69f, c69h, c1340363l, 258);
        }
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    @Deprecated
    public InterfaceC1340663q A00(Context context, Looper looper, C69E c69e, C69G c69g, C1340363l c1340363l, Object obj) {
        return A01(context, looper, c69e, c69g, c1340363l, obj);
    }
}
