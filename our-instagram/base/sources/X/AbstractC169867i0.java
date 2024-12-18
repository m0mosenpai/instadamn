package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7i0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC169867i0 implements C2VC, InterfaceC50832Ve {
    public void A03(C170057iK c170057iK, AbstractC169857hz abstractC169857hz, AbstractC169857hz abstractC169857hz2, C169827hw c169827hw, C169827hw c169827hw2, C169827hw c169827hw3) {
    }

    public static C2V9 A02(C169827hw c169827hw, int i) {
        AbstractC169857hz A0E = c169827hw.A0E();
        if (A0E == null) {
            C2YE.A00("SectionContext:NoScopeEventHandler", C05F.A0C, "Creating event handler without scope.");
            C212019aW c212019aW = new C2V9() { // from class: X.9aW
                /* JADX WARN: Type inference failed for: r2v0, types: [X.2VD, java.lang.Object] */
                {
                    new C2VE(null, new Object());
                }
            };
            C14360o3.A0C(c212019aW, "null cannot be cast to non-null type com.facebook.litho.NoOpEventHandler<E of com.facebook.litho.NoOpEventHandler.Companion.getNoOpEventHandler>");
            return c212019aW;
        }
        if (C9QO.class != A0E.getClass()) {
            Integer num = C05F.A01;
            String str = A0E.A09;
            C2YE.A00(AnonymousClass001.A0R("SectionLifecycle:WrongContextForEventHandler:", str), num, String.format("A Event handler from %s was created using a context from %s. Event Handlers must be created using a SectionContext from its Section.", "ClipsCarouselThumbnailsHScrollSection", str));
        }
        C2V9 c2v9 = new C2V9(new C2VE(c169827hw, A0E), i);
        C170007iF c170007iF = c169827hw.A01;
        if (c170007iF == null || c170007iF.A00 == null || ((C2XE) c169827hw).A02.A01.A0U) {
            return c2v9;
        }
        String A08 = c169827hw.A08();
        C170017iG c170017iG = c170007iF.A00;
        if (c170017iG != null) {
            c170017iG.A00.add(new Pair(A08, c2v9));
            return c2v9;
        }
        throw new RuntimeException("Trying to use inactive ChangeSetCalculationState!");
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0159: IGET (r0 I:X.2VE) = (r12 I:X.2V9) (LINE:345) X.2V9.A00 X.2VE, block:B:34:0x0159 */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.2V9] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.2WH, X.2Vc, X.2Va] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, X.7jK] */
    @Override // X.C2VC
    public final Object APq(C2V9 c2v9, Object obj) {
        ?? r12;
        Object obj2;
        Object obj3;
        try {
            if (this instanceof C9QO) {
                int i = c2v9.A01;
                if (i != 851046848) {
                    if (i != 947264300) {
                        if (i == 1463818325) {
                            C170157iU c170157iU = (C170157iU) obj;
                            C2VE c2ve = c2v9.A00;
                            C2VD c2vd = c2ve.A01;
                            C2XE c2xe = c2ve.A00;
                            int i2 = c170157iU.A00;
                            ImageUrl imageUrl = (ImageUrl) c170157iU.A01;
                            C9QO c9qo = (C9QO) c2vd;
                            AbstractC25398BLp abstractC25398BLp = c9qo.A03;
                            InterfaceC60442pS interfaceC60442pS = c9qo.A01;
                            UserSession userSession = c9qo.A00;
                            InterfaceC31137Dmc interfaceC31137Dmc = c9qo.A02;
                            boolean z = c9qo.A04;
                            C14360o3.A0B(c2xe, 0);
                            C14360o3.A0B(abstractC25398BLp, 1);
                            C14360o3.A0B(interfaceC60442pS, 2);
                            C14360o3.A0B(userSession, 3);
                            C14360o3.A0B(interfaceC31137Dmc, 4);
                            C14360o3.A0B(imageUrl, 7);
                            ?? obj4 = new Object();
                            ?? abstractC50792Va = new AbstractC50792Va("Row");
                            abstractC50792Va.A00 = null;
                            abstractC50792Va.A01 = null;
                            abstractC50792Va.A02 = null;
                            abstractC50792Va.A03 = null;
                            abstractC50792Va.A06 = false;
                            abstractC50792Va.A04 = null;
                            abstractC50792Va.A05 = null;
                            if (c2xe.A01 != null) {
                                abstractC50792Va.A01 = c2xe.A08();
                            }
                            abstractC50792Va.A02 = AbstractC50812Vc.A01(c2xe.A0C);
                            C75933ay c75933ay = C51722Yv.A02;
                            C51722Yv c51722Yv = new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CU(C05F.A00, 0, Double.doubleToRawLongBits(abstractC25398BLp.A02()))), new C9CU(C05F.A01, 0, Double.doubleToRawLongBits(abstractC25398BLp.A01()))), new C9CV(C05F.A0u, true, 4));
                            Integer valueOf = Integer.valueOf(i2);
                            Integer valueOf2 = Integer.valueOf(abstractC25398BLp.A03());
                            String Ayl = abstractC25398BLp.A0D.Ayl(abstractC25398BLp.A0H);
                            if (Ayl == null) {
                                Ayl = "";
                            }
                            String string = c2xe.A0D.A01.getString(2131954837, Arrays.copyOf(new Object[]{valueOf, valueOf2, Ayl}, 3));
                            if (string != null) {
                                C26643Bpe c26643Bpe = new C26643Bpe(new C51722Yv(c51722Yv, new C9CV(C05F.A0N, string, 0)), userSession, imageUrl, interfaceC60442pS, interfaceC31137Dmc, abstractC25398BLp, i2, z);
                                List list = abstractC50792Va.A05;
                                if (list == null) {
                                    list = new ArrayList();
                                    abstractC50792Va.A05 = list;
                                }
                                list.add(c26643Bpe);
                                obj4.A00 = abstractC50792Va;
                                return new C170697jM(obj4);
                            }
                            throw new RuntimeException(AnonymousClass001.A0R(AbstractC111324zv.A00(338), Integer.toHexString(2131954837)));
                        }
                        return null;
                    }
                    C170107iP c170107iP = (C170107iP) obj;
                    obj2 = c170107iP.A01;
                    obj3 = c170107iP.A00;
                } else {
                    C169557hV c169557hV = (C169557hV) obj;
                    obj2 = c169557hV.A01;
                    obj3 = c169557hV.A00;
                }
                C14360o3.A0B(obj2, 1);
                C14360o3.A0B(obj3, 2);
                return Boolean.valueOf(obj2.equals(obj3));
            }
            return null;
        } catch (Exception e) {
            C2XE c2xe2 = r12.A00.A00;
            if (c2xe2 != null) {
                throw C51372Xk.A00(c2xe2, e);
            }
            throw e;
        }
    }
}
