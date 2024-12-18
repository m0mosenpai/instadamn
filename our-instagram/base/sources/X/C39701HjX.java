package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.HjX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39701HjX {
    public final void A00(C211739Zk c211739Zk, InterfaceC11380iw interfaceC11380iw, C41126IIr c41126IIr) {
        AbstractC167027dH.A12(c41126IIr, c211739Zk, interfaceC11380iw);
        c41126IIr.A03.setText((CharSequence) c211739Zk.A05);
        IgSimpleImageView igSimpleImageView = c41126IIr.A01;
        C38688GzT c38688GzT = (C38688GzT) c211739Zk.A00;
        InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) c38688GzT.A00;
        Context A0L = AbstractC166997dE.A0L(c41126IIr.A00);
        igSimpleImageView.setImageDrawable((Drawable) interfaceC16620sF.invoke(A0L, interfaceC11380iw.getModuleName()));
        c41126IIr.A02.setText((CharSequence) ((InterfaceC16660sJ) c38688GzT.A01).invoke(A0L));
        if (c211739Zk.A02) {
            AbstractC101844hv.A00((C3r3) c211739Zk.A01, c41126IIr.A04, (C75113Zb) c211739Zk.A04);
        }
    }
}
