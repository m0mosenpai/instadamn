package com.instagram.mediakit.repository;

import X.AbstractC07080Za;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.C008002u;
import X.C05A;
import X.C09530e4;
import X.C0UO;
import X.C0eB;
import X.C10E;
import X.C14360o3;
import X.C16930sl;
import X.C1JX;
import X.C24721Ip;
import X.C51847Mvp;
import X.C51850Mvs;
import X.C51851Mvt;
import X.C54780OIu;
import X.C57745PjY;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.InterfaceC24731Iq;
import X.OLz;
import X.PVX;
import com.instagram.common.session.UserSession;
import com.instagram.mediakit.api.MediaKitApi;
import com.instagram.mediakit.repository.upload.MediaKitUploadApi;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class MediaKitRepository {
    public boolean A00;
    public final MediaKitApi A01;
    public final OLz A02;
    public final MediaKitUploadApi A03;
    public final InterfaceC24731Iq A04;
    public final InterfaceC19390xP A05;
    public final InterfaceC19390xP A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A A0A;
    public final C0UO A0B;
    public final C0UO A0C;
    public final C0UO A0D;
    public final UserSession A0E;
    public final C54780OIu A0F;
    public final InterfaceC24731Iq A0G;

    public static final void A03(C51847Mvp c51847Mvp, MediaKitRepository mediaKitRepository) {
        String str;
        C51851Mvt c51851Mvt;
        String str2;
        C51851Mvt c51851Mvt2;
        User user;
        C51851Mvt c51851Mvt3;
        mediaKitRepository.A00 = false;
        C54780OIu c54780OIu = mediaKitRepository.A0F;
        String str3 = null;
        if (c51847Mvp != null && (c51851Mvt3 = c51847Mvp.A00) != null) {
            str = c51851Mvt3.A03;
        } else {
            str = null;
        }
        c54780OIu.A01 = str;
        OLz oLz = mediaKitRepository.A02;
        oLz.A00 = c51847Mvp;
        oLz.A01 = null;
        oLz.A02 = C16930sl.A00;
        ArrayList arrayList = oLz.A04;
        arrayList.clear();
        if (c51847Mvp != null) {
            C51851Mvt c51851Mvt4 = c51847Mvp.A00;
            oLz.A01 = c51851Mvt4;
            oLz.A00(c51851Mvt4);
            oLz.A05.put(String.valueOf(c51851Mvt4.A03), c51851Mvt4);
            arrayList.addAll(c51847Mvp.A02);
        }
        mediaKitRepository.A09.Egh(c51847Mvp);
        mediaKitRepository.A0A.Egh(c51847Mvp);
        C05A c05a = mediaKitRepository.A08;
        if (c51847Mvp != null) {
            c51851Mvt = c51847Mvp.A00;
        } else {
            c51851Mvt = null;
        }
        c05a.Egh(oLz.A00(c51851Mvt));
        C05A c05a2 = mediaKitRepository.A07;
        if (((C09530e4) c05a2.getValue()).A01 == null) {
            String str4 = mediaKitRepository.A0E.userId;
            C51851Mvt A00 = A00(mediaKitRepository);
            if (A00 != null && (user = A00.A01) != null) {
                str2 = user.getId();
            } else {
                str2 = null;
            }
            if (C14360o3.A0K(str4, str2)) {
                if (c51847Mvp != null && (c51851Mvt2 = c51847Mvp.A00) != null) {
                    str3 = c51851Mvt2.A03;
                }
                c05a2.Egh(AbstractC166987dD.A1L(false, str3));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(android.content.Context r10, X.InterfaceC23621Ds r11) {
        /*
            r9 = this;
            r3 = 4
            boolean r0 = X.C57145PWx.A02(r11, r3)
            if (r0 == 0) goto Lab
            r6 = r11
            X.PWx r6 = (X.C57145PWx) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lab
            int r2 = r2 - r1
            r6.A00 = r2
        L15:
            java.lang.Object r1 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r7 = 2
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 == r4) goto L29
            if (r0 != r7) goto Lb1
            X.AbstractC09560e7.A00(r1)
        L26:
            X.0eB r5 = X.C0eB.A00
            return r5
        L29:
            java.lang.Object r8 = r6.A01
            com.instagram.mediakit.repository.MediaKitRepository r8 = (com.instagram.mediakit.repository.MediaKitRepository) r8
            X.AbstractC09560e7.A00(r1)
            goto L6d
        L31:
            X.AbstractC09560e7.A00(r1)
            X.OLz r0 = r9.A02
            java.util.List r0 = r0.A02
            java.util.Iterator r3 = r0.iterator()
        L3c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Mxj r0 = (X.C51961Mxj) r0
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L3c
            if (r2 == 0) goto L6c
            X.1tg r1 = X.C40121td.A0G
            com.instagram.common.session.UserSession r0 = r9.A0E
            X.1td r3 = r1.A01(r10, r0)
            r6.A01 = r9
            r6.A00 = r4
            r2 = 0
            r1 = 26
            X.PZP r0 = new X.PZP
            r0.<init>(r9, r3, r2, r1)
            java.lang.Object r0 = X.AnonymousClass194.A00(r6, r0)
            if (r0 != r5) goto L6c
            return r5
        L6c:
            r8 = r9
        L6d:
            r4 = 0
            r6.A01 = r4
            r6.A00 = r7
            X.OLz r3 = r8.A02
            java.util.List r0 = r3.A02
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r1 = r0.iterator()
        L7e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r1.next()
            X.Mxj r0 = (X.C51961Mxj) r0
            X.1qM r0 = r0.A02
            if (r0 == 0) goto L7e
            r2.add(r0)
            goto L7e
        L92:
            r3.A01(r4, r4, r4, r2)
            boolean r0 = r8.A00
            if (r0 == 0) goto L9c
            A04(r8)
        L9c:
            X.05A r0 = r8.A09
            java.lang.Object r0 = r0.getValue()
            X.Mvp r0 = (X.C51847Mvp) r0
            java.lang.Object r0 = A01(r0, r8, r6)
            if (r0 != r5) goto L26
            return r5
        Lab:
            X.PWx r6 = X.C57145PWx.A00(r9, r11, r3)
            goto L15
        Lb1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.MediaKitRepository.A06(android.content.Context, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r1 == r3) goto L22;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(com.instagram.api.schemas.MediaKitVisibility r8, X.InterfaceC23621Ds r9) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.MediaKitRepository.A07(com.instagram.api.schemas.MediaKitVisibility, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A08(X.C51850Mvs r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 2
            boolean r0 = X.PXA.A03(r8, r3)
            if (r0 == 0) goto L60
            r5 = r8
            X.PXA r5 = (X.PXA) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L3a
            if (r0 != r3) goto L65
            java.lang.Object r7 = r5.A02
            java.lang.Object r2 = r5.A01
            com.instagram.mediakit.repository.MediaKitRepository r2 = (com.instagram.mediakit.repository.MediaKitRepository) r2
            X.AbstractC09560e7.A00(r1)
        L29:
            X.OLz r1 = r2.A02
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            java.util.ArrayList r0 = r1.A04
            r0.add(r7)
            A04(r2)
            X.0eB r0 = X.C0eB.A00
            return r0
        L3a:
            X.AbstractC09560e7.A00(r1)
            X.OTU r2 = X.OTU.A02
            com.instagram.mediakit.model.MediaKitSectionType r1 = r7.A01
            com.instagram.mediakit.model.MediaKitSectionType r0 = com.instagram.mediakit.model.MediaKitSectionType.A07
            boolean r0 = X.AbstractC167007dF.A1X(r1, r0)
            r2.A01 = r0
            X.P4t r1 = new X.P4t
            r1.<init>(r2)
            X.PXA.A01(r6, r7, r5, r3)
            X.1Iq r0 = r6.A04
            java.lang.Object r0 = r0.EMz(r1, r5)
            java.lang.Object r0 = X.MSX.A0b(r0)
            if (r0 != r4) goto L5e
            return r4
        L5e:
            r2 = r6
            goto L29
        L60:
            X.PXA r5 = X.PXA.A00(r6, r8, r3)
            goto L15
        L65:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.MediaKitRepository.A08(X.Mvs, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 2
            boolean r0 = X.C57145PWx.A02(r7, r3)
            if (r0 == 0) goto L4a
            r5 = r7
            X.PWx r5 = (X.C57145PWx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r4 = r5.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L38
            if (r0 != r2) goto L4f
            java.lang.Object r1 = r5.A01
            X.OLz r1 = (X.OLz) r1
            X.AbstractC09560e7.A00(r4)
        L27:
            java.util.Collection r4 = (java.util.Collection) r4
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            java.util.ArrayList r0 = r1.A03
            r0.clear()
            r0.addAll(r4)
            X.0eB r0 = X.C0eB.A00
            return r0
        L38:
            X.AbstractC09560e7.A00(r4)
            X.OLz r1 = r6.A02
            com.instagram.mediakit.api.MediaKitApi r0 = r6.A01
            r5.A01 = r1
            r5.A00 = r2
            java.lang.Object r4 = r0.A08(r5)
            if (r4 != r3) goto L27
            return r3
        L4a:
            X.PWx r5 = X.C57145PWx.A00(r6, r7, r3)
            goto L15
        L4f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.MediaKitRepository.A09(X.1Ds):java.lang.Object");
    }

    public final void A0A(C51850Mvs c51850Mvs, String str, boolean z) {
        C14360o3.A0B(str, 0);
        ArrayList arrayList = this.A02.A04;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (C51850Mvs.A00(str, it)) {
                if (i > -1) {
                    arrayList.set(i, c51850Mvs);
                }
            } else {
                i++;
            }
        }
        if (z) {
            A04(this);
        } else {
            this.A00 = true;
        }
    }

    public final boolean A0B(String str) {
        List list;
        C14360o3.A0B(str, 0);
        C51847Mvp c51847Mvp = this.A02.A00;
        if (c51847Mvp == null || (list = c51847Mvp.A02) == null) {
            list = C16930sl.A00;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C51850Mvs.A00(str, it)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final C51851Mvt A00(MediaKitRepository mediaKitRepository) {
        C51847Mvp c51847Mvp = (C51847Mvp) mediaKitRepository.A0A.getValue();
        if (c51847Mvp != null) {
            return c51847Mvp.A00;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C51847Mvp r4, com.instagram.mediakit.repository.MediaKitRepository r5, X.InterfaceC23621Ds r6) {
        /*
            com.instagram.mediakit.api.MediaKitApi r3 = r5.A01
            java.util.Map r2 = X.AbstractC54052NvC.A00(r4)
            if (r4 == 0) goto L11
            X.Mvt r0 = r4.A00
            if (r0 == 0) goto L11
            java.lang.String r1 = r0.A03
            r0 = 0
            if (r1 != 0) goto L12
        L11:
            r0 = 1
        L12:
            X.MWG r3 = r3.A06(r2, r0)
            boolean r2 = X.AbstractC167007dF.A1W(r4)
            r1 = 0
            X.PVX r0 = new X.PVX
            r0.<init>(r1, r5, r2)
            java.lang.Object r1 = r3.collect(r0, r6)
            X.1JX r0 = X.C1JX.A02
            if (r1 == r0) goto L2a
            X.0eB r1 = X.C0eB.A00
        L2a:
            if (r1 == r0) goto L2e
            X.0eB r1 = X.C0eB.A00
        L2e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.MediaKitRepository.A01(X.Mvp, com.instagram.mediakit.repository.MediaKitRepository, X.1Ds):java.lang.Object");
    }

    public static final Object A02(MediaKitRepository mediaKitRepository, String str, InterfaceC23621Ds interfaceC23621Ds) {
        OLz oLz = mediaKitRepository.A02;
        C51851Mvt c51851Mvt = (C51851Mvt) oLz.A05.get(str);
        oLz.A01 = c51851Mvt;
        if (c51851Mvt != null) {
            A03(new C51847Mvp(c51851Mvt, null, C16930sl.A00), mediaKitRepository);
        }
        Object collect = mediaKitRepository.A01.A05(str).collect(new PVX(0, mediaKitRepository, false), interfaceC23621Ds);
        C1JX c1jx = C1JX.A02;
        if (collect != c1jx) {
            collect = C0eB.A00;
        }
        if (collect != c1jx) {
            return C0eB.A00;
        }
        return collect;
    }

    public static final void A04(MediaKitRepository mediaKitRepository) {
        Object invoke;
        C57745PjY A00 = C57745PjY.A00(mediaKitRepository, 13);
        C05A c05a = mediaKitRepository.A09;
        Object value = c05a.getValue();
        if (value != null && (invoke = A00.invoke(value)) != null) {
            c05a.Egh(invoke);
        }
        mediaKitRepository.A00 = false;
    }

    public final int A05(String str) {
        ArrayList arrayList = this.A02.A04;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (C51850Mvs.A00(str, it)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        int intValue = Integer.valueOf(i).intValue();
        if (intValue <= -1) {
            return arrayList.size();
        }
        return intValue;
    }

    public MediaKitRepository(UserSession userSession, C54780OIu c54780OIu, MediaKitApi mediaKitApi, MediaKitUploadApi mediaKitUploadApi) {
        this.A0E = userSession;
        this.A01 = mediaKitApi;
        this.A0F = c54780OIu;
        this.A03 = mediaKitUploadApi;
        C24721Ip c24721Ip = new C24721Ip(Integer.MAX_VALUE);
        this.A04 = c24721Ip;
        this.A05 = AbstractC07080Za.A03(c24721Ip);
        C24721Ip c24721Ip2 = new C24721Ip(Integer.MAX_VALUE);
        this.A0G = c24721Ip2;
        this.A06 = AbstractC07080Za.A03(c24721Ip2);
        C008002u A1H = AbstractC25225BEi.A1H(AbstractC166987dD.A1L(AbstractC166997dE.A0b(), null));
        this.A07 = A1H;
        this.A0B = AbstractC208910l.A02(A1H);
        this.A0A = C10E.A00(null);
        C008002u A00 = C10E.A00(null);
        this.A09 = A00;
        this.A0D = AbstractC208910l.A02(A00);
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A08 = A0o;
        this.A0C = AbstractC208910l.A02(A0o);
        this.A02 = new OLz();
    }
}
