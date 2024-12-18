package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.MhR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51071MhR extends PagingDataAdapter {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final O4C A03;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.story_template_discovery_surface_item_view, viewGroup, false);
        inflate.getLayoutParams().width = this.A01;
        inflate.getLayoutParams().height = this.A00;
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51361MmM(inflate, this.A02, new C57754Pjh(this, 5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (r3.length() == 0) goto L34;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r6, int r7) {
        /*
            r5 = this;
            X.MmM r6 = (X.C51361MmM) r6
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            java.lang.Object r4 = r5.A02(r7)
            X.MsY r4 = (X.C51703MsY) r4
            if (r4 == 0) goto L53
            X.Qvu r3 = r4.A05
            if (r3 == 0) goto L3b
            java.lang.String r0 = "profile_pic_url"
            java.lang.String r0 = r3.A0A(r0)
            if (r0 == 0) goto L25
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r6.A08
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.AbstractC25225BEi.A0t(r0)
            X.0xB r0 = r6.A05
            r2.setUrl(r1, r0)
        L25:
            com.instagram.common.ui.base.IgTextView r2 = r6.A07
            java.lang.String r0 = X.AbstractC31198Dnh.A01()
            java.lang.String r0 = r3.A08(r0)
            r2.setText(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r6.A08
            r0 = 4
            r1.setVisibility(r0)
            r2.setVisibility(r0)
        L3b:
            java.lang.String r0 = r4.A09
            if (r0 == 0) goto L4a
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r6.A09
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.AbstractC25225BEi.A0t(r0)
            X.0xB r0 = r6.A05
            r2.setUrl(r1, r0)
        L4a:
            X.HeM r1 = r4.A02
            X.HeM r0 = X.EnumC39612HeM.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r3 = 0
            if (r1 != r0) goto L54
            r6.A00 = r3
        L53:
            return
        L54:
            android.view.View r1 = r6.A04
            X.LQj r0 = new X.LQj
            r0.<init>(r4, r6)
            r1.setOnTouchListener(r0)
            int r1 = r4.A00
            r0 = 2
            if (r1 != r0) goto Lad
            X.Qvv r2 = r4.A06
            if (r2 == 0) goto Lad
            r6.A01 = r2
            X.PJN r0 = r6.A02
            if (r0 != 0) goto L70
            r6.A00()
        L70:
            X.Qvv r1 = r6.A01
            if (r1 == 0) goto L7a
            java.lang.String r0 = "url"
            java.lang.String r3 = r1.A0A(r0)
        L7a:
            java.lang.Integer r1 = X.C05F.A1F
            java.lang.String r0 = "id"
            java.lang.String r0 = r2.A08(r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = ""
        L86:
            X.4hZ r2 = new X.4hZ
            r2.<init>(r1, r0)
            r2.A0B = r3
            if (r3 == 0) goto L96
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L97
        L96:
            r0 = 1
        L97:
            r0 = r0 ^ 1
            r2.A0I = r0
            X.3a3 r0 = r2.A00()
            r6.A03 = r0
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r2 = r6.A0A
            X.PJL r1 = new X.PJL
            r1.<init>(r0)
            X.0xB r0 = r6.A05
            r2.setVideoSource(r1, r0)
        Lad:
            r6.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51071MhR.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewRecycled(C3OO c3oo) {
        C51361MmM c51361MmM = (C51361MmM) c3oo;
        C14360o3.A0B(c51361MmM, 0);
        PJN pjn = c51361MmM.A02;
        if (pjn != null) {
            ((C5TA) pjn.A02.getValue()).A0A("Story Template Discovery Surface media item recycler view recycled");
            pjn.A00 = C05F.A0N;
        }
        c51361MmM.A02 = null;
        c51361MmM.A01 = null;
        c51361MmM.A03 = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51071MhR(com.instagram.common.session.UserSession r3, X.O4C r4, int r5, int r6) {
        /*
            r2 = this;
            X.AbstractC37302Gc3.A1U(r4, r3)
            X.Mhr r1 = X.C51092Mhr.A00
            X.12T r0 = X.C12P.A00
            X.137 r0 = X.AnonymousClass131.A00
            r2.<init>(r1, r0)
            r2.A01 = r5
            r2.A00 = r6
            r2.A03 = r4
            r2.A02 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51071MhR.<init>(com.instagram.common.session.UserSession, X.O4C, int, int):void");
    }
}
