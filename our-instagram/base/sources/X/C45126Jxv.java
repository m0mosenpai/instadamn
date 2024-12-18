package X;

import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* renamed from: X.Jxv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45126Jxv extends C0T6 {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C45126Jxv) && ((C45126Jxv) obj).A04 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45126Jxv.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b4, code lost:
    
        if (r0 == null) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45126Jxv.hashCode():int");
    }

    public final String toString() {
        StringBuilder A1C;
        switch (this.A04) {
            case 10:
                A1C = AbstractC166987dD.A1C();
                A1C.append("EncryptedBackupsPrimaryDevice(currentDeviceId=");
                A1C.append(this.A01);
                A1C.append(", primaryDeviceId=");
                A1C.append(this.A03);
                A1C.append(", isPrimaryDevice=");
                A1C.append(this.A00);
                A1C.append(", error=");
                A1C.append(this.A02);
                break;
            case Process.SIGTERM /* 15 */:
                A1C = AbstractC166987dD.A1C();
                A1C.append("Data(title=");
                A1C.append(this.A03);
                A1C.append(AbstractC58317Pt9.A00(58));
                A1C.append(this.A01);
                A1C.append(", incentiveActionString=");
                A1C.append(this.A02);
                A1C.append(", labelButton=");
                A1C.append(this.A00);
                break;
            default:
                return super.toString();
        }
        return AbstractC167017dG.A0p(A1C);
    }

    public C45126Jxv(ImmutableList immutableList, String str, String str2, String str3) {
        this.A04 = 5;
        this.A00 = immutableList;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public C45126Jxv(ImageUrl imageUrl, String str, String str2, String str3) {
        this.A04 = 3;
        this.A00 = imageUrl;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
    }

    public C45126Jxv(String str, String str2, String str3, List list) {
        this.A04 = 4;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = list;
    }

    public C45126Jxv(InterfaceC39031rc interfaceC39031rc, String str, String str2, String str3) {
        this.A04 = 16;
        this.A03 = str;
        this.A01 = str2;
        this.A00 = interfaceC39031rc;
        this.A02 = str3;
    }

    public C45126Jxv(String str, String str2, String str3) {
        this.A04 = 15;
        AbstractC167017dG.A1P(str, str2);
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = null;
    }

    public C45126Jxv(ImageUrl imageUrl, String str, String str2, String str3, int i) {
        this.A04 = 9;
        AbstractC167007dF.A1F(str, 1, str3);
        this.A02 = str;
        this.A00 = imageUrl;
        this.A01 = str2;
        this.A03 = str3;
    }

    public C45126Jxv(User user, String str, String str2, String str3) {
        this.A04 = 11;
        AbstractC167007dF.A1F(user, 1, str3);
        this.A00 = user;
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public C45126Jxv(String str, String str2, String str3, HashMap hashMap) {
        this.A04 = 1;
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = hashMap;
    }

    public C45126Jxv(Integer num, String str, String str2, String str3, int i) {
        this.A04 = i;
        if (7 - i != 0) {
            AbstractC167027dH.A13(num, str, str2);
            this.A00 = num;
            this.A02 = str;
            this.A01 = str2;
            this.A03 = str3;
            return;
        }
        this.A00 = num;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
    }

    public C45126Jxv(int i) {
        this.A04 = i;
        if (13 - i != 0) {
            this.A04 = 14;
            this.A04 = 14;
            this.A01 = "";
            this.A02 = "";
            this.A03 = null;
            this.A00 = null;
            return;
        }
        this.A04 = 13;
        this.A04 = 13;
        this.A00 = null;
        this.A01 = "";
        this.A02 = "";
        this.A03 = null;
    }

    public C45126Jxv(Object obj, String str, String str2, String str3, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45126Jxv(String str, Integer num, String str2) {
        this(num, (String) null, str, str2, 7);
        this.A04 = 7;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45126Jxv(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker, JSONObject jSONObject, int i, int i2) {
        this((Object) null, str, str2, str3, 2);
        this.A04 = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45126Jxv(String str, String str2, List list) {
        this(list, EnumC37319GcL.ACTIVITY_FEED.toString(), str2, str, 8);
        this.A04 = 8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45126Jxv(MSA msa) {
        this(msa.CBe(), msa.Aqq(), msa.getUrl(), msa.getTitle(), 6);
        this.A04 = 6;
        C14360o3.A0B(msa, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45126Jxv() {
        this(AbstractC25225BEi.A0t(""), "", (String) null, (String) null);
        this.A04 = 3;
    }
}
