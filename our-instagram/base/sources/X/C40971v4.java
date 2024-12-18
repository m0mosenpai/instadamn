package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1v4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40971v4 implements InterfaceC38371qR, InterfaceC38381qS, C1NI {
    public final ImmutableList A00;
    public final AdFormatType A01;
    public final InterfaceC104774nh A02;
    public final InterfaceC39271s5 A03;
    public final InterfaceC104814nm A04;
    public final InterfaceC87893vx A05;
    public final InterfaceC104804nl A06;
    public final DynamicProductAdDisplayOption A07;
    public final C114595Ff A08;
    public final IGCTMessagingAdsInfoDictIntf A09;
    public final InterfaceC39281s8 A0A;
    public final InterfaceC104914o3 A0B;
    public final IntentAwareAdsInfoIntf A0C;
    public final C4o4 A0D;
    public final InterfaceC104934o6 A0E;
    public final C5G3 A0F;
    public final C47W A0G;
    public final C46j A0H;
    public final InterfaceC104924o5 A0I;
    public final C38321qM A0J;
    public final C38321qM A0K;
    public final EnumC41021v9 A0L;
    public final EnumC40111tc A0M;
    public final C4o9 A0N;
    public final InterfaceC104954oA A0O;
    public final Integer A0P;
    public final Integer A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final String A0f;
    public final String A0g;
    public final String A0h;
    public final String A0i;
    public final String A0j;
    public final List A0k;
    public final List A0l;
    public final List A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;
    public final boolean A14;
    public final boolean A15;
    public final InterfaceC87573vP A16;
    public final InterfaceC104824nn A17;
    public final InterfaceC39571se A18;
    public final IgShowreelNativeAnimationIntf A19;
    public final InterfaceC38221qC A1A;
    public final List A1B;
    public final List A1C;

    public C40971v4(AbstractC40901ux abstractC40901ux) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String str;
        boolean z7;
        String str2;
        String str3;
        boolean z8;
        boolean z9;
        EnumC41021v9 enumC41021v9;
        C4o4 c4o4;
        InterfaceC108024tl B6f;
        Integer Bjg;
        String Asj;
        InterfaceC104944o7 BeI;
        String str4 = abstractC40901ux.A0g;
        if (str4 != null) {
            this.A0i = str4;
            String str5 = abstractC40901ux.A0Z;
            if (str5 != null) {
                this.A0S = str5;
                ImmutableList immutableList = abstractC40901ux.A00;
                if (immutableList != null) {
                    this.A00 = immutableList;
                    C38321qM c38321qM = abstractC40901ux.A0L;
                    if (c38321qM != null) {
                        this.A0J = c38321qM;
                        String str6 = abstractC40901ux.A0l;
                        if (str6 != null) {
                            this.A0j = str6;
                            this.A15 = c38321qM.A6S();
                            InterfaceC39541sb injected = c38321qM.A0C.getInjected();
                            if (injected != null) {
                                z = C14360o3.A0K(injected.AyV(), true);
                            } else {
                                z = false;
                            }
                            this.A0p = z;
                            this.A0m = abstractC40901ux.A0q;
                            InterfaceC39541sb injected2 = c38321qM.A0C.getInjected();
                            if (injected2 != null) {
                                z2 = C14360o3.A0K(injected2.CSW(), true);
                            } else {
                                z2 = false;
                            }
                            this.A12 = z2;
                            InterfaceC39541sb injected3 = c38321qM.A0C.getInjected();
                            if (injected3 != null) {
                                z3 = C14360o3.A0K(injected3.CVu(), true);
                            } else {
                                z3 = false;
                            }
                            this.A13 = z3;
                            InterfaceC39541sb injected4 = c38321qM.A0C.getInjected();
                            if (injected4 != null) {
                                z4 = C14360o3.A0K(injected4.Ayi(), true);
                            } else {
                                z4 = false;
                            }
                            this.A14 = z4;
                            InterfaceC39541sb injected5 = c38321qM.A0C.getInjected();
                            if (injected5 != null) {
                                C14360o3.A0K(injected5.Bvw(), true);
                            }
                            this.A0U = abstractC40901ux.A0b;
                            InterfaceC39541sb injected6 = c38321qM.A0C.getInjected();
                            if (injected6 != null) {
                                z5 = C14360o3.A0K(injected6.Axd(), true);
                            } else {
                                z5 = false;
                            }
                            this.A0o = z5;
                            InterfaceC39541sb injected7 = c38321qM.A0C.getInjected();
                            if (injected7 != null) {
                                z6 = C14360o3.A0K(injected7.Caw(), true);
                            } else {
                                z6 = false;
                            }
                            this.A0z = z6;
                            InterfaceC39541sb injected8 = c38321qM.A0C.getInjected();
                            if (injected8 != null && (BeI = injected8.BeI()) != null) {
                                str = BeI.AjQ();
                            } else {
                                str = null;
                            }
                            this.A0h = str;
                            this.A0Z = c38321qM.A2j();
                            this.A0Y = c38321qM.A2i();
                            this.A0a = c38321qM.A2k();
                            this.A1B = abstractC40901ux.A0m;
                            this.A0d = abstractC40901ux.A0h;
                            this.A06 = abstractC40901ux.A08;
                            this.A0k = abstractC40901ux.A0o;
                            this.A0b = abstractC40901ux.A0e;
                            this.A0T = abstractC40901ux.A0a;
                            this.A0I = abstractC40901ux.A0K;
                            this.A0W = abstractC40901ux.A0d;
                            this.A0g = abstractC40901ux.A0k;
                            this.A1A = abstractC40901ux.A0O;
                            this.A19 = abstractC40901ux.A0N;
                            this.A0P = abstractC40901ux.A0W;
                            this.A18 = abstractC40901ux.A0I;
                            this.A11 = C14360o3.A0K(abstractC40901ux.A0U, true);
                            this.A0n = c38321qM.A6R();
                            this.A0X = c38321qM.A0C.AyB();
                            this.A04 = abstractC40901ux.A04;
                            this.A02 = abstractC40901ux.A02;
                            C14360o3.A0K(abstractC40901ux.A0V, true);
                            C14360o3.A0K(abstractC40901ux.A0R, true);
                            InterfaceC39541sb injected9 = c38321qM.A0C.getInjected();
                            if (injected9 != null) {
                                z7 = C14360o3.A0K(injected9.CQK(), true);
                            } else {
                                z7 = false;
                            }
                            this.A0r = z7;
                            this.A0H = abstractC40901ux.A0J;
                            this.A16 = abstractC40901ux.A06;
                            this.A09 = abstractC40901ux.A0B;
                            this.A17 = abstractC40901ux.A07;
                            this.A0A = abstractC40901ux.A0C;
                            this.A0G = abstractC40901ux.A0H;
                            this.A0Q = abstractC40901ux.A0X;
                            InterfaceC39541sb injected10 = c38321qM.A0C.getInjected();
                            if (injected10 != null) {
                                C14360o3.A0K(injected10.Bvg(), true);
                            }
                            InterfaceC39541sb injected11 = c38321qM.A0C.getInjected();
                            if (injected11 != null) {
                                str2 = injected11.Asj();
                            } else {
                                str2 = null;
                            }
                            C14360o3.A0K(str2, "IG_BOOST");
                            InterfaceC39541sb injected12 = c38321qM.A0C.getInjected();
                            this.A0R = (injected12 == null || (Asj = injected12.Asj()) == null) ? "UNKNOWN" : Asj;
                            InterfaceC39541sb injected13 = c38321qM.A0C.getInjected();
                            if (injected13 != null) {
                                C14360o3.A0K(injected13.BMp(), true);
                            }
                            InterfaceC39541sb injected14 = c38321qM.A0C.getInjected();
                            if (injected14 != null) {
                                str3 = injected14.Bck();
                            } else {
                                str3 = null;
                            }
                            this.A0V = str3;
                            InterfaceC39541sb injected15 = c38321qM.A0C.getInjected();
                            if (injected15 != null) {
                                z8 = C14360o3.A0K(injected15.CYx(), true);
                            } else {
                                z8 = false;
                            }
                            this.A0w = z8;
                            this.A0C = abstractC40901ux.A0E;
                            this.A0e = abstractC40901ux.A0i;
                            InterfaceC39541sb injected16 = c38321qM.A0C.getInjected();
                            if (injected16 != null) {
                                injected16.Caf();
                            }
                            InterfaceC39541sb injected17 = c38321qM.A0C.getInjected();
                            if (injected17 != null) {
                                z9 = C14360o3.A0K(injected17.CRg(), true);
                            } else {
                                z9 = false;
                            }
                            this.A0s = z9;
                            this.A0N = abstractC40901ux.A0P;
                            this.A0O = abstractC40901ux.A0Q;
                            this.A0x = abstractC40901ux.A0r;
                            this.A0f = abstractC40901ux.A0j;
                            this.A0t = C14360o3.A0K(abstractC40901ux.A0T, true);
                            this.A0l = abstractC40901ux.A0p;
                            this.A07 = abstractC40901ux.A09;
                            this.A0q = C14360o3.A0K(abstractC40901ux.A0S, true);
                            InterfaceC104914o3 interfaceC104914o3 = abstractC40901ux.A0D;
                            this.A0B = interfaceC104914o3;
                            if (interfaceC104914o3 != null && (B6f = interfaceC104914o3.B6f()) != null && (Bjg = B6f.Bjg()) != null) {
                                enumC41021v9 = (EnumC41021v9) EnumC41021v9.A01.get(Bjg);
                                if (enumC41021v9 == null) {
                                    enumC41021v9 = EnumC41021v9.A08;
                                }
                            } else {
                                enumC41021v9 = null;
                            }
                            this.A0L = enumC41021v9;
                            this.A0v = enumC41021v9 == EnumC41021v9.A05;
                            this.A0c = abstractC40901ux.A0f;
                            this.A10 = abstractC40901ux.A0t;
                            this.A0M = abstractC40901ux.A0M;
                            this.A01 = abstractC40901ux.A01;
                            this.A1C = abstractC40901ux.A0n;
                            this.A05 = abstractC40901ux.A05;
                            this.A0F = abstractC40901ux.A0G;
                            this.A0y = abstractC40901ux.A0s;
                            this.A03 = abstractC40901ux.A03;
                            this.A0E = abstractC40901ux.A0F;
                            this.A08 = abstractC40901ux.A0A;
                            InterfaceC39541sb injected18 = c38321qM.A0C.getInjected();
                            if (injected18 != null) {
                                c4o4 = injected18.BSs();
                            } else {
                                c4o4 = null;
                            }
                            this.A0D = c4o4;
                            this.A0K = c38321qM;
                            this.A0u = true;
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (this.A0K == null) {
            return null;
        }
        User A2E = this.A0J.A2E(userSession);
        if (A2E != null) {
            if (A2E.A2N()) {
                String str = this.A0U;
                if (str != null && str.length() != 0) {
                    return str;
                }
                return A2E.B8y();
            }
            return A2E.getUsername();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return false;
    }

    @Override // X.InterfaceC38371qR, X.C1NI
    public final boolean CdW() {
        return true;
    }

    public final ImmutableList A01() {
        List list = this.A1C;
        if (EnumC40111tc.A09 == this.A0M && list != null) {
            return ImmutableList.copyOf((Collection) list);
        }
        return null;
    }

    public final ImmutableList A02(String str) {
        List<InterfaceC43533JKt> list = this.A0l;
        if (list != null) {
            for (InterfaceC43533JKt interfaceC43533JKt : list) {
                if (interfaceC43533JKt.B01() != null && str.equals(String.valueOf(interfaceC43533JKt.B01())) && interfaceC43533JKt.Abm() != null) {
                    return ImmutableList.copyOf((Collection) interfaceC43533JKt.Abm());
                }
            }
            return null;
        }
        return null;
    }

    public final List A04() {
        List list = this.A1C;
        if (A05() && list != null && !list.isEmpty()) {
            return ((C38321qM) list.get(0)).A3Y();
        }
        return this.A1B;
    }

    public final boolean A05() {
        if (EnumC40111tc.A09 != this.A0M) {
            return false;
        }
        return true;
    }

    public final boolean A07() {
        InterfaceC104804nl interfaceC104804nl = this.A06;
        if (interfaceC104804nl != null && interfaceC104804nl.Bx5() != null) {
            return true;
        }
        return false;
    }

    public final boolean A08() {
        InterfaceC104804nl interfaceC104804nl = this.A06;
        if (interfaceC104804nl != null && interfaceC104804nl.Bx7() != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return C1XV.A04;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return this.A0P;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return this.A18;
    }

    @Override // X.InterfaceC38371qR
    public final C38321qM BQN() {
        return this.A0K;
    }

    @Override // X.InterfaceC38371qR, X.C1NI
    public final String BzL(UserSession userSession) {
        return this.A0j;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        return this.A0j;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A0C;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return this.A0Q;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return this.A0u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14360o3.A0K(getClass(), obj.getClass())) {
            return C14360o3.A0K(this.A0S, ((C40971v4) obj).A0S);
        }
        return false;
    }

    @Override // X.InterfaceC38371qR, X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return this.A0S;
    }

    public final int hashCode() {
        return this.A0S.hashCode();
    }

    public final boolean A06() {
        if (!A08() && !A07()) {
            return false;
        }
        return true;
    }
}
