package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import java.util.List;

/* renamed from: X.8BE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8BE extends AbstractC52922bZ {
    public Integer A00;
    public String A01;
    public boolean A02;
    public final UserSession A03;
    public final C87D A04;
    public final ClipsCreationViewModel A05;
    public final ClipsAudioStore A06;
    public final C84S A07;
    public final C1818484t A08;
    public final C87H A09;

    public C8BE(UserSession userSession, C84A c84a, C87D c87d, ClipsCreationViewModel clipsCreationViewModel, C87H c87h) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(clipsCreationViewModel, 2);
        C14360o3.A0B(c87h, 3);
        C14360o3.A0B(c87d, 4);
        C14360o3.A0B(c84a, 5);
        this.A03 = userSession;
        this.A05 = clipsCreationViewModel;
        this.A09 = c87h;
        this.A04 = c87d;
        String str = clipsCreationViewModel.A0S;
        this.A01 = str;
        this.A06 = c84a.A00(str).A01;
        this.A07 = c84a.A00(this.A01).A03;
        this.A00 = C05F.A00;
        this.A08 = clipsCreationViewModel.A0Q;
    }

    public final void A03(C9IV c9iv) {
        C14360o3.A0B(c9iv, 0);
        C87D c87d = this.A04;
        c87d.A01.A06(c9iv.A03);
        c87d.A0F(c9iv.A00);
        c87d.A0I(c9iv.A04);
        c87d.A0G(c9iv.A01);
        c87d.A0H(c9iv.A02);
        ClipsCreationViewModel clipsCreationViewModel = this.A05;
        List list = c9iv.A05;
        C14360o3.A0B(list, 0);
        ClipsAudioStore clipsAudioStore = clipsCreationViewModel.A0K;
        List list2 = clipsAudioStore.A0C;
        list2.clear();
        list2.addAll(list);
        clipsAudioStore.A0S.Egh(C9O3.A00(list2, ClipsAudioStore.A00(clipsAudioStore)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (X.AbstractC185298Jv.A04(r5.A03) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(java.lang.Integer r6) {
        /*
            r5 = this;
            r4 = 0
            java.lang.Integer r0 = r5.A00
            int r1 = r0.intValue()
            r0 = 5
            if (r1 != r0) goto L7e
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r5.A05
            X.2GT r0 = r0.A0C
            java.lang.Object r2 = r0.A02()
            X.8he r2 = (X.AbstractC193598he) r2
            if (r2 == 0) goto L55
            int r1 = r2.A00
            r0 = 3
            if (r1 != r0) goto L55
            java.lang.Object r0 = r2.A00()
            X.8lW r0 = (X.C195868lW) r0
            com.instagram.music.common.model.MusicOverlayStickerModel r3 = r0.A0V
            if (r3 == 0) goto L55
            java.lang.Object r2 = r2.A00()
            X.8lW r2 = (X.C195868lW) r2
            X.87D r0 = r5.A04
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A01
            X.0UO r0 = r0.A0W
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            r0 = 0
            int r1 = java.lang.Float.compare(r1, r0)
            r0 = 0
            if (r1 != 0) goto L44
            r0 = 1
        L44:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.ABz r0 = new X.ABz
            r0.<init>(r3)
            r0.A0J = r1
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.A00()
            r2.A0V = r0
        L55:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r5.A01()
            if (r0 == 0) goto L7e
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r3 = r5.A06
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r1 = r0.A0D
            X.87D r0 = r5.A04
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A01
            X.0UO r0 = r0.A0W
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.put(r1, r0)
            r3.A0B(r2)
        L7e:
            int r0 = r6.intValue()
            switch(r0) {
                case 0: goto Lb6;
                case 1: goto Lad;
                case 2: goto L91;
                case 3: goto L88;
                case 4: goto L85;
                case 5: goto Lc7;
                case 6: goto L85;
                case 7: goto L85;
                case 8: goto Lc7;
                default: goto L85;
            }
        L85:
            r5.A00 = r6
            return
        L88:
            com.instagram.common.session.UserSession r0 = r5.A03
            boolean r0 = X.AbstractC185298Jv.A04(r0)
            if (r0 == 0) goto L85
            goto Lc7
        L91:
            X.87H r3 = r5.A09
            X.2GS r1 = r3.A05
            r2 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A0B(r0)
            X.2GS r0 = r3.A0A
            java.lang.Object r1 = r0.A02()
            X.8Zt r0 = X.EnumC189218Zt.A05
            if (r1 == r0) goto Laa
            r3.A03()
        Laa:
            r5.A02 = r2
            goto L85
        Lad:
            X.87H r0 = r5.A09
            r0.A01()
            r0.A06(r4)
            goto L85
        Lb6:
            boolean r0 = r5.A02
            if (r0 == 0) goto Lc7
            X.87H r0 = r5.A09
            X.2GS r1 = r0.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.A0B(r0)
            r5.A02 = r4
        Lc7:
            X.87H r0 = r5.A09
            r0.A03()
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8BE.A06(java.lang.Integer):void");
    }

    public static final void A00(C8BE c8be, boolean z) {
        int i;
        ClipsAudioStore clipsAudioStore;
        List list = (List) c8be.A05.A0K.A0V.getValue();
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        float f = 1.0f;
        if (z) {
            C87D c87d = c8be.A04;
            if (c87d.A0E() == 1.0f) {
                f = 0.0f;
                clipsAudioStore = c87d.A01;
            } else {
                return;
            }
        } else if (i != 1) {
            return;
        } else {
            clipsAudioStore = c8be.A04.A01;
        }
        clipsAudioStore.A06(f);
    }

    public final AudioOverlayTrack A01() {
        AbstractC193598he abstractC193598he = (AbstractC193598he) this.A05.A0K.A06.A02();
        if (abstractC193598he != null && abstractC193598he.A00 == 3) {
            return (AudioOverlayTrack) abstractC193598he.A00();
        }
        return null;
    }

    public final C47v A02() {
        DownloadedTrack downloadedTrack;
        AbstractC193598he abstractC193598he = (AbstractC193598he) this.A07.A06.getValue();
        if (abstractC193598he instanceof C8ZT) {
            C47v c47v = (C47v) abstractC193598he.A00();
            return new C47v(c47v.A01, c47v.A02, c47v.A03, c47v.A00, true);
        }
        AbstractC12120kG.A07("ClipsAudioMixViewModel", "Missing MediaAudioOverlayInfo from stitched video store.", null);
        C87D c87d = this.A04;
        C47v c47v2 = new C47v(c87d.A0E(), 30);
        boolean z = false;
        AudioOverlayTrack A01 = A01();
        if (A01 != null && (downloadedTrack = A01.A06) != null) {
            C5JH c5jh = new C5JH(null, C5JI.A04, null, downloadedTrack.A02, null, null, ((Number) c87d.A01.A0W.getValue()).floatValue(), 1.0f, 0, downloadedTrack.A00(A01.A03), -1);
            C14360o3.A0B(c5jh, 0);
            c47v2.A03.add(c5jh);
            z = true;
        }
        c47v2.A04 = !z;
        return c47v2;
    }

    public final void A04(AudioOverlayTrack audioOverlayTrack) {
        int i;
        ClipsCreationViewModel clipsCreationViewModel = this.A05;
        List list = (List) clipsCreationViewModel.A0K.A0V.getValue();
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        C447024a c447024a = AnonymousClass229.A01(this.A03).A02;
        if (i > 1) {
            c447024a.A02();
        } else {
            C24P c24p = c447024a.A00;
            String.valueOf(c24p.A00.A0J());
            String.valueOf(c24p.A00());
            C447024a.A00(c447024a, "user_post_capture_music_remove");
        }
        this.A08.A01(EnumC191648eM.A08);
        A00(this, false);
        clipsCreationViewModel.A0e(audioOverlayTrack, false);
    }

    public final void A05(AudioOverlayTrack audioOverlayTrack, String str, boolean z) {
        AnonymousClass229.A01(this.A03).A02.A06(str, z);
        A00(this, false);
        this.A05.A0e(audioOverlayTrack, false);
    }
}
