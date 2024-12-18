package X;

import com.facebook.R;
import com.instagram.api.schemas.MidCardOverlayType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class BVP extends AbstractC51572Yf {
    public final InterfaceC31056Dkw A00;
    public final InterfaceC31068DlA A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final HashMap A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [X.BVP] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.DkQ] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Integer num;
        InterfaceC31169DnD interfaceC31169DnD;
        List BRE;
        C14360o3.A0B(c76223bS, 0);
        InterfaceC31068DlA interfaceC31068DlA = this.A01;
        InterfaceC31168DnC interfaceC31168DnC = (InterfaceC31168DnC) interfaceC31068DlA;
        if (!interfaceC31168DnC.CdM() && (BRE = interfaceC31168DnC.BRE()) != null && BRE.size() >= 3) {
            if (interfaceC31168DnC.CDf()) {
                num = C05F.A0C;
            } else {
                num = C05F.A01;
            }
        } else {
            num = C05F.A00;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                interfaceC31169DnD = new Object();
            } else {
                interfaceC31169DnD = new Object();
            }
        } else {
            interfaceC31169DnD = new Object();
        }
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0d = AbstractC25230BEn.A0d(null, C05F.A00, 100.0f, 0);
        int Amk = interfaceC31169DnD.Amk();
        long A0D = AbstractC77623dm.A0D(c76223bS, Amk);
        Integer num2 = C05F.A01;
        C51722Yv A00 = C9CU.A00(A0d, num2, 0, A0D);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        if (interfaceC31169DnD instanceof InterfaceC31169DnD) {
            InterfaceC31169DnD interfaceC31169DnD2 = interfaceC31169DnD;
            C2Z0 A0K = AbstractC25233BEq.A0K(A12);
            int AZt = interfaceC31169DnD2.AZt();
            int AZr = interfaceC31169DnD2.AZr();
            A0K.A00(A03(A0K, AbstractC25230BEn.A0d(C9CU.A00(null, C05F.A09, 0, AbstractC77623dm.A0D(A0K, interfaceC31169DnD2.AZs())), num2, interfaceC31169DnD2.BMw(), 2), null, 1, AZt, AZr));
            A0K.A00(A03(A0K, AbstractC25230BEn.A0d(null, num2, interfaceC31169DnD2.BpP(), 2), null, 2, AZt, AZr));
            A12.A00(new C2WH(null, null, null, null, null, A0K.A01, false));
        }
        return AbstractC25226BEj.A0l(A03(A12, C9CV.A00(null, C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), interfaceC31068DlA.Bad(), 0, interfaceC31169DnD.Aml(), Amk), A12, c76223bS, A00);
    }

    private final C2WH A03(C2Z1 c2z1, C51722Yv c51722Yv, MidCardOverlayType midCardOverlayType, int i, int i2, int i3) {
        C38321qM c38321qM;
        String str;
        ImageUrlBase imageUrlBase;
        InterfaceC30886Dhz interfaceC30886Dhz;
        AbstractC50812Vc c26465Bmm;
        InterfaceC30885Dhy interfaceC30885Dhy;
        C3x9 A0u;
        MusicInfo BVc;
        TrackData BVV;
        InterfaceC30891Di4 interfaceC30891Di4;
        User A14;
        InterfaceC31068DlA interfaceC31068DlA = this.A01;
        List BRE = interfaceC31068DlA.BRE();
        if (BRE != null) {
            c38321qM = (C38321qM) AbstractC001800i.A0O(BRE, i);
        } else {
            c38321qM = null;
        }
        C75933ay c75933ay = C51722Yv.A02;
        long A0D = AbstractC77623dm.A0D(c2z1, i2);
        Integer num = C05F.A00;
        C51722Yv A00 = C9CU.A00(null, num, 0, A0D);
        long A0D2 = AbstractC77623dm.A0D(c2z1, i3);
        Integer num2 = C05F.A01;
        C51722Yv A002 = C9CU.A00(A00, num2, 0, A0D2).A00(c51722Yv);
        C2Z0 A0L = AbstractC25233BEq.A0L(c2z1);
        if (c38321qM != null) {
            str = c38321qM.getId();
            imageUrlBase = BNM.A00(AbstractC77363dM.A00(A0L), c38321qM);
        } else {
            str = null;
            imageUrlBase = null;
        }
        HashMap hashMap = this.A04;
        String id = interfaceC31068DlA.getId();
        InterfaceC11380iw interfaceC11380iw = this.A02;
        int A0F = AbstractC25231BEo.A0F(A0L, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        C51722Yv A0Y = AbstractC25233BEq.A0Y(AbstractC25233BEq.A0Y(null, A0L, num, i2, 0), A0L, num2, i3, 0);
        C2XE c2xe = A0L.A00;
        C2WK c2wk = new C2WK();
        C2XH c2xh = c2xe.A0D;
        EnumC77763e0 enumC77763e0 = EnumC77763e0.ALL;
        if (c2xh != null) {
            c2wk.A01(enumC77763e0, 1);
            c2wk.A00(enumC77763e0, AbstractC25228BEl.A06(c2xe.A0C, A0L, R.attr.igds_color_photo_border));
            Arrays.fill(c2wk.A00, 0, 4, c2xh.A03(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
            A0L.A00(new C26646Bph(AbstractC25231BEo.A0Y(C9CV.A00(A0Y, num2, c2wk, 3), new DHO(i, 27, this)), interfaceC11380iw, imageUrlBase, str, id, interfaceC31068DlA.Avy(), hashMap, i, A0F));
            if (midCardOverlayType == MidCardOverlayType.A0B) {
                if (c38321qM != null && (A14 = AbstractC25226BEj.A14(c38321qM)) != null) {
                    interfaceC30891Di4 = new C26256BjP(A14.Bhu(), A14.getUsername(), A14.isVerified());
                } else {
                    interfaceC30891Di4 = D0U.A00;
                }
                c26465Bmm = new C26444BmR(AbstractC25233BEq.A0T(AbstractC25234BEr.A0M(AbstractC25234BEr.A0D(null, AbstractC25227BEk.A0Y(0, AbstractC77623dm.A07(A0L)), 0, AbstractC77623dm.A07(A0L)), C05F.A0C, 1, AbstractC25229BEm.A0D()), AbstractC25225BEi.A0o(C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), num, 100.0f, 0), interfaceC11380iw, interfaceC30891Di4, R.dimen.abc_dropdownitem_icon_width, R.dimen.action_bar_item_spacing_right);
            } else if (midCardOverlayType == MidCardOverlayType.A04) {
                if (c38321qM != null && (A0u = AbstractC25226BEj.A0u(c38321qM)) != null && (BVc = A0u.BVc()) != null && (BVV = BVc.BVV()) != null) {
                    interfaceC30885Dhy = new C26249BjI(BVV.getDisplayArtist(), BVV.getTitle());
                } else {
                    interfaceC30885Dhy = D0O.A00;
                }
                c26465Bmm = new C26383BlS(AbstractC25233BEq.A0T(AbstractC25234BEr.A0M(AbstractC25234BEr.A0D(null, AbstractC25227BEk.A0Y(0, AbstractC77623dm.A07(A0L)), 0, AbstractC77623dm.A07(A0L)), C05F.A0C, 1, AbstractC25229BEm.A0D()), AbstractC25225BEi.A0o(C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), num, 100.0f, 0), interfaceC30885Dhy);
            } else {
                if (midCardOverlayType == MidCardOverlayType.A05) {
                    UserSession userSession = this.A03;
                    C14360o3.A0B(userSession, 1);
                    if (c38321qM != null) {
                        interfaceC30886Dhz = new C26251BjK(c38321qM, c38321qM.A3t(userSession));
                    } else {
                        interfaceC30886Dhz = D0P.A00;
                    }
                    c26465Bmm = new C26465Bmm(AbstractC25233BEq.A0T(AbstractC25234BEr.A0M(AbstractC25234BEr.A0D(null, AbstractC25227BEk.A0Y(0, AbstractC77623dm.A07(A0L)), 0, AbstractC77623dm.A07(A0L)), C05F.A0C, 1, AbstractC25229BEm.A0D()), AbstractC25225BEi.A0o(C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), num, 100.0f, 0), interfaceC11380iw, userSession, interfaceC30886Dhz);
                }
                return AbstractC76963ci.A0I(A0L, c2z1, A002);
            }
            A0L.A00(c26465Bmm);
            return AbstractC76963ci.A0I(A0L, c2z1, A002);
        }
        throw AbstractC166987dD.A14("This builder has already been disposed / built!");
    }

    public BVP(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC31056Dkw interfaceC31056Dkw, InterfaceC31068DlA interfaceC31068DlA, HashMap hashMap) {
        AbstractC25234BEr.A1P(interfaceC11380iw, userSession, interfaceC31056Dkw);
        C14360o3.A0B(hashMap, 5);
        this.A02 = interfaceC11380iw;
        this.A03 = userSession;
        this.A01 = interfaceC31068DlA;
        this.A00 = interfaceC31056Dkw;
        this.A04 = hashMap;
    }
}
