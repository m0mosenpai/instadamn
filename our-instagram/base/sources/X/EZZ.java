package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class EZZ extends AbstractRunnableC14200nk {
    public final /* synthetic */ AbstractC12990ll A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZZ(AbstractC12990ll abstractC12990ll) {
        super(1073701796, 4, false, true);
        this.A00 = abstractC12990ll;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C36159FxZ c36159FxZ = C36159FxZ.A03;
        AbstractC12990ll abstractC12990ll = this.A00;
        if (AbstractC31181DnP.A11(abstractC12990ll, "BigBlueTokenHelper") || (str = C36159FxZ.A02) == null || str.length() == 0) {
            List A02 = AMd.A02(abstractC12990ll.getDeviceSession().A06(), abstractC12990ll, "ig_android_access_library_fx_fetch_active_msgr_token", "BigBlueTokenHelper", null);
            String str2 = null;
            if (AbstractC001800i.A0J(A02) != null) {
                C203128yU c203128yU = ((C203148yW) AbstractC001800i.A0I(A02)).A01;
                C36159FxZ.A02 = c203128yU.A00;
                C203118yT c203118yT = c203128yU.A01;
                if (c203118yT != null) {
                    C36159FxZ.A00 = c203118yT.A02;
                    str2 = c203118yT.A00;
                } else {
                    return;
                }
            } else {
                C36159FxZ.A02 = null;
                C36159FxZ.A00 = null;
            }
            C36159FxZ.A01 = str2;
        }
    }
}
