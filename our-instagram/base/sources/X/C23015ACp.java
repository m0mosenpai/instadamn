package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.ACp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23015ACp {
    public int A00;
    public InterfaceC58163PqS A01;
    public final Context A02;
    public final C199758sR A03;
    public final C199758sR A04;
    public final UserSession A05;
    public final MYU A06;
    public final BCH A07;
    public final C22979ABd A08;
    public final HashMap A09;

    public C23015ACp(Context context, C199758sR c199758sR, C199758sR c199758sR2, UserSession userSession, C22979ABd c22979ABd, BCH bch) {
        C14360o3.A0B(c199758sR, 4);
        this.A02 = context;
        this.A05 = userSession;
        this.A08 = c22979ABd;
        this.A04 = c199758sR;
        this.A03 = c199758sR2;
        this.A07 = bch;
        int i = c199758sR.A01;
        int i2 = c199758sR2.A01;
        if (i != i2 || c199758sR.A00 != c199758sR2.A00) {
            String A0R = AnonymousClass001.A0R("VideoTextureProvider", "_output_size_does_not_match_render_size");
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("outputSize=");
            A1C.append(i);
            A1C.append('x');
            A1C.append(c199758sR.A00);
            A1C.append(" outputRenderSize=");
            A1C.append(i2);
            A1C.append('x');
            A1C.append(c199758sR2.A00);
            A1C.append(' ');
            C0w9.A03(A0R, A1C.toString());
        }
        this.A09 = AbstractC166987dD.A1G();
        this.A06 = MYG.A00(userSession);
    }

    public final void A02(C5NJ c5nj, C5NO c5no) {
        List A1Q;
        C14360o3.A0B(c5no, 1);
        Drawable A00 = this.A08.A00(c5nj);
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.VideoStickerDrawable");
        C210399Se c210399Se = (C210399Se) A00;
        BCH bch = this.A07;
        C199758sR c199758sR = this.A04;
        this.A01 = bch.ANQ(c199758sR, this.A03, c210399Se, c5no);
        if ("OMX.ittiam.video.decoder.avc,OMX.Exynos.AVC.Decoder".length() == 0) {
            A1Q = C16930sl.A00;
        } else {
            String[] strArr = (String[]) AbstractC167007dF.A0m("OMX.ittiam.video.decoder.avc,OMX.Exynos.AVC.Decoder", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0).toArray(new String[0]);
            A1Q = AbstractC16960so.A1Q(Arrays.copyOf(strArr, strArr.length));
        }
        Context context = this.A02;
        UserSession userSession = this.A05;
        InterfaceC58163PqS interfaceC58163PqS = this.A01;
        if (interfaceC58163PqS == null) {
            C14360o3.A0F("videoOutputSurface");
            throw C00O.createAndThrow();
        }
        this.A09.put(c5nj, new C22891A7l(new MYJ(context, interfaceC58163PqS, userSession, this.A06, MYJ.A0G, AbstractC166987dD.A11(c210399Se.A0B.A0X), A1Q, c199758sR.A01, c199758sR.A00, 0L, TimeUnit.MILLISECONDS.toMicros(c210399Se.A08), true, false, false), c210399Se.A09));
    }

    public final void A00() {
        Iterator A0t = AbstractC167017dG.A0t(this.A09);
        while (A0t.hasNext()) {
            ((C22891A7l) A0t.next()).A01.A00();
        }
    }

    public final void A01(C5NJ c5nj, long j) {
        MYJ myj;
        long j2;
        C22891A7l c22891A7l = (C22891A7l) this.A09.get(c5nj);
        if (c22891A7l != null) {
            if (this.A00 >= c22891A7l.A00) {
                C0w9.A03("VideoTextureProvider", "Video drawable frame count overdraw");
            }
            boolean z = false;
            while (true) {
                myj = c22891A7l.A01;
                Number number = (Number) myj.A0C.peek();
                if (number != null) {
                    j2 = AbstractC166987dD.A0L(number.longValue());
                } else {
                    j2 = Long.MIN_VALUE;
                }
                if (this.A00 == 0 || (j >= j2 && j2 >= 0)) {
                    long currentTimeMillis = System.currentTimeMillis() + 500;
                    z = false;
                    while (true) {
                        if (System.currentTimeMillis() < currentTimeMillis) {
                            z = myj.A02();
                            if (z) {
                                this.A00++;
                                break;
                            }
                        } else {
                            C0w9.A03("VideoTextureProvider", "Video drawable dropped frame while rendering");
                            InterfaceC58163PqS interfaceC58163PqS = myj.A0A.A05;
                            interfaceC58163PqS.Eel(true);
                            interfaceC58163PqS.AQj(1000 * j);
                            break;
                        }
                    }
                }
            }
            if (!z) {
                InterfaceC58163PqS interfaceC58163PqS2 = myj.A0A.A05;
                interfaceC58163PqS2.Eel(false);
                interfaceC58163PqS2.AQj(j);
            }
        }
    }
}
