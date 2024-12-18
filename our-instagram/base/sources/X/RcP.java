package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.appwidget.DirectThreadWidgetItem;

/* loaded from: classes10.dex */
public final class RcP extends AbstractRunnableC14200nk {
    public final /* synthetic */ DirectThreadWidgetItem A00;
    public final /* synthetic */ SJ6 A01;
    public final /* synthetic */ C58721Q4x A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcP(DirectThreadWidgetItem directThreadWidgetItem, SJ6 sj6, C58721Q4x c58721Q4x) {
        super(1243474276, 3, false, false);
        this.A00 = directThreadWidgetItem;
        this.A02 = c58721Q4x;
        this.A01 = sj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap A0H = C25821No.A00().A0H(new SimpleImageUrl(this.A00.A03), null);
        Context context = this.A02.getContext();
        C14360o3.A0C(context, AbstractC43591JPw.A00(4));
        ((Activity) context).runOnUiThread(new TP3(A0H, this.A01));
    }
}
