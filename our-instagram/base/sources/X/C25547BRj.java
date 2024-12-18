package X;

import android.graphics.PointF;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.BRj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25547BRj extends C0T6 {
    public float A00;
    public Object A01;
    public final int A02;

    public C25547BRj(ImageUrl imageUrl, float f) {
        this.A02 = 2;
        C14360o3.A0B(imageUrl, 2);
        this.A00 = f;
        this.A01 = imageUrl;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 0: goto La;
                case 1: goto Le;
                case 2: goto L12;
                case 3: goto L5;
                case 4: goto L16;
                case 5: goto L1a;
                case 6: goto L3c;
                default: goto L5;
            }
        L5:
            boolean r0 = super.equals(r3)
            return r0
        La:
            if (r2 == r3) goto L5f
            r1 = 0
            goto L3f
        Le:
            if (r2 == r3) goto L5f
            r1 = 1
            goto L3f
        L12:
            if (r2 == r3) goto L5f
            r1 = 2
            goto L1d
        L16:
            if (r2 == r3) goto L5f
            r1 = 4
            goto L3f
        L1a:
            if (r2 == r3) goto L5f
            r1 = 5
        L1d:
            boolean r0 = r3 instanceof X.C25547BRj
            if (r0 == 0) goto L5d
            X.BRj r3 = (X.C25547BRj) r3
            int r0 = r3.A02
            if (r0 != r1) goto L5d
            float r1 = r2.A00
            float r0 = r3.A00
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L5d
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L5f
            goto L5d
        L3c:
            if (r2 == r3) goto L5f
            r1 = 6
        L3f:
            boolean r0 = r3 instanceof X.C25547BRj
            if (r0 == 0) goto L5d
            X.BRj r3 = (X.C25547BRj) r3
            int r0 = r3.A02
            if (r0 != r1) goto L5d
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L5d
            float r1 = r2.A00
            float r0 = r3.A00
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 == 0) goto L5f
        L5d:
            r0 = 0
            return r0
        L5f:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25547BRj.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int A02;
        Object obj;
        int hashCode;
        Object obj2;
        int hashCode2;
        switch (this.A02) {
            case 0:
                obj2 = this.A01;
                if (obj2 == null) {
                    hashCode2 = 0;
                    A02 = hashCode2 * 31;
                    hashCode = Float.floatToIntBits(this.A00);
                    return A02 + hashCode;
                }
                hashCode2 = obj2.hashCode();
                A02 = hashCode2 * 31;
                hashCode = Float.floatToIntBits(this.A00);
                return A02 + hashCode;
            case 1:
            case 4:
            case 6:
                obj2 = this.A01;
                hashCode2 = obj2.hashCode();
                A02 = hashCode2 * 31;
                hashCode = Float.floatToIntBits(this.A00);
                return A02 + hashCode;
            case 2:
                A02 = AbstractC25235BEs.A02(this.A00);
                obj = this.A01;
                hashCode = obj.hashCode();
                return A02 + hashCode;
            case 3:
            default:
                return super.hashCode();
            case 5:
                A02 = AbstractC25235BEs.A02(this.A00);
                obj = this.A01;
                hashCode = obj.hashCode();
                return A02 + hashCode;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder A1C;
        String A00;
        String str;
        switch (this.A02) {
            case 2:
                A1C = AbstractC166987dD.A1C();
                A1C.append("NotesPogAvatarUiState(avatarSize=");
                A1C.append(this.A00);
                str = ", imageUrl=";
                A1C.append(str);
                A1C.append(this.A01);
                return AbstractC167017dG.A0p(A1C);
            case 3:
                A1C = AbstractC166987dD.A1C();
                A1C.append("DetailedTranscription(tokens=");
                A1C.append(this.A01);
                A00 = AbstractC58317Pt9.A00(426);
                A1C.append(A00);
                A1C.append(this.A00);
                return AbstractC167017dG.A0p(A1C);
            case 4:
            default:
                return super.toString();
            case 5:
                A1C = AbstractC166987dD.A1C();
                A1C.append("FaceSwarmImageAnimationState(size=");
                A1C.append(this.A00);
                str = ", point=";
                A1C.append(str);
                A1C.append(this.A01);
                return AbstractC167017dG.A0p(A1C);
            case 6:
                A1C = AbstractC166987dD.A1C();
                A1C.append("FaceSwarmTemplate(specifiers=");
                A1C.append(this.A01);
                A00 = MSV.A00(38);
                A1C.append(A00);
                A1C.append(this.A00);
                return AbstractC167017dG.A0p(A1C);
        }
    }

    public C25547BRj(List list, float f, int i) {
        this.A02 = i;
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = f;
    }

    public C25547BRj(Object obj, float f, int i) {
        this.A02 = i;
        this.A00 = f;
        this.A01 = obj;
    }

    public C25547BRj(PointF pointF, float f) {
        this.A02 = 4;
        this.A01 = pointF;
        this.A00 = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25547BRj() {
        this((List) C16930sl.A00, 0.0f, 3);
        this.A02 = 3;
        this.A02 = 3;
    }
}
