package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Bg5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26076Bg5 extends C0T6 {
    public long A00;
    public Object A01;
    public final int A02;

    public C26076Bg5(Bitmap bitmap, long j) {
        this.A02 = 4;
        C14360o3.A0B(bitmap, 2);
        this.A00 = j;
        this.A01 = bitmap;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C26076Bg5) && ((C26076Bg5) obj).A02 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0022 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L56;
                case 1: goto L24;
                case 2: goto L28;
                case 3: goto L2c;
                case 4: goto L30;
                case 5: goto L34;
                case 6: goto L52;
                default: goto L5;
            }
        L5:
            if (r5 == r6) goto L73
            r0 = 7
        L8:
            boolean r0 = A00(r6, r0)
            if (r0 == 0) goto L22
            X.Bg5 r6 = (X.C26076Bg5) r6
            java.lang.Object r1 = r5.A01
            java.lang.Object r0 = r6.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L22
            long r3 = r5.A00
            long r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L73
        L22:
            r0 = 0
            return r0
        L24:
            if (r5 == r6) goto L73
            r0 = 1
            goto L8
        L28:
            if (r5 == r6) goto L73
            r0 = 2
            goto L8
        L2c:
            if (r5 == r6) goto L73
            r0 = 3
            goto L37
        L30:
            if (r5 == r6) goto L73
            r0 = 4
            goto L37
        L34:
            if (r5 == r6) goto L73
            r0 = 5
        L37:
            boolean r0 = A00(r6, r0)
            if (r0 == 0) goto L22
            X.Bg5 r6 = (X.C26076Bg5) r6
            long r3 = r5.A00
            long r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L22
            java.lang.Object r1 = r5.A01
            java.lang.Object r0 = r6.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L73
            goto L22
        L52:
            if (r5 == r6) goto L73
            r0 = 6
            goto L8
        L56:
            if (r5 == r6) goto L73
            r0 = 0
            boolean r0 = A00(r6, r0)
            if (r0 == 0) goto L22
            X.Bg5 r6 = (X.C26076Bg5) r6
            java.lang.Object r1 = r5.A01
            java.lang.Object r0 = r6.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L22
            long r3 = r5.A00
            long r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L22
        L73:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26076Bg5.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A03;
        Object obj;
        int hashCode;
        Object obj2;
        int hashCode2;
        switch (this.A02) {
            case 0:
                obj2 = this.A01;
                hashCode2 = obj2.hashCode();
                A03 = hashCode2 * 31;
                hashCode = AbstractC25228BEl.A03(this.A00);
                break;
            case 1:
            case 2:
            default:
                obj2 = this.A01;
                if (obj2 == null) {
                    hashCode2 = 0;
                    A03 = hashCode2 * 31;
                    hashCode = AbstractC25228BEl.A03(this.A00);
                    break;
                }
                hashCode2 = obj2.hashCode();
                A03 = hashCode2 * 31;
                hashCode = AbstractC25228BEl.A03(this.A00);
            case 3:
                A03 = AbstractC25235BEs.A03(this.A00);
                obj = this.A01;
                if (obj == null) {
                    hashCode = 0;
                    break;
                }
                hashCode = obj.hashCode();
                break;
            case 4:
            case 5:
                A03 = AbstractC25235BEs.A03(this.A00);
                obj = this.A01;
                hashCode = obj.hashCode();
                break;
        }
        return A03 + hashCode;
    }

    public final String toString() {
        StringBuilder A1C;
        String str;
        switch (this.A02) {
            case 3:
                A1C = AbstractC166987dD.A1C();
                A1C.append("GridItemAnimationOption(duration=");
                A1C.append(this.A00);
                str = AbstractC58317Pt9.A00(433);
                break;
            case 4:
                A1C = AbstractC166987dD.A1C();
                A1C.append("ScreenshotEffectBurnerParam(timestampUs=");
                A1C.append(this.A00);
                str = ", image=";
                break;
            default:
                return super.toString();
        }
        A1C.append(str);
        return AbstractC167017dG.A0o(this.A01, A1C);
    }

    public C26076Bg5(List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, long j) {
        this.A02 = 0;
        ArrayList A1E = AbstractC166987dD.A1E();
        long A00 = CCR.A00(0.0f, 0.0f);
        this.A02 = 0;
        this.A01 = A1E;
        this.A00 = A00;
    }

    public C26076Bg5(long j, Object obj, int i) {
        this.A02 = i;
        this.A00 = j;
        this.A01 = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26076Bg5() {
        this(0L, null, 7);
        this.A02 = 7;
    }
}
