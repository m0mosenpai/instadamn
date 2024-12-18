package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.instagram.common.session.UserSession;
import java.util.NoSuchElementException;

/* renamed from: X.BQt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25531BQt {
    public static final float A00(float f, float f2, float f3) {
        float f4 = f * f2;
        float f5 = (-1.0f) * f3;
        return (f4 <= f5 || f4 >= f3) ? f4 < f5 ? f5 : f3 : f4;
    }

    public static final float A01(UserSession userSession, float f) {
        float A01 = (float) C18U.A01(AbstractC25225BEi.A0j(userSession, 1), userSession, 36609150180071277L);
        float f2 = (-1.0f) * A01;
        if (f <= f2 || f >= A01) {
            f = A01;
            if (f < f2) {
                return f2;
            }
        }
        return f;
    }

    public static ValueAnimator A02(float[] fArr, float f, float f2) {
        fArr[0] = f;
        fArr[1] = f2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        return ofFloat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9, types: [float] */
    public static final C51760Mtj A03(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener3, UserSession userSession, long j, boolean z) {
        long j2;
        float f;
        float f2;
        C14360o3.A0B(userSession, 5);
        ValueAnimator A0u = AbstractC25232BEp.A0u(new float[]{0.0f, 1.05f});
        C06090Tz c06090Tz = C06090Tz.A05;
        A0u.setDuration(C18U.A01(c06090Tz, userSession, 36602093549523522L));
        A0u.setStartDelay(j);
        A0u.addUpdateListener(animatorUpdateListener);
        ValueAnimator A0u2 = AbstractC25232BEp.A0u(new float[]{1.05f, 1.0f});
        A0u2.setDuration(C18U.A01(c06090Tz, userSession, 36602093549720133L));
        A0u2.addUpdateListener(animatorUpdateListener);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(A0u, A0u2);
        if (z) {
            j2 = C18U.A01(c06090Tz, userSession, 36602093549457985L);
        } else {
            j2 = 0;
        }
        int A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36602093552603729L);
        int A072 = AbstractC25225BEi.A07(c06090Tz, userSession, 36602093552734803L);
        try {
            f = C17s.A04(AbstractC50712Us.A00, new C17u(A07, A072));
        } catch (NoSuchElementException unused) {
            C0f5 AEp = C18950wb.A01.AEp("Invalid sway range", 817892647);
            AEp.ABU("xMin", A07);
            AEp.ABU("xMax", A072);
            AEp.report();
            f = 5.0f;
        }
        int A073 = AbstractC25225BEi.A07(c06090Tz, userSession, 36602093552669266L);
        int A074 = AbstractC25225BEi.A07(c06090Tz, userSession, 36602093552800340L);
        try {
            A073 = C17s.A04(AbstractC50712Us.A00, new C17u(A073, A074));
            f2 = A073;
        } catch (NoSuchElementException unused2) {
            C0f5 AEp2 = C18950wb.A01.AEp("Invalid sway range", 817892647);
            AEp2.ABU("yMin", A073);
            AEp2.ABU("yMax", A074);
            AEp2.report();
            f2 = 2.0f;
        }
        AbstractC50712Us abstractC50712Us = AbstractC50712Us.A01;
        boolean A0A = abstractC50712Us.A0A();
        boolean A0A2 = abstractC50712Us.A0A();
        if (!A0A) {
            f = -f;
        }
        if (!A0A2) {
            f2 = -f2;
        }
        ValueAnimator A02 = A02(new float[2], 0.0f, f);
        A02.setDuration(C18U.A01(c06090Tz, userSession, 36602093549589059L) / 2);
        A02.setStartDelay(animatorSet.getTotalDuration() + j2);
        A02.addUpdateListener(animatorUpdateListener2);
        ValueAnimator A022 = A02(new float[2], f, -f);
        A022.setDuration(C18U.A01(c06090Tz, userSession, 36602093549589059L));
        A022.setRepeatCount(-1);
        A022.setRepeatMode(2);
        A022.addUpdateListener(animatorUpdateListener2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(A02, A022);
        ValueAnimator A023 = A02(new float[2], 0.0f, f2);
        A023.setDuration(C18U.A01(c06090Tz, userSession, 36602093549589059L) / 2);
        A023.setStartDelay(animatorSet.getTotalDuration() + j2);
        A023.addUpdateListener(animatorUpdateListener3);
        ValueAnimator A024 = A02(new float[2], f2, -f2);
        A024.setDuration(C18U.A01(c06090Tz, userSession, 36602093549589059L));
        A024.setRepeatCount(-1);
        A024.setRepeatMode(2);
        A024.addUpdateListener(animatorUpdateListener3);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(A023, A024);
        return new C51760Mtj(14, animatorSet, animatorSet2, animatorSet3);
    }
}
