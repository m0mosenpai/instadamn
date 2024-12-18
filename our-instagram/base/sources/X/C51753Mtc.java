package X;

import android.view.View;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Mtc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51753Mtc extends C0T6 {
    public final int A00;
    public final int A01;
    public final Object A02;

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C51753Mtc) && ((C51753Mtc) obj).A00 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51753Mtc.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int i;
        int hashCode;
        String str;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
            case 4:
            case 5:
            case 9:
            case 11:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
                i = this.A01 * 31;
                hashCode = this.A02.hashCode();
                return i + hashCode;
            case 1:
            case 6:
            default:
                return super.hashCode();
            case 2:
            case 7:
            case Process.SIGTERM /* 15 */:
            case 18:
            case 23:
                i = this.A01 * 31;
                hashCode = AbstractC167017dG.A0M(this.A02);
                return i + hashCode;
            case 3:
                i = AbstractC167017dG.A0M(this.A02) * 31;
                hashCode = this.A01;
                return i + hashCode;
            case 8:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 16:
            case 21:
            case 22:
                i = AbstractC166987dD.A0G(this.A02);
                hashCode = this.A01;
                return i + hashCode;
            case 17:
                i = this.A01 * 31;
                int A0H = AbstractC166987dD.A0H(this.A02);
                if (1 != A0H) {
                    str = "VISIBLE";
                } else {
                    str = "GONE";
                }
                hashCode = AbstractC25226BEj.A02(str, A0H);
                return i + hashCode;
            case Process.SIGSTOP /* 19 */:
                int A0H2 = AbstractC166987dD.A0H(this.A02);
                switch (A0H2) {
                    case 1:
                        str2 = "CONFIRMED";
                        break;
                    case 2:
                        str2 = "ERROR";
                        break;
                    default:
                        str2 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                        break;
                }
                i = AbstractC25228BEl.A0F(str2, A0H2);
                hashCode = this.A01;
                return i + hashCode;
            case 20:
                int A0H3 = AbstractC166987dD.A0H(this.A02);
                switch (A0H3) {
                    case 1:
                        str3 = "CONFIRMED";
                        break;
                    case 2:
                        str3 = "ERROR";
                        break;
                    default:
                        str3 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                        break;
                }
                i = AbstractC25228BEl.A0F(str3, A0H3);
                hashCode = this.A01;
                return i + hashCode;
        }
    }

    public final String toString() {
        StringBuilder A1C;
        String str;
        switch (this.A00) {
            case 2:
                A1C = AbstractC166987dD.A1C();
                A1C.append("VersionResult(version=");
                A1C.append(this.A01);
                str = ", reason=";
                break;
            case 3:
                JSONObject A0q = AbstractC31171DnF.A0q();
                try {
                    A0q.put("duration_ms", this.A02);
                    A0q.put("media_type", this.A01);
                } catch (JSONException unused) {
                }
                return AbstractC166987dD.A19(A0q);
            case 4:
            default:
                return super.toString();
            case 5:
                A1C = AbstractC166987dD.A1C();
                A1C.append("UiGraphState(overallRowsCount=");
                A1C.append(this.A01);
                str = ", currentSurfaceState=";
                break;
        }
        A1C.append(str);
        return AbstractC167017dG.A0o(this.A02, A1C);
    }

    public C51753Mtc(C114205Dh c114205Dh, int i) {
        this.A00 = 4;
        this.A01 = i;
        this.A02 = c114205Dh;
    }

    public C51753Mtc(View.OnClickListener onClickListener, int i) {
        this.A00 = 14;
        this.A01 = i;
        this.A02 = onClickListener;
    }

    public C51753Mtc(AbstractC160207Gg abstractC160207Gg, int i) {
        this.A00 = 16;
        this.A02 = abstractC160207Gg;
        this.A01 = i;
    }

    public C51753Mtc(EnumC46174KcC enumC46174KcC, int i) {
        this.A00 = 12;
        this.A02 = enumC46174KcC;
        this.A01 = i;
    }

    public C51753Mtc(C51759Mti c51759Mti, int i) {
        this.A00 = 21;
        this.A02 = c51759Mti;
        this.A01 = i;
    }

    public C51753Mtc(C51758Mth c51758Mth, int i) {
        this.A00 = 22;
        C14360o3.A0B(c51758Mth, 1);
        this.A02 = c51758Mth;
        this.A01 = i;
    }

    public C51753Mtc(int i, Object obj) {
        this.A00 = 11;
        C14360o3.A0B(obj, 2);
        this.A01 = i;
        this.A02 = obj;
    }

    public C51753Mtc(List list, int i, int i2) {
        this.A00 = i2;
        switch (i2) {
            case 6:
            case 8:
                C14360o3.A0B(list, 1);
                break;
        }
        this.A02 = list;
        this.A01 = i;
    }

    public C51753Mtc(int i, Integer num, int i2) {
        this.A00 = i2;
        switch (i2) {
            case 1:
            case 18:
            case 23:
                break;
            default:
                C14360o3.A0B(num, 2);
                break;
        }
        this.A01 = i;
        this.A02 = num;
    }

    public C51753Mtc(int i, ImageUrl imageUrl) {
        this.A00 = 13;
        this.A01 = i;
        this.A02 = imageUrl;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51753Mtc(int r3, int r4, int r5) {
        /*
            r2 = this;
            r1 = 0
            r2.A00 = r5
            int r5 = 1 - r5
            if (r5 == 0) goto L14
            r0 = r4 & 1
            if (r0 == 0) goto Le
            r3 = 2130970233(0x7f040679, float:1.754917E38)
        Le:
            r0 = 18
        L10:
            r2.<init>(r3, r1, r0)
            return
        L14:
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51753Mtc.<init>(int, int, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51753Mtc() {
        this(new C51759Mti((C26014Bf2) null, (Integer) null, (DefaultConstructorMarker) null, 3, 5), 0);
        this.A00 = 21;
    }

    public C51753Mtc(Integer num, int i, int i2) {
        this.A00 = i2;
        this.A02 = num;
        this.A01 = i;
    }

    public C51753Mtc(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51753Mtc(int r3, java.lang.Integer r4) {
        /*
            r2 = this;
            r2.A00 = r3
            r1 = 0
            int r3 = 19 - r3
            if (r3 == 0) goto Ld
            r0 = 20
        L9:
            r2.<init>(r4, r1, r0)
            return
        Ld:
            r0 = 19
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51753Mtc.<init>(int, java.lang.Integer):void");
    }
}
