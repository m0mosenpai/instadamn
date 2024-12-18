package com.google.android.gms.common.api.internal;

import X.AbstractC72480Xeh;
import X.AbstractDialogInterfaceOnCancelListenerC1336061o;
import X.C61n;
import X.InterfaceC65566Tms;
import X.SER;
import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class LifecycleCallback {
    public final InterfaceC65566Tms A00;

    public LifecycleCallback(InterfaceC65566Tms interfaceC65566Tms) {
        this.A00 = interfaceC65566Tms;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r0 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (r0 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r2 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC65566Tms A00(java.lang.Object r5) {
        /*
            boolean r0 = r5 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L48
            androidx.fragment.app.FragmentActivity r5 = (androidx.fragment.app.FragmentActivity) r5
            java.lang.String r4 = "SupportLifecycleFragmentImpl"
            java.util.WeakHashMap r3 = X.Q86.A03
            java.lang.Object r0 = r3.get(r5)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L1a
            java.lang.Object r2 = r0.get()
            X.Q86 r2 = (X.Q86) r2
            if (r2 != 0) goto L90
        L1a:
            X.0h2 r0 = r5.getSupportFragmentManager()     // Catch: java.lang.ClassCastException -> L3f
            androidx.fragment.app.Fragment r2 = r0.A0Q(r4)     // Catch: java.lang.ClassCastException -> L3f
            X.Q86 r2 = (X.Q86) r2     // Catch: java.lang.ClassCastException -> L3f
            if (r2 == 0) goto L2a
            boolean r0 = r2.mRemoving
            if (r0 == 0) goto L88
        L2a:
            X.Q86 r2 = new X.Q86
            r2.<init>()
            X.0h2 r1 = r5.getSupportFragmentManager()
            X.0no r0 = new X.0no
            r0.<init>(r1)
            r0.A0B(r2, r4)
            r0.A01()
            goto L88
        L3f:
            r2 = move-exception
            java.lang.String r1 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L48:
            boolean r0 = r5 instanceof android.app.Activity
            if (r0 == 0) goto L9a
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.String r1 = "LifecycleFragmentImpl"
            java.util.WeakHashMap r3 = X.Q10.A03
            java.lang.Object r0 = r3.get(r5)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L62
            java.lang.Object r2 = r0.get()
            X.Q10 r2 = (X.Q10) r2
            if (r2 != 0) goto L90
        L62:
            android.app.FragmentManager r0 = r5.getFragmentManager()     // Catch: java.lang.ClassCastException -> L91
            android.app.Fragment r2 = r0.findFragmentByTag(r1)     // Catch: java.lang.ClassCastException -> L91
            X.Q10 r2 = (X.Q10) r2     // Catch: java.lang.ClassCastException -> L91
            if (r2 == 0) goto L74
            boolean r0 = r2.isRemoving()
            if (r0 == 0) goto L88
        L74:
            X.Q10 r2 = new X.Q10
            r2.<init>()
            android.app.FragmentManager r0 = r5.getFragmentManager()
            android.app.FragmentTransaction r0 = r0.beginTransaction()
            android.app.FragmentTransaction r0 = r0.add(r2, r1)
            r0.commitAllowingStateLoss()
        L88:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r3.put(r5, r0)
        L90:
            return r2
        L91:
            r2 = move-exception
            java.lang.String r1 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L9a:
            java.lang.String r1 = "Can't get fragment for unexpected activity."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.A00(java.lang.Object):X.Tms");
    }

    public void A06() {
    }

    public void A07() {
    }

    public void A08(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public static InterfaceC65566Tms getChimeraLifecycleFragmentImpl(AbstractC72480Xeh abstractC72480Xeh) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public final void A02() {
        if (this instanceof C61n) {
            C61n c61n = (C61n) this;
            if (!c61n.A00.isEmpty()) {
                c61n.A01.A07(c61n);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.AbstractDialogInterfaceOnCancelListenerC1336061o
            if (r0 == 0) goto L35
            r4 = r8
            X.61o r4 = (X.AbstractDialogInterfaceOnCancelListenerC1336061o) r4
            java.util.concurrent.atomic.AtomicReference r3 = r4.A01
            java.lang.Object r5 = r3.get()
            X.SER r5 = (X.SER) r5
            r7 = 1
            if (r9 == r7) goto L36
            r0 = 2
            if (r9 != r0) goto L5d
            com.google.android.gms.common.GoogleApiAvailability r2 = r4.A00
            X.Tms r0 = r4.A00
            android.app.Activity r1 = r0.BN7()
            X.C3U5.A02(r1)
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.A03(r1, r0)
            if (r2 == 0) goto L62
            if (r5 == 0) goto L35
            com.google.android.gms.common.ConnectionResult r0 = r5.A01
            int r1 = r0.A01
            r0 = 18
            if (r1 != r0) goto L5f
            if (r2 != r0) goto L5f
        L35:
            return
        L36:
            r0 = -1
            if (r10 == r0) goto L62
            if (r10 != 0) goto L5d
            if (r5 == 0) goto L35
            r2 = 13
            if (r11 == 0) goto L47
            java.lang.String r0 = "<<ResolutionFailureErrorDetail>>"
            int r2 = r11.getIntExtra(r0, r2)
        L47:
            r1 = 0
            com.google.android.gms.common.ConnectionResult r0 = r5.A01
            java.lang.String r0 = r0.toString()
            com.google.android.gms.common.ConnectionResult r6 = new com.google.android.gms.common.ConnectionResult
            r6.<init>(r1, r0, r7, r2)
        L53:
            int r1 = r5.A00
            r0 = 0
            r3.set(r0)
            r4.A0A(r6, r1)
            return
        L5d:
            if (r5 == 0) goto L35
        L5f:
            com.google.android.gms.common.ConnectionResult r6 = r5.A01
            goto L53
        L62:
            r0 = 0
            r3.set(r0)
            r4.A09()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.A03(int, int, android.content.Intent):void");
    }

    public final void A04(Bundle bundle) {
        SER ser;
        if (this instanceof AbstractDialogInterfaceOnCancelListenerC1336061o) {
            AbstractDialogInterfaceOnCancelListenerC1336061o abstractDialogInterfaceOnCancelListenerC1336061o = (AbstractDialogInterfaceOnCancelListenerC1336061o) this;
            if (bundle != null) {
                AtomicReference atomicReference = abstractDialogInterfaceOnCancelListenerC1336061o.A01;
                if (bundle.getBoolean("resolving_error", false)) {
                    ser = new SER(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
                } else {
                    ser = null;
                }
                atomicReference.set(ser);
            }
        }
    }

    public final void A05(Bundle bundle) {
        SER ser;
        if ((this instanceof AbstractDialogInterfaceOnCancelListenerC1336061o) && (ser = (SER) ((AbstractDialogInterfaceOnCancelListenerC1336061o) this).A01.get()) != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", ser.A00);
            ConnectionResult connectionResult = ser.A01;
            bundle.putInt("failed_status", connectionResult.A01);
            bundle.putParcelable("failed_resolution", connectionResult.A02);
        }
    }
}
