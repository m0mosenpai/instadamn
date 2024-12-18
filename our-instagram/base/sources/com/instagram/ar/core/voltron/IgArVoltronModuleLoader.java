package com.instagram.ar.core.voltron;

import X.AbstractC12990ll;
import X.C14360o3;
import X.C150676qO;
import X.C1820185l;
import X.C1U2;
import X.C9EI;
import X.EnumC27091Ti;
import X.InterfaceC1819985j;
import X.InterfaceC1820085k;
import com.instagram.ar.core.voltron.IgArVoltronModuleLoader;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class IgArVoltronModuleLoader {
    public static final C150676qO Companion = new Object();
    public static final String TAG = "IgArVoltronModuleLoader";
    public boolean arePytorchModulesLoaded;
    public final Map loaderMap;
    public final AbstractC12990ll session;

    public /* synthetic */ IgArVoltronModuleLoader(AbstractC12990ll abstractC12990ll, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC12990ll);
    }

    public final synchronized InterfaceC1820085k getModuleLoader(EnumC27091Ti enumC27091Ti) {
        InterfaceC1820085k interfaceC1820085k;
        C14360o3.A0B(enumC27091Ti, 0);
        interfaceC1820085k = (InterfaceC1820085k) this.loaderMap.get(enumC27091Ti);
        if (interfaceC1820085k == null) {
            interfaceC1820085k = new C1820185l(this.session, enumC27091Ti);
            this.loaderMap.put(enumC27091Ti, interfaceC1820085k);
        }
        return interfaceC1820085k;
    }

    public void loadModule(String str, final InterfaceC1819985j interfaceC1819985j) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(interfaceC1819985j, 1);
        EnumEntries enumEntries = EnumC27091Ti.A02;
        final EnumC27091Ti A00 = C1U2.A00(str);
        getModuleLoader(A00).Chc(new InterfaceC1819985j() { // from class: X.85m
            @Override // X.InterfaceC1819985j
            public final void DG7(boolean z, Throwable th) {
                interfaceC1819985j.DG7(z, th);
            }

            @Override // X.InterfaceC1819985j
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                String str2;
                EnumC27091Ti enumC27091Ti = A00;
                C80C c80c = C80C.$redex_init_class;
                int ordinal = enumC27091Ti.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 5) {
                        try {
                            C09170dP.A0D("slam-native", 16);
                        } catch (UnsatisfiedLinkError e) {
                            e = e;
                            str2 = "SoLoader dynamic slam-native library exception:";
                            C0K8.A0J(IgArVoltronModuleLoader.TAG, str2, e);
                            interfaceC1819985j.DG7(false, e);
                            return;
                        }
                    }
                } else {
                    try {
                        C09170dP.A0D("dynamic_pytorch_impl", 16);
                        C09170dP.A0D("torch-code-gen", 16);
                        C09170dP.A0D("aten_vulkan", 16);
                        C09170dP.A0D("gans-ops-xplat", 16);
                        C09170dP.A0D("torchvision-ops", 16);
                        C09170dP.A0D("pytorch_jni", 16);
                        C09170dP.A0D("pytorch_jni_lite", 16);
                        this.arePytorchModulesLoaded = true;
                    } catch (UnsatisfiedLinkError e2) {
                        e = e2;
                        str2 = "SoLoader dynamic pytorch library exception:";
                        C0K8.A0J(IgArVoltronModuleLoader.TAG, str2, e);
                        interfaceC1819985j.DG7(false, e);
                        return;
                    }
                }
                interfaceC1819985j.onSuccess(obj);
            }
        });
    }

    public void prefetchModules(Collection collection) {
    }

    public static final synchronized IgArVoltronModuleLoader getInstance(AbstractC12990ll abstractC12990ll) {
        IgArVoltronModuleLoader igArVoltronModuleLoader;
        synchronized (IgArVoltronModuleLoader.class) {
            synchronized (Companion) {
                C14360o3.A0B(abstractC12990ll, 0);
                igArVoltronModuleLoader = (IgArVoltronModuleLoader) abstractC12990ll.A01(IgArVoltronModuleLoader.class, new C9EI(abstractC12990ll, 22));
            }
        }
        return igArVoltronModuleLoader;
    }

    public final boolean getArePytorchModulesLoaded() {
        return this.arePytorchModulesLoaded;
    }

    public IgArVoltronModuleLoader(AbstractC12990ll abstractC12990ll) {
        this.session = abstractC12990ll;
        this.loaderMap = new EnumMap(EnumC27091Ti.class);
    }

    public final void setArePytorchModulesLoaded(boolean z) {
        this.arePytorchModulesLoaded = z;
    }
}
