package X;

import androidx.media3.container.Mp4OrientationData;
import androidx.media3.container.Mp4TimestampData;
import java.util.List;

/* loaded from: classes10.dex */
public final class SFK {
    public Mp4TimestampData A01;
    public Mp4OrientationData A00 = new Mp4OrientationData(0);
    public List A02 = AbstractC166987dD.A1E();

    public SFK() {
        long A06 = AbstractC31177DnL.A06() + 2082844800;
        this.A01 = new Mp4TimestampData(A06, A06);
    }
}
