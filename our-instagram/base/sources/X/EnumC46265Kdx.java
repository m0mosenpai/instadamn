package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kdx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46265Kdx implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC46265Kdx[] A01;
    public static final EnumC46265Kdx A02;
    public final String A00 = "IG_CREATOR_AGENT_GENERATIVE_AI_BOT";

    static {
        EnumC46265Kdx enumC46265Kdx = new EnumC46265Kdx();
        A02 = enumC46265Kdx;
        A01 = new EnumC46265Kdx[]{enumC46265Kdx};
    }

    public static EnumC46265Kdx valueOf(String str) {
        return (EnumC46265Kdx) Enum.valueOf(EnumC46265Kdx.class, str);
    }

    public static EnumC46265Kdx[] values() {
        return (EnumC46265Kdx[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
