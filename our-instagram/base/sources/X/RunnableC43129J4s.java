package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.J4s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43129J4s implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C38512GwX A01;

    public RunnableC43129J4s(C38512GwX c38512GwX, int i) {
        this.A01 = c38512GwX;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C38512GwX c38512GwX = this.A01;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View view = c38512GwX.A00;
        C85923sL c85923sL = new C85923sL(view);
        ViewGroup viewGroup = c38512GwX.A04;
        int i2 = this.A00;
        Rect A0U = AbstractC166987dD.A0U();
        viewGroup.getHitRect(A0U);
        int i3 = -i2;
        A0U.inset(i3, i3);
        TouchDelegate touchDelegate = new TouchDelegate(A0U, viewGroup);
        List list = c85923sL.A00;
        list.add(touchDelegate);
        TextView textView = c38512GwX.A07;
        Rect A0U2 = AbstractC166987dD.A0U();
        textView.getHitRect(A0U2);
        A0U2.inset(i3, i3);
        list.add(new TouchDelegate(A0U2, textView));
        TextView textView2 = c38512GwX.A0A;
        Rect A0U3 = AbstractC166987dD.A0U();
        textView2.getHitRect(A0U3);
        A0U3.inset(i3, i3);
        list.add(new TouchDelegate(A0U3, textView2));
        view.setTouchDelegate(c85923sL);
        View view2 = c38512GwX.itemView;
        ImageView imageView = c38512GwX.A05;
        Rect A0U4 = AbstractC166987dD.A0U();
        imageView.getHitRect(A0U4);
        A0U4.inset(i3, i3);
        view2.setTouchDelegate(new TouchDelegate(A0U4, imageView));
    }
}
