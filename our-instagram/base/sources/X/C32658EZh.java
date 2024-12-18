package X;

import android.os.Bundle;
import com.instagram.api.schemas.CachedExternalLoginUserImpl;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.EZh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32658EZh extends AbstractRunnableC14200nk {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ SignedOutFragmentActivity A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32658EZh(Bundle bundle, SignedOutFragmentActivity signedOutFragmentActivity) {
        super(758);
        this.A01 = signedOutFragmentActivity;
        this.A00 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC33388EpL enumC33388EpL;
        SignedOutFragmentActivity signedOutFragmentActivity = this.A01;
        C1FE A00 = C34937FaN.A00(signedOutFragmentActivity.A04);
        C14360o3.A0A(A00);
        Map all = A00.getAll();
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator A15 = AbstractC166997dE.A15(all);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            Object key = A1K.getKey();
            Object value = A1K.getValue();
            if (!C14360o3.A0K(key, "AccountCachingHelper.FACEBOOK_USER_ID")) {
                try {
                    AbstractC25225BEi.A1S(value);
                    CachedExternalLoginUserImpl parseFromJson = AbstractC33670EuK.parseFromJson(C16V.A00((String) value));
                    String str = parseFromJson.A05;
                    String str2 = parseFromJson.A02;
                    ImageUrl imageUrl = parseFromJson.A00;
                    String str3 = parseFromJson.A03;
                    String str4 = parseFromJson.A04;
                    EnumC33388EpL[] values = EnumC33388EpL.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC33388EpL = values[i];
                            if (C14360o3.A0K(enumC33388EpL.A00, str4)) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            enumC33388EpL = EnumC33388EpL.A05;
                            break;
                        }
                    }
                    EgQ egQ = new EgQ(imageUrl, enumC33388EpL, str, str2, str3);
                    A1G.put(egQ.A00, egQ);
                } catch (IOException e) {
                    C0w9.A07("ExternalAccountCachingHelper_deserialize_account_error", e);
                }
            }
        }
        signedOutFragmentActivity.runOnUiThread(new GOQ(this, A1G.isEmpty()));
    }
}
