package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5J1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5J1 extends C0T6 implements C5J2 {
    public final long A00;
    public final long A01;
    public final Integer A02;
    public final String A03;

    public C5J1(Integer num, String str, long j, long j2) {
        C14360o3.A0B(str, 3);
        this.A00 = j;
        this.A02 = num;
        this.A03 = str;
        this.A01 = j2;
    }

    @Override // X.C5J2
    public final C5J1 EsE() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5J1) {
                C5J1 c5j1 = (C5J1) obj;
                if (this.A00 != c5j1.A00 || !C14360o3.A0K(this.A02, c5j1.A02) || !C14360o3.A0K(this.A03, c5j1.A03) || this.A01 != c5j1.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5J2
    public final Integer BHQ() {
        return this.A02;
    }

    @Override // X.C5J2
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTemplateTransitionEffectInfo", AbstractC39829Hld.A00(this));
    }

    @Override // X.C5J2
    public final long getDurationInMs() {
        return this.A00;
    }

    @Override // X.C5J2
    public final String getName() {
        return this.A03;
    }

    @Override // X.C5J2
    public final long getStartTimeInMs() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A00;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Integer num = this.A02;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((i + hashCode) * 31) + this.A03.hashCode()) * 31;
        long j2 = this.A01;
        return hashCode2 + ((int) (j2 ^ (j2 >>> 32)));
    }
}
