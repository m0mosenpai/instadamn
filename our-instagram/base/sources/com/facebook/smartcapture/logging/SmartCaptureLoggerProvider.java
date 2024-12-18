package com.facebook.smartcapture.logging;

import android.content.Context;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public interface SmartCaptureLoggerProvider extends Parcelable {
    SmartCaptureLogger get(Context context);
}
