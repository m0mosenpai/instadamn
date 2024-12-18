package X;

import com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.instagram.InstagramARClassBenchmark;
import com.facebook.react.modules.intent.IntentModule;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.RbG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60901RbG extends C1P1 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InstagramARClassBenchmark A01;
    public final /* synthetic */ Object A02;

    public C60901RbG(InstagramARClassBenchmark instagramARClassBenchmark, Object obj, long j) {
        this.A01 = instagramARClassBenchmark;
        this.A00 = j;
        this.A02 = obj;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1577634211);
        super.onFail(abstractC115105If);
        C0f9.A0A(-366256476, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        Object obj2;
        int A03 = C0f9.A03(-1061519482);
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        int A032 = C0f9.A03(1056526515);
        if (anonymousClass435 != null && (obj2 = anonymousClass435.A01) != null) {
            if (((AbstractC907342m) obj2).A00(QH8.class, "arclass_benchmark_count") == null || r3.A00(QH8.class, "arclass_benchmark_count").A00.optInt(IntentModule.EXTRA_MAP_KEY_FOR_VALUE) < this.A00) {
                try {
                    Object obj3 = this.A02;
                    AbstractC58318PtA.A0t(obj3.getClass(), "startBenchmarks").invoke(obj3, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    this.A01.A02.EmP("InstagramARClassBenchmark", "AR Class benchmark invoke failed.", e);
                }
            }
            i = 284250860;
        } else {
            i = 1813625094;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-899709615, A03);
    }
}
