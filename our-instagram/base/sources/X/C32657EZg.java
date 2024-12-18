package X;

import java.io.IOException;

/* renamed from: X.EZg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32657EZg extends AbstractRunnableC14200nk {
    public final /* synthetic */ EnumC33353Eom A00;
    public final /* synthetic */ C35272Fh7 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32657EZg(EnumC33353Eom enumC33353Eom, C35272Fh7 c35272Fh7) {
        super(702);
        this.A01 = c35272Fh7;
        this.A00 = enumC33353Eom;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC33388EpL enumC33388EpL;
        C35272Fh7 c35272Fh7 = this.A01;
        C34937FaN c34937FaN = c35272Fh7.A08;
        String str = c35272Fh7.A04.userId;
        C1FE A00 = C34937FaN.A00(c34937FaN);
        C14360o3.A0A(A00);
        InterfaceC19610xo ARD = A00.ARD();
        try {
            String string = A00.getString(str, null);
            if (string != null) {
                String str2 = AbstractC33670EuK.parseFromJson(C16V.A00(string)).A04;
                EnumC33388EpL[] values = EnumC33388EpL.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        enumC33388EpL = values[i];
                        if (C14360o3.A0K(enumC33388EpL.A00, str2)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        enumC33388EpL = EnumC33388EpL.A05;
                        break;
                    }
                }
                if (enumC33388EpL == EnumC33388EpL.A03) {
                    ARD.EEj("AccountCachingHelper.FACEBOOK_USER_ID");
                }
            }
        } catch (IOException e) {
            C0w9.A07("ExternalAccountCachingHelper_deserialize_account_error", e);
        }
        ARD.EEj(str);
        ARD.apply();
        C35272Fh7.A03(this.A00, c35272Fh7);
    }
}
