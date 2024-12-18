package X;

import com.facebook.cameracore.mediapipeline.services.locale.LocaleDataSource;

/* renamed from: X.902, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass902 implements LocaleDataSource {
    public String A00;

    @Override // com.facebook.cameracore.mediapipeline.services.locale.LocaleDataSource
    public final String getDeviceLocaleIdentifier() {
        return this.A00;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.locale.LocaleDataSource
    public final void setDeviceLocaleIdentifier(String str) {
        this.A00 = str;
    }
}
