package X;

import android.media.MediaCodec;

/* renamed from: X.0Kj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04170Kj extends C0IG {
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04170Kj(MediaCodec mediaCodec, String str, int i) {
        super(i, Integer.valueOf(mediaCodec.hashCode()));
        C14360o3.A0B(mediaCodec, 2);
        this.A00 = str;
    }

    @Override // X.C0IG
    public final boolean A00() {
        return true;
    }
}
