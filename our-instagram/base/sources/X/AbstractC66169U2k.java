package X;

import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.U2k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66169U2k {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, IgSimpleImageView igSimpleImageView, AbstractC65924TwV abstractC65924TwV, Tx0 tx0, XBC xbc, boolean z) {
        XBC xbc2 = xbc;
        int i = 8;
        if (z) {
            i = 0;
        }
        igSimpleImageView.setVisibility(i);
        if (!z) {
            xbc2 = null;
        }
        C0fQ.A00(new WNR(15, interfaceC11380iw, tx0, xbc2, abstractC65924TwV), igSimpleImageView);
        if (z) {
            AbstractC66174U2p.A00(igSimpleImageView);
        }
    }
}
