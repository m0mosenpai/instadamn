package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class AMF {
    public static final int A00(Context context, Integer num) {
        int A00;
        C14360o3.A0B(context, 0);
        if (num != null) {
            A00 = num.intValue();
        } else {
            A00 = AbstractC188878Yd.A00(context);
        }
        return AbstractC166987dD.A0B(A00, 0.5f);
    }

    public static final int A01(Context context, Integer num) {
        int A01;
        C14360o3.A0B(context, 0);
        if (num != null) {
            A01 = num.intValue();
        } else {
            A01 = AbstractC188878Yd.A01(context);
        }
        return AbstractC166987dD.A0B(A01, 0.5f);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0024. Please report as an issue. */
    public static final Path A02(C8OK c8ok, int i, int i2) {
        Rect rect;
        Path A00;
        Path A0T;
        Matrix A0Q;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        C14360o3.A0B(c8ok, 2);
        if (c8ok == C8OK.A0A) {
            return null;
        }
        int i3 = i;
        if (i > i2) {
            i3 = i2;
        }
        Path A0T2 = AbstractC166987dD.A0T();
        int ordinal = c8ok.ordinal();
        switch (ordinal) {
            case 1:
            case 7:
                float f8 = i3;
                A0T2.addArc(new RectF(0.0f, 0.0f, f8, f8), 0.0f, 359.0f);
                return A0T2;
            case 2:
                float f9 = i3;
                A0T2.addRect(0.0f, 0.0f, f9, f9, Path.Direction.CW);
                return A0T2;
            case 3:
                double d = i3;
                double d2 = 0.28d * d;
                double d3 = (float) d2;
                float f10 = (float) (d2 - d3);
                double d4 = 0.35d * d;
                float f11 = (float) (d4 - d3);
                float f12 = (float) (d2 + d3);
                float f13 = (float) (d4 + d3);
                A0T2.arcTo(new RectF(f10, f11, f12, f13), 135.0f, 205.0f);
                int i4 = i3 / 2;
                A0T2.lineTo(i4, (float) (0.3d * d));
                double d5 = 0.72d * d;
                A0T2.arcTo(new RectF((float) (d5 - d3), f11, (float) (d5 + d3), f13), 200.0f, 205.0f);
                double d6 = i4;
                double d7 = 0.1d * d;
                double d8 = d * 0.9d;
                A0T2.arcTo(new RectF((float) (d6 - d7), (float) (d8 - d7), (float) (d6 + d7), (float) (d8 + d7)), 45.0f, 90.0f);
                A0T2.close();
                return A0T2;
            case 4:
                rect = new Rect(0, 0, i3, i3);
                A00 = AbstractC166987dD.A0T();
                Iterator it = AbstractC16960so.A1Q("M410,114c0,30-11.5,57.2-30.5,77.6l-0.1,0.2l-3.5,3.6L220.4,355.1l-0.1,0.1c-3.8,4.2-9.2,6.8-15.3,6.8\n\t\t\ts-11.5-2.6-15.3-6.8l-0.1-0.1L33.4,194.6c-0.4-0.4-0.7-0.7-1.1-1.1h0C12.3,173,0,144.9,0,114C0,51,51,0,114,0\n\t\t\tc37.2,0,70.2,17.8,91,45.3C225.8,17.8,258.8,0,296,0C359,0,410,51,410,114z", "M379.4,191.7c-1.2,1.2-2.3,2.5-3.5,3.6L379.4,191.7z", "M33.4,194.6l-1.1-1.1h0C32.7,193.9,33,194.2,33.4,194.6z").iterator();
                while (it.hasNext()) {
                    A00.addPath(AbstractC63041SbH.A00(AbstractC166987dD.A1B(it)));
                }
                AbstractC226539zB.A00(A00, rect);
                return A00;
            case 5:
                rect = new Rect(0, 0, i3, i3);
                A00 = AbstractC63041SbH.A00("M229.9,12.4l42.5,131h137.7c16.3,0,23,20.8,9.9,30.4l-111.4,80.9l42.5,131c5,15.5-12.7,28.4-25.9,18.8\n\tl-111.4-80.9l-111.4,80.9c-13.2,9.6-30.9-3.3-25.9-18.8l42.5-131L7.8,173.8c-13.2-9.6-6.4-30.4,9.9-30.4h137.7l42.5-131\n\tC202.9-3,224.8-3,229.9,12.4z");
                C14360o3.A0A(A00);
                AbstractC226539zB.A00(A00, rect);
                return A00;
            case 6:
                float f14 = (float) (i3 / 1.8d);
                PointF pointF = new PointF(i3 / 2, f14);
                float f15 = (float) ((f14 * 0.9d) - 15.0d);
                float f16 = 54.0f;
                int i5 = 1;
                do {
                    double d9 = pointF.x;
                    double d10 = f15;
                    double radians = Math.toRadians(f16);
                    PointF pointF2 = new PointF((float) (d9 + (Math.cos(radians) * d10)), (float) (pointF.y + (d10 * Math.sin(radians))));
                    double d11 = pointF2.x;
                    float f17 = f16 - 90.0f;
                    double radians2 = Math.toRadians(f17);
                    PointF pointF3 = new PointF((float) (d11 + (Math.cos(radians2) * 15.0d)), (float) (pointF2.y + (Math.sin(radians2) * 15.0d)));
                    float f18 = pointF3.x;
                    float f19 = pointF3.y;
                    if (i5 == 1) {
                        A0T2.moveTo(f18, f19);
                    } else {
                        A0T2.lineTo(f18, f19);
                    }
                    float f20 = pointF2.x;
                    float f21 = pointF2.y;
                    A0T2.arcTo(new RectF(f20 - 15.0f, f21 - 15.0f, f20 + 15.0f, f21 + 15.0f), f17, 2.0f * 90.0f);
                    f16 += 144.0f;
                    i5++;
                } while (i5 <= 5);
                A0T2.close();
                return A0T2;
            case 8:
            default:
                return A0T2;
            case 9:
                float f22 = i3;
                A0T2.addRoundRect(new RectF(0.0f, 0.0f, f22, f22), 44.0f, 44.0f, Path.Direction.CW);
                return A0T2;
            case 10:
                A0T = AbstractC166987dD.A0T();
                A0T.moveTo(0.725939f, 75.0f);
                A0T.cubicTo(0.715954f, 74.5012f, 0.710938f, 74.0012f, 0.710938f, 73.5f);
                A0T.cubicTo(0.710938f, 32.9071f, 33.618f, 0.0f, 74.2109f, 0.0f);
                A0T.cubicTo(99.2973f, 0.0f, 121.448f, 12.5679f, 134.711f, 31.7509f);
                A0T.cubicTo(147.974f, 12.5679f, 170.125f, 0.0f, 195.211f, 0.0f);
                A0T.cubicTo(235.804f, 0.0f, 268.711f, 32.9071f, 268.711f, 73.5f);
                A0T.cubicTo(268.711f, 74.0012f, 268.706f, 74.5012f, 268.696f, 75.0f);
                A0T.lineTo(268.711f, 75.0f);
                A0T.cubicTo(268.711f, 137.423f, 191.541f, 197.118f, 145.076f, 227.942f);
                A0T.cubicTo(138.492f, 232.31f, 129.982f, 232.224f, 123.45f, 227.78f);
                A0T.cubicTo(76.8026f, 196.049f, 0.710938f, 137.876f, 0.710938f, 75.0f);
                A0T.lineTo(0.725939f, 75.0f);
                A0T.close();
                A0Q = AbstractC166987dD.A0Q();
                f3 = i / 269.0f;
                f4 = i2;
                f5 = 232.0f;
                f6 = f4 / f5;
                float min = Math.min(f3, f6);
                A0Q.setScale(min, min);
                A0T.transform(A0Q, A0T);
                return A0T;
            case 11:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
                f5 = 276.0f;
                float f23 = 277.0f;
                switch (ordinal) {
                    case 11:
                        A0T = AbstractC166987dD.A0T();
                        A0T.moveTo(162.806f, 9.46409f);
                        A0T.lineTo(199.141f, 63.7996f);
                        A0T.cubicTo(201.963f, 68.0059f, 206.183f, 71.0775f, 211.054f, 72.4612f);
                        A0T.lineTo(273.968f, 90.2271f);
                        A0T.cubicTo(288.565f, 94.3503f, 294.293f, 111.992f, 284.912f, 123.905f);
                        A0T.lineTo(244.469f, 175.252f);
                        A0T.cubicTo(241.328f, 179.237f, 239.723f, 184.204f, 239.916f, 189.254f);
                        A0T.lineTo(242.462f, 254.576f);
                        A0T.cubicTo(243.057f, 269.74f, 228.045f, 280.643f, 213.807f, 275.386f);
                        A0T.lineTo(152.47f, 252.777f);
                        A0T.cubicTo(147.711f, 251.02f, 142.494f, 251.02f, 137.735f, 252.777f);
                        A0T.lineTo(76.398f, 275.386f);
                        A0T.cubicTo(62.1604f, 280.63f, 47.1617f, 269.727f, 47.7429f, 254.576f);
                        A0T.lineTo(50.2888f, 189.254f);
                        A0T.cubicTo(50.4825f, 184.19f, 48.8775f, 179.223f, 45.7366f, 175.252f);
                        A0T.lineTo(5.29283f, 123.905f);
                        A0T.cubicTo(-4.10208f, 111.992f, 1.64002f, 94.3503f, 16.2374f, 90.2271f);
                        A0T.lineTo(79.1515f, 72.4612f);
                        A0T.cubicTo(84.0219f, 71.0775f, 88.2558f, 68.0197f, 91.0646f, 63.7996f);
                        A0T.lineTo(127.399f, 9.46409f);
                        A0T.cubicTo(135.839f, -3.1547f, 154.38f, -3.1547f, 162.806f, 9.46409f);
                        A0T.close();
                        A0Q = AbstractC166987dD.A0Q();
                        f3 = i / 290.0f;
                        f6 = i2 / 277.0f;
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        A0T = AbstractC166987dD.A0T();
                        A0T.moveTo(276.715f, 138.0f);
                        A0T.cubicTo(276.715f, 128.104f, 259.508f, 119.195f, 232.053f, 112.989f);
                        A0T.cubicTo(252.726f, 93.889f, 263.176f, 77.5696f, 258.228f, 68.9981f);
                        A0T.cubicTo(253.28f, 60.4267f, 233.921f, 61.3175f, 207.043f, 69.6719f);
                        A0T.cubicTo(215.393f, 42.7935f, 216.284f, 23.4348f, 207.717f, 18.4866f);
                        A0T.cubicTo(199.145f, 13.5384f, 182.829f, 23.9888f, 163.725f, 44.6613f);
                        A0T.cubicTo(157.519f, 17.2065f, 148.611f, 0.0f, 138.715f, 0.0f);
                        A0T.cubicTo(128.818f, 0.0f, 119.91f, 17.2065f, 113.704f, 44.6613f);
                        A0T.cubicTo(94.6036f, 23.9888f, 78.2842f, 13.5384f, 69.7128f, 18.4866f);
                        A0T.cubicTo(61.1414f, 23.4348f, 62.0322f, 42.7935f, 70.3865f, 69.6719f);
                        A0T.cubicTo(43.5082f, 61.3213f, 24.1495f, 60.4304f, 19.2013f, 68.9981f);
                        A0T.cubicTo(14.253f, 77.5696f, 24.7035f, 93.8852f, 45.3759f, 112.989f);
                        A0T.cubicTo(17.9174f, 119.195f, 0.710938f, 128.104f, 0.710938f, 138.0f);
                        A0T.cubicTo(0.710938f, 147.896f, 17.9174f, 156.805f, 45.3722f, 163.011f);
                        A0T.cubicTo(24.7035f, 182.111f, 14.2493f, 198.43f, 19.1975f, 207.002f);
                        A0T.cubicTo(24.1457f, 215.573f, 43.5044f, 214.682f, 70.3828f, 206.328f);
                        A0T.cubicTo(62.0322f, 233.206f, 61.1414f, 252.565f, 69.7091f, 257.513f);
                        A0T.cubicTo(78.2805f, 262.462f, 94.5961f, 252.011f, 113.7f, 231.339f);
                        A0T.cubicTo(119.906f, 258.794f, 128.814f, 276.0f, 138.711f, 276.0f);
                        A0T.cubicTo(148.607f, 276.0f, 157.516f, 258.794f, 163.722f, 231.339f);
                        A0T.cubicTo(182.822f, 252.011f, 199.141f, 262.462f, 207.713f, 257.513f);
                        A0T.cubicTo(216.284f, 252.565f, 215.393f, 233.206f, 207.039f, 206.328f);
                        A0T.cubicTo(233.917f, 214.679f, 253.276f, 215.57f, 258.224f, 207.002f);
                        A0T.cubicTo(263.173f, 198.43f, 252.722f, 182.115f, 232.05f, 163.011f);
                        A0T.cubicTo(259.504f, 156.805f, 276.711f, 147.896f, 276.711f, 138.0f);
                        A0T.lineTo(276.715f, 138.0f);
                        A0T.close();
                        A0Q = AbstractC166987dD.A0Q();
                        f7 = i;
                        f3 = f7 / f23;
                        f4 = i2;
                        f6 = f4 / f5;
                        break;
                    default:
                        A0T = AbstractC166987dD.A0T();
                        A0T.moveTo(26.2857f, 138.582f);
                        A0T.cubicTo(12.2692f, 141.346f, 1.70346f, 153.628f, 1.70346f, 168.36f);
                        A0T.lineTo(1.70346f, 245.64f);
                        A0T.cubicTo(1.70346f, 262.407f, 15.3905f, 276.0f, 32.2743f, 276.0f);
                        A0T.lineTo(110.091f, 276.0f);
                        A0T.cubicTo(125.273f, 276.0f, 137.871f, 265.008f, 140.256f, 250.601f);
                        A0T.cubicTo(143.039f, 264.521f, 155.406f, 275.015f, 170.24f, 275.015f);
                        A0T.lineTo(248.057f, 275.015f);
                        A0T.cubicTo(264.94f, 275.015f, 278.628f, 261.422f, 278.628f, 244.655f);
                        A0T.lineTo(278.628f, 167.375f);
                        A0T.cubicTo(278.628f, 152.297f, 267.56f, 139.786f, 253.054f, 137.418f);
                        A0T.cubicTo(267.069f, 134.653f, 277.635f, 122.372f, 277.635f, 107.64f);
                        A0T.lineTo(277.635f, 30.36f);
                        A0T.cubicTo(277.635f, 13.5926f, 263.948f, 4.11094E-6f, 247.065f, 3.37802E-6f);
                        A0T.lineTo(169.248f, 0.0f);
                        A0T.cubicTo(154.065f, -6.59067E-7f, 141.467f, 10.9912f, 139.083f, 25.3983f);
                        A0T.cubicTo(136.299f, 11.4785f, 123.933f, 0.985706f, 109.098f, 0.985706f);
                        A0T.lineTo(31.2818f, 0.985706f);
                        A0T.cubicTo(14.398f, 0.985706f, 0.710938f, 14.5783f, 0.710938f, 31.3457f);
                        A0T.lineTo(0.710938f, 108.626f);
                        A0T.cubicTo(0.710938f, 123.703f, 11.7784f, 136.214f, 26.2857f, 138.582f);
                        A0T.close();
                        A0Q = AbstractC166987dD.A0Q();
                        f7 = i;
                        f23 = 279.0f;
                        f3 = f7 / f23;
                        f4 = i2;
                        f6 = f4 / f5;
                        break;
                }
                float min2 = Math.min(f3, f6);
                A0Q.setScale(min2, min2);
                A0T.transform(A0Q, A0T);
                return A0T;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0T = AbstractC166987dD.A0T();
                A0T.moveTo(279.673f, 159.954f);
                A0T.lineTo(273.834f, 165.862f);
                A0T.cubicTo(267.013f, 172.766f, 263.858f, 182.479f, 265.325f, 192.068f);
                A0T.lineTo(266.57f, 200.273f);
                A0T.cubicTo(269.102f, 216.904f, 257.784f, 232.484f, 241.18f, 235.21f);
                A0T.lineTo(233.003f, 236.552f);
                A0T.cubicTo(223.415f, 238.129f, 215.14f, 244.148f, 210.671f, 252.782f);
                A0T.lineTo(206.894f, 260.102f);
                A0T.cubicTo(199.173f, 275.073f, 180.84f, 281.022f, 165.786f, 273.454f);
                A0T.lineTo(158.425f, 269.746f);
                A0T.cubicTo(149.736f, 265.373f, 139.497f, 265.373f, 130.808f, 269.746f);
                A0T.lineTo(123.447f, 273.454f);
                A0T.cubicTo(108.406f, 281.022f, 90.0594f, 275.073f, 82.3387f, 260.102f);
                A0T.lineTo(78.5614f, 252.782f);
                A0T.cubicTo(74.106f, 244.148f, 65.8319f, 238.129f, 56.2433f, 236.552f);
                A0T.lineTo(48.0659f, 235.21f);
                A0T.cubicTo(31.4622f, 232.484f, 20.1441f, 216.918f, 22.6762f, 200.273f);
                A0T.lineTo(23.9215f, 192.068f);
                A0T.cubicTo(25.3743f, 182.479f, 22.2196f, 172.766f, 15.4121f, 165.862f);
                A0T.lineTo(9.57314f, 159.954f);
                A0T.cubicTo(-2.24313f, 147.985f, -2.24313f, 128.753f, 9.57314f, 116.784f);
                A0T.lineTo(15.4121f, 110.876f);
                A0T.cubicTo(22.2334f, 103.972f, 25.3881f, 94.2586f, 23.9215f, 84.67f);
                A0T.lineTo(22.6762f, 76.465f);
                A0T.cubicTo(20.1441f, 59.8337f, 31.4622f, 44.2539f, 48.0659f, 41.5281f);
                A0T.lineTo(56.2433f, 40.186f);
                A0T.cubicTo(65.8319f, 38.6087f, 74.106f, 32.5898f, 78.5752f, 23.9559f);
                A0T.lineTo(82.3525f, 16.6364f);
                A0T.cubicTo(90.0732f, 1.66547f, 108.406f, -4.28417f, 123.46f, 3.28434f);
                A0T.lineTo(130.821f, 6.99248f);
                A0T.cubicTo(139.511f, 11.3648f, 149.75f, 11.3648f, 158.439f, 6.99248f);
                A0T.lineTo(165.8f, 3.28434f);
                A0T.cubicTo(180.84f, -4.28417f, 199.187f, 1.66547f, 206.908f, 16.6364f);
                A0T.lineTo(210.685f, 23.9559f);
                A0T.cubicTo(215.14f, 32.5898f, 223.415f, 38.6087f, 233.003f, 40.186f);
                A0T.lineTo(241.18f, 41.5281f);
                A0T.cubicTo(257.784f, 44.2539f, 269.102f, 59.8198f, 266.57f, 76.465f);
                A0T.lineTo(265.325f, 84.67f);
                A0T.cubicTo(263.872f, 94.2586f, 267.027f, 103.972f, 273.834f, 110.876f);
                A0T.lineTo(279.673f, 116.784f);
                A0T.cubicTo(291.49f, 128.753f, 291.49f, 147.985f, 279.673f, 159.954f);
                A0T.close();
                A0Q = AbstractC166987dD.A0Q();
                f = i;
                f2 = 289.0f;
                f3 = f / f2;
                f4 = i2;
                f5 = 277.0f;
                f6 = f4 / f5;
                float min22 = Math.min(f3, f6);
                A0Q.setScale(min22, min22);
                A0T.transform(A0Q, A0T);
                return A0T;
            case Process.SIGTERM /* 15 */:
                A0T = AbstractC166987dD.A0T();
                A0T.moveTo(291.621f, 138.364f);
                A0T.lineTo(245.85f, 170.755f);
                A0T.lineTo(263.837f, 223.873f);
                A0T.lineTo(207.745f, 223.153f);
                A0T.lineTo(191.113f, 276.728f);
                A0T.lineTo(146.173f, 243.147f);
                A0T.lineTo(101.218f, 276.728f);
                A0T.lineTo(84.5871f, 223.153f);
                A0T.lineTo(28.4943f, 223.873f);
                A0T.lineTo(46.4817f, 170.755f);
                A0T.lineTo(0.710938f, 138.364f);
                A0T.lineTo(46.4817f, 105.973f);
                A0T.lineTo(28.4943f, 52.855f);
                A0T.lineTo(84.5871f, 53.5745f);
                A0T.lineTo(101.218f, 0.0f);
                A0T.lineTo(146.173f, 33.5809f);
                A0T.lineTo(191.113f, 0.0f);
                A0T.lineTo(207.745f, 53.5745f);
                A0T.lineTo(263.837f, 52.855f);
                A0T.lineTo(245.85f, 105.973f);
                A0T.lineTo(291.621f, 138.364f);
                A0T.close();
                A0Q = AbstractC166987dD.A0Q();
                f = i;
                f2 = 292.0f;
                f3 = f / f2;
                f4 = i2;
                f5 = 277.0f;
                f6 = f4 / f5;
                float min222 = Math.min(f3, f6);
                A0Q.setScale(min222, min222);
                A0T.transform(A0Q, A0T);
                return A0T;
        }
    }

    public static final C194808jg A03(Context context, Medium medium, UserSession userSession, Integer num, Integer num2, boolean z) {
        ArrayList A12 = AbstractC166997dE.A12(context, 1);
        int A01 = A01(context, num);
        int A00 = A00(context, num2);
        if (C18U.A06(C06090Tz.A05, userSession, 36329582168654238L)) {
            A04(context, medium, A12, A01, A00, z, true);
            Iterator it = AbstractC16960so.A1Q(C8OK.A0G, C8OK.A08, C8OK.A02, C8OK.A05, C8OK.A0E, C8OK.A0H).iterator();
            while (it.hasNext()) {
                A12.add(new C202728xq(context, null, medium, null, (C8OK) it.next(), null, A01, A00, false, false, z, false));
            }
        } else {
            A04(context, medium, A12, A01, A00, z, false);
            Iterator it2 = AbstractC16960so.A1Q(C8OK.A06, C8OK.A0D).iterator();
            while (it2.hasNext()) {
                A12.add(new C202728xq(context, null, medium, null, (C8OK) it2.next(), null, A01, A00, false, false, z, false));
            }
        }
        C194808jg c194808jg = new C194808jg(context, userSession, A12);
        c194808jg.A03 = new C217899kM(medium, AbstractC166987dD.A0A(AbstractC188878Yd.A01(context), 0.5f), AbstractC166987dD.A0A(AbstractC188878Yd.A00(context), 0.5f));
        return c194808jg;
    }

    public static final void A04(Context context, Medium medium, ArrayList arrayList, int i, int i2, boolean z, boolean z2) {
        Integer num;
        if (z2) {
            num = Integer.valueOf(AbstractC167017dG.A0B(context));
        } else {
            num = null;
        }
        C8OK c8ok = C8OK.A0A;
        C202728xq c202728xq = new C202728xq(context, null, medium, null, c8ok, num, i, i2, true, false, z, false);
        C202728xq c202728xq2 = new C202728xq(context, null, medium, null, c8ok, null, i, i2, false, false, z, false);
        arrayList.add(c202728xq);
        arrayList.add(c202728xq2);
        Iterator it = AbstractC16960so.A1Q(C8OK.A04, C8OK.A0C).iterator();
        while (it.hasNext()) {
            arrayList.add(new C202728xq(context, null, medium, null, (C8OK) it.next(), null, i, i2, false, false, z, false));
        }
    }
}
