package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class BL8 extends C3r5 {
    public final ClipsViewerSource A00;
    public final UserSession A01;
    public final C3r4 A02;
    public final C23031Ai A03;
    public final User A04;
    public final BMT A05;
    public final C26882Btj A06;
    public final C37640GhZ A07;
    public final BMU A08;
    public final BMX A09;
    public final BMY A0A;
    public final C26883Btk A0B;
    public final C37522Gfe A0C;
    public final boolean A0D;

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0195, code lost:
    
        if (r5 == X.C05F.A00) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01a3, code lost:
    
        if (A02(r45, r0) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01d6, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r0, 36328345218137563L) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x031a, code lost:
    
        if (X.C18U.A06(r5, r0, 36329032413429726L) == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02af, code lost:
    
        if (X.C18U.A06(r5, r0, 36329032413429726L) == false) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.BLE A05(X.C25377BKu r43, com.instagram.clips.intf.ClipsViewerConfig r44, X.C120985dq r45, X.C37644Ghd r46, int r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BL8.A05(X.BKu, com.instagram.clips.intf.ClipsViewerConfig, X.5dq, X.Ghd, int, boolean):X.BLE");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r8.A00 == X.EnumC25466BOf.A0D) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7.A01, 36329706722705910L) == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.AbstractC25460BNz A00(X.C25377BKu r8, X.C120985dq r9) {
        /*
            r7 = this;
            X.5t1 r1 = r9.A01
            X.5t1 r0 = X.EnumC129395t1.A0G
            r6 = 1
            r5 = 0
            if (r1 != r0) goto L9
            r5 = 1
        L9:
            boolean r0 = r9.CdW()
            if (r0 == 0) goto L1f
            com.instagram.common.session.UserSession r3 = r7.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36329706722705910(0x8111ad000041f6, double:3.0383910472017435E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r4 = 1
            if (r0 != 0) goto L20
        L1f:
            r4 = 0
        L20:
            if (r5 != 0) goto L2b
            if (r4 != 0) goto L2b
            X.BOf r1 = r8.A00
            X.BOf r0 = X.EnumC25466BOf.A0D
            r3 = 0
            if (r1 != r0) goto L2c
        L2b:
            r3 = 1
        L2c:
            X.1qM r2 = r9.A02
            if (r2 == 0) goto L83
            X.1rF r0 = r2.A0C
            if (r4 == 0) goto L55
            com.instagram.user.model.User r0 = r0.CDj()
            if (r0 == 0) goto L81
            r0.Bhu()
        L3d:
            if (r3 == 0) goto L83
            boolean r0 = r8.A0E
            if (r0 == 0) goto L83
            if (r6 == 0) goto L83
            X.1qM r1 = r9.A02
            com.instagram.common.session.UserSession r0 = r7.A01
            boolean r0 = X.AbstractC76643c9.A0H(r0, r1)
            if (r0 != 0) goto L83
            X.BOD r0 = new X.BOD
            r0.<init>(r2)
            return r0
        L55:
            X.3x9 r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L61
            X.3xD r0 = X.AbstractC117245Sj.A01(r0)
            if (r0 != 0) goto L3d
        L61:
            X.1rF r0 = r2.A0C
            X.3XR r0 = r0.getMusicMetadata()
            if (r0 == 0) goto L81
            com.instagram.api.schemas.MusicInfo r1 = r0.BVc()
            if (r1 == 0) goto L75
            X.3xC r0 = new X.3xC
            r0.<init>(r1)
            goto L3d
        L75:
            com.instagram.api.schemas.OriginalSoundDataIntf r1 = r0.BZw()
            if (r1 == 0) goto L81
            X.5Si r0 = new X.5Si
            r0.<init>(r1)
            goto L3d
        L81:
            r6 = 0
            goto L3d
        L83:
            X.BQe r0 = X.C25516BQe.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BL8.A00(X.BKu, X.5dq):X.BNz");
    }

    private final InterfaceC30879Dhs A01(ClipsViewerConfig clipsViewerConfig, C38321qM c38321qM) {
        InterfaceC30879Dhs interfaceC30879Dhs;
        int i;
        if (!clipsViewerConfig.A1r && !clipsViewerConfig.A1T) {
            boolean A4a = c38321qM.A4a();
            UserSession userSession = this.A01;
            if (BO2.A02(userSession, c38321qM)) {
                if (A4a) {
                    i = 2131976906;
                } else {
                    i = 2131969691;
                    if (C18U.A06(C06090Tz.A05, userSession, 36320820435493801L)) {
                        i = 2131969689;
                    }
                }
            } else {
                i = 2131969688;
                if (A4a) {
                    i = 2131976905;
                }
            }
            interfaceC30879Dhs = new BO3(c38321qM, i);
        } else {
            interfaceC30879Dhs = D0J.A00;
        }
        return interfaceC30879Dhs;
    }

    public static final boolean A02(C120985dq c120985dq, UserSession userSession) {
        if (AdFormatType.A04 == c120985dq.A0E && !C18U.A06(C06090Tz.A05, userSession, 36321713789544157L)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ BL8(ClipsViewerSource clipsViewerSource, UserSession userSession, C3r4 c3r4, BMT bmt, C26882Btj c26882Btj, C37640GhZ c37640GhZ, BMU bmu, BMX bmx, BMY bmy, C26883Btk c26883Btk, C37522Gfe c37522Gfe, boolean z) {
        User A10 = AbstractC166987dD.A10(userSession);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        AbstractC25234BEr.A0k(3, clipsViewerSource, bmt, c37640GhZ, bmu);
        AbstractC25234BEr.A0l(8, c3r4, bmx, bmy, c26882Btj);
        AbstractC25229BEm.A1N(c26883Btk, 12, A00);
        this.A01 = userSession;
        this.A0C = c37522Gfe;
        this.A00 = clipsViewerSource;
        this.A0D = z;
        this.A05 = bmt;
        this.A07 = c37640GhZ;
        this.A08 = bmu;
        this.A02 = c3r4;
        this.A09 = bmx;
        this.A0A = bmy;
        this.A06 = c26882Btj;
        this.A0B = c26883Btk;
        this.A04 = A10;
        this.A03 = A00;
    }
}
