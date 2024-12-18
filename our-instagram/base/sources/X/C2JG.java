package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.browser.lite.util.clickid.ClickIDAppender;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2JG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2JG implements InterfaceC13000lm, InterfaceC13060ls {
    public static final long A05 = TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS);
    public final UserSession A00;
    public final C2JH A02 = new C2JH(A05);
    public volatile ClickIDAppender A04 = null;
    public final C2JI A01 = new C2JI(this);
    public final C2JJ A03 = new Object();

    public static synchronized ClickIDAppender A00(C2JG c2jg) {
        ClickIDAppender clickIDAppender;
        String[] strArr;
        String[] strArr2;
        synchronized (c2jg) {
            if (c2jg.A04 == null) {
                AtomicReference atomicReference = c2jg.A01.A02;
                C94934Oy c94934Oy = (C94934Oy) atomicReference.get();
                if (c94934Oy == null) {
                    strArr = null;
                } else {
                    strArr = c94934Oy.A02;
                }
                C94934Oy c94934Oy2 = (C94934Oy) atomicReference.get();
                if (c94934Oy2 != null) {
                    strArr2 = c94934Oy2.A03;
                } else {
                    strArr2 = null;
                }
                if (strArr != null || strArr2 != null) {
                    C4P0 c4p0 = ClickIDAppender.Companion;
                    List asList = Arrays.asList(strArr);
                    List asList2 = Arrays.asList(strArr2);
                    C14360o3.A0B(asList, 1);
                    C14360o3.A0B(asList2, 2);
                    c2jg.A04 = new ClickIDAppender(ClickIDAppender.initHybrid0(asList, asList2));
                }
            }
            clickIDAppender = c2jg.A04;
        }
        return clickIDAppender;
    }

    @Override // X.InterfaceC13060ls
    public final void Cww(AbstractC12990ll abstractC12990ll) {
    }

    public static C2JG A01(final UserSession userSession) {
        return (C2JG) userSession.A01(C2JG.class, new InterfaceC16820sZ() { // from class: X.Pto
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C2JG(UserSession.this);
            }
        });
    }

    public final void A03() {
        final C2JI c2ji = this.A01;
        UserSession userSession = c2ji.A03.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36313566237427837L)) {
            c2ji.A01.set(5);
        } else {
            C2JH c2jh = c2ji.A00;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = c2jh.A00;
            if (j == 0 || elapsedRealtime - j > c2jh.A01) {
                c2jh.A00 = elapsedRealtime;
                c2ji.A01.set(1);
                final C2JL c2jl = new C2JL() { // from class: X.2JK
                    @Override // X.C2JL
                    public final void onFailure(Throwable th) {
                        C2JI c2ji2 = C2JI.this;
                        long j2 = C2JI.A04;
                        c2ji2.A01.set(4);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
                    
                        if (r5.A01.length == 0) goto L6;
                     */
                    @Override // X.C2JL
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r5) {
                        /*
                            r4 = this;
                            X.4Oy r5 = (X.C94934Oy) r5
                            X.2JI r3 = X.C2JI.this
                            long r0 = X.C2JI.A04
                            java.util.concurrent.atomic.AtomicInteger r2 = r3.A01
                            if (r5 == 0) goto L10
                            java.lang.String[] r0 = r5.A01
                            int r1 = r0.length
                            r0 = 2
                            if (r1 != 0) goto L11
                        L10:
                            r0 = 3
                        L11:
                            r2.set(r0)
                            java.util.concurrent.atomic.AtomicReference r0 = r3.A02
                            r0.set(r5)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C2JK.onSuccess(java.lang.Object):void");
                    }
                };
                long A01 = C18U.A01(c06090Tz, userSession, 36612294095935868L);
                C40701ud A012 = AbstractC40691uc.A01(userSession);
                C2JM c2jm = new C2JM();
                C2JM c2jm2 = new C2JM();
                C2JQ c2jq = PandoGraphQLRequest.Companion;
                C1Dk freshCacheAgeMs = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGClickIDConfigQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C2JR.class, false, null, 0, null, "click_id_config", new ArrayList()).setFreshCacheAgeMs(A01 * 1000);
                A012.ATV(new InterfaceC48212Jk() { // from class: X.Ptq
                    @Override // X.InterfaceC48212Jk
                    public final void invoke(Throwable th) {
                        C2JL c2jl2 = C2JL.this;
                        long j2 = C2JI.A04;
                        c2jl2.onFailure(th);
                    }
                }, new InterfaceC48192Ji() { // from class: X.Ptp
                    @Override // X.InterfaceC48192Ji
                    public final void invoke(AnonymousClass436 anonymousClass436) {
                        C94934Oy c94934Oy;
                        Object Bos;
                        C94924Ox c94924Ox;
                        C2JI c2ji2 = c2ji;
                        C2JL c2jl2 = c2jl;
                        if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null) {
                            C2JS c2js = (C2JS) Bos;
                            if (c2js.getOptionalTreeField(0, "click_id_config", C4OJ.class, -261484742) != null) {
                                C2JS optionalTreeField = c2js.getOptionalTreeField(0, "click_id_config", C4OJ.class, -261484742);
                                String[] A1b = AbstractC58319PtB.A1b(optionalTreeField.getRequiredCompactedStringListField(0, "click_ids"), 0);
                                String[] A1b2 = AbstractC58319PtB.A1b(optionalTreeField.getRequiredCompactedStringListField(1, "blocked_domains"), 0);
                                String[] A1b3 = AbstractC58319PtB.A1b(optionalTreeField.getRequiredCompactedStringListField(2, "blocked_urls"), 0);
                                long j2 = C2JG.A05;
                                C2JS optionalTreeField2 = optionalTreeField.getOptionalTreeField(3, "bloom_filter_1pc_disabled", C94814Om.class, -996819204);
                                if (optionalTreeField2 != null && optionalTreeField2.getOptionalStringField(2, "bits") != null) {
                                    c94924Ox = new C94924Ox(optionalTreeField2.getCoercedIntField(0, "num_hashes"), optionalTreeField2.getCoercedIntField(1, "num_bits"), optionalTreeField2.getOptionalStringField(2, "bits"));
                                } else {
                                    c94924Ox = new C94924Ox(0, 0, "");
                                }
                                c94934Oy = new C94934Oy(c94924Ox, A1b, A1b2, A1b3);
                                c2jl2.onSuccess(c94934Oy);
                                C2JG.A00(c2ji2.A03);
                            }
                        }
                        c94934Oy = null;
                        c2jl2.onSuccess(c94934Oy);
                        C2JG.A00(c2ji2.A03);
                    }
                }, freshCacheAgeMs);
            }
        }
        C2JH c2jh2 = this.A02;
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        long j2 = c2jh2.A00;
        if (j2 == 0 || elapsedRealtime2 - j2 > c2jh2.A01) {
            c2jh2.A00 = elapsedRealtime2;
            UserSession userSession2 = this.A00;
            if (C18U.A06(c06090Tz, userSession2, 36313566237362300L)) {
                this.A03.A00(userSession2);
            }
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (AbstractC201688vy.A01(this.A00, C05F.A0Y)) {
            C24231Gs.A00().A02(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2JJ, java.lang.Object] */
    public C2JG(UserSession userSession) {
        this.A00 = userSession;
        C24231Gs.A00().A01(this);
    }

    public final String A02(C2n2 c2n2, String str) {
        C94934Oy c94934Oy;
        String[] strArr;
        int length;
        ClickIDAppender A00 = A00(this);
        if (A00 != null) {
            String fbclid = A00.getFbclid(str);
            if (TextUtils.isEmpty(fbclid) && c2n2 != null) {
                fbclid = (String) c2n2.apply(A00.extractDestDomain(str));
            }
            if (TextUtils.isEmpty(fbclid) && (c94934Oy = (C94934Oy) this.A01.A02.get()) != null && (length = (strArr = c94934Oy.A01).length) > 0) {
                fbclid = strArr[new Random().nextInt(length)];
            }
            if (!TextUtils.isEmpty(fbclid)) {
                if (C18U.A06(C06090Tz.A05, this.A00, 36330239298650879L)) {
                    fbclid = A00.setClickTimestamp(fbclid, System.currentTimeMillis());
                }
                return A00.appendFbclid(str, fbclid);
            }
            return str;
        }
        return str;
    }

    @Override // X.InterfaceC13060ls
    public final void Cwy(AbstractC12990ll abstractC12990ll) {
        A03();
    }
}
