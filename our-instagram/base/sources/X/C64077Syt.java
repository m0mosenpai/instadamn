package X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import java.util.AbstractMap;
import java.util.Date;

/* renamed from: X.Syt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64077Syt implements InterfaceC65487Tl7, CallerContextable {
    public static final CallerContext A03 = CallerContext.A00(C64077Syt.class);
    public static final String __redex_internal_original_name = "FxCalLoginMethodHandler";
    public C63209SfE A00;
    public C63209SfE A01;
    public AbstractC12990ll A02;

    @Override // X.InterfaceC65487Tl7
    public final boolean Cv2(Intent intent, int i, int i2) {
        LoginClient$Result A01;
        String str;
        String str2;
        String A0h;
        LoginClient$Request loginClient$Request = this.A01.A01;
        String str3 = "Operation canceled";
        if (intent != null) {
            AbstractMap abstractMap = (AbstractMap) intent.getSerializableExtra(MSV.A00(84));
            if (abstractMap != null) {
                str = AbstractC31171DnF.A0h("error", abstractMap);
            } else {
                str = null;
            }
            if (i2 == 0) {
                if (str != null) {
                    str3 = str;
                }
            } else {
                if (i2 == -1 && abstractMap != null) {
                    String A0h2 = AbstractC31171DnF.A0h("error", abstractMap);
                    if (A0h2 == null) {
                        try {
                            String A0v = AbstractC58319PtB.A0v("tokenString", abstractMap);
                            if (TextUtils.isEmpty(A0v)) {
                                A01 = LoginClient$Result.A02(loginClient$Request, "Token is null", "", null);
                            } else {
                                if (abstractMap.get("userID") == null) {
                                    A0h = "";
                                } else {
                                    A0h = AbstractC31171DnF.A0h("userID", abstractMap);
                                }
                                Date date = AccessToken.A0A;
                                A01 = LoginClient$Result.A00(new AccessToken(C05F.A1F, A0v, C1L4.A02, A0h, EnumC61160RgL.A04.A00, null, null, new Date()), loginClient$Request);
                            }
                        } catch (TXS e) {
                            if (e.getMessage() != null) {
                                str2 = e.getMessage();
                            } else {
                                str2 = "Token invalid";
                            }
                            A01 = LoginClient$Result.A02(loginClient$Request, "", str2, null);
                        }
                    } else {
                        if (AbstractC62356S8d.A00.contains(A0h2)) {
                            this.A00.A02();
                            return true;
                        }
                        if (AbstractC62356S8d.A01.contains(A0h2)) {
                            A01 = LoginClient$Result.A01(loginClient$Request, A0h2);
                        } else {
                            A01 = LoginClient$Result.A02(loginClient$Request, A0h2, "", null);
                        }
                    }
                } else {
                    if (str == null) {
                        str = MSV.A00(815);
                    }
                    A01 = LoginClient$Result.A02(loginClient$Request, str, "", null);
                }
                this.A00.A04(A01);
                return true;
            }
        }
        A01 = LoginClient$Result.A01(loginClient$Request, str3);
        this.A00.A04(A01);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.F7k] */
    @Override // X.InterfaceC65487Tl7
    public final void F8i(LoginClient$Request loginClient$Request) {
        try {
            Fragment fragment = this.A01.A06;
            if (loginClient$Request.A01 == null) {
                loginClient$Request.A01 = "ig_default";
            }
            C28301Yr A00 = AbstractC34213F7l.A00();
            if (A00.A00 == null) {
                A00.A00 = new Object();
            }
            new Ef5().A01(fragment, this.A02, loginClient$Request.A01, null, 64206);
        } catch (Exception unused) {
            this.A00.A02();
        }
    }
}
