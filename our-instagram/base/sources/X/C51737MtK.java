package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.AbstractCollection;

/* renamed from: X.MtK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51737MtK extends C0T6 {
    public int A00;
    public int A01;
    public final int A02;

    public C51737MtK(int i, int i2, int i3) {
        this.A02 = i3;
        switch (i3) {
            case 0:
            case 3:
            case 4:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                this.A01 = i;
                this.A00 = i2;
                return;
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 14:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            default:
                this.A00 = i;
                this.A01 = i2;
                return;
        }
    }

    public static void A00(US9 us9, AbstractCollection abstractCollection) {
        float f = us9.A04;
        float f2 = us9.A01;
        abstractCollection.add(new C51737MtK((int) (f / f2), (int) (us9.A02 / f2), 12));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51737MtK.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        switch (this.A02) {
            case 0:
            case 3:
            case 4:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                i = this.A01 * 31;
                i2 = this.A00;
                break;
            case 1:
            case 2:
            case 5:
            case 6:
            case 14:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
                i = this.A00 * 31;
                i2 = this.A01;
                break;
            case 7:
            default:
                return super.hashCode();
        }
        return i + i2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder A1C;
        String str;
        int i;
        switch (this.A02) {
            case 11:
                A1C = AbstractC166987dD.A1C();
                A1C.append("Coordinate(row=");
                A1C.append(this.A01);
                str = ", index=";
                A1C.append(str);
                i = this.A00;
                return AbstractC25236BEt.A0Z(A1C, i);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A1C = AbstractC166987dD.A1C();
                A1C.append("CaptionAudioBleep(startTimeMs=");
                A1C.append(this.A01);
                str = ", endTimeMs=";
                A1C.append(str);
                i = this.A00;
                return AbstractC25236BEt.A0Z(A1C, i);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A1C = AbstractC166987dD.A1C();
                A1C.append("MagicCutMetadata(trimStartTimeMs=");
                A1C.append(this.A01);
                str = ", trimEndTimeMs=";
                A1C.append(str);
                i = this.A00;
                return AbstractC25236BEt.A0Z(A1C, i);
            case Process.SIGSTOP /* 19 */:
                A1C = AbstractC166987dD.A1C();
                A1C.append("FilterInfo(filterId=");
                A1C.append(this.A00);
                A1C.append(", filterStrength=");
                i = this.A01;
                return AbstractC25236BEt.A0Z(A1C, i);
            case 25:
                A1C = AbstractC166987dD.A1C();
                A1C.append("TextOverlayLayoutData(maxWidth=");
                A1C.append(this.A01);
                str = ", maxHeight=";
                A1C.append(str);
                i = this.A00;
                return AbstractC25236BEt.A0Z(A1C, i);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51737MtK(int r4) {
        /*
            r3 = this;
            r3.A02 = r4
            switch(r4) {
                case 7: goto L25;
                case 13: goto L20;
                case 15: goto L17;
                case 17: goto L12;
                case 21: goto Ld;
                default: goto L5;
            }
        L5:
            r2 = 0
            r1 = 0
            r0 = 24
        L9:
            r3.<init>(r2, r1, r0)
            return
        Ld:
            r2 = 0
            r1 = 0
            r0 = 21
            goto L9
        L12:
            r2 = -1
            r1 = -1
            r0 = 17
            goto L9
        L17:
            r2 = 2131955692(0x7f130fec, float:1.9547919E38)
            r1 = 2131955690(0x7f130fea, float:1.9547915E38)
            r0 = 15
            goto L9
        L20:
            r2 = -1
            r1 = -1
            r0 = 13
            goto L9
        L25:
            r2 = -1
            r1 = -1
            r0 = 7
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51737MtK.<init>(int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51737MtK() {
        this(13);
        this.A02 = 13;
    }
}
