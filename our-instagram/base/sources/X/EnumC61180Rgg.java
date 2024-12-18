package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.api.base.CacheBehaviorLogger;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rgg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61180Rgg {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC61180Rgg[] A03;
    public static final EnumC61180Rgg A04;
    public static final EnumC61180Rgg A05;
    public static final EnumC61180Rgg A06;
    public static final EnumC61180Rgg A07;
    public final int A00;
    public final String[] A01;

    static {
        EnumC61180Rgg enumC61180Rgg = new EnumC61180Rgg(0, 222831159, "ComponentRender", PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        A05 = enumC61180Rgg;
        EnumC61180Rgg enumC61180Rgg2 = new EnumC61180Rgg(1, 222827873, "ComponentMount", PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        A04 = enumC61180Rgg2;
        EnumC61180Rgg enumC61180Rgg3 = new EnumC61180Rgg(2, 222828438, "ComponentTreeResolve", "root", CacheBehaviorLogger.SOURCE, "attribution");
        A07 = enumC61180Rgg3;
        EnumC61180Rgg enumC61180Rgg4 = new EnumC61180Rgg(3, 222835900, "ComponentTreeLayout", "root", "sizeConstraints", CacheBehaviorLogger.SOURCE);
        A06 = enumC61180Rgg4;
        EnumC61180Rgg[] enumC61180RggArr = {enumC61180Rgg, enumC61180Rgg2, enumC61180Rgg3, enumC61180Rgg4};
        A03 = enumC61180RggArr;
        A02 = AbstractC12190kN.A00(enumC61180RggArr);
    }

    public static EnumC61180Rgg valueOf(String str) {
        return (EnumC61180Rgg) Enum.valueOf(EnumC61180Rgg.class, str);
    }

    public static EnumC61180Rgg[] values() {
        return (EnumC61180Rgg[]) A03.clone();
    }

    public EnumC61180Rgg(int i, int i2, String str, String... strArr) {
        this.A00 = i2;
        this.A01 = strArr;
    }
}
