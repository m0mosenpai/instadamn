package X;

import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.VideoVersionIntf;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.5xx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132195xx {
    public static final /* synthetic */ C132195xx A00 = new Object();

    public final InterfaceC132185xw A00(UserSession userSession, C38321qM c38321qM, Double d, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        InterfaceC99334d2 C6Y;
        C4d0 BuA;
        Integer Bju;
        String B9n;
        String A2p;
        GifUrlImpl A1s;
        Integer A2R;
        int A0z;
        int A0y;
        int i2;
        InterfaceC99334d2 C6Y2;
        C4d0 BuA2;
        Integer Bju2;
        VideoVersionIntf videoVersionIntf;
        C14360o3.A0B(c38321qM, 0);
        String str = null;
        if (!c38321qM.A5J()) {
            if (c38321qM.A59()) {
                List CFe = c38321qM.A0C.CFe();
                if (CFe != null && (videoVersionIntf = (VideoVersionIntf) AbstractC001800i.A0J(CFe)) != null && videoVersionIntf.CHg() != null && videoVersionIntf.BDS() != null) {
                    Integer CHg = videoVersionIntf.CHg();
                    if (CHg != null) {
                        A0z = CHg.intValue();
                        Integer BDS = videoVersionIntf.BDS();
                        if (BDS != null) {
                            A0y = BDS.intValue();
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    A0z = c38321qM.A0z();
                    A0y = c38321qM.A0y();
                }
                if (z) {
                    String id = c38321qM.getId();
                    if (id != null) {
                        C75363a3 CFR = c38321qM.CFR();
                        ImageUrl A1S = c38321qM.A1S();
                        String BcQ = c38321qM.A0C.BcQ();
                        User A2E = c38321qM.A2E(userSession);
                        if (A2E != null) {
                            str = A2E.getUsername();
                        }
                        return new C136876Hq(A1S, CFR, c38321qM.CCj(), id, BcQ, str, c38321qM.BU6(), A0z, A0y, c38321qM.A18());
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                if (z2) {
                    String id2 = c38321qM.getId();
                    if (id2 != null) {
                        String AXw = c38321qM.A0C.AXw();
                        C75363a3 CFR2 = c38321qM.CFR();
                        ImageUrl A1S2 = c38321qM.A1S();
                        String BcQ2 = c38321qM.A0C.BcQ();
                        if (z4 && (C6Y2 = c38321qM.A0C.C6Y()) != null && (BuA2 = C6Y2.BuA()) != null && (Bju2 = BuA2.Bju()) != null) {
                            i2 = Bju2.intValue();
                        } else {
                            i2 = 0;
                        }
                        User A2E2 = c38321qM.A2E(userSession);
                        if (A2E2 != null) {
                            str = A2E2.getUsername();
                        }
                        return new C136886Hr(A1S2, CFR2, id2, AXw, BcQ2, str, A0z, A0y, i2, z3);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                String id3 = c38321qM.getId();
                if (id3 != null) {
                    String AXw2 = c38321qM.A0C.AXw();
                    C75363a3 CFR3 = c38321qM.CFR();
                    return new C9CM(c38321qM.A1S(), CFR3, c38321qM.CCj(), id3, AXw2, c38321qM.BU6(), A0z, A0y, c38321qM.A18());
                }
                throw new IllegalStateException("Required value was null.");
            }
            CommentGiphyMediaInfoIntf B9s = c38321qM.A0C.B9s();
            if (B9s != null && (B9n = B9s.B9n()) != null && (A2p = c38321qM.A2p()) != null && (A1s = c38321qM.A1s()) != null && (A2R = c38321qM.A2R()) != null) {
                int intValue = A2R.intValue();
                Integer A2S = c38321qM.A2S();
                if (A2S != null) {
                    int intValue2 = A2S.intValue();
                    if (intValue > 0 && intValue2 > 0) {
                        String id4 = c38321qM.getId();
                        if (id4 != null) {
                            return new C45168Jz9(new SimpleImageUrl(A2p), A1s, id4, c38321qM.A0C.AXw(), B9n, intValue2, intValue);
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            ExtendedImageUrl A002 = AbstractC132205xy.A00(userSession, c38321qM, d);
            if (A002 != null) {
                String id5 = c38321qM.getId();
                if (z) {
                    if (id5 != null) {
                        int A0z2 = c38321qM.A0z();
                        int A0y2 = c38321qM.A0y();
                        String AXw3 = c38321qM.A0C.AXw();
                        String BcQ3 = c38321qM.A0C.BcQ();
                        User A2E3 = c38321qM.A2E(userSession);
                        if (A2E3 != null) {
                            str = A2E3.getUsername();
                        }
                        long A18 = c38321qM.A18();
                        return new C136896Hs(A002, c38321qM.A1S(), c38321qM.CCj(), id5, AXw3, BcQ3, str, c38321qM.BU6(), A0z2, A0y2, A18);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                if (z2) {
                    if (id5 != null) {
                        int A0z3 = c38321qM.A0z();
                        int A0y3 = c38321qM.A0y();
                        String AXw4 = c38321qM.A0C.AXw();
                        String BcQ4 = c38321qM.A0C.BcQ();
                        if (z4 && (C6Y = c38321qM.A0C.C6Y()) != null && (BuA = C6Y.BuA()) != null && (Bju = BuA.Bju()) != null) {
                            i = Bju.intValue();
                        } else {
                            i = 0;
                        }
                        User A2E4 = c38321qM.A2E(userSession);
                        if (A2E4 != null) {
                            str = A2E4.getUsername();
                        }
                        long A182 = c38321qM.A18();
                        return new C136906Ht(A002, c38321qM.A1S(), c38321qM.CCj(), id5, AXw4, BcQ4, str, c38321qM.BU6(), A0z3, A0y3, i, A182, z3);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                if (id5 != null) {
                    int A0z4 = c38321qM.A0z();
                    int A0y4 = c38321qM.A0y();
                    String AXw5 = c38321qM.A0C.AXw();
                    long A183 = c38321qM.A18();
                    return new C9CM(A002, c38321qM.A1S(), c38321qM.CCj(), id5, AXw5, c38321qM.BU6(), A0z4, A0y4, A183);
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        return null;
    }
}
