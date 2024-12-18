package X;

import android.view.View;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Sba, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63053Sba {
    public static boolean A00(View view, EnumC61078Res enumC61078Res) {
        if (view == null) {
            return true;
        }
        int ordinal = enumC61078Res.ordinal();
        switch (ordinal) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return true;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                Number number = (Number) view.getTag(R.id.pointer_events);
                return (number == null || (number.intValue() & (1 << ordinal)) == 0) ? false : true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:3:0x0009 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A01(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r2 = 1
            r1 = 0
            switch(r0) {
                case -1780335505: goto L12;
                case -1065042973: goto Le;
                case 1343400710: goto La;
                default: goto L9;
            }
        L9:
            return r1
        La:
            java.lang.String r0 = "topPointerOut"
            goto L15
        Le:
            java.lang.String r0 = "topPointerUp"
            goto L15
        L12:
            java.lang.String r0 = "topPointerLeave"
        L15:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63053Sba.A01(java.lang.String):boolean");
    }
}
