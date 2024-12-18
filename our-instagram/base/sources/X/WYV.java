package X;

import android.content.Context;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.AbstractCollection;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class WYV implements X9P {
    public final /* synthetic */ C4AN A00;
    public final /* synthetic */ HeroPlayerSetting A01;

    public WYV(C4AN c4an, HeroPlayerSetting heroPlayerSetting) {
        this.A00 = c4an;
        this.A01 = heroPlayerSetting;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    @Override // X.X9P
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C4BI A02;
        ?? r0;
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        C14360o3.A0B(abstractCollection, 0);
        C4AN c4an = this.A00;
        HeroPlayerSetting heroPlayerSetting = this.A01;
        Context context = AbstractC12290kX.A00;
        boolean z = WEM.A04;
        HashSet hashSet = new HashSet();
        C4AK c4ak = c4an.A07;
        if (c4ak != C4AK.DASH_VOD && c4ak != C4AK.DASH_LIVE) {
            hashSet.add(VDI.A0Q);
            hashSet.add(VDI.A0R);
        } else {
            try {
                C92124As A022 = AbstractC92114Ar.A02(c4an.A05, new C92074An(context, heroPlayerSetting, c4an.A0G, false), c4an.A09);
                C16930sl<C4BF> c16930sl = C16930sl.A00;
                if (A022 != null && (A02 = A022.A02(0)) != null && (r0 = A02.A03) != 0) {
                    c16930sl = r0;
                }
                for (C4BF c4bf : c16930sl) {
                    if (c4bf != null) {
                        int i = c4bf.A01;
                        if (Integer.valueOf(i) != null) {
                            if (i == 1) {
                                hashSet.add(VDI.A0Q);
                            } else if (i == 2) {
                                hashSet.add(VDI.A0R);
                            }
                        }
                    }
                }
            } catch (C40L unused) {
            }
        }
        abstractCollection.addAll(hashSet);
    }
}
