package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;
import java.util.HashMap;

/* renamed from: X.0IO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0IO extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InstagramApplicationForMainProcess A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IO(InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A00 = instagramApplicationForMainProcess;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A00.appContext;
        final C17050sx A01 = AbstractC09440dt.A01(C0IT.A00);
        final C17050sx A012 = AbstractC09440dt.A01(C0IR.A00);
        return new AbstractC211911v(context, A01, A012) { // from class: X.14G
            public final Context A00;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
                synchronized (C14H.A03) {
                    C14H.A01 = A01;
                    C14H.A02 = true;
                }
                synchronized (C14J.A04) {
                    C14J.A02 = A012;
                    C14J.A03 = true;
                }
                C17050sx A013 = AbstractC09440dt.A01(C14L.A00);
                synchronized (C14M.class) {
                    C14M.A02 = A013;
                    C14M.A03 = true;
                }
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "IndependentSingletonInitializer";
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.2UZ] */
            @Override // X.AbstractC211911v
            public final void A07() {
                Context context2 = this.A00;
                C2UY.A01(context2);
                Context applicationContext = context2.getApplicationContext();
                ?? obj = new Object();
                obj.A00 = applicationContext.getApplicationContext();
                C2UZ.A02 = obj;
                C06090Tz c06090Tz = C06090Tz.A05;
                String A04 = C1AD.A04(c06090Tz, 18861121247182917L);
                C08340bw[] A00 = C08340bw.A00(A04);
                C14360o3.A07(A00);
                C08320bu[] c08320buArr = new C08320bu[0];
                HashMap hashMap = new HashMap();
                synchronized (C08310bt.class) {
                    C08310bt.A00 = new C04470Lo(hashMap, c08320buArr, A00);
                    SharedPreferences A002 = C08310bt.A00(context2);
                    if (A002 == null) {
                        android.util.Log.w("DefaultSwitchOffs", "Could not write config to file");
                    } else {
                        A002.edit().putString("last_criteria", "").putString("last_custom_config", A04).putString("last_deeplink_config", "").apply();
                    }
                }
                boolean A06 = C1AD.A06(c06090Tz, 18298171293828271L);
                if (C50552Ua.A01 == null) {
                    C50552Ua c50552Ua = new C50552Ua(A06);
                    C50552Ua.A01 = c50552Ua;
                    AbstractC12860lY.A07(c50552Ua);
                }
            }
        };
    }
}
