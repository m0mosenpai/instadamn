package com.facebook.cameracore.mediapipeline.arengineservices.modules;

import X.AnonymousClass001;
import X.AnonymousClass904;
import X.BDA;
import X.C0Gd;
import X.InterfaceC1820085k;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class DynamicServiceModule extends ServiceModule {
    public ServiceModule mBaseModule;
    public final C0Gd mErrorReporter;
    public final BDA mModule;
    public final InterfaceC1820085k mModuleLoader;

    private synchronized ServiceModule getBaseInstance() {
        if (this.mBaseModule == null) {
            try {
                InterfaceC1820085k interfaceC1820085k = this.mModuleLoader;
                if (interfaceC1820085k != null) {
                    interfaceC1820085k.ASl();
                }
                this.mBaseModule = (ServiceModule) Class.forName(this.mModule.BUh()).asSubclass(ServiceModule.class).newInstance();
            } catch (Exception e) {
                C0Gd c0Gd = this.mErrorReporter;
                if (c0Gd != null) {
                    c0Gd.EmP("DynamicServiceModule", AnonymousClass001.A0R("ServiceModule instance creation failed for ", this.mModule.BUh()), e);
                }
            }
        }
        return this.mBaseModule;
    }

    private native HybridData initHybrid(int i);

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(AnonymousClass904 anonymousClass904) {
        ServiceModule baseInstance;
        if (!this.mModule.CVz(anonymousClass904) || (baseInstance = getBaseInstance()) == null) {
            return null;
        }
        return baseInstance.createConfiguration(anonymousClass904);
    }

    public DynamicServiceModule(BDA bda, InterfaceC1820085k interfaceC1820085k, C0Gd c0Gd) {
        this.mModule = bda;
        this.mModuleLoader = interfaceC1820085k;
        this.mErrorReporter = c0Gd;
        this.mHybridData = initHybrid(bda.Btj().A00);
    }
}
