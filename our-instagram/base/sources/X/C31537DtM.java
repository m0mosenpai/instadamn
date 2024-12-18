package X;

import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import java.util.List;

/* renamed from: X.DtM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31537DtM extends AbstractC65952Twx {
    public final /* synthetic */ UnifiedFollowFragment A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31537DtM(AbstractC10360h2 abstractC10360h2, C07T c07t, UnifiedFollowFragment unifiedFollowFragment) {
        super(abstractC10360h2, c07t);
        this.A00 = unifiedFollowFragment;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0025. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    @Override // X.AbstractC65952Twx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.Fragment A03(int r18) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31537DtM.A03(int):androidx.fragment.app.Fragment");
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(742573202);
        List list = this.A00.A0L;
        if (list == null) {
            C14360o3.A0F("tabs");
            throw C00O.createAndThrow();
        }
        int size = list.size();
        C0f9.A0A(-1282137077, A03);
        return size;
    }
}
