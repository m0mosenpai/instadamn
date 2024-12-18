package X;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import com.instagram.ui.text.TextShadow;
import java.util.List;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.9nN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219759nN extends AbstractC202988yG {
    public float A00;
    public int A01;
    public final int A02;
    public final EnumC194908jr A03;
    public final List A04;

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
    }

    public C219759nN(Context context, int i) {
        super(context, i);
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(0.5f);
        Float valueOf3 = Float.valueOf(0.9f);
        Float valueOf4 = Float.valueOf(1.0f);
        List A1Q = AbstractC16960so.A1Q(valueOf, valueOf2, valueOf3, valueOf4, valueOf4, valueOf4, valueOf4, valueOf3, valueOf2, valueOf);
        this.A04 = A1Q;
        this.A02 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS / A1Q.size();
        this.A03 = EnumC194908jr.A06;
    }

    @Override // X.C6RB
    public final void A0R() {
        int i;
        super.A0R();
        if (!TextUtils.isEmpty(this.A0F)) {
            Spannable spannable = this.A0F;
            C14360o3.A07(spannable);
            C9T9 c9t9 = (C9T9) C4GL.A00(spannable, C9T9.class);
            if (c9t9 == null) {
                Spannable spannable2 = this.A0F;
                C14360o3.A07(spannable2);
                C190868ci[] c190868ciArr = (C190868ci[]) C4GL.A06(spannable2, C190868ci.class);
                if (c190868ciArr.length == 0) {
                    i = this.A0b.getColor();
                } else {
                    i = c190868ciArr[0].A05;
                }
                Context context = this.A0Z;
                C14360o3.A07(context);
                c9t9 = new C9T9(context);
                c9t9.A01 = i;
                c9t9.A00 = i;
                c9t9.updateDrawState(this.A0b);
                AbstractC167017dG.A15(this.A0F, c9t9);
            }
            TextShadow textShadow = c9t9.A03;
            Context context2 = this.A0Z;
            C14360o3.A07(context2);
            this.A00 = textShadow.A01(context2);
            float[] fArr = new float[3];
            AbstractC56842jH.A09(c9t9.A00, fArr);
            this.A01 = AbstractC56842jH.A07(new float[]{fArr[0], fArr[1] * 0.5f, fArr[2] - 0.2f});
        }
    }
}
