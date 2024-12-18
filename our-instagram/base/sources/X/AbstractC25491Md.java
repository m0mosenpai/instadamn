package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Md, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC25491Md extends AbstractC25501Me implements C1MU {
    public final C1MX A00;
    public final C23111Aq A01;

    @Override // X.AbstractC25501Me
    public final HashMap A02() {
        String absolutePath;
        String str;
        C1B0 c1b0;
        C1UV c1uv;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.A00.A00().entrySet()) {
            String str2 = (String) entry.getKey();
            JSONObject jSONObject = (JSONObject) entry.getValue();
            if (!TextUtils.isEmpty(str2)) {
                boolean optBoolean = jSONObject.optBoolean("userid_in_path", true);
                if (jSONObject.optBoolean("keep_data_on_account_removal", false)) {
                    c1b0 = C1B0.A07;
                } else if (jSONObject.optBoolean("keep_data_between_sessions", false)) {
                    c1b0 = C1B0.A06;
                } else if (jSONObject.optBoolean("is_underlying_account_scoped", false)) {
                    if (optBoolean) {
                        c1b0 = C1B0.A08;
                    } else {
                        c1b0 = C1B0.A09;
                    }
                } else if (optBoolean) {
                    c1b0 = C1B0.A05;
                } else if (jSONObject.optBoolean("is_user_scoped", true)) {
                    c1b0 = C1B0.A0A;
                } else {
                    c1b0 = C1B0.A0B;
                }
                if (!c1b0.A02) {
                    c1uv = null;
                } else {
                    String optString = jSONObject.optString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, "__invalid__");
                    String optString2 = jSONObject.optString("feature_name");
                    if (TextUtils.isEmpty(optString2)) {
                        optString2 = "n/a";
                    }
                    c1uv = new C1UV(new C23131As(optString, jSONObject.optString("owner_user_id", optString)), c1b0, optString2, jSONObject.optLong("last_access_time", -1L));
                }
                if (c1uv != null) {
                    hashMap.put(str2, c1uv);
                }
            }
        }
        int[] A05 = AbstractC23201Az.A05();
        for (int i = 0; i < 146; i++) {
            int i2 = A05[i];
            String A04 = AbstractC23201Az.A04(i2);
            C1B0 A02 = AbstractC23201Az.A02(i2);
            if (A02 != null && A04 != null && A02.A02) {
                for (Map.Entry entry2 : new C23891Ez(this.A01).A02("__scope__", i2).entrySet()) {
                    File file = (File) entry2.getKey();
                    try {
                        absolutePath = file.getCanonicalPath();
                    } catch (IOException unused) {
                        absolutePath = file.getAbsolutePath();
                    }
                    if (!hashMap.containsKey(absolutePath)) {
                        if (entry2.getValue() == null) {
                            str = "__unknown__";
                        } else {
                            str = (String) entry2.getValue();
                        }
                        hashMap.put(absolutePath, new C1UV(AbstractC25501Me.A00(new C23131As(str, str), A02), A02, A04, ((File) entry2.getKey()).lastModified()));
                    }
                }
            }
        }
        return hashMap;
    }

    @Override // X.AbstractC25501Me
    public final void A04(String str) {
        C23111Aq c23111Aq = this.A01;
        c23111Aq.A08.A00(new File(str));
        this.A00.A01(str);
    }

    @Override // X.C1MU
    public final /* bridge */ /* synthetic */ void DXo(final C1F9 c1f9, C1B1 c1b1, final File file) {
        final C1B0 c1b0 = (C1B0) c1b1;
        if (c1b0.A02) {
            this.A01.A04(C05F.A00).execute(new Runnable() { // from class: X.1Mg
                @Override // java.lang.Runnable
                public final void run() {
                    String absolutePath;
                    AbstractC25491Md abstractC25491Md = this;
                    C1B0 c1b02 = c1b0;
                    C1F9 c1f92 = c1f9;
                    C23131As c23131As = c1f92.A01;
                    if (c23131As == null) {
                        c23131As = abstractC25491Md.A01.A01();
                    }
                    C23131As A00 = AbstractC25501Me.A00(c23131As, c1b02);
                    File file2 = file;
                    C1UV c1uv = new C1UV(A00, c1b02, c1f92.A02, System.currentTimeMillis());
                    try {
                        try {
                            absolutePath = file2.getCanonicalPath();
                        } catch (IOException unused) {
                            absolutePath = file2.getAbsolutePath();
                        }
                        abstractC25491Md.A00.A02(absolutePath, c1uv.EqM());
                    } catch (JSONException unused2) {
                    }
                }
            });
        }
    }

    public AbstractC25491Md(C23111Aq c23111Aq) {
        C1MX c1mw;
        this.A01 = c23111Aq;
        SharedPreferences sharedPreferences = c23111Aq.A06;
        if (sharedPreferences == null) {
            c1mw = new C1MX("user_scope");
        } else {
            c1mw = new C1MW(sharedPreferences, "user_scope");
        }
        this.A00 = c1mw;
    }
}
