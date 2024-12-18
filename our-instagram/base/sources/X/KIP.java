package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KIP extends AbstractC66412zI {
    public final L39 A00;
    public final UserSession A01;
    public final C7FJ A02;
    public final Map A03;
    public final InterfaceC09390do A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C3OO(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.avatar_sticker_grid_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        View view;
        ImageView imageView;
        if (c3oo != null) {
            view = c3oo.itemView;
        } else {
            view = null;
        }
        if ((view instanceof IgImageView) && (imageView = (ImageView) view) != null) {
            imageView.setImageDrawable(null);
        }
    }

    public /* synthetic */ KIP(L39 l39, UserSession userSession, boolean z, boolean z2) {
        C7FJ c7fj = new C7FJ(userSession);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = c7fj;
        this.A05 = z;
        this.A03 = A1I;
        this.A06 = z2;
        this.A00 = l39;
        this.A04 = C50254MHj.A01(this, 40);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r14, X.C3OO r15) {
        /*
            r13 = this;
            X.K03 r14 = (X.K03) r14
            r3 = 0
            X.AbstractC167007dF.A1K(r14, r15)
            com.instagram.common.session.UserSession r8 = r13.A01
            X.22C r0 = X.AnonymousClass229.A01(r8)
            X.24d r2 = r0.A01
            X.6ly r9 = r14.A01
            java.lang.String r1 = r9.A0S
            X.C14360o3.A07(r1)
            X.6pU r10 = r14.A02
            java.lang.String r0 = r10.name()
            r2.A02(r1, r0)
            android.view.View r4 = r15.itemView
            r0 = 21
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C14360o3.A0C(r4, r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.util.Map r2 = r13.A03
            java.lang.String r0 = r9.A0S
            java.lang.Object r0 = r2.get(r0)
            if (r0 != 0) goto Lad
            java.lang.Integer r1 = r9.A04()
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto Lb4
            X.0do r0 = r13.A04
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 != 0) goto L54
            X.0Tz r5 = X.AbstractC166997dE.A0U(r8)
            r0 = 36315876928261792(0x81051900040ea0, double:3.029645029507171E-306)
            boolean r0 = X.C18U.A06(r5, r8, r0)
            if (r0 == 0) goto Lb4
        L54:
            android.content.Context r5 = X.AbstractC166997dE.A0L(r4)
            boolean r1 = r14.A04
            boolean r0 = X.AbstractC47041Kqy.A00(r8)
            android.graphics.drawable.Drawable r5 = X.C74N.A00(r5, r8, r9, r1, r0)
            boolean r0 = r13.A05
            if (r0 == 0) goto L6b
            java.lang.String r0 = r9.A0S
            r2.put(r0, r5)
        L6b:
            r4.setImageDrawable(r5)
            java.lang.String r0 = r9.A0M
            if (r0 != 0) goto L7d
            android.content.Context r1 = r4.getContext()
            r0 = 2131953534(0x7f13077e, float:1.9543542E38)
            java.lang.String r0 = X.AbstractC166997dE.A0p(r1, r0)
        L7d:
            r4.setContentDescription(r0)
            X.3P9 r5 = X.AbstractC166987dD.A0s(r4)
            X.KKo r0 = new X.KKo
            r0.<init>(r3, r14, r13)
            r5.A04 = r0
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342174227765019864(0x2081130d000244d8, double:4.075098260118752E-152)
            boolean r0 = X.C18U.A06(r2, r8, r0)
            r5.A0A = r0
            r5.A00()
            r0 = 41
            X.MHV r2 = new X.MHV
            r2.<init>(r0, r14, r13)
            boolean r1 = r13.A06
            X.Tym r0 = new X.Tym
            r0.<init>(r4, r2, r1)
            r0.A00()
            return
        Lad:
            java.lang.String r0 = r9.A0S
            java.lang.Object r5 = r2.get(r0)
            goto Lcd
        Lb4:
            android.content.Context r6 = r4.getContext()
            java.lang.String r12 = r9.A0S
            r7 = 0
            X.8xc r5 = new X.8xc
            r11 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r5.A04()
            boolean r0 = r13.A05
            if (r0 == 0) goto Lcd
            java.lang.String r0 = r9.A0S
            r2.put(r0, r5)
        Lcd:
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KIP.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return K03.class;
    }
}
