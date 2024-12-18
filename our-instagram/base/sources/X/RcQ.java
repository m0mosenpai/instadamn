package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.appwidget.DirectThreadWidgetItem;

/* loaded from: classes10.dex */
public final class RcQ extends AbstractRunnableC14200nk {
    public final /* synthetic */ DirectThreadWidgetItem A00;
    public final /* synthetic */ SJ6 A01;
    public final /* synthetic */ C58721Q4x A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcQ(DirectThreadWidgetItem directThreadWidgetItem, SJ6 sj6, C58721Q4x c58721Q4x) {
        super(1243474276, 3, false, false);
        this.A00 = directThreadWidgetItem;
        this.A02 = c58721Q4x;
        this.A01 = sj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25821No A00 = C25821No.A00();
        DirectThreadWidgetItem directThreadWidgetItem = this.A00;
        Bitmap A0H = A00.A0H(new SimpleImageUrl(directThreadWidgetItem.A03), null);
        Bitmap A0H2 = C25821No.A00().A0H(new SimpleImageUrl(directThreadWidgetItem.A01), null);
        Context context = this.A02.getContext();
        C14360o3.A0C(context, AbstractC43591JPw.A00(4));
        ((Activity) context).runOnUiThread(new TQH(A0H, A0H2, this.A01));
    }
}
