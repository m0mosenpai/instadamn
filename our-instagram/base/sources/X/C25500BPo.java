package X;

import com.instagram.feed.media.EffectPreviewIntf;

/* renamed from: X.BPo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C25500BPo extends C03E implements InterfaceC16590sC {
    public C25500BPo(Object obj) {
        super(5, obj, BKA.class, "launchVideoEffectPage", "launchVideoEffectPage(Lcom/instagram/feed/media/Media;Lcom/instagram/feed/ui/state/MediaState;Lcom/instagram/feed/media/EffectPreviewIntf;Lcom/facebook/analytics/structuredlogger/enums/InstagramPivotPageEntryPoint;Z)V", 0);
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C38321qM c38321qM = (C38321qM) obj;
        C75113Zb c75113Zb = (C75113Zb) obj2;
        EffectPreviewIntf effectPreviewIntf = (EffectPreviewIntf) obj3;
        AbstractC167027dH.A12(c38321qM, c75113Zb, effectPreviewIntf);
        ((BKA) this.receiver).A02((C8JW) obj4, effectPreviewIntf, c38321qM, c75113Zb);
        return C0eB.A00;
    }
}
