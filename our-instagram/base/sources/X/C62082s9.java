package X;

import android.content.Context;
import com.instagram.api.schemas.ClipsPrefetchTriggerType;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2s9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62082s9 extends AbstractC62022s3 {
    public final Context A00;
    public final UserSession A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    @Override // X.AbstractC62022s3, X.InterfaceC62002s1
    public final void DgP(C1I1 c1i1, C74283Vj c74283Vj) {
        boolean z;
        C3XD c3xd;
        C14360o3.A0B(c74283Vj, 1);
        try {
            C3XB c3xb = c74283Vj.A07;
            if (c3xb == null) {
                c3xb = C3XB.A02;
            }
            c3xd = c3xb.A00;
        } catch (IllegalStateException unused) {
            z = true;
        }
        if (c3xd != null) {
            z = c3xd.A00;
            C77453dV.A00 = z;
            UserSession userSession = this.A01;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36328057458343019L)) {
                if (C18U.A06(c06090Tz, userSession, 36328057458408556L) && !this.A02.compareAndSet(false, true)) {
                    return;
                }
                boolean A06 = C18U.A06(c06090Tz, userSession, 36328057458801778L);
                boolean A062 = C18U.A06(c06090Tz, userSession, 36328057458736241L);
                if (A06) {
                    AbstractC24641Ih.A02.EpA(new AbstractC18280vF() { // from class: X.54h
                        {
                            super("maybePrefetchVideoTabFeed", 678, 2, false, false);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C62082s9 c62082s9 = C62082s9.this;
                            C77453dV.A05.A09(c62082s9.A01, c62082s9.A00, ClipsPrefetchTriggerType.A05.A00);
                        }
                    });
                    return;
                } else {
                    if (A062) {
                        AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.4iw
                            {
                                super("maybePrefetchVideoTabFeed", 678, 2, false, false);
                            }

                            @Override // X.AbstractC18280vF
                            public final void loggedRun() {
                                C62082s9 c62082s9 = C62082s9.this;
                                C77453dV.A05.A09(c62082s9.A01, c62082s9.A00, ClipsPrefetchTriggerType.A05.A00);
                            }
                        });
                        return;
                    }
                    C77453dV.A05.A09(userSession, this.A00, ClipsPrefetchTriggerType.A05.A00);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("clips config is not available");
    }

    public C62082s9(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
