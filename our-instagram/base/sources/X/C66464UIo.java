package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.UIo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66464UIo extends C3OO {
    public final ImageView A00;
    public final TextView A01;
    public final /* synthetic */ UuB A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66464UIo(View view, UuB uuB) {
        super(view);
        this.A02 = uuB;
        this.A00 = (ImageView) view.findViewById(R.id.icon);
        TextView textView = (TextView) view.findViewById(R.id.title);
        this.A01 = textView;
        AbstractC70177WFc.A02(view, 2, 11, 11, 4);
        C14360o3.A05(textView);
        WF7.A02(textView, VEP.A0j);
    }
}
