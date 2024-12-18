package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FXe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34846FXe {
    public static C6XA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C6XA c6xa = new C6XA();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (DialogModule.KEY_ITEMS.equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C6X9 parseFromJson = AbstractC34320FBo.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c6xa.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c6xa;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C6XA c6xa) {
        anonymousClass182.A0d();
        if (c6xa.A00 != null) {
            C16V.A03(anonymousClass182, DialogModule.KEY_ITEMS);
            for (C6X9 c6x9 : c6xa.A00) {
                if (c6x9 != null) {
                    anonymousClass182.A0d();
                    String str = c6x9.A05;
                    if (str != null) {
                        anonymousClass182.A0S("reel_id", str);
                    }
                    String str2 = c6x9.A02;
                    if (str2 != null) {
                        anonymousClass182.A0S("media_id", str2);
                    }
                    String str3 = c6x9.A06;
                    if (str3 != null) {
                        anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str3);
                    }
                    anonymousClass182.A0R("taken_at_seconds", c6x9.A01);
                    anonymousClass182.A0R("timestamp_seconds", c6x9.A00);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
