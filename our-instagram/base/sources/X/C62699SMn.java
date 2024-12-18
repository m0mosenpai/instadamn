package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.SMn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62699SMn {
    public SLH A00;
    public SLH A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.Rpy] */
    public final C61575Rpy A00() {
        if (!TextUtils.isEmpty(this.A06) && !TextUtils.isEmpty(this.A05) && !TextUtils.isEmpty(this.A03)) {
            ?? obj = new Object();
            obj.A06 = this.A06;
            obj.A05 = this.A05;
            obj.A03 = this.A03;
            obj.A00 = this.A00;
            obj.A02 = this.A02;
            obj.A07 = this.A07;
            obj.A04 = this.A04;
            obj.A01 = this.A01;
            return obj;
        }
        throw AbstractC166987dD.A12("The title, subtitle and description of PIN keypad screen should NOT be empty.");
    }
}
