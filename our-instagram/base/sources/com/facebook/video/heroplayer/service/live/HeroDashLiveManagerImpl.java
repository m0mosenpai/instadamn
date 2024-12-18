package com.facebook.video.heroplayer.service.live;

import X.C2A4;
import X.C46272Ao;
import X.C46302As;
import X.InterfaceC460229m;
import X.InterfaceC460429o;
import android.content.Context;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class HeroDashLiveManagerImpl {
    public final C46302As A00;
    public final ServiceEventCallbackImpl A01;

    public HeroDashLiveManagerImpl(Context context, HeroPlayerSetting heroPlayerSetting, InterfaceC460229m interfaceC460229m, AtomicReference atomicReference, C2A4 c2a4, InterfaceC460429o interfaceC460429o) {
        this.A00 = new C46302As(context, c2a4, new C46272Ao(null), heroPlayerSetting.A0w, heroPlayerSetting, interfaceC460429o);
        this.A01 = new ServiceEventCallbackImpl(interfaceC460229m, atomicReference);
    }
}
