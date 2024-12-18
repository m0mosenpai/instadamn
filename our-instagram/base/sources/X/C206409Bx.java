package X;

import android.graphics.Bitmap;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.9Bx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206409Bx extends C0T6 {
    public Object A00;
    public String A01;
    public final int A02;

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C206409Bx) && ((C206409Bx) obj).A02 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 1: goto La;
                case 2: goto L2b;
                case 3: goto L2f;
                case 4: goto L27;
                case 5: goto L41;
                case 6: goto L45;
                case 7: goto L49;
                case 8: goto L4d;
                case 9: goto L82;
                case 10: goto L52;
                case 11: goto L57;
                case 12: goto L5c;
                case 13: goto L61;
                case 14: goto L66;
                case 15: goto L6b;
                case 16: goto L93;
                default: goto L5;
            }
        L5:
            boolean r0 = super.equals(r3)
            return r0
        La:
            if (r2 == r3) goto Lb5
            r0 = 1
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto Lb3
            X.9Bx r3 = (X.C206409Bx) r3
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lb3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto Lb5
            goto Lb3
        L27:
            if (r2 == r3) goto Lb5
            r0 = 4
            goto L97
        L2b:
            if (r2 == r3) goto Lb5
            r0 = 2
            goto L6f
        L2f:
            if (r2 == r3) goto Lb5
            r0 = 3
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto Lb3
            X.9Bx r3 = (X.C206409Bx) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L8e
            goto Lb3
        L41:
            if (r2 == r3) goto Lb5
            r0 = 5
            goto L6f
        L45:
            if (r2 == r3) goto Lb5
            r0 = 6
            goto L97
        L49:
            if (r2 == r3) goto Lb5
            r0 = 7
            goto L97
        L4d:
            if (r2 == r3) goto Lb5
            r0 = 8
            goto L6f
        L52:
            if (r2 == r3) goto Lb5
            r0 = 10
            goto L97
        L57:
            if (r2 == r3) goto Lb5
            r0 = 11
            goto L6f
        L5c:
            if (r2 == r3) goto Lb5
            r0 = 12
            goto L97
        L61:
            if (r2 == r3) goto Lb5
            r0 = 13
            goto L97
        L66:
            if (r2 == r3) goto Lb5
            r0 = 14
            goto L6f
        L6b:
            if (r2 == r3) goto Lb5
            r0 = 15
        L6f:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto Lb3
            X.9Bx r3 = (X.C206409Bx) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L8e
            goto Lb3
        L82:
            if (r2 == r3) goto Lb5
            r0 = 9
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto Lb3
            X.9Bx r3 = (X.C206409Bx) r3
        L8e:
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            goto Lad
        L93:
            if (r2 == r3) goto Lb5
            r0 = 16
        L97:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto Lb3
            X.9Bx r3 = (X.C206409Bx) r3
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lb3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        Lad:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto Lb5
        Lb3:
            r0 = 0
            return r0
        Lb5:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206409Bx.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str;
        int hashCode5;
        switch (this.A02) {
            case 1:
            case 4:
                str = this.A01;
                hashCode5 = str.hashCode();
                hashCode = hashCode5 * 31;
                hashCode2 = this.A00.hashCode();
                return hashCode + hashCode2;
            case 2:
            case 14:
            case Process.SIGTERM /* 15 */:
                hashCode = this.A00.hashCode() * 31;
                hashCode2 = this.A01.hashCode();
                return hashCode + hashCode2;
            case 3:
            case 5:
            case 8:
                hashCode = this.A00.hashCode() * 31;
                String str2 = this.A01;
                if (str2 != null) {
                    hashCode2 = str2.hashCode();
                    return hashCode + hashCode2;
                }
                hashCode2 = 0;
                return hashCode + hashCode2;
            case 6:
            case 7:
                str = this.A01;
                if (str == null) {
                    hashCode5 = 0;
                    hashCode = hashCode5 * 31;
                    hashCode2 = this.A00.hashCode();
                    return hashCode + hashCode2;
                }
                hashCode5 = str.hashCode();
                hashCode = hashCode5 * 31;
                hashCode2 = this.A00.hashCode();
                return hashCode + hashCode2;
            case 9:
                String str3 = this.A01;
                if (str3 == null) {
                    return 0;
                }
                return str3.hashCode();
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                String str4 = this.A01;
                hashCode = 0;
                if (str4 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = str4.hashCode();
                }
                hashCode2 = hashCode4 * 31;
                Object obj = this.A00;
                if (obj != null) {
                    hashCode = obj.hashCode();
                }
                return hashCode + hashCode2;
            case 11:
                Object obj2 = this.A00;
                hashCode = 0;
                if (obj2 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = obj2.hashCode();
                }
                hashCode2 = hashCode3 * 31;
                String str5 = this.A01;
                if (str5 != null) {
                    hashCode = str5.hashCode();
                }
                return hashCode + hashCode2;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 16:
                hashCode = this.A01.hashCode() * 31;
                Object obj3 = this.A00;
                if (obj3 != null) {
                    hashCode2 = obj3.hashCode();
                    return hashCode + hashCode2;
                }
                hashCode2 = 0;
                return hashCode + hashCode2;
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        StringBuilder sb;
        switch (this.A02) {
            case 0:
                sb = new StringBuilder();
                sb.append("ShowreelNativeInteraction(name=");
                sb.append(this.A01);
                sb.append(", actions=");
                sb.append(this.A00);
                break;
            case 11:
                sb = new StringBuilder();
                sb.append("NudityDetectionResultData(predictions=");
                sb.append(this.A00);
                sb.append(AbstractC43591JPw.A00(101));
                sb.append(this.A01);
                break;
            default:
                return super.toString();
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C206409Bx() {
        this(null);
        this.A02 = 9;
    }

    public C206409Bx(C38321qM c38321qM, String str) {
        this.A02 = 8;
        C14360o3.A0B(c38321qM, 1);
        this.A00 = c38321qM;
        this.A01 = str;
    }

    public C206409Bx(C148276lx c148276lx, String str) {
        this.A02 = 6;
        this.A01 = str;
        this.A00 = c148276lx;
    }

    public C206409Bx(EnumC166167bk enumC166167bk, String str) {
        this.A02 = 3;
        this.A00 = enumC166167bk;
        this.A01 = str;
    }

    public C206409Bx(EnumC33432Eq3 enumC33432Eq3, String str) {
        this.A02 = 1;
        this.A01 = str;
        this.A00 = enumC33432Eq3;
    }

    public C206409Bx(Bitmap bitmap, String str) {
        this.A02 = 15;
        this.A00 = bitmap;
        this.A01 = str;
    }

    public C206409Bx(ImmutableList immutableList, String str) {
        this.A02 = 0;
        this.A01 = str;
        this.A00 = immutableList;
    }

    public C206409Bx(ImageUrl imageUrl, String str, int i) {
        this.A02 = i;
        if (12 - i != 0) {
            C14360o3.A0B(str, 1);
        }
        this.A01 = str;
        this.A00 = imageUrl;
    }

    public C206409Bx(String str) {
        this.A02 = 9;
        this.A01 = str;
    }

    public C206409Bx(String str, Object obj) {
        this.A02 = 16;
        this.A01 = str;
        this.A00 = obj;
    }

    public C206409Bx(String str, Object obj, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public C206409Bx(String str, Map map) {
        this.A02 = 5;
        this.A00 = map;
        this.A01 = str;
    }

    public C206409Bx(String str, UUID uuid, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A02 = 4;
        UUID randomUUID = UUID.randomUUID();
        this.A02 = 4;
        C14360o3.A0B(randomUUID, 2);
        this.A01 = str;
        this.A00 = randomUUID;
    }

    public C206409Bx(List list, int i, String str) {
        this.A02 = i;
        C14360o3.A0B(list, 1);
        C14360o3.A0B(str, 2);
        this.A00 = list;
        this.A01 = str;
    }
}
