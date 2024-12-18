package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.SGg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62555SGg {
    public final List A00;
    public final Map A02 = AbstractC166987dD.A1G();
    public final Map A01 = AbstractC166987dD.A1G();

    public C62555SGg() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        this.A00 = Collections.unmodifiableList(AbstractC16960so.A1Q(Arrays.copyOf(codecInfos, codecInfos.length)));
    }
}
