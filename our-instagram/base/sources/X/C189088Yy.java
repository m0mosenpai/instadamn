package X;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.8Yy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189088Yy {
    public static final InterfaceC09390do A0K = AbstractC09440dt.A01(C189098Yz.A00);
    public int A00;
    public int A01;
    public EnumC188968Ym A02;
    public C188998Yp A03;
    public WeakReference A04;
    public boolean A05;
    public final Context A06;
    public final ContentObserver A07;
    public final ContentObserver A08;
    public final Handler A09;
    public final boolean A0A;
    public final int A0B;
    public final long A0C;
    public final long A0D;
    public final AbstractC018607g A0E;
    public final InterfaceC189048Yu A0F;
    public final UserSession A0G;
    public final C2AH A0H;
    public final boolean A0I;
    public final boolean A0J;

    public C189088Yy(Context context, AbstractC018607g abstractC018607g, InterfaceC189048Yu interfaceC189048Yu, EnumC188968Ym enumC188968Ym, UserSession userSession, final C2AH c2ah, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(enumC188968Ym, 4);
        this.A0G = userSession;
        this.A06 = context;
        this.A0E = abstractC018607g;
        this.A02 = enumC188968Ym;
        this.A01 = i;
        this.A0B = i2;
        this.A0A = z;
        this.A0J = z2;
        this.A0D = j;
        this.A0C = j2;
        this.A0F = interfaceC189048Yu;
        this.A0I = z3;
        this.A09 = new Handler(Looper.getMainLooper());
        this.A0H = new C8Z0(this, c2ah);
        this.A04 = new WeakReference(null);
        final Runnable runnable = new Runnable() { // from class: X.8Z1
            @Override // java.lang.Runnable
            public final void run() {
                C189088Yy.this.A01(c2ah);
            }
        };
        final Handler handler = this.A09;
        this.A07 = new ContentObserver(handler) { // from class: X.8Z2
            @Override // android.database.ContentObserver
            public final void onChange(boolean z4) {
                Handler handler2 = this.A09;
                handler2.removeCallbacksAndMessages(null);
                handler2.postDelayed(runnable, 300L);
            }
        };
        final Handler handler2 = this.A09;
        this.A08 = new ContentObserver(handler2) { // from class: X.8Z2
            @Override // android.database.ContentObserver
            public final void onChange(boolean z4) {
                Handler handler22 = this.A09;
                handler22.removeCallbacksAndMessages(null);
                handler22.postDelayed(runnable, 300L);
            }
        };
    }

    public static final void A00(C189088Yy c189088Yy) {
        if (c189088Yy.A05) {
            c189088Yy.A05 = false;
            try {
                c189088Yy.A06.getContentResolver().unregisterContentObserver(c189088Yy.A07);
            } catch (IllegalStateException e) {
                C0K8.A05(C189088Yy.class, "Photo ContentObserver not registered", e);
            }
            try {
                c189088Yy.A06.getContentResolver().unregisterContentObserver(c189088Yy.A08);
            } catch (IllegalStateException e2) {
                C0K8.A05(C189088Yy.class, "Video ContentObserver not registered", e2);
            }
        }
    }

    public final void A01(C2AH c2ah) {
        C2AH c2ah2 = c2ah;
        UserSession userSession = this.A0G;
        Context context = this.A06;
        EnumC188968Ym enumC188968Ym = this.A02;
        int i = this.A01;
        int i2 = this.A0B;
        boolean z = this.A0J;
        long j = this.A0D;
        long j2 = this.A0C;
        C188998Yp c188998Yp = this.A03;
        C8Z6 c8z6 = new C8Z6(context, this.A0F, enumC188968Ym, userSession, c188998Yp, i, i2, this.A00, j, j2, z, this.A0I);
        Object obj = this.A04.get();
        if (obj != null && obj.equals(c8z6)) {
            return;
        }
        this.A04 = new WeakReference(c8z6);
        C121275eQ c121275eQ = new C121275eQ(c8z6, 452);
        if (c2ah == null) {
            c2ah2 = this.A0H;
        }
        c121275eQ.A00 = new C8Z0(this, c2ah2);
        AbstractC018607g abstractC018607g = this.A0E;
        if (abstractC018607g != null) {
            C1GJ.A00(context, abstractC018607g, c121275eQ);
        }
        if (!this.A0A) {
            return;
        }
        ((C18240vB) A0K.getValue()).ATO(new C8Z7(this));
    }
}
