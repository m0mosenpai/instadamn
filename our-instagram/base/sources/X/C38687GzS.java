package X;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.facebook.forker.Process;
import com.instagram.api.schemas.MoreInfoType;
import com.instagram.shopping.model.taggingfeed.SourceType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.GzS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38687GzS extends C0T6 {
    public Object A00;
    public String A01;
    public final int A02;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38687GzS.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38687GzS.hashCode():int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder A1C;
        String str;
        switch (this.A02) {
            case 4:
                A1C = AbstractC166987dD.A1C();
                A1C.append("BloksDataModel(bloksDataAdapter=");
                A1C.append(this.A00);
                str = AbstractC58317Pt9.A00(31);
                A1C.append(str);
                A1C.append(this.A01);
                A1C.append(')');
                return A1C.toString();
            case 9:
                A1C = AbstractC166987dD.A1C();
                A1C.append("RtcCallRemoteParticipant(participant=");
                A1C.append(this.A00);
                str = ", rendererId=";
                A1C.append(str);
                A1C.append(this.A01);
                A1C.append(')');
                return A1C.toString();
            case 20:
                A1C = AbstractC166987dD.A1C();
                A1C.append("SurfaceRegistration(surfaceToken=");
                A1C.append(this.A00);
                A1C.append("\n, rankingSessionId='");
                A1C.append(this.A01);
                A1C.append("\n')");
                return A1C.toString();
            case 25:
                A1C = AbstractC166987dD.A1C();
                A1C.append("FollowListEarlyFetcherData(type=");
                A1C.append(this.A00);
                str = ", profileId=";
                A1C.append(str);
                A1C.append(this.A01);
                A1C.append(')');
                return A1C.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38687GzS(Integer num) {
        this("", 10, num);
        this.A02 = 10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38687GzS(EnumC39612HeM enumC39612HeM) {
        this((String) null, enumC39612HeM, 8);
        this.A02 = 8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38687GzS(Object obj) {
        this((String) null, obj, 13);
        this.A02 = 13;
    }

    public C38687GzS(String str, int i, Integer num) {
        this.A02 = i;
        AbstractC167017dG.A1P(num, str);
        this.A00 = num;
        this.A01 = str;
    }

    public C38687GzS(List list, int i, String str) {
        this.A02 = i;
        switch (i) {
            case 3:
            case 16:
            case 22:
                AbstractC167017dG.A1P(str, list);
                break;
        }
        this.A01 = str;
        this.A00 = list;
    }

    public C38687GzS() {
        this.A02 = 19;
        EnumC39568Hde enumC39568Hde = EnumC39568Hde.A06;
        this.A02 = 19;
        this.A01 = null;
        this.A00 = enumC39568Hde;
    }

    public C38687GzS(Integer num, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A02 = 23;
        this.A02 = 23;
        this.A01 = "";
        this.A00 = null;
    }

    public C38687GzS(Bitmap bitmap, String str) {
        this.A02 = 0;
        AbstractC167017dG.A1P(str, bitmap);
        this.A01 = str;
        this.A00 = bitmap;
    }

    public C38687GzS(EnumC143276dS enumC143276dS, String str) {
        this.A02 = 21;
        AbstractC167017dG.A1P(str, enumC143276dS);
        this.A01 = str;
        this.A00 = enumC143276dS;
    }

    public C38687GzS(SourceType sourceType, String str) {
        this.A02 = 17;
        AbstractC167017dG.A1P(str, sourceType);
        this.A01 = str;
        this.A00 = sourceType;
    }

    public C38687GzS(FHX fhx, String str) {
        this.A02 = 12;
        this.A01 = str;
        this.A00 = fhx;
    }

    public C38687GzS(MotionEvent motionEvent, String str) {
        this.A02 = 27;
        this.A01 = str;
        this.A00 = motionEvent;
    }

    public C38687GzS(EnumC31556Dtg enumC31556Dtg, String str) {
        this.A02 = 25;
        AbstractC167017dG.A1P(enumC31556Dtg, str);
        this.A00 = enumC31556Dtg;
        this.A01 = str;
    }

    public C38687GzS(C1PC c1pc, String str) {
        this.A02 = 20;
        this.A00 = c1pc;
        this.A01 = str;
    }

    public C38687GzS(MoreInfoType moreInfoType, String str) {
        this.A02 = 26;
        this.A00 = moreInfoType;
        this.A01 = str;
    }

    public C38687GzS(C51876MwK c51876MwK, String str) {
        this.A02 = 9;
        C14360o3.A0B(str, 2);
        this.A00 = c51876MwK;
        this.A01 = str;
    }

    public C38687GzS(String str, Bitmap bitmap) {
        this.A02 = 7;
        C14360o3.A0B(str, 2);
        this.A00 = bitmap;
        this.A01 = str;
    }

    public C38687GzS(List list, String str, int i) {
        this.A02 = 11;
        C14360o3.A0B(list, 1);
        this.A00 = list;
        this.A01 = str;
    }

    public C38687GzS(C217859kI c217859kI, String str) {
        this.A02 = 6;
        this.A00 = c217859kI;
        this.A01 = str;
    }

    public C38687GzS(String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = 2;
        this.A01 = str;
        this.A00 = interfaceC16820sZ;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38687GzS(MoreInfoType moreInfoType) {
        this(moreInfoType, (String) null);
        this.A02 = 26;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38687GzS(C58590PyH c58590PyH) {
        this((String) null, c58590PyH, 4);
        this.A02 = 4;
    }

    public C38687GzS(String str, Object obj, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38687GzS(int i) {
        this(null, null, null, 3, 23);
        this.A02 = i;
        switch (i) {
            case Process.SIGTERM /* 15 */:
                this.A02 = 15;
                Object obj = new Object();
                this.A02 = 15;
                this.A00 = obj;
                this.A01 = "";
                return;
            case 16:
                this.A02 = 16;
                this(C16930sl.A00, 16, "");
                return;
            case 17:
            default:
                return;
            case 18:
                this.A02 = 18;
                this.A02 = 18;
                this.A01 = "";
                this.A00 = null;
                return;
            case Process.SIGSTOP /* 19 */:
                this();
                return;
        }
    }
}
