package X;

import com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.MgX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51024MgX extends AbstractC52922bZ {
    public final C55062OaI A00;
    public final SfxAudioRepository A01;
    public final ClipsAudioStore A02;
    public final C01U A03;
    public final InterfaceC24731Iq A04;
    public final InterfaceC19390xP A05;
    public final InterfaceC19390xP A06;
    public final C05A A07;
    public final C05A A08;
    public final O2B A09;
    public final InterfaceC19390xP A0A;

    public C51024MgX(SfxAudioRepository sfxAudioRepository, ClipsAudioStore clipsAudioStore) {
        C14360o3.A0B(clipsAudioStore, 2);
        this.A01 = sfxAudioRepository;
        this.A02 = clipsAudioStore;
        this.A03 = new C01U();
        O2B o2b = new O2B(this);
        this.A09 = o2b;
        this.A00 = new C55062OaI(o2b);
        C008002u A1H = AbstractC25225BEi.A1H(false);
        this.A08 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(false);
        this.A07 = A1H2;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A04 = A12;
        this.A05 = AbstractC07080Za.A03(A12);
        AbstractC25232BEp.A1J(this, PZJ.A01(this, null, 40), AbstractC208910l.A02(sfxAudioRepository.A06));
        AbstractC25232BEp.A1J(this, new PYX(this, null, 25), AbstractC208910l.A02(sfxAudioRepository.A05));
        C15150pV A03 = C10Q.A03(new C50527MSg(0, null), A1H, A1H2);
        this.A0A = A03;
        SfxAudioRepository sfxAudioRepository2 = this.A01;
        C15230pd A00 = C10Q.A00(new C57185PaM(0, null), A03, AbstractC208910l.A02(sfxAudioRepository2.A05), AbstractC208910l.A02(sfxAudioRepository2.A06));
        this.A06 = AbstractC208910l.A01(C51694MsP.A04, AbstractC141776au.A00(this), A00, C10I.A01);
    }

    public final void A02(C51757Mtg c51757Mtg, int i) {
        C14360o3.A0B(c51757Mtg, 0);
        C55062OaI c55062OaI = this.A00;
        String str = ((C211729Zg) c51757Mtg.A00).A04;
        C14360o3.A0B(str, 0);
        Map map = c55062OaI.A04;
        Number A0Q = AbstractC37300Gc1.A0Q(str, map);
        if (A0Q == null) {
            A0Q = Integer.valueOf(C55062OaI.A00(c55062OaI).load(str, 1));
            map.put(str, A0Q);
        }
        OA1 oa1 = c55062OaI.A03;
        int intValue = A0Q.intValue();
        Integer valueOf = Integer.valueOf(i);
        oa1.A02.put(valueOf, Integer.valueOf(intValue));
        this.A03.addLast(AbstractC166987dD.A1L(valueOf, c51757Mtg));
        A00(this, NIU.A00);
    }

    public final void A01() {
        List list;
        MUD mud = (MUD) this.A01.A06.getValue();
        if (mud != null && (list = (List) mud.A00) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C51757Mtg A0J = MSW.A0J(it);
                C55062OaI c55062OaI = this.A00;
                String str = ((C211729Zg) A0J.A00).A04;
                C14360o3.A0B(str, 0);
                c55062OaI.A04.put(str, Integer.valueOf(C55062OaI.A00(c55062OaI).load(str, 1)));
            }
        }
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        C55062OaI c55062OaI = this.A00;
        c55062OaI.A01();
        c55062OaI.A03.A02.clear();
        this.A03.clear();
    }

    public static final void A00(C51024MgX c51024MgX, AbstractC53448Nkb abstractC53448Nkb) {
        C57171PZp.A03(abstractC53448Nkb, c51024MgX, AbstractC141776au.A00(c51024MgX), 5);
    }
}
