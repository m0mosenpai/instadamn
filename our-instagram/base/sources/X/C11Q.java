package X;

import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.11Q, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11Q implements C11R {
    public static boolean A06;
    public static final HashSet A07 = AbstractC16830sb.A05("onNewData", "onComplete", "onFailed", "onRequestFinished");
    public final C24531Hw A00;
    public final InterfaceC24551Hy A01;
    public final InterfaceC24551Hy A02;
    public final C1IJ A03;
    public final List A04;
    public final boolean A05;

    public C11Q(InterfaceC24551Hy interfaceC24551Hy, C24531Hw c24531Hw, boolean z) {
        C14360o3.A0B(c24531Hw, 1);
        this.A00 = c24531Hw;
        this.A02 = interfaceC24551Hy;
        this.A05 = z;
        this.A04 = new ArrayList();
        this.A03 = new C1IJ(new ReentrantLock(true));
        InterfaceC24551Hy interfaceC24551Hy2 = new InterfaceC24551Hy() { // from class: X.1IL
            @Override // X.InterfaceC24551Hy
            public final void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                C14360o3.A0B(interfaceC26451Qa, 0);
                C14360o3.A0B(c3jx, 1);
                C11Q.A02(C11Q.this, "onComplete", AbstractC16960so.A1Q(interfaceC26451Qa, c3jx));
            }

            @Override // X.InterfaceC24551Hy
            public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
                C14360o3.A0B(interfaceC26451Qa, 0);
                C14360o3.A0B(abstractC115105If, 1);
                C11Q.A02(C11Q.this, "onFailed", AbstractC16960so.A1Q(interfaceC26451Qa, abstractC115105If));
            }

            @Override // X.InterfaceC24551Hy
            public final void DFs(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
                C14360o3.A0B(interfaceC26451Qa, 0);
                C14360o3.A0B(abstractC115105If, 1);
                C11Q.A02(C11Q.this, "onFailedInBackground", AbstractC16960so.A1Q(interfaceC26451Qa, abstractC115105If));
            }

            @Override // X.InterfaceC24551Hy
            public final void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                C14360o3.A0B(interfaceC26451Qa, 0);
                C14360o3.A0B(c3jx, 1);
                C14360o3.A0B(interfaceC40801un, 2);
                C11Q.A02(C11Q.this, "onNewData", AbstractC16960so.A1Q(interfaceC26451Qa, c3jx, interfaceC40801un));
            }

            @Override // X.InterfaceC24551Hy
            public final void DVR() {
            }

            @Override // X.InterfaceC24551Hy
            public final void DVS(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                C14360o3.A0B(interfaceC26451Qa, 0);
                C14360o3.A0B(c3jx, 1);
                C14360o3.A0B(interfaceC40801un, 2);
                C11Q.A02(C11Q.this, "onNewDataInBackground", AbstractC16960so.A1Q(interfaceC26451Qa, c3jx, interfaceC40801un));
            }

            @Override // X.InterfaceC24551Hy
            public final void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                C14360o3.A0B(interfaceC26451Qa, 0);
                C14360o3.A0B(c3jx, 1);
                C11Q.A02(C11Q.this, "onResponseStarted", AbstractC16960so.A1Q(interfaceC26451Qa, c3jx));
            }

            @Override // X.InterfaceC24551Hy
            public final void Dg4() {
                C11Q.A02(C11Q.this, "onRequestFinished", C16930sl.A00);
            }

            @Override // X.InterfaceC24551Hy
            public final void DgK() {
                C11Q.A02(C11Q.this, "onRequestStarted", C16930sl.A00);
            }
        };
        this.A01 = interfaceC24551Hy2;
        if (A06) {
            c24531Hw.A02(interfaceC24551Hy2);
            if (interfaceC24551Hy != null) {
                c24531Hw.A02(interfaceC24551Hy);
                return;
            }
            return;
        }
        A04(interfaceC24551Hy2, getName());
        if (interfaceC24551Hy == null) {
            return;
        }
        A04(interfaceC24551Hy, getName());
    }

    public static final void A01(final C11Q c11q, final C1IK c1ik, final InterfaceC24551Hy interfaceC24551Hy, final String str, final InterfaceC16820sZ interfaceC16820sZ, final int i) {
        final C09530e4 c09530e4;
        InterfaceC16660sJ interfaceC16660sJ;
        try {
            c1ik.lock();
            List list = c11q.A04;
            if (i < list.size()) {
                c09530e4 = (C09530e4) list.get(i);
            } else {
                c11q.A00.A02(interfaceC24551Hy);
                c09530e4 = null;
            }
            if (c09530e4 == null) {
                interfaceC16820sZ.invoke();
                return;
            }
            Object obj = c09530e4.A00;
            if (!C14360o3.A0K(obj, "onNewDataInBackground") && !C14360o3.A0K(obj, "onFailedInBackground")) {
                interfaceC16660sJ = (InterfaceC16660sJ) A00();
            } else {
                interfaceC16660sJ = C74553Wn.A00;
            }
            interfaceC16660sJ.invoke(new Runnable() { // from class: X.2sa
                @Override // java.lang.Runnable
                public final void run() {
                    Integer num;
                    try {
                        C11Q c11q2 = C11Q.this;
                        String str2 = str;
                        InterfaceC24551Hy interfaceC24551Hy2 = interfaceC24551Hy;
                        C09530e4 c09530e42 = c09530e4;
                        String str3 = (String) c09530e42.A00;
                        List list2 = (List) c09530e42.A01;
                        if (C11Q.A07.contains(str3)) {
                            num = Integer.valueOf(C2UD.A00(interfaceC24551Hy2.getClass(), str2, AnonymousClass001.A0R("ReplayableStreamingHttpRequestTask.", str3)));
                        } else {
                            num = null;
                        }
                        String A0u = AnonymousClass001.A0u("replaying ", str3, " for ", c11q2.A00.A04);
                        if (Systrace.A0E(1L)) {
                            C0fO.A01(A0u, -1188474883);
                        }
                        try {
                            if (C14360o3.A0K(str3, "onRequestStarted")) {
                                interfaceC24551Hy2.DgK();
                            } else if (C14360o3.A0K(str3, "onResponseStarted")) {
                                Object obj2 = list2.get(0);
                                C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.common.api.base.StreamingHttpRequestAction");
                                Object obj3 = list2.get(1);
                                C14360o3.A0C(obj3, "null cannot be cast to non-null type com.instagram.common.api.base.StreamingHttpService.StreamingHttpResponse");
                                interfaceC24551Hy2.Dgo((InterfaceC26451Qa) obj2, (C3JX) obj3);
                            } else if (C14360o3.A0K(str3, "onNewDataInBackground")) {
                                Object obj4 = list2.get(0);
                                C14360o3.A0C(obj4, "null cannot be cast to non-null type com.instagram.common.api.base.StreamingHttpRequestAction");
                                Object obj5 = list2.get(1);
                                C14360o3.A0C(obj5, "null cannot be cast to non-null type com.instagram.common.api.base.StreamingHttpService.StreamingHttpResponse");
                                Object obj6 = list2.get(2);
                                C14360o3.A0C(obj6, "null cannot be cast to non-null type ResponseType of com.instagram.common.api.base.ReplayableStreamingHttpRequestTask.replaySingleCallback$lambda$4");
                                interfaceC24551Hy2.DVS((InterfaceC40801un) obj6, (InterfaceC26451Qa) obj4, (C3JX) obj5);
                            } else if (C14360o3.A0K(str3, "onNewData")) {
                                Object obj7 = list2.get(0);
                                C14360o3.A0C(obj7, "null cannot be cast to non-null type com.instagram.common.api.base.StreamingHttpRequestAction");
                                Object obj8 = list2.get(1);
                                C14360o3.A0C(obj8, "null cannot be cast to non-null type com.instagram.common.api.base.StreamingHttpService.StreamingHttpResponse");
                                Object obj9 = list2.get(2);
                                C14360o3.A0C(obj9, "null cannot be cast to non-null type ResponseType of com.instagram.common.api.base.ReplayableStreamingHttpRequestTask.replaySingleCallback$lambda$4");
                                interfaceC24551Hy2.DVQ((InterfaceC40801un) obj9, (InterfaceC26451Qa) obj7, (C3JX) obj8);
                            } else if (C14360o3.A0K(str3, "onComplete")) {
                                Object obj10 = list2.get(0);
                                C14360o3.A0C(obj10, "null cannot be cast to non-null type com.instagram.common.api.base.StreamingHttpRequestAction");
                                Object obj11 = list2.get(1);
                                C14360o3.A0C(obj11, "null cannot be cast to non-null type com.instagram.common.api.base.StreamingHttpService.StreamingHttpResponse");
                                interfaceC24551Hy2.D6Z((InterfaceC26451Qa) obj10, (C3JX) obj11);
                            } else if (C14360o3.A0K(str3, "onFailedInBackground")) {
                                Object obj12 = list2.get(0);
                                C14360o3.A0C(obj12, "null cannot be cast to non-null type com.instagram.common.api.base.StreamingHttpRequestAction");
                                Object obj13 = list2.get(1);
                                C14360o3.A0C(obj13, "null cannot be cast to non-null type com.instagram.common.api.base.ApiError<ResponseType of com.instagram.common.api.base.ReplayableStreamingHttpRequestTask.replaySingleCallback$lambda$4>");
                                interfaceC24551Hy2.DFs((AbstractC115105If) obj13, (InterfaceC26451Qa) obj12);
                            } else if (C14360o3.A0K(str3, "onFailed")) {
                                Object obj14 = list2.get(0);
                                C14360o3.A0C(obj14, "null cannot be cast to non-null type com.instagram.common.api.base.StreamingHttpRequestAction");
                                Object obj15 = list2.get(1);
                                C14360o3.A0C(obj15, "null cannot be cast to non-null type com.instagram.common.api.base.ApiError<ResponseType of com.instagram.common.api.base.ReplayableStreamingHttpRequestTask.replaySingleCallback$lambda$4>");
                                interfaceC24551Hy2.DFq((AbstractC115105If) obj15, (InterfaceC26451Qa) obj14);
                            } else if (C14360o3.A0K(str3, "onRequestFinished")) {
                                interfaceC24551Hy2.Dg4();
                            } else {
                                throw new IllegalArgumentException(AnonymousClass001.A0R(str3, " does not refer to a known callback method"));
                            }
                            if (num != null) {
                                C2UD.A00.ASS(num.intValue());
                            }
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(194997158);
                            }
                            C11Q.A01(c11q2, c1ik, interfaceC24551Hy2, str2, interfaceC16820sZ, i + 1);
                        } catch (Throwable th) {
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(1555202795);
                            }
                            throw th;
                        }
                    } catch (Exception e) {
                        interfaceC16820sZ.invoke();
                        throw e;
                    }
                }
            });
        } finally {
            c1ik.unlock();
        }
    }

    public final void A03(final C62362sb c62362sb, final InterfaceC24551Hy interfaceC24551Hy, final String str) {
        Object obj;
        Object obj2;
        C14360o3.A0B(str, 2);
        if (!this.A05) {
            obj = this.A03;
            obj2 = new Object();
        } else {
            obj = new Object();
            obj2 = this.A03;
        }
        final C1IK c1ik = (C1IK) obj;
        final C1IK c1ik2 = (C1IK) obj2;
        if (c62362sb != null && C14360o3.A0K(c62362sb.A00, "main_feed")) {
            C226418s A01 = C226218q.A01(AbstractC12960li.A00);
            A01.A0P(A01.A02, "FEED_REQUEST_REPLAY_THREAD_SWITCH_START");
        }
        ((InterfaceC16660sJ) A00()).invoke(new Runnable() { // from class: X.2sZ
            @Override // java.lang.Runnable
            public final void run() {
                C62362sb c62362sb2 = C62362sb.this;
                if (c62362sb2 != null && C14360o3.A0K(c62362sb2.A00, "main_feed")) {
                    C226418s A012 = C226218q.A01(AbstractC12960li.A00);
                    A012.A0P(A012.A02, "FEED_REQUEST_REPLAY_THREAD_SWITCH_END");
                }
                C1IK c1ik3 = c1ik;
                c1ik3.lock();
                C11Q c11q = this;
                C9FP c9fp = new C9FP(16, c62362sb2, c11q, c1ik3);
                if (c62362sb2 != null && C14360o3.A0K(c62362sb2.A00, "main_feed")) {
                    C226418s A013 = C226218q.A01(AbstractC12960li.A00);
                    A013.A0P(A013.A02, "FEED_REQUEST_ON_REPLAY_METHOD_START");
                }
                C11Q.A01(c11q, c1ik2, interfaceC24551Hy, str, c9fp, 0);
            }
        });
    }

    public final void A04(InterfaceC24551Hy interfaceC24551Hy, String str) {
        C14360o3.A0B(str, 1);
        A03(null, interfaceC24551Hy, str);
    }

    public static final C0YS A00() {
        return new C62332sY(C11T.A01);
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return this.A00.A03;
    }

    @Override // X.C11R
    public final void onCancel() {
        this.A00.onCancel();
    }

    @Override // X.C11R
    public final void onFinish() {
        this.A00.onFinish();
    }

    @Override // X.C11R
    public final void onStart() {
        this.A00.onStart();
    }

    @Override // X.C11R
    public final void run() {
        this.A00.run();
    }

    public static final void A02(C11Q c11q, String str, List list) {
        String A0u = AnonymousClass001.A0u("recordMethod ", str, " for ", c11q.A00.A04);
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0u, 273850910);
        }
        try {
            C1IJ c1ij = c11q.A03;
            c1ij.lock();
            try {
                c11q.getName();
                c11q.A04.add(new C09530e4(str, list));
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1601624270);
                }
            } finally {
                c1ij.unlock();
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1836675465);
            }
            throw th;
        }
    }

    @Override // X.C11R
    public final String getName() {
        return AnonymousClass001.A0R("replayable ", this.A00.getName());
    }
}
