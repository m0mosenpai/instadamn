package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.common.collect.ImmutableList;

/* renamed from: X.SQz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62781SQz {
    public static C64026Sxy create() {
        C64026Sxy c64026Sxy = new C64026Sxy();
        c64026Sxy.A00.A05("supported_compressions", ImmutableList.of((Object) NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, (Object) "TAR_BROTLI"));
        return c64026Sxy;
    }
}
