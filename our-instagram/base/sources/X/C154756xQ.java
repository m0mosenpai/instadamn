package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.6xQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154756xQ implements InterfaceC154766xR {
    public final /* synthetic */ UserDetailFragment A00;

    @Override // X.InterfaceC154766xR
    public final void DRc(EnumC125775mS enumC125775mS, boolean z, boolean z2, boolean z3) {
        C13080lu A00 = AbstractC13090lv.A00("FeedRequestCallback.onMediaFeedRequestStart");
        try {
            UserDetailFragment userDetailFragment = this.A00;
            C154736xO c154736xO = userDetailFragment.A1A;
            if (c154736xO != null) {
                boolean A12 = userDetailFragment.A12();
                String name = enumC125775mS.name();
                C14360o3.A0B(name, 2);
                int i = c154736xO.A00;
                if (i != 0) {
                    C006802i c006802i = c154736xO.A01;
                    c006802i.markerAnnotate(i, "is_cache_request", false);
                    c006802i.markerAnnotate(c154736xO.A00, "profile_feed_source", name);
                    c006802i.markerAnnotate(c154736xO.A00, "is_self_profile", A12);
                    c006802i.markerPoint(c154736xO.A00, "data_fetch_start");
                }
            }
            UserDetailTabController userDetailTabController = userDetailFragment.A0z;
            if (userDetailTabController != null) {
                userDetailTabController.A0G();
            }
            A00.close();
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public C154756xQ(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
    
        if (r0 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f5, code lost:
    
        if (r6 != null) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4  */
    @Override // X.InterfaceC154766xR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DRX(X.AbstractC115105If r12, X.EnumC125775mS r13) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C154756xQ.DRX(X.5If, X.5mS):void");
    }

    @Override // X.InterfaceC154766xR
    public final void DRZ(EnumC125775mS enumC125775mS) {
        C42749Ivn c42749Ivn;
        C13080lu A00 = AbstractC13090lv.A00("FeedRequestCallback.onMediaFeedRequestFinish");
        try {
            UserDetailTabController userDetailTabController = this.A00.A0z;
            if (userDetailTabController.A0C && enumC125775mS == EnumC125775mS.A06 && (c42749Ivn = userDetailTabController.A02) != null) {
                C14360o3.A0B(enumC125775mS, 0);
                C42747Ivl A002 = C42749Ivn.A00(c42749Ivn, enumC125775mS);
                A002.A00 = true;
                if (C18U.A06(C06090Tz.A05, A002.A02, 36328117585329341L)) {
                    C42747Ivl.A00(A002);
                }
            } else {
                ((AbstractC155926zM) userDetailTabController.A0P.A03.get(enumC125775mS)).A01 = true;
            }
            userDetailTabController.A0H();
            A00.close();
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC154766xR
    public final void DRa(String str, Long l) {
        UserDetailFragment userDetailFragment = this.A00;
        if (l != null) {
            userDetailFragment.A1B.A0H(str, l.longValue());
        } else {
            userDetailFragment.A1B.A0E(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (r29 != X.EnumC125775mS.A06) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0141, code lost:
    
        if (r0.booleanValue() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (X.C18U.A06(r6, r4, 36325201302401911L) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0205, code lost:
    
        if (r3.A0i.A08.A00 == X.C05F.A0C) goto L92;
     */
    @Override // X.InterfaceC154766xR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DRd(android.content.Context r26, X.C51758Mth r27, X.C123645id r28, X.EnumC125775mS r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C154756xQ.DRd(android.content.Context, X.Mth, X.5id, X.5mS, boolean, boolean):void");
    }
}
