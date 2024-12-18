package com.facebook.pushlite;

import X.C63984SxA;
import X.QFc;
import android.app.IntentService;
import android.content.Intent;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class PushLiteFallbackJobService extends IntentService {
    public PushLiteFallbackJobService() {
        super("PushLiteFallbackJobService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        QFc.A03.A01(null, C63984SxA.A00, R.id.jobscheduler_pushlist_refresh_token_job);
    }
}
