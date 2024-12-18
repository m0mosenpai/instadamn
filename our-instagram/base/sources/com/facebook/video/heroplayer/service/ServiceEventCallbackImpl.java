package com.facebook.video.heroplayer.service;

import X.AbstractC459729h;
import X.AbstractC53312cF;
import X.C29Y;
import X.C97144Xz;
import X.EnumC53322cG;
import X.EnumC61171RgX;
import X.InterfaceC460229m;
import com.facebook.exoplayer.ipc.VideoPlayerServiceEvent;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class ServiceEventCallbackImpl implements VpsEventCallback {
    public String A00;
    public final InterfaceC460229m A01;
    public final AtomicReference A02;

    @Override // com.facebook.exoplayer.monitor.VpsEventCallback
    public final void callback(AbstractC53312cF abstractC53312cF) {
        C29Y c29y = (C29Y) this.A02.get();
        EnumC53322cG enumC53322cG = abstractC53312cF.A00;
        if (c29y != null) {
            c29y.ATC(abstractC53312cF, enumC53322cG.A00);
        } else {
            AbstractC459729h.A01("ServiceEventCallbackImpl", "skipping log because listener is null", new Object[0]);
        }
    }

    @Override // com.facebook.exoplayer.monitor.VpsEventCallback
    public void errorCallback(String str, String str2, String str3) {
        callback(new C97144Xz(this.A00, str, str2, str3));
    }

    public ServiceEventCallbackImpl(InterfaceC460229m interfaceC460229m, AtomicReference atomicReference) {
        this.A02 = atomicReference;
        this.A01 = interfaceC460229m;
        this.A00 = "";
        StringBuilder sb = new StringBuilder();
        sb.append("setting listener for event callback to: ");
        sb.append(atomicReference);
        AbstractC459729h.A01("ServiceEventCallbackImpl", sb.toString(), new Object[0]);
    }

    public ServiceEventCallbackImpl(InterfaceC460229m interfaceC460229m, String str, AtomicReference atomicReference) {
        this.A02 = atomicReference;
        this.A01 = interfaceC460229m;
        this.A00 = str == null ? "" : str;
        StringBuilder sb = new StringBuilder();
        sb.append("setting listener for event callback to: ");
        sb.append(atomicReference);
        AbstractC459729h.A01("ServiceEventCallbackImpl", sb.toString(), new Object[0]);
    }

    @Override // com.facebook.exoplayer.monitor.VpsEventCallback
    public final void callback(EnumC61171RgX enumC61171RgX, VideoPlayerServiceEvent videoPlayerServiceEvent) {
        AbstractC459729h.A01("ServiceEventCallbackImpl", "skipping log because listener is null for event type: ", new Object[0]);
    }
}
