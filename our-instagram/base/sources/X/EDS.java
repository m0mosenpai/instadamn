package X;

import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class EDS extends C40781ul {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public final C34955Faf A00() {
        String str;
        String str2;
        if (!TextUtils.isEmpty(this.A04)) {
            return new C34955Faf(this, this.A04, this.A05, true);
        }
        if (!TextUtils.isEmpty(this.A00)) {
            str = this.A00;
            str2 = this.A01;
        } else if (!TextUtils.isEmpty(this.A02)) {
            str = this.A02;
            str2 = this.A03;
        } else if (!TextUtils.isEmpty(this.A06)) {
            str = this.A06;
            str2 = this.A07;
        } else {
            return null;
        }
        return new C34955Faf(this, str, str2);
    }
}
