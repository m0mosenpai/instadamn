package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.0TR, reason: invalid class name */
/* loaded from: classes.dex */
public interface C0TR {
    Collection getDataPoints();

    Map getIndexedDataPoints();

    boolean shouldCollectMetrics(int i);

    boolean shouldCollectMetrics(int i, C0TG c0tg);

    boolean supportsIndexedDataPoints();
}
