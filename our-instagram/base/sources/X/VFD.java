package X;

import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public enum VFD {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCOUNTS("accounts"),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO(MediaStreamTrack.AUDIO_TRACK_KIND),
    /* JADX INFO: Fake field, exist only in values array */
    CLIPS("clips");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    VFD(String str) {
        this.A00 = str;
    }
}
