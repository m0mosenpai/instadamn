package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.locale.LocaleDataSource;
import java.util.List;

/* renamed from: X.AWr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23346AWr implements LocaleDataSource, BCI {
    public String A00;

    @Override // X.BCI
    public final List Epm(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        if (bundle.containsKey("commandType") && bundle.getInt("commandType") == 0 && bundle.containsKey("locale")) {
            setDeviceLocaleIdentifier(String.valueOf(bundle.getString("locale")));
        }
        return null;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.locale.LocaleDataSource
    public final void setDeviceLocaleIdentifier(String str) {
        C14360o3.A0B(str, 0);
        this.A00 = str;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.locale.LocaleDataSource
    public final String getDeviceLocaleIdentifier() {
        return this.A00;
    }
}
