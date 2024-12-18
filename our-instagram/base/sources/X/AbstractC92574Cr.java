package X;

import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.music.common.model.MusicConsumptionModel;
import java.util.List;

/* renamed from: X.4Cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC92574Cr {
    public static final int A00(AudioFilterType audioFilterType) {
        if (audioFilterType == null) {
            return 2131955581;
        }
        switch (audioFilterType.ordinal()) {
            case 1:
                return 2131955828;
            case 2:
                return 2131955829;
            case 3:
                return 2131955830;
            case 4:
                return 2131955831;
            case 5:
                return 2131955832;
            case 6:
                return 2131955833;
            case 7:
                return 2131955834;
            default:
                return 2131955581;
        }
    }

    public static final EnumC185288Jt A02(AudioFilterType audioFilterType) {
        if (audioFilterType != null) {
            switch (audioFilterType.ordinal()) {
                case 1:
                    return EnumC185288Jt.A0A;
                case 2:
                    return EnumC185288Jt.A0B;
                case 3:
                    return EnumC185288Jt.A0D;
                case 4:
                    return EnumC185288Jt.A0E;
                case 5:
                    return EnumC185288Jt.A0F;
                case 6:
                    return EnumC185288Jt.A0G;
                case 7:
                    return EnumC185288Jt.A0H;
            }
        }
        return EnumC185288Jt.A0C;
    }

    public static final boolean A04(C3x9 c3x9) {
        MusicCanonicalType musicCanonicalType;
        MusicInfo BVc;
        MusicConsumptionModel BVa;
        List Ado;
        if (c3x9 != null) {
            musicCanonicalType = c3x9.Ae6();
        } else {
            musicCanonicalType = null;
        }
        if (musicCanonicalType != MusicCanonicalType.A04 || (BVc = c3x9.BVc()) == null || (BVa = BVc.BVa()) == null || (Ado = BVa.Ado()) == null || !(!Ado.isEmpty())) {
            return false;
        }
        return true;
    }

    public static final boolean A05(C3x9 c3x9) {
        MusicCanonicalType musicCanonicalType;
        OriginalSoundDataIntf BZw;
        List Ado;
        if (c3x9 != null) {
            musicCanonicalType = c3x9.Ae6();
        } else {
            musicCanonicalType = null;
        }
        if (musicCanonicalType != MusicCanonicalType.A05 || (BZw = c3x9.BZw()) == null || (Ado = BZw.Ado()) == null || !(!Ado.isEmpty())) {
            return false;
        }
        return true;
    }

    public static final AudioFilterType A01(C3x9 c3x9) {
        OriginalSoundDataIntf BZw;
        List Ado;
        AudioFilterInfoIntf audioFilterInfoIntf;
        MusicInfo BVc;
        MusicConsumptionModel BVa;
        if (A04(c3x9)) {
            if (c3x9 == null || (BVc = c3x9.BVc()) == null || (BVa = BVc.BVa()) == null) {
                return null;
            }
            Ado = BVa.Ado();
        } else {
            if (!A05(c3x9) || c3x9 == null || (BZw = c3x9.BZw()) == null) {
                return null;
            }
            Ado = BZw.Ado();
        }
        if (Ado == null || (audioFilterInfoIntf = (AudioFilterInfoIntf) AbstractC001800i.A0J(Ado)) == null) {
            return null;
        }
        return audioFilterInfoIntf.B6T();
    }

    public static final boolean A03(C3x9 c3x9) {
        if (!A05(c3x9) && !A04(c3x9)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (X.C14360o3.A0K(r0.CT1(), true) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r0 = r3.Ae6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        r1 = r0.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r1 == 2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r1 != 1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r0 = r3.BVc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        r0 = r0.BVa();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r1 = r0.Ado();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if ((r1 instanceof java.util.Collection) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r1.isEmpty() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (X.AbstractC185298Jv.A02(r4) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        r2 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r2.hasNext() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (A02(((com.instagram.api.schemas.AudioFilterInfoIntf) r2.next()).B6T()).A06 != X.C05F.A01) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        r0 = r3.BZw();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        r1 = r0.Ado();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
    
        if (X.AbstractC185298Jv.A03(r4) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
    
        if (X.C14360o3.A0K(r0.CT1(), true) != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A06(X.C3x9 r3, com.instagram.common.session.UserSession r4) {
        /*
            boolean r0 = A03(r3)
            if (r0 == 0) goto L57
            if (r3 == 0) goto Lb1
            com.instagram.api.schemas.MusicCanonicalType r1 = r3.Ae6()
        Lc:
            com.instagram.api.schemas.MusicCanonicalType r0 = com.instagram.api.schemas.MusicCanonicalType.A05
            r2 = 1
            if (r1 != r0) goto L89
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r3.BZw()
            if (r0 == 0) goto Lac
            java.lang.Boolean r1 = r0.CT1()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lac
        L25:
            com.instagram.api.schemas.MusicCanonicalType r0 = r3.Ae6()
            if (r0 == 0) goto L82
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L59
            if (r1 != r2) goto L82
            com.instagram.api.schemas.MusicInfo r0 = r3.BVc()
            if (r0 == 0) goto L82
            com.instagram.music.common.model.MusicConsumptionModel r0 = r0.BVa()
            if (r0 == 0) goto L82
            java.util.List r1 = r0.Ado()
        L44:
            if (r1 == 0) goto L82
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L64
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L64
        L50:
            boolean r1 = X.AbstractC185298Jv.A02(r4)
            r0 = 1
            if (r1 != 0) goto L58
        L57:
            r0 = 0
        L58:
            return r0
        L59:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r3.BZw()
            if (r0 == 0) goto L82
            java.util.List r1 = r0.Ado()
            goto L44
        L64:
            java.util.Iterator r2 = r1.iterator()
        L68:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r2.next()
            com.instagram.api.schemas.AudioFilterInfoIntf r0 = (com.instagram.api.schemas.AudioFilterInfoIntf) r0
            com.instagram.api.schemas.AudioFilterType r0 = r0.B6T()
            X.8Jt r0 = A02(r0)
            java.lang.Integer r1 = r0.A06
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L68
        L82:
            boolean r0 = X.AbstractC185298Jv.A03(r4)
            if (r0 == 0) goto L57
            goto L50
        L89:
            if (r3 != 0) goto Lac
            r1 = 0
        L8c:
            com.instagram.api.schemas.MusicCanonicalType r0 = com.instagram.api.schemas.MusicCanonicalType.A04
            if (r1 != r0) goto L57
            com.instagram.api.schemas.MusicInfo r0 = r3.BVc()
            if (r0 == 0) goto L57
            com.instagram.api.schemas.TrackData r0 = r0.BVV()
            if (r0 == 0) goto L57
            java.lang.Boolean r1 = r0.CT1()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L57
            goto L25
        Lac:
            com.instagram.api.schemas.MusicCanonicalType r1 = r3.Ae6()
            goto L8c
        Lb1:
            r1 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC92574Cr.A06(X.3x9, com.instagram.common.session.UserSession):boolean");
    }
}
