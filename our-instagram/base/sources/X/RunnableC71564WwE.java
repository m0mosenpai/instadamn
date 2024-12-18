package X;

import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.WwE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71564WwE implements Runnable {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ C69763Bk A01;
    public final /* synthetic */ IgImageView A02;

    public RunnableC71564WwE(TextView textView, C69763Bk c69763Bk, IgImageView igImageView) {
        this.A01 = c69763Bk;
        this.A00 = textView;
        this.A02 = igImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.A00;
        C14360o3.A0A(textView);
        IgImageView igImageView = this.A02;
        C14360o3.A0A(igImageView);
        C65717Tsq c65717Tsq = new C65717Tsq(0.0f);
        c65717Tsq.A01(0.5f);
        c65717Tsq.A02(200.0f);
        AbstractC66379UEn abstractC66379UEn = AbstractC65716Tsp.A0I;
        C65726Tt0 c65726Tt0 = new C65726Tt0(abstractC66379UEn, textView, -300.0f);
        c65726Tt0.A01 = c65717Tsq;
        C65726Tt0 c65726Tt02 = new C65726Tt0(abstractC66379UEn, igImageView, -600.0f);
        c65726Tt02.A01 = c65717Tsq;
        c65726Tt0.A02();
        c65726Tt02.A02();
        textView.animate().alpha(1.0f).setDuration(600L);
        igImageView.animate().alpha(1.0f).setDuration(600L);
    }
}
