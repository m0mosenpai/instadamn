package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V5F extends AbstractC66412zI {
    public final XAq A00;
    public final C68811VcS A01;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (r10.length() == 0) goto L6;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r12, X.C3OO r13) {
        /*
            r11 = this;
            X.WhG r12 = (X.C70800WhG) r12
            boolean r2 = X.AbstractC167017dG.A1a(r12, r13)
            android.view.View r5 = r13.itemView
            X.C14360o3.A06(r5)
            android.view.View r0 = r13.itemView
            java.lang.Object r7 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.discovery.inform.ui.InlineInformMessageViewBinder.Holder"
            X.C14360o3.A0C(r7, r0)
            X.Vl3 r7 = (X.C69295Vl3) r7
            X.Gyy r6 = r12.A00
            X.VcS r8 = r11.A01
            X.XAq r4 = r11.A00
            r9 = 0
            X.AbstractC25233BEq.A0w(r2, r7, r8, r4)
            java.lang.String r10 = r6.A09
            if (r10 == 0) goto L2d
            int r0 = r10.length()
            r1 = 0
            if (r0 != 0) goto L2e
        L2d:
            r1 = 1
        L2e:
            r3 = 8
            android.widget.TextView r0 = r7.A01
            if (r1 == 0) goto L78
            r0.setVisibility(r3)
        L37:
            java.lang.String r1 = r6.A04
            if (r1 == 0) goto L72
            int r0 = r1.length()
            if (r0 == 0) goto L72
            android.widget.TextView r0 = r7.A00
            r0.setVisibility(r9)
            r0.setText(r1)
            r0.setFocusable(r2)
        L4c:
            java.lang.String r2 = r6.A03
            if (r2 == 0) goto L6c
            int r0 = r2.length()
            if (r0 == 0) goto L6c
            com.instagram.igds.components.button.IgdsButton r1 = r7.A02
            r1.setVisibility(r9)
            r1.setText(r2)
            r0 = 32
            X.WNP.A00(r1, r0, r8, r6)
        L63:
            com.instagram.igds.components.button.IgdsButton r0 = r7.A03
            r0.setVisibility(r3)
            r4.ECz(r5, r6)
            return
        L6c:
            com.instagram.igds.components.button.IgdsButton r0 = r7.A02
            r0.setVisibility(r3)
            goto L63
        L72:
            android.widget.TextView r0 = r7.A00
            r0.setVisibility(r3)
            goto L4c
        L78:
            r0.setVisibility(r9)
            r0.setText(r10)
            r0.setFocusable(r2)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V5F.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C70800WhG.class;
    }

    public V5F(XAq xAq, C68811VcS c68811VcS) {
        AbstractC167017dG.A1P(c68811VcS, xAq);
        this.A01 = c68811VcS;
        this.A00 = xAq;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.inform_header, false);
        A0C.setTag(new C69295Vl3(A0C));
        C3OO c3oo = new C3OO(A0C);
        if (A0C.getTag() instanceof C69295Vl3) {
            return c3oo;
        }
        throw AbstractC31172DnG.A0u();
    }
}
