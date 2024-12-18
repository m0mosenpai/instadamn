package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.95t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2050495t {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.instagram.accountlinking.model.AccountFamily] */
    public static AccountFamily parseFromJson(C16L c16l) {
        EnumC2050795x enumC2050795x;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                String str = null;
                ArrayList arrayList2 = null;
                if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A02 = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    String A1Q = c16l.A1Q();
                    EnumC2050795x[] values = EnumC2050795x.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC2050795x = values[i];
                            if (A1Q.equalsIgnoreCase(enumC2050795x.name())) {
                                break;
                            }
                            i++;
                        } else {
                            enumC2050795x = EnumC2050795x.UNKNOWN;
                            break;
                        }
                    }
                    obj.A00 = enumC2050795x;
                } else if ("account".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    obj.A01 = AbstractC38851rI.A00(c16l, false);
                } else if ("main_accounts".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator2 = User.CREATOR;
                            User A00 = AbstractC38851rI.A00(c16l, false);
                            if (A00 != null) {
                                arrayList2.add(A00);
                            }
                        }
                    }
                    obj.A04 = arrayList2;
                } else if ("child_accounts".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator3 = User.CREATOR;
                            User A002 = AbstractC38851rI.A00(c16l, false);
                            if (A002 != null) {
                                arrayList.add(A002);
                            }
                        }
                    }
                    obj.A03 = arrayList;
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
