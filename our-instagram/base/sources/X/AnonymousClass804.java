package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.804, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass804 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass804[] A01;
    public static final AnonymousClass804 A02;
    public static final AnonymousClass804 A03;

    static {
        AnonymousClass804 anonymousClass804 = new AnonymousClass804(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = anonymousClass804;
        AnonymousClass804 anonymousClass8042 = new AnonymousClass804("FADE_IN", 1);
        A02 = anonymousClass8042;
        AnonymousClass804[] anonymousClass804Arr = {anonymousClass804, anonymousClass8042};
        A01 = anonymousClass804Arr;
        A00 = AbstractC12190kN.A00(anonymousClass804Arr);
    }

    public static AnonymousClass804 valueOf(String str) {
        return (AnonymousClass804) Enum.valueOf(AnonymousClass804.class, str);
    }

    public static AnonymousClass804[] values() {
        return (AnonymousClass804[]) A01.clone();
    }

    public AnonymousClass804(String str, int i) {
    }
}
