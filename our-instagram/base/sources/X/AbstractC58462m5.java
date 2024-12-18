package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.2m5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC58462m5 {
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static String A00(Integer num) {
        int i;
        switch (num.intValue()) {
            case 1:
                return "android.widget.Button";
            case 2:
                i = 3889;
                return AbstractC111324zv.A00(i);
            case 3:
                i = 3898;
                return AbstractC111324zv.A00(i);
            case 4:
                i = 3890;
                return AbstractC111324zv.A00(i);
            case 5:
                i = 3891;
                return AbstractC111324zv.A00(i);
            case 6:
            case 7:
                i = 346;
                return AbstractC111324zv.A00(i);
            case 8:
                i = 3887;
                return AbstractC111324zv.A00(i);
            case 9:
                i = 3910;
                return AbstractC111324zv.A00(i);
            case 10:
                i = 3894;
                return AbstractC111324zv.A00(i);
            case 11:
                i = 3896;
                return AbstractC111324zv.A00(i);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = 3899;
                return AbstractC111324zv.A00(i);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                i = 3900;
                return AbstractC111324zv.A00(i);
            case 14:
                i = 3902;
                return AbstractC111324zv.A00(i);
            case Process.SIGTERM /* 15 */:
                i = 3885;
                return AbstractC111324zv.A00(i);
            case 16:
                i = 3886;
                return AbstractC111324zv.A00(i);
            case 17:
                return "android.widget.CheckedTextView";
            case 18:
                i = 3893;
                return AbstractC111324zv.A00(i);
            case Process.SIGSTOP /* 19 */:
                return "android.app.ActionBar$Tab";
            case 20:
                i = 3909;
                return AbstractC111324zv.A00(i);
            case 21:
                i = 3897;
                return AbstractC111324zv.A00(i);
            case 22:
                i = 4129;
                return AbstractC111324zv.A00(i);
            case 23:
                return "android.widget.Toast$TN";
            case 24:
                return "android.app.AlertDialog";
            case 25:
                return "android.app.DatePickerDialog";
            case 26:
                return "android.app.TimePickerDialog";
            case 27:
                return "android.widget.DatePicker";
            case 28:
                return "android.widget.TimePicker";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "android.widget.NumberPicker";
            case 30:
                i = 3895;
                return AbstractC111324zv.A00(i);
            case 31:
                i = 3892;
                return AbstractC111324zv.A00(i);
            case 32:
                i = 3879;
                return AbstractC111324zv.A00(i);
            default:
                i = 3884;
                return AbstractC111324zv.A00(i);
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "BUTTON";
            case 2:
                return "CHECK_BOX";
            case 3:
                return "DROP_DOWN_LIST";
            case 4:
                return "EDIT_TEXT";
            case 5:
                return "GRID";
            case 6:
                return "IMAGE";
            case 7:
                return "IMAGE_BUTTON";
            case 8:
                return "LIST";
            case 9:
                return "PAGER";
            case 10:
                return "RADIO_BUTTON";
            case 11:
                return "SEEK_CONTROL";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "SWITCH";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "TAB_BAR";
            case 14:
                return "TOGGLE_BUTTON";
            case Process.SIGTERM /* 15 */:
                return "VIEW_GROUP";
            case 16:
                return "WEB_VIEW";
            case 17:
                return "CHECKED_TEXT_VIEW";
            case 18:
                return "PROGRESS_BAR";
            case Process.SIGSTOP /* 19 */:
                return "ACTION_BAR_TAB";
            case 20:
                return "DRAWER_LAYOUT";
            case 21:
                return "SLIDING_DRAWER";
            case 22:
                return "ICON_MENU";
            case 23:
                return "TOAST";
            case 24:
                return "ALERT_DIALOG";
            case 25:
                return "DATE_PICKER_DIALOG";
            case 26:
                return "TIME_PICKER_DIALOG";
            case 27:
                return "DATE_PICKER";
            case 28:
                return "TIME_PICKER";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "NUMBER_PICKER";
            case 30:
                return "SCROLL_VIEW";
            case 31:
                return "HORIZONTAL_SCROLL_VIEW";
            case 32:
                return "KEYBOARD_KEY";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
