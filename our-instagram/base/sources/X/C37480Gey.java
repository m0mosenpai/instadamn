package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Gey, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37480Gey implements C31A {
    public final int A00;
    public final Object A01;

    public C37480Gey(UserSession userSession, int i) {
        this.A00 = i;
        this.A01 = userSession;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ int ATx(Object obj) {
        if (2 - this.A00 != 0) {
            return -1;
        }
        C1PZ c1pz = (C1PZ) obj;
        C14360o3.A0B(c1pz, 0);
        return c1pz.A01;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ String ATy(Object obj) {
        switch (this.A00) {
            case 0:
                C206259Bi c206259Bi = (C206259Bi) obj;
                C14360o3.A0B(c206259Bi, 0);
                C38321qM A00 = ((C130455uq) c206259Bi.A02).A00();
                if (A00 != null) {
                    return AbstractC41071vF.A07((UserSession) this.A01, A00);
                }
                return "";
            case 1:
                C206239Bg c206239Bg = (C206239Bg) obj;
                C14360o3.A0B(c206239Bg, 0);
                return ((C120985dq) c206239Bg.A03).getId();
            default:
                C40971v4 c40971v4 = (C40971v4) obj;
                C14360o3.A0B(c40971v4, 0);
                return c40971v4.A0S;
        }
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ Collection AU1(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
                List emptyList = Collections.emptyList();
                C14360o3.A07(emptyList);
                return emptyList;
            default:
                return AbstractC166987dD.A1E();
        }
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ String AU4(Object obj) {
        List list;
        if (this.A00 != 0) {
            return null;
        }
        C38321qM A0D = AbstractC37303Gc4.A0D(obj);
        if (A0D != null) {
            list = A0D.A0e;
        } else {
            list = null;
        }
        return AbstractC77343dK.A00(list);
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ int AU9(Object obj) {
        if (2 - this.A00 != 0) {
            return -1;
        }
        C40861ut A00 = C37469Gen.A00(obj);
        if (A00 != null) {
            return A00.A03();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ Boolean AUD(Object obj) {
        C38321qM A0D;
        if (this.A00 == 0 && (A0D = AbstractC37303Gc4.A0D(obj)) != null) {
            return Boolean.valueOf(AbstractC41071vF.A0R((UserSession) this.A01, A0D));
        }
        return null;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ String AUH(Object obj) {
        C38661Gz2 A02;
        String str;
        String id;
        switch (this.A00) {
            case 0:
                C206259Bi c206259Bi = (C206259Bi) obj;
                C14360o3.A0B(c206259Bi, 0);
                C38321qM A00 = ((C130455uq) c206259Bi.A02).A00();
                if (A00 != null) {
                    return A00.getId();
                }
                return null;
            case 1:
                C206239Bg c206239Bg = (C206239Bg) obj;
                C14360o3.A0B(c206239Bg, 0);
                C120985dq c120985dq = (C120985dq) c206239Bg.A03;
                C38321qM A05 = c120985dq.A05();
                if (A05 == null || (id = A05.getId()) == null) {
                    if (!c120985dq.A0H() || (A02 = c120985dq.A02()) == null || (str = A02.A09) == null) {
                        return "No media Id found";
                    }
                    return str;
                }
                return id;
            case 2:
                C40971v4 c40971v4 = (C40971v4) obj;
                C14360o3.A0B(c40971v4, 0);
                String id2 = c40971v4.A0K.getId();
                if (id2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return id2;
            default:
                C40971v4 c40971v42 = (C40971v4) obj;
                C14360o3.A0B(c40971v42, 0);
                String id3 = c40971v42.A0K.getId();
                if (id3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return id3;
        }
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ int AUK(Object obj) {
        C40861ut c40861ut;
        switch (this.A00) {
            case 0:
                return -1;
            case 1:
                C206239Bg c206239Bg = (C206239Bg) obj;
                C14360o3.A0B(c206239Bg, 0);
                c40861ut = (C40861ut) c206239Bg.A04;
                if (c40861ut == null) {
                    return -1;
                }
                break;
            case 2:
                C40861ut A00 = C37469Gen.A00(obj);
                if (A00 != null) {
                    return A00.A07();
                }
                throw AbstractC166997dE.A0g();
            default:
                c40861ut = C37469Gen.A00(obj);
                if (c40861ut == null) {
                    throw AbstractC166997dE.A0g();
                }
                break;
        }
        return c40861ut.A05();
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ String AUP(Object obj) {
        if (1 - this.A00 != 0) {
            return null;
        }
        return AbstractC37302Gc3.A0G(obj).getId();
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ String AUQ(Object obj) {
        String str;
        if (1 - this.A00 != 0) {
            return null;
        }
        C38661Gz2 A02 = AbstractC37302Gc3.A0G(obj).A02();
        if (A02 != null && (str = A02.A0B) != null) {
            return str;
        }
        return "";
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ Collection AUR(Object obj) {
        if (this.A00 != 0) {
            C1PZ c1pz = (C1PZ) obj;
            C14360o3.A0B(c1pz, 0);
            return c1pz.A0I;
        }
        List emptyList = Collections.emptyList();
        C14360o3.A07(emptyList);
        return emptyList;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ String AUe(Object obj) {
        String str;
        String CAR;
        switch (this.A00) {
            case 0:
                C38321qM A0D = AbstractC37303Gc4.A0D(obj);
                if (A0D != null) {
                    return AbstractC41071vF.A0F((UserSession) this.A01, A0D);
                }
                return "";
            case 1:
                C120985dq A0G = AbstractC37302Gc3.A0G(obj);
                if (A0G.A0H()) {
                    C38321qM c38321qM = A0G.A02;
                    if (c38321qM != null && (CAR = c38321qM.CAR()) != null) {
                        return CAR;
                    }
                    C38661Gz2 A02 = A0G.A02();
                    if (A02 != null) {
                        return A02.A0E;
                    }
                    return "No tracking token found";
                }
                if (A0G.A01 == EnumC129395t1.A05) {
                    IKS A04 = A0G.A04();
                    if (A04 != null) {
                        str = A04.A08;
                    } else {
                        str = null;
                    }
                    return String.valueOf(str);
                }
                return A0G.A06().A0j;
            default:
                return AbstractC37301Gc2.A0J(obj).A0j;
        }
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ int AUL(Object obj) {
        return -1;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ int AUM(Object obj) {
        return -1;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ int AUN(Object obj) {
        return -1;
    }

    @Override // X.C31A
    public final /* bridge */ /* synthetic */ int AUO(Object obj) {
        return -1;
    }

    @Override // X.C31A
    public final /* synthetic */ String AUV(Object obj) {
        return null;
    }
}
