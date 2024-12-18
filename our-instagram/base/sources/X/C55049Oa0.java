package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Oa0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55049Oa0 {
    public static final C55049Oa0 A00 = new Object();

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public static final String A00(Context context, UserSession userSession, EnumC53249Ngn enumC53249Ngn) {
        int i;
        int i2;
        Object[] objArr;
        Integer num;
        switch (enumC53249Ngn.ordinal()) {
            case 0:
                i = 2131972026;
                return context.getString(i);
            case 1:
                i = 2131972027;
                if (C18U.A06(C06090Tz.A05, userSession, 36319132513475583L)) {
                    i = 2131972028;
                }
                return context.getString(i);
            case 2:
                i2 = 2131972029;
                objArr = new Object[1];
                num = null;
                objArr[0] = num;
                return context.getString(i2, objArr);
            case 3:
                i = 2131972030;
                return context.getString(i);
            case 4:
                i = 2131972031;
                return context.getString(i);
            case 6:
                int A07 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36612762247371167L);
                if (A07 > 0) {
                    i2 = 2131972033;
                    objArr = new Object[1];
                    num = Integer.valueOf(A07);
                    objArr[0] = num;
                    return context.getString(i2, objArr);
                }
            case 5:
                i = 2131972032;
                return context.getString(i);
            case 7:
                i = 2131972044;
                return context.getString(i);
            case 8:
            case 9:
            case 10:
            case 11:
            case 17:
                i = 2131972037;
                return context.getString(i);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = 2131972034;
                return context.getString(i);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                i = 2131972035;
                return context.getString(i);
            case 14:
            case Process.SIGTERM /* 15 */:
            case 27:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            default:
                return null;
            case 16:
                i = 2131972036;
                return context.getString(i);
            case 18:
                i = 2131972043;
                return context.getString(i);
            case Process.SIGSTOP /* 19 */:
                MSX.A0t();
                return AbstractC166997dE.A0p(context, 2131969080);
            case 20:
                i = 2131972038;
                return context.getString(i);
            case 21:
                i = 2131972039;
                return context.getString(i);
            case 22:
                i = 2131972040;
                return context.getString(i);
            case 23:
                i = 2131972041;
                return context.getString(i);
            case 24:
            case 25:
                i = 2131972042;
                return context.getString(i);
            case 26:
                i = 2131972048;
                return context.getString(i);
            case 28:
                i = 2131972045;
                return context.getString(i);
            case 30:
                i = 2131972047;
                return context.getString(i);
        }
    }

    public final void A01(Context context, UserSession userSession, EnumC53249Ngn enumC53249Ngn, String str) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131972046);
        A0I.A07();
        if (str == null) {
            str = A00(context, userSession, enumC53249Ngn);
        }
        A0I.A0r(str);
        AbstractC166987dD.A1W(A0I);
    }
}
