package X;

import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.9PT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9PT {
    public final /* synthetic */ C8JT A00;
    public final /* synthetic */ BEW A01;
    public final /* synthetic */ BEX A02;
    public final /* synthetic */ C211989aP A03;

    public C9PT(C8JT c8jt, BEW bew, BEX bex, C211989aP c211989aP) {
        this.A00 = c8jt;
        this.A01 = bew;
        this.A02 = bex;
        this.A03 = c211989aP;
    }

    public static final void A00(C9PT c9pt) {
        C183348Bh c183348Bh;
        String str;
        MusicAttributionConfig BVX;
        BEW bew = c9pt.A01;
        if (bew != null && (BVX = bew.BVX()) != null) {
            C8JT c8jt = c9pt.A00;
            AnonymousClass826 anonymousClass826 = c8jt.A0I;
            if (anonymousClass826 != null) {
                int i = anonymousClass826.A01;
                if (Integer.valueOf(i) != null) {
                    AudioOverlayTrack A00 = C9NX.A00(BVX, i);
                    if (A00 == null) {
                        c183348Bh = c8jt.A1h;
                        str = "Cannot get track from config";
                    } else {
                        C8JT.A11(c8jt, A00, true);
                        C8JT.A0T(c8jt);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            c183348Bh = c9pt.A00.A1h;
            str = "Null audio model or attribution config";
        }
        c183348Bh.A0D(str);
    }

    public final void A01() {
        String effectId;
        BEX bex = this.A02;
        if (bex != null && (effectId = bex.getEffectId()) != null) {
            C8JT c8jt = this.A00;
            c8jt.A1A.A00.Egh(new C189118Zc(C85B.A05, effectId, AbstractC203558zG.A00(c8jt.A16), null, null, null, null, -1, false));
        }
    }
}
