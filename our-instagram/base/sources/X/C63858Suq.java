package X;

import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;

/* renamed from: X.Suq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63858Suq implements Ti6 {
    @Override // X.Ti6
    public final /* bridge */ /* synthetic */ void COC(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }
}
