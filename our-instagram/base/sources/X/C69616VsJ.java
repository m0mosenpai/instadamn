package X;

import android.os.Process;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.VsJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69616VsJ {
    public long A00;
    public long A01;
    public long A02;
    public boolean A03;
    public final String A04;
    public final Map A05;

    public C69616VsJ(MediaComposition mediaComposition, String str, String str2, Map map) {
        this.A04 = str;
        HashMap hashMap = new HashMap();
        this.A05 = hashMap;
        this.A01 = -1L;
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = true;
        hashMap.put("waterfall_id", str);
        hashMap.put(AbstractC111324zv.A00(2203), str);
        hashMap.put("retry_id", VN6.A00(String.valueOf(System.currentTimeMillis())));
        hashMap.put("is_videolite_flow", "true");
        hashMap.put("process_id", String.valueOf(Process.myPid()));
        if (str2 != null) {
            this.A05.put("asset_id", VN6.A00(str2));
            this.A05.put("video_original_file_path", str2);
        }
        if (mediaComposition != null) {
            this.A05.put("media_composition", mediaComposition.toString());
            this.A05.put("media_composition_hash", mediaComposition.A05());
        }
        if (map != null) {
            this.A05.putAll(map);
        }
    }

    public final HashMap A00() {
        HashMap hashMap = new HashMap();
        Iterator A15 = AbstractC166997dE.A15(this.A05);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                hashMap.put(key, value);
            }
        }
        long j = this.A02;
        long j2 = 0;
        if (0 < j) {
            j2 = j;
        }
        long j3 = this.A00;
        if (j3 < 0) {
            j3 = this.A01;
        }
        long j4 = j3 - j2;
        if (j4 > 0) {
            hashMap.put("duration", String.valueOf(j4));
        }
        return hashMap;
    }
}
