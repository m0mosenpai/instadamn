package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8Qv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187028Qv {
    public int A00;
    public int A01;
    public BrandedContentGatingInfo A02;
    public BrandedContentProjectMetadata A03;
    public MediaGenAIDetectionMethod A04;
    public UserSession A05;
    public C8PM A06;
    public C8Q1 A07;
    public String A08;
    public LinkedHashMap A09;
    public List A0A;
    public List A0B;
    public List A0C;
    public List A0D;
    public List A0E;
    public List A0F;
    public List A0G;
    public List A0H;
    public List A0I;
    public List A0J;
    public Map A0K;
    public InterfaceC09390do A0L;
    public InterfaceC09390do A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public int A0S;
    public boolean A0T;
    public final TransformMatrixParams A0U;

    public C187028Qv(TransformMatrixParams transformMatrixParams, BrandedContentGatingInfo brandedContentGatingInfo, BrandedContentProjectMetadata brandedContentProjectMetadata, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, C8PM c8pm, C8Q1 c8q1, String str, LinkedHashMap linkedHashMap, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, Map map, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ArrayList arrayList;
        ArrayList arrayList2;
        TransformMatrixParams transformMatrixParams2 = new TransformMatrixParams();
        this.A0U = transformMatrixParams2;
        this.A05 = userSession;
        transformMatrixParams2.A00(transformMatrixParams);
        this.A0K = map;
        this.A07 = c8q1;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list);
        }
        this.A0D = arrayList;
        this.A06 = c8pm;
        this.A02 = brandedContentGatingInfo;
        this.A0A = list2;
        this.A03 = brandedContentProjectMetadata;
        this.A0Q = z;
        this.A0N = z2;
        if (list3 == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(list3);
        }
        this.A0C = arrayList2;
        this.A0E = new ArrayList(list4);
        this.A0F = new ArrayList(list5);
        this.A0B = list6 != null ? new ArrayList(list6) : null;
        this.A09 = new LinkedHashMap(linkedHashMap);
        this.A0I = list7;
        this.A0H = list8;
        this.A0G = list9;
        this.A0J = list10;
        this.A08 = str;
        this.A0S = i;
        this.A0T = z3;
        this.A0R = z4;
        this.A0O = false;
        this.A0P = z5;
        this.A04 = mediaGenAIDetectionMethod;
        this.A0M = AbstractC09440dt.A01(new C187038Qw(this));
        this.A0L = AbstractC09440dt.A01(new C187048Qx(this));
    }

    public final boolean A00() {
        if (this.A07 != null) {
            return !r0.A00.isEmpty();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r1.equals(r0) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187028Qv.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Map map = this.A0K;
        int i13 = 0;
        if (map != null) {
            i = map.hashCode();
        } else {
            i = 0;
        }
        int hashCode = ((i * 31) + this.A0U.hashCode()) * 31;
        C8Q1 c8q1 = this.A07;
        if (c8q1 != null) {
            i2 = c8q1.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (((((hashCode + i2) * 31) + this.A0S) * 31) + (this.A0T ? 1 : 0)) * 31;
        List list = this.A0D;
        if (list != null) {
            i3 = list.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode2 = (((i14 + i3) * 31) + this.A06.hashCode()) * 31;
        BrandedContentGatingInfo brandedContentGatingInfo = this.A02;
        if (brandedContentGatingInfo != null) {
            i4 = brandedContentGatingInfo.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (hashCode2 + i4) * 31;
        List list2 = this.A0A;
        if (list2 != null) {
            i5 = list2.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 31;
        BrandedContentProjectMetadata brandedContentProjectMetadata = this.A03;
        if (brandedContentProjectMetadata != null) {
            i6 = brandedContentProjectMetadata.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (((((((((i16 + i6) * 31) + this.A01) * 31) + this.A00) * 31) + (this.A0Q ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31;
        List list3 = this.A0C;
        if (list3 != null) {
            i7 = list3.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 31;
        List list4 = this.A0E;
        if (list4 != null) {
            i8 = list4.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 31;
        List list5 = this.A0F;
        if (list5 != null) {
            i9 = list5.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 31;
        List list6 = this.A0B;
        if (list6 != null) {
            i10 = list6.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 31;
        LinkedHashMap linkedHashMap = this.A09;
        if (linkedHashMap != null) {
            i11 = linkedHashMap.hashCode();
        } else {
            i11 = 0;
        }
        int i22 = (i21 + i11) * 31;
        String str = this.A08;
        if (str != null) {
            i12 = str.hashCode();
        } else {
            i12 = 0;
        }
        int i23 = (((((((i22 + i12) * 31) + (this.A0O ? 1 : 0)) * 31) + (this.A0P ? 1 : 0)) * 31) + (this.A0R ? 1 : 0)) * 31;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = this.A04;
        if (mediaGenAIDetectionMethod != null && mediaGenAIDetectionMethod != MediaGenAIDetectionMethod.A0B) {
            i13 = 1;
        }
        return i23 + i13;
    }

    public C187028Qv() {
        this.A0U = new TransformMatrixParams();
    }
}
