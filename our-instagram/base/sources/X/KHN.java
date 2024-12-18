package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHN extends AbstractC66412zI {
    public final InterfaceC11380iw A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44747JrU(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_leaderboard_user, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0042, code lost:
    
        if (r1 == 0) goto L6;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r7, X.C3OO r8) {
        /*
            r6 = this;
            X.Jzo r7 = (X.C45208Jzo) r7
            X.JrU r8 = (X.C44747JrU) r8
            X.AbstractC167017dG.A1N(r7, r8)
            android.widget.TextView r1 = r8.A05
            int r0 = r7.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setText(r0)
            android.widget.TextView r1 = r8.A04
            int r0 = r7.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setText(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r8.A07
            com.instagram.direct.emojipong.data.EmojiPongUser r5 = r7.A02
            java.lang.String r0 = r5.A02
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.AbstractC25225BEi.A0t(r0)
            X.0iw r0 = r6.A00
            r2.setUrl(r1, r0)
            android.widget.TextView r1 = r8.A06
            java.lang.String r0 = r5.A04
            r1.setText(r0)
            android.widget.TextView r2 = r8.A02
            java.lang.String r0 = r5.A01
            r2.setText(r0)
            r4 = 0
            if (r0 == 0) goto L44
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L46
        L44:
            r0 = 8
        L46:
            r2.setVisibility(r0)
            android.widget.TextView r3 = r8.A03
            android.content.Context r0 = r8.A00
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131820704(0x7f1100a0, float:1.927413E38)
            int r0 = r5.A00
            java.lang.String r0 = X.AbstractC167017dG.A0k(r2, r0, r1)
            r3.setText(r0)
            android.widget.TextView r1 = r8.A01
            boolean r0 = r7.A03
            if (r0 != 0) goto L65
            r4 = 8
        L65:
            r1.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KHN.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45208Jzo.class;
    }

    public KHN(InterfaceC11380iw interfaceC11380iw) {
        this.A00 = interfaceC11380iw;
    }
}
