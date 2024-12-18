package X;

import android.content.Context;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsVirtualVideoStore$audioOverlayVolumeFlow$1;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.84b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1816984b {
    public final Context A00;
    public final UserSession A01;
    public final C84S A02;
    public final C84G A03;
    public final C49602Pt A04;
    public final C0UO A05;
    public final C0UO A06;
    public final ClipsAudioStore A07;
    public final C84R A08;
    public final C0UO A09;
    public final C0UO A0A;
    public final C0UO A0B;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final void A00(C1816984b c1816984b, C195868lW c195868lW, List list) {
        AudioOverlayTrack audioOverlayTrack;
        AbstractC193598he abstractC193598he;
        Object obj;
        ?? singletonList;
        ClipsAudioStore clipsAudioStore = c1816984b.A07;
        AbstractC193598he abstractC193598he2 = (AbstractC193598he) clipsAudioStore.A0Y.getValue();
        String str = null;
        if (!(abstractC193598he2 instanceof C8ZT) || (audioOverlayTrack = (AudioOverlayTrack) abstractC193598he2.A00()) == null) {
            audioOverlayTrack = clipsAudioStore.A00;
        }
        int A02 = clipsAudioStore.A02(false);
        List list2 = (List) clipsAudioStore.A0V.getValue();
        if (A02 > 1) {
            if (list2 != null) {
                singletonList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Object obj2 = ((AbstractC193598he) it.next()).A01;
                    if (obj2 != null) {
                        singletonList.add(obj2);
                    }
                }
            }
            singletonList = 0;
        } else {
            if (list2 != null && (abstractC193598he = (AbstractC193598he) AbstractC001800i.A0J(list2)) != null && (obj = abstractC193598he.A01) != null) {
                singletonList = Collections.singletonList(obj);
                C14360o3.A07(singletonList);
            }
            singletonList = 0;
        }
        UserSession userSession = c1816984b.A01;
        C84R c84r = c1816984b.A08;
        AnonymousClass844 anonymousClass844 = c84r.A01;
        if (anonymousClass844 != null) {
            str = anonymousClass844.BVY();
        }
        AHY.A02((MusicProduct) c84r.A03.A02(), c84r.A00, userSession, audioOverlayTrack, c195868lW, str, c84r.A02, null, singletonList, list, !c84r.A04.isEmpty());
    }

    public static final void A01(Exception exc, String str) {
        C0f5 AEp = C18950wb.A01.AEp("ClipsVirtualVideoStore", 817898016);
        AEp.ABW(DialogModule.KEY_MESSAGE, str);
        if (exc != null) {
            AEp.ERI(exc);
        }
        AEp.report();
    }

    public C1816984b(Context context, UserSession userSession, ClipsAudioStore clipsAudioStore, C84R c84r, C84S c84s, C84G c84g, C49602Pt c49602Pt, C19L c19l) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c84s;
        this.A07 = clipsAudioStore;
        this.A03 = c84g;
        this.A08 = c84r;
        this.A04 = c49602Pt;
        C0UO c0uo = c84s.A06;
        InterfaceC19390xP interfaceC19390xP = c84s.A04;
        C0UO c0uo2 = clipsAudioStore.A0k;
        C0UO c0uo3 = clipsAudioStore.A0Z;
        C0UO c0uo4 = clipsAudioStore.A0c;
        C0UO c0uo5 = clipsAudioStore.A0b;
        C0UO c0uo6 = clipsAudioStore.A0X;
        C1817084c c1817084c = C1817084c.A00;
        C007802s A02 = AnonymousClass111.A02(new C9DF(this, (InterfaceC23621Ds) null, 13), C10Q.A00(new C50632MWt(null, c1817084c, 0), C10Q.A00(C1817284e.A00, c0uo, interfaceC19390xP, c0uo2), C10Q.A00(C1817384f.A00, c0uo3, c0uo4, c0uo5), c0uo6));
        C10H c10h = C10I.A01;
        C193588hd c193588hd = C193588hd.A00;
        this.A05 = AbstractC208910l.A01(c193588hd, c19l, A02, c10h);
        this.A06 = AbstractC208910l.A01(c193588hd, c19l, AnonymousClass111.A02(new C9DF(this, (InterfaceC23621Ds) null, 14), C10Q.A03(C1817484g.A00, interfaceC19390xP, clipsAudioStore.A0d)), c10h);
        AnonymousClass059 A01 = AbstractC208910l.A01(new HashMap(), c19l, C10Q.A01(new ClipsVirtualVideoStore$audioOverlayVolumeFlow$1(null), c0uo2, clipsAudioStore.A0W, clipsAudioStore.A0n, clipsAudioStore.A0g), c10h);
        this.A09 = A01;
        C0UO c0uo7 = c84s.A07;
        C0UO c0uo8 = c84g.A03;
        C84i c84i = C84i.A00;
        AnonymousClass059 A012 = AbstractC208910l.A01(c193588hd, c19l, AnonymousClass111.A02(new C9DF(this, (InterfaceC23621Ds) null, 12), C10Q.A03(new MU8((InterfaceC23621Ds) null, c84i, 12), C10Q.A00(C1817684k.A00, c0uo7, c0uo8, c0uo3), C10Q.A00(C1817784l.A00, c0uo4, c0uo5, c0uo6))), c10h);
        this.A0A = A012;
        this.A0B = AbstractC208910l.A01(c193588hd, c19l, AnonymousClass111.A02(new C9DF(this, (InterfaceC23621Ds) null, 15), C10Q.A03(C84m.A00, A01, A012)), c10h);
    }
}
