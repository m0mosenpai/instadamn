package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1ID, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ID implements InterfaceC12870lZ, InterfaceC13050lr {
    public final LruCache A00 = new LruCache(50);
    public final UserSession A01;

    public static final void A00(final C1ID c1id) {
        final Collection values = c1id.A00.snapshot().values();
        C14120nc.A00().ATO(new AbstractRunnableC14200nk(c1id) { // from class: X.3Wp
            public final /* synthetic */ C1ID A00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(688, 3, false, false);
                this.A00 = c1id;
            }

            @Override // java.lang.Runnable
            public final void run() {
                List<C1IH> A0a = AbstractC001800i.A0a(values);
                try {
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    A0A.A0d();
                    C16V.A03(A0A, "entries");
                    for (C1IH c1ih : A0a) {
                        if (c1ih != null) {
                            A0A.A0d();
                            A0A.A0S("key", c1ih.A02);
                            A0A.A0R("fetchedTimeMs", c1ih.A00);
                            A0A.A0R("rankedTimeMs", c1ih.A01);
                            A0A.A0T("seen", c1ih.A03);
                            A0A.A0a();
                        }
                    }
                    A0A.A0Z();
                    A0A.A0a();
                    A0A.close();
                    String obj = stringWriter.toString();
                    C23031Ai A00 = AbstractC23021Ah.A00(this.A00.A01);
                    A00.A6k.Egi(A00, obj, C23031Ai.A8c[301]);
                } catch (IOException unused) {
                    InterfaceC19610xo ARD = AbstractC23021Ah.A00(this.A00.A01).A01.ARD();
                    ARD.E7K("prefetch_data", null);
                    ARD.apply();
                }
            }
        });
    }

    public final void A01(long j) {
        LruCache lruCache = this.A00;
        C1IH c1ih = (C1IH) lruCache.get("clips_discover_prefetch");
        if (c1ih == null) {
            c1ih = new C1IH();
        }
        c1ih.A02 = "clips_discover_prefetch";
        c1ih.A01 = j;
        lruCache.put("clips_discover_prefetch", c1ih);
    }

    public final void A02(String str, long j) {
        LruCache lruCache = this.A00;
        C1IH c1ih = (C1IH) lruCache.get(str);
        if (c1ih == null) {
            c1ih = new C1IH();
        }
        c1ih.A02 = str;
        c1ih.A00 = j;
        lruCache.put(str, c1ih);
    }

    public final void A03(String str, boolean z) {
        LruCache lruCache = this.A00;
        C1IH c1ih = (C1IH) lruCache.get(str);
        if (c1ih == null) {
            c1ih = new C1IH();
        }
        c1ih.A02 = str;
        c1ih.A03 = z;
        lruCache.put(str, c1ih);
    }

    public C1ID(UserSession userSession) {
        this.A01 = userSession;
        C218914p.A04(EnumC220415e.A02, this, false, false);
        C23031Ai A00 = AbstractC23021Ah.A00(this.A01);
        String str = (String) A00.A6k.CES(A00, C23031Ai.A8c[301]);
        if (str != null) {
            try {
                for (C1IH c1ih : C1IE.parseFromJson(C16V.A00(str)).A00) {
                    this.A00.put(c1ih.A02, c1ih);
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1226131053);
        A00(this);
        C0f9.A0A(-913587297, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-758402253, C0f9.A03(1247909272));
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C218914p.A06(this);
        if (AbstractC201688vy.A01(this.A01, C05F.A1I)) {
            C218914p.A07(this);
        }
        A00(this);
    }
}
