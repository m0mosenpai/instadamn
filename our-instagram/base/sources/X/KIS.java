package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KIS extends AbstractC66412zI {
    public final Integer A00;
    public final Map A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44663Jq8(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_text_header_tray_item, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r10, X.C3OO r11) {
        /*
            r9 = this;
            X.Jzu r10 = (X.C45214Jzu) r10
            X.Jq8 r11 = (X.C44663Jq8) r11
            r2 = 0
            boolean r3 = X.AbstractC167007dF.A1R(r2, r10, r11)
            android.widget.TextView r4 = r11.A00
            int r0 = r10.A00
            r4.setText(r0)
            com.instagram.common.ui.base.IgButton r5 = r11.A01
            java.lang.Integer r1 = r10.A05
            r0 = 0
            if (r1 != 0) goto L19
            r0 = 8
        L19:
            r5.setVisibility(r0)
            if (r1 == 0) goto L25
            int r0 = r1.intValue()
            r5.setText(r0)
        L25:
            boolean r0 = r10.A06
            if (r0 == 0) goto Lb2
            android.content.Context r1 = r5.getContext()
            r0 = 2130970313(0x7f0406c9, float:1.7549333E38)
        L30:
            X.AbstractC31177DnL.A0q(r1, r5, r0)
        L33:
            java.lang.Boolean r0 = r10.A04
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r3)
            if (r0 == 0) goto La9
            android.content.Context r1 = r10.A01
            if (r1 == 0) goto La9
            int r0 = X.AbstractC53242c7.A0A(r1)
            X.AbstractC166987dD.A1O(r1, r4, r0)
            r0 = 2132018629(0x7f1405c5, float:1.967557E38)
            r5.setTextAppearance(r0)
            r4 = r5
            int r0 = X.AbstractC53242c7.A0A(r1)
            int r0 = r1.getColor(r0)
        L55:
            r4.setTextColor(r0)
        L58:
            X.KuO r0 = r10.A02
            if (r0 == 0) goto La5
            X.KBa r7 = r0.A00
            boolean r0 = r7 instanceof X.C45441KAc
            if (r0 == 0) goto La6
            r0 = r7
            X.KAc r0 = (X.C45441KAc) r0
            boolean r0 = r0.A02
        L67:
            if (r0 == 0) goto La5
            X.0do r6 = r7.A0S
            X.0ll r8 = X.AbstractC25230BEn.A0k(r6, r2)
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36318973599423288(0x8107ea00001b38, double:3.031603376818995E-306)
            boolean r0 = X.C18U.A06(r4, r8, r0)
            if (r0 == 0) goto La5
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r6)
            X.21C r0 = X.C21B.A00(r0)
            X.0xq r0 = r0.A00
            java.lang.String r4 = "key_has_seen_avatar_edit_button_tooltip"
            boolean r0 = r0.getBoolean(r4, r2)
            if (r0 != 0) goto La5
            X.M33 r2 = new X.M33
            r2.<init>(r5, r7)
            r0 = 500(0x1f4, double:2.47E-321)
            r5.postDelayed(r2, r0)
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r6)
            X.21C r0 = X.C21B.A00(r0)
            X.0xq r0 = r0.A00
            X.AbstractC31177DnL.A1N(r0, r4, r3)
        La5:
            return
        La6:
            boolean r0 = r7.A0H
            goto L67
        La9:
            java.lang.Integer r0 = r9.A00
            if (r0 == 0) goto L58
            int r0 = r0.intValue()
            goto L55
        Lb2:
            java.util.Map r1 = r9.A01
            if (r1 == 0) goto L33
            X.Kc8 r0 = r10.A03
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto Lc0
            X.MF6 r1 = X.MF6.A00
        Lc0:
            r0 = 37
            X.ViewOnClickListenerC48063LPo.A00(r5, r0, r1)
            android.content.Context r1 = r5.getContext()
            r0 = 2130970273(0x7f0406a1, float:1.7549251E38)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KIS.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45214Jzu.class;
    }

    public KIS(Integer num, Map map) {
        this.A01 = map;
        this.A00 = num;
    }

    public KIS() {
        this(null, null);
    }
}
