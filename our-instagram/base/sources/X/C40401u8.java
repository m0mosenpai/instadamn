package X;

import android.os.Bundle;
import com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider;
import java.io.File;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.1u8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40401u8 {
    public String A00;
    public final int A01;
    public final File A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C40401u8(C107824tR c107824tR) {
        String A01 = c107824tR.A01("uploader_class");
        if (A01 != null) {
            String A012 = c107824tR.A01("flexible_sampling_updater");
            String A013 = c107824tR.A01("acs_provider");
            String A014 = c107824tR.A01("privacy_policy");
            String A015 = c107824tR.A01("thread_handler_factory");
            String A016 = c107824tR.A01("upload_job_instrumentation");
            String A017 = c107824tR.A01("priority_dir");
            if (A017 != null) {
                int A00 = c107824tR.A00("network_priority", 0);
                String A018 = c107824tR.A01("marauder_tier");
                if (A018 != null) {
                    int A002 = c107824tR.A00("multi_batch_payload_size", HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS);
                    c107824tR.A01("ffdb_token");
                    String A019 = c107824tR.A01("ffdb_provider");
                    this.A0B = A01;
                    this.A08 = A012;
                    this.A07 = A014;
                    this.A09 = A015;
                    this.A0A = A016;
                    this.A02 = new File(A017);
                    this.A03 = C05F.A00(2)[A00];
                    this.A06 = A018;
                    this.A01 = A002;
                    this.A0C = c107824tR.A00("non_sticky_handling", 0) == 1;
                    this.A0D = c107824tR.A00("use_fifo_uploads", 0) == 1;
                    this.A04 = c107824tR.A01("batch_payload_iterator_factory");
                    this.A00 = A013;
                    this.A05 = A019;
                    return;
                }
                throw new Exception("marauder_tier is null or empty");
            }
            throw new Exception("priority_dir is null or empty");
        }
        throw new Exception("uploader_class is null or empty");
    }

    public C40401u8(C39911tF c39911tF, File file, int i) {
        Class cls = c39911tF.A02;
        this.A00 = DefaultFalcoAcsProvider.class.getName();
        this.A0B = cls.getName();
        this.A08 = c39911tF.A01.getName();
        this.A07 = null;
        this.A09 = c39911tF.A03.getName();
        this.A0A = null;
        this.A02 = file;
        this.A03 = c39911tF.A04;
        this.A06 = c39911tF.A05;
        this.A01 = i;
        this.A0C = false;
        this.A0D = false;
        this.A04 = null;
        Class cls2 = c39911tF.A00;
        this.A05 = cls2 != null ? cls2.getName() : null;
    }

    public C40401u8(Bundle bundle) {
        this(new C107824tR(bundle));
    }
}
