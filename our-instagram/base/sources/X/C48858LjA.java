package X;

import android.content.Context;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.LjA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C48858LjA implements C79O {
    public final /* synthetic */ AnonymousClass795 A00;

    public /* synthetic */ C48858LjA(AnonymousClass795 anonymousClass795) {
        this.A00 = anonymousClass795;
    }

    @Override // X.C79O
    public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
        C910143t c910143t;
        AbstractC46448Kh8 c45942KUt;
        C45945KUw c45945KUw;
        String str;
        int i;
        Integer valueOf;
        C38321qM c38321qM;
        C38321qM c38321qM2;
        String id;
        String str2;
        String str3;
        C83403nh c83403nh = c160787Im.A0e;
        AnonymousClass442 A0P = c83403nh.A0P();
        A0P.getClass();
        AbstractC46449Kh9 abstractC46449Kh9 = null;
        C7QL A01 = C7QK.A01(userSession, anonymousClass988, c160787Im, c7im, A0P, A0P.A0F);
        C7QX A02 = C7QM.A02(userSession, c160787Im, A0P);
        if (A0P.A0I != null) {
            AnonymousClass442 A0P2 = c83403nh.A0P();
            A0P2.getClass();
            return new KTD(null, null, A02, A01, new C45943KUu(A0P2.A0I, null, -1L, false), null);
        }
        C2EY c2ey = A0P.A0F;
        if (c2ey == C2EY.A1F) {
            c38321qM = (C38321qM) A0P.A01.A00;
        } else if (c2ey == C2EY.A0W) {
            c38321qM = A0P.A02.A01;
        } else if (c2ey == C2EY.A1g) {
            c38321qM = A0P.A04.A01;
        } else if (c2ey == C2EY.A1V) {
            c38321qM = A0P.A03.A02;
        } else {
            C2EY c2ey2 = C2EY.A0s;
            if (c2ey == c2ey2 || (A0P.A01() != null && A0P.A01().size() == 1)) {
                AnonymousClass442 A0P3 = c83403nh.A0P();
                A0P3.getClass();
                if (A0P3.A0F == c2ey2) {
                    c910143t = A0P3.A09;
                } else {
                    ImmutableList A012 = A0P3.A01();
                    A012.getClass();
                    c910143t = (C910143t) AbstractC166987dD.A16(A012);
                }
                c910143t.getClass();
                ExtendedImageUrl extendedImageUrl = c910143t.A0X;
                if (!AbstractC81033jX.A03(extendedImageUrl)) {
                    if (extendedImageUrl != null) {
                        boolean A1P = AbstractC167007dF.A1P(c910143t.A02, 4);
                        int i2 = c910143t.A08;
                        if (i2 != 8) {
                            if (i2 != 9) {
                                valueOf = null;
                                c45942KUt = new C45943KUu(extendedImageUrl, valueOf, -1L, A1P);
                            } else {
                                i = R.drawable.instagram_play_filled_32;
                            }
                        } else {
                            i = R.drawable.instagram_reels_filled_32;
                        }
                        valueOf = Integer.valueOf(i);
                        c45942KUt = new C45943KUu(extendedImageUrl, valueOf, -1L, A1P);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    c45942KUt = new C45942KUt(c910143t.A0K);
                }
                String str4 = c910143t.A0w;
                if (str4 != null && (str = A0P3.A0T) != null) {
                    c45945KUw = new C45945KUw(str4, A0P3.A0U, str, A0P3.A0R);
                } else {
                    c45945KUw = null;
                }
                return new KTD(null, null, C7QM.A02(userSession, c160787Im, A0P3), C7QK.A01(userSession, anonymousClass988, c160787Im, c7im, A0P3, A0P3.A0F), c45942KUt, c45945KUw);
            }
            C0w9.A04("ContextReplyDecoratedItemDefinitionShimViewHolderFactory_getGeneratorForTextReplyToMediaShare", "Message type is not media_share, xma or hscroll share single xma", 1);
            return null;
        }
        AnonymousClass442 A0P4 = c83403nh.A0P();
        A0P4.getClass();
        C9CL c9cl = A0P4.A01;
        if (c9cl == null || (str3 = c9cl.A02) == null || (c38321qM2 = c38321qM.A1h(str3)) == null) {
            c38321qM2 = c38321qM;
        }
        C1575375n c1575375n = A0P4.A02;
        C7QP c7qp = A0P4.A04;
        C7QR c7qr = A0P4.A03;
        C206409Bx A00 = LC0.A00(c38321qM2);
        AbstractC46448Kh8 A002 = AbstractC46810Kn5.A00(context, userSession, c38321qM2, AbstractC167007dF.A1W(c7qp));
        if (c9cl != null) {
            abstractC46449Kh9 = AbstractC47854LBx.A00(c9cl, userSession, c38321qM, A0P4.A0T, A0P4.A0U);
        } else if (c1575375n != null) {
            abstractC46449Kh9 = new C45946KUx(c38321qM.A1S(), c1575375n.A02, c38321qM.getId(), A0P4.A0T, A0P4.A0R, AbstractC31172DnG.A1Z(userSession, A0P4.A0U));
        } else if (c7qp != null) {
            if (c7qp.A07 != null && AbstractC25226BEj.A14(c38321qM) != null && A0P4.A0T != null) {
                id = c38321qM.getId();
                str2 = c7qp.A07;
                abstractC46449Kh9 = new C45947KUy(new C1N9(AbstractC25226BEj.A14(c38321qM)), id, str2, A0P4.A0T, A0P4.A0R, A0P4.A0U);
            }
        } else if (c7qr != null && c7qr.A08 != null && AbstractC25226BEj.A14(c38321qM) != null && A0P4.A0T != null) {
            id = c38321qM.getId();
            str2 = c7qr.A08;
            abstractC46449Kh9 = new C45947KUy(new C1N9(AbstractC25226BEj.A14(c38321qM)), id, str2, A0P4.A0T, A0P4.A0R, A0P4.A0U);
        }
        return new KTD(A00, c38321qM2, A02, A01, A002, abstractC46449Kh9);
    }
}
