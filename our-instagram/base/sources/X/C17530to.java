package X;

/* renamed from: X.0to, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17530to {
    public float A00;
    public int A01;
    public C17640tz A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;

    public final void A00(float f) {
        this.A00 = Math.max(this.A00, f);
        C17640tz c17640tz = this.A02;
        if (c17640tz.A02(f, c17640tz.A04.now())) {
            this.A07 = true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MainFeedSeenStateMediaInfo{mMediaID='");
        sb.append(this.A05);
        sb.append('\'');
        sb.append(", mVersion=");
        sb.append(this.A01);
        sb.append(", mPhotoViewedPercentages=");
        sb.append(this.A00);
        sb.append(", mSeenStateTimeInfo=");
        sb.append(this.A02);
        sb.append(", mIsDirty=");
        sb.append(this.A07);
        sb.append(", mAuthorId='");
        sb.append(this.A04);
        sb.append(", mProductType='");
        sb.append(this.A06);
        sb.append('}');
        return sb.toString();
    }

    public C17530to(C17530to c17530to) {
        this.A01 = 24;
        this.A02 = new C17640tz();
        this.A08 = false;
        this.A03 = null;
        this.A07 = false;
        this.A05 = c17530to.A05;
        this.A04 = c17530to.A04;
        this.A06 = c17530to.A06;
        this.A00 = c17530to.A00;
        this.A02 = new C17640tz(c17530to.A02);
        this.A08 = c17530to.A08;
        this.A07 = c17530to.A07;
    }

    public C17530to(String str, String str2, String str3) {
        this.A01 = 24;
        this.A02 = new C17640tz();
        this.A08 = false;
        this.A03 = null;
        this.A07 = false;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
    }

    public C17530to() {
        this.A01 = 24;
        this.A02 = new C17640tz();
        this.A08 = false;
        this.A03 = null;
        this.A07 = false;
    }
}
