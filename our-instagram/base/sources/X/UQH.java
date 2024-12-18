package X;

import instagram.features.clips.viewer.util.exitreelsurvey.ExitSurveyClipInfo$Companion;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class UQH extends C0T6 {
    public static final ExitSurveyClipInfo$Companion Companion = new Object();
    public Long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQH) {
                UQH uqh = (UQH) obj;
                if (!C14360o3.A0K(this.A00, uqh.A00) || !C14360o3.A0K(this.A03, uqh.A03) || !C14360o3.A0K(this.A01, uqh.A01) || this.A06 != uqh.A06 || this.A04 != uqh.A04 || this.A05 != uqh.A05 || !C14360o3.A0K(this.A02, uqh.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ UQH(Long l, Long l2, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        if (66 != (i & 66)) {
            AbstractC68612VXn.A00(X1F.A01, i, 66);
            throw C00O.createAndThrow();
        }
        if ((i & 1) == 0) {
            this.A00 = null;
        } else {
            this.A00 = l;
        }
        this.A03 = str;
        if ((i & 4) == 0) {
            this.A01 = null;
        } else {
            this.A01 = l2;
        }
        if ((i & 8) == 0) {
            this.A06 = false;
        } else {
            this.A06 = z;
        }
        if ((i & 16) == 0) {
            this.A04 = false;
        } else {
            this.A04 = z2;
        }
        if ((i & 32) == 0) {
            this.A05 = false;
        } else {
            this.A05 = z3;
        }
        this.A02 = str2;
    }

    public final int hashCode() {
        int i = 0;
        int A0K = AbstractC166997dE.A0K(this.A03, AbstractC167017dG.A0M(this.A00) * 31);
        Long l = this.A01;
        if (l != null) {
            i = l.hashCode();
        }
        return AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A06, (A0K + i) * 31))) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExitSurveyClipInfo(dwell=");
        sb.append(this.A00);
        sb.append(", id=");
        sb.append(this.A03);
        sb.append(", videoDuration=");
        sb.append(this.A01);
        sb.append(", isMultiAd=");
        sb.append(this.A06);
        sb.append(", isCarouselAd=");
        sb.append(this.A04);
        sb.append(", isMMC=");
        sb.append(this.A05);
        sb.append(", clipType=");
        return AbstractC25236BEt.A0Y(this.A02, sb);
    }

    public UQH(String str, Long l, String str2, Long l2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str2, 7);
        this.A00 = l;
        this.A03 = str;
        this.A01 = l2;
        this.A06 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A02 = str2;
    }
}
