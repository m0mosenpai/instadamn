package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.5ID, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5ID extends C5I3 {
    public int A00;
    public long A01;
    public long A02;
    public C5I5 A03;
    public final int A04;
    public final List A05;
    public final int A06;
    public final Integer A07;
    public final String A08;
    public final String A09;

    @Override // X.C5I4
    public final String AZM() {
        return this.A08;
    }

    @Override // X.C5I4
    public final Integer BKD() {
        return this.A07;
    }

    @Override // X.C5I4
    public final List BVA() {
        return this.A05;
    }

    @Override // X.C5I4
    public final int BgX() {
        return this.A06;
    }

    @Override // X.C5I4
    public final String getId() {
        return this.A09;
    }

    public C5ID(Reel reel, Integer num, String str, List list) {
        int i;
        Integer num2;
        String str2;
        this.A09 = str;
        this.A07 = num;
        this.A05 = list;
        C37881pR c37881pR = reel.A0X;
        this.A08 = (c37881pR == null || (str2 = c37881pR.A02) == null) ? "" : str2;
        this.A06 = reel.A01;
        IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
        if (intentAwareAdsInfo != null && (num2 = intentAwareAdsInfo.A02) != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        this.A04 = i;
        this.A03 = C5I5.A07;
        this.A00 = -1;
        this.A01 = -1L;
        this.A02 = -1L;
    }
}
