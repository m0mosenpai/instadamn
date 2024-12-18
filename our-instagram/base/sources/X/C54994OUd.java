package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import com.instagram.user.model.FollowStatus;

/* renamed from: X.OUd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54994OUd {
    public int A00;
    public long A01;
    public ImageUrl A02;
    public FollowStatus A03;
    public Integer A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final InterfaceC09390do A0I;

    public C54994OUd(MsysPendingRecipient msysPendingRecipient) {
        long j;
        int i;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        FollowStatus followStatus;
        ImageUrl imageUrl;
        String str2;
        String str3;
        String str4;
        String str5;
        this.A07 = (msysPendingRecipient == null || (str5 = msysPendingRecipient.A07) == null) ? "" : str5;
        if (msysPendingRecipient != null) {
            j = msysPendingRecipient.A01;
        } else {
            j = 0;
        }
        this.A01 = j;
        if (msysPendingRecipient != null) {
            i = msysPendingRecipient.A00;
        } else {
            i = 0;
        }
        this.A00 = i;
        this.A09 = (msysPendingRecipient == null || (str4 = msysPendingRecipient.A09) == null) ? "" : str4;
        this.A05 = (msysPendingRecipient == null || (str3 = msysPendingRecipient.A05) == null) ? "" : str3;
        if (msysPendingRecipient != null) {
            str = msysPendingRecipient.A08;
        } else {
            str = null;
        }
        this.A08 = str;
        this.A06 = (msysPendingRecipient == null || (str2 = msysPendingRecipient.A06) == null) ? "" : str2;
        this.A02 = (msysPendingRecipient == null || (imageUrl = msysPendingRecipient.A02) == null) ? AbstractC25225BEi.A0t("") : imageUrl;
        this.A03 = (msysPendingRecipient == null || (followStatus = msysPendingRecipient.A03) == null) ? FollowStatus.A08 : followStatus;
        if (msysPendingRecipient != null) {
            z = msysPendingRecipient.A0H;
        } else {
            z = false;
        }
        this.A0H = z;
        if (msysPendingRecipient != null) {
            z2 = msysPendingRecipient.A0B;
        } else {
            z2 = false;
        }
        this.A0B = z2;
        if (msysPendingRecipient != null) {
            z3 = msysPendingRecipient.A0G;
        } else {
            z3 = false;
        }
        this.A0G = z3;
        if (msysPendingRecipient != null) {
            z4 = msysPendingRecipient.A0A;
        } else {
            z4 = false;
        }
        this.A0A = z4;
        if (msysPendingRecipient != null) {
            z5 = msysPendingRecipient.A0F;
        } else {
            z5 = false;
        }
        this.A0F = z5;
        if (msysPendingRecipient != null) {
            z6 = msysPendingRecipient.A0C;
        } else {
            z6 = false;
        }
        this.A0C = z6;
        this.A04 = msysPendingRecipient != null ? msysPendingRecipient.A04 : null;
        if (msysPendingRecipient != null) {
            z7 = msysPendingRecipient.A0D;
        } else {
            z7 = false;
        }
        this.A0D = z7;
        this.A0E = msysPendingRecipient != null ? msysPendingRecipient.A0E : false;
        this.A0I = AbstractC09440dt.A01(new C57526Pg0(this, 1));
    }

    public C54994OUd() {
        this(null);
    }
}
