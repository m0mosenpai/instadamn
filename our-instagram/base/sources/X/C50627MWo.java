package X;

import android.graphics.PointF;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ContentAppreciationFanOfferType;
import com.instagram.api.schemas.ProductMediaType;
import com.instagram.common.gallery.Medium;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.MWo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50627MWo extends C0T6 {
    public Object A00;
    public Object A01;
    public final int A02;

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof C50627MWo) && ((C50627MWo) obj).A02 == i) {
            return true;
        }
        return false;
    }

    public final void A02(C50627MWo c50627MWo) {
        Long l;
        long j;
        Number number;
        Number number2 = (Number) this.A01;
        if (number2 != null) {
            long longValue = number2.longValue();
            if (c50627MWo != null && (number = (Number) c50627MWo.A01) != null) {
                j = number.longValue();
            } else {
                j = 0;
            }
            l = Long.valueOf(longValue + j);
        } else {
            l = null;
        }
        this.A01 = l;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50627MWo.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x01ce, code lost:
    
        if (r1 != null) goto L92;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50627MWo.hashCode():int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder A1C;
        String str;
        String str2;
        Object obj;
        String str3;
        String str4;
        switch (this.A02) {
            case 4:
                A1C = AbstractC166987dD.A1C();
                A1C.append("FeatureIdentifierGroups(longFeatureIds=");
                A1C.append(this.A01);
                str = ", floatFeatureIds=";
                A1C.append(str);
                obj = this.A00;
                A1C.append(obj);
                return AbstractC167017dG.A0p(A1C);
            case 7:
                A1C = AbstractC166987dD.A1C();
                A1C.append("GridLayoutStrategy(config=");
                A1C.append(this.A00);
                str2 = ", layoutCalculator=";
                A1C.append(str2);
                obj = this.A01;
                A1C.append(obj);
                return AbstractC167017dG.A0p(A1C);
            case 8:
                A1C = AbstractC166987dD.A1C();
                A1C.append("ViolationData(violationType=");
                A1C.append(this.A01);
                str = ", offenderViewIds=";
                A1C.append(str);
                obj = this.A00;
                A1C.append(obj);
                return AbstractC167017dG.A0p(A1C);
            case 26:
                A1C = AbstractC166987dD.A1C();
                A1C.append("AccessTokenRequestDetail(tokenType=");
                Number number = (Number) this.A01;
                if (number != null) {
                    if (1 - number.intValue() != 0) {
                        str3 = "BusinessUserAccessTokenType";
                    } else {
                        str3 = "UnknownType";
                    }
                } else {
                    str3 = "null";
                }
                A1C.append(str3);
                str = ", tokenRequestState=";
                A1C.append(str);
                obj = this.A00;
                A1C.append(obj);
                return AbstractC167017dG.A0p(A1C);
            case 32:
                A1C = AbstractC166987dD.A1C();
                A1C.append("Refinement(touchedPoint=");
                A1C.append(this.A01);
                A1C.append(", mask=");
                A1C.append(Arrays.toString((float[]) this.A00));
                return AbstractC167017dG.A0p(A1C);
            case 33:
                A1C = AbstractC166987dD.A1C();
                A1C.append("StackedTimelineScrollEvent(event=");
                Integer num = (Integer) this.A00;
                if (num != null) {
                    str4 = AbstractC53900NsZ.A00(num);
                } else {
                    str4 = "null";
                }
                A1C.append(str4);
                str2 = ", metaData=";
                A1C.append(str2);
                obj = this.A01;
                A1C.append(obj);
                return AbstractC167017dG.A0p(A1C);
            default:
                return super.toString();
        }
    }

    public static final C50627MWo A00(C7U c7u, C5Hc c5Hc) {
        AbstractC167017dG.A1N(c5Hc, c7u);
        return new C50627MWo(c7u, c5Hc);
    }

    public C50627MWo(C5Kv c5Kv, List list) {
        this.A02 = 37;
        this.A00 = list;
        this.A01 = c5Kv;
    }

    public C50627MWo(C47981LJa c47981LJa, Integer num) {
        this.A02 = 18;
        this.A00 = num;
        this.A01 = c47981LJa;
    }

    public C50627MWo(C51752Mtb c51752Mtb, Integer num) {
        this.A02 = 33;
        this.A00 = num;
        this.A01 = c51752Mtb;
    }

    public C50627MWo(QJ0 qj0, C6R c6r) {
        this.A02 = 45;
        this.A00 = c6r;
        this.A01 = qj0;
    }

    public C50627MWo(InterfaceC166407c9 interfaceC166407c9, InterfaceC166367c5 interfaceC166367c5) {
        this.A02 = 30;
        this.A01 = interfaceC166367c5;
        this.A00 = interfaceC166407c9;
    }

    public C50627MWo(C7U c7u, C5Hc c5Hc) {
        this.A02 = 38;
        this.A01 = c5Hc;
        this.A00 = c7u;
    }

    public C50627MWo(C50525MSe c50525MSe, Integer num) {
        this.A02 = 26;
        this.A01 = num;
        this.A00 = c50525MSe;
    }

    public C50627MWo(InterfaceC58189Pqv interfaceC58189Pqv, Integer num) {
        this.A02 = 39;
        this.A01 = num;
        this.A00 = interfaceC58189Pqv;
    }

    public C50627MWo(Hashtag hashtag, Integer num) {
        this.A02 = 42;
        this.A01 = num;
        this.A00 = hashtag;
    }

    public C50627MWo(C4SS c4ss, Integer num) {
        this.A02 = 9;
        this.A01 = c4ss;
        this.A00 = num;
    }

    public C50627MWo(EnumC68137VCy enumC68137VCy, List list) {
        this.A02 = 8;
        this.A01 = enumC68137VCy;
        this.A00 = list;
    }

    public C50627MWo(CharSequence charSequence, CharSequence charSequence2) {
        this.A02 = 46;
        this.A01 = charSequence;
        this.A00 = charSequence2;
    }

    public C50627MWo(Integer num, Map map) {
        this.A02 = 21;
        this.A01 = num;
        this.A00 = map;
    }

    public C50627MWo(C51760Mtj c51760Mtj, Integer num) {
        this.A02 = 3;
        this.A01 = c51760Mtj;
        this.A00 = num;
    }

    public C50627MWo(Medium medium, C195868lW c195868lW) {
        this.A02 = 34;
        this.A00 = medium;
        this.A01 = c195868lW;
    }

    public C50627MWo(java.util.Set set, java.util.Set set2) {
        this.A02 = 1;
        this.A00 = set;
        this.A01 = set2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50627MWo(Integer num, Map map, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(C05F.A00, AbstractC06930Yk.A0E());
        this.A02 = 21;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50627MWo(C7U c7u, DefaultConstructorMarker defaultConstructorMarker, C5Hc c5Hc, int i, int i2) {
        this(C7U.A03, C5HZ.A01);
        this.A02 = 38;
    }

    public C50627MWo(EnumC193878i8 enumC193878i8, Boolean bool) {
        this.A02 = 40;
        C14360o3.A0B(enumC193878i8, 1);
        this.A01 = enumC193878i8;
        this.A00 = bool;
    }

    public C50627MWo(C195868lW c195868lW, Integer num) {
        this.A02 = 35;
        C14360o3.A0B(c195868lW, 1);
        this.A01 = c195868lW;
        this.A00 = num;
    }

    public C50627MWo(C5QE c5qe, List list) {
        this.A02 = 19;
        C14360o3.A0B(list, 2);
        this.A00 = c5qe;
        this.A01 = list;
    }

    public C50627MWo(C51744MtT c51744MtT, InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = 7;
        C14360o3.A0B(interfaceC16660sJ, 2);
        this.A00 = c51744MtT;
        this.A01 = interfaceC16660sJ;
    }

    public C50627MWo(PointF pointF, float[] fArr) {
        this.A02 = 32;
        C14360o3.A0B(fArr, 2);
        this.A01 = pointF;
        this.A00 = fArr;
    }

    public C50627MWo(EnumC33343Eoc enumC33343Eoc, List list) {
        this.A02 = 29;
        AbstractC167017dG.A1P(list, enumC33343Eoc);
        this.A00 = list;
        this.A01 = enumC33343Eoc;
    }

    public C50627MWo(ProductMediaType productMediaType, InterfaceC58248Prs interfaceC58248Prs) {
        this.A02 = 17;
        AbstractC167017dG.A1P(interfaceC58248Prs, productMediaType);
        this.A00 = interfaceC58248Prs;
        this.A01 = productMediaType;
    }

    public C50627MWo(InterfaceC58234Pre interfaceC58234Pre, Integer num) {
        this.A02 = 13;
        C14360o3.A0B(interfaceC58234Pre, 2);
        this.A00 = num;
        this.A01 = interfaceC58234Pre;
    }

    public C50627MWo(ContentAppreciationFanOfferType contentAppreciationFanOfferType, InterfaceC58219PrP interfaceC58219PrP) {
        this.A02 = 11;
        C14360o3.A0B(contentAppreciationFanOfferType, 2);
        this.A00 = interfaceC58219PrP;
        this.A01 = contentAppreciationFanOfferType;
    }

    public C50627MWo(C28225CcV c28225CcV, List list) {
        this.A02 = 6;
        AbstractC167017dG.A1P(c28225CcV, list);
        this.A00 = c28225CcV;
        this.A01 = list;
    }

    public C50627MWo(Folder folder, List list) {
        this.A02 = 20;
        AbstractC167017dG.A1P(folder, list);
        this.A01 = folder;
        this.A00 = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public C50627MWo(List list, List list2, int i) {
        this.A02 = i;
        switch (i) {
            case 4:
                AbstractC167017dG.A1P(list, list2);
                this.A01 = list;
                this.A00 = list2;
                return;
            case 14:
            case Process.SIGTERM /* 15 */:
                AbstractC167017dG.A1P(list, list2);
                this.A00 = list;
                this.A01 = list2;
                return;
            default:
                this.A01 = list;
                this.A00 = list2;
                return;
        }
    }

    public C50627MWo(Integer num, Integer num2) {
        this.A02 = 2;
        C14360o3.A0B(num, 1);
        C14360o3.A0B(num2, 2);
        this.A00 = num;
        this.A01 = num2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50627MWo() {
        this((QJ0) null, C6R.A03);
        this.A02 = 45;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50627MWo(Integer num) {
        this((InterfaceC58189Pqv) null, num);
        this.A02 = 39;
    }

    public C50627MWo(MUW muw) {
        this.A02 = 27;
        this.A01 = muw;
        this.A00 = null;
    }

    public C50627MWo(Long l, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A02 = 28;
        this.A02 = 28;
        this.A01 = null;
    }

    public C50627MWo(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public C50627MWo(Integer num, List list, int i) {
        this.A02 = i;
        this.A01 = num;
        this.A00 = list;
    }

    public C50627MWo(C6R c6r, List list, int i) {
        this.A02 = i;
        if (47 - i != 0) {
            this.A00 = list;
            this.A01 = c6r;
        } else {
            this.A01 = list;
            this.A00 = c6r;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50627MWo(C4SS c4ss) {
        this(c4ss, C05F.A00);
        this.A02 = 9;
    }
}
