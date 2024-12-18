package X;

import java.io.Closeable;
import java.io.Serializable;
import java.util.HashSet;

/* loaded from: classes10.dex */
public final class SVl {
    public static final SVl A01 = new SVl();
    public final java.util.Set A00;

    public SVl() {
        HashSet A1H = AbstractC166987dD.A1H();
        this.A00 = A1H;
        A1H.add(Object.class.getName());
        A1H.add(Closeable.class.getName());
        A1H.add(Serializable.class.getName());
        A1H.add(AutoCloseable.class.getName());
        A1H.add(Cloneable.class.getName());
        A1H.add("java.util.logging.Handler");
        A1H.add("javax.naming.Referenceable");
        A1H.add("javax.sql.DataSource");
    }
}
