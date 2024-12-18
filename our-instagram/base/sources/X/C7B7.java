package X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import java.util.List;

/* renamed from: X.7B7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7B7 implements C7B8 {
    @Override // X.C7B8
    public final void DqF(List list) {
        C14360o3.A0B(list, 0);
        DLog.d(DLogTag.DIRECT_HTTP.INSTANCE, "Successfully refreshed %d messages", Integer.valueOf(list.size()));
    }

    @Override // X.C7B8
    public final void DG4(String str) {
        DLog.d(DLogTag.DIRECT_HTTP.INSTANCE, "Unable to refresh messages reason: %s", str);
    }
}
