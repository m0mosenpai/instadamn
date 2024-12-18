package X;

/* renamed from: X.OHi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54753OHi {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C102884kP A01;

    public C54753OHi(C6FG c6fg, C102884kP c102884kP) {
        this.A00 = c6fg;
        this.A01 = c102884kP;
    }

    public final void A00(Integer num, String str) {
        String str2;
        C6FG c6fg = this.A00;
        C102884kP c102884kP = this.A01;
        switch (num.intValue()) {
            case 0:
                str2 = "EDITOR_SCREEN_PREVIEW_EFFECT_LOAD_START";
                break;
            case 1:
                str2 = "EDITOR_SCREEN_PREVIEW_EFFECT_LOAD_END";
                break;
            case 2:
                str2 = "EDITOR_SCREEN_PREVIEW_EFFECT_LOAD_FAILED";
                break;
            case 3:
                str2 = "EDITOR_SCREEN_PREVIEW_AVATAR_LOAD_START";
                break;
            case 4:
                str2 = "EDITOR_SCREEN_PREVIEW_AVATAR_LOAD_END";
                break;
            case 5:
                str2 = "EDITOR_SCREEN_PREVIEW_AVATAR_LOAD_FAILED";
                break;
            case 6:
                str2 = "EDITOR_SCREEN_PREVIEW_NOT_ON_SUPPORTED_NETWORK";
                break;
            case 7:
                str2 = "EDITOR_SCREEN_PREVIEW_RENDERING_TIMEOUT";
                break;
            case 8:
                str2 = "EDITOR_SCREEN_PREVIEW_INITIAL_CHECK_FAILED";
                break;
            case 9:
                str2 = "EDITOR_SCREEN_PREVIEW_NOT_ON_SUPPORTED_NETWORK_INITIAL";
                break;
            default:
                str2 = "EDITOR_SCREEN_PREVIEW_LOW_MEMORY";
                break;
        }
        InterfaceC103384lE A0B = c102884kP.A0B(44);
        if (A0B != null) {
            AbstractC166987dD.A1Z(new C50115MAo(c102884kP, A0B, c6fg, str2, str, null, 0), AbstractC50523MSb.A0e());
        }
    }
}
