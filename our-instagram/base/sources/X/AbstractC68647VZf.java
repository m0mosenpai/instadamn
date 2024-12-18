package X;

/* renamed from: X.VZf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68647VZf {
    public static final float[] A00;
    public static final float[] A01;
    public static final float[] A02;
    public static final float[] A03;
    public static final float[] A04;
    public static final float[] A05;
    public static final float[] A08;
    public static final float[] A0A;
    public static final float[] A0B;
    public static final float[] A0C;
    public static final float[] A0D;
    public static final float[] A0E;
    public static final float[] A0F;
    public static final float[] A0G;
    public static final float[] A0H;
    public static final float[] A0I;
    public static final float[] A0J;
    public static final float[] A0K;
    public static final float[] A0L;
    public static final float[] A0M;
    public static final float[] A0N;
    public static final float[] A0O;
    public static final float[] A0P;
    public static final Integer[] A0Q;
    public static final int[][] A0R;
    public static final float[] A06 = {1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    public static final float[] A07 = {0.0f, 0.041666668f, 0.20833333f, 0.25f, 0.29166666f, 0.45833334f, 0.5f, 0.5416667f, 0.7083333f, 0.75f, 0.7916667f, 0.9583333f, 1.0f};
    public static final float[] A09 = {0.0f, 0.05882353f, 0.20588236f, 0.30392158f, 0.4509804f, 0.54901963f, 0.6960784f, 0.7941176f, 0.9411765f, 1.0f};

    static {
        Integer num = C05F.A0N;
        Integer num2 = C05F.A00;
        Integer num3 = C05F.A01;
        A0Q = new Integer[]{num, num2, num3, num2, num3, num2, num3, num2, C05F.A0C};
        A0R = new int[][]{new int[]{0, 1}, new int[]{1, 1}, new int[]{1, 2}, new int[]{2, 2}, new int[]{2, 3}, new int[]{3, 3}, new int[]{3, 4}, new int[]{4, 4}, new int[]{4, 5}};
        A0A = new float[]{-0.33f, -0.04f, 0.037f, -0.14f, -0.59f, -1.04f};
        A0B = new float[]{-0.85f, 0.0f, 0.93f, 1.85f, 2.76f, 3.7f};
        A08 = new float[]{-0.19f, -0.14f, -0.03f, 0.05f, 0.12f, 0.19f};
        A04 = new float[]{0.0f, 0.06666667f, 0.25f, 0.31666666f, 0.5f, 0.56666666f, 0.75f, 0.81666666f, 1.0f};
        A05 = new float[]{-1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 2.0f, 2.0f, 3.0f, 3.0f};
        A02 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f};
        A01 = new float[]{0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        A00 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        A03 = new float[]{0.0f, 0.02f, 0.02f, 0.042f, 0.042f, 0.242f, 0.242f, 0.292f, 0.292f, 0.517f, 0.517f, 0.558f, 0.558f, 0.758f, 0.758f, 0.808f, 0.808f, 1.0f};
        A0C = new float[]{0.0f, 0.04411765f, 0.05882353f, 0.19117647f, 0.20588236f, 0.25f, 0.25f, 0.29411766f, 0.30882353f, 0.44117647f, 0.45588234f, 0.5f, 0.5f, 0.5441176f, 0.5588235f, 0.6911765f, 0.7058824f, 0.75f, 0.75f, 0.7941176f, 0.8088235f, 0.9411765f, 0.9558824f, 1.0f};
        A0D = new float[]{1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
        A0E = new float[]{1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
        A0F = new float[]{1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
        A0K = new float[]{0.0f, 0.22058824f, 0.22058824f, 0.23529412f, 0.23529412f, 0.25f, 0.25f, 0.2647059f, 0.2647059f, 0.27941176f, 0.27941176f, 0.5f, 0.5f, 0.5147059f, 0.5147059f, 0.5294118f, 0.5294118f, 0.5441176f, 0.5441176f, 0.5588235f, 0.5588235f, 0.7794118f, 0.7794118f, 0.7941176f, 0.7941176f, 0.8088235f, 0.8088235f, 0.8235294f, 0.8235294f, 0.8382353f, 0.8382353f};
        A0L = new float[]{0.0f, 0.0f, 0.0f, 0.0f, -0.31139535f, 0.15602992f, -0.31139535f, 0.15602992f, -0.29236606f, 0.20822537f, -0.29236606f, 0.20822537f, 0.30349016f, 0.27128702f, 0.30349016f, 0.27128702f, 0.40764192f, -0.328093f, 0.40764192f, -0.328093f, 0.0f, 0.0f, 0.0f, 0.0f, -0.48442212f, 0.29053757f, -0.48442212f, 0.29053757f, 0.48153052f, 0.3737502f, 0.48153052f, 0.3737502f, 0.4162152f, 0.20719066f, 0.4162152f, 0.20719066f, -0.45759958f, 0.36588365f, -0.45759958f, 0.36588365f, 0.0f, 0.0f, 0.0f, 0.0f, -0.38116133f, 0.3678739f, -0.38116133f, 0.3678739f, -0.43845165f, 0.2958588f, -0.43845165f, 0.2958588f, 0.46547982f, -0.43684494f, 0.46547982f, -0.43684494f, 0.32606766f, 0.182263f, 0.32606766f, 0.182263f, 0.0f, 0.0f};
        A0I = new float[]{0.0f, 0.49f, 0.517f, 0.545f, 0.738f, 0.759f, 0.779f, 1.0f};
        A0J = new float[]{0.0f, 0.0f, -0.015f, 0.0f, 0.0f, 0.037f, 0.0f, 0.0f};
        A0G = new float[]{0.0f, 0.035f, 0.214f, 0.241f, 0.269f, 0.738f, 0.759f, 0.779f, 1.0f};
        A0H = new float[]{0.037f, 0.0f, 0.0f, 0.037f, 0.0f, 0.0f, -0.037f, 0.0f, 0.0f};
        A0O = new float[]{0.0f, 0.49f, 0.517f, 0.545f, 1.0f};
        A0P = new float[]{1.0f, 1.0f, 1.01f, 1.0f, 1.0f};
        A0M = new float[]{0.0f, 0.035f, 0.214f, 0.241f, 0.269f, 0.49f, 0.517f, 0.545f, 0.966f, 1.0f};
        A0N = new float[]{1.02f, 1.0f, 1.0f, 1.02f, 1.0f, 1.0f, 1.02f, 1.0f, 1.0f, 1.02f};
    }
}
