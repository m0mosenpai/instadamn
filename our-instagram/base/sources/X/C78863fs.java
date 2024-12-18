package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3fs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78863fs {
    public int A00;
    public int A01;
    public C2WA A02;
    public C2W1 A03;
    public C51282Xb A04;
    public C51272Xa A05;
    public C51302Xd A06;
    public C78303ew A07;
    public C2W5 A08;
    public List A09;
    public boolean A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final long A0H;
    public final C003501a A0I;
    public final C003501a A0J;
    public final C2XE A0K;
    public final C50882Vk A0L;
    public final C2W5 A0M;
    public final String A0N;
    public final ArrayList A0O;
    public final ArrayList A0P;
    public final List A0Q;
    public final List A0R;
    public final List A0S;
    public final List A0T;
    public final Map A0U;
    public final Map A0V;
    public final Map A0W;
    public final Map A0X;
    public final Map A0Y;
    public final java.util.Set A0Z;
    public final java.util.Set A0a;

    public /* synthetic */ C78863fs(C2XE c2xe, C50882Vk c50882Vk, C78303ew c78303ew, C2W5 c2w5, List list, int i, int i2, long j) {
        int i3;
        ArrayList arrayList;
        C51272Xa c51272Xa;
        C51282Xb c51282Xb;
        int andIncrement = C50882Vk.A0e.getAndIncrement();
        if (c50882Vk != null) {
            i3 = c50882Vk.A0A;
        } else {
            i3 = -1;
        }
        ArrayList arrayList2 = new ArrayList(8);
        AbstractC50812Vc abstractC50812Vc = c2xe.A01;
        String str = (abstractC50812Vc == null || (str = abstractC50812Vc.A0H()) == null) ? "" : str;
        int A01 = AbstractC78603fS.A01(j);
        int A00 = AbstractC78603fS.A00(j);
        ArrayList arrayList3 = new ArrayList(8);
        if (C2V3.isEndToEndTestRun) {
            arrayList = new ArrayList(8);
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(8);
        HashSet hashSet2 = new HashSet(4);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(8);
        C003501a c003501a = new C003501a(8);
        C003501a c003501a2 = new C003501a(8);
        if (c50882Vk != null) {
            c51272Xa = c50882Vk.A0I;
            c51282Xb = c50882Vk.A0G;
        } else {
            c51272Xa = null;
            c51282Xb = null;
        }
        this.A0K = c2xe;
        this.A0H = j;
        this.A0L = c50882Vk;
        this.A0E = i;
        this.A0F = i2;
        this.A0M = c2w5;
        this.A0C = andIncrement;
        this.A0D = i3;
        this.A0Q = arrayList2;
        this.A0N = str;
        this.A0G = A01;
        this.A0B = A00;
        this.A0T = arrayList3;
        this.A0S = arrayList;
        this.A0R = arrayList4;
        this.A0V = hashMap;
        this.A0U = hashMap2;
        this.A0Z = hashSet;
        this.A0Y = linkedHashMap;
        this.A0P = arrayList5;
        this.A0O = arrayList6;
        this.A0X = linkedHashMap2;
        this.A0a = hashSet2;
        this.A0W = linkedHashMap3;
        this.A0I = c003501a;
        this.A0J = c003501a2;
        this.A08 = c2w5;
        this.A01 = 0;
        this.A00 = 0;
        this.A03 = null;
        this.A02 = null;
        this.A05 = c51272Xa;
        this.A04 = c51282Xb;
        this.A0A = false;
        this.A09 = list;
        this.A07 = c78303ew;
        this.A06 = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C78863fs) {
                C78863fs c78863fs = (C78863fs) obj;
                if (!C14360o3.A0K(this.A0K, c78863fs.A0K) || this.A0H != c78863fs.A0H || !C14360o3.A0K(this.A0L, c78863fs.A0L) || this.A0E != c78863fs.A0E || this.A0F != c78863fs.A0F || !C14360o3.A0K(this.A0M, c78863fs.A0M) || this.A0C != c78863fs.A0C || this.A0D != c78863fs.A0D || !C14360o3.A0K(this.A0Q, c78863fs.A0Q) || !C14360o3.A0K(this.A0N, c78863fs.A0N) || this.A0G != c78863fs.A0G || this.A0B != c78863fs.A0B || !C14360o3.A0K(this.A0T, c78863fs.A0T) || !C14360o3.A0K(this.A0S, c78863fs.A0S) || !C14360o3.A0K(this.A0R, c78863fs.A0R) || !C14360o3.A0K(this.A0V, c78863fs.A0V) || !C14360o3.A0K(this.A0U, c78863fs.A0U) || !C14360o3.A0K(this.A0Z, c78863fs.A0Z) || !C14360o3.A0K(this.A0Y, c78863fs.A0Y) || !C14360o3.A0K(this.A0P, c78863fs.A0P) || !C14360o3.A0K(this.A0O, c78863fs.A0O) || !C14360o3.A0K(this.A0X, c78863fs.A0X) || !C14360o3.A0K(this.A0a, c78863fs.A0a) || !C14360o3.A0K(this.A0W, c78863fs.A0W) || !C14360o3.A0K(this.A0I, c78863fs.A0I) || !C14360o3.A0K(this.A0J, c78863fs.A0J) || !C14360o3.A0K(this.A08, c78863fs.A08) || this.A01 != c78863fs.A01 || this.A00 != c78863fs.A00 || !C14360o3.A0K(this.A03, c78863fs.A03) || !C14360o3.A0K(this.A02, c78863fs.A02) || !C14360o3.A0K(this.A05, c78863fs.A05) || !C14360o3.A0K(this.A04, c78863fs.A04) || this.A0A != c78863fs.A0A || !C14360o3.A0K(this.A09, c78863fs.A09) || !C14360o3.A0K(this.A07, c78863fs.A07) || !C14360o3.A0K(this.A06, c78863fs.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReductionState(componentContext=");
        sb.append(this.A0K);
        sb.append(", sizeConstraints=");
        sb.append((Object) C78613fT.A04(this.A0H));
        sb.append(AbstractC111324zv.A00(1407));
        sb.append(this.A0L);
        sb.append(", rootX=");
        sb.append(this.A0E);
        sb.append(", rootY=");
        sb.append(this.A0F);
        sb.append(", root=");
        sb.append(this.A0M);
        sb.append(", id=");
        sb.append(this.A0C);
        sb.append(", previousLayoutStateId=");
        sb.append(this.A0D);
        sb.append(", mountableOutputs=");
        sb.append(this.A0Q);
        sb.append(", componentRootName=");
        sb.append(this.A0N);
        sb.append(AbstractC111324zv.A00(1468));
        sb.append(this.A0G);
        sb.append(AbstractC111324zv.A00(1419));
        sb.append(this.A0B);
        sb.append(", visibilityOutputs=");
        sb.append(this.A0T);
        sb.append(", testOutputs=");
        sb.append(this.A0S);
        sb.append(", scopedSpecComponentInfos=");
        sb.append(this.A0R);
        sb.append(", componentKeyToBounds=");
        sb.append(this.A0V);
        sb.append(", componentHandleToBounds=");
        sb.append(this.A0U);
        sb.append(", duplicatedTransitionIds=");
        sb.append(this.A0Z);
        sb.append(", transitionIdMapping=");
        sb.append(this.A0Y);
        sb.append(", mountableOutputTops=");
        sb.append(this.A0P);
        sb.append(", mountableOutputBottoms=");
        sb.append(this.A0O);
        sb.append(", incrementalMountOutputs=");
        sb.append(this.A0X);
        sb.append(", renderUnitIdsWhichHostRenderTrees=");
        sb.append(this.A0a);
        sb.append(", dynamicValueOutputs=");
        sb.append(this.A0W);
        sb.append(", animatableItems=");
        sb.append(this.A0I);
        sb.append(", outputsIdToPositionMap=");
        sb.append(this.A0J);
        sb.append(AbstractC111324zv.A00(1429));
        sb.append(this.A08);
        sb.append(", width=");
        sb.append(this.A01);
        sb.append(", height=");
        sb.append(this.A00);
        sb.append(", rootNode=");
        sb.append(this.A03);
        sb.append(", diffTreeRoot=");
        sb.append(this.A02);
        sb.append(", currentTransitionId=");
        sb.append(this.A05);
        sb.append(", currentLayoutOutputAffinityGroup=");
        sb.append(this.A04);
        sb.append(", hasComponentsExcludedFromIncrementalMount=");
        sb.append(this.A0A);
        sb.append(", attachables=");
        sb.append(this.A09);
        sb.append(", transitionData=");
        sb.append(this.A07);
        sb.append(", workingRangeContainer=");
        sb.append(this.A06);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11 = this.A0K.hashCode() * 31;
        long j = this.A0H;
        int i = (hashCode11 + ((int) (j ^ (j >>> 32)))) * 31;
        C50882Vk c50882Vk = this.A0L;
        int i2 = 0;
        if (c50882Vk == null) {
            hashCode = 0;
        } else {
            hashCode = c50882Vk.hashCode();
        }
        int i3 = (((((i + hashCode) * 31) + this.A0E) * 31) + this.A0F) * 31;
        C2W5 c2w5 = this.A0M;
        if (c2w5 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c2w5.hashCode();
        }
        int hashCode12 = (((((((((((((((i3 + hashCode2) * 31) + this.A0C) * 31) + this.A0D) * 31) + this.A0Q.hashCode()) * 31) + this.A0N.hashCode()) * 31) + this.A0G) * 31) + this.A0B) * 31) + this.A0T.hashCode()) * 31;
        List list = this.A0S;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int hashCode13 = (((((((((((((((((((((((((hashCode12 + hashCode3) * 31) + this.A0R.hashCode()) * 31) + this.A0V.hashCode()) * 31) + this.A0U.hashCode()) * 31) + this.A0Z.hashCode()) * 31) + this.A0Y.hashCode()) * 31) + this.A0P.hashCode()) * 31) + this.A0O.hashCode()) * 31) + this.A0X.hashCode()) * 31) + this.A0a.hashCode()) * 31) + this.A0W.hashCode()) * 31) + this.A0I.hashCode()) * 31) + this.A0J.hashCode()) * 31;
        C2W5 c2w52 = this.A08;
        if (c2w52 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c2w52.hashCode();
        }
        int i4 = (((((hashCode13 + hashCode4) * 31) + this.A01) * 31) + this.A00) * 31;
        C2W1 c2w1 = this.A03;
        if (c2w1 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c2w1.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        C2WA c2wa = this.A02;
        if (c2wa == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c2wa.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        C51272Xa c51272Xa = this.A05;
        if (c51272Xa == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c51272Xa.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        C51282Xb c51282Xb = this.A04;
        if (c51282Xb == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = c51282Xb.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        int i9 = 1237;
        if (this.A0A) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        List list2 = this.A09;
        if (list2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list2.hashCode();
        }
        int i11 = (i10 + hashCode9) * 31;
        C78303ew c78303ew = this.A07;
        if (c78303ew == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = c78303ew.hashCode();
        }
        int i12 = (i11 + hashCode10) * 31;
        C51302Xd c51302Xd = this.A06;
        if (c51302Xd != null) {
            i2 = c51302Xd.hashCode();
        }
        return i12 + i2;
    }
}
