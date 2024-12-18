package X;

import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.user.model.ProductCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3bq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76463bq {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r0 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A03(X.C38321qM r5) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            com.instagram.user.model.ProductCollection r0 = A00(r5)
            if (r0 != 0) goto L5d
            X.1rF r0 = r5.A0C
            X.JMT r0 = r0.Bgt()
            r3 = 0
            if (r0 == 0) goto L20
            com.instagram.user.model.ProductCollection r0 = r0.Ap9()
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.Ap3()
            if (r0 == 0) goto L20
            return r0
        L20:
            java.util.List r0 = A01(r5)
            if (r0 == 0) goto L64
            java.util.Iterator r2 = r0.iterator()
        L2a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1qM r0 = (X.C38321qM) r0
            X.1rF r0 = r0.A0C
            X.JMT r0 = r0.Bgt()
            if (r0 == 0) goto L2a
            com.instagram.user.model.ProductCollection r0 = r0.Ap9()
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.Ap3()
            if (r0 == 0) goto L2a
        L4b:
            X.1qM r1 = (X.C38321qM) r1
            if (r1 == 0) goto L64
            X.1rF r0 = r1.A0C
            X.JMT r0 = r0.Bgt()
            if (r0 == 0) goto L64
            com.instagram.user.model.ProductCollection r0 = r0.Ap9()
            if (r0 == 0) goto L64
        L5d:
            java.lang.String r3 = r0.Ap3()
            return r3
        L62:
            r1 = r3
            goto L4b
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76463bq.A03(X.1qM):java.lang.String");
    }

    public final String A05(C38321qM c38321qM) {
        Object obj;
        JMT Bgt;
        JL0 AyK;
        JL0 AyK2;
        JL0 AyK3;
        String AyH;
        C14360o3.A0B(c38321qM, 0);
        JMT Bgt2 = c38321qM.A0C.Bgt();
        if (Bgt2 != null && (AyK3 = Bgt2.AyK()) != null && (AyH = AyK3.AyH()) != null) {
            return AyH;
        }
        List A01 = A01(c38321qM);
        if (A01 != null) {
            Iterator it = A01.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    JMT Bgt3 = ((C38321qM) obj).A0C.Bgt();
                    if (Bgt3 != null && (AyK2 = Bgt3.AyK()) != null && AyK2.AyH() != null) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C38321qM c38321qM2 = (C38321qM) obj;
            if (c38321qM2 != null && (Bgt = c38321qM2.A0C.Bgt()) != null && (AyK = Bgt.AyK()) != null) {
                return AyK.AyH();
            }
        }
        return null;
    }

    public final String A06(C38321qM c38321qM) {
        Object obj;
        JMT Bgt;
        String BE3;
        C14360o3.A0B(c38321qM, 0);
        JMT Bgt2 = c38321qM.A0C.Bgt();
        if (Bgt2 != null && (BE3 = Bgt2.BE3()) != null) {
            return BE3;
        }
        List A01 = A01(c38321qM);
        if (A01 != null) {
            Iterator it = A01.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    JMT Bgt3 = ((C38321qM) obj).A0C.Bgt();
                    if (Bgt3 != null && Bgt3.BE3() != null) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C38321qM c38321qM2 = (C38321qM) obj;
            if (c38321qM2 != null && (Bgt = c38321qM2.A0C.Bgt()) != null) {
                return Bgt.BE3();
            }
        }
        return null;
    }

    public final boolean A08(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        JMT Bgt = c38321qM.A0C.Bgt();
        ProductCollection productCollection = null;
        if (Bgt != null) {
            productCollection = Bgt.Ap9();
        }
        if (productCollection != null) {
            return true;
        }
        List A01 = A01(c38321qM);
        if (A01 != null && (!(A01 instanceof Collection) || !A01.isEmpty())) {
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                JMT Bgt2 = ((C38321qM) it.next()).A0C.Bgt();
                if (Bgt2 != null && Bgt2.Ap9() != null) {
                    return true;
                }
            }
        }
        if (A00(c38321qM) != null) {
            return true;
        }
        return false;
    }

    public final boolean A09(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        if (c38321qM.A0C.Bgt() != null) {
            return true;
        }
        List A01 = A01(c38321qM);
        if (A01 != null && (!(A01 instanceof Collection) || !A01.isEmpty())) {
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                if (((C38321qM) it.next()).A0C.Bgt() != null) {
                    return true;
                }
            }
        }
        if (A00(c38321qM) != null) {
            return true;
        }
        return false;
    }

    public final String A04(C38321qM c38321qM) {
        Object obj;
        JMT Bgt;
        JL0 AyK;
        JL0 AyK2;
        JL0 AyK3;
        String title;
        JMT Bgt2 = c38321qM.A0C.Bgt();
        if (Bgt2 != null && (AyK3 = Bgt2.AyK()) != null && (title = AyK3.getTitle()) != null) {
            return title;
        }
        List A01 = A01(c38321qM);
        if (A01 != null) {
            Iterator it = A01.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    JMT Bgt3 = ((C38321qM) obj).A0C.Bgt();
                    if (Bgt3 != null && (AyK2 = Bgt3.AyK()) != null && AyK2.getTitle() != null) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C38321qM c38321qM2 = (C38321qM) obj;
            if (c38321qM2 != null && (Bgt = c38321qM2.A0C.Bgt()) != null && (AyK = Bgt.AyK()) != null) {
                return AyK.getTitle();
            }
        }
        return null;
    }

    public final boolean A0A(C38321qM c38321qM) {
        JMT Bgt = c38321qM.A0C.Bgt();
        JL0 jl0 = null;
        if (Bgt != null) {
            jl0 = Bgt.AyK();
        }
        if (jl0 != null) {
            return true;
        }
        List A01 = A01(c38321qM);
        if (A01 != null && (!(A01 instanceof Collection) || !A01.isEmpty())) {
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                JMT Bgt2 = ((C38321qM) it.next()).A0C.Bgt();
                if (Bgt2 != null && Bgt2.AyK() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final ProductCollection A00(C38321qM c38321qM) {
        C3x9 clipsMetadata;
        ClipsShoppingInfoIntf Buh;
        if (!c38321qM.A5P() || (clipsMetadata = c38321qM.A0C.getClipsMetadata()) == null || (Buh = clipsMetadata.Buh()) == null) {
            return null;
        }
        return Buh.Ap9();
    }

    public static final List A01(C38321qM c38321qM) {
        if (c38321qM.A5M()) {
            return c38321qM.A0C.AmB();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r0 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5GU A02(X.C38321qM r6) {
        /*
            r5 = this;
            com.instagram.user.model.ProductCollection r0 = A00(r6)
            r4 = 0
            if (r0 == 0) goto L14
            com.instagram.api.schemas.ProductCollectionV2Type r0 = r0.ApF()
            if (r0 == 0) goto Lf
            java.lang.String r4 = r0.A00
        Lf:
            X.5GU r0 = X.AbstractC40733I3n.A00(r4)
            return r0
        L14:
            X.1rF r0 = r6.A0C
            X.JMT r0 = r0.Bgt()
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.ApG()
            if (r0 == 0) goto L27
        L22:
            X.5GU r0 = X.AbstractC40733I3n.A00(r0)
            return r0
        L27:
            java.util.List r0 = A01(r6)
            if (r0 == 0) goto L5b
            java.util.Iterator r3 = r0.iterator()
        L31:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.1qM r1 = (X.C38321qM) r1
            X.3bq r0 = X.AbstractC76453bp.A00
            boolean r0 = r0.A09(r1)
            if (r0 == 0) goto L31
        L46:
            X.1qM r2 = (X.C38321qM) r2
            if (r2 == 0) goto L5b
            X.1rF r0 = r2.A0C
            X.JMT r0 = r0.Bgt()
            if (r0 == 0) goto L5b
            java.lang.String r0 = r0.ApG()
            if (r0 == 0) goto L5b
            goto L22
        L59:
            r2 = r4
            goto L46
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76463bq.A02(X.1qM):X.5GU");
    }

    public final String A07(C38321qM c38321qM) {
        Object obj;
        List BSa;
        String str;
        ProductCollection A00 = A00(c38321qM);
        if (A00 != null) {
            return A00.BSZ();
        }
        List BSa2 = c38321qM.BSa();
        if (BSa2 != null && (str = (String) AbstractC001800i.A0J(BSa2)) != null) {
            return str;
        }
        List A01 = A01(c38321qM);
        if (A01 == null) {
            return null;
        }
        Iterator it = A01.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                List BSa3 = ((C38321qM) obj).BSa();
                if (BSa3 != null && !BSa3.isEmpty()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C38321qM c38321qM2 = (C38321qM) obj;
        if (c38321qM2 == null || (BSa = c38321qM2.BSa()) == null) {
            return null;
        }
        return (String) AbstractC001800i.A0J(BSa);
    }
}
