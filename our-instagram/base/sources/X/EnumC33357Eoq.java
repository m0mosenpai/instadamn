package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eoq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33357Eoq {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33357Eoq[] A01;
    public static final EnumC33357Eoq A02;
    public static final EnumC33357Eoq A03;
    public static final EnumC33357Eoq A04;
    public static final EnumC33357Eoq A05;
    public static final EnumC33357Eoq A06;

    static {
        EnumC33357Eoq enumC33357Eoq = new EnumC33357Eoq("SOCIAL_CHANNEL", 0);
        A04 = enumC33357Eoq;
        EnumC33357Eoq enumC33357Eoq2 = new EnumC33357Eoq("SUBSCRIBER_SOCIAL_CHANNEL", 1);
        A06 = enumC33357Eoq2;
        EnumC33357Eoq enumC33357Eoq3 = new EnumC33357Eoq("BROADCAST_CHANNEL", 2);
        A02 = enumC33357Eoq3;
        EnumC33357Eoq enumC33357Eoq4 = new EnumC33357Eoq("SUBSCRIBER_BROADCAST_CHANNEL", 3);
        A05 = enumC33357Eoq4;
        EnumC33357Eoq enumC33357Eoq5 = new EnumC33357Eoq("GROUP_PROFILE_CHANNEL_CREATOR", 4);
        A03 = enumC33357Eoq5;
        EnumC33357Eoq[] enumC33357EoqArr = {enumC33357Eoq, enumC33357Eoq2, enumC33357Eoq3, enumC33357Eoq4, enumC33357Eoq5, new EnumC33357Eoq("GROUP_PROFILE_CHANNEL_MEMBER", 5)};
        A01 = enumC33357EoqArr;
        A00 = AbstractC12190kN.A00(enumC33357EoqArr);
    }

    public static EnumC33357Eoq valueOf(String str) {
        return (EnumC33357Eoq) Enum.valueOf(EnumC33357Eoq.class, str);
    }

    public static EnumC33357Eoq[] values() {
        return (EnumC33357Eoq[]) A01.clone();
    }

    public EnumC33357Eoq(String str, int i) {
    }
}
