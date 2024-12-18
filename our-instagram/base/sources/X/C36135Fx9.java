package X;

import android.text.TextUtils;

/* renamed from: X.Fx9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36135Fx9 implements InterfaceC41501vz {
    public final /* synthetic */ EKE A00;

    public C36135Fx9(EKE eke) {
        this.A00 = eke;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        Integer num;
        int i;
        int A03 = C0f9.A03(-249644485);
        C36049Fvl c36049Fvl = (C36049Fvl) obj;
        int A032 = C0f9.A03(238554300);
        EKE eke = this.A00;
        if (!AbstractC35259Fgt.A00(eke.A09, eke.A0B).equals(c36049Fvl.A02)) {
            i = -247086657;
        } else {
            String str = c36049Fvl.A01;
            if (!TextUtils.isEmpty(str)) {
                num = c36049Fvl.A00;
            } else {
                str = AbstractC31173DnH.A0m(eke);
                num = C05F.A00;
            }
            eke.Eks(str, num);
            i = -1961064093;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(751747426, A03);
    }
}
