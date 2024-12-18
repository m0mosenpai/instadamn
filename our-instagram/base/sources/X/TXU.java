package X;

/* loaded from: classes10.dex */
public final class TXU extends RuntimeException {
    public TXU() {
        super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
