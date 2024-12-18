package X;

import android.media.MediaCodec;

/* renamed from: X.0KN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0KN extends C0IG {
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KN(MediaCodec mediaCodec, String str, int i) {
        super(i, Integer.valueOf(mediaCodec.hashCode()));
        C14360o3.A0B(mediaCodec, 2);
        this.A00 = str;
    }

    @Override // X.C0IG
    public final boolean A00() {
        return true;
    }
}
