package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes9.dex */
public final class P1A implements InterfaceC58169PqZ {
    public C50821Mcw A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final O2U A03;
    public final InterfaceC58310Pt2 A04;
    public final NKM A05;
    public final EnumC53380NjV A06;
    public final C81X A07;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A01;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 5), C07Y.A00(viewLifecycleOwner));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(android.view.View.OnClickListener r6, X.C51624MrH r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r4 = "shareToFbContainer"
            r2 = 0
            X.Mcw r3 = r5.A00
            if (r8 == 0) goto L32
            if (r3 == 0) goto L4c
            X.2oe r2 = r5.A01
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r2)
            r0 = 2131968953(0x7f1343b9, float:1.9574815E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setInlineSubtitle(r0)
            if (r7 == 0) goto L2a
            X.Mcw r1 = r5.A00
            if (r1 == 0) goto L4c
            android.content.Context r0 = r2.requireContext()
            java.lang.CharSequence r0 = X.OXw.A00(r0, r7)
            r1.setDescription(r0)
        L2a:
            X.Mcw r0 = r5.A00
            if (r0 == 0) goto L4c
            X.C0fQ.A00(r6, r0)
            return
        L32:
            if (r3 == 0) goto L4c
            X.2oe r0 = r5.A01
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r0)
            r0 = 2131968927(0x7f13439f, float:1.9574762E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setInlineSubtitle(r0)
            X.Mcw r0 = r5.A00
            if (r0 == 0) goto L4c
            r0.setDescription(r2)
            goto L2a
        L4c:
            X.C14360o3.A0F(r4)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P1A.A00(android.view.View$OnClickListener, X.MrH, boolean):void");
    }

    public static final void A01(P1A p1a) {
        int intValue;
        NKM nkm = p1a.A05;
        C51674Ms5 A03 = OX6.A03(nkm);
        Integer num = A03.A02;
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    C50821Mcw c50821Mcw = p1a.A00;
                    if (intValue != 3) {
                        if (c50821Mcw != null) {
                            OOv.A01(c50821Mcw, false);
                            return;
                        }
                    } else if (c50821Mcw != null) {
                        OOv.A01(c50821Mcw, true);
                        C50821Mcw c50821Mcw2 = p1a.A00;
                        if (c50821Mcw2 != null) {
                            c50821Mcw2.setInlineSubtitle(AbstractC166997dE.A0N(p1a.A01).getString(2131968927));
                            C50821Mcw c50821Mcw3 = p1a.A00;
                            if (c50821Mcw3 != null) {
                                c50821Mcw3.setDescription(null);
                                C50821Mcw c50821Mcw4 = p1a.A00;
                                if (c50821Mcw4 != null) {
                                    ViewOnClickListenerC55466OkL.A02(c50821Mcw4, 43, p1a);
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    C50821Mcw c50821Mcw5 = p1a.A00;
                    if (c50821Mcw5 != null) {
                        OOv.A01(c50821Mcw5, true);
                        C50821Mcw c50821Mcw6 = p1a.A00;
                        if (c50821Mcw6 != null) {
                            c50821Mcw6.setInlineSubtitle(AbstractC166997dE.A0N(p1a.A01).getString(2131968927));
                            C50821Mcw c50821Mcw7 = p1a.A00;
                            if (c50821Mcw7 != null) {
                                c50821Mcw7.setDescription(null);
                                C50821Mcw c50821Mcw8 = p1a.A00;
                                if (c50821Mcw8 != null) {
                                    ViewOnClickListenerC55466OkL.A02(c50821Mcw8, 42, p1a);
                                    return;
                                }
                            }
                        }
                    }
                }
            } else {
                C50821Mcw c50821Mcw9 = p1a.A00;
                if (c50821Mcw9 != null) {
                    OOv.A01(c50821Mcw9, true);
                    p1a.A00(new ViewOnClickListenerC55406OjH(p1a, 2, A03.A04, A03.A07), null, false);
                    OXw.A02(MU0.VIEW, p1a.A02, false);
                    return;
                }
            }
        } else {
            C50821Mcw c50821Mcw10 = p1a.A00;
            if (c50821Mcw10 != null) {
                OOv.A01(c50821Mcw10, true);
                boolean z = A03.A04;
                boolean z2 = A03.A07;
                EnumC53249Ngn A09 = nkm.A09(true);
                if (A09 != null) {
                    ViewOnClickListenerC55465OkK A00 = ViewOnClickListenerC55465OkK.A00(A09, p1a, 16);
                    C50821Mcw c50821Mcw11 = p1a.A00;
                    if (c50821Mcw11 != null) {
                        c50821Mcw11.setInlineSubtitle(AbstractC166997dE.A0N(p1a.A01).getString(2131955815));
                        C50821Mcw c50821Mcw12 = p1a.A00;
                        if (c50821Mcw12 != null) {
                            c50821Mcw12.setDescription(null);
                            C50821Mcw c50821Mcw13 = p1a.A00;
                            if (c50821Mcw13 != null) {
                                C0fQ.A00(A00, c50821Mcw13);
                                nkm.A0A(A09, true);
                                OXw.A02(MU0.UNAVAILABLE, p1a.A02, z);
                                return;
                            }
                        }
                    }
                } else {
                    p1a.A00(new ViewOnClickListenerC55406OjH(p1a, 1, z, z2), nkm.A08(), z);
                    if (z) {
                        O2U o2u = p1a.A03;
                        C50821Mcw c50821Mcw14 = p1a.A00;
                        if (c50821Mcw14 != null) {
                            IgSimpleImageView igSimpleImageView = c50821Mcw14.A0B;
                            C14360o3.A0B(igSimpleImageView, 0);
                            C54970OTc c54970OTc = o2u.A00.A0B;
                            if (!c54970OTc.A00) {
                                UserSession userSession = c54970OTc.A01;
                                if (!AbstractC46542Bs.A00(userSession).A04.getBoolean("PREFERENCE_REELS_HAS_SHOWN_CROSS_POST_TO_FACEBOOK_TOOLTIP", false)) {
                                    if (C197838ou.A03(C82G.A0N, C82H.A10, userSession)) {
                                        c54970OTc.A00 = true;
                                        String A0q = AbstractC166997dE.A0q(igSimpleImageView.getResources(), 2131972054);
                                        C54970OTc.A00(igSimpleImageView, c54970OTc, new NMC(c54970OTc, 2), EnumC58132lV.A02, A0q);
                                    }
                                }
                            }
                        }
                    }
                    OXw.A02(MU0.VIEW, p1a.A02, z);
                    if (!nkm.A0B) {
                        return;
                    }
                    InterfaceC58310Pt2 interfaceC58310Pt2 = p1a.A04;
                    C50821Mcw c50821Mcw15 = p1a.A00;
                    if (c50821Mcw15 != null) {
                        interfaceC58310Pt2.ElP(c50821Mcw15.A0B, p1a.A01.getModuleName());
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("shareToFbContainer");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        C50821Mcw A00 = OOy.A00(this.A01.requireContext(), null, Integer.valueOf(R.drawable.instagram_facebook_circle_pano_outline_24), 2131972013);
        this.A00 = A00;
        A00.A07.setFocusable(false);
        C50821Mcw c50821Mcw = this.A00;
        if (c50821Mcw == null) {
            C14360o3.A0F("shareToFbContainer");
            throw C00O.createAndThrow();
        }
        return c50821Mcw;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A06;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A07;
    }

    public P1A(AbstractC59962oe abstractC59962oe, UserSession userSession, O2U o2u, InterfaceC58310Pt2 interfaceC58310Pt2, NKM nkm) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, interfaceC58310Pt2);
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A05 = nkm;
        this.A04 = interfaceC58310Pt2;
        this.A03 = o2u;
        this.A07 = C81X.A2F;
        this.A06 = EnumC53380NjV.A0I;
    }
}
