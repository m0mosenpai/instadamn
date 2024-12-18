package exoplayer2.av1.src;

/* loaded from: classes2.dex */
public enum Dav1dScalingMode {
    ASPECT_FILL(0),
    ASPECT_FIT(1),
    SCALE_FILL(2);

    public final int m_value;

    public int getValue() {
        return this.m_value;
    }

    Dav1dScalingMode(int i) {
        this.m_value = i;
    }
}
