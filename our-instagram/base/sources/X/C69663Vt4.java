package X;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.debughead.util.MemoryUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Vt4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69663Vt4 {
    public long A00;
    public MediaCodec A01;
    public Surface A02;
    public InterfaceC71985XDw A03;
    public boolean A04;
    public boolean A05;
    public final long A06;
    public final MediaFormat A07;
    public final Handler A08;
    public final UserSession A09;
    public final C69415Vmz A0A;
    public final C69795Vve A0C;
    public final List A0D;
    public final C69700Vtv A0B = new C69700Vtv();
    public final List A0E = new ArrayList();
    public final CountDownLatch A0F = new CountDownLatch(1);
    public final C19L A0G = AnonymousClass194.A02(AnonymousClass191.A00);

    public C69663Vt4(Handler handler, UserSession userSession, C69415Vmz c69415Vmz, List list) {
        this.A0D = list;
        this.A0A = c69415Vmz;
        this.A08 = handler;
        this.A09 = userSession;
        this.A0C = new C69795Vve(userSession, 90000);
        int i = 30;
        try {
            int i2 = 0;
            for (C69168Vix c69168Vix : this.A0D) {
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(c69168Vix.A02.A0k);
                int trackCount = mediaExtractor.getTrackCount();
                int i3 = 0;
                while (true) {
                    if (i3 < trackCount) {
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
                        C14360o3.A07(trackFormat);
                        String string = trackFormat.getString("mime");
                        if (string != null && AbstractC002300n.A0h(string, "video/", false)) {
                            if (trackFormat.containsKey("frame-rate")) {
                                i2 = Math.max(i2, trackFormat.getInteger("frame-rate"));
                            }
                        } else {
                            i3++;
                        }
                    }
                }
                mediaExtractor.release();
            }
            i = Math.min(30, i2 == 0 ? 30 : i2);
        } catch (NullPointerException e) {
            String simpleName = C69663Vt4.class.getSimpleName();
            C14360o3.A07(simpleName);
            AbstractC12120kG.A0I(simpleName, e, AbstractC06930Yk.A0E());
        }
        this.A06 = 1000000 / i;
        C69415Vmz c69415Vmz2 = this.A0A;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", c69415Vmz2.A05, c69415Vmz2.A02);
        C14360o3.A07(createVideoFormat);
        createVideoFormat.setInteger(TraceFieldType.Bitrate, MemoryUtil.MAX_ALLOC_SIZE);
        createVideoFormat.setInteger("frame-rate", i);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("i-frame-interval", 5);
        createVideoFormat.setInteger("profile", c69415Vmz2.A04);
        createVideoFormat.setInteger("level", c69415Vmz2.A03);
        this.A07 = createVideoFormat;
    }

    public final void A00() {
        InterfaceC71985XDw interfaceC71985XDw;
        String str;
        CountDownLatch countDownLatch = this.A0F;
        if (countDownLatch.getCount() == 0 && !this.A05) {
            return;
        }
        try {
            interfaceC71985XDw = this.A03;
        } catch (Exception e) {
            String simpleName = C69663Vt4.class.getSimpleName();
            C14360o3.A07(simpleName);
            AbstractC12120kG.A0I(simpleName, e, AbstractC06930Yk.A0E());
        }
        if (interfaceC71985XDw == null) {
            str = "audioMerger";
        } else {
            interfaceC71985XDw.cancel();
            Iterator it = this.A0E.iterator();
            while (true) {
                if (it.hasNext()) {
                    C69428VnD c69428VnD = (C69428VnD) it.next();
                    MediaCodec mediaCodec = c69428VnD.A04;
                    C0fT.A06(mediaCodec, 1321035835);
                    C0fT.A03(mediaCodec, 65546416);
                    C69470Vnt c69470Vnt = c69428VnD.A06;
                    GLES20.glDeleteProgram(c69470Vnt.A02);
                    int[] iArr = c69470Vnt.A07;
                    if (iArr == null) {
                        str = "vertexBuffers";
                        break;
                    } else {
                        GLES20.glDeleteBuffers(2, iArr, 0);
                        c69428VnD.A05.getLooper().quitSafely();
                    }
                } else {
                    MediaCodec mediaCodec2 = this.A01;
                    str = "videoEncoder";
                    if (mediaCodec2 != null) {
                        C0fT.A06(mediaCodec2, -123315308);
                        MediaCodec mediaCodec3 = this.A01;
                        if (mediaCodec3 != null) {
                            C0fT.A03(mediaCodec3, 735221758);
                            C69795Vve c69795Vve = this.A0C;
                            if (c69795Vve.A03) {
                                c69795Vve.A03 = false;
                                c69795Vve.A02.A01();
                            }
                            this.A0B.A00();
                        }
                    }
                }
            }
            countDownLatch.countDown();
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
