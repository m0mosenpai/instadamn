package com.facebook.profilo.provider.class_load;

import X.C0JW;
import X.C0JX;
import X.C0VQ;
import X.C0f9;
import android.util.Log;
import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ClassLoadProvider extends C0VQ {
    public static final int A01 = ProvidersRegistry.A00.A02("class_load");
    public C0JX A00;

    public ClassLoadProvider() {
        super(null);
        final MultiBufferLogger A02 = A02();
        this.A00 = new C0JX(A02) { // from class: X.0yw
            public final MultiBufferLogger A00;

            @Override // X.C0JX
            public final void AHM(String str, Class cls) {
                this.A00.writeStandardEntry(6, 81, 0L, 0, 0, 0, ClassId.getClassId(cls));
            }

            @Override // X.C0JX
            public final void AHN(String str) {
                this.A00.writeStandardEntry(6, 82, 0L, 0, 0, 0, 0L);
            }

            @Override // X.C0JX
            public final void AHO(String str) {
                this.A00.writeStandardEntry(6, 80, 0L, 0, 0, 0, 0L);
            }

            {
                this.A00 = A02;
            }
        };
    }

    @Override // X.C0VQ
    public final int getSupportedProviders() {
        return A01;
    }

    @Override // X.C0VQ
    public final void disable() {
        int A03 = C0f9.A03(-1042262447);
        C0JW A00 = C0JW.A00();
        if (A00 != null) {
            C0JX c0jx = this.A00;
            synchronized (A00) {
                AtomicReference atomicReference = A00.A05;
                ArrayList arrayList = new ArrayList(((ArrayList) atomicReference.get()).size() - 1);
                Iterator it = ((ArrayList) atomicReference.get()).iterator();
                while (it.hasNext()) {
                    C0JX c0jx2 = (C0JX) it.next();
                    if (c0jx2 != c0jx) {
                        arrayList.add(c0jx2);
                    }
                }
                atomicReference.set(arrayList);
                if (((ArrayList) atomicReference.get()).isEmpty()) {
                    ClassLoader classLoader = A00.A00;
                    if (classLoader.toString().startsWith("dalvik.system.PathClassLoader") && (classLoader.getParent() instanceof C0JW)) {
                        try {
                            A00.A03.set(classLoader, A00.A01);
                            A00.A06 = false;
                            Log.w("PluginClassLoader", "Uninstalled PluginClassLoader");
                        } catch (IllegalAccessException unused) {
                            Log.w("PluginClassLoader", "Failed to uninstall PluginClassLoader");
                        }
                    } else {
                        Log.w("PluginClassLoader", "Non-standard class loader chain. PluginClassLoader will not be uninstalled");
                    }
                }
            }
        }
        C0f9.A0A(-1174448314, A03);
    }

    @Override // X.C0VQ
    public final void enable() {
        int A03 = C0f9.A03(849025068);
        C0JW A00 = C0JW.A00();
        if (A00 != null) {
            A00.A01(this.A00);
        }
        C0f9.A0A(-1867853427, A03);
    }

    @Override // X.C0VQ
    public final int getTracingProviders() {
        boolean z;
        C0JW A00 = C0JW.A00();
        int i = A01;
        if ((TraceEvents.sProviders & i) != 0 && A00 != null) {
            synchronized (A00) {
                z = A00.A06;
            }
            if (z) {
                return i;
            }
            return 0;
        }
        return 0;
    }
}
