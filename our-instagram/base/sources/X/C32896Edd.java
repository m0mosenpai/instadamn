package X;

import android.content.res.Resources;
import android.os.Bundle;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;

/* renamed from: X.Edd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32896Edd extends VKF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public C32896Edd(C36684GFe c36684GFe, FRO fro, Integer num, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = c36684GFe;
        this.A03 = num;
        this.A06 = str;
        this.A05 = str2;
        this.A01 = i;
        this.A04 = fro;
    }

    @Override // X.VKF
    public final void A02() {
        if (1 - this.A00 != 0) {
            super.A02();
        } else {
            C36684GFe.A01((C36684GFe) this.A02);
        }
    }

    @Override // X.VKF
    public final void A03() {
        Bundle A03;
        int i = this.A00;
        C36684GFe c36684GFe = (C36684GFe) this.A02;
        DirectSearchInboxFragment directSearchInboxFragment = c36684GFe.A0S;
        Integer num = (Integer) this.A03;
        C28511Zm c28511Zm = C28531Zo.A04.A01;
        Resources resources = c36684GFe.A0M.getResources();
        if (i != 0) {
            A03 = c28511Zm.A03(resources.getString(2131964437), this.A06, this.A05, null, null, null, null, ((FRO) this.A04).A02, null, 37, this.A01);
        } else {
            A03 = c28511Zm.A03(resources.getString(2131964438), this.A06, this.A05, null, null, null, ((FRO) this.A04).A05, null, null, 22, this.A01);
        }
        directSearchInboxFragment.A04(A03, num);
    }
}
