package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.util.ArrayList;

/* renamed from: X.Mh8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51054Mh8 extends AbstractC52922bZ implements InterfaceC58197Pr3 {
    public final MusicProduct A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final C50668MYm A03;
    public final InterfaceC24731Iq A04;
    public final InterfaceC19390xP A05;
    public final InterfaceC19390xP A06;
    public final InterfaceC19390xP A07;
    public final C05A A08;
    public final C05A A09;
    public final boolean A0A;
    public final ImmutableList A0B;

    @Override // X.InterfaceC58197Pr3
    public final C1ON ANK(InterfaceC25601Mq interfaceC25601Mq, Integer num, Long l, Object obj, String str) {
        C14360o3.A0B(num, 1);
        return C50675MYt.A02.A02(this.A00, this.A02, interfaceC25601Mq, A00(), num, l, str, null, null, null);
    }

    @Override // X.InterfaceC58197Pr3
    public final Object BoC() {
        return null;
    }

    @Override // X.InterfaceC58197Pr3
    public final /* synthetic */ void DVK(String str, Object obj, int i) {
    }

    @Override // X.InterfaceC58197Pr3
    public final /* synthetic */ void DVL(int i, Object obj, boolean z) {
    }

    @Override // X.InterfaceC58197Pr3
    public final void Dg2(Object obj, int i) {
    }

    @Override // X.InterfaceC58197Pr3
    public final void DgI(Object obj, int i) {
    }

    @Override // X.InterfaceC58197Pr3
    public final boolean EjU() {
        return false;
    }

    @Override // X.InterfaceC58197Pr3
    public final boolean EjZ() {
        return true;
    }

    public final MusicBrowseCategory A00() {
        String str;
        String str2;
        String str3;
        if (this instanceof NQS) {
            if (this.A0A) {
                str3 = "trending";
            } else {
                str3 = "trending_lm_only";
            }
            return C50535MSo.A03("top_trends", str3, "");
        }
        if (this instanceof NQT) {
            if (this.A0A) {
                str2 = "playlists";
            } else {
                str2 = "saved_music";
            }
            return C50535MSo.A03(str2, "bookmarked", "");
        }
        if (this instanceof NQR) {
            return C50535MSo.A02("3882385558444363", "");
        }
        MusicProduct musicProduct = this.A00;
        if (musicProduct == MusicProduct.A06) {
            str = "clips_browse";
        } else if (AbstractC65993Txo.A02(musicProduct)) {
            str = "stories_browse";
        } else if (musicProduct == MusicProduct.A0G) {
            str = "feed_browse";
        } else if (musicProduct == MusicProduct.A0H) {
            str = "notes_browse";
        } else {
            str = "trending";
        }
        return C50535MSo.A01(str);
    }

    public final EnumC53226NgO A01() {
        if (this instanceof NQS) {
            return ((NQS) this).A00;
        }
        if (this instanceof NQT) {
            return ((NQT) this).A00;
        }
        if (this instanceof NQR) {
            return ((NQR) this).A00;
        }
        return ((NQU) this).A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (X.AbstractC166997dE.A1Z(r8.A00(r9).A02(), true) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        X.C14360o3.A0B(r9, 0);
        r0 = X.IRV.A00(new X.C38061Goo(X.C41694IdN.A00(r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        r6.add(0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        r13 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            r15 = this;
            boolean r0 = r15 instanceof X.NQS
            if (r0 != 0) goto Lbd
            boolean r0 = r15 instanceof X.NQT
            if (r0 == 0) goto Lbd
            r4 = r15
            X.NQT r4 = (X.NQT) r4
            X.05A r7 = r4.A08
            java.util.ArrayList r6 = X.MSZ.A0w(r7)
            X.MYn r8 = r4.A01
            java.util.Set r5 = r8.A05
            java.util.Iterator r14 = r5.iterator()
            r3 = 1
            r2 = 0
            r13 = 0
        L1c:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r9 = r14.next()
            X.JIN r9 = (X.JIN) r9
            java.lang.Object r0 = r7.getValue()
            java.util.Iterator r12 = X.AbstractC25226BEj.A1J(r0)
        L30:
            boolean r0 = r12.hasNext()
            r11 = 0
            if (r0 == 0) goto L75
            java.lang.Object r1 = r12.next()
            r10 = r1
            X.ICV r10 = (X.ICV) r10
            boolean r0 = r10 instanceof X.HML
            if (r0 == 0) goto L30
            X.HML r10 = (X.HML) r10
            X.Goo r0 = r10.A00
            X.JIN r0 = r0.A00()
            if (r0 == 0) goto L50
            java.lang.String r11 = r0.getId()
        L50:
            java.lang.String r0 = r9.getId()
            boolean r0 = X.C14360o3.A0K(r11, r0)
            if (r0 == 0) goto L30
            if (r1 == 0) goto L75
            X.2GT r0 = r8.A00(r9)
            java.lang.Object r0 = r0.A02()
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r2)
            if (r0 == 0) goto L6e
            r6.remove(r1)
            goto L1c
        L6e:
            r6.remove(r1)
            r6.add(r2, r1)
            goto L1c
        L75:
            X.2GT r0 = r8.A00(r9)
            java.lang.Object r0 = r0.A02()
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r3)
            if (r0 == 0) goto L1c
            X.C14360o3.A0B(r9, r2)
            X.JL3 r1 = X.C41694IdN.A00(r9)
            X.Goo r0 = new X.Goo
            r0.<init>(r1)
            X.HML r0 = X.IRV.A00(r0)
            if (r0 == 0) goto L98
            r6.add(r2, r0)
        L98:
            r13 = 1
            goto L1c
        L9a:
            boolean r0 = X.MSX.A1Z(r6, r7)
            if (r0 == 0) goto L9a
            r5.clear()
            if (r13 == 0) goto Lbd
            com.instagram.common.session.UserSession r3 = r4.A02
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36330174874338019(0x81121a000342e3, double:3.0386871081789846E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Lbd
            X.6aw r1 = X.AbstractC141776au.A00(r4)
            r0 = 45
            X.PZF.A02(r4, r1, r0)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC51054Mh8.A02():void");
    }

    @Override // X.InterfaceC58197Pr3
    public final boolean CLl() {
        return MSX.A1X(this.A08.getValue());
    }

    @Override // X.InterfaceC58197Pr3
    public final void Dfr(AbstractC115105If abstractC115105If, int i) {
        this.A09.Egh(EnumC53173NfU.A03);
    }

    public AbstractC51054Mh8(ImmutableList immutableList, MusicProduct musicProduct, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A00 = musicProduct;
        this.A0B = immutableList;
        C008002u A1H = AbstractC25225BEi.A1H(EnumC53173NfU.A07);
        this.A09 = A1H;
        this.A06 = A1H;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A08 = A0o;
        this.A05 = A0o;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A04 = A12;
        this.A07 = AbstractC07080Za.A03(A12);
        this.A0A = !immutableList.contains(AudioTrackType.A03);
        this.A03 = new C50668MYm(abstractC59962oe, userSession, A00(), this, false);
    }

    @Override // X.InterfaceC58197Pr3
    public final void DgT(InterfaceC57963Pn9 interfaceC57963Pn9, Object obj, int i, boolean z, boolean z2) {
        HML A00;
        ArrayList A01 = AbstractC41656Ibo.A01(interfaceC57963Pn9.EqR().A05, this.A0B);
        ArrayList A1E = AbstractC166987dD.A1E();
        if (!z) {
            C05A c05a = this.A08;
            A1E.addAll(AbstractC001800i.A0d(AbstractC31172DnG.A0w(c05a), AbstractC25226BEj.A05(MSW.A1A(c05a))));
        }
        A1E.addAll(IRV.A01(A01));
        if (!(this instanceof NQS)) {
            if (this instanceof NQT) {
                A02();
            } else if (!(this instanceof NQR)) {
                NQU nqu = (NQU) this;
                if (((AbstractC51054Mh8) nqu).A00 == MusicProduct.A06) {
                    ImmutableList immutableList = nqu.A01;
                    if (!immutableList.isEmpty() && nqu.A00 == C8BN.POST_CAPTURE_AUDIO_BUTTON && AbstractC185298Jv.A07(((AbstractC51054Mh8) nqu).A02) && (A00 = IRV.A00(C38061Goo.A0J.A02(((AbstractC51054Mh8) nqu).A01.requireContext(), immutableList))) != null) {
                        A1E.add(AbstractC001800i.A0J(A1E) instanceof HMI ? 1 : 0, A00);
                    }
                }
            }
        }
        C05A c05a2 = this.A08;
        do {
        } while (!c05a2.AIi(c05a2.getValue(), AbstractC001800i.A0T(new HM7(), A1E)));
        this.A09.Egh(EnumC53173NfU.A04);
    }
}
