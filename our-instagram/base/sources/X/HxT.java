package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.reels.Reel;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class HxT {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, com.instagram.sponsored.analytics.SourceModelInfoParams] */
    public static final Boolean A00(C6FQ c6fq, C6FW c6fw) {
        C38321qM A0h;
        C38321qM A1e;
        int i;
        List BhH;
        List BhH2;
        Object obj;
        C40971v4 c40971v4;
        C09530e4 A1L;
        C37952Gmu c37952Gmu;
        C37952Gmu c37952Gmu2;
        Fragment A01 = C6BQ.A01(c6fq);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        boolean z = false;
        Object A03 = c6fw.A03(0);
        AbstractC25225BEi.A1S(A03);
        String str = (String) A03;
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 1);
        Number number = (Number) list.get(2);
        Number number2 = (Number) list.get(3);
        String A0s2 = AbstractC31173DnH.A0s(list, 4);
        String A0s3 = AbstractC31173DnH.A0s(list, 5);
        if (A0s != null) {
            if (number != null && number2 != null) {
                int intValue = number.intValue();
                int intValue2 = number2.intValue();
                C14360o3.A0B(A0K, 0);
                AbstractC167007dF.A1D(A01, 1, str);
                Reel A0M = AbstractC37301Gc2.A0M(A0K).A0M(A0s);
                if (A0M != null) {
                    C41181vS A0A = A0M.A0A(A0K, intValue);
                    C14360o3.A07(A0A);
                    View view = A01.mView;
                    if (view != null) {
                        Context requireContext = A01.requireContext();
                        C38321qM c38321qM = A0A.A0b;
                        if (c38321qM != null) {
                            C71313Hs A07 = AbstractC37301Gc2.A07(A0K);
                            A07.A05(view, EnumC71343Hv.A0J);
                            C2Fb c2Fb = C2Fb.A1X;
                            A07.A0A(view, new C79623hD(new C139726Ub(requireContext, A0K, c38321qM.A1i(str)), A0K, c38321qM, AbstractC60952qJ.A01(c2Fb.toString(), false, true)));
                            A07.A0B(view, new String[0]);
                            C130915ve c130915ve = new C130915ve(A0K, A0M, A0s2, A0s3, intValue, intValue2);
                            String str2 = A0A.A0j;
                            ?? obj2 = new Object();
                            obj2.A09 = A0s3;
                            obj2.A05 = A0s2;
                            obj2.A04 = A0s;
                            obj2.A01 = intValue;
                            obj2.A03 = intValue2;
                            obj2.A06 = str2;
                            C37952Gmu c37952Gmu3 = new C37952Gmu(A01, A0K, c130915ve, AbstractC60952qJ.A01(c2Fb.toString(), false, true), c2Fb);
                            c37952Gmu3.A0M = A0M;
                            c37952Gmu3.A02(obj2);
                            c37952Gmu2 = c37952Gmu3;
                            c37952Gmu2.A0g = str;
                            c37952Gmu = c37952Gmu2;
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        if (A0s2 != null) {
            C14360o3.A0B(A0K, 0);
            AbstractC167007dF.A1D(A01, 1, str);
            View view2 = A01.mView;
            if (view2 != null && (c40971v4 = (C40971v4) ((C151286rW) A0K.A01(C151286rW.class, C151276rV.A00)).A00.get(A0s2)) != null) {
                C5SE c5se = new C5SE(A0K, c40971v4);
                SourceModelInfoParams sourceModelInfoParams = new SourceModelInfoParams(c40971v4.A0S, 0, 0);
                Context requireContext2 = A01.requireContext();
                C71313Hs A072 = AbstractC37301Gc2.A07(A0K);
                A072.A05(view2, EnumC71343Hv.A0J);
                C42125IlZ c42125IlZ = new C42125IlZ(requireContext2, A0K, c40971v4, str);
                C2Fb c2Fb2 = C2Fb.A1X;
                A072.A0A(view2, new C37997Gni(c42125IlZ, null, A0K, AbstractC60952qJ.A01(c2Fb2.toString(), false, true), c40971v4));
                A072.A0B(view2, new String[0]);
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, A0K, 36316194755580008L)) {
                    C37952Gmu c37952Gmu4 = new C37952Gmu(A01, A0K, c5se, AbstractC60952qJ.A01(c2Fb2.toString(), false, true), c2Fb2);
                    c37952Gmu4.A0O = c40971v4;
                    c37952Gmu4.A02(sourceModelInfoParams);
                    c37952Gmu2 = c37952Gmu4;
                    if (C18U.A06(c06090Tz, A0K, 36321713789871838L)) {
                        c37952Gmu2 = c37952Gmu4;
                        if (c40971v4.A0l != null) {
                            c37952Gmu2 = c37952Gmu4;
                            if (c40971v4.A01 == AdFormatType.A04) {
                                ImmutableList A012 = c40971v4.A01();
                                int i2 = 0;
                                if (A012 != null && !A012.isEmpty()) {
                                    Iterator<E> it = A012.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        int i3 = i2 + 1;
                                        if (i2 < 0) {
                                            AbstractC16960so.A1U();
                                            throw C00O.createAndThrow();
                                        }
                                        C38321qM c38321qM2 = (C38321qM) next;
                                        if (C14360o3.A0K(c38321qM2.A0C.B01(), str)) {
                                            A1L = AbstractC166987dD.A1L(c38321qM2, Integer.valueOf(i2));
                                            break;
                                        }
                                        i2 = i3;
                                    }
                                }
                                A1L = AbstractC166987dD.A1L(null, 0);
                                Object obj3 = A1L.A00;
                                c37952Gmu = c37952Gmu4;
                                if (obj3 != null) {
                                    c37952Gmu4.A01((C38321qM) obj3);
                                    c37952Gmu4.A09 = AbstractC166987dD.A0H(A1L.A01);
                                    c37952Gmu = c37952Gmu4;
                                }
                            }
                        }
                    }
                    c37952Gmu2.A0g = str;
                    c37952Gmu = c37952Gmu2;
                }
            }
            return Boolean.valueOf(z);
        }
        if (A0s3 != null) {
            C14360o3.A0B(A0K, 0);
            AbstractC167007dF.A1D(A01, 1, str);
            View view3 = A01.mView;
            if (view3 != null && (A0h = AbstractC25229BEm.A0h(A0K, A0s3)) != null && (A1e = A0h.A1e(0)) != null) {
                C5SE c5se2 = new C5SE(A0K, A0h);
                JMF B5y = A1e.A0C.B5y();
                List list2 = null;
                if (B5y != null && (BhH2 = B5y.BhH()) != null) {
                    Iterator it2 = BhH2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (C14360o3.A0K(((JL4) obj).getProductId(), str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    JL4 jl4 = (JL4) obj;
                    if (jl4 != null) {
                        list2 = jl4.Abm();
                    }
                }
                AndroidLink A032 = AbstractC905941u.A03(A01.requireContext(), A0K, list2, false);
                Context requireContext3 = A01.requireContext();
                C71313Hs A073 = AbstractC37301Gc2.A07(A0K);
                A073.A05(view3, EnumC71343Hv.A0J);
                C2Fb c2Fb3 = C2Fb.A1X;
                int i4 = 0;
                C60962qK A013 = AbstractC60952qJ.A01(c2Fb3.toString(), false, true);
                C75113Zb A0E = AbstractC37303Gc4.A0E(A0h);
                JMF B5y2 = A1e.A0C.B5y();
                if (B5y2 != null && (BhH = B5y2.BhH()) != null) {
                    Iterator it3 = BhH.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (C14360o3.A0K(((JL4) it3.next()).getProductId(), str)) {
                            if (i4 >= 0) {
                                i = i4 + 1;
                            }
                        } else {
                            i4++;
                        }
                    }
                }
                i = 0;
                A0E.A0B(i);
                A073.A0A(view3, new C79623hD(new C86933u7(requireContext3, A0E, A0K, A0h), A0K, A0h, A013));
                A073.A0B(view3, new String[0]);
                C37952Gmu c37952Gmu5 = new C37952Gmu(A01, A0K, c5se2, AbstractC60952qJ.A01(c2Fb3.toString(), false, true), c2Fb3);
                c37952Gmu5.A0g = str;
                c37952Gmu5.A0J = A0h;
                c37952Gmu5.A0L = A032;
                c37952Gmu = c37952Gmu5;
            }
        }
        return Boolean.valueOf(z);
        C37953Gmv.A02(c37952Gmu);
        z = true;
        return Boolean.valueOf(z);
    }
}
