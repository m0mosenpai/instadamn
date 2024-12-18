package X;

import android.app.Application;
import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.VideoVersionIntf;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.JlV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44463JlV extends C193578hc {
    public final long A00;
    public final long A01;
    public final long A02;
    public final L5S A03;
    public final UserSession A04;
    public final C1DX A05;
    public final InterfaceC60442pS A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final C0UO A0A;
    public final C47603L0o A0B;
    public final C05A A0C;

    public static MUD A00(C44463JlV c44463JlV, C38321qM c38321qM) {
        InterfaceC43580JMo CHL;
        if (c38321qM.A6U()) {
            if (C18U.A06(C06090Tz.A05, c44463JlV.A04, 36330170579174112L) && (CHL = c38321qM.A0C.CHL()) != null) {
                return new MUD(new SimpleImageUrl(CHL.getAttributionTopIconUrl()), CHL.getAttributionTitle(), CHL.getAttributionCtaActionUrl());
            }
        }
        return null;
    }

    private final InterfaceC31033DkX A01(C38321qM c38321qM, C38321qM c38321qM2) {
        List AlQ;
        C5Hc c5Hc;
        String B9n;
        int A0z;
        int A0y;
        VideoVersionIntf videoVersionIntf;
        if (c38321qM != null && c38321qM2 != null) {
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
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    A0z = c38321qM.A0z();
                    A0y = c38321qM.A0y();
                }
                String id = c38321qM.getId();
                if (id != null) {
                    return new C26145BhW(A00(this, c38321qM), c38321qM.CFR(), id, c38321qM.A0C.AXw(), A0z, A0y);
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            GifUrlImpl A1s = c38321qM.A1s();
            if (A1s != null) {
                Integer A2R = c38321qM.A2R();
                if (A2R != null) {
                    int intValue = A2R.intValue();
                    Integer A2S = c38321qM.A2S();
                    if (A2S != null) {
                        int intValue2 = A2S.intValue();
                        CommentGiphyMediaInfoIntf B9s = c38321qM.A0C.B9s();
                        if (B9s != null && (B9n = B9s.B9n()) != null) {
                            if (intValue2 > 0 && intValue > 0) {
                                String id2 = c38321qM.getId();
                                if (id2 != null) {
                                    return new C26144BhV(A1s, id2, c38321qM.A0C.AXw(), B9n, intValue2, intValue);
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    }
                }
            }
            ImageInfo A1t = c38321qM.A1t();
            if (A1t != null && (AlQ = A1t.AlQ()) != null) {
                String id3 = c38321qM.getId();
                if (id3 != null) {
                    int A0z2 = c38321qM.A0z();
                    int A0y2 = c38321qM.A0y();
                    String AXw = c38321qM.A0C.AXw();
                    ArrayList A3M = c38321qM.A3M();
                    if (A3M == null || (c5Hc = AbstractC133095zb.A00(A3M)) == null) {
                        c5Hc = C5HZ.A01;
                    }
                    return new C26145BhW(A00(this, c38321qM), id3, AXw, c5Hc, AbstractC133095zb.A00(AlQ), A0z2, A0y2);
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44463JlV(Application application, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        super(application);
        JQ0.A1O(userSession, interfaceC60442pS, str, str2, application);
        this.A04 = userSession;
        this.A06 = interfaceC60442pS;
        this.A07 = str;
        this.A08 = str2;
        C008002u A1H = AbstractC25225BEi.A1H(new C45101JxV(null, null, null, C5HZ.A01, 0, 0, 0, 0, 0, false, false, false, false, false, false, false));
        this.A0C = A1H;
        this.A05 = C1DW.A00(userSession);
        this.A0A = A1H;
        this.A00 = System.currentTimeMillis();
        this.A09 = AbstractC167017dG.A0j();
        AtomicBoolean atomicBoolean = C38321qM.A0i;
        String A06 = C38801rC.A06(str);
        this.A01 = Long.parseLong(AbstractC167007dF.A1N(A06.length()) ? "0" : A06);
        String A062 = C38801rC.A06(str2);
        this.A02 = Long.parseLong(A062.length() != 0 ? A062 : "0");
        C47603L0o c47603L0o = new C47603L0o(userSession);
        this.A0B = c47603L0o;
        this.A03 = new L5S(c47603L0o, userSession, interfaceC60442pS, C05F.A15, interfaceC60442pS.getModuleName(), new C50262MHr(this, 43), MJA.A00, AbstractC141776au.A00(this));
        A03(this, this.A05.A02(this.A07));
        AbstractC25232BEp.A1J(this, new MCC(this, null, 23), JQ0.A0K(userSession).A00(C57452kK.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String A02() {
        /*
            r4 = this;
            X.1DX r1 = r4.A05
            java.lang.String r0 = r4.A07
            X.1qM r1 = r1.A02(r0)
            r0 = 0
            if (r1 == 0) goto L3e
            X.4d2 r3 = X.AbstractC43592JPx.A0h(r1)
            if (r3 == 0) goto L3f
            X.1qM r2 = r3.BNd()
            if (r2 == 0) goto L1f
            java.lang.String r1 = r4.A08
            X.1qM r1 = r2.A1h(r1)
            if (r1 != 0) goto L31
        L1f:
            X.1qM r1 = r3.BNd()
            if (r1 == 0) goto L3f
            java.lang.String r2 = r1.getId()
        L29:
            java.lang.String r1 = r4.A08
            boolean r1 = X.C14360o3.A0K(r2, r1)
            if (r1 == 0) goto L3d
        L31:
            X.1qM r1 = r3.BNd()
            if (r1 == 0) goto L3d
            X.1rF r0 = r1.A0C
            java.lang.String r0 = r0.BcQ()
        L3d:
            return r0
        L3e:
            r3 = r0
        L3f:
            r2 = r0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44463JlV.A02():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017f, code lost:
    
        if (r11 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0223, code lost:
    
        if (r11 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ef, code lost:
    
        if (r3.A0M() == X.C05F.A0C) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C44463JlV r28, X.C38321qM r29) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44463JlV.A03(X.JlV, X.1qM):void");
    }

    public final String A0E(int i) {
        C0UO c0uo = this.A0A;
        if (((C45101JxV) c0uo.getValue()).A08.size() <= i) {
            return null;
        }
        InterfaceC31033DkX interfaceC31033DkX = (InterfaceC31033DkX) ((C45101JxV) c0uo.getValue()).A08.get(i);
        if (C26145BhW.A00(interfaceC31033DkX, 0)) {
            return ((C26145BhW) interfaceC31033DkX).A07;
        }
        if (C26145BhW.A00(interfaceC31033DkX, 1)) {
            C38321qM A02 = this.A05.A02(this.A07);
            if (A02 == null || !LFJ.A00.A00(A02)) {
                return null;
            }
            if (!C18U.A06(C06090Tz.A05, this.A04, 36327602188860123L)) {
                return null;
            }
            return ((C26145BhW) interfaceC31033DkX).A07;
        }
        if (interfaceC31033DkX instanceof C26144BhV) {
            return null;
        }
        throw B4Z.A00();
    }
}
