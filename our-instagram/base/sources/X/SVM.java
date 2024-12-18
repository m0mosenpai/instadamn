package X;

import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.HardwareVideoEncoderFactory;

/* loaded from: classes10.dex */
public abstract class SVM {
    public static C63138Sdj A00;
    public static C63138Sdj A01;
    public static C63138Sdj A02;
    public static C63138Sdj A03;
    public static C63138Sdj A04;
    public static C63138Sdj A05;
    public static C63138Sdj A06;
    public static C63138Sdj A07;
    public static C63138Sdj A08;
    public static C63138Sdj A09;
    public static C63138Sdj A0A;
    public static C63138Sdj A0B;
    public static C63138Sdj A0C;
    public static C63138Sdj A0D;
    public static C63138Sdj A0E;
    public static C63138Sdj A0F;
    public static C63138Sdj A0G;
    public static C63138Sdj A0H;
    public static C63138Sdj A0I;
    public static C63138Sdj A0J;
    public static C63138Sdj A0K;
    public static C63138Sdj A0L;
    public static C63138Sdj A0M;
    public static C63138Sdj A0N;
    public static C63138Sdj A0O;
    public static C63138Sdj A0P;
    public static C63138Sdj A0Q;
    public static C63138Sdj A0R;
    public static C63138Sdj A0S;
    public static C63138Sdj A0T;
    public static C63138Sdj A0U;
    public static C63138Sdj A0V;
    public static C63138Sdj A0W;
    public static C63138Sdj A0X;
    public static C63138Sdj A0Y;
    public static C63138Sdj A0Z;
    public static C63138Sdj A0a;
    public static C63138Sdj A0b = new C63138Sdj(new AbstractC62441SBu(false), false);
    public static C63138Sdj A0c;
    public static C63138Sdj A0d;
    public static C63138Sdj A0e;
    public static C63138Sdj A0f;
    public static C63138Sdj A0g;
    public static C63138Sdj A0h;

    static {
        Boolean A0b2 = AbstractC166997dE.A0b();
        A0C = new C63138Sdj(new AbstractC62441SBu(A0b2), A0b2);
        A0D = new C63138Sdj(new AbstractC62441SBu("GAv4-SVC"), "GAv4");
        A0c = C63138Sdj.A01(60L, 60L);
        Float valueOf = Float.valueOf(0.5f);
        A0d = new C63138Sdj(new AbstractC62441SBu(valueOf), valueOf);
        A0E = C63138Sdj.A00(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS);
        A0e = C63138Sdj.A00(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
        A0F = C63138Sdj.A00(100, 100);
        A0G = C63138Sdj.A01(1800000L, 120000L);
        A0H = C63138Sdj.A01(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        A0f = C63138Sdj.A01(120000L, 120000L);
        A0g = C63138Sdj.A01(7200000L, 7200000L);
        A0I = C63138Sdj.A01(7200000L, 7200000L);
        A0J = C63138Sdj.A01(32400000L, 32400000L);
        A0K = C63138Sdj.A00(20, 20);
        A0L = C63138Sdj.A00(20, 20);
        A0M = A00("http://www.google-analytics.com");
        A0N = A00("https://ssl.google-analytics.com");
        A0O = A00("/collect");
        A0P = A00("/batch");
        A0Q = C63138Sdj.A00(2036, 2036);
        A0R = A00("BATCH_BY_COUNT");
        A0S = A00("GZIP");
        A0h = C63138Sdj.A00(20, 20);
        A0T = C63138Sdj.A00(8192, 8192);
        A0U = C63138Sdj.A00(8192, 8192);
        A0V = C63138Sdj.A00(8192, 8192);
        A00 = A00("404,502");
        A01 = C63138Sdj.A00(ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS, ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS);
        A0W = C63138Sdj.A01(86400000L, 86400000L);
        A02 = C63138Sdj.A00(60000, 60000);
        A03 = C63138Sdj.A00(61000, 61000);
        A04 = C63138Sdj.A01(86400000L, 86400000L);
        A0X = A00("");
        A0Y = C63138Sdj.A00(0, 0);
        A05 = new C63138Sdj(new AbstractC62441SBu(false), false);
        A06 = C63138Sdj.A01(10000L, 10000L);
        A07 = C63138Sdj.A01(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        A0Z = C63138Sdj.A01(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        A0a = C63138Sdj.A01(StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
        A08 = C63138Sdj.A01(1800000L, 1800000L);
        A09 = C63138Sdj.A01(86400000L, 86400000L);
        A0A = C63138Sdj.A01(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        A0B = new C63138Sdj(new AbstractC62441SBu(false), false);
    }

    public static C63138Sdj A00(Object obj) {
        return new C63138Sdj(new AbstractC62441SBu(obj), obj);
    }
}
