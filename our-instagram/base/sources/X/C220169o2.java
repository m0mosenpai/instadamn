package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.direct.request.DirectThreadApi;
import java.util.List;

/* renamed from: X.9o2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220169o2 extends AbstractC1344165n {
    public final List A00;
    public final /* synthetic */ C4KR A01;

    @Override // X.AbstractC1344165n
    public final void A08(boolean z) {
        C4KR c4kr = this.A01;
        C4KW c4kw = c4kr.A06;
        String str = this.A05;
        if (z) {
            c4kw.A00(str, null);
        } else {
            c4kw.A01(str, null);
        }
        c4kr.A08.A0D(this.A03, Boolean.valueOf(z), true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C220169o2(C4KR c4kr, Long l, List list) {
        super(c4kr, l);
        this.A01 = c4kr;
        this.A00 = AbstractC001800i.A0Z(list);
    }

    @Override // X.AbstractC1344165n
    public final void A01() {
        C4KR c4kr = this.A01;
        C4KV c4kv = c4kr.A08;
        UserSession userSession = c4kr.A04;
        Long l = this.A04;
        boolean A00 = c4kr.A05.A00();
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 2342161871149931194L);
        this.A03 = c4kv.A0E(userSession, ThreadFetchReason.EAGER_THREAD_RESOLUTION, l, null, AbstractC111324zv.A00(2855), "EagerThreadResolutionSnapshotHttpRequest", this.A05, A00, A06, false);
        C1ON A0C = DirectThreadApi.A0C(userSession, AbstractC68470VSb.A00(), null, this.A00);
        A0C.A00 = this;
        this.A02 = A0C;
    }

    @Override // X.AbstractC1344165n
    public final void A02() {
        C4KR c4kr = this.A01;
        c4kr.A06.A00(this.A05, null);
        c4kr.A08.A0D(this.A03, null, false);
        A03();
    }

    @Override // X.AbstractC1344165n
    public final void A04() {
        C43707JUs c43707JUs;
        C83403nh BLX;
        Long l;
        C18950wb c18950wb;
        String str;
        AbstractC115105If abstractC115105If = super.A01;
        if (abstractC115105If != null && (c43707JUs = (C43707JUs) abstractC115105If.A00()) != null) {
            if (c43707JUs.isOk()) {
                if (c43707JUs.A0a == null) {
                    AbstractC166987dD.A1T(C18950wb.A01, AnonymousClass001.A05(c43707JUs.A0I, "Create_group_thread snapshot returns null btv map: threadType = ", " threadId = ", c43707JUs.A1E), 817904752);
                }
                C4KR c4kr = this.A01;
                C2DS c2ds = c4kr.A09;
                String str2 = c43707JUs.A1E;
                C14360o3.A07(str2);
                C81663kb A0N = ((C2DU) c2ds).A0N(str2);
                if (A0N != null && (BLX = A0N.BLX()) != null) {
                    long C8i = BLX.C8i();
                    List list = c43707JUs.A06;
                    C14360o3.A07(list);
                    C83403nh c83403nh = (C83403nh) AbstractC001800i.A0L(list);
                    if (c83403nh != null) {
                        l = Long.valueOf(c83403nh.C8i());
                    } else {
                        l = null;
                    }
                    if (l == null) {
                        c18950wb = (C18950wb) c4kr.A0D.getValue();
                        str = "ThreadPagedResult doesn't contain any message";
                    } else if (l.longValue() < C8i) {
                        c18950wb = (C18950wb) c4kr.A0D.getValue();
                        str = "last item timestamp regressed";
                    }
                    AbstractC166987dD.A1T(c18950wb, str, 817896272);
                }
                C4KV c4kv = c4kr.A08;
                c4kv.A04(this.A03);
                c2ds.FBa(c43707JUs, c43707JUs.A0q, c43707JUs, false);
                c4kv.A03(this.A03);
            }
            C4KR c4kr2 = this.A01;
            C4KW c4kw = c4kr2.A06;
            String str3 = this.A05;
            c4kw.A02(str3, null);
            C4KR.A01(c4kr2, c43707JUs, null, str3, "makeup_for_eager_thread_resolution_due_to_instamadillo_failure", null);
        }
        A03();
        this.A01.A08.A0C(this.A03);
    }

    @Override // X.AbstractC1344165n, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1610205903);
        this.A01.A08.A02(abstractC115105If, this.A03);
        super.onFail(abstractC115105If);
        C0f9.A0A(-280248420, A0N);
    }

    @Override // X.AbstractC1344165n, X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1030414179);
        super.onStart();
        if (super.A00 == 1) {
            this.A01.A06.A04(this.A05, null, null);
        }
        C4KR c4kr = this.A01;
        c4kr.A06.A03(this.A05, null, null);
        c4kr.A08.A05(this.A03);
        C0f9.A0A(-189432499, A03);
    }

    public final String toString() {
        JSR A00 = JSS.A00(this);
        A00.A01(this.A00, "recipients");
        A00.A01(this.A04, "seqId");
        return AbstractC166987dD.A19(A00);
    }
}
