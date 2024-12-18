package X;

import com.instagram.api.schemas.MediaKitVisibility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Pam, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57202Pam extends C06840Yb implements InterfaceC16600sD {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C57202Pam(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            r2 = r8
            if (r9 == 0) goto L12
            java.lang.Class<X.Mh7> r3 = X.C51053Mh7.class
            r1 = 4
            java.lang.String r4 = "computeAndGetSectionModels"
            java.lang.String r5 = "computeAndGetSectionModels(Lcom/instagram/mediakit/repository/MediaKitRepository$MediaKitResult;Lcom/instagram/mediakit/model/MediaKitInfo;Lcom/instagram/mediakit/enum/MediaKitMode;)Ljava/util/List;"
            r6 = r1
        Le:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L12:
            java.lang.Class<X.MgV> r3 = X.C51023MgV.class
            r1 = 4
            java.lang.String r4 = "setProduct"
            java.lang.String r5 = "setProduct(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V"
            r6 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57202Pam.<init>(java.lang.Object, int):void");
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [X.Ova, X.NPk] */
    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        List list;
        AbstractC56115Ova abstractC56115Ova;
        String str;
        MediaKitVisibility mediaKitVisibility;
        if (this.A00 != 0) {
            C51847Mvp c51847Mvp = (C51847Mvp) obj2;
            EnumC53120NeX enumC53120NeX = (EnumC53120NeX) obj3;
            C51053Mh7 c51053Mh7 = (C51053Mh7) this.receiver;
            int A06 = AbstractC167007dF.A06(0, obj, enumC53120NeX);
            if (!(obj instanceof C56461P4y) && !obj.equals(C56462P4z.A00)) {
                if (!(obj instanceof P57) && c51847Mvp != null) {
                    ODC odc = c51053Mh7.A05;
                    C56389P2a c56389P2a = c51053Mh7.A09;
                    boolean A062 = C18U.A06(C06090Tz.A05, c51053Mh7.A03, 36316267770155213L);
                    ArrayList A12 = AbstractC166997dE.A12(c56389P2a, A06);
                    if (odc.A01 && enumC53120NeX == EnumC53120NeX.A03) {
                        C51851Mvt c51851Mvt = c51847Mvp.A00;
                        if (c51851Mvt.A03 != null && (mediaKitVisibility = c51851Mvt.A00) == MediaKitVisibility.A04) {
                            A12.add(new C56085Ov2(mediaKitVisibility, c56389P2a));
                        }
                    }
                    C14360o3.A0B(enumC53120NeX, 0);
                    boolean A1X = AbstractC167007dF.A1X(enumC53120NeX, EnumC53120NeX.A02);
                    int i = 0;
                    if (A1X || ((str = c51847Mvp.A00.A02) != null && str.length() != 0)) {
                        A12.add(new C56094OvE(c56389P2a, c51847Mvp.A00.A02));
                    }
                    for (Object obj5 : c51847Mvp.A02) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        C51850Mvs c51850Mvs = (C51850Mvs) obj5;
                        int ordinal = c51850Mvs.A01.ordinal();
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != A06) {
                                    if (ordinal == 1) {
                                        abstractC56115Ova = new C52616NPl(c51850Mvs, c56389P2a);
                                    } else {
                                        i = i2;
                                    }
                                } else {
                                    abstractC56115Ova = new C39167HLv(c51850Mvs, c56389P2a);
                                }
                            } else {
                                abstractC56115Ova = new AbstractC56115Ova(c51850Mvs, c56389P2a);
                            }
                        } else {
                            ?? abstractC56115Ova2 = new AbstractC56115Ova(c51850Mvs, c56389P2a);
                            C51849Mvr c51849Mvr = c51850Mvs.A00;
                            if (c51849Mvr != null) {
                                z = c51849Mvr.A01;
                            } else {
                                z = false;
                            }
                            abstractC56115Ova2.A03 = z;
                            if (c51849Mvr == null || (list = c51849Mvr.A00) == null) {
                                list = C16930sl.A00;
                            }
                            abstractC56115Ova2.A01 = list;
                            abstractC56115Ova2.A02 = A062;
                            abstractC56115Ova = abstractC56115Ova2;
                        }
                        abstractC56115Ova.A00 = i + 1;
                        A12.add(abstractC56115Ova);
                        i = i2;
                    }
                    return A12;
                }
                return C16930sl.A00;
            }
            return AbstractC166987dD.A1J(new Object());
        }
        String str2 = (String) obj;
        String str3 = (String) obj2;
        ((C51023MgV) this.receiver).A01(str2, str3, (String) obj3, (String) obj4, AbstractC167017dG.A1a(str2, str3));
        return C0eB.A00;
    }
}
