package X;

import android.os.Handler;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineMaskEffectAdapter;
import com.facebook.cameracore.ardelivery.xplat.models.XplatEffectManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.models.XplatModelPaths;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8zf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203728zf extends XplatEffectManagerCompletionCallback {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ InterfaceC203698zY A01;
    public final /* synthetic */ ARRequestAsset A02;
    public final /* synthetic */ AREngineMaskEffectAdapter A03;
    public final /* synthetic */ C150156pL A04;
    public final /* synthetic */ C1819185b A05;
    public final /* synthetic */ ListenableFuture A06;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, X.8zi] */
    public final void A00(XplatModelPaths xplatModelPaths, C1819185b c1819185b, File file, List list, List list2) {
        Object obj;
        C14360o3.A0B(file, 0);
        if (!c1819185b.A02) {
            C150156pL c150156pL = this.A04;
            c150156pL.A00 = null;
            c150156pL.A01 = null;
        }
        HashMap hashMap = new HashMap();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (obj2 != null && (obj = list2.get(i)) != null) {
                hashMap.put(obj2, obj);
            }
            i = i2;
        }
        AREngineMaskEffectAdapter aREngineMaskEffectAdapter = this.A03;
        ARRequestAsset aRRequestAsset = this.A02;
        ?? obj3 = new Object();
        obj3.A00 = hashMap;
        String str = c1819185b.A01;
        String str2 = c1819185b.A00;
        final C203678zW aREngineEffect = aREngineMaskEffectAdapter.toAREngineEffect(file, xplatModelPaths, obj3, aRRequestAsset, str, str2);
        C150136pI c150136pI = this.A04.A02;
        if (!c1819185b.A02) {
            InterfaceC201488vd A00 = C150136pI.A00(c150136pI, c1819185b.A03);
            if (A00 != null) {
                C150136pI.A02(A00.onEvent(3, str2, false));
            } else {
                InterfaceC150356pk interfaceC150356pk = c150136pI.A00;
                if (interfaceC150356pk != null) {
                    interfaceC150356pk.markPoint(interfaceC150356pk.getInstanceIdWithString(16321564, str2), 1, str2);
                }
            }
        }
        Handler handler = this.A00;
        final InterfaceC203698zY interfaceC203698zY = this.A01;
        AbstractC203788zm.A00(handler, new Runnable() { // from class: X.8zl
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC203698zY.this.onSuccess(aREngineEffect);
            }
        });
    }

    public C203728zf(Handler handler, InterfaceC203698zY interfaceC203698zY, ARRequestAsset aRRequestAsset, AREngineMaskEffectAdapter aREngineMaskEffectAdapter, C150156pL c150156pL, C1819185b c1819185b, ListenableFuture listenableFuture) {
        this.A06 = listenableFuture;
        this.A05 = c1819185b;
        this.A04 = c150156pL;
        this.A01 = interfaceC203698zY;
        this.A00 = handler;
        this.A03 = aREngineMaskEffectAdapter;
        this.A02 = aRRequestAsset;
    }

    @Override // com.facebook.cameracore.ardelivery.xplat.models.XplatEffectManagerCompletionCallback
    public final void onFail(String str) {
        AbstractC203788zm.A00(this.A00, new RunnableC24820Ayg(this.A01, this.A04, this.A05, str));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.SLV, java.lang.Object] */
    @Override // com.facebook.cameracore.ardelivery.xplat.models.XplatEffectManagerCompletionCallback
    public final void onSuccess(String str, XplatModelPaths xplatModelPaths, List list, List list2) {
        List list3 = list2;
        List list4 = list;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(xplatModelPaths, 1);
        File file = new File(str);
        if (!file.exists()) {
            onFail("[ARD][%s] Effect file not found after successful xplat fetch completion.");
            return;
        }
        try {
            ListenableFuture listenableFuture = this.A06;
            if (listenableFuture.isDone() && ((Boolean) listenableFuture.get()).booleanValue()) {
                if (list == null) {
                    list4 = C16930sl.A00;
                }
                if (list2 == null) {
                    list3 = C16930sl.A00;
                }
                A00(xplatModelPaths, this.A05, file, list4, list3);
                return;
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C150156pL c150156pL = this.A04;
            ScheduledExecutorService scheduledExecutorService = c150156pL.A08;
            C2OD.A03(new C23552Ac6(this.A00, this.A01, this, c150156pL, xplatModelPaths, this.A05, file, list4, list3), C2OD.A01(listenableFuture, scheduledExecutorService, timeUnit, 20L), scheduledExecutorService);
        } catch (InterruptedException | ExecutionException e) {
            C150156pL c150156pL2 = this.A04;
            InterfaceC203698zY interfaceC203698zY = this.A01;
            C1819185b c1819185b = this.A05;
            ?? obj = new Object();
            obj.A00 = C05F.A05;
            obj.A02 = e;
            C150156pL.A02(interfaceC203698zY, obj.A00(), c150156pL2, c1819185b);
        }
    }
}
