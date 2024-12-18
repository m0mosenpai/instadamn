package X;

import android.graphics.Bitmap;
import com.facebook.forker.Process;
import com.instagram.appreciation.graphql.FetchAppreciationCreatorInsightsQueryResponseImpl;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.creation.base.CropInfo;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.shopping.model.destination.home.DestinationContentType;
import com.instagram.shopping.model.destination.home.DestinationSignalType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.GzT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38688GzT extends C0T6 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public final C50525MSe A04(SpecialRequirementCategory specialRequirementCategory) {
        Object obj;
        int A05 = AbstractC25227BEk.A05(specialRequirementCategory, 0);
        if (A05 != 4) {
            if (A05 != 3) {
                if (A05 != 2) {
                    if (A05 != 1) {
                        return null;
                    }
                    obj = this.A00;
                } else {
                    obj = this.A01;
                }
            } else {
                obj = this.A02;
            }
        } else {
            obj = this.A03;
        }
        return (C50525MSe) obj;
    }

    public final C38685GzQ A05(EnumC39623HeX enumC39623HeX) {
        Object obj;
        int A05 = AbstractC25227BEk.A05(enumC39623HeX, 0);
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 != 2) {
                    if (A05 == 3) {
                        obj = this.A01;
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    obj = this.A02;
                }
            } else {
                obj = this.A03;
            }
        } else {
            obj = this.A00;
        }
        return (C38685GzQ) obj;
    }

    public static /* synthetic */ C38688GzT A00(C38688GzT c38688GzT, C51751Mta c51751Mta, C51751Mta c51751Mta2, C1567071s c1567071s, OpalProfileData opalProfileData, int i) {
        if ((i & 1) != 0) {
            opalProfileData = (OpalProfileData) c38688GzT.A02;
        }
        if ((i & 2) != 0) {
            c51751Mta = (C51751Mta) c38688GzT.A01;
        }
        if ((i & 4) != 0) {
            c51751Mta2 = (C51751Mta) c38688GzT.A00;
        }
        if ((i & 8) != 0) {
            c1567071s = (C1567071s) c38688GzT.A03;
        }
        AbstractC167027dH.A12(opalProfileData, c51751Mta, c51751Mta2);
        return new C38688GzT(c51751Mta, c51751Mta2, c1567071s, opalProfileData);
    }

    public static boolean A03(Object obj, int i) {
        if ((obj instanceof C38688GzT) && ((C38688GzT) obj).A04 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38688GzT.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38688GzT.hashCode():int");
    }

    public final String toString() {
        StringBuilder A1C;
        Object obj;
        switch (this.A04) {
            case 7:
                A1C = AbstractC166987dD.A1C();
                A1C.append("LifecycleListener(lifecycleEvent=");
                A1C.append(this.A01);
                A1C.append(", threadScope=");
                A1C.append(this.A03);
                A1C.append(", lifecycleScope=");
                A1C.append(this.A02);
                A1C.append(AbstractC111324zv.A00(277));
                obj = this.A00;
                break;
            case Process.SIGSTOP /* 19 */:
                A1C = AbstractC166987dD.A1C();
                A1C.append("SectionUiState(id=");
                A1C.append(this.A02);
                A1C.append(", title=");
                A1C.append(this.A03);
                A1C.append(AbstractC111324zv.A00(561));
                A1C.append(this.A00);
                A1C.append(", footers=");
                obj = this.A01;
                break;
            default:
                return super.toString();
        }
        return AbstractC167017dG.A0o(obj, A1C);
    }

    public static final C38688GzT A02(C7IM c7im, Integer num, Integer num2, List list) {
        AbstractC167027dH.A12(num, num2, list);
        return new C38688GzT(c7im, num, num2, list);
    }

    public final String A06(EnumC39623HeX enumC39623HeX) {
        AbstractC39668Hix abstractC39668Hix;
        C39336HZb c39336HZb;
        C38685GzQ A05 = A05(enumC39623HeX);
        if (A05 != null) {
            abstractC39668Hix = (AbstractC39668Hix) A05.A01;
        } else {
            abstractC39668Hix = null;
        }
        if (!(abstractC39668Hix instanceof C39336HZb) || (c39336HZb = (C39336HZb) abstractC39668Hix) == null) {
            return null;
        }
        return c39336HZb.A00;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38688GzT(MUW muw, C38321qM c38321qM, CWE cwe, InterfaceC30833Dh8 interfaceC30833Dh8, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(23, (Object) null, (Object) null, (Object) null, (Object) null);
        this.A04 = 23;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38688GzT(CropInfo cropInfo, FilterGroupModel filterGroupModel, C09530e4 c09530e4, C09530e4 c09530e42, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(9, (Object) null, (Object) null, (Object) null, (Object) null);
        this.A04 = 9;
    }

    public C38688GzT(Hd0 hd0, EnumC39530Hcx enumC39530Hcx, C6K c6k, InterfaceC16820sZ interfaceC16820sZ) {
        this.A04 = 7;
        this.A01 = hd0;
        this.A03 = c6k;
        this.A02 = enumC39530Hcx;
        this.A00 = interfaceC16820sZ;
    }

    public C38688GzT(C50525MSe c50525MSe, C50525MSe c50525MSe2, C50525MSe c50525MSe3, C50525MSe c50525MSe4) {
        this.A04 = 6;
        this.A03 = c50525MSe;
        this.A02 = c50525MSe2;
        this.A01 = c50525MSe3;
        this.A00 = c50525MSe4;
    }

    public C38688GzT(C51759Mti c51759Mti, C51759Mti c51759Mti2, C51759Mti c51759Mti3, OSU osu) {
        this.A04 = 18;
        AbstractC167027dH.A0a(1, c51759Mti, c51759Mti2, c51759Mti3, osu);
        this.A03 = c51759Mti;
        this.A02 = c51759Mti2;
        this.A01 = c51759Mti3;
        this.A00 = osu;
    }

    public C38688GzT(C38685GzQ c38685GzQ, C38685GzQ c38685GzQ2, C38685GzQ c38685GzQ3, C38685GzQ c38685GzQ4) {
        this.A04 = 20;
        this.A00 = c38685GzQ;
        this.A03 = c38685GzQ2;
        this.A02 = c38685GzQ3;
        this.A01 = c38685GzQ4;
    }

    public C38688GzT(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2) {
        this.A04 = 14;
        this.A03 = interfaceC16820sZ;
        this.A00 = interfaceC16820sZ2;
        this.A01 = interfaceC16620sF;
        this.A02 = interfaceC16620sF2;
    }

    public C38688GzT(C51751Mta c51751Mta, C51751Mta c51751Mta2, C1567071s c1567071s, OpalProfileData opalProfileData) {
        this.A04 = 17;
        this.A02 = opalProfileData;
        this.A01 = c51751Mta;
        this.A00 = c51751Mta2;
        this.A03 = c1567071s;
    }

    public C38688GzT(C7IM c7im, Integer num, Integer num2, List list) {
        this.A04 = 11;
        this.A00 = num;
        this.A01 = num2;
        this.A02 = list;
        this.A03 = c7im;
    }

    public C38688GzT(C51761Mtk c51761Mtk, C51761Mtk c51761Mtk2, UQE uqe, List list) {
        this.A04 = 16;
        this.A03 = list;
        this.A01 = uqe;
        this.A02 = c51761Mtk;
        this.A00 = c51761Mtk2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38688GzT(AbstractC27827COq abstractC27827COq, EnumC27404C7h enumC27404C7h, InterfaceC30809Dgk interfaceC30809Dgk) {
        this((Bitmap) null, abstractC27827COq, enumC27404C7h, interfaceC30809Dgk);
        this.A04 = 8;
    }

    public C38688GzT(FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.LifetimeEstimatedEarnings lifetimeEstimatedEarnings, FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.PageInfo pageInfo, List list, List list2) {
        this.A04 = 5;
        C14360o3.A0B(list, 2);
        this.A01 = lifetimeEstimatedEarnings;
        this.A00 = list;
        this.A02 = list2;
        this.A03 = pageInfo;
    }

    public C38688GzT(C51759Mti c51759Mti, EnumC72392Xce enumC72392Xce, List list, List list2) {
        this.A04 = 19;
        C14360o3.A0B(enumC72392Xce, 1);
        this.A02 = enumC72392Xce;
        this.A03 = c51759Mti;
        this.A00 = list;
        this.A01 = list2;
    }

    public C38688GzT(Bitmap bitmap, AbstractC27827COq abstractC27827COq, EnumC27404C7h enumC27404C7h, InterfaceC30809Dgk interfaceC30809Dgk) {
        this.A04 = 8;
        AbstractC37302Gc3.A1U(abstractC27827COq, interfaceC30809Dgk);
        this.A00 = enumC27404C7h;
        this.A02 = bitmap;
        this.A03 = abstractC27827COq;
        this.A01 = interfaceC30809Dgk;
    }

    public C38688GzT(Integer num, Integer num2, Integer num3, Integer num4, int i) {
        this.A04 = i;
        if (i != 0) {
            this.A03 = num;
            this.A01 = num2;
            this.A02 = num3;
        } else {
            this.A02 = num;
            this.A01 = num2;
            this.A03 = num3;
        }
        this.A00 = num4;
    }

    public C38688GzT(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C38688GzT(java.lang.Integer r8, java.lang.Integer r9, java.lang.Integer r10, int r11) {
        /*
            r7 = this;
            r5 = r10
            r4 = r9
            r3 = r8
            r2 = 0
            r6 = 10
            r1 = r7
            r7.A04 = r6
            r0 = r11 & 2
            if (r0 == 0) goto Le
            r3 = r2
        Le:
            r0 = r11 & 4
            if (r0 == 0) goto L13
            r4 = r2
        L13:
            r0 = r11 & 8
            if (r0 == 0) goto L18
            r5 = r2
        L18:
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38688GzT.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38688GzT(C38685GzQ c38685GzQ) {
        this(c38685GzQ, new C38685GzQ((AbstractC39668Hix) null, (Integer) null, 7), new C38685GzQ((AbstractC39668Hix) null, (Integer) null, 7), new C38685GzQ((AbstractC39668Hix) null, (Integer) null, 7));
        this.A04 = 20;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.IKc, java.lang.Object] */
    public C38688GzT(int i) {
        this(22, (Object) null, (Object) null, (Object) null, (Object) null);
        this.A04 = i;
        if (21 - i != 0) {
            this.A04 = 22;
            return;
        }
        this.A04 = 21;
        C38685GzQ c38685GzQ = new C38685GzQ(null, null, null, null, 7, 4);
        C51759Mti c51759Mti = new C51759Mti((C38685GzQ) null, C16930sl.A00);
        ?? obj = new Object();
        obj.A09 = null;
        obj.A0B = null;
        obj.A00 = null;
        obj.A05 = null;
        obj.A02 = null;
        obj.A01 = null;
        obj.A08 = null;
        obj.A07 = null;
        obj.A06 = null;
        obj.A04 = null;
        obj.A0A = null;
        obj.A03 = null;
        C38685GzQ c38685GzQ2 = new C38685GzQ(3, DestinationSignalType.A09, DestinationContentType.A07, AbstractC166987dD.A1G());
        this.A04 = 21;
        C14360o3.A0B(c38685GzQ2, 4);
        this.A00 = c38685GzQ;
        this.A02 = c51759Mti;
        this.A03 = obj;
        this.A01 = c38685GzQ2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38688GzT() {
        this(new C51751Mta((C74) null, (String) null, (List) null, (DefaultConstructorMarker) null, 15, 4, false), new C51751Mta((C74) null, (String) null, (List) null, (DefaultConstructorMarker) null, 15, 4, false), (C1567071s) null, new OpalProfileData(C74.A07, "", "", "", "", null, "", C16930sl.A00, 0, false, false, false, false));
        this.A04 = 17;
    }
}
