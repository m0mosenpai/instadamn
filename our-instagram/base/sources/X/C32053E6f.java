package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import java.lang.ref.WeakReference;

/* renamed from: X.E6f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32053E6f extends C0T6 {
    public final PushChannelType A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final WeakReference A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32053E6f) {
                C32053E6f c32053E6f = (C32053E6f) obj;
                if (!C14360o3.A0K(this.A0A, c32053E6f.A0A) || !C14360o3.A0K(this.A04, c32053E6f.A04) || !C14360o3.A0K(this.A07, c32053E6f.A07) || !C14360o3.A0K(this.A09, c32053E6f.A09) || !C14360o3.A0K(this.A08, c32053E6f.A08) || this.A0C != c32053E6f.A0C || this.A0B != c32053E6f.A0B || this.A00 != c32053E6f.A00 || !C14360o3.A0K(this.A01, c32053E6f.A01) || !C14360o3.A0K(this.A05, c32053E6f.A05) || !C14360o3.A0K(this.A02, c32053E6f.A02) || !C14360o3.A0K(this.A06, c32053E6f.A06) || !C14360o3.A0K(this.A03, c32053E6f.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0K(this.A05, (AbstractC166997dE.A0J(this.A00, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0C, (AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0G(this.A0A)))) + AbstractC167017dG.A0O(this.A08)) * 31))) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public C32053E6f(PushChannelType pushChannelType, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, WeakReference weakReference, boolean z, boolean z2) {
        this.A0A = weakReference;
        this.A04 = str;
        this.A07 = str2;
        this.A09 = str3;
        this.A08 = str4;
        this.A0C = z;
        this.A0B = z2;
        this.A00 = pushChannelType;
        this.A01 = l;
        this.A05 = str5;
        this.A02 = str6;
        this.A06 = str7;
        this.A03 = str8;
    }
}
