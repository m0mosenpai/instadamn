package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.rti.mqtt.manager.MqttPushServiceDelegate;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class T11 implements InterfaceC65618To9, InterfaceC65499TlN {
    public int A00;
    public SBY A01;
    public ArrayList A02;
    public CountDownLatch A03;
    public ScheduledFuture A04;
    public final Context A05;
    public final C4N8 A06;
    public final ScheduledExecutorService A07;
    public final SimpleDateFormat A08;

    public static void A00(T11 t11, boolean z) {
        ArrayList arrayList;
        FileWriter fileWriter;
        ScheduledFuture scheduledFuture;
        synchronized (t11) {
            arrayList = t11.A02;
            t11.A02 = AbstractC166987dD.A1E();
            if (z && (scheduledFuture = t11.A04) != null) {
                scheduledFuture.cancel(false);
            }
            t11.A04 = null;
        }
        if (!arrayList.isEmpty()) {
            try {
                t11.A03.await();
            } catch (InterruptedException e) {
                C0K8.A0F("FbnsLiteFlytrapLogger", "Waiting for current file index fetch in getFlytrapFiles was interrupted", e);
            }
            Context context = t11.A05;
            File A0w = MSW.A0w(context.getCacheDir(), AnonymousClass001.A0O("fbnslite_log", t11.A00));
            int i = 1;
            try {
                fileWriter = new FileWriter(A0w, true);
            } catch (IOException unused) {
            }
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fileWriter.write(AnonymousClass001.A0C(AbstractC166987dD.A1B(it), '\n'));
                }
                fileWriter.close();
                if (A0w.length() >= 30000) {
                    if (t11.A00 != 0) {
                        i = 0;
                    }
                    t11.A00 = i;
                    MSW.A0w(context.getCacheDir(), AnonymousClass001.A0O("fbnslite_log", t11.A00)).delete();
                    C91M ARA = t11.A06.ARA();
                    ARA.E7B("CurrentFile", t11.A00);
                    ARA.AIb("FbnsLiteFlytrapLogger", "PreferencesManager failed to store file index.");
                }
            } finally {
            }
        }
    }

    @Override // X.InterfaceC65499TlN
    public final void AQA(Context context, Bundle bundle) {
        throw AbstractC166987dD.A12("not implemented for FbnsLiteFlytrapLogger");
    }

    @Override // X.InterfaceC65618To9
    public final void Chx(String str, String str2) {
        Chw(AnonymousClass001.A0u("[", str, "] ", str2));
    }

    @Override // X.InterfaceC65618To9
    public final void Chz(String str, Map map) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            A1C.append(AbstractC31172DnG.A17(A1K));
            A1C.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
            A1C.append(AbstractC58318PtA.A0p(A1K));
            A1C.append("; ");
        }
        Chw(AnonymousClass001.A0u("[", str, "] ", A1C.toString()));
    }

    public T11(Context context, C74103Uo c74103Uo) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        this.A08 = simpleDateFormat;
        this.A02 = AbstractC166987dD.A1E();
        this.A04 = null;
        this.A01 = null;
        this.A05 = context;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        C4N8 A00 = c74103Uo.A00(context, "Fbnslite_Flytrap");
        this.A06 = A00;
        this.A07 = Executors.newSingleThreadScheduledExecutor();
        this.A03 = AbstractC58319PtB.A15();
        this.A00 = ((C4N7) A00).getInt("CurrentFile", 0);
        this.A03.countDown();
    }

    @Override // X.InterfaceC65499TlN
    public final Bundle AQ4(Context context, Bundle bundle) {
        String valueOf;
        String valueOf2;
        HashSet A0k;
        ArrayList<String> A1E = AbstractC166987dD.A1E();
        try {
            this.A03.await();
        } catch (InterruptedException e) {
            C0K8.A0F("FbnsLiteFlytrapLogger", "Waiting for current file index fetch in getFlytrapFiles was interrupted", e);
        }
        SBY sby = this.A01;
        if (sby != null) {
            MqttPushServiceDelegate mqttPushServiceDelegate = sby.A00;
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("is_mqtt_direct", "false");
            long j = mqttPushServiceDelegate.A09.A00;
            if (j > 0) {
                valueOf = new Date(j).toString();
            } else {
                valueOf = String.valueOf(j);
            }
            A1G.put("last_connection_time", valueOf);
            long j2 = mqttPushServiceDelegate.A09.A03;
            if (j2 > 0) {
                valueOf2 = new Date(j2).toString();
            } else {
                valueOf2 = String.valueOf(j2);
            }
            A1G.put("last_network_changed_time", valueOf2);
            Map map = mqttPushServiceDelegate.A09.A0Z;
            synchronized (map) {
                A0k = AbstractC31171DnF.A0k(map.keySet());
            }
            A1G.put("subscribed_topics", A0k.toString());
            A1G.put("mqtt_health_stats", MqttPushServiceDelegate.A05(mqttPushServiceDelegate));
            Chz("DumpSys", A1G);
        } else {
            Chw("SystemDumper not connected");
        }
        try {
            this.A07.submit(new TL4(this)).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        boolean A1N = AbstractC167007dF.A1N(this.A00);
        Context context2 = this.A05;
        File A0w = MSW.A0w(context2.getCacheDir(), AnonymousClass001.A0O("fbnslite_log", A1N ? 1 : 0));
        if (A0w.exists()) {
            A1E2.add(A0w);
        }
        File A0w2 = MSW.A0w(context2.getCacheDir(), AnonymousClass001.A0O("fbnslite_log", this.A00));
        if (A0w2.exists()) {
            A1E2.add(A0w2);
        }
        Iterator it = A1E2.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        A1E.add(readLine);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                        break;
                    }
                }
                bufferedReader.close();
            } catch (IOException e2) {
                A1E.add(AnonymousClass001.A0u("Error reading file ", file.getName(), " - ", e2.toString()));
            }
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putStringArrayList("flytrap", A1E);
        return A0b;
    }

    @Override // X.InterfaceC65618To9
    public final void Chw(String str) {
        String A0g = AnonymousClass001.A0g(AbstractC43593JPy.A10(this.A08, System.currentTimeMillis()), " ", str);
        synchronized (this) {
            if (A0g.length() > 500) {
                A0g = AbstractC58318PtA.A0j(A0g, 500);
            }
            this.A02.add(A0g);
            if (this.A04 == null) {
                this.A04 = this.A07.schedule(new TL5(this), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS, TimeUnit.MILLISECONDS);
            }
        }
    }
}
