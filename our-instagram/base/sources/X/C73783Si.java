package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.3Si, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73783Si {
    public Integer A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C73783Si(Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        C14360o3.A0B(str, 7);
        C14360o3.A0B(str2, 10);
        C14360o3.A0B(num, 17);
        this.A09 = z;
        this.A0B = z2;
        this.A0C = z3;
        this.A05 = z4;
        this.A0D = z5;
        this.A0A = z6;
        this.A02 = str;
        this.A07 = z7;
        this.A0F = z8;
        this.A01 = str2;
        this.A04 = z9;
        this.A0E = z10;
        this.A08 = z11;
        this.A06 = z12;
        this.A03 = z13;
        this.A00 = num;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("JsonConfiguration(encodeDefaults=");
        sb.append(this.A09);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.A0B);
        sb.append(", isLenient=");
        sb.append(this.A0C);
        sb.append(", allowStructuredMapKeys=");
        sb.append(this.A05);
        sb.append(", prettyPrint=");
        sb.append(this.A0D);
        sb.append(", explicitNulls=");
        sb.append(this.A0A);
        sb.append(", prettyPrintIndent='");
        sb.append(this.A02);
        sb.append("', coerceInputValues=");
        sb.append(this.A07);
        sb.append(", useArrayPolymorphism=");
        sb.append(this.A0F);
        sb.append(", classDiscriminator='");
        sb.append(this.A01);
        sb.append("', allowSpecialFloatingPointValues=");
        sb.append(this.A04);
        sb.append(", useAlternativeNames=");
        sb.append(this.A0E);
        sb.append(", namingStrategy=");
        sb.append((Object) null);
        sb.append(", decodeEnumsCaseInsensitive=");
        sb.append(this.A08);
        sb.append(", allowTrailingComma=");
        sb.append(this.A06);
        sb.append(", allowComments=");
        sb.append(this.A03);
        sb.append(", classDiscriminatorMode=");
        switch (this.A00.intValue()) {
            case 1:
                str = "ALL_JSON_OBJECTS";
                break;
            case 2:
                str = "POLYMORPHIC";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public C73783Si() {
        this(C05F.A0C, "    ", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, false, false, false, false, false, true, false, false, false, true, false, false, false);
    }
}
