package X;

import java.util.Arrays;

/* renamed from: X.VJy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68261VJy {
    public float[] A00;
    public int[] A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C68261VJy)) {
            return false;
        }
        C68261VJy c68261VJy = (C68261VJy) obj;
        if (!Arrays.equals(this.A01, c68261VJy.A01) || !Arrays.equals(this.A00, c68261VJy.A00)) {
            return false;
        }
        return true;
    }
}
