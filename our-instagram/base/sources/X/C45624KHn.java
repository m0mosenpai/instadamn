package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.security.InvalidParameterException;

/* renamed from: X.KHn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45624KHn extends AbstractC66412zI {
    public final MP3 A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44647Jpr(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.pending_threads_subtitle_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        LZO lzo = (LZO) interfaceC66482zP;
        C44647Jpr c44647Jpr = (C44647Jpr) c3oo;
        AbstractC167017dG.A1N(lzo, c44647Jpr);
        AbstractC46972Dl abstractC46972Dl = lzo.A00;
        if (C14360o3.A0K(abstractC46972Dl, C44039JdQ.A00)) {
            TextView textView = c44647Jpr.A00;
            Context A0L = AbstractC166997dE.A0L(textView);
            String A0p = AbstractC166997dE.A0p(A0L, 2131960094);
            SpannableStringBuilder A07 = AbstractC31178DnM.A07(A0L, A0p, 2131960093);
            AnonymousClass773.A04(A07, new C46067KaO(this, AbstractC31174DnI.A02(A0L)), A0p);
            textView.setText(A07);
            return;
        }
        if (!C14360o3.A0K(abstractC46972Dl, C44038JdP.A00) && !C14360o3.A0K(abstractC46972Dl, C2057398y.A00)) {
            throw new InvalidParameterException();
        }
        c44647Jpr.A00.setText(2131960092);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZO.class;
    }

    public C45624KHn(MP3 mp3) {
        this.A00 = mp3;
    }
}
