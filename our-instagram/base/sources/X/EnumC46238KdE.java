package X;

import org.webrtc.FileVideoCapturer;

/* renamed from: X.KdE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC46238KdE {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    CLIP("CLIP"),
    /* JADX INFO: Fake field, exist only in values array */
    FRAME(FileVideoCapturer.VideoReaderY4M.Y4M_FRAME_DELIMETER);

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    EnumC46238KdE(String str) {
        this.A00 = str;
    }
}
