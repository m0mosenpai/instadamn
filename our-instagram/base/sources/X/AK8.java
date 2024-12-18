package X;

import android.media.AudioRecord;
import android.os.CountDownTimer;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class AK8 {
    public int A00;
    public long A01;
    public AudioRecord A02;
    public CountDownTimer A03;
    public A8H A04;
    public boolean A05;
    public boolean A06;
    public final C23874AhT A07;
    public final C22894A7o A08;

    public static final void A00(OutputStream outputStream, int i) {
        outputStream.write(i >> 0);
        outputStream.write(i >> 8);
        outputStream.write(i >> 16);
        outputStream.write(i >> 24);
    }

    public AK8(C23874AhT c23874AhT, C22894A7o c22894A7o, long j) {
        this.A07 = c23874AhT;
        this.A01 = j;
        this.A08 = c22894A7o;
    }

    public static final void A01(OutputStream outputStream, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            outputStream.write(str.charAt(i));
        }
    }
}
