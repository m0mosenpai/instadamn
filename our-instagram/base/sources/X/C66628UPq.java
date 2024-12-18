package X;

import com.instagram.business.promote.model.AudienceGeoLocation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UPq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66628UPq extends C0T6 {
    public int A00;
    public int A01;
    public AudienceGeoLocation A02;
    public AudienceGeoLocation A03;
    public List A04;
    public List A05;
    public boolean A06;

    public C66628UPq() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.A00 = 0;
        this.A03 = null;
        this.A02 = null;
        this.A05 = arrayList;
        this.A04 = arrayList2;
        this.A01 = 5;
        this.A06 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66628UPq) {
                C66628UPq c66628UPq = (C66628UPq) obj;
                if (this.A00 != c66628UPq.A00 || !C14360o3.A0K(this.A03, c66628UPq.A03) || !C14360o3.A0K(this.A02, c66628UPq.A02) || !C14360o3.A0K(this.A05, c66628UPq.A05) || !C14360o3.A0K(this.A04, c66628UPq.A04) || this.A01 != c66628UPq.A01 || this.A06 != c66628UPq.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((this.A00 * 31) + AbstractC167017dG.A0M(this.A03)) * 31;
        AudienceGeoLocation audienceGeoLocation = this.A02;
        if (audienceGeoLocation != null) {
            i = audienceGeoLocation.hashCode();
        }
        int A0J = (AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A05, (A0M + i) * 31)) + this.A01) * 31;
        int i2 = 1237;
        if (this.A06) {
            i2 = 1231;
        }
        return A0J + i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.UPq] */
    public static final C66628UPq A00(AudienceGeoLocation audienceGeoLocation, AudienceGeoLocation audienceGeoLocation2, List list, List list2, int i, int i2, boolean z) {
        AbstractC37302Gc3.A1U(list, list2);
        ?? obj = new Object();
        obj.A00 = i;
        obj.A03 = audienceGeoLocation;
        obj.A02 = audienceGeoLocation2;
        obj.A05 = list;
        obj.A04 = list2;
        obj.A01 = i2;
        obj.A06 = z;
        return obj;
    }
}
