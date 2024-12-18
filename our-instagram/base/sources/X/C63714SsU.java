package X;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.List;

/* renamed from: X.SsU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63714SsU implements InterfaceC65616To7 {
    public final C61592RqG A00;
    public final ROU A01;
    public final Context A02;

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.RqG] */
    public C63714SsU(Context context, ROU rou) {
        ?? obj = new Object();
        try {
            T43.A01(context);
            obj.A00 = T43.A00().A02(T42.A01).CAn(new SOM("proto"), C64203T3s.A00, ROZ.class, "PLAY_BILLING_LIBRARY");
        } catch (Throwable unused) {
            obj.A01 = true;
        }
        this.A00 = obj;
        this.A01 = rou;
        this.A02 = context;
    }

    public final void A00(C60720ROa c60720ROa) {
        int i;
        ContentResolver contentResolver;
        String string;
        if (c60720ROa != null) {
            try {
                ROU rou = this.A01;
                if (rou != null) {
                    try {
                        Context context = this.A02;
                        if (context != null && (contentResolver = context.getContentResolver()) != null && (string = Settings.Secure.getString(contentResolver, "android_id")) != null) {
                            i = SSL.A00().FFY(string).A00();
                        } else {
                            i = 0;
                        }
                        long j = (i % 100) % 100;
                        if (j < 0) {
                            j += 100;
                        }
                        if (((int) j) < 0) {
                            ROP A00 = ROZ.A00();
                            A00.A09(rou);
                            A00.A08(c60720ROa);
                            ROH A002 = ROT.A00();
                            synchronized (Rp7.class) {
                                if (!Rp7.A00) {
                                    Rp7.A00 = true;
                                }
                            }
                            A002.A06();
                            A00.A0A(A002);
                            this.A00.A00((ROZ) A00.A01());
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                AbstractC63398SjT.A0B("BillingLogger", "Unable to log.", th);
            }
        }
    }

    @Override // X.InterfaceC65616To7
    public final void FFj(ROY roy) {
        if (roy != null) {
            try {
                ROP A00 = ROZ.A00();
                ROU rou = this.A01;
                if (rou != null) {
                    A00.A09(rou);
                }
                A00.A06(roy);
                this.A00.A00((ROZ) A00.A01());
            } catch (Throwable th) {
                AbstractC63398SjT.A0B("BillingLogger", "Unable to log.", th);
            }
        }
    }

    @Override // X.InterfaceC65616To7
    public final void FFv(ROV rov) {
        if (rov != null) {
            try {
                ROP A00 = ROZ.A00();
                ROU rou = this.A01;
                if (rou != null) {
                    A00.A09(rou);
                }
                A00.A07(rov);
                this.A00.A00((ROZ) A00.A01());
            } catch (Throwable th) {
                AbstractC63398SjT.A0B("BillingLogger", "Unable to log.", th);
            }
        }
    }

    @Override // X.InterfaceC65616To7
    public final void FGH(List list, int i, boolean z, boolean z2) {
        C60720ROa c60720ROa;
        try {
            AbstractC63227Sfe abstractC63227Sfe = AbstractC63227Sfe.$redex_init_class;
            try {
                ROO A00 = C60720ROa.A00();
                A00.A07(i);
                A00.A06();
                A00.A0B(z2);
                A00.A0A(list);
                c60720ROa = (C60720ROa) A00.A01();
            } catch (Exception e) {
                AbstractC63398SjT.A0B("BillingLogger", "Unable to create logging payload", e);
                c60720ROa = null;
            }
            A00(c60720ROa);
        } catch (Throwable th) {
            AbstractC63398SjT.A0B("BillingLogger", "Unable to log.", th);
        }
    }
}
