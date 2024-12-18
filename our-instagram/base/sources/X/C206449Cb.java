package X;

import com.instagram.avatars.store.AvatarStore;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.mainfeed.network.flashfeed.FlashFeedCache;

/* renamed from: X.9Cb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206449Cb extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206449Cb(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A04 = i;
        this.A05 = obj;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        Object obj2 = this.A05;
        switch (i) {
            case 0:
                return ((AvatarStore) obj2).A02(this, false, false);
            case 1:
                return ((NotesRepository) obj2).A0B(this, false);
            default:
                return FlashFeedCache.A01((FlashFeedCache) obj2, this, false, false);
        }
    }
}
