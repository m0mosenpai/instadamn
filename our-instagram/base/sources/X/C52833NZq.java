package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.NZq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52833NZq extends NXV implements C3PE {
    public View A00;
    public final RelativeLayout A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C52833NZq(android.view.View r11, X.AbstractC59962oe r12, com.instagram.common.session.UserSession r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52833NZq.<init>(android.view.View, X.2oe, com.instagram.common.session.UserSession, boolean):void");
    }

    public static final void A00(View view, ImageView imageView, C52833NZq c52833NZq, C51606Mqy c51606Mqy) {
        View view2 = view;
        if (view == null) {
            view2 = imageView;
        }
        view2.setVisibility(AbstractC167007dF.A05(c51606Mqy.A03 ? 1 : 0));
        if (view == null) {
            view = imageView;
        }
        view.setEnabled(c51606Mqy.A02);
        AbstractC59962oe abstractC59962oe = c52833NZq.A02;
        AbstractC166997dE.A19(abstractC59962oe.requireContext(), imageView, c51606Mqy.A00);
        Integer num = c51606Mqy.A01;
        if (num != null) {
            AbstractC31172DnG.A1E(AbstractC166997dE.A0N(abstractC59962oe), imageView, num.intValue());
        }
    }

    @Override // X.C3PE
    public final void DQY(View view) {
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        C141796aw A00;
        int i;
        AbstractC52922bZ abstractC52922bZ;
        C14360o3.A0B(view, 0);
        view.performHapticFeedback(1);
        if (view.equals(AbstractC166987dD.A17(this.A0B))) {
            C51036Mgl c51036Mgl = (C51036Mgl) this.A0D.getValue();
            C51036Mgl.A00(c51036Mgl);
            C05A c05a = c51036Mgl.A09;
            AbstractC50523MSb.A1U(c05a);
            C56805PIw c56805PIw = c51036Mgl.A03;
            if (c56805PIw != null) {
                c56805PIw.A0F(AnonymousClass001.A1D("toggleAudioMute: ", AbstractC31176DnK.A1b(c05a)));
            }
            C57164PZi.A03(c51036Mgl, AbstractC141776au.A00(c51036Mgl), 32);
        } else {
            if (view.equals(AbstractC166987dD.A17(this.A0C))) {
                C51036Mgl c51036Mgl2 = (C51036Mgl) this.A0D.getValue();
                C51036Mgl.A00(c51036Mgl2);
                AbstractC50523MSb.A1U(c51036Mgl2.A0E);
                C51036Mgl.A01(c51036Mgl2, false);
                return true;
            }
            if (view.equals(AbstractC166987dD.A17(this.A05))) {
                C51036Mgl c51036Mgl3 = (C51036Mgl) this.A0D.getValue();
                C05A c05a2 = c51036Mgl3.A0A;
                AbstractC50523MSb.A1U(c05a2);
                C56805PIw c56805PIw2 = c51036Mgl3.A03;
                if (c56805PIw2 != null) {
                    Integer A0Y = MSX.A0Y(AbstractC31176DnK.A1b(c05a2) ? 1 : 0);
                    c56805PIw2.A0f.incrementAndGet();
                    OQU.A01(C56805PIw.A02(c56805PIw2, C05F.A0L), A0Y);
                }
                C56804PIv c56804PIv = c51036Mgl3.A04;
                if (c56804PIv != null) {
                    c56804PIv.A08(MSX.A0Y(AbstractC31176DnK.A1b(c05a2) ? 1 : 0));
                }
                A00 = AbstractC141776au.A00(c51036Mgl3);
                i = 35;
                abstractC52922bZ = c51036Mgl3;
            } else {
                if (view.equals(AbstractC166987dD.A17(this.A07))) {
                    C51036Mgl c51036Mgl4 = (C51036Mgl) this.A0D.getValue();
                    AbstractC50523MSb.A1U(c51036Mgl4.A0B);
                    C57164PZi.A03(c51036Mgl4, AbstractC141776au.A00(c51036Mgl4), 34);
                    return true;
                }
                if (view.equals(AbstractC166987dD.A17(this.A04))) {
                    AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0D);
                    A00 = AbstractC141776au.A00(A0Z);
                    i = 31;
                    abstractC52922bZ = A0Z;
                } else if (view.equals(AbstractC166987dD.A17(this.A06))) {
                    AbstractC52922bZ A0Z2 = AbstractC25225BEi.A0Z(this.A0D);
                    A00 = AbstractC141776au.A00(A0Z2);
                    i = 33;
                    abstractC52922bZ = A0Z2;
                }
            }
            C57164PZi.A03(abstractC52922bZ, A00, i);
            return true;
        }
        return true;
    }

    public final void A01() {
        C56805PIw c56805PIw;
        C54667OCt c54667OCt;
        C51036Mgl c51036Mgl = (C51036Mgl) this.A0D.getValue();
        C05A c05a = c51036Mgl.A0C;
        if (!AbstractC31176DnK.A1b(c05a) && (c56805PIw = c51036Mgl.A03) != null && (c54667OCt = c56805PIw.A06) != null) {
            c54667OCt.A04 = true;
            OQU.A01(C56805PIw.A02(c56805PIw, C05F.A0p), c56805PIw.A07);
        }
        AbstractC166997dE.A1Y(c05a, true);
    }
}
