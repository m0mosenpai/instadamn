package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;

/* renamed from: X.Mjm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51202Mjm extends C1I4 implements AnonymousClass652 {
    public final /* synthetic */ C52254NAu A00;

    @Override // X.AnonymousClass652
    public final void D38(MotionEvent motionEvent, View view) {
    }

    @Override // X.AnonymousClass652
    public final void Dio(ReboundHorizontalScrollView reboundHorizontalScrollView, float f, int i, int i2) {
    }

    @Override // X.AnonymousClass652
    public final void DsC(View view, int i) {
    }

    @Override // X.AnonymousClass652
    public final void Du6(ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    public C51202Mjm(C52254NAu c52254NAu) {
        this.A00 = c52254NAu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (((X.InterfaceC58195Pr1) r1.get(r5)).Cff() != false) goto L8;
     */
    @Override // X.AnonymousClass652
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DLs(com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView r4, int r5, int r6) {
        /*
            r3 = this;
            X.NAu r1 = r3.A00
            r1.A01 = r5
            X.C52254NAu.A06(r1)
            r1.A0K()
            android.view.View r0 = r1.A06
            if (r0 != 0) goto L29
            com.instagram.creation.fragment.AlbumEditFragment r2 = r1.A0U
            java.util.List r1 = r1.A0E
            int r0 = r1.size()
            if (r5 >= r0) goto L25
            java.lang.Object r0 = r1.get(r5)
            X.Pr1 r0 = (X.InterfaceC58195Pr1) r0
            boolean r1 = r0.Cff()
            r0 = 1
            if (r1 == 0) goto L26
        L25:
            r0 = 0
        L26:
            r2.A0R(r0)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51202Mjm.DLs(com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView, int, int):void");
    }

    @Override // X.AnonymousClass652
    public final void DuG(ReboundHorizontalScrollView reboundHorizontalScrollView) {
        TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD = this.A00.A0B;
        if (textureViewSurfaceTextureListenerC56204OxD != null) {
            textureViewSurfaceTextureListenerC56204OxD.A02();
        }
    }

    @Override // X.AnonymousClass652
    public final void Dj2(EnumC131525wo enumC131525wo, EnumC131525wo enumC131525wo2, ReboundHorizontalScrollView reboundHorizontalScrollView) {
        C0f9.A0A(-1774253556, C0f9.A03(1315622119));
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = C0f9.A03(1997512870);
        C52254NAu c52254NAu = this.A00;
        if (i != 0) {
            TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD = c52254NAu.A0B;
            if (textureViewSurfaceTextureListenerC56204OxD != null) {
                textureViewSurfaceTextureListenerC56204OxD.A02();
            }
        } else if (c52254NAu.A06 == null) {
            int i2 = c52254NAu.A01;
            InterfaceC58203Pr9 interfaceC58203Pr9 = c52254NAu.A0R;
            if (i2 != interfaceC58203Pr9.AuK()) {
                c52254NAu.A01 = interfaceC58203Pr9.AuK();
                if (interfaceC58203Pr9.AuV() != null) {
                    C52254NAu.A0B(c52254NAu, interfaceC58203Pr9.AuV());
                    c52254NAu.A0U.A0R(!interfaceC58203Pr9.AuV().Cff());
                }
            }
        }
        C0f9.A0A(916702084, A03);
    }

    public C51202Mjm() {
    }
}
