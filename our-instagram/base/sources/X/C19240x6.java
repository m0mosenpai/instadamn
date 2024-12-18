package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0x6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19240x6 implements InterfaceC13060ls, InterfaceC26531Qi {
    public long A00;
    public final long A01;
    public final C11860jl A02;
    public final InterfaceC19630xq A03;
    public final AtomicBoolean A04;
    public final Context A05;
    public final InterfaceC11370iv A06;
    public final String A07;
    public final ExecutorService A08;

    public C19240x6(Context context, InterfaceC11370iv interfaceC11370iv, String str, long j) {
        C14360o3.A0B(context, 1);
        this.A05 = context;
        this.A06 = interfaceC11370iv;
        this.A07 = str;
        this.A01 = j * 1000;
        SharedPreferences sharedPreferences = context.getSharedPreferences("analyticsprefs", 0);
        C14360o3.A07(sharedPreferences);
        this.A03 = new C17320tT(sharedPreferences, "InstagramPhoneIdUpdater");
        this.A08 = new C14140ne(447668843, 5, false, false);
        this.A04 = new AtomicBoolean(false);
        this.A02 = new C11860jl(context);
    }

    public final void A02(InterfaceC65348TiV interfaceC65348TiV, AbstractC12990ll abstractC12990ll) {
        long j;
        if (this.A04.compareAndSet(false, true)) {
            InterfaceC19630xq interfaceC19630xq = this.A03;
            long j2 = interfaceC19630xq.getLong("analytics_phoneid_last_sync_timestamp", 0L);
            final long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - j2;
            if (interfaceC19630xq.getBoolean("analytics_is_phoneid_fully_synced", true)) {
                j = 604800000;
            } else {
                j = this.A01;
            }
            if (j3 >= j || currentTimeMillis < j2) {
                C19T c19t = C19T.A16;
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                C11880jn c11880jn = (C11880jn) abstractC12990ll.A01(C11880jn.class, new AnonymousClass033(1, context, c19t, abstractC12990ll));
                Context context2 = this.A05;
                java.util.Set set = C11900jp.A05;
                final C63000SaO c63000SaO = new C63000SaO(context2, this, interfaceC65348TiV, c11880jn, c11880jn, new C11900jp(context2, AbstractC11060iN.A00(abstractC12990ll)));
                this.A08.execute(new Runnable() { // from class: X.0jt
                    @Override // java.lang.Runnable
                    public final void run() {
                        C63000SaO.this.A03();
                        C19240x6 c19240x6 = this;
                        c19240x6.A00 = SystemClock.elapsedRealtime();
                        InterfaceC19610xo ARD = c19240x6.A03.ARD();
                        ARD.E7G("analytics_phoneid_last_sync_timestamp", currentTimeMillis);
                        ARD.E77("analytics_is_phoneid_fully_synced", true);
                        ARD.apply();
                        c19240x6.A04.set(false);
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC13060ls
    public final void Cww(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        A00(this, abstractC12990ll);
        C19T c19t = C19T.A16;
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        C19U A00 = ((C11880jn) abstractC12990ll.A01(C11880jn.class, new AnonymousClass033(1, context, c19t, abstractC12990ll))).A00();
        if (A00 != null) {
            C14120nc.A00().ATO(new C0x8(this.A02, abstractC12990ll, A00.A01));
        }
    }

    @Override // X.InterfaceC13060ls
    public final void Cwy(AbstractC12990ll abstractC12990ll) {
    }

    public static /* synthetic */ void A00(final C19240x6 c19240x6, final AbstractC12990ll abstractC12990ll) {
        c19240x6.A02(new InterfaceC65348TiV() { // from class: X.0js
            @Override // X.InterfaceC65348TiV
            public final void DxE(C19U c19u, C19U c19u2, Integer num, String str) {
                C14360o3.A0B(c19u2, 1);
                C14360o3.A0B(str, 2);
                C19240x6.this.A01(c19u, c19u2, abstractC12990ll, str);
            }
        }, abstractC12990ll);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.1vw, java.lang.Object] */
    public final void A01(C19U c19u, C19U c19u2, AbstractC12990ll abstractC12990ll, String str) {
        C11860jl c11860jl = this.A02;
        String str2 = c19u2.A01;
        C14120nc.A00().ATO(new C0x8(c11860jl, abstractC12990ll, str2));
        "phoneid_update".getClass();
        C19280xC A01 = C19280xC.A01("phoneid_update", null);
        A01.A0C("new_id", str2);
        A01.A0B("new_ts", Long.valueOf(c19u2.A00));
        A01.A0B("ts", Long.valueOf(SystemClock.elapsedRealtime() - this.A00));
        A01.A0C("src_pkg", str);
        A01.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "global_sync");
        A01.A0C("custom_uuid", C16030qx.A02.A04(AbstractC12290kX.A00));
        A01.A0C("waterfall_id", this.A07);
        if (c19u != null) {
            A01.A0C("old_id", c19u.A01);
            A01.A0B("old_ts", Long.valueOf(c19u.A00));
        }
        AbstractC11060iN.A00(abstractC12990ll).EHW(A01);
        C41451vu.A01.E4s(new Object());
    }
}
