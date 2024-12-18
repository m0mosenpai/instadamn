package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53192Nfo {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53192Nfo[] A02;
    public final String A00 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;

    static {
        EnumC53192Nfo[] enumC53192NfoArr = {new EnumC53192Nfo()};
        A02 = enumC53192NfoArr;
        A01 = AbstractC12190kN.A00(enumC53192NfoArr);
    }

    public static EnumC53192Nfo valueOf(String str) {
        return (EnumC53192Nfo) Enum.valueOf(EnumC53192Nfo.class, str);
    }

    public static EnumC53192Nfo[] values() {
        return (EnumC53192Nfo[]) A02.clone();
    }
}
