package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.KHm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45623KHm extends AbstractC66412zI {
    public final C47434KxP A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44743JrQ(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.pending_threads_story_replies_row, false), this.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r8, X.C3OO r9) {
        /*
            r7 = this;
            X.LZd r8 = (X.C48304LZd) r8
            X.JrQ r9 = (X.C44743JrQ) r9
            r3 = 0
            boolean r4 = X.AbstractC167007dF.A1R(r3, r8, r9)
            int r6 = r8.A00
            boolean r0 = r8.A01
            r5 = 0
            android.widget.TextView r2 = r9.A03
            if (r6 <= 0) goto L56
            android.content.Context r0 = r9.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131820675(0x7f110083, float:1.9274072E38)
            java.lang.String r0 = X.AbstractC167017dG.A0k(r1, r6, r0)
        L1f:
            r2.setText(r0)
            r5 = 1
        L23:
            android.widget.TextView r1 = r9.A04
            android.graphics.Typeface r0 = r1.getTypeface()
            r1.setTypeface(r0, r5)
            android.graphics.Typeface r0 = r1.getTypeface()
            r2.setTypeface(r0, r5)
            boolean r0 = r8.A02
            android.view.View r2 = r9.A01
            if (r0 == 0) goto L49
            r0 = 1050253722(0x3e99999a, float:0.3)
            r2.setAlpha(r0)
            r1 = 0
            r2.setClickable(r3)
            X.2iX r0 = r9.A05
        L45:
            r0.setVisibility(r1)
            return
        L49:
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            r2.setClickable(r4)
            X.2iX r0 = r9.A05
            r1 = 8
            goto L45
        L56:
            android.content.Context r1 = r9.A00
            if (r0 == 0) goto L62
            r0 = 2131960119(0x7f132137, float:1.9556898E38)
            java.lang.String r0 = r1.getString(r0)
            goto L1f
        L62:
            r0 = 2131960118(0x7f132136, float:1.9556896E38)
            X.AbstractC166987dD.A1P(r1, r2, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45623KHm.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48304LZd.class;
    }

    public C45623KHm(C47434KxP c47434KxP) {
        this.A00 = c47434KxP;
    }
}
