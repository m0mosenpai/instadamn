package X;

import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BKW implements InterfaceC170597jC {
    public Long A00;
    public final UserSession A01;
    public final AbstractC37552Gg8 A02;
    public final C1337362e A03;
    public final BK8 A04;
    public final BKV A05;

    public BKW(UserSession userSession, AbstractC37552Gg8 abstractC37552Gg8, BKV bkv, C1337362e c1337362e, BK8 bk8) {
        C14360o3.A0B(bk8, 5);
        this.A02 = abstractC37552Gg8;
        this.A01 = userSession;
        this.A03 = c1337362e;
        this.A05 = bkv;
        this.A04 = bk8;
    }

    @Override // X.InterfaceC170597jC
    public final boolean hasStableIds() {
        return true;
    }

    @Override // X.InterfaceC170597jC
    public final /* bridge */ /* synthetic */ void CzV(ComponentTree componentTree, AbstractC170917ji abstractC170917ji, InterfaceC170717jO interfaceC170717jO, int i) {
        long j;
        C1337362e c1337362e = this.A03;
        boolean A1X = AbstractC167007dF.A1X(c1337362e.A0K.A0J, ClipsViewerSource.A0g);
        UserSession userSession = c1337362e.A0N;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (A1X) {
            j = 36329638003622355L;
        } else {
            j = 36329638003687892L;
        }
        boolean A06 = C18U.A06(c06090Tz, userSession, j);
        C14360o3.A0A(Boolean.valueOf(A06));
        if (A06 && this.A00 == null) {
            this.A00 = Long.valueOf(System.currentTimeMillis());
        }
        AbstractC60912qF.A01(this.A01, this.A00, null, new C30171DRb(i, 14, abstractC170917ji, this), A06);
    }

    @Override // X.InterfaceC170597jC
    public final /* bridge */ /* synthetic */ void E0s(AbstractC170917ji abstractC170917ji) {
        C37658Ghr c37658Ghr = (C37658Ghr) abstractC170917ji;
        C14360o3.A0B(c37658Ghr, 0);
        this.A03.unbind(c37658Ghr);
    }

    @Override // X.InterfaceC170597jC
    public final long getItemId(int i) {
        return ((C2UU) this.A05.A00.A07.invoke()).getItemId(i);
    }

    @Override // X.InterfaceC170597jC
    public final /* bridge */ /* synthetic */ AbstractC170917ji D8W(ViewGroup viewGroup, int i) {
        C25514BQc c25514BQc;
        C13490mb.A00(viewGroup);
        BK8 bk8 = this.A04;
        if (bk8.A00 && (c25514BQc = bk8.A01) != null && c25514BQc.A00) {
            C25514BQc.A00(c25514BQc, AnonymousClass001.A0R(AbstractC167007dF.A0h("ON_CREATE_VIEW_HOLDER"), "_start"));
        }
        int EnB = C2UL.A00.EnB(i);
        C1337362e c1337362e = this.A03;
        C37658Ghr A05 = c1337362e.A05();
        String name = c1337362e.getClass().getName();
        C14360o3.A07(name);
        C2UL.A00.ASU(AbstractC154506x0.A00(c1337362e, null, name, false, false), EnB);
        if (bk8.A00) {
            C25514BQc c25514BQc2 = bk8.A01;
            if (c25514BQc2 != null && c25514BQc2.A00) {
                C25514BQc.A00(c25514BQc2, AnonymousClass001.A0R(AbstractC167007dF.A0h("ON_CREATE_VIEW_HOLDER"), "_end"));
            }
            bk8.A00 = false;
        }
        return A05;
    }
}
