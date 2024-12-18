package X;

import android.app.PendingIntent;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.SJz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62642SJz {
    public static RP1 A00(Bundle bundle) {
        int i = bundle.getInt(ST2.A00(0, 10, 79));
        int i2 = bundle.getInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        int i3 = bundle.getInt(TraceFieldType.ErrorCode);
        long j = bundle.getLong("bytes_downloaded");
        long j2 = bundle.getLong("total_bytes_to_download");
        return new RP1((PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), bundle.getParcelableArrayList("split_file_intents"), i, i2, i3, j, j2);
    }

    public final ArrayList A01() {
        List list = ((RP1) this).A06;
        if (list != null) {
            return AbstractC166987dD.A1F(list);
        }
        return AbstractC166987dD.A1E();
    }
}
