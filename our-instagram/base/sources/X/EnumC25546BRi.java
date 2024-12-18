package X;

import com.facebook.R;
import com.instagram.api.schemas.CameraTool;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.BRi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC25546BRi {
    public static final /* synthetic */ EnumEntries A05;
    public static final /* synthetic */ EnumC25546BRi[] A06;
    public static final EnumC25546BRi A07;
    public static final EnumC25546BRi A08;
    public static final EnumC25546BRi A09;
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;

    public static EnumC25546BRi valueOf(String str) {
        return (EnumC25546BRi) Enum.valueOf(EnumC25546BRi.class, str);
    }

    public static EnumC25546BRi[] values() {
        return (EnumC25546BRi[]) A06.clone();
    }

    static {
        CameraTool cameraTool = CameraTool.A3G;
        C14360o3.A0B(cameraTool, 0);
        A07 = new EnumC25546BRi("CLIPS_LAYOUT", "VIDEO_LAYOUT", cameraTool.A00, 0, R.drawable.instagram_layout_pano_outline_24, 2131953247, 2131976431);
        CameraTool cameraTool2 = CameraTool.A0n;
        C14360o3.A0B(cameraTool2, 0);
        A08 = new EnumC25546BRi("DUAL", "DUAL", cameraTool2.A00, 1, R.drawable.instagram_dual_camera_pano_outline_24, 2131953242, 2131976429);
        CameraTool cameraTool3 = CameraTool.A2c;
        C14360o3.A0B(cameraTool3, 0);
        EnumC25546BRi enumC25546BRi = new EnumC25546BRi("SOUND_SYNC", "SOUND_SYNC", cameraTool3.A00, 2, R.drawable.instagram_dual_camera_pano_outline_24, 2131953245, 2131976430);
        A09 = enumC25546BRi;
        EnumC25546BRi[] enumC25546BRiArr = {A07, A08, enumC25546BRi};
        A06 = enumC25546BRiArr;
        A05 = AbstractC12190kN.A00(enumC25546BRiArr);
    }

    public EnumC25546BRi(String str, String str2, String str3, int i, int i2, int i3, int i4) {
        this.A04 = str2;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = str3;
    }
}
