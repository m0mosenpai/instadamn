package X;

import android.view.View;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VGR {
    public static final /* synthetic */ VGR[] A00;
    public static final VGR A01;
    public static final VGR A02;
    public static final VGR A03;
    public static final VGR A04;
    public static final VGR A05;
    public static final VGR A06;
    public static final VGR A07;
    public static final VGR A08;
    public static final VGR A09;
    public static final VGR A0A;
    public static final VGR A0B;
    public static final VGR A0C;
    public static final VGR A0D;
    public static final VGR A0E;
    public static final VGR A0F;
    public static final VGR A0G;
    public static final VGR A0H;
    public static final VGR A0I;
    public static final VGR A0J;
    public static final VGR A0K;
    public static final VGR A0L;
    public static final VGR A0M;
    public static final VGR A0N;
    public static final VGR A0O;
    public static final VGR A0P;
    public static final VGR A0Q;
    public static final VGR A0R;
    public static final VGR A0S;
    public static final VGR A0T;
    public static final VGR A0U;
    public static final VGR A0V;
    public static final VGR A0W;
    public static final VGR A0X;
    public static final VGR A0Y;
    public static final VGR A0Z;
    public static final VGR A0a;
    public static final VGR A0b;
    public static final VGR A0c;
    public static final VGR A0d;

    static {
        VGR vgr = new VGR(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A0K = vgr;
        VGR vgr2 = new VGR("BUTTON", 1);
        A03 = vgr2;
        VGR vgr3 = new VGR("DROPDOWNLIST", 2);
        A07 = vgr3;
        VGR vgr4 = new VGR("TOGGLEBUTTON", 3);
        A0a = vgr4;
        VGR vgr5 = new VGR("LINK", 4);
        A0F = vgr5;
        VGR vgr6 = new VGR("SEARCH", 5);
        A0R = vgr6;
        VGR vgr7 = new VGR("IMAGE", 6);
        A0C = vgr7;
        VGR vgr8 = new VGR("IMAGEBUTTON", 7);
        A0D = vgr8;
        VGR vgr9 = new VGR("KEYBOARDKEY", 8);
        A0E = vgr9;
        VGR vgr10 = new VGR("TEXT", 9);
        A0Y = vgr10;
        VGR vgr11 = new VGR("ADJUSTABLE", 10);
        A01 = vgr11;
        VGR vgr12 = new VGR("SUMMARY", 11);
        A0U = vgr12;
        VGR vgr13 = new VGR("HEADER", 12);
        A09 = vgr13;
        VGR vgr14 = new VGR("ALERT", 13);
        A02 = vgr14;
        VGR vgr15 = new VGR("CHECKBOX", 14);
        A04 = vgr15;
        VGR vgr16 = new VGR("COMBOBOX", 15);
        A05 = vgr16;
        VGR vgr17 = new VGR("MENU", 16);
        A0H = vgr17;
        VGR vgr18 = new VGR("MENUBAR", 17);
        A0I = vgr18;
        VGR vgr19 = new VGR("MENUITEM", 18);
        A0J = vgr19;
        VGR vgr20 = new VGR("PROGRESSBAR", 19);
        A0M = vgr20;
        VGR vgr21 = new VGR("RADIO", 20);
        A0N = vgr21;
        VGR vgr22 = new VGR("RADIOGROUP", 21);
        A0O = vgr22;
        VGR vgr23 = new VGR("SCROLLBAR", 22);
        A0P = vgr23;
        VGR vgr24 = new VGR("SPINBUTTON", 23);
        A0T = vgr24;
        VGR vgr25 = new VGR("SWITCH", 24);
        A0V = vgr25;
        VGR vgr26 = new VGR("TAB", 25);
        A0W = vgr26;
        VGR vgr27 = new VGR("TABLIST", 26);
        A0X = vgr27;
        VGR vgr28 = new VGR("TIMER", 27);
        A0Z = vgr28;
        VGR vgr29 = new VGR("LIST", 28);
        A0G = vgr29;
        VGR vgr30 = new VGR("GRID", 29);
        A08 = vgr30;
        VGR vgr31 = new VGR("PAGER", 30);
        A0L = vgr31;
        VGR vgr32 = new VGR("SCROLLVIEW", 31);
        A0Q = vgr32;
        VGR vgr33 = new VGR("HORIZONTALSCROLLVIEW", 32);
        A0A = vgr33;
        VGR vgr34 = new VGR("VIEWGROUP", 33);
        A0c = vgr34;
        VGR vgr35 = new VGR("WEBVIEW", 34);
        A0d = vgr35;
        VGR vgr36 = new VGR("DRAWERLAYOUT", 35);
        A06 = vgr36;
        VGR vgr37 = new VGR("SLIDINGDRAWER", 36);
        A0S = vgr37;
        VGR vgr38 = new VGR("ICONMENU", 37);
        A0B = vgr38;
        VGR vgr39 = new VGR("TOOLBAR", 38);
        A0b = vgr39;
        VGR[] vgrArr = new VGR[39];
        System.arraycopy(new VGR[]{vgr28, vgr29, vgr30, vgr31, vgr32, vgr33, vgr34, vgr35, vgr36, vgr37, vgr38, vgr39}, AbstractC31175DnJ.A1b(new VGR[]{vgr, vgr2, vgr3, vgr4, vgr5, vgr6, vgr7, vgr8, vgr9, vgr10, vgr11, vgr12, vgr13, vgr14, vgr15, vgr16, vgr17, vgr18, vgr19, vgr20, vgr21, vgr22, vgr23, vgr24, vgr25, vgr26, vgr27}, vgrArr) ? 1 : 0, vgrArr, 27, 12);
        A00 = vgrArr;
    }

    public static VGR A01(String str) {
        if (str == null) {
            return A0K;
        }
        for (VGR vgr : values()) {
            if (vgr.name().equalsIgnoreCase(str)) {
                return vgr;
            }
        }
        throw AbstractC167007dF.A0c("Invalid accessibility role value: ", str);
    }

    public static VGR valueOf(String str) {
        return (VGR) Enum.valueOf(VGR.class, str);
    }

    public static VGR[] values() {
        return (VGR[]) A00.clone();
    }

    public VGR(String str, int i) {
    }

    public static VGR A00(View view) {
        VDK vdk = (VDK) view.getTag(R.id.role);
        if (vdk != null) {
            switch (vdk.ordinal()) {
                case 0:
                    return A02;
                case 5:
                    return A03;
                case 7:
                    return A04;
                case 9:
                    return A05;
                case Process.SIGSTOP /* 19 */:
                    return A08;
                case 21:
                    return A09;
                case 22:
                    return A0C;
                case 23:
                    return A0F;
                case 24:
                    return A0G;
                case 30:
                    return A0H;
                case 31:
                    return A0I;
                case 32:
                    return A0J;
                case 35:
                    return A0K;
                case 39:
                    return A0M;
                case 40:
                    return A0N;
                case Seq.NULL_REFNUM /* 41 */:
                    return A0O;
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                    return A0P;
                case 47:
                    return A0R;
                case 49:
                    return A01;
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                    return A0T;
                case 52:
                    return A0U;
                case 53:
                    return A0V;
                case 54:
                    return A0W;
                case 56:
                    return A0X;
                case 59:
                    return A0Z;
                case 60:
                    return A0b;
                default:
                    return null;
            }
        }
        return (VGR) view.getTag(R.id.accessibility_role);
    }

    public static String A02(VGR vgr) {
        switch (vgr.ordinal()) {
            case 0:
            case 4:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 21:
            case 22:
            case 25:
            case 26:
            case 27:
            case 38:
                return "android.view.View";
            case 1:
                return "android.widget.Button";
            case 2:
                return "android.widget.Spinner";
            case 3:
                return "android.widget.ToggleButton";
            case 5:
                return "android.widget.EditText";
            case 6:
                return "android.widget.ImageView";
            case 7:
                return "android.widget.ImageButton";
            case 8:
                return "android.inputmethodservice.Keyboard$Key";
            case 9:
                return AbstractC111324zv.A00(3901);
            case 10:
                return "android.widget.SeekBar";
            case 14:
                return AbstractC111324zv.A00(3888);
            case 20:
                return "android.widget.RadioButton";
            case 23:
                return "android.widget.SpinButton";
            case 24:
                return "android.widget.Switch";
            case 28:
                return "android.widget.AbsListView";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "android.widget.GridView";
            case 30:
                return "androidx.viewpager.widget.ViewPager";
            case 31:
                return "android.widget.ScrollView";
            case 32:
                return "android.widget.HorizontalScrollView";
            case 33:
                return "android.view.ViewGroup";
            case 34:
                return "android.webkit.WebView";
            case 35:
                return "androidx.drawerlayout.widget.DrawerLayout";
            case 36:
                return "android.widget.SlidingDrawer";
            case 37:
                return "com.android.internal.view.menu.IconMenuView";
            default:
                throw AbstractC37303Gc4.A0M(vgr, "Invalid accessibility role value: ", new StringBuilder());
        }
    }
}
