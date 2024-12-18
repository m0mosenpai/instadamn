package com.facebook.react.modules.core;

import X.AbstractC05810Sj;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.C00O;
import X.C0I2;
import X.C14360o3;
import X.C63150Sdx;
import X.C63255SgD;
import X.InterfaceC65622ToD;
import X.R3M;
import X.RunnableC64571TKi;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Set;

@ReactModule(name = NativeHeadlessJsTaskSupportSpec.NAME)
/* loaded from: classes10.dex */
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskFinished(double d) {
        Set set;
        Integer valueOf;
        boolean contains;
        int i = (int) d;
        C63150Sdx A00 = C63150Sdx.A00(AbstractC58321PtD.A0b(this));
        synchronized (A00) {
            set = A00.A02;
            valueOf = Integer.valueOf(i);
            contains = set.contains(valueOf);
        }
        if (contains) {
            synchronized (A00) {
                boolean remove = set.remove(valueOf);
                A00.A01.remove(valueOf);
                SparseArray sparseArray = A00.A00;
                Runnable runnable = (Runnable) sparseArray.get(i);
                if (runnable != null) {
                    C63255SgD.A00().removeCallbacks(runnable);
                    sparseArray.remove(i);
                }
                if (remove) {
                    C63255SgD.A01(new RunnableC64571TKi(A00));
                }
            }
            return;
        }
        C0I2.A02(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", valueOf);
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskRetry(double d, InterfaceC65622ToD interfaceC65622ToD) {
        Integer valueOf;
        boolean contains;
        C14360o3.A0B(interfaceC65622ToD, 1);
        int i = (int) d;
        C63150Sdx A00 = C63150Sdx.A00(AbstractC58321PtD.A0b(this));
        synchronized (A00) {
            Set set = A00.A02;
            valueOf = Integer.valueOf(i);
            contains = set.contains(valueOf);
        }
        if (contains) {
            synchronized (A00) {
                A00.A01.get(valueOf);
                AbstractC05810Sj.A03(false, AnonymousClass001.A0c("Tried to retrieve non-existent task config with id ", ".", i));
                throw C00O.createAndThrow();
            }
        }
        C0I2.A02(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", valueOf);
        interfaceC65622ToD.resolve(false);
    }

    public HeadlessJsTaskSupportModule(R3M r3m) {
        super(r3m);
    }
}
