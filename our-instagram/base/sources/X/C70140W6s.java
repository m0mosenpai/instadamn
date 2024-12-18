package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.W6s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70140W6s {
    public static C71199Wpo parseFromJson(C16L c16l) {
        EnumC68143VDg enumC68143VDg;
        C14360o3.A0B(c16l, 0);
        try {
            C71199Wpo c71199Wpo = new C71199Wpo();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (DialogModule.KEY_TITLE.equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c71199Wpo.A01 = A0m;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c71199Wpo.A02 = A0m2;
                } else if (DialogModule.KEY_ITEMS.equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            U0v parseFromJson = U0u.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c71199Wpo.A04 = arrayList;
                } else if ("feed_type".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    EnumC68143VDg[] values = EnumC68143VDg.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC68143VDg = values[i];
                            if (C14360o3.A0K(enumC68143VDg.A00, A0m3)) {
                                break;
                            }
                            i++;
                        } else {
                            enumC68143VDg = EnumC68143VDg.A04;
                            break;
                        }
                    }
                    c71199Wpo.A00 = enumC68143VDg;
                }
                c16l.A0z();
            }
            c71199Wpo.A03 = AbstractC001800i.A0U(U12.A00(U13.A00, c71199Wpo.A04));
            return c71199Wpo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C71199Wpo c71199Wpo) {
        anonymousClass182.A0d();
        anonymousClass182.A0S(DialogModule.KEY_TITLE, c71199Wpo.A01);
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c71199Wpo.A02);
        C16V.A03(anonymousClass182, DialogModule.KEY_ITEMS);
        for (U0v u0v : c71199Wpo.A04) {
            if (u0v != null) {
                anonymousClass182.A0d();
                if (u0v.A07 != null) {
                    anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                    User user = u0v.A07;
                    Parcelable.Creator creator = User.CREATOR;
                    AbstractC38851rI.A08(anonymousClass182, user);
                }
                if (u0v.A06 != null) {
                    anonymousClass182.A0r("place");
                    AbstractC69968Vyj.A00(anonymousClass182, u0v.A06);
                }
                if (u0v.A03 != null) {
                    anonymousClass182.A0r("hashtag");
                    AbstractC109614wn.A00(anonymousClass182, u0v.A03);
                }
                if (u0v.A04 != null) {
                    anonymousClass182.A0r("keyword");
                    MZ7.A00(anonymousClass182, u0v.A04);
                }
                if (u0v.A05 != null) {
                    anonymousClass182.A0r("category");
                    OPT.A00(anonymousClass182, u0v.A05);
                }
                if (u0v.A01 != null) {
                    anonymousClass182.A0r("licensed_music");
                    AbstractC84383pX.A00(anonymousClass182, u0v.A01);
                }
                if (u0v.A02 != null) {
                    anonymousClass182.A0r("track_metadata");
                    AbstractC38068Gox.A00(anonymousClass182, u0v.A02);
                }
                if (u0v.A00 != null) {
                    anonymousClass182.A0r("original_audio");
                    C3XP.A00(anonymousClass182, u0v.A00);
                }
                AbstractC37930GmS.A00(anonymousClass182, u0v);
                anonymousClass182.A0a();
            }
        }
        anonymousClass182.A0Z();
        EnumC68143VDg enumC68143VDg = c71199Wpo.A00;
        if (enumC68143VDg != null) {
            anonymousClass182.A0S("feed_type", enumC68143VDg.A00);
        }
        anonymousClass182.A0a();
    }
}
