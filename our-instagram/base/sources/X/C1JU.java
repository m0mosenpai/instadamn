package X;

import android.R;

/* renamed from: X.1JU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JU implements InterfaceC06820Xy {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0o4, X.0lj] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0o4, X.0lj] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0o4, X.0lj] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0lj, java.lang.Object] */
    @Override // X.InterfaceC06820Xy
    public final C0Xz AN5() {
        InterfaceC12970lj[] interfaceC12970ljArr = {new Object(), new AbstractC14370o4("is_video"), new AbstractC14370o4("is_cell"), new AbstractC14370o4("is_reels")};
        return new C0Xz("video_network_traffic_aggregation", new int[]{R.^attr-private.__removed5}, new C0Y3[]{new C0Y3(new AbstractC14370o4("total_request_time_ms")), new C0Y3(new AbstractC14370o4("total_connect_time_ms")), new C0Y3(new AbstractC14370o4("ttfb_ms")), new C0Y3(new AbstractC14370o4("ttlb_ms")), new C0Y3(new AbstractC14370o4("upstream_latency_ms")), new C0Y3(new AbstractC14370o4("request_body_bytes")), new C0Y3(new AbstractC14370o4("response_body_bytes")), new C0Y3(new AbstractC14370o4("response_body_bytes_on_wire")), new C0Y3(new AbstractC14370o4("is_new_connection"))}, interfaceC12970ljArr);
    }

    @Override // X.InterfaceC06820Xy
    public final boolean isEnabled() {
        return C20150ym.A07(AbstractC20100yh.A00(36330965148124259L));
    }
}
