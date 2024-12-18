package X;

import android.content.Context;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.interactor.areffects.RtcArEffectsManager$getCollectionsFlow$2;
import java.util.List;
import java.util.Map;

/* renamed from: X.OJx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54803OJx {
    public OHH A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public List A05;
    public List A06;
    public List A07;
    public C19L A08;
    public final EffectCollectionService A09;
    public final C54823OLg A0A;
    public final UserSession A0B;
    public final OHG A0C;
    public final C54550O8c A0D;
    public final Map A0E;

    public final C15870qh A00(C191258dU c191258dU, long j, boolean z, boolean z2) {
        boolean equals = c191258dU.equals(C191258dU.A0B);
        AnonymousClass058 anonymousClass058 = new AnonymousClass058(new C50533MSm(c191258dU, this, (InterfaceC23621Ds) null, 15, z2));
        RtcArEffectsManager$getCollectionsFlow$2 rtcArEffectsManager$getCollectionsFlow$2 = new RtcArEffectsManager$getCollectionsFlow$2(c191258dU, this, null, j, z, equals);
        int i = AnonymousClass111.A00;
        return new C15870qh(new C11200ib(rtcArEffectsManager$getCollectionsFlow$2, anonymousClass058, 2));
    }

    public /* synthetic */ C54803OJx(Context context, UserSession userSession) {
        EffectCollectionService A00 = AbstractC142256bi.A00(context, userSession);
        C54823OLg c54823OLg = new C54823OLg(userSession);
        OHG ohg = new OHG(userSession);
        C54550O8c c54550O8c = new C54550O8c(userSession, context);
        C14360o3.A0B(A00, 3);
        this.A0B = userSession;
        this.A09 = A00;
        this.A0A = c54823OLg;
        this.A0C = ohg;
        this.A0D = c54550O8c;
        C16930sl c16930sl = C16930sl.A00;
        this.A02 = c16930sl;
        this.A01 = c16930sl;
        this.A03 = c16930sl;
        this.A05 = c16930sl;
        this.A04 = c16930sl;
        this.A07 = c16930sl;
        this.A06 = c16930sl;
        this.A0E = AbstractC166987dD.A1G();
    }
}
