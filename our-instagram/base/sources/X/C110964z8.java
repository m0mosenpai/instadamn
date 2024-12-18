package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.4z8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110964z8 {
    public static final int[] A04 = {0, 4, 8};
    public static SparseIntArray A02 = new SparseIntArray();
    public static SparseIntArray A03 = new SparseIntArray();
    public HashMap A01 = new HashMap();
    public HashMap A00 = new HashMap();

    static {
        A02.append(82, 25);
        A02.append(83, 26);
        A02.append(85, 29);
        A02.append(86, 30);
        A02.append(92, 36);
        A02.append(91, 35);
        A02.append(63, 4);
        A02.append(62, 3);
        A02.append(58, 1);
        A02.append(60, 91);
        A02.append(59, 92);
        A02.append(101, 6);
        A02.append(102, 7);
        A02.append(70, 17);
        A02.append(71, 18);
        A02.append(72, 19);
        A02.append(54, 99);
        A02.append(0, 27);
        A02.append(87, 32);
        A02.append(88, 33);
        A02.append(69, 10);
        A02.append(68, 9);
        A02.append(106, 13);
        A02.append(109, 16);
        A02.append(107, 14);
        A02.append(104, 11);
        A02.append(108, 15);
        A02.append(105, 12);
        A02.append(95, 40);
        A02.append(80, 39);
        A02.append(79, 41);
        A02.append(94, 42);
        A02.append(78, 20);
        A02.append(93, 37);
        A02.append(67, 5);
        A02.append(81, 87);
        A02.append(90, 87);
        A02.append(84, 87);
        A02.append(61, 87);
        A02.append(57, 87);
        A02.append(5, 24);
        A02.append(7, 28);
        A02.append(23, 31);
        A02.append(24, 8);
        A02.append(6, 34);
        A02.append(8, 2);
        A02.append(3, 23);
        A02.append(4, 21);
        A02.append(96, 95);
        A02.append(73, 96);
        A02.append(2, 22);
        A02.append(13, 43);
        A02.append(26, 44);
        A02.append(21, 45);
        A02.append(22, 46);
        A02.append(20, 60);
        A02.append(18, 47);
        A02.append(19, 48);
        A02.append(14, 49);
        A02.append(15, 50);
        A02.append(16, 51);
        A02.append(17, 52);
        A02.append(25, 53);
        A02.append(97, 54);
        A02.append(74, 55);
        A02.append(98, 56);
        A02.append(75, 57);
        A02.append(99, 58);
        A02.append(76, 59);
        A02.append(64, 61);
        A02.append(66, 62);
        A02.append(65, 63);
        A02.append(28, 64);
        A02.append(121, 65);
        A02.append(35, 66);
        A02.append(122, 67);
        A02.append(113, 79);
        A02.append(1, 38);
        A02.append(112, 68);
        A02.append(100, 69);
        A02.append(77, 70);
        A02.append(111, 97);
        A02.append(32, 71);
        A02.append(30, 72);
        A02.append(31, 73);
        A02.append(33, 74);
        A02.append(29, 75);
        A02.append(114, 76);
        A02.append(89, 77);
        A02.append(123, 78);
        A02.append(56, 80);
        A02.append(55, 81);
        A02.append(116, 82);
        A02.append(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, 83);
        A02.append(119, 84);
        A02.append(118, 85);
        A02.append(117, 86);
        A03.append(85, 6);
        A03.append(85, 7);
        A03.append(0, 27);
        A03.append(89, 13);
        A03.append(92, 16);
        A03.append(90, 14);
        A03.append(87, 11);
        A03.append(91, 15);
        A03.append(88, 12);
        A03.append(78, 40);
        A03.append(71, 39);
        A03.append(70, 41);
        A03.append(77, 42);
        A03.append(69, 20);
        A03.append(76, 37);
        A03.append(60, 5);
        A03.append(72, 87);
        A03.append(75, 87);
        A03.append(73, 87);
        A03.append(57, 87);
        A03.append(56, 87);
        A03.append(5, 24);
        A03.append(7, 28);
        A03.append(23, 31);
        A03.append(24, 8);
        A03.append(6, 34);
        A03.append(8, 2);
        A03.append(3, 23);
        A03.append(4, 21);
        A03.append(79, 95);
        A03.append(64, 96);
        A03.append(2, 22);
        A03.append(13, 43);
        A03.append(26, 44);
        A03.append(21, 45);
        A03.append(22, 46);
        A03.append(20, 60);
        A03.append(18, 47);
        A03.append(19, 48);
        A03.append(14, 49);
        A03.append(15, 50);
        A03.append(16, 51);
        A03.append(17, 52);
        A03.append(25, 53);
        A03.append(80, 54);
        A03.append(65, 55);
        A03.append(81, 56);
        A03.append(66, 57);
        A03.append(82, 58);
        A03.append(67, 59);
        A03.append(59, 62);
        A03.append(58, 63);
        A03.append(28, 64);
        A03.append(105, 65);
        A03.append(34, 66);
        A03.append(106, 67);
        A03.append(96, 79);
        A03.append(1, 38);
        A03.append(97, 98);
        A03.append(95, 68);
        A03.append(83, 69);
        A03.append(68, 70);
        A03.append(32, 71);
        A03.append(30, 72);
        A03.append(31, 73);
        A03.append(33, 74);
        A03.append(29, 75);
        A03.append(98, 76);
        A03.append(74, 77);
        A03.append(107, 78);
        A03.append(55, 80);
        A03.append(54, 81);
        A03.append(100, 82);
        A03.append(104, 83);
        A03.append(103, 84);
        A03.append(102, 85);
        A03.append(101, 86);
        A03.append(94, 97);
    }

    public static String A03(int side) {
        switch (side) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            default:
                return "end";
        }
    }

    public final void A0D(int i, int i2, int i3, int i4) {
        A0E(i, i2, i3, i4, 0);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x004b. Please report as an issue. */
    public static C152726u0 A01(Context context, AttributeSet attrs, boolean override) {
        int[] iArr;
        StringBuilder sb;
        String str;
        String str2;
        int i;
        StringBuilder sb2;
        String str3;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        String str4;
        float f;
        float f2;
        C152726u0 c152726u0 = new C152726u0();
        if (override) {
            iArr = AbstractC56282iH.A02;
        } else {
            iArr = AbstractC56282iH.A00;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, iArr);
        if (override) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            ACr aCr = new ACr();
            c152726u0.A01 = aCr;
            C152746u2 c152746u2 = c152726u0.A04;
            c152746u2.A0C = false;
            C152756u3 c152756u3 = c152726u0.A03;
            c152756u3.A12 = false;
            C152736u1 c152736u1 = c152726u0.A05;
            c152736u1.A04 = false;
            C152766u4 c152766u4 = c152726u0.A06;
            c152766u4.A0D = false;
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                float f3 = 1.0f;
                int i8 = 17;
                int i9 = -1;
                switch (A03.get(index)) {
                    case 2:
                        i8 = 2;
                        i = c152756u3.A0C;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        sb2 = new StringBuilder();
                        str3 = AbstractC111324zv.A00(1842);
                        sb2.append(str3);
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(A02.get(index));
                        android.util.Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 5:
                        i6 = 5;
                        str4 = obtainStyledAttributes.getString(index);
                        aCr.A02(i6, str4);
                        break;
                    case 6:
                        i8 = 6;
                        i2 = obtainStyledAttributes.getDimensionPixelOffset(index, c152756u3.A0H);
                        aCr.A01(i8, i2);
                        break;
                    case 7:
                        i8 = 7;
                        i2 = obtainStyledAttributes.getDimensionPixelOffset(index, c152756u3.A0I);
                        aCr.A01(i8, i2);
                        break;
                    case 8:
                        i8 = 8;
                        i = c152756u3.A0J;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 11:
                        i8 = 11;
                        i = c152756u3.A0N;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        i8 = 12;
                        i = c152756u3.A0O;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        i8 = 13;
                        i = c152756u3.A0P;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 14:
                        i8 = 14;
                        i = c152756u3.A0Q;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case Process.SIGTERM /* 15 */:
                        i8 = 15;
                        i = c152756u3.A0R;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 16:
                        i8 = 16;
                        i = c152756u3.A0S;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 17:
                        i2 = obtainStyledAttributes.getDimensionPixelOffset(index, c152756u3.A0T);
                        aCr.A01(i8, i2);
                        break;
                    case 18:
                        i8 = 18;
                        i2 = obtainStyledAttributes.getDimensionPixelOffset(index, c152756u3.A0U);
                        aCr.A01(i8, i2);
                        break;
                    case Process.SIGSTOP /* 19 */:
                        i4 = 19;
                        f3 = c152756u3.A01;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 20:
                        i4 = 20;
                        f3 = c152756u3.A03;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 21:
                        aCr.A01(21, obtainStyledAttributes.getLayoutDimension(index, c152756u3.A0e));
                        break;
                    case 22:
                        aCr.A01(22, A04[obtainStyledAttributes.getInt(index, c152736u1.A03)]);
                        break;
                    case 23:
                        i8 = 23;
                        i2 = obtainStyledAttributes.getLayoutDimension(index, c152756u3.A0g);
                        aCr.A01(i8, i2);
                        break;
                    case 24:
                        i8 = 24;
                        i = c152756u3.A0Z;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 27:
                        i8 = 27;
                        i5 = c152756u3.A0i;
                        i2 = obtainStyledAttributes.getInt(index, i5);
                        aCr.A01(i8, i2);
                        break;
                    case 28:
                        i8 = 28;
                        i = c152756u3.A0j;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 31:
                        i8 = 31;
                        i = c152756u3.A0m;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 34:
                        i8 = 34;
                        i = c152756u3.A0p;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 37:
                        i4 = 37;
                        f3 = c152756u3.A05;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 38:
                        i9 = obtainStyledAttributes.getResourceId(index, c152726u0.A00);
                        c152726u0.A00 = i9;
                        i8 = 38;
                        aCr.A01(i8, i9);
                        break;
                    case 39:
                        i4 = 39;
                        f3 = c152756u3.A04;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 40:
                        i4 = 40;
                        f3 = c152756u3.A06;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case Seq.NULL_REFNUM /* 41 */:
                        i8 = 41;
                        i5 = c152756u3.A0Y;
                        i2 = obtainStyledAttributes.getInt(index, i5);
                        aCr.A01(i8, i2);
                        break;
                    case Seq.RefTracker.REF_OFFSET /* 42 */:
                        i8 = 42;
                        i5 = c152756u3.A0s;
                        i2 = obtainStyledAttributes.getInt(index, i5);
                        aCr.A01(i8, i2);
                        break;
                    case 43:
                        i4 = 43;
                        f3 = c152736u1.A00;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 44:
                        i4 = 44;
                        aCr.A03(44, true);
                        f = c152766u4.A00;
                        f2 = obtainStyledAttributes.getDimension(index, f);
                        aCr.A00(i4, f2);
                        break;
                    case 45:
                        i4 = 45;
                        f3 = c152766u4.A02;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                        i4 = 46;
                        f3 = c152766u4.A03;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 47:
                        i4 = 47;
                        f3 = c152766u4.A04;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 48:
                        i4 = 48;
                        f3 = c152766u4.A05;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 49:
                        i4 = 49;
                        f = c152766u4.A06;
                        f2 = obtainStyledAttributes.getDimension(index, f);
                        aCr.A00(i4, f2);
                        break;
                    case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                        i4 = 50;
                        f = c152766u4.A07;
                        f2 = obtainStyledAttributes.getDimension(index, f);
                        aCr.A00(i4, f2);
                        break;
                    case 51:
                        i4 = 51;
                        f = c152766u4.A08;
                        f2 = obtainStyledAttributes.getDimension(index, f);
                        aCr.A00(i4, f2);
                        break;
                    case 52:
                        i4 = 52;
                        f = c152766u4.A09;
                        f2 = obtainStyledAttributes.getDimension(index, f);
                        aCr.A00(i4, f2);
                        break;
                    case 53:
                        i4 = 53;
                        f = c152766u4.A0A;
                        f2 = obtainStyledAttributes.getDimension(index, f);
                        aCr.A00(i4, f2);
                        break;
                    case 54:
                        i8 = 54;
                        i5 = c152756u3.A0t;
                        i2 = obtainStyledAttributes.getInt(index, i5);
                        aCr.A01(i8, i2);
                        break;
                    case 55:
                        i8 = 55;
                        i5 = c152756u3.A0V;
                        i2 = obtainStyledAttributes.getInt(index, i5);
                        aCr.A01(i8, i2);
                        break;
                    case 56:
                        i8 = 56;
                        i = c152756u3.A0u;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 57:
                        i8 = 57;
                        i = c152756u3.A0W;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 58:
                        i8 = 58;
                        i = c152756u3.A0v;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 59:
                        i8 = 59;
                        i = c152756u3.A0X;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 60:
                        i4 = 60;
                        f3 = c152766u4.A01;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 62:
                        i8 = 62;
                        i = c152756u3.A0G;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case StringTreeSet.PAYLOAD_MASK /* 63 */:
                        i4 = 63;
                        f3 = c152756u3.A00;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 64:
                        i8 = 64;
                        i2 = A00(obtainStyledAttributes, index, c152746u2.A04);
                        aCr.A01(i8, i2);
                        break;
                    case 65:
                        i6 = 65;
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            str4 = AbstractC34368FDk.A00[obtainStyledAttributes.getInteger(index, 0)];
                            aCr.A02(i6, str4);
                            break;
                        }
                        str4 = obtainStyledAttributes.getString(index);
                        aCr.A02(i6, str4);
                    case 66:
                        i8 = 66;
                        i2 = obtainStyledAttributes.getInt(index, 0);
                        aCr.A01(i8, i2);
                        break;
                    case 67:
                        i4 = 67;
                        f3 = c152746u2.A01;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 68:
                        i4 = 68;
                        f3 = c152736u1.A01;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 69:
                        i4 = 69;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 70:
                        i4 = 70;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 71:
                        android.util.Log.e("ConstraintSet", AbstractC111324zv.A00(1521));
                        break;
                    case 72:
                        i8 = 72;
                        i5 = c152756u3.A0c;
                        i2 = obtainStyledAttributes.getInt(index, i5);
                        aCr.A01(i8, i2);
                        break;
                    case 73:
                        i8 = 73;
                        i = c152756u3.A0d;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 74:
                        i6 = 74;
                        str4 = obtainStyledAttributes.getString(index);
                        aCr.A02(i6, str4);
                        break;
                    case 75:
                        i3 = 75;
                        z = c152756u3.A13;
                        aCr.A03(i3, obtainStyledAttributes.getBoolean(index, z));
                        break;
                    case 76:
                        i8 = 76;
                        i5 = c152746u2.A06;
                        i2 = obtainStyledAttributes.getInt(index, i5);
                        aCr.A01(i8, i2);
                        break;
                    case 77:
                        i6 = 77;
                        str4 = obtainStyledAttributes.getString(index);
                        aCr.A02(i6, str4);
                        break;
                    case 78:
                        i8 = 78;
                        i5 = c152736u1.A02;
                        i2 = obtainStyledAttributes.getInt(index, i5);
                        aCr.A01(i8, i2);
                        break;
                    case 79:
                        i4 = 79;
                        f3 = c152746u2.A00;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 80:
                        i3 = 80;
                        z = c152756u3.A10;
                        aCr.A03(i3, obtainStyledAttributes.getBoolean(index, z));
                        break;
                    case 81:
                        i3 = 81;
                        z = c152756u3.A0z;
                        aCr.A03(i3, obtainStyledAttributes.getBoolean(index, z));
                        break;
                    case 82:
                        i8 = 82;
                        i2 = obtainStyledAttributes.getInteger(index, c152746u2.A03);
                        aCr.A01(i8, i2);
                        break;
                    case 83:
                        i8 = 83;
                        i2 = A00(obtainStyledAttributes, index, c152766u4.A0B);
                        aCr.A01(i8, i2);
                        break;
                    case 84:
                        i8 = 84;
                        i2 = obtainStyledAttributes.getInteger(index, c152746u2.A09);
                        aCr.A01(i8, i2);
                        break;
                    case 85:
                        i4 = 85;
                        f3 = c152746u2.A02;
                        f2 = obtainStyledAttributes.getFloat(index, f3);
                        aCr.A00(i4, f2);
                        break;
                    case 86:
                        TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                        i8 = 88;
                        if (peekValue.type == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            c152746u2.A08 = resourceId;
                            aCr.A01(89, resourceId);
                            if (c152746u2.A08 == -1) {
                                break;
                            }
                        } else {
                            if (peekValue.type == 3) {
                                String string = obtainStyledAttributes.getString(index);
                                c152746u2.A0A = string;
                                aCr.A02(90, string);
                                if (c152746u2.A0A.indexOf("/") > 0) {
                                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                                    c152746u2.A08 = resourceId2;
                                    aCr.A01(89, resourceId2);
                                }
                            } else {
                                i9 = obtainStyledAttributes.getInteger(index, c152746u2.A08);
                            }
                            aCr.A01(i8, i9);
                            break;
                        }
                        i2 = -2;
                        aCr.A01(i8, i2);
                        break;
                    case 87:
                        sb2 = new StringBuilder();
                        str3 = "unused attribute 0x";
                        sb2.append(str3);
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(A02.get(index));
                        android.util.Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 93:
                        i8 = 93;
                        i = c152756u3.A08;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 94:
                        i8 = 94;
                        i = c152756u3.A0M;
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i);
                        aCr.A01(i8, i2);
                        break;
                    case 95:
                        A04(obtainStyledAttributes, aCr, index, 0);
                        break;
                    case 96:
                        A04(obtainStyledAttributes, aCr, index, 1);
                        break;
                    case 97:
                        i8 = 97;
                        i5 = c152756u3.A0h;
                        i2 = obtainStyledAttributes.getInt(index, i5);
                        aCr.A01(i8, i2);
                        break;
                    case 98:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            c152726u0.A00 = obtainStyledAttributes.getResourceId(index, c152726u0.A00);
                            break;
                        }
                    case 99:
                        i3 = 99;
                        z = c152756u3.A11;
                        aCr.A03(i3, obtainStyledAttributes.getBoolean(index, z));
                        break;
                }
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount2; i10++) {
                int index2 = obtainStyledAttributes.getIndex(i10);
                if (index2 != 1 && 23 != index2 && 24 != index2) {
                    c152726u0.A04.A0C = true;
                    c152726u0.A03.A12 = true;
                    c152726u0.A05.A04 = true;
                    c152726u0.A06.A0D = true;
                }
                SparseIntArray sparseIntArray = A02;
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        C152756u3 c152756u32 = c152726u0.A03;
                        c152756u32.A09 = A00(obtainStyledAttributes, index2, c152756u32.A09);
                        continue;
                    case 2:
                        C152756u3 c152756u33 = c152726u0.A03;
                        c152756u33.A0C = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u33.A0C);
                        continue;
                    case 3:
                        C152756u3 c152756u34 = c152726u0.A03;
                        c152756u34.A0D = A00(obtainStyledAttributes, index2, c152756u34.A0D);
                        continue;
                    case 4:
                        C152756u3 c152756u35 = c152726u0.A03;
                        c152756u35.A0E = A00(obtainStyledAttributes, index2, c152756u35.A0E);
                        continue;
                    case 5:
                        c152726u0.A03.A0w = obtainStyledAttributes.getString(index2);
                        continue;
                    case 6:
                        C152756u3 c152756u36 = c152726u0.A03;
                        c152756u36.A0H = obtainStyledAttributes.getDimensionPixelOffset(index2, c152756u36.A0H);
                        continue;
                    case 7:
                        C152756u3 c152756u37 = c152726u0.A03;
                        c152756u37.A0I = obtainStyledAttributes.getDimensionPixelOffset(index2, c152756u37.A0I);
                        continue;
                    case 8:
                        C152756u3 c152756u38 = c152726u0.A03;
                        c152756u38.A0J = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u38.A0J);
                        continue;
                    case 9:
                        C152756u3 c152756u39 = c152726u0.A03;
                        c152756u39.A0K = A00(obtainStyledAttributes, index2, c152756u39.A0K);
                        continue;
                    case 10:
                        C152756u3 c152756u310 = c152726u0.A03;
                        c152756u310.A0L = A00(obtainStyledAttributes, index2, c152756u310.A0L);
                        continue;
                    case 11:
                        C152756u3 c152756u311 = c152726u0.A03;
                        c152756u311.A0N = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u311.A0N);
                        continue;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        C152756u3 c152756u312 = c152726u0.A03;
                        c152756u312.A0O = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u312.A0O);
                        continue;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        C152756u3 c152756u313 = c152726u0.A03;
                        c152756u313.A0P = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u313.A0P);
                        continue;
                    case 14:
                        C152756u3 c152756u314 = c152726u0.A03;
                        c152756u314.A0Q = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u314.A0Q);
                        continue;
                    case Process.SIGTERM /* 15 */:
                        C152756u3 c152756u315 = c152726u0.A03;
                        c152756u315.A0R = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u315.A0R);
                        continue;
                    case 16:
                        C152756u3 c152756u316 = c152726u0.A03;
                        c152756u316.A0S = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u316.A0S);
                        continue;
                    case 17:
                        C152756u3 c152756u317 = c152726u0.A03;
                        c152756u317.A0T = obtainStyledAttributes.getDimensionPixelOffset(index2, c152756u317.A0T);
                        continue;
                    case 18:
                        C152756u3 c152756u318 = c152726u0.A03;
                        c152756u318.A0U = obtainStyledAttributes.getDimensionPixelOffset(index2, c152756u318.A0U);
                        continue;
                    case Process.SIGSTOP /* 19 */:
                        C152756u3 c152756u319 = c152726u0.A03;
                        c152756u319.A01 = obtainStyledAttributes.getFloat(index2, c152756u319.A01);
                        continue;
                    case 20:
                        C152756u3 c152756u320 = c152726u0.A03;
                        c152756u320.A03 = obtainStyledAttributes.getFloat(index2, c152756u320.A03);
                        continue;
                    case 21:
                        C152756u3 c152756u321 = c152726u0.A03;
                        c152756u321.A0e = obtainStyledAttributes.getLayoutDimension(index2, c152756u321.A0e);
                        continue;
                    case 22:
                        C152736u1 c152736u12 = c152726u0.A05;
                        int i11 = obtainStyledAttributes.getInt(index2, c152736u12.A03);
                        c152736u12.A03 = i11;
                        c152736u12.A03 = A04[i11];
                        continue;
                    case 23:
                        C152756u3 c152756u322 = c152726u0.A03;
                        c152756u322.A0g = obtainStyledAttributes.getLayoutDimension(index2, c152756u322.A0g);
                        continue;
                    case 24:
                        C152756u3 c152756u323 = c152726u0.A03;
                        c152756u323.A0Z = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u323.A0Z);
                        continue;
                    case 25:
                        C152756u3 c152756u324 = c152726u0.A03;
                        c152756u324.A0a = A00(obtainStyledAttributes, index2, c152756u324.A0a);
                        continue;
                    case 26:
                        C152756u3 c152756u325 = c152726u0.A03;
                        c152756u325.A0b = A00(obtainStyledAttributes, index2, c152756u325.A0b);
                        continue;
                    case 27:
                        C152756u3 c152756u326 = c152726u0.A03;
                        c152756u326.A0i = obtainStyledAttributes.getInt(index2, c152756u326.A0i);
                        continue;
                    case 28:
                        C152756u3 c152756u327 = c152726u0.A03;
                        c152756u327.A0j = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u327.A0j);
                        continue;
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                        C152756u3 c152756u328 = c152726u0.A03;
                        c152756u328.A0k = A00(obtainStyledAttributes, index2, c152756u328.A0k);
                        continue;
                    case 30:
                        C152756u3 c152756u329 = c152726u0.A03;
                        c152756u329.A0l = A00(obtainStyledAttributes, index2, c152756u329.A0l);
                        continue;
                    case 31:
                        C152756u3 c152756u330 = c152726u0.A03;
                        c152756u330.A0m = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u330.A0m);
                        continue;
                    case 32:
                        C152756u3 c152756u331 = c152726u0.A03;
                        c152756u331.A0n = A00(obtainStyledAttributes, index2, c152756u331.A0n);
                        continue;
                    case 33:
                        C152756u3 c152756u332 = c152726u0.A03;
                        c152756u332.A0o = A00(obtainStyledAttributes, index2, c152756u332.A0o);
                        continue;
                    case 34:
                        C152756u3 c152756u333 = c152726u0.A03;
                        c152756u333.A0p = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u333.A0p);
                        continue;
                    case 35:
                        C152756u3 c152756u334 = c152726u0.A03;
                        c152756u334.A0q = A00(obtainStyledAttributes, index2, c152756u334.A0q);
                        continue;
                    case 36:
                        C152756u3 c152756u335 = c152726u0.A03;
                        c152756u335.A0r = A00(obtainStyledAttributes, index2, c152756u335.A0r);
                        continue;
                    case 37:
                        C152756u3 c152756u336 = c152726u0.A03;
                        c152756u336.A05 = obtainStyledAttributes.getFloat(index2, c152756u336.A05);
                        continue;
                    case 38:
                        c152726u0.A00 = obtainStyledAttributes.getResourceId(index2, c152726u0.A00);
                        continue;
                    case 39:
                        C152756u3 c152756u337 = c152726u0.A03;
                        c152756u337.A04 = obtainStyledAttributes.getFloat(index2, c152756u337.A04);
                        continue;
                    case 40:
                        C152756u3 c152756u338 = c152726u0.A03;
                        c152756u338.A06 = obtainStyledAttributes.getFloat(index2, c152756u338.A06);
                        continue;
                    case Seq.NULL_REFNUM /* 41 */:
                        C152756u3 c152756u339 = c152726u0.A03;
                        c152756u339.A0Y = obtainStyledAttributes.getInt(index2, c152756u339.A0Y);
                        continue;
                    case Seq.RefTracker.REF_OFFSET /* 42 */:
                        C152756u3 c152756u340 = c152726u0.A03;
                        c152756u340.A0s = obtainStyledAttributes.getInt(index2, c152756u340.A0s);
                        continue;
                    case 43:
                        C152736u1 c152736u13 = c152726u0.A05;
                        c152736u13.A00 = obtainStyledAttributes.getFloat(index2, c152736u13.A00);
                        continue;
                    case 44:
                        C152766u4 c152766u42 = c152726u0.A06;
                        c152766u42.A0C = true;
                        c152766u42.A00 = obtainStyledAttributes.getDimension(index2, c152766u42.A00);
                        continue;
                    case 45:
                        C152766u4 c152766u43 = c152726u0.A06;
                        c152766u43.A02 = obtainStyledAttributes.getFloat(index2, c152766u43.A02);
                        continue;
                    case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                        C152766u4 c152766u44 = c152726u0.A06;
                        c152766u44.A03 = obtainStyledAttributes.getFloat(index2, c152766u44.A03);
                        continue;
                    case 47:
                        C152766u4 c152766u45 = c152726u0.A06;
                        c152766u45.A04 = obtainStyledAttributes.getFloat(index2, c152766u45.A04);
                        continue;
                    case 48:
                        C152766u4 c152766u46 = c152726u0.A06;
                        c152766u46.A05 = obtainStyledAttributes.getFloat(index2, c152766u46.A05);
                        continue;
                    case 49:
                        C152766u4 c152766u47 = c152726u0.A06;
                        c152766u47.A06 = obtainStyledAttributes.getDimension(index2, c152766u47.A06);
                        continue;
                    case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                        C152766u4 c152766u48 = c152726u0.A06;
                        c152766u48.A07 = obtainStyledAttributes.getDimension(index2, c152766u48.A07);
                        continue;
                    case 51:
                        C152766u4 c152766u49 = c152726u0.A06;
                        c152766u49.A08 = obtainStyledAttributes.getDimension(index2, c152766u49.A08);
                        continue;
                    case 52:
                        C152766u4 c152766u410 = c152726u0.A06;
                        c152766u410.A09 = obtainStyledAttributes.getDimension(index2, c152766u410.A09);
                        continue;
                    case 53:
                        C152766u4 c152766u411 = c152726u0.A06;
                        c152766u411.A0A = obtainStyledAttributes.getDimension(index2, c152766u411.A0A);
                        continue;
                    case 54:
                        C152756u3 c152756u341 = c152726u0.A03;
                        c152756u341.A0t = obtainStyledAttributes.getInt(index2, c152756u341.A0t);
                        continue;
                    case 55:
                        C152756u3 c152756u342 = c152726u0.A03;
                        c152756u342.A0V = obtainStyledAttributes.getInt(index2, c152756u342.A0V);
                        continue;
                    case 56:
                        C152756u3 c152756u343 = c152726u0.A03;
                        c152756u343.A0u = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u343.A0u);
                        continue;
                    case 57:
                        C152756u3 c152756u344 = c152726u0.A03;
                        c152756u344.A0W = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u344.A0W);
                        continue;
                    case 58:
                        C152756u3 c152756u345 = c152726u0.A03;
                        c152756u345.A0v = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u345.A0v);
                        continue;
                    case 59:
                        C152756u3 c152756u346 = c152726u0.A03;
                        c152756u346.A0X = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u346.A0X);
                        continue;
                    case 60:
                        C152766u4 c152766u412 = c152726u0.A06;
                        c152766u412.A01 = obtainStyledAttributes.getFloat(index2, c152766u412.A01);
                        continue;
                    case 61:
                        C152756u3 c152756u347 = c152726u0.A03;
                        c152756u347.A0F = A00(obtainStyledAttributes, index2, c152756u347.A0F);
                        continue;
                    case 62:
                        C152756u3 c152756u348 = c152726u0.A03;
                        c152756u348.A0G = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u348.A0G);
                        continue;
                    case StringTreeSet.PAYLOAD_MASK /* 63 */:
                        C152756u3 c152756u349 = c152726u0.A03;
                        c152756u349.A00 = obtainStyledAttributes.getFloat(index2, c152756u349.A00);
                        continue;
                    case 64:
                        C152746u2 c152746u22 = c152726u0.A04;
                        c152746u22.A04 = A00(obtainStyledAttributes, index2, c152746u22.A04);
                        continue;
                    case 65:
                        int i12 = obtainStyledAttributes.peekValue(index2).type;
                        C152746u2 c152746u23 = c152726u0.A04;
                        if (i12 == 3) {
                            str2 = obtainStyledAttributes.getString(index2);
                        } else {
                            str2 = AbstractC34368FDk.A00[obtainStyledAttributes.getInteger(index2, 0)];
                        }
                        c152746u23.A0B = str2;
                        continue;
                    case 66:
                        c152726u0.A04.A05 = obtainStyledAttributes.getInt(index2, 0);
                        continue;
                    case 67:
                        C152746u2 c152746u24 = c152726u0.A04;
                        c152746u24.A01 = obtainStyledAttributes.getFloat(index2, c152746u24.A01);
                        continue;
                    case 68:
                        C152736u1 c152736u14 = c152726u0.A05;
                        c152736u14.A01 = obtainStyledAttributes.getFloat(index2, c152736u14.A01);
                        continue;
                    case 69:
                        c152726u0.A03.A07 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        continue;
                    case 70:
                        c152726u0.A03.A02 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        continue;
                    case 71:
                        android.util.Log.e("ConstraintSet", AbstractC111324zv.A00(1521));
                        continue;
                    case 72:
                        C152756u3 c152756u350 = c152726u0.A03;
                        c152756u350.A0c = obtainStyledAttributes.getInt(index2, c152756u350.A0c);
                        continue;
                    case 73:
                        C152756u3 c152756u351 = c152726u0.A03;
                        c152756u351.A0d = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u351.A0d);
                        continue;
                    case 74:
                        c152726u0.A03.A0y = obtainStyledAttributes.getString(index2);
                        continue;
                    case 75:
                        C152756u3 c152756u352 = c152726u0.A03;
                        c152756u352.A13 = obtainStyledAttributes.getBoolean(index2, c152756u352.A13);
                        continue;
                    case 76:
                        C152746u2 c152746u25 = c152726u0.A04;
                        c152746u25.A06 = obtainStyledAttributes.getInt(index2, c152746u25.A06);
                        continue;
                    case 77:
                        c152726u0.A03.A0x = obtainStyledAttributes.getString(index2);
                        continue;
                    case 78:
                        C152736u1 c152736u15 = c152726u0.A05;
                        c152736u15.A02 = obtainStyledAttributes.getInt(index2, c152736u15.A02);
                        continue;
                    case 79:
                        C152746u2 c152746u26 = c152726u0.A04;
                        c152746u26.A00 = obtainStyledAttributes.getFloat(index2, c152746u26.A00);
                        continue;
                    case 80:
                        C152756u3 c152756u353 = c152726u0.A03;
                        c152756u353.A10 = obtainStyledAttributes.getBoolean(index2, c152756u353.A10);
                        continue;
                    case 81:
                        C152756u3 c152756u354 = c152726u0.A03;
                        c152756u354.A0z = obtainStyledAttributes.getBoolean(index2, c152756u354.A0z);
                        continue;
                    case 82:
                        C152746u2 c152746u27 = c152726u0.A04;
                        c152746u27.A03 = obtainStyledAttributes.getInteger(index2, c152746u27.A03);
                        continue;
                    case 83:
                        C152766u4 c152766u413 = c152726u0.A06;
                        c152766u413.A0B = A00(obtainStyledAttributes, index2, c152766u413.A0B);
                        continue;
                    case 84:
                        C152746u2 c152746u28 = c152726u0.A04;
                        c152746u28.A09 = obtainStyledAttributes.getInteger(index2, c152746u28.A09);
                        continue;
                    case 85:
                        C152746u2 c152746u29 = c152726u0.A04;
                        c152746u29.A02 = obtainStyledAttributes.getFloat(index2, c152746u29.A02);
                        continue;
                    case 86:
                        TypedValue peekValue2 = obtainStyledAttributes.peekValue(index2);
                        if (peekValue2.type == 1) {
                            c152726u0.A04.A08 = obtainStyledAttributes.getResourceId(index2, -1);
                            continue;
                        } else {
                            int i13 = peekValue2.type;
                            C152746u2 c152746u210 = c152726u0.A04;
                            if (i13 == 3) {
                                String string2 = obtainStyledAttributes.getString(index2);
                                c152746u210.A0A = string2;
                                if (string2.indexOf("/") > 0) {
                                    c152746u210.A08 = obtainStyledAttributes.getResourceId(index2, -1);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                obtainStyledAttributes.getInteger(index2, c152746u210.A08);
                                break;
                            }
                        }
                    case 87:
                        sb = new StringBuilder();
                        str = "unused attribute 0x";
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        sb = new StringBuilder();
                        str = AbstractC111324zv.A00(1842);
                        break;
                    case 91:
                        C152756u3 c152756u355 = c152726u0.A03;
                        c152756u355.A0B = A00(obtainStyledAttributes, index2, c152756u355.A0B);
                        continue;
                    case 92:
                        C152756u3 c152756u356 = c152726u0.A03;
                        c152756u356.A0A = A00(obtainStyledAttributes, index2, c152756u356.A0A);
                        continue;
                    case 93:
                        C152756u3 c152756u357 = c152726u0.A03;
                        c152756u357.A08 = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u357.A08);
                        continue;
                    case 94:
                        C152756u3 c152756u358 = c152726u0.A03;
                        c152756u358.A0M = obtainStyledAttributes.getDimensionPixelSize(index2, c152756u358.A0M);
                        continue;
                    case 95:
                        A04(obtainStyledAttributes, c152726u0.A03, index2, 0);
                        continue;
                    case 96:
                        A04(obtainStyledAttributes, c152726u0.A03, index2, 1);
                        continue;
                    case 97:
                        C152756u3 c152756u359 = c152726u0.A03;
                        c152756u359.A0h = obtainStyledAttributes.getInt(index2, c152756u359.A0h);
                        continue;
                }
                sb.append(str);
                sb.append(Integer.toHexString(index2));
                sb.append("   ");
                sb.append(sparseIntArray.get(index2));
                android.util.Log.w("ConstraintSet", sb.toString());
            }
            C152756u3 c152756u360 = c152726u0.A03;
            if (c152756u360.A0y != null) {
                c152756u360.A15 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c152726u0;
    }

    public static C152726u0 A02(C110964z8 c110964z8, int i) {
        HashMap hashMap = c110964z8.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new C152726u0());
        }
        return (C152726u0) hashMap.get(valueOf);
    }

    public static void A05(C56302iJ params, String value) {
        float f = Float.NaN;
        int i = -1;
        if (value != null) {
            int length = value.length();
            int indexOf = value.indexOf(44);
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = value.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = value.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = value.substring(i2, indexOf2);
                    String substring3 = value.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                f = Math.abs(parseFloat2 / parseFloat);
                            } else {
                                f = Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = value.substring(i2);
                    if (substring4.length() > 0) {
                        f = Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        params.A0z = value;
        params.A01 = f;
        params.A0J = i;
    }

    public static int[] A06(View view, String referenceIdString) {
        int i;
        Object obj;
        HashMap hashMap;
        String[] split = referenceIdString.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        Context context = view.getContext();
        int length = split.length;
        int[] iArr = new int[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String trim = split[i2].trim();
            try {
                i = C3O5.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, PublicKeyCredentialControllerUtility.JSON_KEY_ID, context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view.getParent();
                if (trim != null && (hashMap = constraintLayout.A0F) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.A0F.get(trim);
                } else {
                    obj = null;
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Number) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    public final void A09(int viewId, int anchor) {
        C152726u0 c152726u0;
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(viewId);
        if (hashMap.containsKey(valueOf) && (c152726u0 = (C152726u0) hashMap.get(valueOf)) != null) {
            C152756u3 c152756u3 = c152726u0.A03;
            switch (anchor) {
                case 1:
                    c152756u3.A0b = -1;
                    c152756u3.A0a = -1;
                    c152756u3.A0Z = -1;
                    c152756u3.A0P = Integer.MIN_VALUE;
                    return;
                case 2:
                    c152756u3.A0l = -1;
                    c152756u3.A0k = -1;
                    c152756u3.A0j = -1;
                    c152756u3.A0Q = Integer.MIN_VALUE;
                    return;
                case 3:
                    c152756u3.A0q = -1;
                    c152756u3.A0r = -1;
                    c152756u3.A0p = 0;
                    c152756u3.A0S = Integer.MIN_VALUE;
                    return;
                case 4:
                    c152756u3.A0E = -1;
                    c152756u3.A0D = -1;
                    c152756u3.A0C = 0;
                    c152756u3.A0N = Integer.MIN_VALUE;
                    return;
                case 5:
                    c152756u3.A09 = -1;
                    c152756u3.A0B = -1;
                    c152756u3.A0A = -1;
                    c152756u3.A08 = 0;
                    c152756u3.A0M = Integer.MIN_VALUE;
                    return;
                case 6:
                    c152756u3.A0n = -1;
                    c152756u3.A0o = -1;
                    c152756u3.A0m = 0;
                    c152756u3.A0R = Integer.MIN_VALUE;
                    return;
                default:
                    c152756u3.A0L = -1;
                    c152756u3.A0K = -1;
                    c152756u3.A0J = 0;
                    c152756u3.A0O = Integer.MIN_VALUE;
                    return;
            }
        }
    }

    public final void A0C(int startID, int startSide, int endID, int endSide) {
        C152756u3 c152756u3;
        C152756u3 c152756u32;
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(startID);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new C152726u0());
        }
        C152726u0 c152726u0 = (C152726u0) hashMap.get(valueOf);
        if (c152726u0 == null) {
            return;
        }
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    C152756u3 c152756u33 = c152726u0.A03;
                    c152756u33.A0a = endID;
                    c152756u33.A0b = -1;
                    return;
                } else {
                    if (endSide == 2) {
                        C152756u3 c152756u34 = c152726u0.A03;
                        c152756u34.A0b = endID;
                        c152756u34.A0a = -1;
                        return;
                    }
                    throw new IllegalArgumentException(AnonymousClass001.A0g("left to ", A03(endSide), " undefined"));
                }
            case 2:
                if (endSide == 1) {
                    C152756u3 c152756u35 = c152726u0.A03;
                    c152756u35.A0k = endID;
                    c152756u35.A0l = -1;
                    return;
                } else {
                    if (endSide == 2) {
                        C152756u3 c152756u36 = c152726u0.A03;
                        c152756u36.A0l = endID;
                        c152756u36.A0k = -1;
                        return;
                    }
                    throw new IllegalArgumentException(AnonymousClass001.A0g("right to ", A03(endSide), " undefined"));
                }
            case 3:
                if (endSide == 3) {
                    c152756u3 = c152726u0.A03;
                    c152756u3.A0r = endID;
                    c152756u3.A0q = -1;
                    break;
                } else if (endSide == 4) {
                    c152756u3 = c152726u0.A03;
                    c152756u3.A0q = endID;
                    c152756u3.A0r = -1;
                    break;
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A0g("right to ", A03(endSide), " undefined"));
                }
            case 4:
                if (endSide == 4) {
                    c152756u3 = c152726u0.A03;
                    c152756u3.A0D = endID;
                    c152756u3.A0E = -1;
                    break;
                } else if (endSide == 3) {
                    c152756u3 = c152726u0.A03;
                    c152756u3.A0E = endID;
                    c152756u3.A0D = -1;
                    break;
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A0g("right to ", A03(endSide), " undefined"));
                }
            case 5:
                if (endSide == 5) {
                    c152756u32 = c152726u0.A03;
                    c152756u32.A09 = endID;
                } else if (endSide == 3) {
                    c152756u32 = c152726u0.A03;
                    c152756u32.A0B = endID;
                } else if (endSide == 4) {
                    c152756u32 = c152726u0.A03;
                    c152756u32.A0A = endID;
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A0g("right to ", A03(endSide), " undefined"));
                }
                c152756u32.A0D = -1;
                c152756u32.A0E = -1;
                c152756u32.A0r = -1;
                c152756u32.A0q = -1;
                return;
            case 6:
                if (endSide == 6) {
                    C152756u3 c152756u37 = c152726u0.A03;
                    c152756u37.A0o = endID;
                    c152756u37.A0n = -1;
                    return;
                } else {
                    if (endSide == 7) {
                        C152756u3 c152756u38 = c152726u0.A03;
                        c152756u38.A0n = endID;
                        c152756u38.A0o = -1;
                        return;
                    }
                    throw new IllegalArgumentException(AnonymousClass001.A0g("right to ", A03(endSide), " undefined"));
                }
            default:
                if (endSide == 7) {
                    C152756u3 c152756u39 = c152726u0.A03;
                    c152756u39.A0K = endID;
                    c152756u39.A0L = -1;
                    return;
                } else {
                    if (endSide == 6) {
                        C152756u3 c152756u310 = c152726u0.A03;
                        c152756u310.A0L = endID;
                        c152756u310.A0K = -1;
                        return;
                    }
                    throw new IllegalArgumentException(AnonymousClass001.A0g("right to ", A03(endSide), " undefined"));
                }
        }
        c152756u3.A09 = -1;
        c152756u3.A0B = -1;
        c152756u3.A0A = -1;
    }

    public final void A0E(int startID, int startSide, int endID, int endSide, int margin) {
        C152756u3 c152756u3;
        C152756u3 c152756u32;
        C152756u3 c152756u33;
        C152756u3 c152756u34;
        C152756u3 c152756u35;
        C152756u3 c152756u36;
        C152756u3 c152756u37;
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(startID);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new C152726u0());
        }
        C152726u0 c152726u0 = (C152726u0) hashMap.get(valueOf);
        if (c152726u0 == null) {
            return;
        }
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    c152756u3 = c152726u0.A03;
                    c152756u3.A0a = endID;
                    c152756u3.A0b = -1;
                } else if (endSide == 2) {
                    c152756u3 = c152726u0.A03;
                    c152756u3.A0b = endID;
                    c152756u3.A0a = -1;
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A0g("Left to ", A03(endSide), " undefined"));
                }
                c152756u3.A0Z = margin;
                return;
            case 2:
                if (endSide == 1) {
                    c152756u32 = c152726u0.A03;
                    c152756u32.A0k = endID;
                    c152756u32.A0l = -1;
                } else if (endSide == 2) {
                    c152756u32 = c152726u0.A03;
                    c152756u32.A0l = endID;
                    c152756u32.A0k = -1;
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A0g("right to ", A03(endSide), " undefined"));
                }
                c152756u32.A0j = margin;
                return;
            case 3:
                if (endSide == 3) {
                    c152756u33 = c152726u0.A03;
                    c152756u33.A0r = endID;
                    c152756u33.A0q = -1;
                } else if (endSide == 4) {
                    c152756u33 = c152726u0.A03;
                    c152756u33.A0q = endID;
                    c152756u33.A0r = -1;
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A0g("right to ", A03(endSide), " undefined"));
                }
                c152756u33.A09 = -1;
                c152756u33.A0B = -1;
                c152756u33.A0A = -1;
                c152756u33.A0p = margin;
                return;
            case 4:
                if (endSide == 4) {
                    c152756u34 = c152726u0.A03;
                    c152756u34.A0D = endID;
                    c152756u34.A0E = -1;
                } else if (endSide == 3) {
                    c152756u34 = c152726u0.A03;
                    c152756u34.A0E = endID;
                    c152756u34.A0D = -1;
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A0g("right to ", A03(endSide), " undefined"));
                }
                c152756u34.A09 = -1;
                c152756u34.A0B = -1;
                c152756u34.A0A = -1;
                c152756u34.A0C = margin;
                return;
            case 5:
                if (endSide == 5) {
                    c152756u35 = c152726u0.A03;
                    c152756u35.A09 = endID;
                } else if (endSide == 3) {
                    c152756u35 = c152726u0.A03;
                    c152756u35.A0B = endID;
                } else if (endSide == 4) {
                    c152756u35 = c152726u0.A03;
                    c152756u35.A0A = endID;
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A0g("right to ", A03(endSide), " undefined"));
                }
                c152756u35.A0D = -1;
                c152756u35.A0E = -1;
                c152756u35.A0r = -1;
                c152756u35.A0q = -1;
                return;
            case 6:
                if (endSide == 6) {
                    c152756u36 = c152726u0.A03;
                    c152756u36.A0o = endID;
                    c152756u36.A0n = -1;
                } else if (endSide == 7) {
                    c152756u36 = c152726u0.A03;
                    c152756u36.A0n = endID;
                    c152756u36.A0o = -1;
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A0g("right to ", A03(endSide), " undefined"));
                }
                c152756u36.A0m = margin;
                return;
            default:
                if (endSide == 7) {
                    c152756u37 = c152726u0.A03;
                    c152756u37.A0K = endID;
                    c152756u37.A0L = -1;
                } else if (endSide == 6) {
                    c152756u37 = c152726u0.A03;
                    c152756u37.A0L = endID;
                    c152756u37.A0K = -1;
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A0g("right to ", A03(endSide), " undefined"));
                }
                c152756u37.A0J = margin;
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0277, code lost:
    
        if (java.lang.Float.isNaN(r3) == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0H(androidx.constraintlayout.widget.ConstraintLayout r23) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110964z8.A0H(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, X.9v9] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, X.9v9] */
    public final void A0I(ConstraintLayout constraintLayout) {
        Object invoke;
        C224259v9 c224259v9;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = this.A00;
        hashMap.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            C56302iJ c56302iJ = (C56302iJ) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new C152726u0());
                }
                C152726u0 c152726u0 = (C152726u0) hashMap.get(Integer.valueOf(id));
                if (c152726u0 != null) {
                    HashMap hashMap2 = this.A01;
                    HashMap hashMap3 = new HashMap();
                    Class<?> cls = childAt.getClass();
                    for (String str : hashMap2.keySet()) {
                        C224259v9 c224259v92 = (C224259v9) hashMap2.get(str);
                        try {
                            if (str.equals("BackgroundColor")) {
                                invoke = Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor());
                                ?? obj = new Object();
                                obj.A07 = false;
                                obj.A04 = c224259v92.A04;
                                obj.A03 = c224259v92.A03;
                                c224259v9 = obj;
                            } else {
                                invoke = cls.getMethod(AnonymousClass001.A0R("getMap", str), new Class[0]).invoke(childAt, new Object[0]);
                                ?? obj2 = new Object();
                                obj2.A07 = false;
                                obj2.A04 = c224259v92.A04;
                                obj2.A03 = c224259v92.A03;
                                c224259v9 = obj2;
                            }
                            c224259v9.A00(invoke);
                            hashMap3.put(str, c224259v9);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                    c152726u0.A02 = hashMap3;
                    c152726u0.A00 = id;
                    C152756u3 c152756u3 = c152726u0.A03;
                    c152756u3.A0a = c56302iJ.A0Y;
                    c152756u3.A0b = c56302iJ.A0Z;
                    c152756u3.A0k = c56302iJ.A0p;
                    c152756u3.A0l = c56302iJ.A0q;
                    c152756u3.A0r = c56302iJ.A0u;
                    c152756u3.A0q = c56302iJ.A0t;
                    c152756u3.A0E = c56302iJ.A0G;
                    c152756u3.A0D = c56302iJ.A0F;
                    c152756u3.A09 = c56302iJ.A0C;
                    c152756u3.A0B = c56302iJ.A0E;
                    c152756u3.A0A = c56302iJ.A0D;
                    c152756u3.A0n = c56302iJ.A0r;
                    c152756u3.A0o = c56302iJ.A0s;
                    c152756u3.A0L = c56302iJ.A0N;
                    c152756u3.A0K = c56302iJ.A0M;
                    c152756u3.A03 = c56302iJ.A03;
                    c152756u3.A05 = c56302iJ.A09;
                    c152756u3.A0w = c56302iJ.A0z;
                    c152756u3.A0F = c56302iJ.A0H;
                    c152756u3.A0G = c56302iJ.A0I;
                    c152756u3.A00 = c56302iJ.A00;
                    c152756u3.A0H = c56302iJ.A0K;
                    c152756u3.A0I = c56302iJ.A0L;
                    c152756u3.A0i = c56302iJ.A0g;
                    c152756u3.A01 = c56302iJ.A02;
                    c152756u3.A0T = c56302iJ.A0V;
                    c152756u3.A0U = c56302iJ.A0W;
                    c152756u3.A0g = ((ViewGroup.LayoutParams) c56302iJ).width;
                    c152756u3.A0e = ((ViewGroup.LayoutParams) c56302iJ).height;
                    c152756u3.A0Z = ((ViewGroup.MarginLayoutParams) c56302iJ).leftMargin;
                    c152756u3.A0j = ((ViewGroup.MarginLayoutParams) c56302iJ).rightMargin;
                    c152756u3.A0p = ((ViewGroup.MarginLayoutParams) c56302iJ).topMargin;
                    c152756u3.A0C = ((ViewGroup.MarginLayoutParams) c56302iJ).bottomMargin;
                    c152756u3.A08 = c56302iJ.A0B;
                    c152756u3.A06 = c56302iJ.A0A;
                    c152756u3.A04 = c56302iJ.A04;
                    c152756u3.A0s = c56302iJ.A0v;
                    c152756u3.A0Y = c56302iJ.A0X;
                    c152756u3.A10 = c56302iJ.A11;
                    c152756u3.A0z = c56302iJ.A10;
                    c152756u3.A0t = c56302iJ.A0b;
                    c152756u3.A0V = c56302iJ.A0a;
                    c152756u3.A0u = c56302iJ.A0d;
                    c152756u3.A0W = c56302iJ.A0c;
                    c152756u3.A0v = c56302iJ.A0f;
                    c152756u3.A0X = c56302iJ.A0e;
                    c152756u3.A07 = c56302iJ.A06;
                    c152756u3.A02 = c56302iJ.A05;
                    c152756u3.A0x = c56302iJ.A0y;
                    c152756u3.A0S = c56302iJ.A0U;
                    c152756u3.A0N = c56302iJ.A0P;
                    c152756u3.A0P = c56302iJ.A0R;
                    c152756u3.A0Q = c56302iJ.A0S;
                    c152756u3.A0R = c56302iJ.A0T;
                    c152756u3.A0O = c56302iJ.A0Q;
                    c152756u3.A0M = c56302iJ.A0O;
                    c152756u3.A0h = c56302iJ.A0w;
                    c152756u3.A0J = c56302iJ.getMarginEnd();
                    c152756u3.A0m = c56302iJ.getMarginStart();
                    C152736u1 c152736u1 = c152726u0.A05;
                    c152736u1.A03 = childAt.getVisibility();
                    c152736u1.A00 = childAt.getAlpha();
                    C152766u4 c152766u4 = c152726u0.A06;
                    c152766u4.A01 = childAt.getRotation();
                    c152766u4.A02 = childAt.getRotationX();
                    c152766u4.A03 = childAt.getRotationY();
                    c152766u4.A04 = childAt.getScaleX();
                    c152766u4.A05 = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        c152766u4.A06 = pivotX;
                        c152766u4.A07 = pivotY;
                    }
                    c152766u4.A08 = childAt.getTranslationX();
                    c152766u4.A09 = childAt.getTranslationY();
                    c152766u4.A0A = childAt.getTranslationZ();
                    if (c152766u4.A0C) {
                        c152766u4.A00 = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        C152756u3 c152756u32 = c152726u0.A03;
                        c152756u32.A13 = barrier.A01.A02;
                        c152756u32.A15 = barrier.getReferencedIds();
                        c152756u32.A0c = barrier.A00;
                        c152756u32.A0d = barrier.A01.A01;
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public static int A00(TypedArray a, int index, int def) {
        int resourceId = a.getResourceId(index, def);
        if (resourceId == -1) {
            return a.getInt(index, -1);
        }
        return resourceId;
    }

    public static void A04(TypedArray data, Object a, int attr, int orientation) {
        int i;
        int i2;
        int i3;
        int i4 = data.peekValue(attr).type;
        if (i4 != 3) {
            int i5 = -2;
            boolean z = false;
            if (i4 != 5) {
                int i6 = data.getInt(attr, 0);
                if (i6 != -4) {
                    if (i6 == -3 || (i6 != -2 && i6 != -1)) {
                        i5 = 0;
                    } else {
                        i5 = i6;
                    }
                } else {
                    z = true;
                }
            } else {
                i5 = data.getDimensionPixelSize(attr, 0);
            }
            if (a instanceof C56302iJ) {
                C56302iJ c56302iJ = (C56302iJ) a;
                if (orientation == 0) {
                    ((ViewGroup.LayoutParams) c56302iJ).width = i5;
                    c56302iJ.A11 = z;
                    return;
                } else {
                    ((ViewGroup.LayoutParams) c56302iJ).height = i5;
                    c56302iJ.A10 = z;
                    return;
                }
            }
            if (a instanceof C152756u3) {
                C152756u3 c152756u3 = (C152756u3) a;
                if (orientation == 0) {
                    c152756u3.A0g = i5;
                    c152756u3.A10 = z;
                    return;
                } else {
                    c152756u3.A0e = i5;
                    c152756u3.A0z = z;
                    return;
                }
            }
            if (!(a instanceof ACr)) {
                return;
            }
            ACr aCr = (ACr) a;
            if (orientation == 0) {
                aCr.A01(23, i5);
                i3 = 80;
            } else {
                aCr.A01(21, i5);
                i3 = 81;
            }
            aCr.A03(i3, z);
            return;
        }
        String string = data.getString(attr);
        if (string == null) {
            return;
        }
        int indexOf = string.indexOf(61);
        int length = string.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = string.substring(0, indexOf);
        String substring2 = string.substring(indexOf + 1);
        if (substring2.length() <= 0) {
            return;
        }
        String trim = substring.trim();
        String trim2 = substring2.trim();
        if ("ratio".equalsIgnoreCase(trim)) {
            if (a instanceof C56302iJ) {
                C56302iJ c56302iJ2 = (C56302iJ) a;
                if (orientation == 0) {
                    ((ViewGroup.LayoutParams) c56302iJ2).width = 0;
                } else {
                    ((ViewGroup.LayoutParams) c56302iJ2).height = 0;
                }
                A05(c56302iJ2, trim2);
                return;
            }
            if (a instanceof C152756u3) {
                ((C152756u3) a).A0w = trim2;
                return;
            } else {
                if (!(a instanceof ACr)) {
                    return;
                }
                ((ACr) a).A02(5, trim2);
                return;
            }
        }
        try {
            if ("weight".equalsIgnoreCase(trim)) {
                float parseFloat = Float.parseFloat(trim2);
                if (a instanceof C56302iJ) {
                    C56302iJ c56302iJ3 = (C56302iJ) a;
                    if (orientation == 0) {
                        ((ViewGroup.LayoutParams) c56302iJ3).width = 0;
                        c56302iJ3.A04 = parseFloat;
                        return;
                    } else {
                        ((ViewGroup.LayoutParams) c56302iJ3).height = 0;
                        c56302iJ3.A0A = parseFloat;
                        return;
                    }
                }
                if (a instanceof C152756u3) {
                    C152756u3 c152756u32 = (C152756u3) a;
                    if (orientation == 0) {
                        c152756u32.A0g = 0;
                        c152756u32.A04 = parseFloat;
                        return;
                    } else {
                        c152756u32.A0e = 0;
                        c152756u32.A06 = parseFloat;
                        return;
                    }
                }
                if (!(a instanceof ACr)) {
                    return;
                }
                ACr aCr2 = (ACr) a;
                if (orientation == 0) {
                    aCr2.A01(23, 0);
                    i2 = 39;
                } else {
                    aCr2.A01(21, 0);
                    i2 = 40;
                }
                aCr2.A00(i2, parseFloat);
                return;
            }
            if (!"parent".equalsIgnoreCase(trim)) {
                return;
            }
            float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
            if (a instanceof C56302iJ) {
                C56302iJ c56302iJ4 = (C56302iJ) a;
                if (orientation == 0) {
                    ((ViewGroup.LayoutParams) c56302iJ4).width = 0;
                    c56302iJ4.A06 = max;
                    c56302iJ4.A0b = 2;
                    return;
                } else {
                    ((ViewGroup.LayoutParams) c56302iJ4).height = 0;
                    c56302iJ4.A05 = max;
                    c56302iJ4.A0a = 2;
                    return;
                }
            }
            if (a instanceof C152756u3) {
                C152756u3 c152756u33 = (C152756u3) a;
                if (orientation == 0) {
                    c152756u33.A0g = 0;
                    c152756u33.A07 = max;
                    c152756u33.A0t = 2;
                    return;
                } else {
                    c152756u33.A0e = 0;
                    c152756u33.A02 = max;
                    c152756u33.A0V = 2;
                    return;
                }
            }
            if (!(a instanceof ACr)) {
                return;
            }
            ACr aCr3 = (ACr) a;
            if (orientation == 0) {
                aCr3.A01(23, 0);
                i = 54;
            } else {
                aCr3.A01(21, 0);
                i = 55;
            }
            aCr3.A01(i, 2);
        } catch (NumberFormatException unused) {
        }
    }

    public final void A07(int viewId, float percent) {
        A02(this, viewId).A03.A07 = percent;
    }

    public final void A08(int viewId, float bias) {
        A02(this, viewId).A03.A03 = bias;
    }

    public final void A0A(int viewId, int height) {
        A02(this, viewId).A03.A0e = height;
    }

    public final void A0B(int viewId, int width) {
        A02(this, viewId).A03.A0g = width;
    }

    public final void A0F(int viewId, String ratio) {
        A02(this, viewId).A03.A0w = ratio;
    }

    public final void A0G(ConstraintLayout constraintLayout) {
        A0H(constraintLayout);
        constraintLayout.A0D = null;
        constraintLayout.requestLayout();
    }
}
