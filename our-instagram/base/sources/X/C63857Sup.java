package X;

import android.media.MediaMetadataRetriever;
import java.nio.ByteBuffer;

/* renamed from: X.Sup, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63857Sup implements Ti6 {
    @Override // X.Ti6
    public final /* bridge */ /* synthetic */ void COC(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new Q2V(this, (ByteBuffer) obj));
    }
}
