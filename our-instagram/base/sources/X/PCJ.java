package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes9.dex */
public final class PCJ implements InterfaceC57985PnV {
    public Bitmap A00;
    public C51906Mwo A01;
    public final View A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final PJO A05;
    public final IgProgressImageView A06;
    public final OT1 A07;
    public final MediaFrameLayout A08;
    public final View A09;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    @Override // X.InterfaceC57985PnV
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ADV(X.C51906Mwo r5) {
        /*
            r4 = this;
            r2 = 0
            X.C14360o3.A0B(r5, r2)
            boolean r0 = r5.A0O
            if (r0 != 0) goto L18
            com.instagram.feed.widget.IgProgressImageView r0 = r4.A06
            r0.A0B(r2)
            r4.A00()
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = r4.A08
            r0 = 8
            r1.setVisibility(r0)
            return
        L18:
            X.Mwo r0 = r4.A01
            if (r0 == 0) goto L7d
            java.lang.String r1 = r0.A0D
        L1e:
            java.lang.String r0 = r5.A0D
            boolean r0 = X.AbstractC25225BEi.A1a(r1, r0)
            if (r0 == 0) goto L29
            r4.A00()
        L29:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = r4.A08
            float r0 = r5.A00
            r1.A00 = r0
            com.instagram.feed.widget.IgProgressImageView r3 = r4.A06
            r3.setAspectRatio(r0)
            boolean r0 = r5.A0T
            android.view.View r1 = r4.A02
            X.C14360o3.A06(r1)
            int r0 = X.AbstractC167007dF.A05(r0)
            r1.setVisibility(r0)
            android.graphics.Bitmap r1 = r5.A04
            if (r1 == 0) goto L7a
            android.graphics.Bitmap r0 = r4.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5b
            r0 = 3
            com.instagram.common.ui.blur.BlurUtil.blurInPlace(r1, r0)
            r3.setImageBitmap(r1)
            r3.setEnableProgressBar(r2)
        L58:
            r3.setVisibility(r2)
        L5b:
            r4.A00 = r1
            float r0 = r5.A01
            r3.setAlpha(r0)
            com.instagram.common.typedurl.ImageUrl r2 = r5.A07
            if (r2 == 0) goto L77
            boolean r1 = r5.A0L
            X.0iw r0 = r4.A03
            r3.setUrl(r2, r0)
            r3.setEnableProgressBar(r1)
            r0 = 0
        L71:
            r3.setVisibility(r0)
            r4.A01 = r5
            return
        L77:
            r0 = 8
            goto L71
        L7a:
            r2 = 8
            goto L58
        L7d:
            r1 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PCJ.ADV(X.Mwo):void");
    }

    public final void A00() {
        IgProgressImageView igProgressImageView;
        int i;
        PJO pjo = this.A05;
        C5TA c5ta = pjo.A01;
        if (c5ta != null) {
            c5ta.A0C("hide", true);
        }
        AbstractC50522MSa.A1W(pjo.A04);
        PJO.A00(pjo);
        C5TA c5ta2 = pjo.A01;
        if (c5ta2 != null) {
            c5ta2.A0A("hide");
        }
        pjo.A01 = null;
        PJO.A00(pjo);
        C51906Mwo c51906Mwo = this.A01;
        if (c51906Mwo != null) {
            ImageUrl imageUrl = c51906Mwo.A07;
            if (imageUrl != null) {
                boolean z = c51906Mwo.A0L;
                igProgressImageView = this.A06;
                igProgressImageView.setUrl(imageUrl, this.A03);
                igProgressImageView.setEnableProgressBar(z);
                i = 0;
            } else {
                igProgressImageView = this.A06;
                C14360o3.A06(igProgressImageView);
                i = 8;
            }
            igProgressImageView.setVisibility(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.OOO, java.lang.Object] */
    public PCJ(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A09 = view;
        this.A03 = interfaceC11380iw;
        this.A04 = userSession;
        this.A08 = (MediaFrameLayout) view.findViewById(R.id.cowatch_media_container);
        this.A02 = view.findViewById(R.id.cowatch_loading_spinner);
        this.A06 = (IgProgressImageView) view.findViewById(R.id.cowatch_image_view);
        Context A0L = AbstractC166997dE.A0L(view);
        this.A07 = new OT1(A0L);
        if (C37051o3.A00 == null) {
            C14360o3.A0F("plugin");
            throw C00O.createAndThrow();
        }
        Activity activity = (Activity) A0L;
        C14360o3.A0B(activity, 0);
        PJO pjo = new PJO(activity, A0L, userSession, new Object());
        this.A05 = pjo;
        pjo.A00 = new C56202OxB(this);
    }
}
