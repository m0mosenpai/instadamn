package com.instagram.creation.capture.quickcapture.sundial.store;

import X.AbstractC001800i;
import X.AbstractC06930Yk;
import X.AbstractC16960so;
import X.AbstractC185298Jv;
import X.AbstractC18560vj;
import X.AbstractC193598he;
import X.AbstractC208910l;
import X.AbstractC23641Du;
import X.AbstractC58232lf;
import X.AnonymousClass111;
import X.AnonymousClass191;
import X.AnonymousClass195;
import X.C003701c;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C06090Tz;
import X.C09530e4;
import X.C0UO;
import X.C10E;
import X.C10H;
import X.C10I;
import X.C10Q;
import X.C12W;
import X.C14360o3;
import X.C15340po;
import X.C15430py;
import X.C16930sl;
import X.C17s;
import X.C18U;
import X.C193588hd;
import X.C19L;
import X.C206259Bi;
import X.C206639Cu;
import X.C2GT;
import X.C49602Pt;
import X.C84B;
import X.C84G;
import X.C84J;
import X.C84K;
import X.C84L;
import X.C84P;
import X.C8ZT;
import X.C9D0;
import X.C9DE;
import X.C9DN;
import X.C9M9;
import X.EnumC192868gS;
import X.InterfaceC19390xP;
import android.content.Context;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore$special$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore$special$$inlined$map$2$2;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class ClipsAudioStore {
    public AudioOverlayTrack A00;
    public AnonymousClass195 A01;
    public boolean A02;
    public final Context A03;
    public final C003701c A04;
    public final C2GT A05;
    public final C2GT A06;
    public final C2GT A07;
    public final UserSession A08;
    public final C84L A09;
    public final C84K A0A;
    public final C49602Pt A0B;
    public final List A0C;
    public final C12W A0D;
    public final C19L A0E;
    public final InterfaceC19390xP A0F;
    public final C05A A0G;
    public final C05A A0H;
    public final C05A A0I;
    public final C05A A0J;
    public final C05A A0K;
    public final C05A A0L;
    public final C05A A0M;
    public final C05A A0N;
    public final C05A A0O;
    public final C05A A0P;
    public final C05A A0Q;
    public final C05A A0R;
    public final C05A A0S;
    public final C05A A0T;
    public final C05A A0U;
    public final C0UO A0V;
    public final C0UO A0W;
    public final C0UO A0X;
    public final C0UO A0Y;
    public final C0UO A0Z;
    public final C0UO A0a;
    public final C0UO A0b;
    public final C0UO A0c;
    public final C0UO A0d;
    public final C0UO A0e;
    public final C0UO A0f;
    public final C0UO A0g;
    public final C0UO A0h;
    public final C0UO A0i;
    public final C0UO A0j;
    public final C0UO A0k;
    public final C0UO A0l;
    public final C0UO A0m;
    public final C0UO A0n;
    public final C84G A0o;
    public final C05A A0p;
    public final C05A A0q;
    public final C0UO A0r;
    public final C0UO A0s;
    public final C0UO A0t;

    public final void A08(AbstractC193598he abstractC193598he) {
        boolean z;
        OriginalAudioSubtype originalAudioSubtype;
        int i;
        int i2;
        C14360o3.A0B(abstractC193598he, 0);
        if (C9M9.A00(abstractC193598he)) {
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) abstractC193598he.A01;
            if (audioOverlayTrack != null && audioOverlayTrack.A04 == 0 && ((i2 = audioOverlayTrack.A01) == 0 || i2 == audioOverlayTrack.A02)) {
                z = true;
            } else {
                z = false;
            }
            this.A02 = !z;
            if (abstractC193598he.A00 == 3 && audioOverlayTrack != null && audioOverlayTrack.A04 + audioOverlayTrack.A02 < A00(this)) {
                MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                if (musicAssetModel != null) {
                    originalAudioSubtype = musicAssetModel.A01;
                } else {
                    originalAudioSubtype = null;
                }
                if (originalAudioSubtype != OriginalAudioSubtype.A06 && AbstractC185298Jv.A00(this.A08)) {
                    audioOverlayTrack.A01 = audioOverlayTrack.A04 + audioOverlayTrack.A02;
                    ArrayList A1N = AbstractC16960so.A1N(abstractC193598he);
                    int i3 = audioOverlayTrack.A01;
                    while (i3 < A00(this) && i3 != 0) {
                        if (audioOverlayTrack.A02 + i3 >= A00(this)) {
                            i = 0;
                        } else {
                            i = audioOverlayTrack.A02 + i3;
                        }
                        int i4 = audioOverlayTrack.A03;
                        int i5 = audioOverlayTrack.A02;
                        String str = audioOverlayTrack.A0B;
                        String str2 = audioOverlayTrack.A0A;
                        String str3 = audioOverlayTrack.A0E;
                        MusicBrowseCategory musicBrowseCategory = audioOverlayTrack.A09;
                        MusicAssetModel musicAssetModel2 = audioOverlayTrack.A08;
                        AudioOverlayTrack audioOverlayTrack2 = new AudioOverlayTrack(audioOverlayTrack.A05, audioOverlayTrack.A06, audioOverlayTrack.A07, musicAssetModel2, musicBrowseCategory, str, str2, str3, audioOverlayTrack.A0C, audioOverlayTrack.A00, i4, i5, i3, i);
                        String obj = UUID.randomUUID().toString();
                        C14360o3.A07(obj);
                        audioOverlayTrack2.A0D = obj;
                        A1N.add(new C8ZT(audioOverlayTrack2));
                        i3 = audioOverlayTrack2.A01;
                    }
                    A0C(A1N);
                    return;
                }
            }
            this.A0G.Egh(AbstractC16960so.A1N(abstractC193598he));
        }
    }

    public final void A0D(List list) {
        AudioOverlayTrack A03;
        AudioOverlayTrack A01;
        C05A c05a = this.A0G;
        List list2 = (List) c05a.getValue();
        if (list2 != null && list.size() == list2.size()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C09530e4 c09530e4 = (C09530e4) it.next();
                C206259Bi c206259Bi = (C206259Bi) c09530e4.A01;
                if (!C14360o3.A0K(c206259Bi.A01, true) && (A03 = A03((String) c09530e4.A00)) != null && (A01 = A01(c206259Bi, this, A03)) != null) {
                    arrayList.add(new C8ZT(A01));
                }
            }
            c05a.Egh(arrayList);
        }
    }

    public static final int A00(ClipsAudioStore clipsAudioStore) {
        return ((C84B) clipsAudioStore.A0o.A03.getValue()).A00;
    }

    public static final AudioOverlayTrack A01(C206259Bi c206259Bi, ClipsAudioStore clipsAudioStore, AudioOverlayTrack audioOverlayTrack) {
        int i;
        int i2;
        int i3;
        int i4;
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        if (musicAssetModel != null) {
            if (musicAssetModel.A00 > 0) {
                Number number = (Number) c206259Bi.A03;
                if (number != null) {
                    i = number.intValue();
                } else {
                    Number number2 = (Number) c206259Bi.A04;
                    i = audioOverlayTrack.A03;
                    if (number2 != null && (i = i + (number2.intValue() - audioOverlayTrack.A04)) < 0) {
                        i = 0;
                    }
                }
                Number number3 = (Number) c206259Bi.A04;
                if (number3 != null) {
                    i2 = number3.intValue();
                } else {
                    i2 = audioOverlayTrack.A04;
                }
                Number number4 = (Number) c206259Bi.A02;
                if (number4 != null) {
                    i3 = number4.intValue();
                } else {
                    i3 = audioOverlayTrack.A01;
                }
                if (i >= 0 && (i4 = audioOverlayTrack.A02) > 0 && i2 >= 0 && i3 >= 0) {
                    if (i3 == A00(clipsAudioStore)) {
                        i3 = 0;
                    }
                    String str = audioOverlayTrack.A0B;
                    String str2 = audioOverlayTrack.A0A;
                    String str3 = audioOverlayTrack.A0E;
                    MusicBrowseCategory musicBrowseCategory = audioOverlayTrack.A09;
                    DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
                    AudioOverlayTrack audioOverlayTrack2 = new AudioOverlayTrack(audioOverlayTrack.A05, downloadedTrack, audioOverlayTrack.A07, musicAssetModel, musicBrowseCategory, str, str2, str3, audioOverlayTrack.A0C, audioOverlayTrack.A00, i, i4, i2, i3);
                    String str4 = audioOverlayTrack.A0D;
                    C14360o3.A0B(str4, 0);
                    audioOverlayTrack2.A0D = str4;
                    return audioOverlayTrack2;
                }
            }
            return null;
        }
        throw new IllegalStateException("Music asset should not be null when adjusting audio");
    }

    public final int A02(boolean z) {
        List list = (List) this.A0V.getValue();
        if (list == null || list.isEmpty()) {
            return 0;
        }
        if (!z && !this.A02 && AbstractC185298Jv.A00(this.A08)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((AbstractC193598he) obj).A00 == 3) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            if (1 <= size) {
                return 1;
            }
            return size;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((AbstractC193598he) obj2).A00 == 3) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2.size();
    }

    public final AudioOverlayTrack A03(String str) {
        List list;
        if (str != null && (list = (List) this.A0G.getValue()) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) ((AbstractC193598he) it.next()).A01;
                if (audioOverlayTrack != null && C14360o3.A0K(audioOverlayTrack.A0D, str)) {
                    return audioOverlayTrack;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.io.File r11, java.lang.String r12, java.lang.String r13, X.InterfaceC23621Ds r14) {
        /*
            r10 = this;
            r4 = 38
            boolean r0 = X.MAG.A01(r14, r4)
            if (r0 == 0) goto L6a
            r2 = r14
            X.MAG r2 = (X.MAG) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L6a
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r4 = r2.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r2.A00
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 != r3) goto L70
            java.lang.Object r6 = r2.A01
            X.0ps r6 = (X.C15370ps) r6
            X.AbstractC09560e7.A00(r4)
        L28:
            java.lang.Object r0 = r6.A00
            return r0
        L2b:
            X.AbstractC09560e7.A00(r4)
            X.2Pt r0 = r10.A0B
            java.io.File r0 = r0.A01()
            java.io.File r4 = new java.io.File
            r4.<init>(r0, r12)
            java.lang.String r0 = "_audio"
            java.lang.String r0 = X.AnonymousClass001.A0R(r13, r0)
            java.io.File r7 = new java.io.File
            r7.<init>(r4, r0)
            X.0ps r6 = new X.0ps
            r6.<init>()
            r5 = r11
            r6.A00 = r11
            boolean r0 = r7.exists()
            if (r0 != 0) goto L67
            X.12W r0 = r10.A0D
            r8 = 0
            r9 = 39
            X.MC7 r4 = new X.MC7
            r4.<init>(r5, r6, r7, r8, r9)
            r2.A01 = r6
            r2.A00 = r3
            java.lang.Object r0 = X.AbstractC23641Du.A00(r2, r0, r4)
            if (r0 != r1) goto L28
            return r1
        L67:
            r6.A00 = r7
            goto L28
        L6a:
            X.MAG r2 = new X.MAG
            r2.<init>(r10, r14, r4)
            goto L16
        L70:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore.A04(java.io.File, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public final void A05() {
        this.A0G.Egh(AbstractC16960so.A1N(C193588hd.A00));
    }

    public final void A06(float f) {
        this.A0q.Egh(Float.valueOf(C17s.A02(f, 0.0f, 1.0f)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.8bb] */
    public final void A07(float f) {
        C05A c05a = this.A0K;
        float A01 = C17s.A01(f);
        ?? obj = new Object();
        obj.A00 = A01;
        c05a.Egh(obj);
    }

    public final void A0A(EnumC192868gS enumC192868gS) {
        if (C18U.A06(C06090Tz.A05, this.A08, 36323706653388285L)) {
            this.A0T.Egh(enumC192868gS);
        }
    }

    public final void A0B(HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        C05A c05a = this.A0G;
        List<AbstractC193598he> list = (List) c05a.getValue();
        if (list != null) {
            for (AbstractC193598he abstractC193598he : list) {
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) abstractC193598he.A01;
                if (audioOverlayTrack != null) {
                    String str = audioOverlayTrack.A0D;
                    if (hashMap.get(str) != null) {
                        Number number = (Number) hashMap.get(str);
                        if (number != null) {
                            float floatValue = number.floatValue();
                            if (floatValue != audioOverlayTrack.A00) {
                                this.A02 = true;
                            }
                            int i = audioOverlayTrack.A03;
                            int i2 = audioOverlayTrack.A02;
                            int i3 = audioOverlayTrack.A04;
                            int i4 = audioOverlayTrack.A01;
                            String str2 = audioOverlayTrack.A0B;
                            String str3 = audioOverlayTrack.A0A;
                            String str4 = audioOverlayTrack.A0E;
                            MusicBrowseCategory musicBrowseCategory = audioOverlayTrack.A09;
                            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                            DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
                            AudioOverlayTrack audioOverlayTrack2 = new AudioOverlayTrack(audioOverlayTrack.A05, downloadedTrack, audioOverlayTrack.A07, musicAssetModel, musicBrowseCategory, str2, str3, str4, audioOverlayTrack.A0C, floatValue, i, i2, i3, i4);
                            String str5 = audioOverlayTrack.A0D;
                            C14360o3.A0B(str5, 0);
                            audioOverlayTrack2.A0D = str5;
                            abstractC193598he = new C8ZT(audioOverlayTrack2);
                        }
                    }
                }
                arrayList.add(abstractC193598he);
            }
        }
        c05a.Egh(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0E() {
        /*
            r3 = this;
            X.05A r0 = r3.A0G
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L36
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L13:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.next()
            X.8he r0 = (X.AbstractC193598he) r0
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L13
            r2.add(r0)
            goto L13
        L27:
            java.lang.Object r0 = X.AbstractC001800i.A0J(r2)
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            if (r0 == 0) goto L36
            com.instagram.music.common.model.MusicAssetModel r0 = r0.A08
            if (r0 == 0) goto L36
            com.instagram.api.schemas.OriginalAudioSubtype r2 = r0.A01
            goto L37
        L36:
            r2 = 0
        L37:
            com.instagram.api.schemas.OriginalAudioSubtype r1 = com.instagram.api.schemas.OriginalAudioSubtype.A06
            r0 = 0
            if (r2 != r1) goto L3d
            r0 = 1
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore.A0E():boolean");
    }

    public final boolean A0F() {
        AbstractC193598he abstractC193598he;
        AudioOverlayTrack audioOverlayTrack;
        String str;
        String str2;
        C05A c05a = this.A0G;
        List list = (List) c05a.getValue();
        if (list != null && (abstractC193598he = (AbstractC193598he) AbstractC001800i.A0J(list)) != null && (audioOverlayTrack = (AudioOverlayTrack) abstractC193598he.A01) != null && (str = audioOverlayTrack.A0A) != null) {
            List list2 = (List) c05a.getValue();
            if (list2 != null && (!(list2 instanceof Collection) || !list2.isEmpty())) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    AudioOverlayTrack audioOverlayTrack2 = (AudioOverlayTrack) ((AbstractC193598he) it.next()).A01;
                    if (audioOverlayTrack2 != null) {
                        str2 = audioOverlayTrack2.A0A;
                    } else {
                        str2 = null;
                    }
                    if (!C14360o3.A0K(str2, str)) {
                        break;
                    }
                }
            }
            if (A0E() || this.A02 || !AbstractC185298Jv.A00(this.A08)) {
                break;
            }
            return true;
        }
        return false;
    }

    public ClipsAudioStore(Context context, UserSession userSession, C84G c84g, C49602Pt c49602Pt, C12W c12w, C19L c19l) {
        this.A03 = context;
        this.A08 = userSession;
        this.A0o = c84g;
        this.A0E = c19l;
        this.A0D = c12w;
        this.A0B = c49602Pt;
        final C008002u A00 = C10E.A00(null);
        this.A0G = A00;
        this.A0V = A00;
        C15430py c15430py = new C15430py(A00);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A05 = AbstractC58232lf.A00(anonymousClass191, c15430py);
        C008002u A002 = C10E.A00(null);
        this.A0p = A002;
        this.A0X = AbstractC208910l.A02(A002);
        C84K c84k = new C84K(new C84J(c49602Pt));
        this.A0A = c84k;
        C84L c84l = new C84L(c49602Pt, c19l, A00(this));
        this.A09 = c84l;
        C15430py c15430py2 = new C15430py(new InterfaceC19390xP() { // from class: X.84N
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new ClipsAudioStore$special$$inlined$map$1$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        });
        C10H c10h = C10I.A01;
        C193588hd c193588hd = C193588hd.A00;
        this.A0Y = AbstractC208910l.A01(c193588hd, c19l, c15430py2, c10h);
        this.A06 = AbstractC58232lf.A00(anonymousClass191, new C15430py(new InterfaceC19390xP() { // from class: X.84O
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new ClipsAudioStore$special$$inlined$map$2$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        }));
        C008002u A003 = C10E.A00(c193588hd);
        this.A0M = A003;
        this.A0d = A003;
        this.A0C = new ArrayList();
        C16930sl c16930sl = C16930sl.A00;
        C008002u A004 = C10E.A00(c16930sl);
        this.A0S = A004;
        this.A0l = A004;
        C008002u A005 = C10E.A00(null);
        this.A0N = A005;
        this.A0s = A005;
        this.A0F = C10Q.A03(new C9DE(this, null, 0), A004, A005);
        C05A c05a = c84k.A03;
        this.A07 = AbstractC58232lf.A00(anonymousClass191, c05a);
        Float valueOf = Float.valueOf(1.0f);
        C008002u c008002u = new C008002u(valueOf);
        this.A0q = c008002u;
        this.A0k = AbstractC208910l.A02(c008002u);
        C008002u c008002u2 = new C008002u(valueOf);
        this.A0H = c008002u2;
        this.A0W = AbstractC208910l.A02(c008002u2);
        C008002u c008002u3 = new C008002u(valueOf);
        this.A0U = c008002u3;
        this.A0n = AbstractC208910l.A02(c008002u3);
        C008002u c008002u4 = new C008002u(valueOf);
        this.A0O = c008002u4;
        this.A0g = AbstractC208910l.A02(c008002u4);
        C008002u c008002u5 = new C008002u(valueOf);
        this.A0Q = c008002u5;
        this.A0i = AbstractC208910l.A02(c008002u5);
        C0UO c0uo = c84l.A04;
        this.A0f = c0uo;
        this.A0j = AbstractC208910l.A02(c05a);
        C008002u A006 = C10E.A00(c16930sl);
        this.A0P = A006;
        this.A0h = AbstractC208910l.A02(A006);
        C008002u A007 = C10E.A00(new C84P(new LinkedHashMap(), new LinkedHashMap()));
        this.A0I = A007;
        this.A0r = AbstractC208910l.A02(A007);
        final C008002u A008 = C10E.A00(AbstractC06930Yk.A0E());
        this.A0J = A008;
        this.A0a = AbstractC208910l.A02(A008);
        C008002u A009 = C10E.A00(AbstractC06930Yk.A0E());
        this.A0R = A009;
        this.A0t = AbstractC208910l.A02(A009);
        this.A0e = c0uo;
        this.A0Z = AbstractC208910l.A01(null, c19l, AnonymousClass111.A02(new C9DN(this, null), new InterfaceC19390xP() { // from class: X.84Q
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new ClipsAudioStore$special$$inlined$filterNot$1$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        }), c10h);
        C008002u A0010 = C10E.A00(null);
        this.A0T = A0010;
        this.A0m = AbstractC208910l.A02(A0010);
        C008002u A0011 = C10E.A00(null);
        this.A0L = A0011;
        this.A0c = AbstractC208910l.A02(A0011);
        C008002u A0012 = C10E.A00(null);
        this.A0K = A0012;
        this.A0b = AbstractC208910l.A02(A0012);
        this.A04 = new C003701c(50);
        AbstractC18560vj.A03(c19l, new C15340po(new C9D0(this, null, 37), c84g.A03));
        AbstractC23641Du.A03(C05F.A00, anonymousClass191, new C206639Cu(this, null, 46), c19l);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(X.AbstractC193598he r9, com.instagram.music.common.model.AudioOverlayTrack r10) {
        /*
            r8 = this;
            boolean r0 = X.C9M9.A00(r9)
            if (r0 == 0) goto L99
            r0 = 1
            r8.A02 = r0
            X.05A r5 = r8.A0G
            java.lang.Object r0 = r5.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            if (r0 == 0) goto L37
            r4.<init>(r0)
        L18:
            boolean r0 = r9 instanceof X.C8ZT
            if (r0 == 0) goto L3e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r4.iterator()
        L25:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C193588hd
            if (r0 == 0) goto L25
            r3.add(r1)
            goto L25
        L37:
            r4.<init>()
            goto L18
        L3b:
            r4.removeAll(r3)
        L3e:
            r3 = 0
            r7 = 0
            r2 = -1
            java.util.Iterator r6 = r4.iterator()
            if (r10 == 0) goto L68
        L47:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r6.next()
            X.8he r0 = (X.AbstractC193598he) r0
            java.lang.Object r0 = r0.A01
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            if (r0 == 0) goto L66
            java.lang.String r1 = r0.A0D
        L5b:
            java.lang.String r0 = r10.A0D
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L91
            int r3 = r3 + 1
            goto L47
        L66:
            r1 = r7
            goto L5b
        L68:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r6.next()
            X.8he r0 = (X.AbstractC193598he) r0
            java.lang.Object r0 = r0.A01
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            if (r0 == 0) goto L8f
            java.lang.String r1 = r0.A0D
        L7c:
            java.lang.Object r0 = r9.A01
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            if (r0 == 0) goto L8d
            java.lang.String r0 = r0.A0D
        L84:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L91
            int r3 = r3 + 1
            goto L68
        L8d:
            r0 = r7
            goto L84
        L8f:
            r1 = r7
            goto L7c
        L91:
            if (r3 == r2) goto L9a
            r4.set(r3, r9)
        L96:
            r5.Egh(r4)
        L99:
            return
        L9a:
            r4.add(r9)
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore.A09(X.8he, com.instagram.music.common.model.AudioOverlayTrack):void");
    }

    public final void A0C(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!C9M9.A00((AbstractC193598he) it.next())) {
                return;
            }
        }
        this.A0G.Egh(list);
    }
}
