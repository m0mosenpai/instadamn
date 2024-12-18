package X;

import android.view.View;
import com.instagram.direct.messagethread.reactions.model.ReactionViewModel;

/* loaded from: classes8.dex */
public final class LQ1 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LQ1(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        C0fQ.A00(new LQ1(i, obj, obj2), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x097a, code lost:
    
        if (r4 == null) goto L184;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r42) {
        /*
            Method dump skipped, instructions count: 3920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LQ1.onClick(android.view.View):void");
    }

    public LQ1(ReactionViewModel reactionViewModel, KIO kio, int i) {
        this.A00 = i;
        if (34 - i != 0) {
            this.A01 = reactionViewModel;
            this.A02 = kio;
        } else {
            this.A02 = kio;
            this.A01 = reactionViewModel;
        }
    }

    public LQ1(KDQ kdq, C45838KQt c45838KQt, int i) {
        this.A00 = i;
        if (3 - i != 0) {
            this.A02 = kdq;
            this.A01 = c45838KQt;
        } else {
            this.A01 = c45838KQt;
            this.A02 = kdq;
        }
    }
}
