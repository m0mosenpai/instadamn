package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.7La, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161397La implements InterfaceC66482zP, C7VC {
    public long A00;
    public C162297Or A01;
    public Integer A02;
    public String A03;
    public final int A04;
    public final Drawable A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public C161397La(Drawable drawable, C162297Or c162297Or, Integer num, String str, String str2, int i, long j, boolean z, boolean z2) {
        C14360o3.A0B(str2, 2);
        this.A06 = str;
        this.A03 = str2;
        this.A00 = j;
        this.A09 = z;
        this.A05 = drawable;
        this.A04 = i;
        this.A01 = c162297Or;
        this.A02 = num;
        this.A08 = z2;
        this.A07 = String.valueOf(j);
    }

    @Override // X.C7VC
    public final int getType() {
        return 56;
    }

    @Override // X.C7VC
    public final long C8f() {
        return this.A00;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A07;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C161397La c161397La = (C161397La) obj;
        C14360o3.A0B(c161397La, 0);
        if (this.A00 == c161397La.A00 && C14360o3.A0K(this.A03, c161397La.A03) && this.A09 == c161397La.A09) {
            return true;
        }
        return false;
    }
}
