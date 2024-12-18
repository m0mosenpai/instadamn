package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12320ka {
    public Context A00;
    public final List A01 = Arrays.asList("year_class", "network_downlink_bandwidth", TraceFieldType.NetworkType);

    public C12320ka(Context context) {
        this.A00 = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0kZ, java.lang.Object] */
    public final WFT A00(String str) {
        switch (str.hashCode()) {
            case -2007977226:
                if (str.equals("year_class")) {
                    Context context = this.A00;
                    ?? obj = new Object();
                    obj.A00 = context;
                    return obj.A00();
                }
                return new WFT("unknown_context");
            case -969618049:
                if (str.equals("network_downlink_bandwidth")) {
                    return AbstractC12300kY.A00();
                }
                return new WFT("unknown_context");
            case -19457365:
                if (str.equals(TraceFieldType.NetworkType)) {
                    return AbstractC12300kY.A01(this.A00);
                }
                return new WFT("unknown_context");
            default:
                return new WFT("unknown_context");
        }
    }
}
