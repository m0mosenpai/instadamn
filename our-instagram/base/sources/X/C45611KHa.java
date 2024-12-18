package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.KHa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45611KHa extends AbstractC66412zI {
    public final C7CC A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44735JrI(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.command_item_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45187JzT c45187JzT = (C45187JzT) interfaceC66482zP;
        C44735JrI c44735JrI = (C44735JrI) c3oo;
        AbstractC167007dF.A1K(c45187JzT, c44735JrI);
        AbstractC160207Gg abstractC160207Gg = c45187JzT.A00;
        boolean A06 = abstractC160207Gg.A06();
        IgImageView igImageView = c44735JrI.A04;
        if (A06) {
            igImageView.setLayoutParams(c44735JrI.A01);
            igImageView.setImageResource(abstractC160207Gg.A00());
        } else {
            igImageView.setLayoutParams(c44735JrI.A00);
            Context A0L = AbstractC166997dE.A0L(igImageView);
            igImageView.setImageDrawable(AbstractC85953sP.A01(A0L, abstractC160207Gg.A00(), AbstractC53242c7.A0H(A0L, R.attr.glyphColorPrimary)));
        }
        c44735JrI.A03.setText(abstractC160207Gg.A05());
        String A04 = abstractC160207Gg.A04();
        TextView textView = c44735JrI.A02;
        if (A04 == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(A04);
        }
        LQ1.A00(c44735JrI.itemView, 36, this, c45187JzT);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45187JzT.class;
    }

    public C45611KHa(C7CC c7cc) {
        this.A00 = c7cc;
    }
}
