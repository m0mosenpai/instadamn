package X;

import android.content.res.Resources;
import android.util.Size;
import android.view.View;
import com.facebook.R;

/* renamed from: X.LKj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47992LKj {
    public static final C47992LKj A00 = new Object();

    public static final Size A00(View view, boolean z, boolean z2, boolean z3) {
        int i;
        int dimensionPixelSize;
        C14360o3.A0B(view, 0);
        Resources resources = view.getResources();
        if (z3) {
            i = R.dimen.audio_dubbing_gen_ai_gif_size;
        } else {
            i = R.dimen.challenge_sticker_v2_facepile_offsetY;
            if (z2) {
                i = R.dimen.direct_multi_media_message_fixed_height;
            }
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i);
        if (z2) {
            dimensionPixelSize = (int) (dimensionPixelSize2 * 0.75f);
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ai_agent_embodiment_video_container_size);
        }
        if (z) {
            dimensionPixelSize2 = (int) (dimensionPixelSize * 0.75f);
        }
        return new Size(dimensionPixelSize, dimensionPixelSize2);
    }

    public static final void A01(View view, int i, int i2, boolean z) {
        int min = Math.min(4, i2) - 1;
        float f = view.getLayoutParams().height;
        float f2 = 0.048f;
        if (z) {
            f2 = 0.1f;
        }
        AbstractC13880nE.A0f(view, (int) ((min - i) * f * f2));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = 2
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            if (r5 == 0) goto L17
            r0 = 1
            if (r4 != r0) goto L1c
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            int r0 = r0.width
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            int r0 = -r0
        L13:
            X.AbstractC13880nE.A0e(r3, r0)
            return
        L17:
            if (r4 == 0) goto L2b
            if (r4 == r2) goto L1f
            r2 = 3
        L1c:
            if (r4 == r2) goto L2b
            return
        L1f:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            int r0 = r0.width
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            int r0 = r0 * 2
            goto L13
        L2b:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            int r0 = r0.width
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47992LKj.A02(android.view.View, int, boolean):void");
    }

    public final void A03(View view, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(view, 0);
        Size A002 = A00(view, z, z2, z3);
        view.getLayoutParams().height = A002.getHeight();
        view.getLayoutParams().width = A002.getWidth();
    }
}
