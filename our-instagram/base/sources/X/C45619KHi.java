package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.KHi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45619KHi extends AbstractC66412zI {
    public final C47436KxR A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44724Jr7(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.pending_threads_hidden_words_folder_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        LZM lzm = (LZM) interfaceC66482zP;
        C44724Jr7 c44724Jr7 = (C44724Jr7) c3oo;
        AbstractC167017dG.A1N(lzm, c44724Jr7);
        int i = lzm.A00;
        int i2 = 1;
        if (i > 0) {
            TextView textView = c44724Jr7.A02;
            Context context = c44724Jr7.A00;
            textView.setText(AbstractC167017dG.A0k(context.getResources(), i, R.plurals.direct_pending_story_replies_row_subtitle_new_requests));
            AbstractC31177DnL.A0z(textView, context);
        } else {
            i2 = 0;
        }
        TextView textView2 = c44724Jr7.A03;
        textView2.setTypeface(textView2.getTypeface(), i2);
        c44724Jr7.A02.setTypeface(textView2.getTypeface(), i2);
        ViewOnClickListenerC48074LPz.A01(c44724Jr7.A01, 29, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZM.class;
    }

    public C45619KHi(C47436KxR c47436KxR) {
        this.A00 = c47436KxR;
    }
}
