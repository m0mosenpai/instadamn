package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableCollection;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;

/* renamed from: X.Edc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32895Edc extends VKF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C32895Edc(Object obj, Object obj2, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = i;
        this.A03 = obj;
    }

    @Override // X.VKF
    public final void A02() {
        if (this.A00 != 0) {
            super.A02();
        } else {
            C36684GFe.A01((C36684GFe) this.A02);
        }
    }

    @Override // X.VKF
    public final void A03() {
        Integer num;
        Bundle A03;
        int i = this.A00;
        C36684GFe c36684GFe = (C36684GFe) this.A02;
        DirectSearchInboxFragment directSearchInboxFragment = c36684GFe.A0S;
        switch (i) {
            case 0:
                num = C05F.A0u;
                A03 = C28531Zo.A04.A01.A03(c36684GFe.A0M.getResources().getString(2131964437), this.A05, this.A04, null, null, null, null, AbstractC166987dD.A1F((ImmutableCollection) this.A03), null, 37, this.A01);
                break;
            case 1:
                num = C05F.A0j;
                A03 = C28531Zo.A04.A01.A03(c36684GFe.A0M.getResources().getString(2131964443), this.A05, this.A04, ((FRO) this.A03).A03, null, null, null, null, null, 15, this.A01);
                break;
            default:
                num = C05F.A03;
                A03 = C28531Zo.A04.A01.A03(c36684GFe.A0M.getResources().getString(2131964445), this.A05, this.A04, null, ((FRO) this.A03).A04, null, null, null, null, 17, this.A01);
                break;
        }
        directSearchInboxFragment.A04(A03, num);
    }
}
