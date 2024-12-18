package X;

import android.media.AudioRecordingConfiguration;
import java.util.List;

/* loaded from: classes9.dex */
public final class PS9 implements Runnable {
    public final /* synthetic */ C55124Obl A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;

    public PS9(C55124Obl c55124Obl, String str, List list) {
        this.A00 = c55124Obl;
        this.A01 = str;
        this.A02 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C55124Obl c55124Obl = this.A00;
        String str = this.A01;
        List<AudioRecordingConfiguration> list = this.A02;
        if (list == null) {
            list = c55124Obl.A02.getActiveRecordingConfigurations();
            C14360o3.A07(list);
        }
        C55124Obl.A01(c55124Obl, str, list);
    }
}
