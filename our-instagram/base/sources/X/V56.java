package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V56 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.layout_header_with_action_text, viewGroup, false);
        AbstractC56952jT.A04(inflate, C05F.A07);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        return new UJU(inflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r8, X.C3OO r9) {
        /*
            r7 = this;
            X.FyV r8 = (X.C36216FyV) r8
            X.UJU r9 = (X.UJU) r9
            r4 = 0
            boolean r6 = X.AbstractC167007dF.A1R(r4, r8, r9)
            android.widget.TextView r2 = r9.A05
            int r0 = r8.A01
            r2.setText(r0)
            java.lang.Integer r0 = r8.A03
            int r1 = r0.intValue()
            r5 = 2
            r3 = 8
            if (r1 == r4) goto L93
            if (r1 == r6) goto L8d
            if (r1 == r5) goto L99
            r0 = 3
            if (r1 != r0) goto La5
            android.widget.TextView r1 = r9.A04
            r1.setVisibility(r3)
        L27:
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L3a
            r0 = 67
            X.WNO.A00(r1, r0, r8)
            X.Fpc r0 = new X.Fpc
            r0.<init>(r8, r6)
            r1.setOnLongClickListener(r0)
        L3a:
            java.lang.Integer r0 = r8.A04
            int r0 = r0.intValue()
            android.widget.ImageView r1 = r9.A03
            if (r0 == r4) goto L54
            if (r0 == r5) goto L6e
            r1.setVisibility(r3)
        L49:
            android.widget.ImageView r0 = r9.A01
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r9.A02
            r0.setVisibility(r3)
            return
        L54:
            r1.setVisibility(r4)
            android.widget.ImageView r0 = r9.A01
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r9.A02
            r0.setVisibility(r3)
            r0 = 68
            X.WNO.A00(r1, r0, r8)
            r1 = 69
            X.WNO r0 = new X.WNO
            r0.<init>(r8, r1)
            goto L89
        L6e:
            r1.setVisibility(r3)
            boolean r0 = r8.A00
            if (r0 == 0) goto L49
            android.widget.ImageView r2 = r9.A01
            r2.setVisibility(r4)
            android.widget.ImageView r1 = r9.A02
            r1.setVisibility(r4)
            r0 = 70
            X.WNO.A00(r1, r0, r8)
            X.WNU r0 = new X.WNU
            r0.<init>(r8, r4)
        L89:
            X.C0fQ.A00(r0, r2)
            return
        L8d:
            android.widget.TextView r1 = r9.A04
            r0 = 2131964452(0x7f133224, float:1.9565686E38)
            goto L9e
        L93:
            android.widget.TextView r1 = r9.A04
            r0 = 2131964463(0x7f13322f, float:1.9565708E38)
            goto L9e
        L99:
            android.widget.TextView r1 = r9.A04
            r0 = 2131964454(0x7f133226, float:1.956569E38)
        L9e:
            r1.setText(r0)
            r1.setVisibility(r4)
            goto L27
        La5:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V56.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36216FyV.class;
    }
}
