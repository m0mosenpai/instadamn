package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Oey, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55228Oey {
    public static final C09530e4 A0C;
    public int A00;
    public C54749OGy A01;
    public String A02;
    public C09530e4 A03;
    public C09530e4 A04;
    public final HashMap A05;
    public final C01U A06;
    public final C05A A07;
    public final C05A A08;
    public final C0UO A09;
    public final C0UO A0A;
    public final boolean A0B;

    public static final C51831MvZ A01(Context context, C5RR c5rr) {
        int i;
        Integer CBq;
        C5NL C0T = c5rr.C0T();
        if (C0T != null && (CBq = C0T.CBq()) != null) {
            switch (CBq.intValue()) {
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case 25:
                case 26:
                    i = 2131955959;
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    i = 2131955956;
                    break;
                case 32:
                    i = 2131955960;
                    break;
                case 33:
                    i = 2131955961;
                    break;
                case 36:
                    i = 2131955962;
                    break;
            }
            return new C51831MvZ(EnumC53185Nfh.A04, c5rr, C05F.A00, AbstractC166997dE.A0p(context, i), 0, false);
        }
        i = 2131955957;
        return new C51831MvZ(EnumC53185Nfh.A04, c5rr, C05F.A00, AbstractC166997dE.A0p(context, i), 0, false);
    }

    public static final void A08(C55228Oey c55228Oey, ArrayList arrayList, HashSet hashSet, int i, int i2) {
        if (c55228Oey.A0W(i, i2)) {
            C51832Mva A0H = c55228Oey.A0H(i, i2);
            int i3 = i + 1;
            C05A c05a = c55228Oey.A08;
            if (i3 == MSZ.A09(c05a)) {
                c55228Oey.A0N();
            } else if (i3 < MSZ.A09(c05a)) {
                int i4 = A0H.A05;
                int i5 = A0H.A02;
                if (A0D(c55228Oey, i3, i4, i5)) {
                    int i6 = 0;
                    while (i6 < MSY.A03(c55228Oey, i3)) {
                        C51832Mva A0H2 = c55228Oey.A0H(i3, i6);
                        int i7 = A0H2.A05;
                        int i8 = A0H2.A02;
                        if (i7 < i5 && i8 > i4) {
                            A08(c55228Oey, arrayList, hashSet, i3, i6);
                            i6--;
                        }
                        i6++;
                    }
                }
            }
            int A00 = A00(A0H, c55228Oey, i3, false);
            A0C(A0H, c55228Oey, i, false, true);
            AbstractC166997dE.A1W(hashSet, i);
            AbstractC166997dE.A1W(hashSet, i3);
            String str = A0H.A0B;
            c55228Oey.A09(str, i, i2, i3, A00);
            if (arrayList != null) {
                arrayList.add(new C26068Bfw(str, i3, A00));
            }
        }
    }

    public static final boolean A0D(C55228Oey c55228Oey, int i, int i2, int i3) {
        if (i >= 0 && i < MSZ.A09(c55228Oey.A08)) {
            for (C51832Mva c51832Mva : c55228Oey.A0I(i)) {
                int i4 = c51832Mva.A05;
                int i5 = c51832Mva.A02;
                if (i4 < i3 && i5 > i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C09530e4 A0M(String str) {
        C14360o3.A0B(str, 0);
        Iterator A0x = MSZ.A0x(this.A0A);
        int i = 0;
        while (A0x.hasNext()) {
            Object next = A0x.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            List list = (List) next;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next2 = it.next();
                    if (C14360o3.A0K(((C51832Mva) next2).A0B, str)) {
                        if (next2 != null) {
                            return AbstractC167007dF.A0o(Integer.valueOf(i), list.indexOf(next2));
                        }
                    }
                }
            }
            i = i2;
        }
        return null;
    }

    public final boolean A0V(int i) {
        return i >= 0 && i < MSZ.A09(this.A07);
    }

    public final boolean A0W(int i, int i2) {
        if (i >= 0) {
            C05A c05a = this.A08;
            return i < MSZ.A09(c05a) && i2 >= 0 && i2 < ((AbstractCollection) ((AbstractList) c05a.getValue()).get(i)).size();
        }
        return false;
    }

    public final boolean A0X(Context context, C5RO c5ro) {
        C14360o3.A0B(context, 0);
        int Bzk = c5ro.Bzk();
        int B25 = c5ro.B25();
        if (Bzk < 0 || Bzk >= B25 || (c5ro.Afg() instanceof AbstractC210529Sr)) {
            return false;
        }
        C05A c05a = this.A08;
        if (MSZ.A09(c05a) == 0) {
            A0N();
        }
        List A1B = MSW.A1B(this.A0A);
        int size = A1B.size();
        int i = 0;
        loop0: while (true) {
            if (i < size) {
                int size2 = ((Collection) A1B.get(i)).size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C51832Mva c51832Mva = (C51832Mva) AbstractC25225BEi.A13(A1B.get(i), i2);
                    int i3 = c51832Mva.A05;
                    int Bzk2 = c5ro.Bzk();
                    if (i3 > Bzk2 || c51832Mva.A02 <= Bzk2) {
                        int i4 = c51832Mva.A05;
                        int B252 = c5ro.B25();
                        if (i4 >= B252 || c51832Mva.A02 < B252) {
                        }
                    }
                    i++;
                }
                break loop0;
            }
            i = MSZ.A09(c05a) - 1;
            break;
        }
        if (A00(A03(context, c5ro), this, i, false) == -1) {
            A0N();
            if (A00(A03(context, c5ro), this, i + 1, false) == -1) {
                return false;
            }
        }
        return true;
    }

    public final boolean A0Y(C51832Mva c51832Mva) {
        C14360o3.A0B(c51832Mva, 0);
        int A09 = MSZ.A09(this.A08);
        for (int i = 0; i < A09; i++) {
            int A03 = MSY.A03(this, i);
            for (int i2 = 0; i2 < A03; i2++) {
                if (c51832Mva.equals(A0H(i, i2))) {
                    return A0C(A0H(i, i2), this, i, true, true);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r0 >= r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0076, code lost:
    
        if (r11 < X.MSZ.A09(r6)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0078, code lost:
    
        r4 = r6.getValue();
        r3 = (java.util.AbstractList) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007f, code lost:
    
        if (r11 < 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0085, code lost:
    
        if (r11 >= X.MSZ.A09(r6)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0087, code lost:
    
        X.MSW.A16(r3, r11).add(r2, r9.A03(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0096, code lost:
    
        if (r6.AIi(r4, r3) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (r12 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009b, code lost:
    
        r10.A0S(r11, r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
    
        if (X.AbstractC25225BEi.A1a(r10.A04, r5) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
    
        if (r11 != X.MSZ.A06(r10)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b1, code lost:
    
        if (r2 >= X.MSZ.A07(r10)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b3, code lost:
    
        r10.A0S(r11, X.MSZ.A07(r10) + 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bc, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bd, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(X.C51832Mva r9, X.C55228Oey r10, int r11, boolean r12) {
        /*
            X.05A r6 = r10.A08
            int r0 = X.MSZ.A09(r6)
            r3 = -1
            if (r11 >= r0) goto Lbf
            int r5 = r9.A05
            int r4 = r9.A02
            int r0 = X.MSZ.A09(r6)
            r2 = -1
            if (r11 >= r0) goto L31
            r1 = 0
        L15:
            int r0 = X.MSY.A03(r10, r11)
            if (r1 >= r0) goto L4a
            X.Mva r7 = r10.A0H(r11, r1)
            X.Nfh r8 = r7.A09
            X.Nfh r0 = X.EnumC53185Nfh.A0A
            if (r8 != r0) goto L34
            X.Ms7 r0 = r7.A08
            if (r0 == 0) goto L34
            java.lang.Boolean r0 = r0.A06
            boolean r0 = X.AbstractC31177DnL.A1b(r0)
            if (r0 == 0) goto L34
        L31:
            if (r2 != r3) goto L4c
            return r2
        L34:
            int r0 = r7.A05
            if (r0 > r5) goto L44
            int r0 = r7.A02
            if (r0 > r5) goto L3f
            int r1 = r1 + 1
            goto L15
        L3f:
            int r0 = r7.A02
            if (r0 < r5) goto L44
            goto L31
        L44:
            int r0 = r7.A05
            if (r0 < r5) goto L15
            if (r0 < r4) goto L31
        L4a:
            r2 = r1
            goto L31
        L4c:
            X.0e4 r0 = r10.A04
            X.0e4 r5 = X.C55228Oey.A0C
            boolean r0 = X.C14360o3.A0K(r0, r5)
            if (r0 != 0) goto L72
            int r0 = X.MSZ.A06(r10)
            if (r11 != r0) goto L72
            int r0 = X.MSZ.A07(r10)
            if (r2 > r0) goto L72
            X.0e4 r0 = r10.A04
            java.lang.Object r1 = r0.A00
            int r0 = X.AbstractC25229BEm.A0A(r0)
            int r0 = r0 + 1
            X.0e4 r0 = X.AbstractC167007dF.A0o(r1, r0)
            r10.A04 = r0
        L72:
            int r0 = X.MSZ.A09(r6)
            if (r11 >= r0) goto Lbf
        L78:
            java.lang.Object r4 = r6.getValue()
            r3 = r4
            java.util.AbstractList r3 = (java.util.AbstractList) r3
            if (r11 < 0) goto Lbd
            int r0 = X.MSZ.A09(r6)
            if (r11 >= r0) goto Lbd
            java.util.AbstractList r1 = X.MSW.A16(r3, r11)
            X.Mva r0 = r9.A03(r12)
            r1.add(r2, r0)
            boolean r0 = r6.AIi(r4, r3)
            if (r0 == 0) goto L78
            r1 = 1
            if (r12 == 0) goto L9f
            r10.A0S(r11, r2, r1)
        L9e:
            return r2
        L9f:
            X.0e4 r0 = r10.A04
            boolean r0 = X.AbstractC25225BEi.A1a(r0, r5)
            if (r0 == 0) goto L9e
            int r0 = X.MSZ.A06(r10)
            if (r11 != r0) goto L9e
            int r0 = X.MSZ.A07(r10)
            if (r2 >= r0) goto L9e
            int r0 = X.MSZ.A07(r10)
            int r0 = r0 + 1
            r10.A0S(r11, r0, r1)
            return r2
        Lbd:
            r2 = -1
            return r2
        Lbf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55228Oey.A00(X.Mva, X.Oey, int, boolean):int");
    }

    public static final C51832Mva A02(Context context, C55228Oey c55228Oey, AudioOverlayTrack audioOverlayTrack, List list, int i, boolean z) {
        String A0p;
        Integer num;
        Integer num2;
        float f;
        String str = audioOverlayTrack.A0D;
        EnumC53185Nfh enumC53185Nfh = EnumC53185Nfh.A06;
        boolean A1W = AbstractC167007dF.A1W(list);
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        if (!A1W) {
            A0p = AbstractC25227BEk.A0u(context, 2131955889);
        } else {
            int i2 = 2131955893;
            if (c55228Oey.A0B) {
                i2 = 2131953762;
            }
            String A0p2 = AbstractC166997dE.A0p(context, i2);
            if (musicAssetModel != null) {
                A0p = AbstractC166997dE.A0z(A0p2, MSX.A1b(musicAssetModel.A0I, musicAssetModel.A0D, 2));
            } else {
                A0p = AbstractC166997dE.A0p(context, 2131955894);
            }
        }
        int i3 = audioOverlayTrack.A04;
        int i4 = audioOverlayTrack.A01;
        int i5 = i4;
        if (i4 == 0) {
            i5 = i;
        }
        if (list != null) {
            num = C05F.A00;
        } else {
            num = C05F.A0Y;
        }
        int i6 = audioOverlayTrack.A03;
        int i7 = audioOverlayTrack.A02;
        String str2 = audioOverlayTrack.A0D;
        MusicAssetModel musicAssetModel2 = audioOverlayTrack.A08;
        if (musicAssetModel2 != null) {
            i7 = musicAssetModel2.A00;
        }
        EnumC185288Jt enumC185288Jt = audioOverlayTrack.A05;
        if (enumC185288Jt != null) {
            num2 = Integer.valueOf(enumC185288Jt.A03);
            f = enumC185288Jt.A01;
        } else {
            num2 = null;
            f = 1.0f;
        }
        return new C51832Mva(null, null, new C51676Ms7(false, num2, str2, list, f, i, i6, i7, i7, 0), enumC53185Nfh, num, str, A0p, i3, i5, i3, i4, 0, 0, z, false);
    }

    public static final C51832Mva A03(Context context, C5RO c5ro) {
        String valueOf;
        C50679MYx c50679MYx;
        int i;
        String id = c5ro.getId();
        EnumC53185Nfh CBd = c5ro.CBd();
        int ordinal = c5ro.CBd().ordinal();
        if (ordinal != 0 && ordinal != 4) {
            if (ordinal != 3) {
                i = 2131955957;
            } else {
                Drawable Afg = c5ro.Afg();
                C14360o3.A0C(Afg, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.karaoke.view.common.KaraokeCaptionStickerDrawable");
                valueOf = AbstractC25226BEj.A1H(" ", ((C5RU) Afg).A05().A07, C57621PhX.A00);
                if (AbstractC001900j.A0T(valueOf)) {
                    i = 2131955958;
                }
            }
            valueOf = AbstractC166997dE.A0p(context, i);
        } else {
            valueOf = String.valueOf(c5ro.C5r());
        }
        int Bzk = c5ro.Bzk();
        int B25 = c5ro.B25();
        VoiceOption voiceOption = (VoiceOption) c5ro.CBG().A01;
        if (voiceOption != null) {
            String str = voiceOption.A02;
            String str2 = voiceOption.A00;
            if (str != null && str2 != null) {
                c50679MYx = new C50679MYx(str, str2, 25);
                return new C51832Mva(new C51756Mtf(c5ro, 35), c50679MYx, null, CBd, C05F.A00, id, valueOf, Bzk, B25, Bzk, B25, 0, 0, false, false);
            }
        }
        c50679MYx = null;
        return new C51832Mva(new C51756Mtf(c5ro, 35), c50679MYx, null, CBd, C05F.A00, id, valueOf, Bzk, B25, Bzk, B25, 0, 0, false, false);
    }

    public static final C51832Mva A04(Context context, C24239Ap6 c24239Ap6, int i) {
        String string;
        String str = c24239Ap6.A06;
        if (str == null) {
            str = "";
        }
        EnumC53185Nfh enumC53185Nfh = EnumC53185Nfh.A0A;
        int i2 = c24239Ap6.A04;
        if (i2 > 0) {
            string = AbstractC31177DnL.A0a(context, i2, 2131955920);
        } else {
            string = context.getString(2131955919);
        }
        C14360o3.A0A(string);
        int i3 = c24239Ap6.A03;
        int i4 = c24239Ap6.A02;
        int i5 = c24239Ap6.A00 - c24239Ap6.A01;
        return new C51832Mva(null, null, new C51676Ms7(Boolean.valueOf(c24239Ap6.A08), null, "", c24239Ap6.A07, 1.0f, i, c24239Ap6.A05, i4 - i3, i5, 0), enumC53185Nfh, C05F.A00, str, string, i3, i4, i3, i4, 0, 0, false, false);
    }

    public static final void A06(C55228Oey c55228Oey) {
        Object value;
        AbstractList abstractList;
        int i = c55228Oey.A00;
        C05A c05a = c55228Oey.A07;
        do {
            value = c05a.getValue();
            abstractList = (AbstractList) value;
            if (c55228Oey.A0V(i)) {
                C51831MvZ c51831MvZ = (C51831MvZ) abstractList.get(i);
                Integer num = C05F.A00;
                EnumC53185Nfh enumC53185Nfh = c51831MvZ.A02;
                String str = c51831MvZ.A04;
                C5RR c5rr = c51831MvZ.A00;
                int i2 = c51831MvZ.A01;
                AbstractC167017dG.A1N(enumC53185Nfh, str);
                C14360o3.A0B(num, 4);
                abstractList.set(i, new C51831MvZ(enumC53185Nfh, c5rr, num, str, i2, false));
            } else {
                return;
            }
        } while (!c05a.AIi(value, abstractList));
        c55228Oey.A00 = -1;
    }

    private final void A09(String str, int i, int i2, int i3, int i4) {
        AbstractList abstractList;
        C26068Bfw c26068Bfw;
        int i5;
        HashMap hashMap = this.A05;
        Iterator A0l = AbstractC167007dF.A0l(hashMap);
        while (A0l.hasNext()) {
            Object A0l2 = AbstractC166997dE.A0l(A0l);
            AbstractList abstractList2 = (AbstractList) hashMap.get(A0l2);
            if (abstractList2 != null) {
                int size = abstractList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    if (!C14360o3.A0K(((C26068Bfw) abstractList2.get(i6)).A02, str)) {
                        int i7 = ((C26068Bfw) abstractList2.get(i6)).A01;
                        C26068Bfw c26068Bfw2 = (C26068Bfw) abstractList2.get(i6);
                        if (i7 == i3) {
                            if (i4 <= c26068Bfw2.A00 && (abstractList = (AbstractList) hashMap.get(A0l2)) != null) {
                                c26068Bfw = (C26068Bfw) abstractList2.get(i6);
                                i5 = ((C26068Bfw) abstractList2.get(i6)).A00 + 1;
                                String str2 = c26068Bfw.A02;
                                int i8 = c26068Bfw.A01;
                                C14360o3.A0B(str2, 0);
                                abstractList.set(i6, new C26068Bfw(str2, i8, i5));
                            }
                        } else if (c26068Bfw2.A01 == i && i2 < ((C26068Bfw) abstractList2.get(i6)).A00 && (abstractList = (AbstractList) hashMap.get(A0l2)) != null) {
                            c26068Bfw = (C26068Bfw) abstractList2.get(i6);
                            i5 = ((C26068Bfw) abstractList2.get(i6)).A00 - 1;
                            String str22 = c26068Bfw.A02;
                            int i82 = c26068Bfw.A01;
                            C14360o3.A0B(str22, 0);
                            abstractList.set(i6, new C26068Bfw(str22, i82, i5));
                        }
                    }
                }
            }
        }
    }

    private final void A0A(HashSet hashSet, C51u c51u) {
        HashMap hashMap = this.A05;
        ArrayList arrayList = (ArrayList) hashMap.get(c51u);
        if (arrayList != null) {
            while (AbstractC25226BEj.A1b(arrayList)) {
                AbstractC166997dE.A1W(hashSet, ((C26068Bfw) AbstractC001800i.A0K(arrayList)).A01);
                AbstractC166997dE.A1W(hashSet, ((C26068Bfw) AbstractC001800i.A0K(arrayList)).A01 - 1);
                int i = ((C26068Bfw) AbstractC001800i.A0K(arrayList)).A01;
                int i2 = ((C26068Bfw) AbstractC001800i.A0K(arrayList)).A00;
                if (A0W(i, i2)) {
                    C51832Mva A0H = A0H(i, i2);
                    int i3 = i - 1;
                    int A00 = A00(A0H, this, i3, false);
                    if (A00 != -1) {
                        A0C(A0H, this, i, false, true);
                        A09(A0H.A0B, i, i2, i3, A00);
                        if (i3 == MSZ.A06(this) && A00 <= MSZ.A07(this)) {
                            A0S(i3, MSZ.A07(this) + 1, true);
                        }
                    } else if (i3 >= 0 && i3 < MSZ.A09(this.A08)) {
                        int i4 = 0;
                        int A03 = MSY.A03(this, i3);
                        while (true) {
                            if (i4 < A03) {
                                C51832Mva A0H2 = A0H(i3, i4);
                                int i5 = A0H.A05;
                                int i6 = A0H.A02;
                                int i7 = A0H2.A05;
                                int i8 = A0H2.A02;
                                if (i7 < i6 && i8 > i5) {
                                    if (i4 != -1) {
                                        Iterator A0l = AbstractC167007dF.A0l(hashMap);
                                        while (true) {
                                            if (A0l.hasNext()) {
                                                Object A0l2 = AbstractC166997dE.A0l(A0l);
                                                AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(A0l2);
                                                if (abstractCollection != null) {
                                                    Iterator A13 = AbstractC166997dE.A13(abstractCollection);
                                                    while (A13.hasNext()) {
                                                        C26068Bfw c26068Bfw = (C26068Bfw) AbstractC166997dE.A0l(A13);
                                                        if (c26068Bfw.A01 == i3 && c26068Bfw.A00 == i4) {
                                                            Object obj = hashMap.get(A0l2);
                                                            C14360o3.A0C(obj, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.creation.capture.quickcapture.sundial.edit.model.TimedElementsStore.RevertableElementShift>");
                                                            ((AbstractList) obj).add(0, new C26068Bfw(c26068Bfw.A02, i, i2));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                }
                arrayList.remove(AbstractC001800i.A0K(arrayList));
            }
        }
    }

    public static final boolean A0C(C51832Mva c51832Mva, C55228Oey c55228Oey, int i, boolean z, boolean z2) {
        int i2;
        Object value;
        AbstractList abstractList;
        C05A c05a = c55228Oey.A08;
        if (i < MSZ.A09(c05a)) {
            i2 = 0;
            int A03 = MSY.A03(c55228Oey, i);
            while (i2 < A03) {
                if (C14360o3.A0K(c51832Mva.A0B, c55228Oey.A0H(i, i2).A0B)) {
                    break;
                }
                i2++;
            }
        }
        i2 = -1;
        if (i2 != -1) {
            C09530e4 c09530e4 = c55228Oey.A04;
            C09530e4 c09530e42 = A0C;
            if (AbstractC25225BEi.A1a(c09530e4, c09530e42) && MSZ.A06(c55228Oey) == i && MSZ.A07(c55228Oey) == i2 && c55228Oey.A0W(i, i2) && c55228Oey.A0H(i, i2).A0D) {
                c55228Oey.A04 = c09530e42;
            }
            boolean z3 = false;
            do {
                value = c05a.getValue();
                abstractList = (AbstractList) value;
                if (c55228Oey.A0W(i, i2)) {
                    MSW.A16(abstractList, i).remove(i2);
                    z3 = true;
                }
            } while (!c05a.AIi(value, abstractList));
            if (z3) {
                if (AbstractC25225BEi.A1a(c55228Oey.A04, c09530e42) && MSZ.A06(c55228Oey) == i && i2 < MSZ.A07(c55228Oey)) {
                    c55228Oey.A0S(MSZ.A06(c55228Oey), MSZ.A07(c55228Oey) - 1, true);
                }
                if (c55228Oey.A0I(i).isEmpty() && ((i == MSZ.A09(c05a) - 1 && z2) || z)) {
                    c55228Oey.A0O(i);
                }
                return true;
            }
        }
        return false;
    }

    public final int A0E() {
        return MSZ.A09(this.A08);
    }

    public final int A0F(C51832Mva c51832Mva) {
        C05A c05a = this.A08;
        if (MSZ.A09(c05a) == 0) {
            A0N();
        }
        int A09 = MSZ.A09(c05a) - 1;
        if (A00(c51832Mva, this, A09, false) == -1) {
            A0N();
            int i = A09 + 1;
            if (A00(c51832Mva, this, i, false) == -1) {
                return -1;
            }
            return i;
        }
        return A09;
    }

    public final C51832Mva A0G() {
        if (!AbstractC25225BEi.A1a(this.A04, A0C)) {
            return null;
        }
        return A0H(MSZ.A06(this), MSZ.A07(this));
    }

    public final C51832Mva A0H(int i, int i2) {
        return (C51832Mva) AbstractC25225BEi.A13(AbstractC25225BEi.A13(this.A0A.getValue(), i), i2);
    }

    public final List A0I(int i) {
        return (List) AbstractC25225BEi.A13(this.A0A.getValue(), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x011c, code lost:
    
        if (r4.A0A != X.C05F.A0j) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0126, code lost:
    
        if (r4.A0A != X.C05F.A15) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0146, code lost:
    
        if (r3 > r1) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A0K(X.InterfaceC16610sE r31, int r32, int r33, boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55228Oey.A0K(X.0sE, int, int, boolean, boolean, boolean, boolean):java.util.List");
    }

    public final C09530e4 A0L(C5RO c5ro) {
        Object obj;
        Iterator A0x = MSZ.A0x(this.A0A);
        int i = 0;
        while (A0x.hasNext()) {
            Object next = A0x.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            List list = (List) next;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next2 = it.next();
                    C51756Mtf c51756Mtf = ((C51832Mva) next2).A06;
                    if (c51756Mtf != null) {
                        obj = c51756Mtf.A00;
                    } else {
                        obj = null;
                    }
                    if (C14360o3.A0K(obj, c5ro)) {
                        if (next2 != null) {
                            return AbstractC167007dF.A0o(Integer.valueOf(i), list.indexOf(next2));
                        }
                    }
                }
            }
            i = i2;
        }
        return null;
    }

    public final void A0N() {
        Object value;
        AbstractCollection abstractCollection;
        C05A c05a = this.A08;
        do {
            value = c05a.getValue();
            abstractCollection = (AbstractCollection) value;
            abstractCollection.add(AbstractC166987dD.A1E());
        } while (!c05a.AIi(value, abstractCollection));
    }

    public final void A0O(int i) {
        Object value;
        AbstractList abstractList;
        C05A c05a = this.A08;
        do {
            value = c05a.getValue();
            abstractList = (AbstractList) value;
            if (i >= 0 && i < MSZ.A09(c05a)) {
                abstractList.remove(i);
            }
            if (AbstractC25225BEi.A1a(this.A04, A0C) && i < MSZ.A06(this)) {
                A0S(MSZ.A06(this) - 1, MSZ.A07(this), true);
            }
        } while (!c05a.AIi(value, abstractList));
    }

    public final void A0P(int i, int i2, String str, String str2) {
        Object value;
        AbstractList abstractList;
        AbstractC167017dG.A1R(str, str2);
        if (A0W(i, i2)) {
            C05A c05a = this.A08;
            do {
                value = c05a.getValue();
                abstractList = (AbstractList) value;
                if (i < abstractList.size() && i2 < ((AbstractCollection) abstractList.get(i)).size()) {
                    MSW.A16(abstractList, i).set(i2, C51832Mva.A00(null, new C50679MYx(str, str2, 25), null, MSZ.A0W(abstractList, i, i2), null, null, 0, 0, 0, 0, 28671, false));
                }
            } while (!c05a.AIi(value, abstractList));
        }
    }

    public final void A0R(int i, int i2, boolean z) {
        Object value;
        AbstractList abstractList;
        Integer num;
        C51832Mva A00;
        C05A c05a = this.A08;
        do {
            value = c05a.getValue();
            abstractList = (AbstractList) value;
            if (A0W(i, i2)) {
                AbstractList A16 = MSW.A16(abstractList, i);
                C51832Mva A0W = MSZ.A0W(abstractList, i, i2);
                if (z) {
                    num = C05F.A01;
                } else if (A0W.AzK()) {
                    num = C05F.A00;
                } else {
                    num = A0W.A0A;
                }
                A00 = C51832Mva.A00(null, null, null, A0W, num, null, 0, 0, 0, 0, 32511, false);
                A16.set(i2, A00);
            } else {
                return;
            }
        } while (!c05a.AIi(value, abstractList));
        if (z) {
            A0S(i, i2, z);
        }
    }

    public final void A0T(int i, boolean z) {
        Object value;
        AbstractList abstractList;
        Integer num;
        C05A c05a = this.A07;
        do {
            value = c05a.getValue();
            abstractList = (AbstractList) value;
            if (A0V(i)) {
                C51831MvZ c51831MvZ = (C51831MvZ) abstractList.get(i);
                if (z) {
                    num = C05F.A01;
                } else if (c51831MvZ.AzK()) {
                    num = C05F.A00;
                } else {
                    num = c51831MvZ.A03;
                }
                EnumC53185Nfh enumC53185Nfh = c51831MvZ.A02;
                String str = c51831MvZ.A04;
                C5RR c5rr = c51831MvZ.A00;
                boolean z2 = c51831MvZ.A05;
                int i2 = c51831MvZ.A01;
                AbstractC167017dG.A1N(enumC53185Nfh, str);
                C14360o3.A0B(num, 4);
                abstractList.set(i, new C51831MvZ(enumC53185Nfh, c5rr, num, str, i2, z2));
            } else {
                return;
            }
        } while (!c05a.AIi(value, abstractList));
        if (z) {
            A0U(i, true);
        }
    }

    public final void A0U(int i, boolean z) {
        Object value;
        AbstractList abstractList;
        Integer num;
        int i2 = this.A00;
        if (i2 != -1 && i2 != i) {
            A06(this);
        }
        A07(this);
        C05A c05a = this.A07;
        do {
            value = c05a.getValue();
            abstractList = (AbstractList) value;
            if (A0V(i)) {
                C51831MvZ c51831MvZ = (C51831MvZ) abstractList.get(i);
                if (z) {
                    num = c51831MvZ.A03;
                } else {
                    num = C05F.A00;
                }
                EnumC53185Nfh enumC53185Nfh = c51831MvZ.A02;
                String str = c51831MvZ.A04;
                C5RR c5rr = c51831MvZ.A00;
                int i3 = c51831MvZ.A01;
                AbstractC167017dG.A1N(enumC53185Nfh, str);
                C14360o3.A0B(num, 4);
                abstractList.set(i, new C51831MvZ(enumC53185Nfh, c5rr, num, str, i3, z));
            } else {
                return;
            }
        } while (!c05a.AIi(value, abstractList));
        if (!z) {
            i = -1;
        }
        this.A00 = i;
    }

    static {
        Integer A0o = AbstractC25227BEk.A0o();
        A0C = new C09530e4(A0o, A0o);
    }

    public C55228Oey(boolean z) {
        this.A0B = z;
        C008002u A1H = AbstractC25225BEi.A1H(AbstractC166987dD.A1E());
        this.A08 = A1H;
        this.A0A = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(AbstractC166987dD.A1E());
        this.A07 = A1H2;
        this.A09 = A1H2;
        this.A05 = AbstractC166987dD.A1G();
        this.A06 = new C01U();
        C09530e4 c09530e4 = A0C;
        this.A04 = c09530e4;
        this.A00 = -1;
        this.A03 = c09530e4;
    }

    private final List A05(int i, int i2, int i3, int i4) {
        HashSet A1H = AbstractC166987dD.A1H();
        int i5 = 0;
        while (i5 < MSY.A03(this, i)) {
            if (i5 != i2) {
                C51832Mva A0H = A0H(i, i5);
                int i6 = A0H.A05;
                int i7 = A0H.A02;
                if (i6 < i4 && i7 > i3) {
                    C51832Mva A0H2 = A0H(i, i5);
                    C51u c51u = new C51u(Integer.valueOf(i), Integer.valueOf(A0H2.A04), Integer.valueOf(A0H2.A03));
                    HashMap hashMap = this.A05;
                    hashMap.put(c51u, AbstractC166987dD.A1E());
                    this.A06.add(c51u);
                    A08(this, (ArrayList) hashMap.get(c51u), A1H, i, i5);
                    if (i5 < i2) {
                        i2--;
                        if (AbstractC25225BEi.A1a(this.A04, A0C)) {
                            A0S(i, i2, true);
                        }
                    }
                    i5--;
                }
            }
            i5++;
        }
        return AbstractC001800i.A0a(A1H);
    }

    public static final void A07(C55228Oey c55228Oey) {
        Object value;
        AbstractList abstractList;
        int A06 = MSZ.A06(c55228Oey);
        int A07 = MSZ.A07(c55228Oey);
        C05A c05a = c55228Oey.A08;
        do {
            value = c05a.getValue();
            abstractList = (AbstractList) value;
            if (c55228Oey.A0W(A06, A07)) {
                MSW.A16(abstractList, A06).set(A07, MSZ.A0W(abstractList, A06, A07).A03(false));
            }
        } while (!c05a.AIi(value, abstractList));
        c55228Oey.A04 = A0C;
    }

    private final boolean A0B(int i, int i2, int i3, int i4) {
        int i5;
        if (A0W(i, i2)) {
            C51832Mva A0H = A0H(i, i2);
            if (i3 <= A0H.A05 && i2 > 0 && i3 < A0H(i, i2 - 1).A02) {
                return true;
            }
            if (i4 >= A0H.A02 && (i5 = i2 + 1) < MSY.A03(this, i) && i4 > A0H(i, i5).A05) {
                return true;
            }
        }
        return false;
    }

    public final List A0J(int i, int i2, int i3, int i4) {
        Object value;
        AbstractList abstractList;
        if (!A0W(i, i2)) {
            return C16930sl.A00;
        }
        HashSet A1H = AbstractC166987dD.A1H();
        if (A0B(i, i2, i3, i4)) {
            C54749OGy c54749OGy = this.A01;
            if (c54749OGy != null) {
                c54749OGy.A00(i);
            }
            A1H.addAll(A05(i, i2, i3, i4));
        }
        int A07 = MSZ.A07(this);
        C05A c05a = this.A08;
        do {
            value = c05a.getValue();
            abstractList = (AbstractList) value;
            if (A0W(i, A07)) {
                MSW.A16(abstractList, i).set(A07, ((C51832Mva) MSW.A16(abstractList, i).get(A07)).A02(i3, i4, i3, i4));
            }
        } while (!c05a.AIi(value, abstractList));
        AbstractC166997dE.A1W(A1H, i);
        HashMap hashMap = this.A05;
        Iterator A14 = AbstractC166997dE.A14(hashMap);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            if (AbstractC166987dD.A0H(((C51u) A1K.getKey()).A00) == i) {
                int A0H = AbstractC166987dD.A0H(((C51u) A1K.getKey()).A01);
                int A0H2 = AbstractC166987dD.A0H(((C51u) A1K.getKey()).A02);
                if (A0H >= i4 || A0H2 <= i3) {
                    C51u c51u = (C51u) A1K.getKey();
                    if (c51u != null) {
                        C54749OGy c54749OGy2 = this.A01;
                        if (c54749OGy2 != null) {
                            c54749OGy2.A00(i);
                        }
                        A0A(A1H, c51u);
                        hashMap.remove(c51u);
                    }
                    return AbstractC001800i.A0a(A1H);
                }
            }
        }
        return AbstractC001800i.A0a(A1H);
    }

    public final void A0Q(int i, int i2, boolean z) {
        Object value;
        AbstractList abstractList;
        Integer num;
        C51832Mva A00;
        Integer num2;
        C51832Mva A002;
        if (A0W(i, i2)) {
            if (z) {
                A0S(i, i2, true);
            }
            C05A c05a = this.A08;
            do {
                value = c05a.getValue();
                abstractList = (AbstractList) value;
                int i3 = 0;
                Iterator it = ((Iterable) AbstractC31173DnH.A0i(abstractList, i)).iterator();
                while (it.hasNext()) {
                    it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    AbstractList A16 = MSW.A16(abstractList, i);
                    C51832Mva A0W = MSZ.A0W(abstractList, i, i3);
                    if (z) {
                        num2 = C05F.A0N;
                    } else if (A0W.CGw() == C05F.A0N) {
                        num2 = C05F.A00;
                    } else {
                        num2 = A0W.A0A;
                    }
                    A002 = C51832Mva.A00(null, null, null, A0W, num2, null, 0, 0, 0, 0, 32511, false);
                    A16.set(i3, A002);
                    i3 = i4;
                }
                AbstractList A162 = MSW.A16(abstractList, i);
                C51832Mva A0W2 = MSZ.A0W(abstractList, i, i2);
                if (z) {
                    num = C05F.A0u;
                } else {
                    num = C05F.A00;
                }
                A00 = C51832Mva.A00(null, null, null, A0W2, num, null, 0, 0, 0, 0, 32511, false);
                A162.set(i2, A00);
            } while (!c05a.AIi(value, abstractList));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (X.MSZ.A07(r6) != r8) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0S(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.A0W(r7, r8)
            if (r0 == 0) goto L56
            int r0 = X.MSZ.A06(r6)
            if (r0 != r7) goto L13
            int r0 = X.MSZ.A07(r6)
            r1 = 0
            if (r0 == r8) goto L14
        L13:
            r1 = 1
        L14:
            X.0e4 r0 = r6.A04
            X.0e4 r5 = X.C55228Oey.A0C
            boolean r0 = X.AbstractC25225BEi.A1a(r0, r5)
            if (r0 == 0) goto L23
            if (r1 == 0) goto L23
            A07(r6)
        L23:
            A06(r6)
            X.05A r4 = r6.A08
        L28:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            java.util.AbstractList r2 = (java.util.AbstractList) r2
            boolean r0 = r6.A0W(r7, r8)
            if (r0 == 0) goto L44
            java.util.AbstractList r1 = X.MSW.A16(r2, r7)
            X.Mva r0 = X.MSZ.A0W(r2, r7, r8)
            X.Mva r0 = r0.A03(r9)
            r1.set(r8, r0)
        L44:
            boolean r0 = r4.AIi(r3, r2)
            if (r0 == 0) goto L28
            if (r9 == 0) goto L54
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            X.0e4 r5 = X.AbstractC167007dF.A0o(r0, r8)
        L54:
            r6.A04 = r5
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55228Oey.A0S(int, int, boolean):void");
    }

    public C55228Oey() {
        this(false);
    }
}
