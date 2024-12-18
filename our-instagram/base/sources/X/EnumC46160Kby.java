package X;

import kotlin.enums.EnumEntries;
import org.webrtc.PeerConnectionFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kby, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46160Kby {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46160Kby[] A01;
    public static final EnumC46160Kby A02;
    public static final EnumC46160Kby A03;
    public static final EnumC46160Kby A04;
    public static final EnumC46160Kby A05;

    static {
        EnumC46160Kby enumC46160Kby = new EnumC46160Kby("PromptWithoutNote", 0);
        A05 = enumC46160Kby;
        EnumC46160Kby enumC46160Kby2 = new EnumC46160Kby("NoteWithoutPrompt", 1);
        A04 = enumC46160Kby2;
        EnumC46160Kby enumC46160Kby3 = new EnumC46160Kby(PeerConnectionFactory.TRIAL_ENABLED, 2);
        A03 = enumC46160Kby3;
        EnumC46160Kby enumC46160Kby4 = new EnumC46160Kby("Disabled", 3);
        A02 = enumC46160Kby4;
        EnumC46160Kby[] enumC46160KbyArr = {enumC46160Kby, enumC46160Kby2, enumC46160Kby3, enumC46160Kby4};
        A01 = enumC46160KbyArr;
        A00 = AbstractC12190kN.A00(enumC46160KbyArr);
    }

    public static EnumC46160Kby valueOf(String str) {
        return (EnumC46160Kby) Enum.valueOf(EnumC46160Kby.class, str);
    }

    public static EnumC46160Kby[] values() {
        return (EnumC46160Kby[]) A01.clone();
    }

    public EnumC46160Kby(String str, int i) {
    }
}
