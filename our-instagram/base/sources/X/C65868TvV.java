package X;

import com.instagram.autoplay.models.AutoplayPlaybackState;
import com.instagram.autoplay.models.AutoplayScreenItemWithoutMetadata;
import java.util.Map;

/* renamed from: X.TvV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65868TvV {
    public final C65863TvQ A00;
    public final C66110Tzo A01;
    public final C68711Van A02;
    public final C65870TvX A03;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C50162MDp(this, 35));
    public final C66111Tzp A05;
    public final C66112Tzq A06;
    public final C65871TvY A07;

    /* JADX WARN: Code restructure failed: missing block: B:119:0x046c, code lost:
    
        X.AbstractC16960so.A1T();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0473, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x007f, code lost:
    
        if (r8 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0094, code lost:
    
        if (X.C14360o3.A0K(X.AbstractC001800i.A0L(X.C65863TvQ.A00(r4, r4.A01())), r8) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0096, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0097, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0098, code lost:
    
        if (r13 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x009a, code lost:
    
        r2 = com.instagram.autoplay.models.AutoplayCustomizationSelectionReason.FIRST_CHOICE_OR_CUSTOMIZATION_MISSING;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x009c, code lost:
    
        if (r0 >= 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x009e, code lost:
    
        r2 = r6.A01;
        r0 = r2.A00;
        r1 = com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType.COULD_NOT_DOWNGRADE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x00a4, code lost:
    
        if (r0 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x00a6, code lost:
    
        X.C66110Tzo.A00(r2, null, null, r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00f2, code lost:
    
        if (r0 >= X.C65863TvQ.A00(r4, r4.A01()).size()) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00f4, code lost:
    
        r5.A01((com.instagram.autoplay.models.AutoplayCustomization) X.AbstractC001800i.A0O(X.C65863TvQ.A00(r4, r4.A01()), r0));
        r1 = r2.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x010a, code lost:
    
        if (r1 == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x010d, code lost:
    
        if (r1 == 2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x010f, code lost:
    
        if (r1 == 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0112, code lost:
    
        if (r1 != 3) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0114, code lost:
    
        r3 = r6.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x011c, code lost:
    
        if (r4.A01.BBP() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x011e, code lost:
    
        r2 = com.instagram.autoplay.models.AutoplayInitialSelectionSource.CACHED_FROM_LAST_SESSION;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0120, code lost:
    
        X.C66110Tzo.A00(r3, null, r2, com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType.INITIAL, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0127, code lost:
    
        r2 = com.instagram.autoplay.models.AutoplayInitialSelectionSource.LOCAL_NO_CACHE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0479, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x012a, code lost:
    
        X.C66110Tzo.A00(r6.A01, null, null, com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType.UPGRADE, com.instagram.autoplay.models.AutoplayUpgradeReason.TO_BE_DETERMINED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x013b, code lost:
    
        r3 = r6.A01;
        r2 = com.instagram.autoplay.models.AutoplayDowngradeReason.MEMORY_CONSTRAINED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x013f, code lost:
    
        X.C66110Tzo.A00(r3, r2, null, com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType.DOWNGRADE, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0136, code lost:
    
        r3 = r6.A01;
        r2 = com.instagram.autoplay.models.AutoplayDowngradeReason.NETWORK_TOO_MUCH_BUFFERING;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x016f, code lost:
    
        r2 = r6.A01;
        r0 = r2.A00;
        r1 = com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType.COULD_NOT_UPGRADE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0147, code lost:
    
        if (r10 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0149, code lost:
    
        r2 = com.instagram.autoplay.models.AutoplayCustomizationSelectionReason.NOT_ENOUGH_MEMORY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x014d, code lost:
    
        if (r15 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x014f, code lost:
    
        r0 = r3 - 1;
        r2 = com.instagram.autoplay.models.AutoplayCustomizationSelectionReason.TOO_MUCH_BUFFERING;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0155, code lost:
    
        if (r1 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0157, code lost:
    
        if (r14 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0159, code lost:
    
        r0 = r3 + 1;
        r2 = com.instagram.autoplay.models.AutoplayCustomizationSelectionReason.CAN_BUFFER_MORE_AND_HAS_MEMORY_AVAILABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x015f, code lost:
    
        if (r8 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0161, code lost:
    
        if (r14 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0163, code lost:
    
        if (r0 != (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x016d, code lost:
    
        if (r6.A02.A00() <= r8.maxConcurrentBuffering) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0177, code lost:
    
        r1 = X.C65863TvQ.A00(r4, r4.A01());
        r12 = r1.listIterator(r1.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x018b, code lost:
    
        if (r12.hasPrevious() == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x018d, code lost:
    
        r11 = r12.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x019c, code lost:
    
        if (((com.instagram.autoplay.models.AutoplayCustomization) r11).maxConcurrentPlaying > r6.A02.A00()) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x01a2, code lost:
    
        if (X.C14360o3.A0K(r11, r8) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x01a4, code lost:
    
        r0 = X.C65863TvQ.A00(r4, r4.A01());
        X.C14360o3.A0B(r0, 0);
        r0 = r0.indexOf(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x01b3, code lost:
    
        if (r0 == (-1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x01b5, code lost:
    
        if (r0 == r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x01b7, code lost:
    
        if (r0 <= r3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x01b9, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x01be, code lost:
    
        if (r0 >= r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x01c0, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01bc, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0082, code lost:
    
        if (r8 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            Method dump skipped, instructions count: 1147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65868TvV.A00():void");
    }

    public final void A01(C38321qM c38321qM, boolean z) {
        C14360o3.A0B(AnonymousClass001.A19("onScreenStateChanged: ", c38321qM.getId(), ", isOnScreen ", z), 0);
        C65871TvY c65871TvY = this.A07;
        Map map = c65871TvY.A02;
        String id = c38321qM.getId();
        if (z) {
            if (id != null) {
                map.put(id, new AutoplayScreenItemWithoutMetadata(c38321qM, System.currentTimeMillis()));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            C15500q5.A04(map).remove(id);
            Map map2 = c65871TvY.A03;
            C15500q5.A04(map2).remove(c38321qM.getId());
            C65870TvX c65870TvX = c65871TvY.A01;
            AutoplayPlaybackState autoplayPlaybackState = c65870TvX.A01(c38321qM).currentState;
            if (autoplayPlaybackState == AutoplayPlaybackState.PLAYBACK_REQUESTED || autoplayPlaybackState == AutoplayPlaybackState.PLAYING || autoplayPlaybackState == AutoplayPlaybackState.BUFFERING || autoplayPlaybackState == AutoplayPlaybackState.PLAYING_AND_LOOPED_ONCE) {
                c65870TvX.A02(AutoplayPlaybackState.PAUSED, c38321qM);
                c65871TvY.A00.Eoc(c38321qM);
            }
        }
        ((C44213JgH) this.A04.getValue()).A00();
    }

    public C65868TvV(C65863TvQ c65863TvQ, C66110Tzo c66110Tzo, C66111Tzp c66111Tzp, C66112Tzq c66112Tzq, C68711Van c68711Van, C65870TvX c65870TvX, C65871TvY c65871TvY) {
        this.A00 = c65863TvQ;
        this.A07 = c65871TvY;
        this.A03 = c65870TvX;
        this.A05 = c66111Tzp;
        this.A06 = c66112Tzq;
        this.A01 = c66110Tzo;
        this.A02 = c68711Van;
    }
}
