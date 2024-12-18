package com.facebook.rsys.callmanager.callclient.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.callmanager.gen.Call;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.crypto.gen.CryptoProxy;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;
import com.facebook.rsys.mediastats.gen.MediaStatsProxy;
import com.facebook.rsys.tslog.gen.TslogProxy;
import com.facebook.rsys.videorender.gen.VideoRenderProxy;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsProxy;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class CallClient {
    public abstract McfReference getAppCallClient();

    public abstract AudioProxy getAudio();

    public abstract CameraProxy getCamera();

    public abstract CryptoProxy getCrypto();

    public abstract GroupExpansionProxy getGroupExpansion();

    public abstract MediaStatsProxy getMediaStats();

    public abstract TslogProxy getTslog();

    public abstract VideoRenderProxy getVideoRenderer();

    public abstract VideoSubscriptionsProxy getVideoSubscriptions();

    public abstract void onCallEnded(Map map, CallEndedApi callEndedApi);

    public abstract void setApi(CallApi callApi);

    public abstract void setCall(Call call);
}
