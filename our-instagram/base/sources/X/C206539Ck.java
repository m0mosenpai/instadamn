package X;

import com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl;

/* renamed from: X.9Ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206539Ck extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;
    public final Object A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206539Ck(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A07 = i;
        this.A08 = obj;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A07;
        this.A06 = obj;
        this.A00 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return SavedMediaMetadataService.A00(null, (SavedMediaMetadataService) this.A08, null, this);
            case 1:
                return MutedWordsFilterManager.A00((MutedWordsFilterManager) this.A08, null, this);
            default:
                return ((RespectfulNudgePluginImpl) this.A08).A01(null, null, null, null, null, null, null, this, false);
        }
    }
}
