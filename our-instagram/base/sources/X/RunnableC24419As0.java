package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.As0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24419As0 implements Runnable {
    public final /* synthetic */ C50643MXf A00;

    public RunnableC24419As0(C50643MXf c50643MXf) {
        this.A00 = c50643MXf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = this.A00.A0N;
        Context context = viewGroup.getContext();
        AnonymousClass693 A00 = C68U.A00(context, R.raw.animatedInstruction_MediaUploadReels_06);
        ImageView imageView = new ImageView(context);
        if (A00 != null) {
            A00.EMk(0.0f);
            imageView.setImageDrawable(A00);
            A00.EH0(2);
            A00.E4S();
            C56302iJ c56302iJ = new C56302iJ(-1, -1);
            c56302iJ.A0F = 0;
            c56302iJ.A0u = 0;
            c56302iJ.A0M = 0;
            c56302iJ.A0s = 0;
            imageView.setLayoutParams(c56302iJ);
            imageView.getLayoutParams().height = context.getResources().getDimensionPixelSize(R.dimen.ad_tag_max_width);
            imageView.getLayoutParams().width = AbstractC166997dE.A04(context, R.dimen.ad_tag_max_width);
            viewGroup.addView(imageView);
        }
    }
}
