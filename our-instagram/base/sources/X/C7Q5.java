package X;

import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;

/* renamed from: X.7Q5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Q5 {
    public float A00;
    public EnumC40111tc A01;

    @Deprecated
    public C47Z A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.7Q5, java.lang.Object] */
    public static C7Q5 A00(C47Z c47z, String str) {
        String str2;
        String str3;
        float f;
        List list;
        boolean A0z;
        String str4;
        EnumC40111tc enumC40111tc = c47z.A1G;
        if (enumC40111tc == EnumC40111tc.A0a) {
            str3 = c47z.A3V;
            ClipInfo clipInfo = c47z.A1N;
            if (clipInfo == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("null clipinfo. pendingMedia:");
                sb.append(c47z);
                C0w9.A03("direct_pending_visual_meida_create", sb.toString());
            }
            enumC40111tc = c47z.A1G;
            str2 = null;
            if (str3 == null) {
                if (clipInfo != null) {
                    str3 = clipInfo.A0F;
                } else {
                    str3 = null;
                }
            }
            f = c47z.A02;
            list = c47z.A4b;
            str4 = c47z.A35;
            str4.getClass();
            A0z = false;
        } else {
            str2 = c47z.A33;
            str3 = null;
            f = c47z.A02;
            list = c47z.A4b;
            A0z = c47z.A0z();
            str4 = c47z.A35;
            str4.getClass();
        }
        ?? obj = new Object();
        obj.A01 = enumC40111tc;
        obj.A04 = str2;
        obj.A05 = str3;
        obj.A00 = f;
        obj.A07 = list;
        obj.A08 = A0z;
        obj.A06 = str;
        obj.A03 = str4;
        return obj;
    }

    public final boolean A01() {
        if (this.A01 != EnumC40111tc.A0a) {
            return false;
        }
        return true;
    }
}
