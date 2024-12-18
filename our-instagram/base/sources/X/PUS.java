package X;

import android.media.MediaCodecInfo;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class PUS implements Callable {
    public int A00;
    public File A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final Medium A05;
    public final UserSession A06;
    public final CameraSpec A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Code restructure failed: missing block: B:166:0x03a7, code lost:
    
        throw X.AbstractC166997dE.A0g();
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03e0 A[Catch: Exception -> 0x052f, TryCatch #2 {Exception -> 0x052f, blocks: (B:2:0x0000, B:5:0x0036, B:7:0x0049, B:9:0x0056, B:14:0x0082, B:16:0x008a, B:17:0x00ac, B:19:0x0104, B:21:0x010e, B:23:0x0130, B:25:0x0138, B:27:0x01d7, B:46:0x02b7, B:57:0x0285, B:69:0x02b2, B:122:0x052e, B:91:0x02ba, B:93:0x02be, B:96:0x02c4, B:99:0x02ce, B:100:0x03dc, B:102:0x03e0, B:104:0x03fc, B:106:0x0428, B:109:0x0453, B:111:0x0402, B:113:0x0406, B:115:0x040c, B:117:0x0412, B:119:0x041e, B:120:0x0422, B:121:0x052a, B:125:0x03d5, B:126:0x02d7, B:128:0x02dc, B:131:0x030e, B:176:0x03a8, B:177:0x03c2, B:179:0x03cc, B:182:0x03b6, B:197:0x0489, B:185:0x045a, B:187:0x0476, B:188:0x0479, B:190:0x0480, B:191:0x0487, B:195:0x0468, B:199:0x04bf, B:201:0x04c7, B:203:0x0115, B:204:0x04e7, B:206:0x04ed, B:207:0x0520, B:209:0x0079, B:210:0x0027, B:211:0x002b, B:213:0x002f, B:215:0x0033), top: B:1:0x0000, inners: #4, #10, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x052a A[Catch: Exception -> 0x052f, TryCatch #2 {Exception -> 0x052f, blocks: (B:2:0x0000, B:5:0x0036, B:7:0x0049, B:9:0x0056, B:14:0x0082, B:16:0x008a, B:17:0x00ac, B:19:0x0104, B:21:0x010e, B:23:0x0130, B:25:0x0138, B:27:0x01d7, B:46:0x02b7, B:57:0x0285, B:69:0x02b2, B:122:0x052e, B:91:0x02ba, B:93:0x02be, B:96:0x02c4, B:99:0x02ce, B:100:0x03dc, B:102:0x03e0, B:104:0x03fc, B:106:0x0428, B:109:0x0453, B:111:0x0402, B:113:0x0406, B:115:0x040c, B:117:0x0412, B:119:0x041e, B:120:0x0422, B:121:0x052a, B:125:0x03d5, B:126:0x02d7, B:128:0x02dc, B:131:0x030e, B:176:0x03a8, B:177:0x03c2, B:179:0x03cc, B:182:0x03b6, B:197:0x0489, B:185:0x045a, B:187:0x0476, B:188:0x0479, B:190:0x0480, B:191:0x0487, B:195:0x0468, B:199:0x04bf, B:201:0x04c7, B:203:0x0115, B:204:0x04e7, B:206:0x04ed, B:207:0x0520, B:209:0x0079, B:210:0x0027, B:211:0x002b, B:213:0x002f, B:215:0x0033), top: B:1:0x0000, inners: #4, #10, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03cc A[Catch: IllegalStateException -> 0x0488, Exception -> 0x052f, TRY_LEAVE, TryCatch #14 {IllegalStateException -> 0x0488, blocks: (B:176:0x03a8, B:177:0x03c2, B:179:0x03cc, B:182:0x03b6, B:185:0x045a, B:187:0x0476, B:188:0x0479, B:190:0x0480, B:191:0x0487, B:195:0x0468), top: B:130:0x030e, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ed A[Catch: Exception -> 0x052f, TryCatch #2 {Exception -> 0x052f, blocks: (B:2:0x0000, B:5:0x0036, B:7:0x0049, B:9:0x0056, B:14:0x0082, B:16:0x008a, B:17:0x00ac, B:19:0x0104, B:21:0x010e, B:23:0x0130, B:25:0x0138, B:27:0x01d7, B:46:0x02b7, B:57:0x0285, B:69:0x02b2, B:122:0x052e, B:91:0x02ba, B:93:0x02be, B:96:0x02c4, B:99:0x02ce, B:100:0x03dc, B:102:0x03e0, B:104:0x03fc, B:106:0x0428, B:109:0x0453, B:111:0x0402, B:113:0x0406, B:115:0x040c, B:117:0x0412, B:119:0x041e, B:120:0x0422, B:121:0x052a, B:125:0x03d5, B:126:0x02d7, B:128:0x02dc, B:131:0x030e, B:176:0x03a8, B:177:0x03c2, B:179:0x03cc, B:182:0x03b6, B:197:0x0489, B:185:0x045a, B:187:0x0476, B:188:0x0479, B:190:0x0480, B:191:0x0487, B:195:0x0468, B:199:0x04bf, B:201:0x04c7, B:203:0x0115, B:204:0x04e7, B:206:0x04ed, B:207:0x0520, B:209:0x0079, B:210:0x0027, B:211:0x002b, B:213:0x002f, B:215:0x0033), top: B:1:0x0000, inners: #4, #10, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0536  */
    /* JADX WARN: Type inference failed for: r12v2, types: [X.Pyl, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C195868lW call() {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PUS.call():X.8lW");
    }

    public PUS(Medium medium, UserSession userSession, CameraSpec cameraSpec, String str, int i, long j, boolean z, boolean z2) {
        int i2;
        int i3;
        this.A06 = userSession;
        this.A05 = medium;
        this.A08 = str;
        this.A07 = cameraSpec;
        this.A04 = j;
        this.A00 = i;
        this.A0A = z;
        this.A09 = z2;
        MediaCodecInfo.CodecCapabilities A00 = WFb.A00();
        if (A00 != null && A00.getVideoCapabilities() != null) {
            i2 = A00.getVideoCapabilities().getWidthAlignment();
        } else {
            i2 = 16;
        }
        this.A03 = i2;
        MediaCodecInfo.CodecCapabilities A002 = WFb.A00();
        if (A002 != null && A002.getVideoCapabilities() != null) {
            i3 = A002.getVideoCapabilities().getHeightAlignment();
        } else {
            i3 = 16;
        }
        this.A02 = i3;
    }
}
