package X;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import java.util.List;

/* loaded from: classes5.dex */
public final class BR9 implements Runnable {
    public final /* synthetic */ C25547BRj A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ IgdsFaceSwarm A02;
    public final /* synthetic */ List A03;

    public BR9(C25547BRj c25547BRj, InterfaceC11380iw interfaceC11380iw, IgdsFaceSwarm igdsFaceSwarm, List list) {
        this.A00 = c25547BRj;
        this.A02 = igdsFaceSwarm;
        this.A03 = list;
        this.A01 = interfaceC11380iw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List imageViews;
        C25547BRj c25547BRj = this.A00;
        List list = (List) c25547BRj.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            BR8 br8 = (BR8) list.get(i);
            int i2 = br8.A01;
            IgdsFaceSwarm igdsFaceSwarm = this.A02;
            Context context = igdsFaceSwarm.getContext();
            C14360o3.A07(context);
            int A00 = (int) AbstractC13880nE.A00(context, br8.A00);
            List list2 = this.A03;
            C9C2 c9c2 = (C9C2) list2.get(i2);
            imageViews = igdsFaceSwarm.getImageViews();
            BRA bra = new BRA(c9c2, (CircularImageView) imageViews.get(i));
            igdsFaceSwarm.A0G.add(bra);
            CircularImageView circularImageView = bra.A01;
            C3PZ.A01((C9C2) list2.get(i2), this.A01, circularImageView);
            circularImageView.setVisibility(0);
            Context context2 = circularImageView.getContext();
            C14360o3.A07(context2);
            Point point = br8.A02;
            circularImageView.setX(AbstractC13880nE.A04(context2, point.x));
            circularImageView.setY(AbstractC13880nE.A04(context2, point.y));
            circularImageView.setLayoutParams(new FrameLayout.LayoutParams(A00, A00));
            circularImageView.setRotation(-c25547BRj.A00);
            circularImageView.setAlpha(1.0f);
            circularImageView.setScaleX(1.0f);
            circularImageView.setScaleY(1.0f);
        }
    }
}
