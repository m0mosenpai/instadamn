package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7Mp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161807Mp implements InterfaceC66482zP, C7VC {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final C206379Bu A04;
    public final MessageIdentifier A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final C162297Or A0F;

    public C161807Mp(C206379Bu c206379Bu, C162297Or c162297Or, MessageIdentifier messageIdentifier, String str, String str2, String str3, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(str, 1);
        this.A09 = str;
        this.A03 = j;
        this.A02 = i;
        this.A04 = c206379Bu;
        this.A0F = c162297Or;
        this.A0C = z;
        this.A0E = z2;
        this.A0B = z3;
        this.A0A = z4;
        this.A05 = messageIdentifier;
        this.A0D = z5;
        this.A00 = i2;
        this.A01 = i3;
        this.A07 = str2;
        this.A06 = str3;
        this.A08 = String.valueOf(j);
    }

    @Override // X.InterfaceC66492zQ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final boolean isContentSame(C161807Mp c161807Mp) {
        C14360o3.A0B(c161807Mp, 0);
        if (this.A03 == c161807Mp.A03 && C14360o3.A0K(this.A09, c161807Mp.A09) && C14360o3.A0K(this.A04, c161807Mp.A04) && this.A0C == c161807Mp.A0C && this.A0E == c161807Mp.A0E) {
            return true;
        }
        return false;
    }

    @Override // X.C7VC
    public final long C8f() {
        return this.A03;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A08;
    }

    @Override // X.C7VC
    public final int getType() {
        return 57;
    }
}
