package com.google.android.gms.common.internal;

import X.AbstractC128795rp;
import X.AbstractC128815rt;
import X.AbstractC43591JPw;
import X.AnonymousClass001;
import X.AnonymousClass641;
import X.C0f9;
import X.C125755mO;
import X.C128775rn;
import X.C1340463n;
import X.C206149Aw;
import X.C3U5;
import X.C61m;
import X.C64A;
import X.C64D;
import X.C64E;
import X.C64F;
import X.HandlerC1341163w;
import X.InterfaceC1341463z;
import X.MSV;
import X.S2M;
import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzf;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class BaseGmsClient {
    public static final Feature[] A0T = new Feature[0];
    public int A00;
    public int A01;
    public long A03;
    public long A04;
    public long A05;
    public C64A A07;
    public IGmsServiceBroker A08;
    public C64E A09;
    public IInterface A0C;
    public C64D A0D;
    public final int A0E;
    public final Context A0F;
    public final Handler A0G;
    public final InterfaceC1341463z A0H;
    public final AnonymousClass641 A0I;
    public final String A0L;
    public final Looper A0N;
    public final GoogleApiAvailabilityLight A0O;
    public final C61m A0P;
    public volatile String A0R;
    public volatile String A0S = null;
    public final Object A0J = new Object();
    public final Object A0K = new Object();
    public final ArrayList A0M = new ArrayList();
    public int A02 = 1;
    public ConnectionResult A06 = null;
    public boolean A0B = false;
    public volatile zzk A0Q = null;
    public AtomicInteger A0A = new AtomicInteger(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.content.ServiceConnection, X.64D] */
    public static final void A00(IInterface iInterface, final BaseGmsClient baseGmsClient, int i) {
        C64E c64e;
        boolean z = false;
        boolean z2 = true;
        if (i != 4) {
            z2 = false;
        }
        boolean z3 = true;
        if (iInterface == null) {
            z3 = false;
        }
        if (z2 == z3) {
            z = true;
        }
        C3U5.A07(z);
        synchronized (baseGmsClient.A0J) {
            baseGmsClient.A02 = i;
            baseGmsClient.A0C = iInterface;
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        C3U5.A02(iInterface);
                        baseGmsClient.A04 = System.currentTimeMillis();
                    }
                } else {
                    C64D c64d = baseGmsClient.A0D;
                    if (c64d != null && (c64e = baseGmsClient.A09) != null) {
                        Log.e("GmsClient", AnonymousClass001.A0u("Calling connect() while still connected, missing disconnect() for ", c64e.A00, " on ", "com.google.android.gms"));
                        C61m c61m = baseGmsClient.A0P;
                        C64E c64e2 = baseGmsClient.A09;
                        String str = c64e2.A00;
                        C3U5.A02(str);
                        c61m.A02(c64d, new C64F(str, c64e2.A01));
                        baseGmsClient.A0A.incrementAndGet();
                    }
                    AtomicInteger atomicInteger = baseGmsClient.A0A;
                    final int i2 = atomicInteger.get();
                    ?? r7 = new ServiceConnection(i2) { // from class: X.64D
                        public final int A00;

                        {
                            this.A00 = i2;
                        }

                        @Override // android.content.ServiceConnection
                        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                            IGmsServiceBroker zzadVar;
                            Handler handler;
                            Message obtainMessage;
                            int i3;
                            int i4;
                            BaseGmsClient baseGmsClient2 = BaseGmsClient.this;
                            if (iBinder == null) {
                                synchronized (baseGmsClient2.A0J) {
                                    i3 = baseGmsClient2.A02;
                                }
                                if (i3 == 3) {
                                    baseGmsClient2.A0B = true;
                                    i4 = 5;
                                } else {
                                    i4 = 4;
                                }
                                handler = baseGmsClient2.A0G;
                                obtainMessage = handler.obtainMessage(i4, baseGmsClient2.A0A.get(), 16);
                            } else {
                                synchronized (baseGmsClient2.A0K) {
                                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                    if (queryLocalInterface != null && (queryLocalInterface instanceof IGmsServiceBroker)) {
                                        zzadVar = (IGmsServiceBroker) queryLocalInterface;
                                    } else {
                                        zzadVar = new zzad(iBinder);
                                    }
                                    baseGmsClient2.A08 = zzadVar;
                                }
                                int i5 = this.A00;
                                C128775rn c128775rn = new C128775rn(baseGmsClient2, 0);
                                handler = baseGmsClient2.A0G;
                                obtainMessage = handler.obtainMessage(7, i5, -1, c128775rn);
                            }
                            handler.sendMessage(obtainMessage);
                        }

                        @Override // android.content.ServiceConnection
                        public final void onServiceDisconnected(ComponentName componentName) {
                            BaseGmsClient baseGmsClient2 = BaseGmsClient.this;
                            synchronized (baseGmsClient2.A0K) {
                                baseGmsClient2.A08 = null;
                            }
                            int i3 = this.A00;
                            Handler handler = baseGmsClient2.A0G;
                            handler.sendMessage(handler.obtainMessage(6, i3, 1));
                        }
                    };
                    baseGmsClient.A0D = r7;
                    C64E c64e3 = new C64E(baseGmsClient.A06(), baseGmsClient.A08());
                    baseGmsClient.A09 = c64e3;
                    boolean z4 = c64e3.A01;
                    if (z4 && baseGmsClient.getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(c64e3.A00)));
                    }
                    C61m c61m2 = baseGmsClient.A0P;
                    String str2 = c64e3.A00;
                    C3U5.A02(str2);
                    String str3 = baseGmsClient.A0L;
                    if (str3 == null) {
                        str3 = baseGmsClient.A0F.getClass().getName();
                    }
                    if (!c61m2.A03(r7, new C64F(str2, z4), str3)) {
                        Log.w("GmsClient", AnonymousClass001.A0u("unable to connect to service: ", baseGmsClient.A09.A00, " on ", "com.google.android.gms"));
                        int i3 = atomicInteger.get();
                        C128775rn c128775rn = new C128775rn(baseGmsClient, 16);
                        Handler handler = baseGmsClient.A0G;
                        handler.sendMessage(handler.obtainMessage(7, i3, -1, c128775rn));
                    }
                }
            } else {
                C64D c64d2 = baseGmsClient.A0D;
                if (c64d2 != null) {
                    C61m c61m3 = baseGmsClient.A0P;
                    C64E c64e4 = baseGmsClient.A09;
                    String str4 = c64e4.A00;
                    C3U5.A02(str4);
                    c61m3.A02(c64d2, new C64F(str4, c64e4.A01));
                    baseGmsClient.A0D = null;
                }
            }
        }
    }

    public boolean E6l() {
        return false;
    }

    public abstract int getMinApkVersion();

    public boolean requiresSignIn() {
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean A01(IInterface iInterface, BaseGmsClient baseGmsClient, int i, int i2) {
        synchronized (baseGmsClient.A0J) {
            if (baseGmsClient.A02 != i) {
                return false;
            }
            A00(iInterface, baseGmsClient, i2);
            return true;
        }
    }

    public Bundle A02() {
        return new Bundle();
    }

    public final IInterface A03() {
        IInterface iInterface;
        synchronized (this.A0J) {
            if (this.A02 != 5) {
                A07();
                iInterface = this.A0C;
                C3U5.A03(iInterface, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    public IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        if (queryLocalInterface instanceof zzf) {
            return queryLocalInterface;
        }
        zza zzaVar = new zza(iBinder);
        C0f9.A0A(657767852, C0f9.A03(-420895720));
        return zzaVar;
    }

    public String A05() {
        return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }

    public String A06() {
        return "com.google.android.gms.auth.blockstore.service.START";
    }

    public boolean A08() {
        if (!(this instanceof C1340463n) && getMinApkVersion() < 211700000) {
            return false;
        }
        return true;
    }

    public boolean A09() {
        if (this instanceof C1340463n) {
            return true;
        }
        return false;
    }

    public Feature[] A0A() {
        if (this instanceof C1340463n) {
            return AbstractC128815rt.A08;
        }
        return A0T;
    }

    public final void AJQ(C64A c64a) {
        C3U5.A03(c64a, "Connection progress callbacks cannot be null.");
        this.A07 = c64a;
        A00(null, this, 2);
    }

    public void APc(String str) {
        this.A0S = str;
        disconnect();
    }

    public final void BmV(IAccountAccessor iAccountAccessor, Set set) {
        Bundle A02 = A02();
        String str = this.A0R;
        Scope[] scopeArr = GetServiceRequest.A0F;
        Bundle bundle = new Bundle();
        int i = this.A0E;
        Feature[] featureArr = GetServiceRequest.A0E;
        GetServiceRequest getServiceRequest = new GetServiceRequest(null, bundle, null, null, str, featureArr, featureArr, scopeArr, 6, i, 12451000, 0, true, false);
        getServiceRequest.A03 = this.A0F.getPackageName();
        getServiceRequest.A01 = A02;
        if (set != null) {
            getServiceRequest.A07 = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            getServiceRequest.A00 = new Account("<<default account>>", "com.google");
            if (iAccountAccessor != null) {
                getServiceRequest.A02 = iAccountAccessor.asBinder();
            }
        }
        getServiceRequest.A05 = A0T;
        getServiceRequest.A06 = A0A();
        if (A09()) {
            getServiceRequest.A04 = true;
        }
        try {
            synchronized (this.A0K) {
                IGmsServiceBroker iGmsServiceBroker = this.A08;
                if (iGmsServiceBroker != null) {
                    zzd zzdVar = new zzd(this, this.A0A.get());
                    zzad zzadVar = (zzad) iGmsServiceBroker;
                    int A03 = C0f9.A03(1496275803);
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        obtain.writeStrongBinder(zzdVar.asBinder());
                        obtain.writeInt(1);
                        C206149Aw.A00(obtain, getServiceRequest, 0);
                        zzadVar.A00.transact(46, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        C0f9.A0A(681444654, A03);
                    } catch (Throwable th) {
                        obtain2.recycle();
                        obtain.recycle();
                        C0f9.A0A(-1560154449, A03);
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i2 = this.A0A.get();
            Handler handler = this.A0G;
            handler.sendMessage(handler.obtainMessage(6, i2, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.A0A.get();
            C125755mO c125755mO = new C125755mO(null, null, this, 8);
            Handler handler2 = this.A0G;
            handler2.sendMessage(handler2.obtainMessage(1, i3, -1, c125755mO));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i32 = this.A0A.get();
            C125755mO c125755mO2 = new C125755mO(null, null, this, 8);
            Handler handler22 = this.A0G;
            handler22.sendMessage(handler22.obtainMessage(1, i32, -1, c125755mO2));
        }
    }

    public Intent BxD() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public final boolean CRe() {
        boolean z;
        synchronized (this.A0J) {
            int i = this.A02;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public void disconnect() {
        this.A0A.incrementAndGet();
        ArrayList arrayList = this.A0M;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC128795rp abstractC128795rp = (AbstractC128795rp) arrayList.get(i);
                synchronized (abstractC128795rp) {
                    abstractC128795rp.A00 = null;
                }
            }
            arrayList.clear();
        }
        synchronized (this.A0K) {
            this.A08 = null;
        }
        A00(null, this, 1);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        String A00;
        String str2;
        synchronized (this.A0J) {
            i = this.A02;
            iInterface = this.A0C;
        }
        synchronized (this.A0K) {
            iGmsServiceBroker = this.A08;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        A00 = "DISCONNECTING";
                    } else {
                        A00 = "CONNECTED";
                    }
                } else {
                    A00 = "LOCAL_CONNECTING";
                }
            } else {
                A00 = "REMOTE_CONNECTING";
            }
        } else {
            A00 = MSV.A00(729);
        }
        printWriter.print(A00);
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) A05()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AbstractC43591JPw.A00(501), Locale.US);
        if (this.A04 > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.A04;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.A03 > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.A00;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        str2 = String.valueOf(i2);
                    } else {
                        str2 = "CAUSE_DEAD_OBJECT_EXCEPTION";
                    }
                } else {
                    str2 = "CAUSE_NETWORK_LOST";
                }
            } else {
                str2 = "CAUSE_SERVICE_DISCONNECTED";
            }
            printWriter.append((CharSequence) str2);
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.A03;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.A05 > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) S2M.A00(this.A01));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.A05;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.A0J) {
            z = false;
            if (this.A02 == 4) {
                z = true;
            }
        }
        return z;
    }

    public BaseGmsClient(Context context, final Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, InterfaceC1341463z interfaceC1341463z, AnonymousClass641 anonymousClass641, C61m c61m, String str, int i) {
        C3U5.A03(context, "Context must not be null");
        this.A0F = context;
        C3U5.A03(looper, "Looper must not be null");
        this.A0N = looper;
        C3U5.A03(c61m, "Supervisor must not be null");
        this.A0P = c61m;
        C3U5.A03(googleApiAvailabilityLight, "API availability must not be null");
        this.A0O = googleApiAvailabilityLight;
        this.A0G = new HandlerC1341163w(looper) { // from class: X.642
            /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
            @Override // android.os.Handler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void handleMessage(android.os.Message r14) {
                /*
                    Method dump skipped, instructions count: 452
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass642.handleMessage(android.os.Message):void");
            }
        };
        this.A0E = i;
        this.A0H = interfaceC1341463z;
        this.A0I = anonymousClass641;
        this.A0L = str;
    }

    public final void A07() {
        if (isConnected()) {
        } else {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }
}
