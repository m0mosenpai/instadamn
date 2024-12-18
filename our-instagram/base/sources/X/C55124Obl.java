package X;

import android.app.ActivityManager;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import android.os.Handler;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Obl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55124Obl {
    public final Context A01;
    public final AudioManager A02;
    public final C55739Op8 A04;
    public final C55000OUz A06;
    public final ExecutorService A07;
    public final Handler A03 = AbstractC167007dF.A0J();
    public final Runnable A05 = new PL2(this);
    public AudioManager.AudioRecordingCallback A00 = new Mb4(this);

    public static final void A00(C55124Obl c55124Obl, String str) {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            JSONObject A0q = AbstractC31171DnF.A0q();
            try {
                A0q.put("importance", runningAppProcessInfo.importance);
                A0q.put("lastTrimLevel", runningAppProcessInfo.lastTrimLevel);
            } catch (JSONException unused) {
            }
            JSONObject A0q2 = AbstractC31171DnF.A0q();
            A0q2.put("process", A0q);
            A0q2.put("mic_permission", AbstractC167007dF.A1N(AbstractC61631Rqv.A00(c55124Obl.A01, "android.permission.RECORD_AUDIO")));
            c55124Obl.A04.Cnc(str, A0q2.toString());
        } catch (JSONException e) {
            C0K8.A0L("AudioRecordMonitor", "Failed to create system info config json", e, Arrays.copyOf(new Object[0], 0));
        }
    }

    public static final void A02(C55124Obl c55124Obl, String str, List list) {
        if (c55124Obl.A04.A00 != null) {
            c55124Obl.A07.execute(new PS9(c55124Obl, str, list));
        }
    }

    public C55124Obl(Context context, AudioManager audioManager, InterfaceC58103PpS interfaceC58103PpS, C55000OUz c55000OUz, ExecutorService executorService) {
        this.A01 = context;
        this.A07 = executorService;
        this.A02 = audioManager;
        this.A06 = c55000OUz;
        this.A04 = new C55739Op8(interfaceC58103PpS);
    }

    public static final void A01(C55124Obl c55124Obl, String str, List list) {
        String str2;
        JSONArray A0p = AbstractC31171DnF.A0p();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
            JSONObject A0q = AbstractC31171DnF.A0q();
            AudioFormat format = audioRecordingConfiguration.getFormat();
            AudioFormat clientFormat = audioRecordingConfiguration.getClientFormat();
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                str2 = String.valueOf(audioRecordingConfiguration.isClientSilenced());
            } else {
                str2 = "unknown";
            }
            try {
                A0q.put(CacheBehaviorLogger.SOURCE, audioRecordingConfiguration.getClientAudioSource()).put(AbstractC31580Du8.A00(9, 10, 3), audioRecordingConfiguration.getClientAudioSessionId()).put("is_silenced", str2);
                if (format != null) {
                    A0q.put("sample_rate", format.getSampleRate());
                }
                if (clientFormat != null) {
                    A0q.put("client_sample_rate", clientFormat.getSampleRate());
                }
                if (audioDevice != null) {
                    A0q.put(AbstractC111324zv.A00(5101), audioDevice.getProductName()).put("device_type", audioDevice.getType()).put(AbstractC31580Du8.A00(0, 9, 6), audioDevice.getId());
                }
                if (i >= 29 && audioRecordingConfiguration.isClientSilenced()) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    JSONObject A0q2 = AbstractC31171DnF.A0q();
                    try {
                        A0q2.put("importance", runningAppProcessInfo.importance);
                        A0q2.put("lastTrimLevel", runningAppProcessInfo.lastTrimLevel);
                    } catch (JSONException unused) {
                    }
                    A0q.put("process", A0q2);
                    A0q.put("mic_permission", AbstractC167007dF.A1N(AbstractC61631Rqv.A00(c55124Obl.A01, "android.permission.RECORD_AUDIO")));
                }
            } catch (JSONException e) {
                C0K8.A0L("AudioRecordMonitor", "Failed to create record config json", e, Arrays.copyOf(new Object[0], 0));
            }
            A0p.put(A0q);
        }
        c55124Obl.A04.Cnc(str, A0p.toString());
    }
}
