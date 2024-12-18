package X;

import com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl;
import com.instagram.bugreporter.BugReportComposerFragment;
import com.instagram.igtv.draft.model.IGTVDraftsRepository;
import com.instagram.security.attestation.playintegrity.client.PlayIntegrityRequester;

/* renamed from: X.PWp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57137PWp extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57137PWp(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A04 = i;
        this.A05 = obj;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C57137PWp) && ((C57137PWp) obj).A04 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        this.A03 = obj;
        this.A01 |= Integer.MIN_VALUE;
        Object obj2 = this.A05;
        switch (i) {
            case 0:
                return ((StickerTypeaheadImpl) obj2).A00(null, null, this);
            case 1:
                return BugReportComposerFragment.A03((BugReportComposerFragment) obj2, this, 0);
            case 2:
                return ((IGTVDraftsRepository) obj2).AOd(0, this);
            default:
                return ((PlayIntegrityRequester) obj2).A00(null, this);
        }
    }
}
