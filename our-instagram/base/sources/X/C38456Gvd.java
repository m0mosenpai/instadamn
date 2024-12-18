package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Gvd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38456Gvd extends C3OO {
    public final int A00;
    public final TextView A01;
    public final C38515Gwb A02;

    public C38456Gvd(View view) {
        super(view);
        C38515Gwb c38515Gwb = new C38515Gwb(view, R.layout.question_response_item_text);
        this.A02 = c38515Gwb;
        TextView textView = (TextView) c38515Gwb.A05;
        this.A01 = textView;
        Context context = view.getContext();
        textView.setTypeface(AbstractC15960qq.A00(context).A02(EnumC15950qp.A13));
        this.A00 = context.getColor(R.color.countdown_sticker_title_text_color);
    }
}
