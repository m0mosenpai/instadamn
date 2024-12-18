package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* loaded from: classes6.dex */
public final class GHP implements InterfaceC1571373s {
    public final /* synthetic */ C42747Ivl A00;
    public final /* synthetic */ boolean A01;

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
    }

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }

    public GHP(C42747Ivl c42747Ivl, boolean z) {
        this.A00 = c42747Ivl;
        this.A01 = z;
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        EnumC33447EqK enumC33447EqK;
        C14H A0l = AbstractC31172DnG.A0l();
        Context context = this.A00.A01;
        Intent A01 = A0l.A01(context);
        Uri.Builder A04 = AbstractC31175DnJ.A04("ig://share");
        if (this.A01) {
            enumC33447EqK = EnumC33447EqK.A0L;
        } else {
            enumC33447EqK = EnumC33447EqK.A0M;
        }
        AbstractC31180DnO.A0z(context, A01, A04.appendQueryParameter(CacheBehaviorLogger.SOURCE, enumC33447EqK.A00));
    }
}
