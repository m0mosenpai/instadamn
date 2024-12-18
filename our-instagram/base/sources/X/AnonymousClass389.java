package X;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.389, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass389 {
    public final Fragment A00;
    public final AbstractC018607g A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C38A A04;

    public static final void A00(C38321qM c38321qM, C38889HAl c38889HAl, AnonymousClass389 anonymousClass389, String str, String str2, String str3) {
        String str4;
        Dialog A02;
        String str5;
        C38321qM c38321qM2 = c38321qM;
        FLK flk = c38889HAl.A02;
        if (c38321qM.A5M()) {
            c38321qM2 = c38321qM.A1h(str);
            C14360o3.A0A(c38321qM2);
        }
        C38A c38a = anonymousClass389.A04;
        String valueOf = String.valueOf(c38889HAl.A03);
        FeaturedProductPermissionStatus featuredProductPermissionStatus = FeaturedProductPermissionStatus.A0E;
        UserSession userSession = anonymousClass389.A03;
        c38a.A01(c38321qM2, featuredProductPermissionStatus, valueOf, str3, userSession.userId, str2);
        Fragment fragment = anonymousClass389.A00;
        Context requireContext = fragment.requireContext();
        if (flk != null) {
            C193328hC c193328hC = new C193328hC(requireContext);
            String str6 = flk.A01;
            if (str6 != null) {
                c193328hC.A05 = str6;
                String str7 = flk.A00;
                if (str7 != null) {
                    c193328hC.A0r(str7);
                    List<FLJ> list = flk.A02;
                    if (list != null) {
                        for (FLJ flj : list) {
                            C14360o3.A0B(flj, 0);
                            EnumC33387EpK enumC33387EpK = flj.A00;
                            if (enumC33387EpK != null) {
                                int ordinal = enumC33387EpK.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal != 2) {
                                        if (ordinal == 1) {
                                            String str8 = flj.A01;
                                            if (str8 != null) {
                                                c193328hC.A0c(new DialogInterfaceOnClickListenerC41793If9(anonymousClass389), str8);
                                            } else {
                                                str5 = "buttonText";
                                            }
                                        } else {
                                            throw new RuntimeException();
                                        }
                                    } else {
                                        String str9 = flj.A01;
                                        if (str9 != null) {
                                            c193328hC.A0b(new DialogInterfaceOnClickListenerC41796IfC(flj, anonymousClass389), str9);
                                        } else {
                                            str5 = "buttonText";
                                        }
                                    }
                                } else {
                                    String str10 = flj.A01;
                                    if (str10 != null) {
                                        c193328hC.A0d(null, str10);
                                    } else {
                                        str5 = "buttonText";
                                    }
                                }
                            } else {
                                str5 = "destination";
                            }
                        }
                        A02 = c193328hC.A02();
                    } else {
                        str5 = "actions";
                    }
                } else {
                    str5 = "descriptionText";
                }
            } else {
                str5 = "titleText";
            }
            C14360o3.A0F(str5);
            throw C00O.createAndThrow();
        }
        C193328hC c193328hC2 = new C193328hC(requireContext);
        c193328hC2.A0A(2131962379);
        Context requireContext2 = fragment.requireContext();
        int i = 2131962381;
        if (c38321qM2.BRp() == EnumC40111tc.A0Q) {
            i = 2131962380;
        }
        User A2E = c38321qM2.A2E(userSession);
        if (A2E != null) {
            str4 = A2E.getUsername();
        } else {
            str4 = null;
        }
        c193328hC2.A0r(requireContext2.getString(i, str4));
        c193328hC2.A0H(null, 2131968948);
        c193328hC2.A0I(new DialogInterfaceOnClickListenerC41792If8(anonymousClass389), 2131962413);
        A02 = c193328hC2.A02();
        C0fJ.A00(A02);
    }

    public static final void A01(IFP ifp, AnonymousClass389 anonymousClass389) {
        String str;
        C193328hC c193328hC = new C193328hC(anonymousClass389.A00.requireContext());
        String str2 = ifp.A01;
        if (str2 != null) {
            c193328hC.A05 = str2;
            String str3 = ifp.A00;
            if (str3 != null) {
                c193328hC.A0r(str3);
                c193328hC.A0H(null, 2131968948);
                C0fJ.A00(c193328hC.A02());
                return;
            }
            str = "errorDescription";
        } else {
            str = "errorTitle";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A02(AnonymousClass389 anonymousClass389) {
        C41451vu c41451vu = C41451vu.A01;
        Resources resources = anonymousClass389.A00.requireContext().getResources();
        C14360o3.A07(resources);
        c41451vu.E4s(new C3KD(AbstractC31372Dqc.A02(resources, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r1 != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.1XJ] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.1XJ] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.C38321qM r23, X.InterfaceC31040Dke r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass389.A03(X.1qM, X.Dke, java.lang.String):void");
    }

    public AnonymousClass389(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = fragment;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A01 = AbstractC018607g.A00(fragment);
        this.A04 = new C38A(interfaceC11380iw, userSession, null, null, null);
    }
}
