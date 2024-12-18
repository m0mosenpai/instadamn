package X;

import android.os.Handler;

/* renamed from: X.P4k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56449P4k implements MQC {
    public boolean A00;
    public final /* synthetic */ N5Z A01;

    public C56449P4k(N5Z n5z) {
        this.A01 = n5z;
    }

    @Override // X.MQC
    public final void DYD(EnumC172127lh enumC172127lh) {
        N5Z n5z = this.A01;
        EnumC172127lh enumC172127lh2 = EnumC172127lh.A05;
        N5Z.A0C(n5z, AbstractC25229BEm.A1a(enumC172127lh, enumC172127lh2));
        if (enumC172127lh != enumC172127lh2) {
            Handler handler = n5z.A0c;
            handler.removeMessages(1);
            if (!this.A00 && enumC172127lh == EnumC172127lh.A04) {
                C1VW c1vw = C1VW.A00;
                if (c1vw != null && c1vw.shouldUseDevicePermissionKit(n5z.A0B, N5Z.A01(n5z)) && c1vw.shouldUseNewNativeReconsiderDialog(n5z.A0B)) {
                    return;
                }
                String A0o = AbstractC166997dE.A0o();
                C193328hC A0O = AbstractC31175DnJ.A0O(n5z);
                A0O.A0r(AbstractC166997dE.A0r(AbstractC166997dE.A0N(n5z), AbstractC166997dE.A0N(n5z).getString(2131965675), 2131975122));
                A0O.A0s(false);
                A0O.A0J(new DialogInterfaceOnClickListenerC55277Ofs(A0o, this, 1), 2131975120);
                A0O.A0D(new DialogInterfaceOnClickListenerC55277Ofs(A0o, this, 2));
                DialogInterfaceOnDismissListenerC55324Ogm.A00(A0O, this, 9);
                n5z.A01 = A0O.A02();
                C4I7 c4i7 = n5z.A0H;
                AbstractC68641VYw.A00.A03(n5z.A0B, c4i7, N5Z.A01(n5z).name(), A0o);
                C0fJ.A00(n5z.A01);
                return;
            }
            handler.sendEmptyMessage(1);
        }
    }

    @Override // X.MQC
    public final boolean EjC() {
        this.A00 = AbstractC114515Ew.A06(this.A01.requireActivity(), AbstractC43591JPw.A00(5));
        return true;
    }
}
