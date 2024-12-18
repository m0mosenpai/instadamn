package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.captions.ClipsCaptionDataSource$special$$inlined$CoroutineExceptionHandler$1;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.Mh4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51050Mh4 extends AbstractC52922bZ implements InterfaceC25221BDv {
    public float A00;
    public float A01;
    public C22993ABs A02;
    public C84P A03;
    public List A04;
    public List A05;
    public boolean A06;
    public final Context A07;
    public final C2GS A08;
    public final OVv A09;
    public final ClipsAudioStore A0A;
    public final ClipsCreationViewModel A0B;
    public final C07X A0C;
    public final C2GT A0D;
    public final UserSession A0E;
    public final C87D A0F;
    public final CoroutineExceptionHandler A0G;

    public C51050Mh4(Context context, C07X c07x, UserSession userSession, OVv oVv, C84P c84p, ClipsAudioStore clipsAudioStore, C87D c87d, ClipsCreationViewModel clipsCreationViewModel) {
        AbstractC167007dF.A1H(c87d, 5, clipsAudioStore);
        this.A07 = context;
        this.A0E = userSession;
        this.A0C = c07x;
        this.A0B = clipsCreationViewModel;
        this.A0F = c87d;
        this.A09 = oVv;
        this.A0A = clipsAudioStore;
        this.A03 = c84p;
        this.A08 = MSW.A0E();
        this.A0G = new ClipsCaptionDataSource$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this);
        this.A00 = c87d.A0E();
        ClipsAudioStore clipsAudioStore2 = c87d.A01;
        C0UO c0uo = clipsAudioStore2.A0n;
        this.A01 = MSY.A00(c0uo);
        C16930sl c16930sl = C16930sl.A00;
        this.A04 = c16930sl;
        this.A05 = c16930sl;
        AbstractC31180DnO.A1F(c07x, clipsCreationViewModel.A0G, C57747Pja.A00(this, 8), 55);
        AbstractC31178DnM.A11(c07x, PZJ.A01(this, null, 5), clipsCreationViewModel.A0K.A0l);
        C0UO c0uo2 = clipsAudioStore2.A0k;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC31180DnO.A1F(c07x, AbstractC58232lf.A00(anonymousClass191, c0uo2), C57747Pja.A00(this, 9), 55);
        AbstractC31180DnO.A1F(c07x, AbstractC58232lf.A00(anonymousClass191, c0uo), C57747Pja.A00(this, 10), 55);
        AbstractC31180DnO.A1F(c07x, oVv.A00, MSW.A1E(this, 4), 55);
        this.A06 = true;
        this.A0D = MSW.A0E();
    }

    @Override // X.InterfaceC25221BDv
    public final void ETa(String str, String str2) {
        C14360o3.A0B(str, 0);
        AbstractC226599zH.A00(this, str, str2);
        this.A09.A04.put(str, str2);
    }

    @Override // X.InterfaceC25221BDv
    public final void F8C(Context context) {
    }

    @Override // X.InterfaceC25221BDv
    public final void reset() {
        this.A02 = null;
        OVv oVv = this.A09;
        oVv.A05.clear();
        oVv.A06.clear();
        oVv.A04.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        if (X.AJp.A01(r0) == false) goto L30;
     */
    @Override // X.InterfaceC25221BDv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AIc(android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51050Mh4.AIc(android.content.Context):void");
    }

    @Override // X.InterfaceC25221BDv
    public final void AUd(Context context) {
        C84B A0N = MSY.A0N(this.A0B);
        if (A0N != null && A0N.A01.isEmpty()) {
            return;
        }
        if (this.A02 == null) {
            C6S5 c6s5 = C6S5.A05;
            C16930sl c16930sl = C16930sl.A00;
            this.A02 = new C22993ABs(c6s5, null, null, "", AbstractC166987dD.A1G(), c16930sl, c16930sl, 0, 0, -1);
        }
        AbstractC23641Du.A05(this.A0G, new C25024B5f(this, null, 36), C07Y.A00(this.A0C));
    }

    @Override // X.InterfaceC25221BDv
    public final C2GT AgF() {
        return this.A0D;
    }

    @Override // X.InterfaceC25221BDv
    public final C22993ABs BKP() {
        return this.A02;
    }

    @Override // X.InterfaceC25221BDv
    public final C2GT C9B() {
        return this.A08;
    }

    @Override // X.InterfaceC25221BDv
    public final int C9o(Context context) {
        Iterator it = this.A04.iterator();
        int i = 0;
        while (it.hasNext()) {
            C115525Km A0O = MSX.A0O(it);
            i += A0O.A02 - A0O.A03;
        }
        return i;
    }

    @Override // X.InterfaceC25221BDv
    public final void AHd() {
        C84P c84p = new C84P(AbstractC166987dD.A1I(), AbstractC166987dD.A1I());
        ClipsAudioStore clipsAudioStore = this.A0A;
        clipsAudioStore.A0I.Egh(c84p);
        clipsAudioStore.A0J.Egh(c84p.A00);
        clipsAudioStore.A0R.Egh(c84p.A01);
        this.A03 = c84p;
        OVv oVv = this.A09;
        oVv.A05.clear();
        oVv.A06.clear();
        oVv.A04.clear();
    }

    @Override // X.InterfaceC25221BDv
    public final void EWp(C22993ABs c22993ABs) {
        this.A02 = c22993ABs;
    }
}
