package X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.facebook.location.platform.api.Location;
import com.facebook.react.modules.intent.IntentModule;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public abstract class Q1F extends Service {
    public Messenger A00;
    public ExecutorService A01;
    public int A02;
    public final java.util.Set A03 = AbstractC166987dD.A1H();

    public static RunnableC64728TRk A00(Bundle bundle, Q1F q1f, InterfaceC65341TiM interfaceC65341TiM, String str) {
        java.util.Set set = q1f.A03;
        synchronized (set) {
            if (!set.add(str)) {
                C0K8.A0P("GcmTaskService", "%s: Task already running, won't start another", q1f.getPackageName());
                return null;
            }
            return new RunnableC64728TRk(bundle, q1f, interfaceC65341TiM, str);
        }
    }

    private void A01(int i) {
        java.util.Set set = this.A03;
        synchronized (set) {
            this.A02 = i;
            if (set.isEmpty()) {
                stopSelf(this.A02);
            }
        }
    }

    public static void A02(Q1F q1f, String str) {
        java.util.Set set = q1f.A03;
        synchronized (set) {
            set.remove(str);
            if (set.isEmpty()) {
                q1f.stopSelf(q1f.A02);
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Messenger messenger;
        if (intent != null && "com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
            synchronized (this) {
                messenger = this.A00;
                if (messenger == null) {
                    messenger = new Messenger(new Q3a(new ComponentName(this, getClass()), Looper.getMainLooper(), this));
                    this.A00 = messenger;
                }
            }
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        int A04 = C0f9.A04(-1748514931);
        super.onCreate();
        C0f9.A0B(1901157359, A04);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ExecutorService executorService;
        int A04 = C0f9.A04(-2049527650);
        super.onDestroy();
        synchronized (this) {
            executorService = this.A01;
            if (executorService == null) {
                executorService = Executors.newFixedThreadPool(2, new TV5());
                this.A01 = executorService;
            }
        }
        if (executorService != null) {
            List<Runnable> shutdownNow = executorService.shutdownNow();
            if (!shutdownNow.isEmpty()) {
                C0K8.A0O("GcmTaskService", "Shutting down, but not all tasks are finished executing. Remaining: %d", AbstractC25228BEl.A1Y(shutdownNow.size()));
            }
        }
        C0f9.A0B(96572628, A04);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        boolean booleanValue;
        String str;
        IllegalStateException A0Z;
        RunnableC64728TRk A00;
        int A04 = C0f9.A04(-1794414635);
        if (intent != null) {
            C08770cf.A01.A01(this, intent);
        }
        try {
            super.onStartCommand(intent, i, i2);
            if (intent == null) {
                A01(i2);
                i3 = -812906177;
            } else {
                String action = intent.getAction();
                if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        C0K8.A0C("GcmTaskService", "Null Intent passed, terminating");
                    } else {
                        Bundle A0b = AbstractC166987dD.A0b();
                        Parcel obtain = Parcel.obtain();
                        extras.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        try {
                            Pair pair = null;
                            if (obtain.readInt() <= 0) {
                                C0K8.A0D("GooglePlayCallbackExtractor", "No callback received, terminating");
                            } else if (obtain.readInt() != 1279544898) {
                                C0K8.A0D("GooglePlayCallbackExtractor", "No callback received, terminating");
                            } else {
                                int readInt = obtain.readInt();
                                int i4 = 0;
                                C63981Sx7 c63981Sx7 = null;
                                while (true) {
                                    if (i4 < readInt) {
                                        synchronized (S6S.class) {
                                            if (S6S.A00 == null) {
                                                Bundle A0b2 = AbstractC166987dD.A0b();
                                                A0b2.putString("key", IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                                                obtain = Parcel.obtain();
                                                A0b2.writeToParcel(obtain, 0);
                                                obtain.setDataPosition(0);
                                                try {
                                                    try {
                                                    } catch (RuntimeException unused) {
                                                        S6S.A00 = Boolean.FALSE;
                                                    }
                                                    if (obtain.readInt() > 0) {
                                                        if (obtain.readInt() == 1279544898) {
                                                            if (obtain.readInt() == 1) {
                                                                S6S.A00 = Boolean.valueOf("key".equals(obtain.readString()));
                                                            } else {
                                                                A0Z = AbstractC58318PtA.A0Z();
                                                            }
                                                        } else {
                                                            A0Z = AbstractC58318PtA.A0Z();
                                                        }
                                                    } else {
                                                        A0Z = AbstractC58318PtA.A0Z();
                                                    }
                                                    throw A0Z;
                                                    break;
                                                } finally {
                                                }
                                            }
                                            booleanValue = S6S.A00.booleanValue();
                                        }
                                        if (booleanValue) {
                                            str = obtain.readString();
                                        } else {
                                            Object readValue = obtain.readValue(null);
                                            if (!(readValue instanceof String)) {
                                                C0K8.A0D("GooglePlayCallbackExtractor", "Bad callback received, terminating");
                                                i4++;
                                            } else {
                                                str = (String) readValue;
                                            }
                                        }
                                        if (str == null) {
                                            continue;
                                        } else if (c63981Sx7 == null && "callback".equals(str)) {
                                            if (obtain.readInt() == 4) {
                                                if (!"com.google.android.gms.gcm.PendingCallback".equals(obtain.readString())) {
                                                    C0K8.A0D("GooglePlayCallbackExtractor", "Bad callback received, terminating");
                                                    break;
                                                }
                                                c63981Sx7 = new C63981Sx7(obtain.readStrongBinder());
                                            } else {
                                                C0K8.A0D("GooglePlayCallbackExtractor", "Bad callback received, terminating");
                                                break;
                                            }
                                        } else {
                                            Object readValue2 = obtain.readValue(null);
                                            if (readValue2 instanceof String) {
                                                A0b.putString(str, (String) readValue2);
                                            } else if (readValue2 instanceof Boolean) {
                                                A0b.putBoolean(str, AbstractC166987dD.A1a(readValue2));
                                            } else if (readValue2 instanceof Integer) {
                                                A0b.putInt(str, AbstractC58318PtA.A07(readValue2));
                                            } else if (readValue2 instanceof ArrayList) {
                                                A0b.putParcelableArrayList(str, (ArrayList) readValue2);
                                            } else if (readValue2 instanceof Bundle) {
                                                A0b.putBundle(str, (Bundle) readValue2);
                                            } else if (readValue2 instanceof Parcelable) {
                                                A0b.putParcelable(str, (Parcelable) readValue2);
                                            }
                                        }
                                        i4++;
                                    } else if (c63981Sx7 == null) {
                                        C0K8.A0D("GooglePlayCallbackExtractor", "No callback received, terminating");
                                    } else {
                                        pair = Pair.create(c63981Sx7, A0b);
                                    }
                                }
                            }
                            if (pair != null) {
                                InterfaceC65341TiM interfaceC65341TiM = (InterfaceC65341TiM) pair.first;
                                Bundle bundle = (Bundle) pair.second;
                                String string = bundle.getString("tag");
                                if (string != null && (A00 = A00(bundle.getBundle(Location.EXTRAS), this, interfaceC65341TiM, string)) != null) {
                                    A00.A01();
                                }
                            }
                        } finally {
                        }
                    }
                } else if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                    C0K8.A0C("GcmTaskService", "Unknown action received, terminating");
                }
                A01(i2);
                i3 = -543721098;
            }
            C0f9.A0B(i3, A04);
            return 2;
        } catch (Throwable th) {
            A01(i2);
            C0f9.A0B(-1436985591, A04);
            throw th;
        }
    }
}
