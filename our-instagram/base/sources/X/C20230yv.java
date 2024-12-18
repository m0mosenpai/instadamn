package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.profilo.provider.atrace.Atrace;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20230yv extends C0VQ {
    public static final int A00 = ProvidersRegistry.A00.A02("atrace");

    @Override // X.C0VQ
    public final int getSupportedProviders() {
        return A00;
    }

    public C20230yv() {
        super("profilo_atrace");
    }

    @Override // X.C0VQ
    public final void disable() {
        Method method;
        int A03 = C0f9.A03(1420678510);
        MultiBufferLogger A02 = A02();
        TraceContext traceContext = this.A00;
        boolean z = false;
        if (traceContext != null) {
            z = traceContext.A08.A02("provider.atrace.use_syscall_for_safe_write", false);
        }
        if (Atrace.hasHacks(A02, z)) {
            Atrace.restoreSystraceNative(z);
            Field field = C0WI.A00;
            if (field != null && (method = C0WI.A01) != null) {
                try {
                    field.set(null, method.invoke(null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
        C0f9.A0A(-1450636393, A03);
    }

    @Override // X.C0VQ
    public final void enable() {
        Method method;
        int A03 = C0f9.A03(2059097745);
        MultiBufferLogger A02 = A02();
        TraceContext traceContext = this.A00;
        boolean z = false;
        if (traceContext != null) {
            z = traceContext.A08.A02("provider.atrace.use_syscall_for_safe_write", false);
        }
        if (Atrace.hasHacks(A02, z)) {
            Atrace.enableSystraceNative(z);
            Field field = C0WI.A00;
            if (field != null && (method = C0WI.A01) != null) {
                try {
                    field.set(null, method.invoke(null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
        C0f9.A0A(-252517447, A03);
    }

    @Override // X.C0VQ
    public final int getTracingProviders() {
        if (Atrace.isEnabled()) {
            return A00;
        }
        return 0;
    }
}
