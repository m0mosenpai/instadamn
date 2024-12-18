package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

/* renamed from: X.KEj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45544KEj extends C1P1 {
    public final /* synthetic */ C31211eQ A00;
    public final /* synthetic */ C31191eO A01;
    public final /* synthetic */ DirectThreadKey A02;
    public final /* synthetic */ MessageIdentifier A03;
    public final /* synthetic */ boolean A04;

    public C45544KEj(C31211eQ c31211eQ, C31191eO c31191eO, DirectThreadKey directThreadKey, MessageIdentifier messageIdentifier, boolean z) {
        this.A00 = c31211eQ;
        this.A01 = c31191eO;
        this.A03 = messageIdentifier;
        this.A02 = directThreadKey;
        this.A04 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -866169701);
        super.onFail(abstractC115105If);
        String obj = AbstractC35240FgZ.A00(abstractC115105If).toString();
        if (this.A04) {
            AbstractC147806l5.A00(this.A00.A00).A0S(this.A02.A00, AbstractC111324zv.A00(2174), obj);
        }
        C0f9.A0A(238724098, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1373981389);
        int A032 = C0f9.A03(-1568355103);
        C31211eQ c31211eQ = this.A00;
        PendingMediaStore pendingMediaStore = (PendingMediaStore) c31211eQ.A04.getValue();
        C31191eO c31191eO = this.A01;
        C47Z A033 = pendingMediaStore.A03(c31191eO.A04.A06);
        if (A033 != null && A033.A53) {
            A033.A0Z(EnumC915447k.A02);
            ((PendingMediaStoreSerializer) c31211eQ.A05.getValue()).A04();
        }
        MessageIdentifier messageIdentifier = this.A03;
        if (messageIdentifier != null) {
            AbstractC25651Mw.A00(c31211eQ.A00).E4s(new C160937Jc(this.A02, messageIdentifier));
        }
        ((C120055c3) c31211eQ.A02.getValue()).A02(((C1OW) c31191eO).A05);
        C0f9.A0A(-433215409, A032);
        C0f9.A0A(1159073155, A03);
    }
}
