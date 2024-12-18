package X;

import android.view.View;
import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import java.util.List;

/* renamed from: X.Jxt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45124Jxt extends C0T6 {
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public static final C45124Jxt A00(C7T c7t, Boolean bool, C5Hc c5Hc, boolean z, boolean z2) {
        C14360o3.A0B(c5Hc, 3);
        return new C45124Jxt(c7t, bool, c5Hc, z, z2);
    }

    public static final C45124Jxt A01(BoostMediaPickerTabType boostMediaPickerTabType, BoostMediaPickerTabType boostMediaPickerTabType2, EnumC68121VCe enumC68121VCe, boolean z, boolean z2) {
        AbstractC25233BEq.A0w(0, enumC68121VCe, boostMediaPickerTabType, boostMediaPickerTabType2);
        return new C45124Jxt(boostMediaPickerTabType, boostMediaPickerTabType2, enumC68121VCe, z, z2);
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof C45124Jxt) && ((C45124Jxt) obj).A02 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45124Jxt.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45124Jxt.hashCode():int");
    }

    public final String toString() {
        if (5 - this.A02 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ViewState(header=");
        A1C.append(this.A05);
        A1C.append(", cta=");
        A1C.append(this.A04);
        A1C.append(", clipsGridItems=");
        A1C.append(this.A03);
        A1C.append(", hasMoreClips=");
        A1C.append(this.A00);
        A1C.append(", isFirstPage=");
        return AbstractC25236BEt.A0a(A1C, this.A01);
    }

    public C45124Jxt(C86013sY c86013sY, C38321qM c38321qM, C25370BKn c25370BKn, boolean z, boolean z2) {
        this.A02 = 6;
        this.A05 = c25370BKn;
        this.A03 = c38321qM;
        this.A04 = c86013sY;
        this.A01 = z;
        this.A00 = z2;
    }

    public C45124Jxt(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z, boolean z2) {
        this.A02 = 7;
        this.A03 = c120985dq;
        this.A04 = c37644Ghd;
        this.A01 = z;
        this.A05 = view;
        this.A00 = z2;
    }

    public C45124Jxt(Integer num, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z, boolean z2) {
        this.A02 = 4;
        this.A04 = num;
        this.A01 = z;
        this.A05 = interfaceC16820sZ;
        this.A03 = interfaceC16820sZ2;
        this.A00 = z2;
    }

    public C45124Jxt(MUD mud, C38686GzR c38686GzR, List list, boolean z, boolean z2) {
        this.A02 = 5;
        this.A05 = c38686GzR;
        this.A04 = mud;
        this.A03 = list;
        this.A00 = z;
        this.A01 = z2;
    }

    public C45124Jxt(BoostMediaPickerTabType boostMediaPickerTabType, BoostMediaPickerTabType boostMediaPickerTabType2, EnumC68121VCe enumC68121VCe, boolean z, boolean z2) {
        this.A02 = 0;
        this.A05 = enumC68121VCe;
        this.A00 = z;
        this.A01 = z2;
        this.A04 = boostMediaPickerTabType;
        this.A03 = boostMediaPickerTabType2;
    }

    public C45124Jxt(C7T c7t, Boolean bool, C5Hc c5Hc, boolean z, boolean z2) {
        this.A02 = 3;
        C14360o3.A0B(c5Hc, 4);
        this.A01 = z;
        this.A03 = bool;
        this.A04 = c7t;
        this.A05 = c5Hc;
        this.A00 = z2;
    }

    public C45124Jxt(C51758Mth c51758Mth, UQJ uqj, C66628UPq c66628UPq, boolean z, boolean z2) {
        this.A02 = 1;
        AbstractC25233BEq.A0v(1, uqj, c51758Mth, c66628UPq);
        this.A03 = uqj;
        this.A05 = c51758Mth;
        this.A04 = c66628UPq;
        this.A00 = z;
        this.A01 = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45124Jxt(EnumC68121VCe enumC68121VCe) {
        this(BoostMediaPickerTabType.A04, BoostMediaPickerTabType.A05, enumC68121VCe, false, false);
        this.A02 = 0;
    }

    public C45124Jxt(Integer num, Integer num2, int i, boolean z, boolean z2) {
        this.A02 = 2;
        Integer num3 = (i & 4) != 0 ? C05F.A00 : null;
        num = (i & 8) != 0 ? C05F.A01 : num;
        num2 = (i & 16) != 0 ? C05F.A00 : num2;
        this.A02 = 2;
        AbstractC25233BEq.A0x(3, num3, num, num2);
        this.A00 = z;
        this.A01 = z2;
        this.A04 = num3;
        this.A05 = num;
        this.A03 = num2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45124Jxt(boolean z) {
        this((C7T) null, (Boolean) null, AbstractC133095zb.A00(C16930sl.A00), z, false);
        this.A02 = 3;
    }
}
