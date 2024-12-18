package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext$RCTDeviceEventEmitter;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.queue.MessageQueueThread;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes10.dex */
public abstract class Q21 extends ContextWrapper {
    public InterfaceC65352Tig A00;
    public InterfaceC65352Tig A01;
    public SBM A02;
    public MessageQueueThread A03;
    public MessageQueueThread A04;
    public MessageQueueThread A05;
    public C62544SFv A06;
    public Integer A07;
    public WeakReference A08;
    public boolean A09;
    public LayoutInflater A0A;
    public final CopyOnWriteArraySet A0B;
    public final CopyOnWriteArraySet A0C;
    public final CopyOnWriteArraySet A0D;

    public final synchronized void A0C(C62544SFv c62544SFv) {
        if (this.A05 == null && this.A04 == null && this.A03 == null) {
            this.A06 = c62544SFv;
            this.A05 = c62544SFv.A02;
            this.A04 = c62544SFv.A01;
            this.A03 = c62544SFv.A00;
            this.A09 = true;
        } else {
            throw AbstractC166987dD.A14("Message queue threads already initialized");
        }
    }

    public static void A00(Q21 q21, Runnable runnable) {
        MessageQueueThread messageQueueThread = q21.A04;
        AbstractC05810Sj.A00(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }

    public final Activity A01() {
        if (this instanceof R3N) {
            return ((R3N) this).A01.A01();
        }
        WeakReference weakReference = this.A08;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public final CatalystInstance A02() {
        if (this instanceof R3N) {
            return ((R3N) this).A01.A02();
        }
        CatalystInstance catalystInstance = ((R3L) this).A00;
        AbstractC05810Sj.A00(catalystInstance);
        return catalystInstance;
    }

    public final JavaScriptModule A03(Class cls) {
        if (this instanceof R3N) {
            return ((R3N) this).A01.A03(cls);
        }
        R3L r3l = (R3L) this;
        if (r3l.A00 == null) {
            if (r3l.A01) {
                throw AbstractC166987dD.A14("Tried to access a JS module after the React instance was destroyed.");
            }
            throw AbstractC166987dD.A14("Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.");
        }
        SBM sbm = r3l.A02;
        if (sbm != null) {
            C73408YBu c73408YBu = C62856SUd.A00;
            if (c73408YBu.enableFabricRenderer() && c73408YBu.useFabricInterop() && sbm.A00.containsKey(cls)) {
                SBM sbm2 = r3l.A02;
                if (c73408YBu.enableFabricRenderer() && c73408YBu.useFabricInterop()) {
                    return (JavaScriptModule) sbm2.A00.get(cls);
                }
                return null;
            }
        }
        return r3l.A00.getJSModule(cls);
    }

    public final NativeModule A04(Class cls) {
        String str;
        if (this instanceof R3N) {
            return ((R3N) this).A01.A04(cls);
        }
        R3L r3l = (R3L) this;
        CatalystInstance catalystInstance = r3l.A00;
        if (catalystInstance == null) {
            if (r3l.A01) {
                str = "Trying to call native module after CatalystInstance has been destroyed!";
            } else {
                str = "Trying to call native module before CatalystInstance has been set!";
            }
            throw AbstractC166987dD.A14(str);
        }
        return catalystInstance.getNativeModule(cls);
    }

    public final InterfaceC65589TnT A05() {
        if (this instanceof R3N) {
            return ((R3N) this).A01.A05();
        }
        return null;
    }

    public final void A06() {
        if (this instanceof R3N) {
            ((R3N) this).A01.A06();
            return;
        }
        R3L r3l = (R3L) this;
        r3l.A01 = true;
        CatalystInstance catalystInstance = r3l.A00;
        if (catalystInstance == null) {
            return;
        }
        catalystInstance.destroy();
    }

    public final void A07() {
        if (this.A09) {
            MessageQueueThread messageQueueThread = this.A04;
            AbstractC05810Sj.A00(messageQueueThread);
            messageQueueThread.assertIsOnThread();
            return;
        }
        throw AbstractC166987dD.A14("Tried to call assertOnNativeModulesQueueThread() on an uninitialized ReactContext");
    }

    public final void A08() {
        this.A07 = C05F.A01;
        ReactMarker.logMarker(RhX.A1D);
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC65542TmH) it.next()).onHostPause();
            } catch (RuntimeException e) {
                A0D(e);
            }
        }
        ReactMarker.logMarker(RhX.A1C);
    }

    public final void A09(Activity activity) {
        this.A07 = C05F.A0C;
        this.A08 = AbstractC25225BEi.A16(activity);
        ReactMarker.logMarker(RhX.A1F);
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC65542TmH) it.next()).onHostResume();
            } catch (RuntimeException e) {
                A0D(e);
            }
        }
        ReactMarker.logMarker(RhX.A1E);
    }

    public final void A0A(InterfaceC65542TmH interfaceC65542TmH) {
        int intValue;
        if (this instanceof R3N) {
            ((R3N) this).A01.A0A(interfaceC65542TmH);
            return;
        }
        this.A0C.add(interfaceC65542TmH);
        if ((!A0F() && !A0I()) || (intValue = this.A07.intValue()) == 0 || intValue == 1) {
            return;
        }
        if (intValue == 2) {
            RunnableC64627TNj runnableC64627TNj = new RunnableC64627TNj(interfaceC65542TmH, this);
            MessageQueueThread messageQueueThread = this.A05;
            AbstractC05810Sj.A00(messageQueueThread);
            messageQueueThread.runOnQueue(runnableC64627TNj);
            return;
        }
        throw AbstractC166987dD.A14("Unhandled lifecycle state.");
    }

    public final void A0B(InterfaceC65542TmH interfaceC65542TmH) {
        if (this instanceof R3N) {
            ((R3N) this).A01.A0B(interfaceC65542TmH);
        } else {
            this.A0C.remove(interfaceC65542TmH);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (((com.facebook.react.bridge.CatalystInstanceImpl) r0).mDestroyed != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D(java.lang.Exception r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.R3N
            if (r0 == 0) goto Ld
            r0 = r5
            X.R3N r0 = (X.R3N) r0
            X.R3M r0 = r0.A01
            r0.A0D(r6)
            return
        Ld:
            r1 = r5
            X.R3L r1 = (X.R3L) r1
            com.facebook.react.bridge.CatalystInstance r0 = r1.A00
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L1e
            r3 = 1
            com.facebook.react.bridge.CatalystInstanceImpl r0 = (com.facebook.react.bridge.CatalystInstanceImpl) r0
            boolean r0 = r0.mDestroyed
            r2 = 1
            if (r0 == 0) goto L1f
        L1e:
            r2 = 0
        L1f:
            X.Tig r0 = r1.A01
            if (r0 != 0) goto L24
            r4 = 0
        L24:
            if (r2 == 0) goto L2c
            if (r4 == 0) goto L2c
            r0.handleException(r6)
            return
        L2c:
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Unable to handle Exception - catalystInstanceVariableExists: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " - isCatalystInstanceAlive: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " - hasExceptionHandler: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ReactNative"
            X.C0I2.A05(r0, r1, r6)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q21.A0D(java.lang.Exception):void");
    }

    public final void A0E(String str, Object obj) {
        ReactContext$RCTDeviceEventEmitter reactContext$RCTDeviceEventEmitter = (ReactContext$RCTDeviceEventEmitter) A03(ReactContext$RCTDeviceEventEmitter.class);
        if (reactContext$RCTDeviceEventEmitter != null) {
            reactContext$RCTDeviceEventEmitter.emit(str, obj);
        }
    }

    public final boolean A0F() {
        if (this instanceof R3N) {
            return ((R3N) this).A01.A0F();
        }
        CatalystInstance catalystInstance = ((R3L) this).A00;
        if (catalystInstance != null && !((CatalystInstanceImpl) catalystInstance).mDestroyed) {
            return true;
        }
        return false;
    }

    @Deprecated
    public final boolean A0G() {
        if (this instanceof R3N) {
            return ((R3N) this).A01.A0G();
        }
        return AbstractC167007dF.A1W(((R3L) this).A00);
    }

    public final boolean A0H() {
        if (this instanceof R3N) {
            return ((R3N) this).A01.A0H();
        }
        return AbstractC167007dF.A1W(((R3L) this).A00);
    }

    @Deprecated
    public final boolean A0I() {
        if (this instanceof R3N) {
            return ((R3N) this).A01.A0I();
        }
        return false;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            LayoutInflater layoutInflater = this.A0A;
            if (layoutInflater == null) {
                LayoutInflater cloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
                this.A0A = cloneInContext;
                return cloneInContext;
            }
            return layoutInflater;
        }
        return getBaseContext().getSystemService(str);
    }

    public Q21(Context context) {
        super(context);
        this.A0C = new CopyOnWriteArraySet();
        this.A0B = new CopyOnWriteArraySet();
        this.A0D = new CopyOnWriteArraySet();
        this.A07 = C05F.A00;
        this.A09 = false;
    }
}
