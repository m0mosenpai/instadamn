package X;

import android.os.Handler;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineMaskEffectAdapter;
import com.facebook.cameracore.ardelivery.xplat.effectmanager.XplatEffectManager;
import com.facebook.cameracore.ardelivery.xplat.models.XplatEffectLoggingInfo;
import com.facebook.cameracore.ardelivery.xplat.models.XplatModelManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.models.XplatModelPaths;
import com.facebook.common.callercontext.CallerContextable;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.ar.core.voltron.IgArVoltronModuleLoader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6pL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150156pL implements CallerContextable {
    public static final String __redex_internal_original_name = "XplatCameraCoreEffectManager";
    public InterfaceC150176pN A00;
    public String A01;
    public final C150136pI A02;
    public final AbstractC150536q2 A03;
    public final XplatEffectManager A05;
    public final C150026oy A06;
    public final List A07;
    public final ScheduledExecutorService A08;
    public final C150186pQ A0A;
    public final C149886oh A0B;
    public final boolean A0C;
    public final InterfaceC150176pN A09 = new InterfaceC150176pN() { // from class: X.6pM
        @Override // X.InterfaceC150176pN
        public final boolean cancel() {
            return false;
        }
    };
    public final AREngineMaskEffectAdapter A04 = new Object();

    public static final InterfaceC150176pN A00(Handler handler, InterfaceC203698zY interfaceC203698zY, AREngineMaskEffectAdapter aREngineMaskEffectAdapter, C150156pL c150156pL, C1819185b c1819185b, List list, boolean z) {
        InterfaceC150176pN A01;
        if (c150156pL.A0C) {
            synchronized (c150156pL) {
                A01 = c150156pL.A01(handler, interfaceC203698zY, aREngineMaskEffectAdapter, c1819185b, list, z);
            }
            return A01;
        }
        return c150156pL.A01(handler, interfaceC203698zY, aREngineMaskEffectAdapter, c1819185b, list, z);
    }

    public final void A03(final C85Q c85q, List list, boolean z) {
        C14360o3.A0B(list, 0);
        C1819085a c1819085a = new C1819085a();
        c1819085a.A06 = z;
        C1819185b A00 = c1819085a.A00();
        C150186pQ c150186pQ = this.A0A;
        AbstractC150536q2 abstractC150536q2 = c150186pQ.A01;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EnumC120355cd mLFrameworkType = ((VersionedCapability) it.next()).getMLFrameworkType();
            if (mLFrameworkType != EnumC120355cd.CAFFE2 && mLFrameworkType == EnumC120355cd.PYTORCH && AbstractC14490oL.A0C(((C150526q1) abstractC150536q2).A00)) {
                hashSet.add(C150666qM.PYTORCH_VOLTRON_MODULE_NAME);
            }
        }
        final ListenableFuture A002 = C150186pQ.A00(c150186pQ, A00, new ArrayList(hashSet));
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((VersionedCapability) it2.next()).getXplatValue()));
        }
        this.A05.fetchLatestModels(arrayList, new XplatEffectLoggingInfo(z), z, new XplatModelManagerCompletionCallback() { // from class: X.86k
            @Override // com.facebook.cameracore.ardelivery.xplat.models.XplatModelManagerCompletionCallback
            public final void onSuccess(final XplatModelPaths xplatModelPaths) {
                C14360o3.A0B(xplatModelPaths, 0);
                try {
                    ListenableFuture listenableFuture = A002;
                    if (listenableFuture.isDone() && ((Boolean) listenableFuture.get()).booleanValue()) {
                        c85q.D6S(xplatModelPaths.aRModelPaths, null);
                        return;
                    }
                } catch (InterruptedException | ExecutionException unused) {
                }
                ListenableFuture listenableFuture2 = A002;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                ScheduledExecutorService scheduledExecutorService = this.A08;
                ListenableFuture A01 = C2OD.A01(listenableFuture2, scheduledExecutorService, timeUnit, 20L);
                final C85Q c85q2 = c85q;
                C2OD.A03(new C2JL() { // from class: X.88g
                    /* JADX WARN: Type inference failed for: r1v0, types: [X.SLV, java.lang.Object] */
                    @Override // X.C2JL
                    public final void onFailure(Throwable th) {
                        C14360o3.A0B(th, 0);
                        C85Q c85q3 = C85Q.this;
                        ?? obj = new Object();
                        obj.A00 = C05F.A05;
                        obj.A02 = th;
                        c85q3.D6S(null, obj.A00());
                    }

                    @Override // X.C2JL
                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                        C85Q.this.D6S(xplatModelPaths.aRModelPaths, null);
                    }
                }, A01, scheduledExecutorService);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [X.SLV, java.lang.Object] */
            @Override // com.facebook.cameracore.ardelivery.xplat.models.XplatModelManagerCompletionCallback
            public final void onFail(String str) {
                C85Q c85q2 = c85q;
                ?? obj = new Object();
                obj.A00 = C05F.A02;
                obj.A01 = str;
                c85q2.D6S(null, obj.A00());
            }
        });
    }

    public final void A04(InterfaceC142616cN interfaceC142616cN) {
        C14360o3.A0B(interfaceC142616cN, 0);
        C150136pI c150136pI = this.A02;
        WeakHashMap weakHashMap = new WeakHashMap(c150136pI.A03);
        weakHashMap.put(interfaceC142616cN, true);
        c150136pI.A03 = weakHashMap;
        c150136pI.A03.size();
    }

    public final void A05(C1819185b c1819185b, String str, String str2) {
        C14360o3.A0B(str, 1);
        C150136pI c150136pI = this.A02;
        if (!c1819185b.A02) {
            String str3 = c1819185b.A03;
            InterfaceC201488vd A00 = C150136pI.A00(c150136pI, str3);
            if (A00 != null) {
                C150136pI.A02(A00.onStartEvent(0, c1819185b.A00, c1819185b.A01, str3, c1819185b.A06, str, str2, c1819185b.A04));
            } else {
                InterfaceC150356pk interfaceC150356pk = c150136pI.A00;
                if (interfaceC150356pk != null) {
                    String str4 = c1819185b.A00;
                    long instanceIdWithString = interfaceC150356pk.getInstanceIdWithString(16321564, str4);
                    interfaceC150356pk.startWithFlowInstanceId(instanceIdWithString, str4, c1819185b.A01, str3, c1819185b.A06, str, str2, c1819185b.A04);
                    interfaceC150356pk.markPoint(instanceIdWithString, 0, str4);
                    interfaceC150356pk.annotate(instanceIdWithString, "oc_ar_xlogger", "false", str4);
                }
            }
            C150136pI.A01(c150136pI, c1819185b.A00);
        }
    }

    public final void A06(String str) {
        InterfaceC150176pN interfaceC150176pN;
        InterfaceC150176pN interfaceC150176pN2;
        C14360o3.A0B(str, 0);
        if (this.A0C) {
            synchronized (this) {
                if (str.equals(this.A01) && (interfaceC150176pN2 = this.A00) != null) {
                    interfaceC150176pN2.cancel();
                    this.A00 = null;
                    this.A01 = null;
                }
            }
            return;
        }
        if (str.equals(this.A01) && (interfaceC150176pN = this.A00) != null) {
            interfaceC150176pN.cancel();
            this.A00 = null;
            this.A01 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r1 != X.EnumC150766qZ.WITHDRAWN) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0136, code lost:
    
        if (r6 == null) goto L107;
     */
    /* JADX WARN: Type inference failed for: r1v19, types: [X.SLV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [X.SLV, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.InterfaceC150176pN A01(android.os.Handler r28, X.InterfaceC203698zY r29, com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineMaskEffectAdapter r30, final X.C1819185b r31, java.util.List r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C150156pL.A01(android.os.Handler, X.8zY, com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineMaskEffectAdapter, X.85b, java.util.List, boolean):X.6pN");
    }

    public static final void A02(InterfaceC203698zY interfaceC203698zY, RkH rkH, C150156pL c150156pL, C1819185b c1819185b) {
        C150136pI c150136pI = c150156pL.A02;
        if (!c1819185b.A02) {
            InterfaceC201488vd A00 = C150136pI.A00(c150136pI, c1819185b.A03);
            String str = "";
            if (A00 != null) {
                String str2 = c1819185b.A00;
                int intValue = rkH.A00.intValue();
                if (rkH.getMessage() != null) {
                    str = rkH.getMessage();
                }
                C150136pI.A02(A00.onFailureEvent(1, str2, "ar_delivery", intValue, AnonymousClass001.A0R("Effect fetch failed, reason: ", str)));
            } else {
                InterfaceC150356pk interfaceC150356pk = c150136pI.A00;
                if (interfaceC150356pk != null) {
                    long instanceIdWithString = interfaceC150356pk.getInstanceIdWithString(16321564, c1819185b.A00);
                    int intValue2 = rkH.A00.intValue();
                    if (rkH.getMessage() != null) {
                        str = rkH.getMessage();
                    }
                    interfaceC150356pk.endFail(instanceIdWithString, "ar_delivery", intValue2, AnonymousClass001.A0R("Effect fetch failed, reason: ", str));
                }
            }
        }
        interfaceC203698zY.DFx(rkH);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineMaskEffectAdapter, java.lang.Object] */
    public C150156pL(C149946on c149946on, C150136pI c150136pI, AbstractC150536q2 abstractC150536q2, C150666qM c150666qM, XplatEffectManager xplatEffectManager, C149886oh c149886oh, C150026oy c150026oy, IgArVoltronModuleLoader igArVoltronModuleLoader, List list, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.A05 = xplatEffectManager;
        this.A08 = scheduledExecutorService;
        this.A03 = abstractC150536q2;
        this.A07 = list;
        this.A02 = c150136pI;
        this.A06 = c150026oy;
        this.A0B = c149886oh;
        this.A0C = z;
        this.A0A = new C150186pQ(c149946on, abstractC150536q2, c150666qM, igArVoltronModuleLoader, scheduledExecutorService);
    }
}
