package X;

import android.content.Context;
import java.util.Arrays;

/* renamed from: X.8ei, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC191868ei implements Cloneable {
    public Context A00;
    public boolean A01;

    public final Object A00() {
        synchronized (this) {
            if (this.A01 || this.A00 == null) {
                return null;
            }
            synchronized (this) {
                if (!this.A01) {
                    this.A01 = true;
                }
            }
            return null;
        }
    }

    public final String A01() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(":");
        C191858eh c191858eh = (C191858eh) this;
        sb.append(Arrays.hashCode(new Object[]{c191858eh.A02, c191858eh.A03, c191858eh.A04}));
        return sb.toString();
    }
}
