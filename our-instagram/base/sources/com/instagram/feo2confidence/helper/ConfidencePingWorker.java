package com.instagram.feo2confidence.helper;

import X.AbstractC167017dG;
import X.AbstractC61808Ru2;
import X.C023409i;
import X.C0w9;
import X.C1114250g;
import X.C14360o3;
import X.C1GJ;
import X.C47699L4g;
import X.C51A;
import X.InterfaceC23621Ds;
import X.KK2;
import X.LI3;
import X.LVZ;
import X.SPT;
import X.SYR;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class ConfidencePingWorker extends CoroutineWorker {
    /* JADX WARN: Type inference failed for: r0v7, types: [X.1Tc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.L4g, java.lang.Object] */
    @Override // androidx.work.CoroutineWorker
    public final Object A03(InterfaceC23621Ds interfaceC23621Ds) {
        try {
            UserSession A08 = C023409i.A0A.A08(this);
            SPT spt = C47699L4g.A07;
            Context context = this.mAppContext;
            ?? obj = new Object();
            obj.A01 = context;
            obj.A00 = context.getApplicationContext().getContentResolver();
            LVZ lvz = new LVZ(obj, 2);
            obj.A04 = lvz;
            ?? obj2 = new Object();
            obj2.A00 = lvz;
            obj.A03 = obj2;
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            obj.A02 = packageManager;
            obj.A06 = new LI3(obj.A00, AbstractC61808Ru2.A00(packageManager), obj.A03, obj.A04);
            obj.A05 = new SYR(obj.A01, obj.A02);
            C14360o3.A0C(A08, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
            C1GJ.A03(new KK2(1, obj, A08));
            return new C51A();
        } catch (Exception e) {
            C0w9.A06("ConfidencePingWorker", "Exception upon do work", e);
            return new C1114250g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidencePingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC167017dG.A1P(context, workerParameters);
    }
}
