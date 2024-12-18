package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ghs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37659Ghs extends AbstractC116895Qv implements JIK, C38Y, InterfaceC12060kA {
    public C25514BQc A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public final C37720Giv A05;
    public final UserSession A06;
    public final C37624GhJ A07;

    @Override // X.InterfaceC12060kA
    public final void Cna(String str) {
        C14360o3.A0B(str, 0);
        this.A05.A0E(str);
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        String str;
        String str2;
        C14360o3.A0B(c38971HDz, 0);
        AbstractC115105If abstractC115105If = c38971HDz.A01;
        Throwable A01 = abstractC115105If.A01();
        if (A01 == null || (str = A01.getMessage()) == null) {
            InterfaceC40821up interfaceC40821up = (InterfaceC40821up) abstractC115105If.A00();
            if (interfaceC40821up == null || (str = interfaceC40821up.getErrorMessage()) == null) {
                str = "empty message";
            }
            if (A01 == null) {
                str2 = "empty trace";
                C0K8.A0C("ClipsViewerPerfLogger", AnonymousClass001.A0u("onClipsItemsRequestFailed: ", str, " , ", str2));
                C37720Giv c37720Giv = this.A05;
                c37720Giv.A0J("error_message", str);
                c37720Giv.A0J("error_trace", str2);
                c37720Giv.A0K("is_streaming", c38971HDz.A06);
                c37720Giv.A0G("chunk_index", c38971HDz.A00);
                c37720Giv.A0E("item_request_fail");
                A02(this, C05F.A0C, new D8I(23, c38971HDz, this));
            }
        }
        str2 = C2Ql.A00(A01);
        C0K8.A0C("ClipsViewerPerfLogger", AnonymousClass001.A0u("onClipsItemsRequestFailed: ", str, " , ", str2));
        C37720Giv c37720Giv2 = this.A05;
        c37720Giv2.A0J("error_message", str);
        c37720Giv2.A0J("error_trace", str2);
        c37720Giv2.A0K("is_streaming", c38971HDz.A06);
        c37720Giv2.A0G("chunk_index", c38971HDz.A00);
        c37720Giv2.A0E("item_request_fail");
        A02(this, C05F.A0C, new D8I(23, c38971HDz, this));
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
        C14360o3.A0B(c37752GjR, 0);
        A02(this, C05F.A01, new D8I(24, c37752GjR, this));
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        C14360o3.A0B(c37818GkY, 0);
        A02(this, C05F.A0C, new D8I(25, c37818GkY, this));
    }

    @Override // X.C38Y
    public final void DXR(int i) {
    }

    @Override // X.C38Y
    public final void DXS(int i) {
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
    }

    @Override // X.C38Y
    public final void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final void DY0() {
    }

    @Override // X.C38Y
    public final void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final void DrV() {
    }

    @Override // X.C38Y
    public final void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.JIK
    public final void E0F(int i, String str) {
        C14360o3.A0B(str, 1);
        if (i == 0 && this.A04 == C05F.A01) {
            this.A04 = C05F.A0C;
            C37720Giv c37720Giv = this.A05;
            c37720Giv.A0J("cancel_reason", str);
            c37720Giv.A0E("view_bound_error");
        }
    }

    public static final void A00(C37659Ghs c37659Ghs, Integer num) {
        c37659Ghs.A05.A0J("early_fetch_type", AbstractC37666Ghz.A00(num));
    }

    public static final void A01(C37659Ghs c37659Ghs, Integer num) {
        c37659Ghs.A05.A0J("fetch_type", AbstractC37666Ghz.A00(num));
    }

    private final boolean A03(int i) {
        if (!C18U.A06(C06090Tz.A05, this.A06, 36317418821391514L) || i == 0) {
            return true;
        }
        return false;
    }

    @Override // X.JIK
    public final void DCS(int i) {
        this.A05.A0E("first_frame_rendered");
    }

    @Override // X.JIK
    public final void DZE(int i, String str) {
        String str2;
        C0K8.A0C("ClipsViewerPerfLogger", AnonymousClass001.A05(i, "onPlayerError: ", ", ", str));
        if (A03(i)) {
            if (str == null) {
                str2 = "Missing video player failure reason";
            } else {
                str2 = str;
            }
            C37720Giv c37720Giv = this.A05;
            c37720Giv.A0J(TraceFieldType.FailureReason, str2);
            c37720Giv.A0E(AbstractC111324zv.A00(3293));
            A02(this, C05F.A0Y, new C57259Pbh(str, this, 40));
        }
    }

    @Override // X.C38Y
    public final void Dj0(Integer num) {
        if (this.A07.A01() == 1) {
            C37720Giv c37720Giv = this.A05;
            c37720Giv.A0J("cancel_navigation", "swiped_away");
            c37720Giv.A08();
            C31373Dqd c31373Dqd = c37720Giv.A03.A00;
            if (((AbstractC69603Au) c31373Dqd).A01) {
                c31373Dqd.A08();
            }
            C25514BQc c25514BQc = this.A00;
            if (c25514BQc != null && c25514BQc.A00) {
                C006802i c006802i = c25514BQc.A01;
                c006802i.markerAnnotate(749808675, "cancel_reason", AbstractC167007dF.A0h("ON_SWIPE"));
                c006802i.markerEnd(749808675, (short) 4);
                c25514BQc.A00 = false;
            }
        }
    }

    @Override // X.JIK
    public final void DzM(C120985dq c120985dq, int i) {
        if (this.A02 == C05F.A00) {
            this.A02 = C05F.A0C;
            C37720Giv c37720Giv = this.A05;
            c37720Giv.A0E("video_prepare_start");
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null && c38321qM.Cff()) {
                c37720Giv.A0K("is_probably_cache", C41711wL.A01(this.A06).A0G(c38321qM.CFR().A0G));
            }
        }
    }

    @Override // X.JIK
    public final void DzN(int i, boolean z) {
        if (this.A02 == C05F.A0C) {
            this.A02 = C05F.A0N;
            C37720Giv c37720Giv = this.A05;
            c37720Giv.A0E("video_prepare_end");
            c37720Giv.A0K("is_auto_play_from_prepared", z);
        }
    }

    @Override // X.JIK
    public final void DzU(int i) {
        if (this.A03 == C05F.A00) {
            this.A03 = C05F.A01;
            this.A05.A0E("video_prepare_attempt");
        }
    }

    @Override // X.JIK
    public final void DzV(int i, boolean z) {
        if (this.A03 == C05F.A0C) {
            this.A03 = C05F.A0N;
            C37720Giv c37720Giv = this.A05;
            c37720Giv.A0E("video_prepare_call_end");
            c37720Giv.A0K("is_prepare_success", z);
        }
    }

    @Override // X.JIK
    public final void DzW(int i) {
        if (this.A03 == C05F.A01) {
            this.A03 = C05F.A0C;
            this.A05.A0E("video_prepare_call_start");
        }
    }

    @Override // X.JIK
    public final void E0D(int i) {
        this.A05.A0E("switch_to_warmup");
    }

    @Override // X.JIK
    public final void E0E(int i) {
        if (i == 0 && this.A04 == C05F.A00) {
            this.A04 = C05F.A01;
        }
    }

    @Override // X.JIK
    public final void E0G(int i) {
        if (i == 0 && this.A04 == C05F.A01) {
            this.A04 = C05F.A0N;
            this.A05.A0E("view_bound_to_prepare_success");
        }
    }

    public C37659Ghs(UserSession userSession, InterfaceC60222p5 interfaceC60222p5, C37624GhJ c37624GhJ) {
        this.A06 = userSession;
        this.A07 = c37624GhJ;
        this.A05 = new C37720Giv(userSession, interfaceC60222p5);
        Integer num = C05F.A00;
        this.A01 = num;
        this.A03 = num;
        this.A02 = num;
        this.A04 = num;
    }

    public static final void A02(C37659Ghs c37659Ghs, Integer num, InterfaceC16820sZ interfaceC16820sZ) {
        if (A04(c37659Ghs, num)) {
            c37659Ghs.A01 = num;
            c37659Ghs.A05.A0J("point", AbstractC37665Ghy.A01(num));
            interfaceC16820sZ.invoke();
        }
    }

    public static final boolean A04(C37659Ghs c37659Ghs, Integer num) {
        int A00 = AbstractC37665Ghy.A00(num);
        Integer num2 = c37659Ghs.A01;
        int A002 = AbstractC37665Ghy.A00(num2);
        if (A00 > A002 && A002 + 1 != A00) {
            c37659Ghs.A05.A0J("invalid_next_state", AnonymousClass001.A0u("switching from ", AbstractC37665Ghy.A01(num2), " to ", AbstractC37665Ghy.A01(num)));
            C0w9.A01.EmN("ClipsViewerPerfLogger", AnonymousClass001.A02(AbstractC37665Ghy.A00(c37659Ghs.A01), A00, "switching from ", " to "));
        }
        if (A00 > AbstractC37665Ghy.A00(c37659Ghs.A01)) {
            return true;
        }
        return false;
    }

    @Override // X.JIK
    public final void E02(int i) {
        if (A03(i)) {
            C25514BQc c25514BQc = this.A00;
            if (c25514BQc != null && c25514BQc.A00) {
                C006802i c006802i = c25514BQc.A01;
                c006802i.markerAnnotate(749808675, "stop_reason", AbstractC167007dF.A0h("ON_VIDEO_START"));
                c006802i.markerEnd(749808675, (short) 2);
                c25514BQc.A00 = false;
            }
            A02(this, C05F.A0N, new C29891DGf(this, 43));
        }
    }

    @Override // X.JIK
    public final void E0A(C206199Bc c206199Bc, int i) {
        if (A03(i)) {
            A02(this, C05F.A0Y, new BFI(i, 47, this, c206199Bc));
        }
    }

    @Override // X.JIK
    public final void E0C(int i) {
        Integer num;
        if (A03(i)) {
            C25514BQc c25514BQc = this.A00;
            if (c25514BQc != null && c25514BQc.A00) {
                C006802i c006802i = c25514BQc.A01;
                c006802i.markerAnnotate(749808675, "stop_reason", AbstractC167007dF.A0h("ON_VIDEO_STOP"));
                c006802i.markerEnd(749808675, (short) 2);
                c25514BQc.A00 = false;
            }
            C37720Giv c37720Giv = this.A05;
            C69613Av c69613Av = c37720Giv.A00;
            if (c69613Av != null) {
                num = c69613Av.A00;
            } else {
                num = null;
            }
            if (num == C05F.A01) {
                c37720Giv.A0K("is_video_stopped", false);
            } else {
                A02(this, C05F.A0Y, new C29891DGf(this, 44));
            }
        }
    }
}
