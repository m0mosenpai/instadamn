package X;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;

/* renamed from: X.LVx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48223LVx implements InterfaceC08240bm {
    public final InterfaceC16660sJ A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC08240bm
    public final void Dd8(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh) {
        int A1R = AbstractC167007dF.A1R(0, context, intent);
        if (intent.hasExtra("download_success")) {
            AbstractC25227BEk.A1Q(this.A00, intent.getBooleanExtra("download_success", false));
            return;
        }
        Object systemService = context.getSystemService("download");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        long longExtra = intent.getLongExtra("extra_download_id", 0L);
        DownloadManager.Query query = new DownloadManager.Query();
        long[] jArr = new long[A1R];
        jArr[0] = longExtra;
        Cursor query2 = ((DownloadManager) systemService).query(query.setFilterById(jArr));
        if (query2 == null) {
            return;
        }
        try {
            if (query2.moveToFirst()) {
                int i = query2.getInt(query2.getColumnIndex(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS));
                if (i != 8) {
                    if (i == 16) {
                        AbstractC25227BEk.A1Q(this.A00, false);
                    }
                } else {
                    AbstractC25227BEk.A1Q(this.A00, A1R);
                }
            }
            query2.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C20I.A00(query2, th);
                throw th2;
            }
        }
    }

    @Override // X.InterfaceC08240bm
    public final ArrayList BIr() {
        return AbstractC16960so.A1M(new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), new IntentFilter("com.meta.ai.notify.ACTION_DOWNLOAD_COMPLETE"));
    }

    public C48223LVx(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }
}
