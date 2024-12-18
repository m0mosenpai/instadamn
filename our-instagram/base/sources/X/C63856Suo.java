package X;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;

/* renamed from: X.Suo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63856Suo implements Ti6 {
    @Override // X.Ti6
    public final /* bridge */ /* synthetic */ void COC(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
}
