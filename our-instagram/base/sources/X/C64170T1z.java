package X;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.T1z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64170T1z implements InterfaceC65502TlR {
    public final Context A00;

    public C64170T1z(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
    }

    @Override // X.InterfaceC65502TlR
    public final String CgW() {
        return "sm";
    }

    @Override // X.InterfaceC65502TlR
    public final HashMap E6N() {
        ApplicationInfo applicationInfo;
        HashMap A1G = AbstractC166987dD.A1G();
        Context context = this.A00;
        StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
        if (storageStatsManager == null || (applicationInfo = context.getApplicationInfo()) == null) {
            return null;
        }
        try {
            StorageStats queryStatsForUid = storageStatsManager.queryStatsForUid(applicationInfo.storageUuid, applicationInfo.uid);
            C14360o3.A07(queryStatsForUid);
            A1G.put("ustats", new C64168T1x(this, queryStatsForUid.getAppBytes(), queryStatsForUid.getDataBytes(), queryStatsForUid.getCacheBytes()));
        } catch (IOException unused) {
        }
        return A1G;
    }
}
