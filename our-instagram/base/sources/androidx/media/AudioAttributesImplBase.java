package androidx.media;

import X.AbstractC166997dE;
import X.AbstractC58318PtA;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import android.util.SparseIntArray;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes10.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int A03 = 0;
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = -1;

    @Override // androidx.media.AudioAttributesImpl
    public final Object Adi() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r2 == 7) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        if ((r3 & 4) == 4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.media.AudioAttributesImplBase
            r5 = 0
            if (r0 == 0) goto L2d
            androidx.media.AudioAttributesImplBase r7 = (androidx.media.AudioAttributesImplBase) r7
            int r1 = r6.A00
            int r0 = r7.A00
            if (r1 != r0) goto L2d
            int r4 = r6.A01
            int r3 = r7.A01
            int r2 = r7.A02
            r0 = -1
            if (r2 == r0) goto L2e
            r0 = 6
            if (r2 == r0) goto L3a
            r0 = 7
            if (r2 != r0) goto L1e
        L1c:
            r3 = r3 | 1
        L1e:
            r0 = r3 & 273(0x111, float:3.83E-43)
            if (r4 != r0) goto L2d
            int r1 = r6.A03
            int r0 = r7.A03
            if (r1 != r0) goto L2d
            int r0 = r6.A02
            if (r0 != r2) goto L2d
            r5 = 1
        L2d:
            return r5
        L2e:
            android.util.SparseIntArray r0 = androidx.media.AudioAttributesCompat.A01
            r1 = r3 & 1
            r0 = 1
            if (r1 == r0) goto L1c
            r1 = 4
            r0 = r3 & 4
            if (r0 != r1) goto L1e
        L3a:
            r3 = r3 | 4
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.AudioAttributesImplBase.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0C(Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A03), Integer.valueOf(this.A02));
    }

    public final String toString() {
        String str;
        StringBuilder A0s = AbstractC58318PtA.A0s("AudioAttributesCompat:");
        int i = this.A02;
        if (i != -1) {
            A0s.append(" stream=");
            A0s.append(i);
            A0s.append(" derived");
        }
        A0s.append(" usage=");
        int i2 = this.A03;
        SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
        switch (i2) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case Process.SIGTERM /* 15 */:
            default:
                str = AnonymousClass001.A0O("unknown usage ", i2);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        A0s.append(str);
        A0s.append(" content=");
        A0s.append(this.A00);
        A0s.append(" flags=0x");
        return AbstractC166997dE.A0x(Integer.toHexString(this.A01).toUpperCase(), A0s);
    }
}
