package X;

import com.facebook.react.views.textinput.ReactTextInputManager;

/* renamed from: X.AAg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22962AAg {
    public final String A00(String str, int i) {
        String str2;
        switch (i) {
            case 12288:
                str2 = "EGL_SUCCESS";
                break;
            case 12289:
                str2 = "EGL_NOT_INITIALIZED";
                break;
            case ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED /* 12290 */:
                str2 = "EGL_BAD_ACCESS";
                break;
            case 12291:
                str2 = "EGL_BAD_ALLOC";
                break;
            case 12292:
                str2 = "EGL_BAD_ATTRIBUTE";
                break;
            case 12293:
                str2 = "EGL_BAD_CONFIG";
                break;
            case 12294:
                str2 = "EGL_BAD_CONTEXT";
                break;
            case 12295:
                str2 = "EGL_BAD_CURRENT_SURFACE";
                break;
            case 12296:
                str2 = "EGL_BAD_DISPLAY";
                break;
            case 12297:
                str2 = "EGL_BAD_MATCH";
                break;
            case 12298:
                str2 = "EGL_BAD_NATIVE_PIXMAP";
                break;
            case 12299:
                str2 = "EGL_BAD_NATIVE_WINDOW";
                break;
            case 12300:
                str2 = "EGL_BAD_PARAMETER";
                break;
            case 12301:
                str2 = "EGL_BAD_SURFACE";
                break;
            case 12302:
                str2 = "EGL_CONTEXT_LOST";
                break;
            default:
                str2 = AnonymousClass001.A0R("0x", Integer.toHexString(i));
                break;
        }
        return AnonymousClass001.A0g(str, " failed: ", str2);
    }
}
