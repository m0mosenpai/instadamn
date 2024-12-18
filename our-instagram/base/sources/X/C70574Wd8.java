package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.Wd8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70574Wd8 implements InterfaceC71973XDg {
    public final C19280xC A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC71973XDg
    public final String getStringForKey(String str) {
        String obj;
        int i;
        C14360o3.A0B(str, 0);
        if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
            String str2 = this.A00.A04;
            C14360o3.A0A(str2);
            return str2;
        }
        if (str.equals("module")) {
            obj = this.A00.A03;
        } else {
            C14360o3.A0B("@JOIN", 1);
            if (str.startsWith("@JOIN")) {
                int length = str.length();
                int i2 = 0;
                while (true) {
                    i = -1;
                    if (i2 < length) {
                        if (str.charAt(i2) == '(') {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                int i3 = length - 1;
                if (i3 >= 0) {
                    while (true) {
                        int i4 = i3 - 1;
                        if (str.charAt(i3) == ')') {
                            i = i3;
                            break;
                        }
                        if (i4 < 0) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                if (i2 <= 0 || i <= 0) {
                    return "";
                }
                List A0Q = AbstractC001900j.A0Q(AbstractC25227BEk.A0w(str, i2 + 1, i), new char[]{','}, 0);
                if (A0Q.size() != 3) {
                    return "";
                }
                String str3 = (String) A0Q.get(0);
                String str4 = (String) A0Q.get(1);
                String str5 = (String) A0Q.get(2);
                C14360o3.A0B(str3, 1);
                C14360o3.A0B(str4, 2);
                C14360o3.A0B(str5, 3);
                return AnonymousClass001.A0g(getStringForKey(str3), str5, getStringForKey(str4));
            }
            Object A02 = this.A00.A06.A00.A02(str);
            if (A02 == null) {
                return "";
            }
            obj = A02.toString();
        }
        if (obj == null) {
            return "";
        }
        return obj;
    }

    @Override // X.InterfaceC71973XDg
    public final String BxO() {
        return this.A02;
    }

    @Override // X.InterfaceC71973XDg
    public final long C8S() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC71973XDg
    public final String getDisplayName() {
        return this.A01;
    }

    public C70574Wd8(C19280xC c19280xC, String str) {
        this.A00 = c19280xC;
        this.A02 = str;
        String str2 = c19280xC.A04;
        C14360o3.A07(str2);
        this.A01 = str2;
    }
}
